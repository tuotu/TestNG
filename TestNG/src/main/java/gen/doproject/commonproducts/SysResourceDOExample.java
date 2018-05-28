/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SysResourceDOExample.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.doproject.commonproducts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysResourceDOExample {
    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public SysResourceDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNull() {
            addCriterion("raw_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNotNull() {
            addCriterion("raw_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeEqualTo(Date value) {
            addCriterion("raw_add_time =", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotEqualTo(Date value) {
            addCriterion("raw_add_time <>", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThan(Date value) {
            addCriterion("raw_add_time >", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_add_time >=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThan(Date value) {
            addCriterion("raw_add_time <", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_add_time <=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIn(List<Date> values) {
            addCriterion("raw_add_time in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotIn(List<Date> values) {
            addCriterion("raw_add_time not in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeBetween(Date value1, Date value2) {
            addCriterion("raw_add_time between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_add_time not between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNull() {
            addCriterion("raw_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNotNull() {
            addCriterion("raw_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeEqualTo(Date value) {
            addCriterion("raw_update_time =", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotEqualTo(Date value) {
            addCriterion("raw_update_time <>", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThan(Date value) {
            addCriterion("raw_update_time >", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_update_time >=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThan(Date value) {
            addCriterion("raw_update_time <", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_update_time <=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIn(List<Date> values) {
            addCriterion("raw_update_time in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotIn(List<Date> values) {
            addCriterion("raw_update_time not in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("raw_update_time between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_update_time not between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("ref_id is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(String value) {
            addCriterion("ref_id =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(String value) {
            addCriterion("ref_id <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(String value) {
            addCriterion("ref_id >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("ref_id >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(String value) {
            addCriterion("ref_id <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(String value) {
            addCriterion("ref_id <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLike(String value) {
            addCriterion("ref_id like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotLike(String value) {
            addCriterion("ref_id not like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<String> values) {
            addCriterion("ref_id in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<String> values) {
            addCriterion("ref_id not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(String value1, String value2) {
            addCriterion("ref_id between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(String value1, String value2) {
            addCriterion("ref_id not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andResDesIsNull() {
            addCriterion("res_des is null");
            return (Criteria) this;
        }

        public Criteria andResDesIsNotNull() {
            addCriterion("res_des is not null");
            return (Criteria) this;
        }

        public Criteria andResDesEqualTo(String value) {
            addCriterion("res_des =", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesNotEqualTo(String value) {
            addCriterion("res_des <>", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesGreaterThan(String value) {
            addCriterion("res_des >", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesGreaterThanOrEqualTo(String value) {
            addCriterion("res_des >=", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesLessThan(String value) {
            addCriterion("res_des <", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesLessThanOrEqualTo(String value) {
            addCriterion("res_des <=", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesLike(String value) {
            addCriterion("res_des like", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesNotLike(String value) {
            addCriterion("res_des not like", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesIn(List<String> values) {
            addCriterion("res_des in", values, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesNotIn(List<String> values) {
            addCriterion("res_des not in", values, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesBetween(String value1, String value2) {
            addCriterion("res_des between", value1, value2, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesNotBetween(String value1, String value2) {
            addCriterion("res_des not between", value1, value2, "resDes");
            return (Criteria) this;
        }

        public Criteria andResLocationIsNull() {
            addCriterion("res_location is null");
            return (Criteria) this;
        }

        public Criteria andResLocationIsNotNull() {
            addCriterion("res_location is not null");
            return (Criteria) this;
        }

        public Criteria andResLocationEqualTo(String value) {
            addCriterion("res_location =", value, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationNotEqualTo(String value) {
            addCriterion("res_location <>", value, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationGreaterThan(String value) {
            addCriterion("res_location >", value, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationGreaterThanOrEqualTo(String value) {
            addCriterion("res_location >=", value, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationLessThan(String value) {
            addCriterion("res_location <", value, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationLessThanOrEqualTo(String value) {
            addCriterion("res_location <=", value, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationLike(String value) {
            addCriterion("res_location like", value, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationNotLike(String value) {
            addCriterion("res_location not like", value, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationIn(List<String> values) {
            addCriterion("res_location in", values, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationNotIn(List<String> values) {
            addCriterion("res_location not in", values, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationBetween(String value1, String value2) {
            addCriterion("res_location between", value1, value2, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResLocationNotBetween(String value1, String value2) {
            addCriterion("res_location not between", value1, value2, "resLocation");
            return (Criteria) this;
        }

        public Criteria andResNameIsNull() {
            addCriterion("res_name is null");
            return (Criteria) this;
        }

        public Criteria andResNameIsNotNull() {
            addCriterion("res_name is not null");
            return (Criteria) this;
        }

        public Criteria andResNameEqualTo(String value) {
            addCriterion("res_name =", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotEqualTo(String value) {
            addCriterion("res_name <>", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThan(String value) {
            addCriterion("res_name >", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThanOrEqualTo(String value) {
            addCriterion("res_name >=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThan(String value) {
            addCriterion("res_name <", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThanOrEqualTo(String value) {
            addCriterion("res_name <=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLike(String value) {
            addCriterion("res_name like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotLike(String value) {
            addCriterion("res_name not like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameIn(List<String> values) {
            addCriterion("res_name in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotIn(List<String> values) {
            addCriterion("res_name not in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameBetween(String value1, String value2) {
            addCriterion("res_name between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotBetween(String value1, String value2) {
            addCriterion("res_name not between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(String value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(String value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(String value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(String value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(String value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(String value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLike(String value) {
            addCriterion("res_type like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotLike(String value) {
            addCriterion("res_type not like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<String> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<String> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(String value1, String value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(String value1, String value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNull() {
            addCriterion("res_url is null");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNotNull() {
            addCriterion("res_url is not null");
            return (Criteria) this;
        }

        public Criteria andResUrlEqualTo(String value) {
            addCriterion("res_url =", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotEqualTo(String value) {
            addCriterion("res_url <>", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThan(String value) {
            addCriterion("res_url >", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThanOrEqualTo(String value) {
            addCriterion("res_url >=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThan(String value) {
            addCriterion("res_url <", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThanOrEqualTo(String value) {
            addCriterion("res_url <=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLike(String value) {
            addCriterion("res_url like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotLike(String value) {
            addCriterion("res_url not like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlIn(List<String> values) {
            addCriterion("res_url in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotIn(List<String> values) {
            addCriterion("res_url not in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlBetween(String value1, String value2) {
            addCriterion("res_url between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotBetween(String value1, String value2) {
            addCriterion("res_url not between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andRindexIsNull() {
            addCriterion("rindex is null");
            return (Criteria) this;
        }

        public Criteria andRindexIsNotNull() {
            addCriterion("rindex is not null");
            return (Criteria) this;
        }

        public Criteria andRindexEqualTo(Integer value) {
            addCriterion("rindex =", value, "rindex");
            return (Criteria) this;
        }

        public Criteria andRindexNotEqualTo(Integer value) {
            addCriterion("rindex <>", value, "rindex");
            return (Criteria) this;
        }

        public Criteria andRindexGreaterThan(Integer value) {
            addCriterion("rindex >", value, "rindex");
            return (Criteria) this;
        }

        public Criteria andRindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("rindex >=", value, "rindex");
            return (Criteria) this;
        }

        public Criteria andRindexLessThan(Integer value) {
            addCriterion("rindex <", value, "rindex");
            return (Criteria) this;
        }

        public Criteria andRindexLessThanOrEqualTo(Integer value) {
            addCriterion("rindex <=", value, "rindex");
            return (Criteria) this;
        }

        public Criteria andRindexIn(List<Integer> values) {
            addCriterion("rindex in", values, "rindex");
            return (Criteria) this;
        }

        public Criteria andRindexNotIn(List<Integer> values) {
            addCriterion("rindex not in", values, "rindex");
            return (Criteria) this;
        }

        public Criteria andRindexBetween(Integer value1, Integer value2) {
            addCriterion("rindex between", value1, value2, "rindex");
            return (Criteria) this;
        }

        public Criteria andRindexNotBetween(Integer value1, Integer value2) {
            addCriterion("rindex not between", value1, value2, "rindex");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
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