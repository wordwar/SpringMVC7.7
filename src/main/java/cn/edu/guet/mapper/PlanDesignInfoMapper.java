package cn.edu.guet.mapper;

import cn.edu.guet.bean.Page;
import cn.edu.guet.bean.PlanDesignDTO;
import cn.edu.guet.bean.PlanDesignInfo;

import java.util.List;

/**
* @author liwei
* @description 针对表【t_plan_design_info(规划设计评估主表)】的数据库操作Mapper
* @createDate 2023-06-15 19:54:13
* @Entity cn.edu.guet.bean.PlanDesignInfo
*/
public interface PlanDesignInfoMapper {

    List<PlanDesignInfo> searchBill(PlanDesignDTO planDesignDTO);
}




