/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ForeignPayDOExample.java
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

public class ForeignPayDOExample {
    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    public ForeignPayDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table foreign_pay
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
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table foreign_pay
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
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> tradeAmountCriteria;

        protected List<Criterion> buyerFeeCriteria;

        protected List<Criterion> partnerFeeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            tradeAmountCriteria = new ArrayList<Criterion>();
            buyerFeeCriteria = new ArrayList<Criterion>();
            partnerFeeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getTradeAmountCriteria() {
            return tradeAmountCriteria;
        }

        protected void addTradeAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            tradeAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addTradeAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            tradeAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getBuyerFeeCriteria() {
            return buyerFeeCriteria;
        }

        protected void addBuyerFeeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            buyerFeeCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addBuyerFeeCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            buyerFeeCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getPartnerFeeCriteria() {
            return partnerFeeCriteria;
        }

        protected void addPartnerFeeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            partnerFeeCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addPartnerFeeCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            partnerFeeCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || tradeAmountCriteria.size() > 0
                || buyerFeeCriteria.size() > 0
                || partnerFeeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(tradeAmountCriteria);
                allCriteria.addAll(buyerFeeCriteria);
                allCriteria.addAll(partnerFeeCriteria);
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

        public Criteria andTransferBackNoIsNull() {
            addCriterion("transfer_back_no is null");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoIsNotNull() {
            addCriterion("transfer_back_no is not null");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoEqualTo(String value) {
            addCriterion("transfer_back_no =", value, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoNotEqualTo(String value) {
            addCriterion("transfer_back_no <>", value, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoGreaterThan(String value) {
            addCriterion("transfer_back_no >", value, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_back_no >=", value, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoLessThan(String value) {
            addCriterion("transfer_back_no <", value, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoLessThanOrEqualTo(String value) {
            addCriterion("transfer_back_no <=", value, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoLike(String value) {
            addCriterion("transfer_back_no like", value, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoNotLike(String value) {
            addCriterion("transfer_back_no not like", value, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoIn(List<String> values) {
            addCriterion("transfer_back_no in", values, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoNotIn(List<String> values) {
            addCriterion("transfer_back_no not in", values, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoBetween(String value1, String value2) {
            addCriterion("transfer_back_no between", value1, value2, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andTransferBackNoNotBetween(String value1, String value2) {
            addCriterion("transfer_back_no not between", value1, value2, "transferBackNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoIsNull() {
            addCriterion("foreign_pay_no is null");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoIsNotNull() {
            addCriterion("foreign_pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoEqualTo(String value) {
            addCriterion("foreign_pay_no =", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoNotEqualTo(String value) {
            addCriterion("foreign_pay_no <>", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoGreaterThan(String value) {
            addCriterion("foreign_pay_no >", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("foreign_pay_no >=", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoLessThan(String value) {
            addCriterion("foreign_pay_no <", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoLessThanOrEqualTo(String value) {
            addCriterion("foreign_pay_no <=", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoLike(String value) {
            addCriterion("foreign_pay_no like", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoNotLike(String value) {
            addCriterion("foreign_pay_no not like", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoIn(List<String> values) {
            addCriterion("foreign_pay_no in", values, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoNotIn(List<String> values) {
            addCriterion("foreign_pay_no not in", values, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoBetween(String value1, String value2) {
            addCriterion("foreign_pay_no between", value1, value2, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoNotBetween(String value1, String value2) {
            addCriterion("foreign_pay_no not between", value1, value2, "foreignPayNo");
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

        public Criteria andTradeNameIsNull() {
            addCriterion("trade_name is null");
            return (Criteria) this;
        }

        public Criteria andTradeNameIsNotNull() {
            addCriterion("trade_name is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNameEqualTo(String value) {
            addCriterion("trade_name =", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotEqualTo(String value) {
            addCriterion("trade_name <>", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThan(String value) {
            addCriterion("trade_name >", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("trade_name >=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThan(String value) {
            addCriterion("trade_name <", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThanOrEqualTo(String value) {
            addCriterion("trade_name <=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLike(String value) {
            addCriterion("trade_name like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotLike(String value) {
            addCriterion("trade_name not like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameIn(List<String> values) {
            addCriterion("trade_name in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotIn(List<String> values) {
            addCriterion("trade_name not in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameBetween(String value1, String value2) {
            addCriterion("trade_name between", value1, value2, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotBetween(String value1, String value2) {
            addCriterion("trade_name not between", value1, value2, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(Money value) {
            addTradeAmountCriterion("trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(Money value) {
            addTradeAmountCriterion("trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(Money value) {
            addTradeAmountCriterion("trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(Money value) {
            addTradeAmountCriterion("trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(Money value) {
            addTradeAmountCriterion("trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(Money value) {
            addTradeAmountCriterion("trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<Money> values) {
            addTradeAmountCriterion("trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<Money> values) {
            addTradeAmountCriterion("trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(Money value1, Money value2) {
            addTradeAmountCriterion("trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(Money value1, Money value2) {
            addTradeAmountCriterion("trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeIsNull() {
            addCriterion("buyer_fee is null");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeIsNotNull() {
            addCriterion("buyer_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeEqualTo(Money value) {
            addBuyerFeeCriterion("buyer_fee =", value, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeNotEqualTo(Money value) {
            addBuyerFeeCriterion("buyer_fee <>", value, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeGreaterThan(Money value) {
            addBuyerFeeCriterion("buyer_fee >", value, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeGreaterThanOrEqualTo(Money value) {
            addBuyerFeeCriterion("buyer_fee >=", value, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeLessThan(Money value) {
            addBuyerFeeCriterion("buyer_fee <", value, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeLessThanOrEqualTo(Money value) {
            addBuyerFeeCriterion("buyer_fee <=", value, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeIn(List<Money> values) {
            addBuyerFeeCriterion("buyer_fee in", values, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeNotIn(List<Money> values) {
            addBuyerFeeCriterion("buyer_fee not in", values, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeBetween(Money value1, Money value2) {
            addBuyerFeeCriterion("buyer_fee between", value1, value2, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andBuyerFeeNotBetween(Money value1, Money value2) {
            addBuyerFeeCriterion("buyer_fee not between", value1, value2, "buyerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeIsNull() {
            addCriterion("partner_fee is null");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeIsNotNull() {
            addCriterion("partner_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeEqualTo(Money value) {
            addPartnerFeeCriterion("partner_fee =", value, "partnerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeNotEqualTo(Money value) {
            addPartnerFeeCriterion("partner_fee <>", value, "partnerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeGreaterThan(Money value) {
            addPartnerFeeCriterion("partner_fee >", value, "partnerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeGreaterThanOrEqualTo(Money value) {
            addPartnerFeeCriterion("partner_fee >=", value, "partnerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeLessThan(Money value) {
            addPartnerFeeCriterion("partner_fee <", value, "partnerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeLessThanOrEqualTo(Money value) {
            addPartnerFeeCriterion("partner_fee <=", value, "partnerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeIn(List<Money> values) {
            addPartnerFeeCriterion("partner_fee in", values, "partnerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeNotIn(List<Money> values) {
            addPartnerFeeCriterion("partner_fee not in", values, "partnerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeBetween(Money value1, Money value2) {
            addPartnerFeeCriterion("partner_fee between", value1, value2, "partnerFee");
            return (Criteria) this;
        }

        public Criteria andPartnerFeeNotBetween(Money value1, Money value2) {
            addPartnerFeeCriterion("partner_fee not between", value1, value2, "partnerFee");
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

        public Criteria andBuyerCardNoIsNull() {
            addCriterion("buyer_card_no is null");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoIsNotNull() {
            addCriterion("buyer_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoEqualTo(String value) {
            addCriterion("buyer_card_no =", value, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoNotEqualTo(String value) {
            addCriterion("buyer_card_no <>", value, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoGreaterThan(String value) {
            addCriterion("buyer_card_no >", value, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_card_no >=", value, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoLessThan(String value) {
            addCriterion("buyer_card_no <", value, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoLessThanOrEqualTo(String value) {
            addCriterion("buyer_card_no <=", value, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoLike(String value) {
            addCriterion("buyer_card_no like", value, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoNotLike(String value) {
            addCriterion("buyer_card_no not like", value, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoIn(List<String> values) {
            addCriterion("buyer_card_no in", values, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoNotIn(List<String> values) {
            addCriterion("buyer_card_no not in", values, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoBetween(String value1, String value2) {
            addCriterion("buyer_card_no between", value1, value2, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNoNotBetween(String value1, String value2) {
            addCriterion("buyer_card_no not between", value1, value2, "buyerCardNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoIsNull() {
            addCriterion("buyer_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoIsNotNull() {
            addCriterion("buyer_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoEqualTo(String value) {
            addCriterion("buyer_acc_no =", value, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoNotEqualTo(String value) {
            addCriterion("buyer_acc_no <>", value, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoGreaterThan(String value) {
            addCriterion("buyer_acc_no >", value, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_acc_no >=", value, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoLessThan(String value) {
            addCriterion("buyer_acc_no <", value, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoLessThanOrEqualTo(String value) {
            addCriterion("buyer_acc_no <=", value, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoLike(String value) {
            addCriterion("buyer_acc_no like", value, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoNotLike(String value) {
            addCriterion("buyer_acc_no not like", value, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoIn(List<String> values) {
            addCriterion("buyer_acc_no in", values, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoNotIn(List<String> values) {
            addCriterion("buyer_acc_no not in", values, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoBetween(String value1, String value2) {
            addCriterion("buyer_acc_no between", value1, value2, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerAccNoNotBetween(String value1, String value2) {
            addCriterion("buyer_acc_no not between", value1, value2, "buyerAccNo");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameIsNull() {
            addCriterion("buyer_real_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameIsNotNull() {
            addCriterion("buyer_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameEqualTo(String value) {
            addCriterion("buyer_real_name =", value, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameNotEqualTo(String value) {
            addCriterion("buyer_real_name <>", value, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameGreaterThan(String value) {
            addCriterion("buyer_real_name >", value, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_real_name >=", value, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameLessThan(String value) {
            addCriterion("buyer_real_name <", value, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_real_name <=", value, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameLike(String value) {
            addCriterion("buyer_real_name like", value, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameNotLike(String value) {
            addCriterion("buyer_real_name not like", value, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameIn(List<String> values) {
            addCriterion("buyer_real_name in", values, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameNotIn(List<String> values) {
            addCriterion("buyer_real_name not in", values, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameBetween(String value1, String value2) {
            addCriterion("buyer_real_name between", value1, value2, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andBuyerRealNameNotBetween(String value1, String value2) {
            addCriterion("buyer_real_name not between", value1, value2, "buyerRealName");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoIsNull() {
            addCriterion("supervision_acc_no is null");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoIsNotNull() {
            addCriterion("supervision_acc_no is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoEqualTo(String value) {
            addCriterion("supervision_acc_no =", value, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoNotEqualTo(String value) {
            addCriterion("supervision_acc_no <>", value, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoGreaterThan(String value) {
            addCriterion("supervision_acc_no >", value, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("supervision_acc_no >=", value, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoLessThan(String value) {
            addCriterion("supervision_acc_no <", value, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoLessThanOrEqualTo(String value) {
            addCriterion("supervision_acc_no <=", value, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoLike(String value) {
            addCriterion("supervision_acc_no like", value, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoNotLike(String value) {
            addCriterion("supervision_acc_no not like", value, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoIn(List<String> values) {
            addCriterion("supervision_acc_no in", values, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoNotIn(List<String> values) {
            addCriterion("supervision_acc_no not in", values, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoBetween(String value1, String value2) {
            addCriterion("supervision_acc_no between", value1, value2, "supervisionAccNo");
            return (Criteria) this;
        }

        public Criteria andSupervisionAccNoNotBetween(String value1, String value2) {
            addCriterion("supervision_acc_no not between", value1, value2, "supervisionAccNo");
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

        public Criteria andSellerRealNameIsNull() {
            addCriterion("seller_real_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameIsNotNull() {
            addCriterion("seller_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameEqualTo(String value) {
            addCriterion("seller_real_name =", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameNotEqualTo(String value) {
            addCriterion("seller_real_name <>", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameGreaterThan(String value) {
            addCriterion("seller_real_name >", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_real_name >=", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameLessThan(String value) {
            addCriterion("seller_real_name <", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameLessThanOrEqualTo(String value) {
            addCriterion("seller_real_name <=", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameLike(String value) {
            addCriterion("seller_real_name like", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameNotLike(String value) {
            addCriterion("seller_real_name not like", value, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameIn(List<String> values) {
            addCriterion("seller_real_name in", values, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameNotIn(List<String> values) {
            addCriterion("seller_real_name not in", values, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameBetween(String value1, String value2) {
            addCriterion("seller_real_name between", value1, value2, "sellerRealName");
            return (Criteria) this;
        }

        public Criteria andSellerRealNameNotBetween(String value1, String value2) {
            addCriterion("seller_real_name not between", value1, value2, "sellerRealName");
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

        public Criteria andIbanNoIsNull() {
            addCriterion("iban_no is null");
            return (Criteria) this;
        }

        public Criteria andIbanNoIsNotNull() {
            addCriterion("iban_no is not null");
            return (Criteria) this;
        }

        public Criteria andIbanNoEqualTo(String value) {
            addCriterion("iban_no =", value, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoNotEqualTo(String value) {
            addCriterion("iban_no <>", value, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoGreaterThan(String value) {
            addCriterion("iban_no >", value, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoGreaterThanOrEqualTo(String value) {
            addCriterion("iban_no >=", value, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoLessThan(String value) {
            addCriterion("iban_no <", value, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoLessThanOrEqualTo(String value) {
            addCriterion("iban_no <=", value, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoLike(String value) {
            addCriterion("iban_no like", value, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoNotLike(String value) {
            addCriterion("iban_no not like", value, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoIn(List<String> values) {
            addCriterion("iban_no in", values, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoNotIn(List<String> values) {
            addCriterion("iban_no not in", values, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoBetween(String value1, String value2) {
            addCriterion("iban_no between", value1, value2, "ibanNo");
            return (Criteria) this;
        }

        public Criteria andIbanNoNotBetween(String value1, String value2) {
            addCriterion("iban_no not between", value1, value2, "ibanNo");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table foreign_pay
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
     * corresponds to the database table foreign_pay
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