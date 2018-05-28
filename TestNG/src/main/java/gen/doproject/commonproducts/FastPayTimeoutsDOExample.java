/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayTimeoutsDOExample.java
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

public class FastPayTimeoutsDOExample {
    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    public FastPayTimeoutsDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table fast_pay_timeouts
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
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table fast_pay_timeouts
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
     * corresponds to the database table fast_pay_timeouts
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

        public Criteria andBizNoIsNull() {
            addCriterion("biz_no is null");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNotNull() {
            addCriterion("biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andBizNoEqualTo(String value) {
            addCriterion("biz_no =", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotEqualTo(String value) {
            addCriterion("biz_no <>", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThan(String value) {
            addCriterion("biz_no >", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("biz_no >=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThan(String value) {
            addCriterion("biz_no <", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThanOrEqualTo(String value) {
            addCriterion("biz_no <=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLike(String value) {
            addCriterion("biz_no like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotLike(String value) {
            addCriterion("biz_no not like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoIn(List<String> values) {
            addCriterion("biz_no in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotIn(List<String> values) {
            addCriterion("biz_no not in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoBetween(String value1, String value2) {
            addCriterion("biz_no between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotBetween(String value1, String value2) {
            addCriterion("biz_no not between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNull() {
            addCriterion("trade_status is null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNotNull() {
            addCriterion("trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusEqualTo(String value) {
            addCriterion("trade_status =", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotEqualTo(String value) {
            addCriterion("trade_status <>", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThan(String value) {
            addCriterion("trade_status >", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("trade_status >=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThan(String value) {
            addCriterion("trade_status <", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThanOrEqualTo(String value) {
            addCriterion("trade_status <=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLike(String value) {
            addCriterion("trade_status like", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotLike(String value) {
            addCriterion("trade_status not like", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIn(List<String> values) {
            addCriterion("trade_status in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotIn(List<String> values) {
            addCriterion("trade_status not in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusBetween(String value1, String value2) {
            addCriterion("trade_status between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotBetween(String value1, String value2) {
            addCriterion("trade_status not between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusIsNull() {
            addCriterion("timeout_trade_status is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusIsNotNull() {
            addCriterion("timeout_trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusEqualTo(String value) {
            addCriterion("timeout_trade_status =", value, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusNotEqualTo(String value) {
            addCriterion("timeout_trade_status <>", value, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusGreaterThan(String value) {
            addCriterion("timeout_trade_status >", value, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("timeout_trade_status >=", value, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusLessThan(String value) {
            addCriterion("timeout_trade_status <", value, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusLessThanOrEqualTo(String value) {
            addCriterion("timeout_trade_status <=", value, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusLike(String value) {
            addCriterion("timeout_trade_status like", value, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusNotLike(String value) {
            addCriterion("timeout_trade_status not like", value, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusIn(List<String> values) {
            addCriterion("timeout_trade_status in", values, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusNotIn(List<String> values) {
            addCriterion("timeout_trade_status not in", values, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusBetween(String value1, String value2) {
            addCriterion("timeout_trade_status between", value1, value2, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutTradeStatusNotBetween(String value1, String value2) {
            addCriterion("timeout_trade_status not between", value1, value2, "timeoutTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionIsNull() {
            addCriterion("timeout_action is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionIsNotNull() {
            addCriterion("timeout_action is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionEqualTo(String value) {
            addCriterion("timeout_action =", value, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionNotEqualTo(String value) {
            addCriterion("timeout_action <>", value, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionGreaterThan(String value) {
            addCriterion("timeout_action >", value, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionGreaterThanOrEqualTo(String value) {
            addCriterion("timeout_action >=", value, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionLessThan(String value) {
            addCriterion("timeout_action <", value, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionLessThanOrEqualTo(String value) {
            addCriterion("timeout_action <=", value, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionLike(String value) {
            addCriterion("timeout_action like", value, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionNotLike(String value) {
            addCriterion("timeout_action not like", value, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionIn(List<String> values) {
            addCriterion("timeout_action in", values, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionNotIn(List<String> values) {
            addCriterion("timeout_action not in", values, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionBetween(String value1, String value2) {
            addCriterion("timeout_action between", value1, value2, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutActionNotBetween(String value1, String value2) {
            addCriterion("timeout_action not between", value1, value2, "timeoutAction");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateIsNull() {
            addCriterion("timeout_date is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateIsNotNull() {
            addCriterion("timeout_date is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateEqualTo(Date value) {
            addCriterion("timeout_date =", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateNotEqualTo(Date value) {
            addCriterion("timeout_date <>", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateGreaterThan(Date value) {
            addCriterion("timeout_date >", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("timeout_date >=", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateLessThan(Date value) {
            addCriterion("timeout_date <", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateLessThanOrEqualTo(Date value) {
            addCriterion("timeout_date <=", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateIn(List<Date> values) {
            addCriterion("timeout_date in", values, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateNotIn(List<Date> values) {
            addCriterion("timeout_date not in", values, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateBetween(Date value1, Date value2) {
            addCriterion("timeout_date between", value1, value2, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateNotBetween(Date value1, Date value2) {
            addCriterion("timeout_date not between", value1, value2, "timeoutDate");
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
    }

    /**
     * corresponds to the database table fast_pay_timeouts
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
     * corresponds to the database table fast_pay_timeouts
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