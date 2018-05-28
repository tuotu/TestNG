/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastTradeDOExample.java
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

public class FastTradeDOExample {
    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    public FastTradeDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table fast_trade
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
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table fast_trade
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
     * corresponds to the database table fast_trade
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

        public Criteria andAutoChangeableIsNull() {
            addCriterion("auto_changeable is null");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableIsNotNull() {
            addCriterion("auto_changeable is not null");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableEqualTo(String value) {
            addCriterion("auto_changeable =", value, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableNotEqualTo(String value) {
            addCriterion("auto_changeable <>", value, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableGreaterThan(String value) {
            addCriterion("auto_changeable >", value, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableGreaterThanOrEqualTo(String value) {
            addCriterion("auto_changeable >=", value, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableLessThan(String value) {
            addCriterion("auto_changeable <", value, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableLessThanOrEqualTo(String value) {
            addCriterion("auto_changeable <=", value, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableLike(String value) {
            addCriterion("auto_changeable like", value, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableNotLike(String value) {
            addCriterion("auto_changeable not like", value, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableIn(List<String> values) {
            addCriterion("auto_changeable in", values, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableNotIn(List<String> values) {
            addCriterion("auto_changeable not in", values, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableBetween(String value1, String value2) {
            addCriterion("auto_changeable between", value1, value2, "autoChangeable");
            return (Criteria) this;
        }

        public Criteria andAutoChangeableNotBetween(String value1, String value2) {
            addCriterion("auto_changeable not between", value1, value2, "autoChangeable");
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

        public Criteria andBankCardNoIsNull() {
            addCriterion("bank_card_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("bank_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("bank_card_no =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("bank_card_no <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("bank_card_no >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_no >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("bank_card_no <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_no <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("bank_card_no like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("bank_card_no not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("bank_card_no in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("bank_card_no not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("bank_card_no between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("bank_card_no not between", value1, value2, "bankCardNo");
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

        public Criteria andBankCardTypeIsNull() {
            addCriterion("bank_card_type is null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIsNotNull() {
            addCriterion("bank_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeEqualTo(String value) {
            addCriterion("bank_card_type =", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotEqualTo(String value) {
            addCriterion("bank_card_type <>", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThan(String value) {
            addCriterion("bank_card_type >", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_type >=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThan(String value) {
            addCriterion("bank_card_type <", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThanOrEqualTo(String value) {
            addCriterion("bank_card_type <=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLike(String value) {
            addCriterion("bank_card_type like", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotLike(String value) {
            addCriterion("bank_card_type not like", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIn(List<String> values) {
            addCriterion("bank_card_type in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotIn(List<String> values) {
            addCriterion("bank_card_type not in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeBetween(String value1, String value2) {
            addCriterion("bank_card_type between", value1, value2, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotBetween(String value1, String value2) {
            addCriterion("bank_card_type not between", value1, value2, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeIsNull() {
            addCriterion("personal_corporate_type is null");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeIsNotNull() {
            addCriterion("personal_corporate_type is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeEqualTo(String value) {
            addCriterion("personal_corporate_type =", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeNotEqualTo(String value) {
            addCriterion("personal_corporate_type <>", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeGreaterThan(String value) {
            addCriterion("personal_corporate_type >", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("personal_corporate_type >=", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeLessThan(String value) {
            addCriterion("personal_corporate_type <", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeLessThanOrEqualTo(String value) {
            addCriterion("personal_corporate_type <=", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeLike(String value) {
            addCriterion("personal_corporate_type like", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeNotLike(String value) {
            addCriterion("personal_corporate_type not like", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeIn(List<String> values) {
            addCriterion("personal_corporate_type in", values, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeNotIn(List<String> values) {
            addCriterion("personal_corporate_type not in", values, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeBetween(String value1, String value2) {
            addCriterion("personal_corporate_type between", value1, value2, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeNotBetween(String value1, String value2) {
            addCriterion("personal_corporate_type not between", value1, value2, "personalCorporateType");
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

        public Criteria andCertNoIsNull() {
            addCriterion("cert_no is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("cert_no =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("cert_no <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("cert_no >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("cert_no >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("cert_no <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("cert_no <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("cert_no like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("cert_no not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("cert_no in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("cert_no not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("cert_no between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("cert_no not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("cert_type is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("cert_type =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("cert_type <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("cert_type >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cert_type >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("cert_type <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("cert_type <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("cert_type like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("cert_type not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("cert_type in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("cert_type not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("cert_type between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("cert_type not between", value1, value2, "certType");
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

        public Criteria andCommandAmountIsNull() {
            addCriterion("command_amount is null");
            return (Criteria) this;
        }

        public Criteria andCommandAmountIsNotNull() {
            addCriterion("command_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCommandAmountEqualTo(Long value) {
            addCriterion("command_amount =", value, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andCommandAmountNotEqualTo(Long value) {
            addCriterion("command_amount <>", value, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andCommandAmountGreaterThan(Long value) {
            addCriterion("command_amount >", value, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andCommandAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("command_amount >=", value, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andCommandAmountLessThan(Long value) {
            addCriterion("command_amount <", value, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andCommandAmountLessThanOrEqualTo(Long value) {
            addCriterion("command_amount <=", value, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andCommandAmountIn(List<Long> values) {
            addCriterion("command_amount in", values, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andCommandAmountNotIn(List<Long> values) {
            addCriterion("command_amount not in", values, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andCommandAmountBetween(Long value1, Long value2) {
            addCriterion("command_amount between", value1, value2, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andCommandAmountNotBetween(Long value1, Long value2) {
            addCriterion("command_amount not between", value1, value2, "commandAmount");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoIsNull() {
            addCriterion("deduct_out_order_no is null");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoIsNotNull() {
            addCriterion("deduct_out_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoEqualTo(String value) {
            addCriterion("deduct_out_order_no =", value, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoNotEqualTo(String value) {
            addCriterion("deduct_out_order_no <>", value, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoGreaterThan(String value) {
            addCriterion("deduct_out_order_no >", value, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("deduct_out_order_no >=", value, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoLessThan(String value) {
            addCriterion("deduct_out_order_no <", value, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoLessThanOrEqualTo(String value) {
            addCriterion("deduct_out_order_no <=", value, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoLike(String value) {
            addCriterion("deduct_out_order_no like", value, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoNotLike(String value) {
            addCriterion("deduct_out_order_no not like", value, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoIn(List<String> values) {
            addCriterion("deduct_out_order_no in", values, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoNotIn(List<String> values) {
            addCriterion("deduct_out_order_no not in", values, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoBetween(String value1, String value2) {
            addCriterion("deduct_out_order_no between", value1, value2, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeductOutOrderNoNotBetween(String value1, String value2) {
            addCriterion("deduct_out_order_no not between", value1, value2, "deductOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNull() {
            addCriterion("deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(Long value) {
            addCriterion("deposit_amount =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(Long value) {
            addCriterion("deposit_amount <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(Long value) {
            addCriterion("deposit_amount >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("deposit_amount >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(Long value) {
            addCriterion("deposit_amount <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(Long value) {
            addCriterion("deposit_amount <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<Long> values) {
            addCriterion("deposit_amount in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<Long> values) {
            addCriterion("deposit_amount not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(Long value1, Long value2) {
            addCriterion("deposit_amount between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(Long value1, Long value2) {
            addCriterion("deposit_amount not between", value1, value2, "depositAmount");
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

        public Criteria andMerchantChargeAccNoIsNull() {
            addCriterion("merchant_charge_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoIsNotNull() {
            addCriterion("merchant_charge_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoEqualTo(String value) {
            addCriterion("merchant_charge_acc_no =", value, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoNotEqualTo(String value) {
            addCriterion("merchant_charge_acc_no <>", value, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoGreaterThan(String value) {
            addCriterion("merchant_charge_acc_no >", value, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_charge_acc_no >=", value, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoLessThan(String value) {
            addCriterion("merchant_charge_acc_no <", value, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_charge_acc_no <=", value, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoLike(String value) {
            addCriterion("merchant_charge_acc_no like", value, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoNotLike(String value) {
            addCriterion("merchant_charge_acc_no not like", value, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoIn(List<String> values) {
            addCriterion("merchant_charge_acc_no in", values, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoNotIn(List<String> values) {
            addCriterion("merchant_charge_acc_no not in", values, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoBetween(String value1, String value2) {
            addCriterion("merchant_charge_acc_no between", value1, value2, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAccNoNotBetween(String value1, String value2) {
            addCriterion("merchant_charge_acc_no not between", value1, value2, "merchantChargeAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountIsNull() {
            addCriterion("merchant_charge_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountIsNotNull() {
            addCriterion("merchant_charge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountEqualTo(Long value) {
            addCriterion("merchant_charge_amount =", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountNotEqualTo(Long value) {
            addCriterion("merchant_charge_amount <>", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountGreaterThan(Long value) {
            addCriterion("merchant_charge_amount >", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_charge_amount >=", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountLessThan(Long value) {
            addCriterion("merchant_charge_amount <", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("merchant_charge_amount <=", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountIn(List<Long> values) {
            addCriterion("merchant_charge_amount in", values, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountNotIn(List<Long> values) {
            addCriterion("merchant_charge_amount not in", values, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountBetween(Long value1, Long value2) {
            addCriterion("merchant_charge_amount between", value1, value2, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("merchant_charge_amount not between", value1, value2, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoIsNull() {
            addCriterion("merchant_custodia_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoIsNotNull() {
            addCriterion("merchant_custodia_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoEqualTo(String value) {
            addCriterion("merchant_custodia_acc_no =", value, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoNotEqualTo(String value) {
            addCriterion("merchant_custodia_acc_no <>", value, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoGreaterThan(String value) {
            addCriterion("merchant_custodia_acc_no >", value, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_custodia_acc_no >=", value, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoLessThan(String value) {
            addCriterion("merchant_custodia_acc_no <", value, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_custodia_acc_no <=", value, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoLike(String value) {
            addCriterion("merchant_custodia_acc_no like", value, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoNotLike(String value) {
            addCriterion("merchant_custodia_acc_no not like", value, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoIn(List<String> values) {
            addCriterion("merchant_custodia_acc_no in", values, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoNotIn(List<String> values) {
            addCriterion("merchant_custodia_acc_no not in", values, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoBetween(String value1, String value2) {
            addCriterion("merchant_custodia_acc_no between", value1, value2, "merchantCustodiaAccNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCustodiaAccNoNotBetween(String value1, String value2) {
            addCriterion("merchant_custodia_acc_no not between", value1, value2, "merchantCustodiaAccNo");
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(Long value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(Long value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(Long value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(Long value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(Long value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<Long> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<Long> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(Long value1, Long value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(Long value1, Long value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
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

        public Criteria andPayOutOrderNoIsNull() {
            addCriterion("pay_out_order_no is null");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoIsNotNull() {
            addCriterion("pay_out_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoEqualTo(String value) {
            addCriterion("pay_out_order_no =", value, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoNotEqualTo(String value) {
            addCriterion("pay_out_order_no <>", value, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoGreaterThan(String value) {
            addCriterion("pay_out_order_no >", value, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_out_order_no >=", value, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoLessThan(String value) {
            addCriterion("pay_out_order_no <", value, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoLessThanOrEqualTo(String value) {
            addCriterion("pay_out_order_no <=", value, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoLike(String value) {
            addCriterion("pay_out_order_no like", value, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoNotLike(String value) {
            addCriterion("pay_out_order_no not like", value, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoIn(List<String> values) {
            addCriterion("pay_out_order_no in", values, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoNotIn(List<String> values) {
            addCriterion("pay_out_order_no not in", values, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoBetween(String value1, String value2) {
            addCriterion("pay_out_order_no between", value1, value2, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayOutOrderNoNotBetween(String value1, String value2) {
            addCriterion("pay_out_order_no not between", value1, value2, "payOutOrderNo");
            return (Criteria) this;
        }

        public Criteria andPresentChannelIsNull() {
            addCriterion("present_channel is null");
            return (Criteria) this;
        }

        public Criteria andPresentChannelIsNotNull() {
            addCriterion("present_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPresentChannelEqualTo(String value) {
            addCriterion("present_channel =", value, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelNotEqualTo(String value) {
            addCriterion("present_channel <>", value, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelGreaterThan(String value) {
            addCriterion("present_channel >", value, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelGreaterThanOrEqualTo(String value) {
            addCriterion("present_channel >=", value, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelLessThan(String value) {
            addCriterion("present_channel <", value, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelLessThanOrEqualTo(String value) {
            addCriterion("present_channel <=", value, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelLike(String value) {
            addCriterion("present_channel like", value, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelNotLike(String value) {
            addCriterion("present_channel not like", value, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelIn(List<String> values) {
            addCriterion("present_channel in", values, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelNotIn(List<String> values) {
            addCriterion("present_channel not in", values, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelBetween(String value1, String value2) {
            addCriterion("present_channel between", value1, value2, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andPresentChannelNotBetween(String value1, String value2) {
            addCriterion("present_channel not between", value1, value2, "presentChannel");
            return (Criteria) this;
        }

        public Criteria andProtocolNoIsNull() {
            addCriterion("protocol_no is null");
            return (Criteria) this;
        }

        public Criteria andProtocolNoIsNotNull() {
            addCriterion("protocol_no is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolNoEqualTo(String value) {
            addCriterion("protocol_no =", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoNotEqualTo(String value) {
            addCriterion("protocol_no <>", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoGreaterThan(String value) {
            addCriterion("protocol_no >", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoGreaterThanOrEqualTo(String value) {
            addCriterion("protocol_no >=", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoLessThan(String value) {
            addCriterion("protocol_no <", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoLessThanOrEqualTo(String value) {
            addCriterion("protocol_no <=", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoLike(String value) {
            addCriterion("protocol_no like", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoNotLike(String value) {
            addCriterion("protocol_no not like", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoIn(List<String> values) {
            addCriterion("protocol_no in", values, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoNotIn(List<String> values) {
            addCriterion("protocol_no not in", values, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoBetween(String value1, String value2) {
            addCriterion("protocol_no between", value1, value2, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoNotBetween(String value1, String value2) {
            addCriterion("protocol_no not between", value1, value2, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoIsNull() {
            addCriterion("seller_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoIsNotNull() {
            addCriterion("seller_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoEqualTo(String value) {
            addCriterion("seller_acc_no =", value, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoNotEqualTo(String value) {
            addCriterion("seller_acc_no <>", value, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoGreaterThan(String value) {
            addCriterion("seller_acc_no >", value, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("seller_acc_no >=", value, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoLessThan(String value) {
            addCriterion("seller_acc_no <", value, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoLessThanOrEqualTo(String value) {
            addCriterion("seller_acc_no <=", value, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoLike(String value) {
            addCriterion("seller_acc_no like", value, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoNotLike(String value) {
            addCriterion("seller_acc_no not like", value, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoIn(List<String> values) {
            addCriterion("seller_acc_no in", values, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoNotIn(List<String> values) {
            addCriterion("seller_acc_no not in", values, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoBetween(String value1, String value2) {
            addCriterion("seller_acc_no between", value1, value2, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccNoNotBetween(String value1, String value2) {
            addCriterion("seller_acc_no not between", value1, value2, "sellerAccNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoIsNull() {
            addCriterion("seller_card_no is null");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoIsNotNull() {
            addCriterion("seller_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoEqualTo(String value) {
            addCriterion("seller_card_no =", value, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoNotEqualTo(String value) {
            addCriterion("seller_card_no <>", value, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoGreaterThan(String value) {
            addCriterion("seller_card_no >", value, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("seller_card_no >=", value, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoLessThan(String value) {
            addCriterion("seller_card_no <", value, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoLessThanOrEqualTo(String value) {
            addCriterion("seller_card_no <=", value, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoLike(String value) {
            addCriterion("seller_card_no like", value, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoNotLike(String value) {
            addCriterion("seller_card_no not like", value, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoIn(List<String> values) {
            addCriterion("seller_card_no in", values, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoNotIn(List<String> values) {
            addCriterion("seller_card_no not in", values, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoBetween(String value1, String value2) {
            addCriterion("seller_card_no between", value1, value2, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerCardNoNotBetween(String value1, String value2) {
            addCriterion("seller_card_no not between", value1, value2, "sellerCardNo");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountIsNull() {
            addCriterion("seller_charge_amount is null");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountIsNotNull() {
            addCriterion("seller_charge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountEqualTo(Long value) {
            addCriterion("seller_charge_amount =", value, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountNotEqualTo(Long value) {
            addCriterion("seller_charge_amount <>", value, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountGreaterThan(Long value) {
            addCriterion("seller_charge_amount >", value, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_charge_amount >=", value, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountLessThan(Long value) {
            addCriterion("seller_charge_amount <", value, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("seller_charge_amount <=", value, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountIn(List<Long> values) {
            addCriterion("seller_charge_amount in", values, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountNotIn(List<Long> values) {
            addCriterion("seller_charge_amount not in", values, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountBetween(Long value1, Long value2) {
            addCriterion("seller_charge_amount between", value1, value2, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerChargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("seller_charge_amount not between", value1, value2, "sellerChargeAmount");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdIsNull() {
            addCriterion("seller_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdIsNotNull() {
            addCriterion("seller_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdEqualTo(String value) {
            addCriterion("seller_user_id =", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdNotEqualTo(String value) {
            addCriterion("seller_user_id <>", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdGreaterThan(String value) {
            addCriterion("seller_user_id >", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_user_id >=", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdLessThan(String value) {
            addCriterion("seller_user_id <", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdLessThanOrEqualTo(String value) {
            addCriterion("seller_user_id <=", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdLike(String value) {
            addCriterion("seller_user_id like", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdNotLike(String value) {
            addCriterion("seller_user_id not like", value, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdIn(List<String> values) {
            addCriterion("seller_user_id in", values, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdNotIn(List<String> values) {
            addCriterion("seller_user_id not in", values, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdBetween(String value1, String value2) {
            addCriterion("seller_user_id between", value1, value2, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserIdNotBetween(String value1, String value2) {
            addCriterion("seller_user_id not between", value1, value2, "sellerUserId");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameIsNull() {
            addCriterion("seller_user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameIsNotNull() {
            addCriterion("seller_user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameEqualTo(String value) {
            addCriterion("seller_user_real_name =", value, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameNotEqualTo(String value) {
            addCriterion("seller_user_real_name <>", value, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameGreaterThan(String value) {
            addCriterion("seller_user_real_name >", value, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_user_real_name >=", value, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameLessThan(String value) {
            addCriterion("seller_user_real_name <", value, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("seller_user_real_name <=", value, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameLike(String value) {
            addCriterion("seller_user_real_name like", value, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameNotLike(String value) {
            addCriterion("seller_user_real_name not like", value, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameIn(List<String> values) {
            addCriterion("seller_user_real_name in", values, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameNotIn(List<String> values) {
            addCriterion("seller_user_real_name not in", values, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameBetween(String value1, String value2) {
            addCriterion("seller_user_real_name between", value1, value2, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSellerUserRealNameNotBetween(String value1, String value2) {
            addCriterion("seller_user_real_name not between", value1, value2, "sellerUserRealName");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoIsNull() {
            addCriterion("sub_protocol_no is null");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoIsNotNull() {
            addCriterion("sub_protocol_no is not null");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoEqualTo(String value) {
            addCriterion("sub_protocol_no =", value, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoNotEqualTo(String value) {
            addCriterion("sub_protocol_no <>", value, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoGreaterThan(String value) {
            addCriterion("sub_protocol_no >", value, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoGreaterThanOrEqualTo(String value) {
            addCriterion("sub_protocol_no >=", value, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoLessThan(String value) {
            addCriterion("sub_protocol_no <", value, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoLessThanOrEqualTo(String value) {
            addCriterion("sub_protocol_no <=", value, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoLike(String value) {
            addCriterion("sub_protocol_no like", value, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoNotLike(String value) {
            addCriterion("sub_protocol_no not like", value, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoIn(List<String> values) {
            addCriterion("sub_protocol_no in", values, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoNotIn(List<String> values) {
            addCriterion("sub_protocol_no not in", values, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoBetween(String value1, String value2) {
            addCriterion("sub_protocol_no between", value1, value2, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andSubProtocolNoNotBetween(String value1, String value2) {
            addCriterion("sub_protocol_no not between", value1, value2, "subProtocolNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsIsNull() {
            addCriterion("used_channels is null");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsIsNotNull() {
            addCriterion("used_channels is not null");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsEqualTo(String value) {
            addCriterion("used_channels =", value, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsNotEqualTo(String value) {
            addCriterion("used_channels <>", value, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsGreaterThan(String value) {
            addCriterion("used_channels >", value, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsGreaterThanOrEqualTo(String value) {
            addCriterion("used_channels >=", value, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsLessThan(String value) {
            addCriterion("used_channels <", value, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsLessThanOrEqualTo(String value) {
            addCriterion("used_channels <=", value, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsLike(String value) {
            addCriterion("used_channels like", value, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsNotLike(String value) {
            addCriterion("used_channels not like", value, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsIn(List<String> values) {
            addCriterion("used_channels in", values, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsNotIn(List<String> values) {
            addCriterion("used_channels not in", values, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsBetween(String value1, String value2) {
            addCriterion("used_channels between", value1, value2, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUsedChannelsNotBetween(String value1, String value2) {
            addCriterion("used_channels not between", value1, value2, "usedChannels");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountIsNull() {
            addCriterion("user_charge_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountIsNotNull() {
            addCriterion("user_charge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountEqualTo(Long value) {
            addCriterion("user_charge_amount =", value, "userChargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountNotEqualTo(Long value) {
            addCriterion("user_charge_amount <>", value, "userChargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountGreaterThan(Long value) {
            addCriterion("user_charge_amount >", value, "userChargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_charge_amount >=", value, "userChargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountLessThan(Long value) {
            addCriterion("user_charge_amount <", value, "userChargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("user_charge_amount <=", value, "userChargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountIn(List<Long> values) {
            addCriterion("user_charge_amount in", values, "userChargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountNotIn(List<Long> values) {
            addCriterion("user_charge_amount not in", values, "userChargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountBetween(Long value1, Long value2) {
            addCriterion("user_charge_amount between", value1, value2, "userChargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserChargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("user_charge_amount not between", value1, value2, "userChargeAmount");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table fast_trade
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
     * corresponds to the database table fast_trade
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