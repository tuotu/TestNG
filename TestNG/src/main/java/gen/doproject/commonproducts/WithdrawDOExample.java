/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawDOExample.java
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

public class WithdrawDOExample {
    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    public WithdrawDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table withdraw
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
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table withdraw
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
     * corresponds to the database table withdraw
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

        public Criteria andInletIsNull() {
            addCriterion("inlet is null");
            return (Criteria) this;
        }

        public Criteria andInletIsNotNull() {
            addCriterion("inlet is not null");
            return (Criteria) this;
        }

        public Criteria andInletEqualTo(String value) {
            addCriterion("inlet =", value, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletNotEqualTo(String value) {
            addCriterion("inlet <>", value, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletGreaterThan(String value) {
            addCriterion("inlet >", value, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletGreaterThanOrEqualTo(String value) {
            addCriterion("inlet >=", value, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletLessThan(String value) {
            addCriterion("inlet <", value, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletLessThanOrEqualTo(String value) {
            addCriterion("inlet <=", value, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletLike(String value) {
            addCriterion("inlet like", value, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletNotLike(String value) {
            addCriterion("inlet not like", value, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletIn(List<String> values) {
            addCriterion("inlet in", values, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletNotIn(List<String> values) {
            addCriterion("inlet not in", values, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletBetween(String value1, String value2) {
            addCriterion("inlet between", value1, value2, "inlet");
            return (Criteria) this;
        }

        public Criteria andInletNotBetween(String value1, String value2) {
            addCriterion("inlet not between", value1, value2, "inlet");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoIsNull() {
            addCriterion("merchant_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoIsNotNull() {
            addCriterion("merchant_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoEqualTo(String value) {
            addCriterion("merchant_acc_no =", value, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoNotEqualTo(String value) {
            addCriterion("merchant_acc_no <>", value, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoGreaterThan(String value) {
            addCriterion("merchant_acc_no >", value, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_acc_no >=", value, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoLessThan(String value) {
            addCriterion("merchant_acc_no <", value, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_acc_no <=", value, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoLike(String value) {
            addCriterion("merchant_acc_no like", value, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoNotLike(String value) {
            addCriterion("merchant_acc_no not like", value, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoIn(List<String> values) {
            addCriterion("merchant_acc_no in", values, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoNotIn(List<String> values) {
            addCriterion("merchant_acc_no not in", values, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoBetween(String value1, String value2) {
            addCriterion("merchant_acc_no between", value1, value2, "merchantAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantAccNoNotBetween(String value1, String value2) {
            addCriterion("merchant_acc_no not between", value1, value2, "merchantAccNo");
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

        public Criteria andMerchantOrderNoIsNull() {
            addCriterion("merchant_order_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNotNull() {
            addCriterion("merchant_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoEqualTo(String value) {
            addCriterion("merchant_order_no =", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotEqualTo(String value) {
            addCriterion("merchant_order_no <>", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThan(String value) {
            addCriterion("merchant_order_no >", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_order_no >=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThan(String value) {
            addCriterion("merchant_order_no <", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_order_no <=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLike(String value) {
            addCriterion("merchant_order_no like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotLike(String value) {
            addCriterion("merchant_order_no not like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIn(List<String> values) {
            addCriterion("merchant_order_no in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotIn(List<String> values) {
            addCriterion("merchant_order_no not in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoBetween(String value1, String value2) {
            addCriterion("merchant_order_no between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotBetween(String value1, String value2) {
            addCriterion("merchant_order_no not between", value1, value2, "merchantOrderNo");
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

        public Criteria andMerchantUserIdIsNull() {
            addCriterion("merchant_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdIsNotNull() {
            addCriterion("merchant_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdEqualTo(String value) {
            addCriterion("merchant_user_id =", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdNotEqualTo(String value) {
            addCriterion("merchant_user_id <>", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdGreaterThan(String value) {
            addCriterion("merchant_user_id >", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_user_id >=", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdLessThan(String value) {
            addCriterion("merchant_user_id <", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_user_id <=", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdLike(String value) {
            addCriterion("merchant_user_id like", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdNotLike(String value) {
            addCriterion("merchant_user_id not like", value, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdIn(List<String> values) {
            addCriterion("merchant_user_id in", values, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdNotIn(List<String> values) {
            addCriterion("merchant_user_id not in", values, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdBetween(String value1, String value2) {
            addCriterion("merchant_user_id between", value1, value2, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andMerchantUserIdNotBetween(String value1, String value2) {
            addCriterion("merchant_user_id not between", value1, value2, "merchantUserId");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("product_status is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("product_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(String value) {
            addCriterion("product_status =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(String value) {
            addCriterion("product_status <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(String value) {
            addCriterion("product_status >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(String value) {
            addCriterion("product_status >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(String value) {
            addCriterion("product_status <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(String value) {
            addCriterion("product_status <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLike(String value) {
            addCriterion("product_status like", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotLike(String value) {
            addCriterion("product_status not like", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<String> values) {
            addCriterion("product_status in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<String> values) {
            addCriterion("product_status not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(String value1, String value2) {
            addCriterion("product_status between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(String value1, String value2) {
            addCriterion("product_status not between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNull() {
            addCriterion("bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNotNull() {
            addCriterion("bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoEqualTo(String value) {
            addCriterion("bank_account_no =", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotEqualTo(String value) {
            addCriterion("bank_account_no <>", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThan(String value) {
            addCriterion("bank_account_no >", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_no >=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThan(String value) {
            addCriterion("bank_account_no <", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThanOrEqualTo(String value) {
            addCriterion("bank_account_no <=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLike(String value) {
            addCriterion("bank_account_no like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotLike(String value) {
            addCriterion("bank_account_no not like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIn(List<String> values) {
            addCriterion("bank_account_no in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotIn(List<String> values) {
            addCriterion("bank_account_no not in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoBetween(String value1, String value2) {
            addCriterion("bank_account_no between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotBetween(String value1, String value2) {
            addCriterion("bank_account_no not between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSecIndexIsNull() {
            addCriterion("sec_index is null");
            return (Criteria) this;
        }

        public Criteria andSecIndexIsNotNull() {
            addCriterion("sec_index is not null");
            return (Criteria) this;
        }

        public Criteria andSecIndexEqualTo(String value) {
            addCriterion("sec_index =", value, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexNotEqualTo(String value) {
            addCriterion("sec_index <>", value, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexGreaterThan(String value) {
            addCriterion("sec_index >", value, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexGreaterThanOrEqualTo(String value) {
            addCriterion("sec_index >=", value, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexLessThan(String value) {
            addCriterion("sec_index <", value, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexLessThanOrEqualTo(String value) {
            addCriterion("sec_index <=", value, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexLike(String value) {
            addCriterion("sec_index like", value, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexNotLike(String value) {
            addCriterion("sec_index not like", value, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexIn(List<String> values) {
            addCriterion("sec_index in", values, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexNotIn(List<String> values) {
            addCriterion("sec_index not in", values, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexBetween(String value1, String value2) {
            addCriterion("sec_index between", value1, value2, "secIndex");
            return (Criteria) this;
        }

        public Criteria andSecIndexNotBetween(String value1, String value2) {
            addCriterion("sec_index not between", value1, value2, "secIndex");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andChargeAmountIsNull() {
            addCriterion("charge_amount is null");
            return (Criteria) this;
        }

        public Criteria andChargeAmountIsNotNull() {
            addCriterion("charge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChargeAmountEqualTo(Long value) {
            addCriterion("charge_amount =", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotEqualTo(Long value) {
            addCriterion("charge_amount <>", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountGreaterThan(Long value) {
            addCriterion("charge_amount >", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("charge_amount >=", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountLessThan(Long value) {
            addCriterion("charge_amount <", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("charge_amount <=", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountIn(List<Long> values) {
            addCriterion("charge_amount in", values, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotIn(List<Long> values) {
            addCriterion("charge_amount not in", values, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountBetween(Long value1, Long value2) {
            addCriterion("charge_amount between", value1, value2, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("charge_amount not between", value1, value2, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeNoIsNull() {
            addCriterion("charge_no is null");
            return (Criteria) this;
        }

        public Criteria andChargeNoIsNotNull() {
            addCriterion("charge_no is not null");
            return (Criteria) this;
        }

        public Criteria andChargeNoEqualTo(String value) {
            addCriterion("charge_no =", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoNotEqualTo(String value) {
            addCriterion("charge_no <>", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoGreaterThan(String value) {
            addCriterion("charge_no >", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoGreaterThanOrEqualTo(String value) {
            addCriterion("charge_no >=", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoLessThan(String value) {
            addCriterion("charge_no <", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoLessThanOrEqualTo(String value) {
            addCriterion("charge_no <=", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoLike(String value) {
            addCriterion("charge_no like", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoNotLike(String value) {
            addCriterion("charge_no not like", value, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoIn(List<String> values) {
            addCriterion("charge_no in", values, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoNotIn(List<String> values) {
            addCriterion("charge_no not in", values, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoBetween(String value1, String value2) {
            addCriterion("charge_no between", value1, value2, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andChargeNoNotBetween(String value1, String value2) {
            addCriterion("charge_no not between", value1, value2, "chargeNo");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andDelayHoursIsNull() {
            addCriterion("delay_hours is null");
            return (Criteria) this;
        }

        public Criteria andDelayHoursIsNotNull() {
            addCriterion("delay_hours is not null");
            return (Criteria) this;
        }

        public Criteria andDelayHoursEqualTo(String value) {
            addCriterion("delay_hours =", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotEqualTo(String value) {
            addCriterion("delay_hours <>", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursGreaterThan(String value) {
            addCriterion("delay_hours >", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursGreaterThanOrEqualTo(String value) {
            addCriterion("delay_hours >=", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursLessThan(String value) {
            addCriterion("delay_hours <", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursLessThanOrEqualTo(String value) {
            addCriterion("delay_hours <=", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursLike(String value) {
            addCriterion("delay_hours like", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotLike(String value) {
            addCriterion("delay_hours not like", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursIn(List<String> values) {
            addCriterion("delay_hours in", values, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotIn(List<String> values) {
            addCriterion("delay_hours not in", values, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursBetween(String value1, String value2) {
            addCriterion("delay_hours between", value1, value2, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotBetween(String value1, String value2) {
            addCriterion("delay_hours not between", value1, value2, "delayHours");
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

        public Criteria andPayNoIsNull() {
            addCriterion("pay_no is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("pay_no =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("pay_no <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("pay_no >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_no >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("pay_no <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("pay_no <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("pay_no like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("pay_no not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("pay_no in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("pay_no not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("pay_no between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("pay_no not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andSignNoIsNull() {
            addCriterion("sign_no is null");
            return (Criteria) this;
        }

        public Criteria andSignNoIsNotNull() {
            addCriterion("sign_no is not null");
            return (Criteria) this;
        }

        public Criteria andSignNoEqualTo(String value) {
            addCriterion("sign_no =", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoNotEqualTo(String value) {
            addCriterion("sign_no <>", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoGreaterThan(String value) {
            addCriterion("sign_no >", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoGreaterThanOrEqualTo(String value) {
            addCriterion("sign_no >=", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoLessThan(String value) {
            addCriterion("sign_no <", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoLessThanOrEqualTo(String value) {
            addCriterion("sign_no <=", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoLike(String value) {
            addCriterion("sign_no like", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoNotLike(String value) {
            addCriterion("sign_no not like", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoIn(List<String> values) {
            addCriterion("sign_no in", values, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoNotIn(List<String> values) {
            addCriterion("sign_no not in", values, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoBetween(String value1, String value2) {
            addCriterion("sign_no between", value1, value2, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoNotBetween(String value1, String value2) {
            addCriterion("sign_no not between", value1, value2, "signNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoIsNull() {
            addCriterion("user_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andUserAccNoIsNotNull() {
            addCriterion("user_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccNoEqualTo(String value) {
            addCriterion("user_acc_no =", value, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoNotEqualTo(String value) {
            addCriterion("user_acc_no <>", value, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoGreaterThan(String value) {
            addCriterion("user_acc_no >", value, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_acc_no >=", value, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoLessThan(String value) {
            addCriterion("user_acc_no <", value, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoLessThanOrEqualTo(String value) {
            addCriterion("user_acc_no <=", value, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoLike(String value) {
            addCriterion("user_acc_no like", value, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoNotLike(String value) {
            addCriterion("user_acc_no not like", value, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoIn(List<String> values) {
            addCriterion("user_acc_no in", values, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoNotIn(List<String> values) {
            addCriterion("user_acc_no not in", values, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoBetween(String value1, String value2) {
            addCriterion("user_acc_no between", value1, value2, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserAccNoNotBetween(String value1, String value2) {
            addCriterion("user_acc_no not between", value1, value2, "userAccNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoIsNull() {
            addCriterion("user_card_no is null");
            return (Criteria) this;
        }

        public Criteria andUserCardNoIsNotNull() {
            addCriterion("user_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserCardNoEqualTo(String value) {
            addCriterion("user_card_no =", value, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoNotEqualTo(String value) {
            addCriterion("user_card_no <>", value, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoGreaterThan(String value) {
            addCriterion("user_card_no >", value, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_card_no >=", value, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoLessThan(String value) {
            addCriterion("user_card_no <", value, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoLessThanOrEqualTo(String value) {
            addCriterion("user_card_no <=", value, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoLike(String value) {
            addCriterion("user_card_no like", value, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoNotLike(String value) {
            addCriterion("user_card_no not like", value, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoIn(List<String> values) {
            addCriterion("user_card_no in", values, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoNotIn(List<String> values) {
            addCriterion("user_card_no not in", values, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoBetween(String value1, String value2) {
            addCriterion("user_card_no between", value1, value2, "userCardNo");
            return (Criteria) this;
        }

        public Criteria andUserCardNoNotBetween(String value1, String value2) {
            addCriterion("user_card_no not between", value1, value2, "userCardNo");
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

        public Criteria andWithdrawTypeIsNull() {
            addCriterion("withdraw_type is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeIsNotNull() {
            addCriterion("withdraw_type is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeEqualTo(String value) {
            addCriterion("withdraw_type =", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotEqualTo(String value) {
            addCriterion("withdraw_type <>", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeGreaterThan(String value) {
            addCriterion("withdraw_type >", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_type >=", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeLessThan(String value) {
            addCriterion("withdraw_type <", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeLessThanOrEqualTo(String value) {
            addCriterion("withdraw_type <=", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeLike(String value) {
            addCriterion("withdraw_type like", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotLike(String value) {
            addCriterion("withdraw_type not like", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeIn(List<String> values) {
            addCriterion("withdraw_type in", values, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotIn(List<String> values) {
            addCriterion("withdraw_type not in", values, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeBetween(String value1, String value2) {
            addCriterion("withdraw_type between", value1, value2, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotBetween(String value1, String value2) {
            addCriterion("withdraw_type not between", value1, value2, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursIsNull() {
            addCriterion("origin_delay_hours is null");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursIsNotNull() {
            addCriterion("origin_delay_hours is not null");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursEqualTo(String value) {
            addCriterion("origin_delay_hours =", value, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursNotEqualTo(String value) {
            addCriterion("origin_delay_hours <>", value, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursGreaterThan(String value) {
            addCriterion("origin_delay_hours >", value, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursGreaterThanOrEqualTo(String value) {
            addCriterion("origin_delay_hours >=", value, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursLessThan(String value) {
            addCriterion("origin_delay_hours <", value, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursLessThanOrEqualTo(String value) {
            addCriterion("origin_delay_hours <=", value, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursLike(String value) {
            addCriterion("origin_delay_hours like", value, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursNotLike(String value) {
            addCriterion("origin_delay_hours not like", value, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursIn(List<String> values) {
            addCriterion("origin_delay_hours in", values, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursNotIn(List<String> values) {
            addCriterion("origin_delay_hours not in", values, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursBetween(String value1, String value2) {
            addCriterion("origin_delay_hours between", value1, value2, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andOriginDelayHoursNotBetween(String value1, String value2) {
            addCriterion("origin_delay_hours not between", value1, value2, "originDelayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoIsNull() {
            addCriterion("delay_hours_memo is null");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoIsNotNull() {
            addCriterion("delay_hours_memo is not null");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoEqualTo(String value) {
            addCriterion("delay_hours_memo =", value, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoNotEqualTo(String value) {
            addCriterion("delay_hours_memo <>", value, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoGreaterThan(String value) {
            addCriterion("delay_hours_memo >", value, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoGreaterThanOrEqualTo(String value) {
            addCriterion("delay_hours_memo >=", value, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoLessThan(String value) {
            addCriterion("delay_hours_memo <", value, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoLessThanOrEqualTo(String value) {
            addCriterion("delay_hours_memo <=", value, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoLike(String value) {
            addCriterion("delay_hours_memo like", value, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoNotLike(String value) {
            addCriterion("delay_hours_memo not like", value, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoIn(List<String> values) {
            addCriterion("delay_hours_memo in", values, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoNotIn(List<String> values) {
            addCriterion("delay_hours_memo not in", values, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoBetween(String value1, String value2) {
            addCriterion("delay_hours_memo between", value1, value2, "delayHoursMemo");
            return (Criteria) this;
        }

        public Criteria andDelayHoursMemoNotBetween(String value1, String value2) {
            addCriterion("delay_hours_memo not between", value1, value2, "delayHoursMemo");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table withdraw
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
     * corresponds to the database table withdraw
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