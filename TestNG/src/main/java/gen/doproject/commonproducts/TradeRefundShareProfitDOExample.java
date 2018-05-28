/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradeRefundShareProfitDOExample.java
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

public class TradeRefundShareProfitDOExample {
    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    public TradeRefundShareProfitDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table trade_refund_share_profit
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
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table trade_refund_share_profit
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
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> shareRefundAmountCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            shareRefundAmountCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getShareRefundAmountCriteria() {
            return shareRefundAmountCriteria;
        }

        protected void addShareRefundAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            shareRefundAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addShareRefundAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            shareRefundAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || shareRefundAmountCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(shareRefundAmountCriteria);
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

        public Criteria andShareRefundBizNoIsNull() {
            addCriterion("share_refund_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoIsNotNull() {
            addCriterion("share_refund_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoEqualTo(String value) {
            addCriterion("share_refund_biz_no =", value, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoNotEqualTo(String value) {
            addCriterion("share_refund_biz_no <>", value, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoGreaterThan(String value) {
            addCriterion("share_refund_biz_no >", value, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("share_refund_biz_no >=", value, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoLessThan(String value) {
            addCriterion("share_refund_biz_no <", value, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoLessThanOrEqualTo(String value) {
            addCriterion("share_refund_biz_no <=", value, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoLike(String value) {
            addCriterion("share_refund_biz_no like", value, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoNotLike(String value) {
            addCriterion("share_refund_biz_no not like", value, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoIn(List<String> values) {
            addCriterion("share_refund_biz_no in", values, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoNotIn(List<String> values) {
            addCriterion("share_refund_biz_no not in", values, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoBetween(String value1, String value2) {
            addCriterion("share_refund_biz_no between", value1, value2, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundBizNoNotBetween(String value1, String value2) {
            addCriterion("share_refund_biz_no not between", value1, value2, "shareRefundBizNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoIsNull() {
            addCriterion("transfer_no is null");
            return (Criteria) this;
        }

        public Criteria andTransferNoIsNotNull() {
            addCriterion("transfer_no is not null");
            return (Criteria) this;
        }

        public Criteria andTransferNoEqualTo(String value) {
            addCriterion("transfer_no =", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoNotEqualTo(String value) {
            addCriterion("transfer_no <>", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoGreaterThan(String value) {
            addCriterion("transfer_no >", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_no >=", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoLessThan(String value) {
            addCriterion("transfer_no <", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoLessThanOrEqualTo(String value) {
            addCriterion("transfer_no <=", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoLike(String value) {
            addCriterion("transfer_no like", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoNotLike(String value) {
            addCriterion("transfer_no not like", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoIn(List<String> values) {
            addCriterion("transfer_no in", values, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoNotIn(List<String> values) {
            addCriterion("transfer_no not in", values, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoBetween(String value1, String value2) {
            addCriterion("transfer_no between", value1, value2, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoNotBetween(String value1, String value2) {
            addCriterion("transfer_no not between", value1, value2, "transferNo");
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

        public Criteria andPayerCardNoIsNull() {
            addCriterion("payer_card_no is null");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoIsNotNull() {
            addCriterion("payer_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoEqualTo(String value) {
            addCriterion("payer_card_no =", value, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoNotEqualTo(String value) {
            addCriterion("payer_card_no <>", value, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoGreaterThan(String value) {
            addCriterion("payer_card_no >", value, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("payer_card_no >=", value, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoLessThan(String value) {
            addCriterion("payer_card_no <", value, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoLessThanOrEqualTo(String value) {
            addCriterion("payer_card_no <=", value, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoLike(String value) {
            addCriterion("payer_card_no like", value, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoNotLike(String value) {
            addCriterion("payer_card_no not like", value, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoIn(List<String> values) {
            addCriterion("payer_card_no in", values, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoNotIn(List<String> values) {
            addCriterion("payer_card_no not in", values, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoBetween(String value1, String value2) {
            addCriterion("payer_card_no between", value1, value2, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerCardNoNotBetween(String value1, String value2) {
            addCriterion("payer_card_no not between", value1, value2, "payerCardNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoIsNull() {
            addCriterion("payer_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoIsNotNull() {
            addCriterion("payer_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoEqualTo(String value) {
            addCriterion("payer_acc_no =", value, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoNotEqualTo(String value) {
            addCriterion("payer_acc_no <>", value, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoGreaterThan(String value) {
            addCriterion("payer_acc_no >", value, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("payer_acc_no >=", value, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoLessThan(String value) {
            addCriterion("payer_acc_no <", value, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoLessThanOrEqualTo(String value) {
            addCriterion("payer_acc_no <=", value, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoLike(String value) {
            addCriterion("payer_acc_no like", value, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoNotLike(String value) {
            addCriterion("payer_acc_no not like", value, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoIn(List<String> values) {
            addCriterion("payer_acc_no in", values, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoNotIn(List<String> values) {
            addCriterion("payer_acc_no not in", values, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoBetween(String value1, String value2) {
            addCriterion("payer_acc_no between", value1, value2, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayerAccNoNotBetween(String value1, String value2) {
            addCriterion("payer_acc_no not between", value1, value2, "payerAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdIsNull() {
            addCriterion("payee_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdIsNotNull() {
            addCriterion("payee_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdEqualTo(String value) {
            addCriterion("payee_user_id =", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotEqualTo(String value) {
            addCriterion("payee_user_id <>", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdGreaterThan(String value) {
            addCriterion("payee_user_id >", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("payee_user_id >=", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdLessThan(String value) {
            addCriterion("payee_user_id <", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdLessThanOrEqualTo(String value) {
            addCriterion("payee_user_id <=", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdLike(String value) {
            addCriterion("payee_user_id like", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotLike(String value) {
            addCriterion("payee_user_id not like", value, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdIn(List<String> values) {
            addCriterion("payee_user_id in", values, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotIn(List<String> values) {
            addCriterion("payee_user_id not in", values, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdBetween(String value1, String value2) {
            addCriterion("payee_user_id between", value1, value2, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeUserIdNotBetween(String value1, String value2) {
            addCriterion("payee_user_id not between", value1, value2, "payeeUserId");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoIsNull() {
            addCriterion("payee_card_no is null");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoIsNotNull() {
            addCriterion("payee_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoEqualTo(String value) {
            addCriterion("payee_card_no =", value, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoNotEqualTo(String value) {
            addCriterion("payee_card_no <>", value, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoGreaterThan(String value) {
            addCriterion("payee_card_no >", value, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("payee_card_no >=", value, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoLessThan(String value) {
            addCriterion("payee_card_no <", value, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoLessThanOrEqualTo(String value) {
            addCriterion("payee_card_no <=", value, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoLike(String value) {
            addCriterion("payee_card_no like", value, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoNotLike(String value) {
            addCriterion("payee_card_no not like", value, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoIn(List<String> values) {
            addCriterion("payee_card_no in", values, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoNotIn(List<String> values) {
            addCriterion("payee_card_no not in", values, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoBetween(String value1, String value2) {
            addCriterion("payee_card_no between", value1, value2, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeCardNoNotBetween(String value1, String value2) {
            addCriterion("payee_card_no not between", value1, value2, "payeeCardNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoIsNull() {
            addCriterion("payee_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoIsNotNull() {
            addCriterion("payee_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoEqualTo(String value) {
            addCriterion("payee_acc_no =", value, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoNotEqualTo(String value) {
            addCriterion("payee_acc_no <>", value, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoGreaterThan(String value) {
            addCriterion("payee_acc_no >", value, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("payee_acc_no >=", value, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoLessThan(String value) {
            addCriterion("payee_acc_no <", value, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoLessThanOrEqualTo(String value) {
            addCriterion("payee_acc_no <=", value, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoLike(String value) {
            addCriterion("payee_acc_no like", value, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoNotLike(String value) {
            addCriterion("payee_acc_no not like", value, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoIn(List<String> values) {
            addCriterion("payee_acc_no in", values, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoNotIn(List<String> values) {
            addCriterion("payee_acc_no not in", values, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoBetween(String value1, String value2) {
            addCriterion("payee_acc_no between", value1, value2, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNoNotBetween(String value1, String value2) {
            addCriterion("payee_acc_no not between", value1, value2, "payeeAccNo");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountIsNull() {
            addCriterion("share_refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountIsNotNull() {
            addCriterion("share_refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountEqualTo(Money value) {
            addShareRefundAmountCriterion("share_refund_amount =", value, "shareRefundAmount");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountNotEqualTo(Money value) {
            addShareRefundAmountCriterion("share_refund_amount <>", value, "shareRefundAmount");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountGreaterThan(Money value) {
            addShareRefundAmountCriterion("share_refund_amount >", value, "shareRefundAmount");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountGreaterThanOrEqualTo(Money value) {
            addShareRefundAmountCriterion("share_refund_amount >=", value, "shareRefundAmount");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountLessThan(Money value) {
            addShareRefundAmountCriterion("share_refund_amount <", value, "shareRefundAmount");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountLessThanOrEqualTo(Money value) {
            addShareRefundAmountCriterion("share_refund_amount <=", value, "shareRefundAmount");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountIn(List<Money> values) {
            addShareRefundAmountCriterion("share_refund_amount in", values, "shareRefundAmount");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountNotIn(List<Money> values) {
            addShareRefundAmountCriterion("share_refund_amount not in", values, "shareRefundAmount");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountBetween(Money value1, Money value2) {
            addShareRefundAmountCriterion("share_refund_amount between", value1, value2, "shareRefundAmount");
            return (Criteria) this;
        }

        public Criteria andShareRefundAmountNotBetween(Money value1, Money value2) {
            addShareRefundAmountCriterion("share_refund_amount not between", value1, value2, "shareRefundAmount");
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
    }

    /**
     * corresponds to the database table trade_refund_share_profit
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
     * corresponds to the database table trade_refund_share_profit
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