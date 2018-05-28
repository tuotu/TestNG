/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawConfigDOExample.java
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

public class WithdrawConfigDOExample {
    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    public WithdrawConfigDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table withdraw_config
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
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table withdraw_config
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
     * corresponds to the database table withdraw_config
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

        public Criteria andDelayHourContextIsNull() {
            addCriterion("delay_hour_context is null");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextIsNotNull() {
            addCriterion("delay_hour_context is not null");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextEqualTo(String value) {
            addCriterion("delay_hour_context =", value, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextNotEqualTo(String value) {
            addCriterion("delay_hour_context <>", value, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextGreaterThan(String value) {
            addCriterion("delay_hour_context >", value, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextGreaterThanOrEqualTo(String value) {
            addCriterion("delay_hour_context >=", value, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextLessThan(String value) {
            addCriterion("delay_hour_context <", value, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextLessThanOrEqualTo(String value) {
            addCriterion("delay_hour_context <=", value, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextLike(String value) {
            addCriterion("delay_hour_context like", value, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextNotLike(String value) {
            addCriterion("delay_hour_context not like", value, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextIn(List<String> values) {
            addCriterion("delay_hour_context in", values, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextNotIn(List<String> values) {
            addCriterion("delay_hour_context not in", values, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextBetween(String value1, String value2) {
            addCriterion("delay_hour_context between", value1, value2, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andDelayHourContextNotBetween(String value1, String value2) {
            addCriterion("delay_hour_context not between", value1, value2, "delayHourContext");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoIsNull() {
            addCriterion("merchant_card_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoIsNotNull() {
            addCriterion("merchant_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoEqualTo(String value) {
            addCriterion("merchant_card_no =", value, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoNotEqualTo(String value) {
            addCriterion("merchant_card_no <>", value, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoGreaterThan(String value) {
            addCriterion("merchant_card_no >", value, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_card_no >=", value, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoLessThan(String value) {
            addCriterion("merchant_card_no <", value, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_card_no <=", value, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoLike(String value) {
            addCriterion("merchant_card_no like", value, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoNotLike(String value) {
            addCriterion("merchant_card_no not like", value, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoIn(List<String> values) {
            addCriterion("merchant_card_no in", values, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoNotIn(List<String> values) {
            addCriterion("merchant_card_no not in", values, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoBetween(String value1, String value2) {
            addCriterion("merchant_card_no between", value1, value2, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCardNoNotBetween(String value1, String value2) {
            addCriterion("merchant_card_no not between", value1, value2, "merchantCardNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andAutoIsNull() {
            addCriterion("auto is null");
            return (Criteria) this;
        }

        public Criteria andAutoIsNotNull() {
            addCriterion("auto is not null");
            return (Criteria) this;
        }

        public Criteria andAutoEqualTo(Integer value) {
            addCriterion("auto =", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoNotEqualTo(Integer value) {
            addCriterion("auto <>", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoGreaterThan(Integer value) {
            addCriterion("auto >", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto >=", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoLessThan(Integer value) {
            addCriterion("auto <", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoLessThanOrEqualTo(Integer value) {
            addCriterion("auto <=", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoIn(List<Integer> values) {
            addCriterion("auto in", values, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoNotIn(List<Integer> values) {
            addCriterion("auto not in", values, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoBetween(Integer value1, Integer value2) {
            addCriterion("auto between", value1, value2, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoNotBetween(Integer value1, Integer value2) {
            addCriterion("auto not between", value1, value2, "auto");
            return (Criteria) this;
        }

        public Criteria andNormalIsNull() {
            addCriterion("normal is null");
            return (Criteria) this;
        }

        public Criteria andNormalIsNotNull() {
            addCriterion("normal is not null");
            return (Criteria) this;
        }

        public Criteria andNormalEqualTo(Integer value) {
            addCriterion("normal =", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotEqualTo(Integer value) {
            addCriterion("normal <>", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalGreaterThan(Integer value) {
            addCriterion("normal >", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalGreaterThanOrEqualTo(Integer value) {
            addCriterion("normal >=", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalLessThan(Integer value) {
            addCriterion("normal <", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalLessThanOrEqualTo(Integer value) {
            addCriterion("normal <=", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalIn(List<Integer> values) {
            addCriterion("normal in", values, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotIn(List<Integer> values) {
            addCriterion("normal not in", values, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalBetween(Integer value1, Integer value2) {
            addCriterion("normal between", value1, value2, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotBetween(Integer value1, Integer value2) {
            addCriterion("normal not between", value1, value2, "normal");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table withdraw_config
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
     * corresponds to the database table withdraw_config
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