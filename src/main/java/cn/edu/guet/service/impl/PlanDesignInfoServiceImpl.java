package cn.edu.guet.service.impl;

import cn.edu.guet.bean.*;
import cn.edu.guet.common.ResponseData;
import cn.edu.guet.mapper.PlanDesignBusinessRouteMapper;
import cn.edu.guet.mapper.PlanDesignHistoryRecordMapper;
import cn.edu.guet.mapper.PlanDesignInfoMapper;
import cn.edu.guet.mapper.PlanDesignRouteCableMapper;
import cn.edu.guet.service.PlanDesignInfoService;
import cn.edu.guet.util.DBUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liwei
 * @description 针对表【t_plan_design_info(规划设计评估主表)】的数据库操作Service实现
 * @createDate 2023-06-15 19:54:13
 */
public class PlanDesignInfoServiceImpl implements PlanDesignInfoService {

    private PlanDesignInfoMapper planDesignInfoMapper;
    private PlanDesignBusinessRouteMapper businessRouteMapper;

    @Override
    public ResponseData searchBill(PlanDesignDTO planDesignDTO) {
        SqlSession sqlSession = DBUtil.getSqlSession();
        planDesignInfoMapper = sqlSession.getMapper(PlanDesignInfoMapper.class);
        List<PlanDesignInfo> planDesignInfoList = planDesignInfoMapper.searchBill(planDesignDTO);
        return ResponseData.ok(planDesignInfoList);
    }

    @Override
    public ResponseData selectBusinessRouteByPlanDesignId(Long id) {
        SqlSession sqlSession = DBUtil.getSqlSession();

        businessRouteMapper = sqlSession.getMapper(PlanDesignBusinessRouteMapper.class);

        PlanDesignBusinessRouteExample businessRouteExample = new PlanDesignBusinessRouteExample();
        businessRouteExample.createCriteria().andPlanDesignIdEqualTo(id);

        List<PlanDesignBusinessRoute> businessRouteList = businessRouteMapper.selectByExample(businessRouteExample);

        return ResponseData.ok(businessRouteList);
    }

    @Override
    public ResponseData selectRouteCableList(Long id) {
        SqlSession sqlSession = DBUtil.getSqlSession();
        PlanDesignRouteCableMapper routeCableMapper = sqlSession.getMapper(PlanDesignRouteCableMapper.class);

        PlanDesignRouteCableExample routeCableExample = new PlanDesignRouteCableExample();
        routeCableExample.createCriteria().andPlanDesignIdEqualTo(id);
        //0：第1页，10：每页10条
        RowBounds rowBounds = new RowBounds(0, 10);

        List<PlanDesignRouteCable> routeCableList = routeCableMapper.selectByExampleWithRowbounds(routeCableExample, rowBounds);
        return ResponseData.ok(routeCableList);
    }

    @Override
    public ResponseData parseCAD() {
        SqlSession sqlSession = DBUtil.getSqlSession();

        PlanDesignRouteCableMapper routeCableMapper = sqlSession.getMapper(PlanDesignRouteCableMapper.class);
        PlanDesignBusinessRouteMapper businessRouteMapper = sqlSession.getMapper(PlanDesignBusinessRouteMapper.class);

        PlanDesignHistoryRecordMapper historyRecordMapper = sqlSession.getMapper(PlanDesignHistoryRecordMapper.class);
        PlanDesignHistoryRecordExample recordExample = new PlanDesignHistoryRecordExample();
        recordExample.createCriteria()
                .andAnalyseStatusEqualTo((byte) 1);
        List<PlanDesignHistoryRecord> historyRecordList = historyRecordMapper.selectByExample(recordExample);
        for (PlanDesignHistoryRecord historyRecord : historyRecordList) {
            Map<String, Object> bodyMap = new HashMap<>(1);
            bodyMap.put("analyseNo", historyRecord.getAnalyseNo());
            String queryJson = new Gson().toJson(bodyMap);
            // 调解析接口
            HttpResponse response = null;
            ResponseData responseData = null;
            String remoteUrl = "http://localhost:9999/analysCADQueryResult";
            try {
                response = HttpRequest.post(remoteUrl.toString())
                        .body(queryJson)
                        .timeout(5 * 60 * 1000)
                        .execute();
                CadResult cadResult = JSON.parseObject(response.body(), CadResult.class);
                CadData cadData = cadResult.getData();
                List<PlanDesignRouteCable> routeCableList = cadData.getRouteCable();
                routeCableList.stream().forEach(planDesignRouteCable -> {
                    planDesignRouteCable.setPlanDesignId(historyRecord.getPlanDesignId());
                    planDesignRouteCable.setPlanDesignResultId(historyRecord.getId());
                    planDesignRouteCable.setCreateTime(new Timestamp(System.currentTimeMillis()));
                    // 调用Mapper的save
                    routeCableMapper.insert(planDesignRouteCable);
                });
                List<PlanDesignBusinessRoute> businessRouteList = cadData.getBusinessRoute();
                businessRouteList.stream().forEach(planDesignBusinessRoute -> {
                    planDesignBusinessRoute.setPlanDesignId(historyRecord.getPlanDesignId());
                    planDesignBusinessRoute.setPlanDesignResultId(historyRecord.getId());
                    planDesignBusinessRoute.setCreateTime(new Timestamp(System.currentTimeMillis()));
                    // 调用Mapper的save
                    businessRouteMapper.insert(planDesignBusinessRoute);
                });
                sqlSession.commit();
            } catch (Exception e) {
                e.printStackTrace();
                sqlSession.rollback();
                return ResponseData.fail("调用路由稽核结果查询接口发生异常！");
            }
        }
        return null;
    }
}
