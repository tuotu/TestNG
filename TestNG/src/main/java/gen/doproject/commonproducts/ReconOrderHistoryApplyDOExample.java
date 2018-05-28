/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconOrderHistoryApplyDOExample.java
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
import java.util.Iterator;
import java.util.List;

public class ReconOrderHistoryApplyDOExample {
    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    public ReconOrderHistoryApplyDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table recon_order_history_apply
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
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table recon_order_history_apply
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
     * corresponds to the database table recon_order_history_apply
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNull() {
            addCriterion("partner_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNotNull() {
            addCriterion("partner_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdEqualTo(String value) {
            addCriterion("partner_id =", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotEqualTo(String value) {
            addCriterion("partner_id <>", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThan(String value) {
            addCriterion("partner_id >", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("partner_id >=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThan(String value) {
            addCriterion("partner_id <", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThanOrEqualTo(String value) {
            addCriterion("partner_id <=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLike(String value) {
            addCriterion("partner_id like", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotLike(String value) {
            addCriterion("partner_id not like", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIn(List<String> values) {
            addCriterion("partner_id in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotIn(List<String> values) {
            addCriterion("partner_id not in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdBetween(String value1, String value2) {
            addCriterion("partner_id between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotBetween(String value1, String value2) {
            addCriterion("partner_id not between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoIsNull() {
            addCriterion("merch_order_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoIsNotNull() {
            addCriterion("merch_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoEqualTo(String value) {
            addCriterion("merch_order_no =", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoNotEqualTo(String value) {
            addCriterion("merch_order_no <>", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoGreaterThan(String value) {
            addCriterion("merch_order_no >", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("merch_order_no >=", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoLessThan(String value) {
            addCriterion("merch_order_no <", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoLessThanOrEqualTo(String value) {
            addCriterion("merch_order_no <=", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoLike(String value) {
            addCriterion("merch_order_no like", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoNotLike(String value) {
            addCriterion("merch_order_no not like", value, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoIn(List<String> values) {
            addCriterion("merch_order_no in", values, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoNotIn(List<String> values) {
            addCriterion("merch_order_no not in", values, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoBetween(String value1, String value2) {
            addCriterion("merch_order_no between", value1, value2, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchOrderNoNotBetween(String value1, String value2) {
            addCriterion("merch_order_no not between", value1, value2, "merchOrderNo");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeIsNull() {
            addCriterion("apply_start_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeIsNotNull() {
            addCriterion("apply_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("apply_start_time =", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("apply_start_time <>", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("apply_start_time >", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_start_time >=", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("apply_start_time <", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_start_time <=", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("apply_start_time in", values, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("apply_start_time not in", values, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_start_time between", value1, value2, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_start_time not between", value1, value2, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeIsNull() {
            addCriterion("apply_end_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeIsNotNull() {
            addCriterion("apply_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("apply_end_time =", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("apply_end_time <>", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("apply_end_time >", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_end_time >=", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("apply_end_time <", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_end_time <=", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("apply_end_time in", values, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("apply_end_time not in", values, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_end_time between", value1, value2, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_end_time not between", value1, value2, "applyEndTime");
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
     * corresponds to the database table recon_order_history_apply
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
     * corresponds to the database table recon_order_history_apply
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