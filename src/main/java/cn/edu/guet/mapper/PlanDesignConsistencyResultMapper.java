package cn.edu.guet.mapper;

import cn.edu.guet.bean.PlanDesignConsistencyResult;
import cn.edu.guet.bean.PlanDesignConsistencyResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PlanDesignConsistencyResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    long countByExample(PlanDesignConsistencyResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    int deleteByExample(PlanDesignConsistencyResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    int insert(PlanDesignConsistencyResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    int insertSelective(PlanDesignConsistencyResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    List<PlanDesignConsistencyResult> selectByExampleWithRowbounds(PlanDesignConsistencyResultExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    List<PlanDesignConsistencyResult> selectByExample(PlanDesignConsistencyResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    PlanDesignConsistencyResult selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    int updateByExampleSelective(@Param("record") PlanDesignConsistencyResult record, @Param("example") PlanDesignConsistencyResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    int updateByExample(@Param("record") PlanDesignConsistencyResult record, @Param("example") PlanDesignConsistencyResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    int updateByPrimaryKeySelective(PlanDesignConsistencyResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_consistency_result
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    int updateByPrimaryKey(PlanDesignConsistencyResult record);
}