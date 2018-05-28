/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradeRefundInfoDOExample.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.doproject.commonproducts;

import com.yjf.common.lang.util.money.Money;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeRefundInfoDOExample {
    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    public TradeRefundInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table trade_refund_info
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
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table trade_refund_info
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
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> refundAmountCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            refundAmountCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getRefundAmountCriteria() {
            return refundAmountCriteria;
        }

        protected void addRefundAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            refundAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addRefundAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            refundAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || refundAmountCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(refundAmountCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoIsNull() {
            addCriterion("refund_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoIsNotNull() {
            addCriterion("refund_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoEqualTo(String value) {
            addCriterion("refund_biz_no =", value, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoNotEqualTo(String value) {
            addCriterion("refund_biz_no <>", value, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoGreaterThan(String value) {
            addCriterion("refund_biz_no >", value, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_biz_no >=", value, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoLessThan(String value) {
            addCriterion("refund_biz_no <", value, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoLessThanOrEqualTo(String value) {
            addCriterion("refund_biz_no <=", value, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoLike(String value) {
            addCriterion("refund_biz_no like", value, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoNotLike(String value) {
            addCriterion("refund_biz_no not like", value, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoIn(List<String> values) {
            addCriterion("refund_biz_no in", values, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoNotIn(List<String> values) {
            addCriterion("refund_biz_no not in", values, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoBetween(String value1, String value2) {
            addCriterion("refund_biz_no between", value1, value2, "refundBizNo");
            return (Criteria) this;
        }

        public Criteria andRefundBizNoNotBetween(String value1, String value2) {
            addCriterion("refund_biz_no not between", value1, value2, "refundBizNo");
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

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(Money value) {
            addRefundAmountCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(Money value) {
            addRefundAmountCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(Money value) {
            addRefundAmountCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(Money value) {
            addRefundAmountCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(Money value) {
            addRefundAmountCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(Money value) {
            addRefundAmountCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<Money> values) {
            addRefundAmountCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<Money> values) {
            addRefundAmountCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(Money value1, Money value2) {
            addRefundAmountCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(Money value1, Money value2) {
            addRefundAmountCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdIsNull() {
            addCriterion("buyer_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdIsNotNull() {
            addCriterion("buyer_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdEqualTo(String value) {
            addCriterion("buyer_user_id =", value, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdNotEqualTo(String value) {
            addCriterion("buyer_user_id <>", value, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdGreaterThan(String value) {
            addCriterion("buyer_user_id >", value, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_user_id >=", value, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdLessThan(String value) {
            addCriterion("buyer_user_id <", value, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdLessThanOrEqualTo(String value) {
            addCriterion("buyer_user_id <=", value, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdLike(String value) {
            addCriterion("buyer_user_id like", value, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdNotLike(String value) {
            addCriterion("buyer_user_id not like", value, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdIn(List<String> values) {
            addCriterion("buyer_user_id in", values, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdNotIn(List<String> values) {
            addCriterion("buyer_user_id not in", values, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdBetween(String value1, String value2) {
            addCriterion("buyer_user_id between", value1, value2, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andBuyerUserIdNotBetween(String value1, String value2) {
            addCriterion("buyer_user_id not between", value1, value2, "buyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdIsNull() {
            addCriterion("out_buyer_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdIsNotNull() {
            addCriterion("out_buyer_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdEqualTo(String value) {
            addCriterion("out_buyer_user_id =", value, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdNotEqualTo(String value) {
            addCriterion("out_buyer_user_id <>", value, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdGreaterThan(String value) {
            addCriterion("out_buyer_user_id >", value, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("out_buyer_user_id >=", value, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdLessThan(String value) {
            addCriterion("out_buyer_user_id <", value, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdLessThanOrEqualTo(String value) {
            addCriterion("out_buyer_user_id <=", value, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdLike(String value) {
            addCriterion("out_buyer_user_id like", value, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdNotLike(String value) {
            addCriterion("out_buyer_user_id not like", value, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdIn(List<String> values) {
            addCriterion("out_buyer_user_id in", values, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdNotIn(List<String> values) {
            addCriterion("out_buyer_user_id not in", values, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdBetween(String value1, String value2) {
            addCriterion("out_buyer_user_id between", value1, value2, "outBuyerUserId");
            return (Criteria) this;
        }

        public Criteria andOutBuyerUserIdNotBetween(String value1, String value2) {
            addCriterion("out_buyer_user_id not between", value1, value2, "outBuyerUserId");
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

        public Criteria andPayerUserIdIsNull() {
            addCriterion("payer_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdIsNotNull() {
            addCriterion("payer_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdEqualTo(String value) {
            addCriterion("payer_user_id =", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotEqualTo(String value) {
            addCriterion("payer_user_id <>", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdGreaterThan(String value) {
            addCriterion("payer_user_id >", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("payer_user_id >=", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdLessThan(String value) {
            addCriterion("payer_user_id <", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdLessThanOrEqualTo(String value) {
            addCriterion("payer_user_id <=", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdLike(String value) {
            addCriterion("payer_user_id like", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotLike(String value) {
            addCriterion("payer_user_id not like", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdIn(List<String> values) {
            addCriterion("payer_user_id in", values, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotIn(List<String> values) {
            addCriterion("payer_user_id not in", values, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdBetween(String value1, String value2) {
            addCriterion("payer_user_id between", value1, value2, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotBetween(String value1, String value2) {
            addCriterion("payer_user_id not between", value1, value2, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andUserEndIpIsNull() {
            addCriterion("user_end_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserEndIpIsNotNull() {
            addCriterion("user_end_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserEndIpEqualTo(String value) {
            addCriterion("user_end_ip =", value, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpNotEqualTo(String value) {
            addCriterion("user_end_ip <>", value, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpGreaterThan(String value) {
            addCriterion("user_end_ip >", value, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_end_ip >=", value, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpLessThan(String value) {
            addCriterion("user_end_ip <", value, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpLessThanOrEqualTo(String value) {
            addCriterion("user_end_ip <=", value, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpLike(String value) {
            addCriterion("user_end_ip like", value, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpNotLike(String value) {
            addCriterion("user_end_ip not like", value, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpIn(List<String> values) {
            addCriterion("user_end_ip in", values, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpNotIn(List<String> values) {
            addCriterion("user_end_ip not in", values, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpBetween(String value1, String value2) {
            addCriterion("user_end_ip between", value1, value2, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andUserEndIpNotBetween(String value1, String value2) {
            addCriterion("user_end_ip not between", value1, value2, "userEndIp");
            return (Criteria) this;
        }

        public Criteria andMacAddressIsNull() {
            addCriterion("mac_address is null");
            return (Criteria) this;
        }

        public Criteria andMacAddressIsNotNull() {
            addCriterion("mac_address is not null");
            return (Criteria) this;
        }

        public Criteria andMacAddressEqualTo(String value) {
            addCriterion("mac_address =", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotEqualTo(String value) {
            addCriterion("mac_address <>", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressGreaterThan(String value) {
            addCriterion("mac_address >", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mac_address >=", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLessThan(String value) {
            addCriterion("mac_address <", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLessThanOrEqualTo(String value) {
            addCriterion("mac_address <=", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLike(String value) {
            addCriterion("mac_address like", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotLike(String value) {
            addCriterion("mac_address not like", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressIn(List<String> values) {
            addCriterion("mac_address in", values, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotIn(List<String> values) {
            addCriterion("mac_address not in", values, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressBetween(String value1, String value2) {
            addCriterion("mac_address between", value1, value2, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotBetween(String value1, String value2) {
            addCriterion("mac_address not between", value1, value2, "macAddress");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeIsNull() {
            addCriterion("user_terminal_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeIsNotNull() {
            addCriterion("user_terminal_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeEqualTo(String value) {
            addCriterion("user_terminal_type =", value, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeNotEqualTo(String value) {
            addCriterion("user_terminal_type <>", value, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeGreaterThan(String value) {
            addCriterion("user_terminal_type >", value, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_terminal_type >=", value, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeLessThan(String value) {
            addCriterion("user_terminal_type <", value, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("user_terminal_type <=", value, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeLike(String value) {
            addCriterion("user_terminal_type like", value, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeNotLike(String value) {
            addCriterion("user_terminal_type not like", value, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeIn(List<String> values) {
            addCriterion("user_terminal_type in", values, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeNotIn(List<String> values) {
            addCriterion("user_terminal_type not in", values, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeBetween(String value1, String value2) {
            addCriterion("user_terminal_type between", value1, value2, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andUserTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("user_terminal_type not between", value1, value2, "userTerminalType");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(String value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(String value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(String value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(String value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLike(String value) {
            addCriterion("refund_status like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotLike(String value) {
            addCriterion("refund_status not like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<String> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<String> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(String value1, String value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(String value1, String value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundModeIsNull() {
            addCriterion("refund_mode is null");
            return (Criteria) this;
        }

        public Criteria andRefundModeIsNotNull() {
            addCriterion("refund_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRefundModeEqualTo(String value) {
            addCriterion("refund_mode =", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeNotEqualTo(String value) {
            addCriterion("refund_mode <>", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeGreaterThan(String value) {
            addCriterion("refund_mode >", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeGreaterThanOrEqualTo(String value) {
            addCriterion("refund_mode >=", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeLessThan(String value) {
            addCriterion("refund_mode <", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeLessThanOrEqualTo(String value) {
            addCriterion("refund_mode <=", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeLike(String value) {
            addCriterion("refund_mode like", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeNotLike(String value) {
            addCriterion("refund_mode not like", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeIn(List<String> values) {
            addCriterion("refund_mode in", values, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeNotIn(List<String> values) {
            addCriterion("refund_mode not in", values, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeBetween(String value1, String value2) {
            addCriterion("refund_mode between", value1, value2, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeNotBetween(String value1, String value2) {
            addCriterion("refund_mode not between", value1, value2, "refundMode");
            return (Criteria) this;
        }

        public Criteria andDataIndexIsNull() {
            addCriterion("data_index is null");
            return (Criteria) this;
        }

        public Criteria andDataIndexIsNotNull() {
            addCriterion("data_index is not null");
            return (Criteria) this;
        }

        public Criteria andDataIndexEqualTo(String value) {
            addCriterion("data_index =", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexNotEqualTo(String value) {
            addCriterion("data_index <>", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexGreaterThan(String value) {
            addCriterion("data_index >", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexGreaterThanOrEqualTo(String value) {
            addCriterion("data_index >=", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexLessThan(String value) {
            addCriterion("data_index <", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexLessThanOrEqualTo(String value) {
            addCriterion("data_index <=", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexLike(String value) {
            addCriterion("data_index like", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexNotLike(String value) {
            addCriterion("data_index not like", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexIn(List<String> values) {
            addCriterion("data_index in", values, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexNotIn(List<String> values) {
            addCriterion("data_index not in", values, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexBetween(String value1, String value2) {
            addCriterion("data_index between", value1, value2, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexNotBetween(String value1, String value2) {
            addCriterion("data_index not between", value1, value2, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoIsNull() {
            addCriterion("remittance_no is null");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoIsNotNull() {
            addCriterion("remittance_no is not null");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoEqualTo(String value) {
            addCriterion("remittance_no =", value, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoNotEqualTo(String value) {
            addCriterion("remittance_no <>", value, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoGreaterThan(String value) {
            addCriterion("remittance_no >", value, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoGreaterThanOrEqualTo(String value) {
            addCriterion("remittance_no >=", value, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoLessThan(String value) {
            addCriterion("remittance_no <", value, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoLessThanOrEqualTo(String value) {
            addCriterion("remittance_no <=", value, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoLike(String value) {
            addCriterion("remittance_no like", value, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoNotLike(String value) {
            addCriterion("remittance_no not like", value, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoIn(List<String> values) {
            addCriterion("remittance_no in", values, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoNotIn(List<String> values) {
            addCriterion("remittance_no not in", values, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoBetween(String value1, String value2) {
            addCriterion("remittance_no between", value1, value2, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andRemittanceNoNotBetween(String value1, String value2) {
            addCriterion("remittance_no not between", value1, value2, "remittanceNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoIsNull() {
            addCriterion("offline_withdraw_no is null");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoIsNotNull() {
            addCriterion("offline_withdraw_no is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoEqualTo(String value) {
            addCriterion("offline_withdraw_no =", value, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoNotEqualTo(String value) {
            addCriterion("offline_withdraw_no <>", value, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoGreaterThan(String value) {
            addCriterion("offline_withdraw_no >", value, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoGreaterThanOrEqualTo(String value) {
            addCriterion("offline_withdraw_no >=", value, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoLessThan(String value) {
            addCriterion("offline_withdraw_no <", value, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoLessThanOrEqualTo(String value) {
            addCriterion("offline_withdraw_no <=", value, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoLike(String value) {
            addCriterion("offline_withdraw_no like", value, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoNotLike(String value) {
            addCriterion("offline_withdraw_no not like", value, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoIn(List<String> values) {
            addCriterion("offline_withdraw_no in", values, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoNotIn(List<String> values) {
            addCriterion("offline_withdraw_no not in", values, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoBetween(String value1, String value2) {
            addCriterion("offline_withdraw_no between", value1, value2, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andOfflineWithdrawNoNotBetween(String value1, String value2) {
            addCriterion("offline_withdraw_no not between", value1, value2, "offlineWithdrawNo");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNull() {
            addCriterion("refund_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNotNull() {
            addCriterion("refund_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonEqualTo(String value) {
            addCriterion("refund_reason =", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotEqualTo(String value) {
            addCriterion("refund_reason <>", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThan(String value) {
            addCriterion("refund_reason >", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThanOrEqualTo(String value) {
            addCriterion("refund_reason >=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThan(String value) {
            addCriterion("refund_reason <", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThanOrEqualTo(String value) {
            addCriterion("refund_reason <=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLike(String value) {
            addCriterion("refund_reason like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotLike(String value) {
            addCriterion("refund_reason not like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIn(List<String> values) {
            addCriterion("refund_reason in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotIn(List<String> values) {
            addCriterion("refund_reason not in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonBetween(String value1, String value2) {
            addCriterion("refund_reason between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotBetween(String value1, String value2) {
            addCriterion("refund_reason not between", value1, value2, "refundReason");
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

        public Criteria andContainRefundShareIsNull() {
            addCriterion("contain_refund_share is null");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareIsNotNull() {
            addCriterion("contain_refund_share is not null");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareEqualTo(String value) {
            addCriterion("contain_refund_share =", value, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareNotEqualTo(String value) {
            addCriterion("contain_refund_share <>", value, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareGreaterThan(String value) {
            addCriterion("contain_refund_share >", value, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareGreaterThanOrEqualTo(String value) {
            addCriterion("contain_refund_share >=", value, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareLessThan(String value) {
            addCriterion("contain_refund_share <", value, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareLessThanOrEqualTo(String value) {
            addCriterion("contain_refund_share <=", value, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareLike(String value) {
            addCriterion("contain_refund_share like", value, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareNotLike(String value) {
            addCriterion("contain_refund_share not like", value, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareIn(List<String> values) {
            addCriterion("contain_refund_share in", values, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareNotIn(List<String> values) {
            addCriterion("contain_refund_share not in", values, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareBetween(String value1, String value2) {
            addCriterion("contain_refund_share between", value1, value2, "containRefundShare");
            return (Criteria) this;
        }

        public Criteria andContainRefundShareNotBetween(String value1, String value2) {
            addCriterion("contain_refund_share not between", value1, value2, "containRefundShare");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table trade_refund_info
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
     * corresponds to the database table trade_refund_info
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