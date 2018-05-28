/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename DubboPaymentResultNotifyInfoDOExample.java
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
import java.util.List;

public class DubboPaymentResultNotifyInfoDOExample {
    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    public DubboPaymentResultNotifyInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
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
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
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
     * corresponds to the database table dubbo_payment_result_notify_info
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

        public Criteria andDubboPaymentResultNotifyInfoIdIsNull() {
            addCriterion("dubbo_payment_result_notify_info_id is null");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdIsNotNull() {
            addCriterion("dubbo_payment_result_notify_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdEqualTo(Long value) {
            addCriterion("dubbo_payment_result_notify_info_id =", value, "dubboPaymentResultNotifyInfoId");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdNotEqualTo(Long value) {
            addCriterion("dubbo_payment_result_notify_info_id <>", value, "dubboPaymentResultNotifyInfoId");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdGreaterThan(Long value) {
            addCriterion("dubbo_payment_result_notify_info_id >", value, "dubboPaymentResultNotifyInfoId");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dubbo_payment_result_notify_info_id >=", value, "dubboPaymentResultNotifyInfoId");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdLessThan(Long value) {
            addCriterion("dubbo_payment_result_notify_info_id <", value, "dubboPaymentResultNotifyInfoId");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("dubbo_payment_result_notify_info_id <=", value, "dubboPaymentResultNotifyInfoId");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdIn(List<Long> values) {
            addCriterion("dubbo_payment_result_notify_info_id in", values, "dubboPaymentResultNotifyInfoId");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdNotIn(List<Long> values) {
            addCriterion("dubbo_payment_result_notify_info_id not in", values, "dubboPaymentResultNotifyInfoId");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdBetween(Long value1, Long value2) {
            addCriterion("dubbo_payment_result_notify_info_id between", value1, value2, "dubboPaymentResultNotifyInfoId");
            return (Criteria) this;
        }

        public Criteria andDubboPaymentResultNotifyInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("dubbo_payment_result_notify_info_id not between", value1, value2, "dubboPaymentResultNotifyInfoId");
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
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
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
     * corresponds to the database table dubbo_payment_result_notify_info
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