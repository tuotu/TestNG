/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SdNotifyInfoDOExample.java
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

public class SdNotifyInfoDOExample {
    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    public SdNotifyInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table sd_notify_info
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
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table sd_notify_info
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
     * corresponds to the database table sd_notify_info
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

        public Criteria andDubboGroupIsNull() {
            addCriterion("dubbo_group is null");
            return (Criteria) this;
        }

        public Criteria andDubboGroupIsNotNull() {
            addCriterion("dubbo_group is not null");
            return (Criteria) this;
        }

        public Criteria andDubboGroupEqualTo(String value) {
            addCriterion("dubbo_group =", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupNotEqualTo(String value) {
            addCriterion("dubbo_group <>", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupGreaterThan(String value) {
            addCriterion("dubbo_group >", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupGreaterThanOrEqualTo(String value) {
            addCriterion("dubbo_group >=", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupLessThan(String value) {
            addCriterion("dubbo_group <", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupLessThanOrEqualTo(String value) {
            addCriterion("dubbo_group <=", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupLike(String value) {
            addCriterion("dubbo_group like", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupNotLike(String value) {
            addCriterion("dubbo_group not like", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupIn(List<String> values) {
            addCriterion("dubbo_group in", values, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupNotIn(List<String> values) {
            addCriterion("dubbo_group not in", values, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupBetween(String value1, String value2) {
            addCriterion("dubbo_group between", value1, value2, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupNotBetween(String value1, String value2) {
            addCriterion("dubbo_group not between", value1, value2, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboVersionIsNull() {
            addCriterion("dubbo_version is null");
            return (Criteria) this;
        }

        public Criteria andDubboVersionIsNotNull() {
            addCriterion("dubbo_version is not null");
            return (Criteria) this;
        }

        public Criteria andDubboVersionEqualTo(String value) {
            addCriterion("dubbo_version =", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionNotEqualTo(String value) {
            addCriterion("dubbo_version <>", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionGreaterThan(String value) {
            addCriterion("dubbo_version >", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionGreaterThanOrEqualTo(String value) {
            addCriterion("dubbo_version >=", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionLessThan(String value) {
            addCriterion("dubbo_version <", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionLessThanOrEqualTo(String value) {
            addCriterion("dubbo_version <=", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionLike(String value) {
            addCriterion("dubbo_version like", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionNotLike(String value) {
            addCriterion("dubbo_version not like", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionIn(List<String> values) {
            addCriterion("dubbo_version in", values, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionNotIn(List<String> values) {
            addCriterion("dubbo_version not in", values, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionBetween(String value1, String value2) {
            addCriterion("dubbo_version between", value1, value2, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionNotBetween(String value1, String value2) {
            addCriterion("dubbo_version not between", value1, value2, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(String value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(String value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(String value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(String value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(String value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(String value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLike(String value) {
            addCriterion("gid like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotLike(String value) {
            addCriterion("gid not like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<String> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<String> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(String value1, String value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(String value1, String value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapIsNull() {
            addCriterion("notify_custom_map is null");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapIsNotNull() {
            addCriterion("notify_custom_map is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapEqualTo(String value) {
            addCriterion("notify_custom_map =", value, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapNotEqualTo(String value) {
            addCriterion("notify_custom_map <>", value, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapGreaterThan(String value) {
            addCriterion("notify_custom_map >", value, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapGreaterThanOrEqualTo(String value) {
            addCriterion("notify_custom_map >=", value, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapLessThan(String value) {
            addCriterion("notify_custom_map <", value, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapLessThanOrEqualTo(String value) {
            addCriterion("notify_custom_map <=", value, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapLike(String value) {
            addCriterion("notify_custom_map like", value, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapNotLike(String value) {
            addCriterion("notify_custom_map not like", value, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapIn(List<String> values) {
            addCriterion("notify_custom_map in", values, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapNotIn(List<String> values) {
            addCriterion("notify_custom_map not in", values, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapBetween(String value1, String value2) {
            addCriterion("notify_custom_map between", value1, value2, "notifyCustomMap");
            return (Criteria) this;
        }

        public Criteria andNotifyCustomMapNotBetween(String value1, String value2) {
            addCriterion("notify_custom_map not between", value1, value2, "notifyCustomMap");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table sd_notify_info
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
     * corresponds to the database table sd_notify_info
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