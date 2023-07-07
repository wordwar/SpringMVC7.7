package cn.edu.guet.service;

import cn.edu.guet.bean.PlanDesignDTO;
import cn.edu.guet.bean.PlanDesignInfo;
import cn.edu.guet.common.ResponseData;

/**
* @author liwei
* @description 针对表【t_plan_design_info(规划设计评估主表)】的数据库操作Service
* @createDate 2023-06-15 19:54:13
*/
public interface PlanDesignInfoService{

    ResponseData searchBill(PlanDesignDTO planDesignDTO);

    ResponseData selectBusinessRouteByPlanDesignId(Long id);

    ResponseData selectRouteCableList(Long id);

    ResponseData parseCAD();
}
