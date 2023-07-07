package cn.edu.guet.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanDesignCadDrawingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public PlanDesignCadDrawingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdIsNull() {
            addCriterion("plan_design_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdIsNotNull() {
            addCriterion("plan_design_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdEqualTo(Long value) {
            addCriterion("plan_design_id =", value, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdNotEqualTo(Long value) {
            addCriterion("plan_design_id <>", value, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdGreaterThan(Long value) {
            addCriterion("plan_design_id >", value, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_design_id >=", value, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdLessThan(Long value) {
            addCriterion("plan_design_id <", value, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdLessThanOrEqualTo(Long value) {
            addCriterion("plan_design_id <=", value, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdIn(List<Long> values) {
            addCriterion("plan_design_id in", values, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdNotIn(List<Long> values) {
            addCriterion("plan_design_id not in", values, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdBetween(Long value1, Long value2) {
            addCriterion("plan_design_id between", value1, value2, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignIdNotBetween(Long value1, Long value2) {
            addCriterion("plan_design_id not between", value1, value2, "planDesignId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdIsNull() {
            addCriterion("plan_design_result_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdIsNotNull() {
            addCriterion("plan_design_result_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdEqualTo(Long value) {
            addCriterion("plan_design_result_id =", value, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdNotEqualTo(Long value) {
            addCriterion("plan_design_result_id <>", value, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdGreaterThan(Long value) {
            addCriterion("plan_design_result_id >", value, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_design_result_id >=", value, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdLessThan(Long value) {
            addCriterion("plan_design_result_id <", value, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdLessThanOrEqualTo(Long value) {
            addCriterion("plan_design_result_id <=", value, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdIn(List<Long> values) {
            addCriterion("plan_design_result_id in", values, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdNotIn(List<Long> values) {
            addCriterion("plan_design_result_id not in", values, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdBetween(Long value1, Long value2) {
            addCriterion("plan_design_result_id between", value1, value2, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andPlanDesignResultIdNotBetween(Long value1, Long value2) {
            addCriterion("plan_design_result_id not between", value1, value2, "planDesignResultId");
            return (Criteria) this;
        }

        public Criteria andCableSegNameIsNull() {
            addCriterion("cable_seg_name is null");
            return (Criteria) this;
        }

        public Criteria andCableSegNameIsNotNull() {
            addCriterion("cable_seg_name is not null");
            return (Criteria) this;
        }

        public Criteria andCableSegNameEqualTo(String value) {
            addCriterion("cable_seg_name =", value, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameNotEqualTo(String value) {
            addCriterion("cable_seg_name <>", value, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameGreaterThan(String value) {
            addCriterion("cable_seg_name >", value, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameGreaterThanOrEqualTo(String value) {
            addCriterion("cable_seg_name >=", value, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameLessThan(String value) {
            addCriterion("cable_seg_name <", value, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameLessThanOrEqualTo(String value) {
            addCriterion("cable_seg_name <=", value, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameLike(String value) {
            addCriterion("cable_seg_name like", value, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameNotLike(String value) {
            addCriterion("cable_seg_name not like", value, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameIn(List<String> values) {
            addCriterion("cable_seg_name in", values, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameNotIn(List<String> values) {
            addCriterion("cable_seg_name not in", values, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameBetween(String value1, String value2) {
            addCriterion("cable_seg_name between", value1, value2, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andCableSegNameNotBetween(String value1, String value2) {
            addCriterion("cable_seg_name not between", value1, value2, "cableSegName");
            return (Criteria) this;
        }

        public Criteria andStationAIsNull() {
            addCriterion("station_a is null");
            return (Criteria) this;
        }

        public Criteria andStationAIsNotNull() {
            addCriterion("station_a is not null");
            return (Criteria) this;
        }

        public Criteria andStationAEqualTo(String value) {
            addCriterion("station_a =", value, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationANotEqualTo(String value) {
            addCriterion("station_a <>", value, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationAGreaterThan(String value) {
            addCriterion("station_a >", value, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationAGreaterThanOrEqualTo(String value) {
            addCriterion("station_a >=", value, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationALessThan(String value) {
            addCriterion("station_a <", value, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationALessThanOrEqualTo(String value) {
            addCriterion("station_a <=", value, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationALike(String value) {
            addCriterion("station_a like", value, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationANotLike(String value) {
            addCriterion("station_a not like", value, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationAIn(List<String> values) {
            addCriterion("station_a in", values, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationANotIn(List<String> values) {
            addCriterion("station_a not in", values, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationABetween(String value1, String value2) {
            addCriterion("station_a between", value1, value2, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationANotBetween(String value1, String value2) {
            addCriterion("station_a not between", value1, value2, "stationA");
            return (Criteria) this;
        }

        public Criteria andStationTypeAIsNull() {
            addCriterion("station_type_a is null");
            return (Criteria) this;
        }

        public Criteria andStationTypeAIsNotNull() {
            addCriterion("station_type_a is not null");
            return (Criteria) this;
        }

        public Criteria andStationTypeAEqualTo(String value) {
            addCriterion("station_type_a =", value, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeANotEqualTo(String value) {
            addCriterion("station_type_a <>", value, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeAGreaterThan(String value) {
            addCriterion("station_type_a >", value, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeAGreaterThanOrEqualTo(String value) {
            addCriterion("station_type_a >=", value, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeALessThan(String value) {
            addCriterion("station_type_a <", value, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeALessThanOrEqualTo(String value) {
            addCriterion("station_type_a <=", value, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeALike(String value) {
            addCriterion("station_type_a like", value, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeANotLike(String value) {
            addCriterion("station_type_a not like", value, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeAIn(List<String> values) {
            addCriterion("station_type_a in", values, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeANotIn(List<String> values) {
            addCriterion("station_type_a not in", values, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeABetween(String value1, String value2) {
            addCriterion("station_type_a between", value1, value2, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationTypeANotBetween(String value1, String value2) {
            addCriterion("station_type_a not between", value1, value2, "stationTypeA");
            return (Criteria) this;
        }

        public Criteria andStationZIsNull() {
            addCriterion("station_z is null");
            return (Criteria) this;
        }

        public Criteria andStationZIsNotNull() {
            addCriterion("station_z is not null");
            return (Criteria) this;
        }

        public Criteria andStationZEqualTo(String value) {
            addCriterion("station_z =", value, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZNotEqualTo(String value) {
            addCriterion("station_z <>", value, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZGreaterThan(String value) {
            addCriterion("station_z >", value, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZGreaterThanOrEqualTo(String value) {
            addCriterion("station_z >=", value, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZLessThan(String value) {
            addCriterion("station_z <", value, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZLessThanOrEqualTo(String value) {
            addCriterion("station_z <=", value, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZLike(String value) {
            addCriterion("station_z like", value, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZNotLike(String value) {
            addCriterion("station_z not like", value, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZIn(List<String> values) {
            addCriterion("station_z in", values, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZNotIn(List<String> values) {
            addCriterion("station_z not in", values, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZBetween(String value1, String value2) {
            addCriterion("station_z between", value1, value2, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationZNotBetween(String value1, String value2) {
            addCriterion("station_z not between", value1, value2, "stationZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZIsNull() {
            addCriterion("station_type_z is null");
            return (Criteria) this;
        }

        public Criteria andStationTypeZIsNotNull() {
            addCriterion("station_type_z is not null");
            return (Criteria) this;
        }

        public Criteria andStationTypeZEqualTo(String value) {
            addCriterion("station_type_z =", value, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZNotEqualTo(String value) {
            addCriterion("station_type_z <>", value, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZGreaterThan(String value) {
            addCriterion("station_type_z >", value, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZGreaterThanOrEqualTo(String value) {
            addCriterion("station_type_z >=", value, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZLessThan(String value) {
            addCriterion("station_type_z <", value, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZLessThanOrEqualTo(String value) {
            addCriterion("station_type_z <=", value, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZLike(String value) {
            addCriterion("station_type_z like", value, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZNotLike(String value) {
            addCriterion("station_type_z not like", value, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZIn(List<String> values) {
            addCriterion("station_type_z in", values, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZNotIn(List<String> values) {
            addCriterion("station_type_z not in", values, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZBetween(String value1, String value2) {
            addCriterion("station_type_z between", value1, value2, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andStationTypeZNotBetween(String value1, String value2) {
            addCriterion("station_type_z not between", value1, value2, "stationTypeZ");
            return (Criteria) this;
        }

        public Criteria andCableNameIsNull() {
            addCriterion("cable_name is null");
            return (Criteria) this;
        }

        public Criteria andCableNameIsNotNull() {
            addCriterion("cable_name is not null");
            return (Criteria) this;
        }

        public Criteria andCableNameEqualTo(String value) {
            addCriterion("cable_name =", value, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameNotEqualTo(String value) {
            addCriterion("cable_name <>", value, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameGreaterThan(String value) {
            addCriterion("cable_name >", value, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameGreaterThanOrEqualTo(String value) {
            addCriterion("cable_name >=", value, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameLessThan(String value) {
            addCriterion("cable_name <", value, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameLessThanOrEqualTo(String value) {
            addCriterion("cable_name <=", value, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameLike(String value) {
            addCriterion("cable_name like", value, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameNotLike(String value) {
            addCriterion("cable_name not like", value, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameIn(List<String> values) {
            addCriterion("cable_name in", values, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameNotIn(List<String> values) {
            addCriterion("cable_name not in", values, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameBetween(String value1, String value2) {
            addCriterion("cable_name between", value1, value2, "cableName");
            return (Criteria) this;
        }

        public Criteria andCableNameNotBetween(String value1, String value2) {
            addCriterion("cable_name not between", value1, value2, "cableName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 20 21:02:33 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_plan_design_cad_drawing
     *
     * @mbg.generated Tue Jun 20 21:02:33 CST 2023
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}