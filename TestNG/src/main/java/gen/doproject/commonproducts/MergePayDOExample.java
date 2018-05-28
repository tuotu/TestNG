/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename MergePayDOExample.java
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

public class MergePayDOExample {
    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    public MergePayDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table merge_pay
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
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table merge_pay
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
     * corresponds to the database table merge_pay
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

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("batch_no like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("batch_no not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Long value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Long value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Long value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Long value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Long> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Long> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Long value1, Long value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andDepositNoIsNull() {
            addCriterion("deposit_no is null");
            return (Criteria) this;
        }

        public Criteria andDepositNoIsNotNull() {
            addCriterion("deposit_no is not null");
            return (Criteria) this;
        }

        public Criteria andDepositNoEqualTo(String value) {
            addCriterion("deposit_no =", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoNotEqualTo(String value) {
            addCriterion("deposit_no <>", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoGreaterThan(String value) {
            addCriterion("deposit_no >", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_no >=", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoLessThan(String value) {
            addCriterion("deposit_no <", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoLessThanOrEqualTo(String value) {
            addCriterion("deposit_no <=", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoLike(String value) {
            addCriterion("deposit_no like", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoNotLike(String value) {
            addCriterion("deposit_no not like", value, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoIn(List<String> values) {
            addCriterion("deposit_no in", values, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoNotIn(List<String> values) {
            addCriterion("deposit_no not in", values, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoBetween(String value1, String value2) {
            addCriterion("deposit_no between", value1, value2, "depositNo");
            return (Criteria) this;
        }

        public Criteria andDepositNoNotBetween(String value1, String value2) {
            addCriterion("deposit_no not between", value1, value2, "depositNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoIsNull() {
            addCriterion("settle_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoIsNotNull() {
            addCriterion("settle_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoEqualTo(String value) {
            addCriterion("settle_biz_no =", value, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoNotEqualTo(String value) {
            addCriterion("settle_biz_no <>", value, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoGreaterThan(String value) {
            addCriterion("settle_biz_no >", value, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("settle_biz_no >=", value, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoLessThan(String value) {
            addCriterion("settle_biz_no <", value, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoLessThanOrEqualTo(String value) {
            addCriterion("settle_biz_no <=", value, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoLike(String value) {
            addCriterion("settle_biz_no like", value, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoNotLike(String value) {
            addCriterion("settle_biz_no not like", value, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoIn(List<String> values) {
            addCriterion("settle_biz_no in", values, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoNotIn(List<String> values) {
            addCriterion("settle_biz_no not in", values, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoBetween(String value1, String value2) {
            addCriterion("settle_biz_no between", value1, value2, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andSettleBizNoNotBetween(String value1, String value2) {
            addCriterion("settle_biz_no not between", value1, value2, "settleBizNo");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIsNull() {
            addCriterion("deposit_status is null");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIsNotNull() {
            addCriterion("deposit_status is not null");
            return (Criteria) this;
        }

        public Criteria andDepositStatusEqualTo(String value) {
            addCriterion("deposit_status =", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotEqualTo(String value) {
            addCriterion("deposit_status <>", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusGreaterThan(String value) {
            addCriterion("deposit_status >", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_status >=", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLessThan(String value) {
            addCriterion("deposit_status <", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLessThanOrEqualTo(String value) {
            addCriterion("deposit_status <=", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLike(String value) {
            addCriterion("deposit_status like", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotLike(String value) {
            addCriterion("deposit_status not like", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIn(List<String> values) {
            addCriterion("deposit_status in", values, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotIn(List<String> values) {
            addCriterion("deposit_status not in", values, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusBetween(String value1, String value2) {
            addCriterion("deposit_status between", value1, value2, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotBetween(String value1, String value2) {
            addCriterion("deposit_status not between", value1, value2, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andForwardUrlIsNull() {
            addCriterion("forward_url is null");
            return (Criteria) this;
        }

        public Criteria andForwardUrlIsNotNull() {
            addCriterion("forward_url is not null");
            return (Criteria) this;
        }

        public Criteria andForwardUrlEqualTo(String value) {
            addCriterion("forward_url =", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlNotEqualTo(String value) {
            addCriterion("forward_url <>", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlGreaterThan(String value) {
            addCriterion("forward_url >", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlGreaterThanOrEqualTo(String value) {
            addCriterion("forward_url >=", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlLessThan(String value) {
            addCriterion("forward_url <", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlLessThanOrEqualTo(String value) {
            addCriterion("forward_url <=", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlLike(String value) {
            addCriterion("forward_url like", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlNotLike(String value) {
            addCriterion("forward_url not like", value, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlIn(List<String> values) {
            addCriterion("forward_url in", values, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlNotIn(List<String> values) {
            addCriterion("forward_url not in", values, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlBetween(String value1, String value2) {
            addCriterion("forward_url between", value1, value2, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andForwardUrlNotBetween(String value1, String value2) {
            addCriterion("forward_url not between", value1, value2, "forwardUrl");
            return (Criteria) this;
        }

        public Criteria andFailCodeIsNull() {
            addCriterion("fail_code is null");
            return (Criteria) this;
        }

        public Criteria andFailCodeIsNotNull() {
            addCriterion("fail_code is not null");
            return (Criteria) this;
        }

        public Criteria andFailCodeEqualTo(String value) {
            addCriterion("fail_code =", value, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeNotEqualTo(String value) {
            addCriterion("fail_code <>", value, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeGreaterThan(String value) {
            addCriterion("fail_code >", value, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fail_code >=", value, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeLessThan(String value) {
            addCriterion("fail_code <", value, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeLessThanOrEqualTo(String value) {
            addCriterion("fail_code <=", value, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeLike(String value) {
            addCriterion("fail_code like", value, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeNotLike(String value) {
            addCriterion("fail_code not like", value, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeIn(List<String> values) {
            addCriterion("fail_code in", values, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeNotIn(List<String> values) {
            addCriterion("fail_code not in", values, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeBetween(String value1, String value2) {
            addCriterion("fail_code between", value1, value2, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailCodeNotBetween(String value1, String value2) {
            addCriterion("fail_code not between", value1, value2, "failCode");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNull() {
            addCriterion("fail_reason is null");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNotNull() {
            addCriterion("fail_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFailReasonEqualTo(String value) {
            addCriterion("fail_reason =", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotEqualTo(String value) {
            addCriterion("fail_reason <>", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThan(String value) {
            addCriterion("fail_reason >", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("fail_reason >=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThan(String value) {
            addCriterion("fail_reason <", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThanOrEqualTo(String value) {
            addCriterion("fail_reason <=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLike(String value) {
            addCriterion("fail_reason like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotLike(String value) {
            addCriterion("fail_reason not like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonIn(List<String> values) {
            addCriterion("fail_reason in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotIn(List<String> values) {
            addCriterion("fail_reason not in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonBetween(String value1, String value2) {
            addCriterion("fail_reason between", value1, value2, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotBetween(String value1, String value2) {
            addCriterion("fail_reason not between", value1, value2, "failReason");
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
     * corresponds to the database table merge_pay
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
     * corresponds to the database table merge_pay
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