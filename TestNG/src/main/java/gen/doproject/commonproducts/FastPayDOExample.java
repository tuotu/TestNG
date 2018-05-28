/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayDOExample.java
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

public class FastPayDOExample {
    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    public FastPayDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table fast_pay
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
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table fast_pay
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
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> tradeAmountCriteria;

        protected List<Criterion> foreignAmountCriteria;

        protected List<Criterion> shareAmountCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            tradeAmountCriteria = new ArrayList<Criterion>();
            foreignAmountCriteria = new ArrayList<Criterion>();
            shareAmountCriteria = new ArrayList<Criterion>();
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

        public List<Criterion> getForeignAmountCriteria() {
            return foreignAmountCriteria;
        }

        protected void addForeignAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            foreignAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addForeignAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            foreignAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getShareAmountCriteria() {
            return shareAmountCriteria;
        }

        protected void addShareAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            shareAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addShareAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            shareAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || tradeAmountCriteria.size() > 0
                || foreignAmountCriteria.size() > 0
                || shareAmountCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(tradeAmountCriteria);
                allCriteria.addAll(foreignAmountCriteria);
                allCriteria.addAll(shareAmountCriteria);
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

        public Criteria andNationalTypeIsNull() {
            addCriterion("national_type is null");
            return (Criteria) this;
        }

        public Criteria andNationalTypeIsNotNull() {
            addCriterion("national_type is not null");
            return (Criteria) this;
        }

        public Criteria andNationalTypeEqualTo(String value) {
            addCriterion("national_type =", value, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeNotEqualTo(String value) {
            addCriterion("national_type <>", value, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeGreaterThan(String value) {
            addCriterion("national_type >", value, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("national_type >=", value, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeLessThan(String value) {
            addCriterion("national_type <", value, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeLessThanOrEqualTo(String value) {
            addCriterion("national_type <=", value, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeLike(String value) {
            addCriterion("national_type like", value, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeNotLike(String value) {
            addCriterion("national_type not like", value, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeIn(List<String> values) {
            addCriterion("national_type in", values, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeNotIn(List<String> values) {
            addCriterion("national_type not in", values, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeBetween(String value1, String value2) {
            addCriterion("national_type between", value1, value2, "nationalType");
            return (Criteria) this;
        }

        public Criteria andNationalTypeNotBetween(String value1, String value2) {
            addCriterion("national_type not between", value1, value2, "nationalType");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNull() {
            addCriterion("pay_mode is null");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNotNull() {
            addCriterion("pay_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeEqualTo(String value) {
            addCriterion("pay_mode =", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotEqualTo(String value) {
            addCriterion("pay_mode <>", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThan(String value) {
            addCriterion("pay_mode >", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_mode >=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThan(String value) {
            addCriterion("pay_mode <", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThanOrEqualTo(String value) {
            addCriterion("pay_mode <=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLike(String value) {
            addCriterion("pay_mode like", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotLike(String value) {
            addCriterion("pay_mode not like", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeIn(List<String> values) {
            addCriterion("pay_mode in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotIn(List<String> values) {
            addCriterion("pay_mode not in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeBetween(String value1, String value2) {
            addCriterion("pay_mode between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotBetween(String value1, String value2) {
            addCriterion("pay_mode not between", value1, value2, "payMode");
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

        public Criteria andAutoCloseDurationIsNull() {
            addCriterion("auto_close_duration is null");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationIsNotNull() {
            addCriterion("auto_close_duration is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationEqualTo(Long value) {
            addCriterion("auto_close_duration =", value, "autoCloseDuration");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationNotEqualTo(Long value) {
            addCriterion("auto_close_duration <>", value, "autoCloseDuration");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationGreaterThan(Long value) {
            addCriterion("auto_close_duration >", value, "autoCloseDuration");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("auto_close_duration >=", value, "autoCloseDuration");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationLessThan(Long value) {
            addCriterion("auto_close_duration <", value, "autoCloseDuration");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationLessThanOrEqualTo(Long value) {
            addCriterion("auto_close_duration <=", value, "autoCloseDuration");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationIn(List<Long> values) {
            addCriterion("auto_close_duration in", values, "autoCloseDuration");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationNotIn(List<Long> values) {
            addCriterion("auto_close_duration not in", values, "autoCloseDuration");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationBetween(Long value1, Long value2) {
            addCriterion("auto_close_duration between", value1, value2, "autoCloseDuration");
            return (Criteria) this;
        }

        public Criteria andAutoCloseDurationNotBetween(Long value1, Long value2) {
            addCriterion("auto_close_duration not between", value1, value2, "autoCloseDuration");
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

        public Criteria andOutUserIdIsNull() {
            addCriterion("out_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIsNotNull() {
            addCriterion("out_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutUserIdEqualTo(String value) {
            addCriterion("out_user_id =", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotEqualTo(String value) {
            addCriterion("out_user_id <>", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdGreaterThan(String value) {
            addCriterion("out_user_id >", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("out_user_id >=", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdLessThan(String value) {
            addCriterion("out_user_id <", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdLessThanOrEqualTo(String value) {
            addCriterion("out_user_id <=", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdLike(String value) {
            addCriterion("out_user_id like", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotLike(String value) {
            addCriterion("out_user_id not like", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIn(List<String> values) {
            addCriterion("out_user_id in", values, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotIn(List<String> values) {
            addCriterion("out_user_id not in", values, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdBetween(String value1, String value2) {
            addCriterion("out_user_id between", value1, value2, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotBetween(String value1, String value2) {
            addCriterion("out_user_id not between", value1, value2, "outUserId");
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

        public Criteria andBuyerOrgNameIsNull() {
            addCriterion("buyer_org_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameIsNotNull() {
            addCriterion("buyer_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameEqualTo(String value) {
            addCriterion("buyer_org_name =", value, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameNotEqualTo(String value) {
            addCriterion("buyer_org_name <>", value, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameGreaterThan(String value) {
            addCriterion("buyer_org_name >", value, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_org_name >=", value, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameLessThan(String value) {
            addCriterion("buyer_org_name <", value, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_org_name <=", value, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameLike(String value) {
            addCriterion("buyer_org_name like", value, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameNotLike(String value) {
            addCriterion("buyer_org_name not like", value, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameIn(List<String> values) {
            addCriterion("buyer_org_name in", values, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameNotIn(List<String> values) {
            addCriterion("buyer_org_name not in", values, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameBetween(String value1, String value2) {
            addCriterion("buyer_org_name between", value1, value2, "buyerOrgName");
            return (Criteria) this;
        }

        public Criteria andBuyerOrgNameNotBetween(String value1, String value2) {
            addCriterion("buyer_org_name not between", value1, value2, "buyerOrgName");
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

        public Criteria andSellerOrgNameIsNull() {
            addCriterion("seller_org_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameIsNotNull() {
            addCriterion("seller_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameEqualTo(String value) {
            addCriterion("seller_org_name =", value, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameNotEqualTo(String value) {
            addCriterion("seller_org_name <>", value, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameGreaterThan(String value) {
            addCriterion("seller_org_name >", value, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_org_name >=", value, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameLessThan(String value) {
            addCriterion("seller_org_name <", value, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameLessThanOrEqualTo(String value) {
            addCriterion("seller_org_name <=", value, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameLike(String value) {
            addCriterion("seller_org_name like", value, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameNotLike(String value) {
            addCriterion("seller_org_name not like", value, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameIn(List<String> values) {
            addCriterion("seller_org_name in", values, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameNotIn(List<String> values) {
            addCriterion("seller_org_name not in", values, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameBetween(String value1, String value2) {
            addCriterion("seller_org_name between", value1, value2, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerOrgNameNotBetween(String value1, String value2) {
            addCriterion("seller_org_name not between", value1, value2, "sellerOrgName");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoIsNull() {
            addCriterion("seller_bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoIsNotNull() {
            addCriterion("seller_bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoEqualTo(String value) {
            addCriterion("seller_bank_account_no =", value, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoNotEqualTo(String value) {
            addCriterion("seller_bank_account_no <>", value, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoGreaterThan(String value) {
            addCriterion("seller_bank_account_no >", value, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("seller_bank_account_no >=", value, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoLessThan(String value) {
            addCriterion("seller_bank_account_no <", value, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoLessThanOrEqualTo(String value) {
            addCriterion("seller_bank_account_no <=", value, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoLike(String value) {
            addCriterion("seller_bank_account_no like", value, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoNotLike(String value) {
            addCriterion("seller_bank_account_no not like", value, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoIn(List<String> values) {
            addCriterion("seller_bank_account_no in", values, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoNotIn(List<String> values) {
            addCriterion("seller_bank_account_no not in", values, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoBetween(String value1, String value2) {
            addCriterion("seller_bank_account_no between", value1, value2, "sellerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerBankAccountNoNotBetween(String value1, String value2) {
            addCriterion("seller_bank_account_no not between", value1, value2, "sellerBankAccountNo");
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

        public Criteria andForeignAmountIsNull() {
            addCriterion("foreign_amount is null");
            return (Criteria) this;
        }

        public Criteria andForeignAmountIsNotNull() {
            addCriterion("foreign_amount is not null");
            return (Criteria) this;
        }

        public Criteria andForeignAmountEqualTo(Money value) {
            addForeignAmountCriterion("foreign_amount =", value, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignAmountNotEqualTo(Money value) {
            addForeignAmountCriterion("foreign_amount <>", value, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignAmountGreaterThan(Money value) {
            addForeignAmountCriterion("foreign_amount >", value, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignAmountGreaterThanOrEqualTo(Money value) {
            addForeignAmountCriterion("foreign_amount >=", value, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignAmountLessThan(Money value) {
            addForeignAmountCriterion("foreign_amount <", value, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignAmountLessThanOrEqualTo(Money value) {
            addForeignAmountCriterion("foreign_amount <=", value, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignAmountIn(List<Money> values) {
            addForeignAmountCriterion("foreign_amount in", values, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignAmountNotIn(List<Money> values) {
            addForeignAmountCriterion("foreign_amount not in", values, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignAmountBetween(Money value1, Money value2) {
            addForeignAmountCriterion("foreign_amount between", value1, value2, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignAmountNotBetween(Money value1, Money value2) {
            addForeignAmountCriterion("foreign_amount not between", value1, value2, "foreignAmount");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyIsNull() {
            addCriterion("foreign_currency is null");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyIsNotNull() {
            addCriterion("foreign_currency is not null");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyEqualTo(String value) {
            addCriterion("foreign_currency =", value, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyNotEqualTo(String value) {
            addCriterion("foreign_currency <>", value, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyGreaterThan(String value) {
            addCriterion("foreign_currency >", value, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("foreign_currency >=", value, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyLessThan(String value) {
            addCriterion("foreign_currency <", value, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyLessThanOrEqualTo(String value) {
            addCriterion("foreign_currency <=", value, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyLike(String value) {
            addCriterion("foreign_currency like", value, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyNotLike(String value) {
            addCriterion("foreign_currency not like", value, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyIn(List<String> values) {
            addCriterion("foreign_currency in", values, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyNotIn(List<String> values) {
            addCriterion("foreign_currency not in", values, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyBetween(String value1, String value2) {
            addCriterion("foreign_currency between", value1, value2, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andForeignCurrencyNotBetween(String value1, String value2) {
            addCriterion("foreign_currency not between", value1, value2, "foreignCurrency");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andShareAmountIsNull() {
            addCriterion("share_amount is null");
            return (Criteria) this;
        }

        public Criteria andShareAmountIsNotNull() {
            addCriterion("share_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShareAmountEqualTo(Money value) {
            addShareAmountCriterion("share_amount =", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountNotEqualTo(Money value) {
            addShareAmountCriterion("share_amount <>", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountGreaterThan(Money value) {
            addShareAmountCriterion("share_amount >", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountGreaterThanOrEqualTo(Money value) {
            addShareAmountCriterion("share_amount >=", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountLessThan(Money value) {
            addShareAmountCriterion("share_amount <", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountLessThanOrEqualTo(Money value) {
            addShareAmountCriterion("share_amount <=", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountIn(List<Money> values) {
            addShareAmountCriterion("share_amount in", values, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountNotIn(List<Money> values) {
            addShareAmountCriterion("share_amount not in", values, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountBetween(Money value1, Money value2) {
            addShareAmountCriterion("share_amount between", value1, value2, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountNotBetween(Money value1, Money value2) {
            addShareAmountCriterion("share_amount not between", value1, value2, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andPactNoIsNull() {
            addCriterion("pact_no is null");
            return (Criteria) this;
        }

        public Criteria andPactNoIsNotNull() {
            addCriterion("pact_no is not null");
            return (Criteria) this;
        }

        public Criteria andPactNoEqualTo(String value) {
            addCriterion("pact_no =", value, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoNotEqualTo(String value) {
            addCriterion("pact_no <>", value, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoGreaterThan(String value) {
            addCriterion("pact_no >", value, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoGreaterThanOrEqualTo(String value) {
            addCriterion("pact_no >=", value, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoLessThan(String value) {
            addCriterion("pact_no <", value, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoLessThanOrEqualTo(String value) {
            addCriterion("pact_no <=", value, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoLike(String value) {
            addCriterion("pact_no like", value, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoNotLike(String value) {
            addCriterion("pact_no not like", value, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoIn(List<String> values) {
            addCriterion("pact_no in", values, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoNotIn(List<String> values) {
            addCriterion("pact_no not in", values, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoBetween(String value1, String value2) {
            addCriterion("pact_no between", value1, value2, "pactNo");
            return (Criteria) this;
        }

        public Criteria andPactNoNotBetween(String value1, String value2) {
            addCriterion("pact_no not between", value1, value2, "pactNo");
            return (Criteria) this;
        }

        public Criteria andHasRefundIsNull() {
            addCriterion("has_refund is null");
            return (Criteria) this;
        }

        public Criteria andHasRefundIsNotNull() {
            addCriterion("has_refund is not null");
            return (Criteria) this;
        }

        public Criteria andHasRefundEqualTo(String value) {
            addCriterion("has_refund =", value, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundNotEqualTo(String value) {
            addCriterion("has_refund <>", value, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundGreaterThan(String value) {
            addCriterion("has_refund >", value, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundGreaterThanOrEqualTo(String value) {
            addCriterion("has_refund >=", value, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundLessThan(String value) {
            addCriterion("has_refund <", value, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundLessThanOrEqualTo(String value) {
            addCriterion("has_refund <=", value, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundLike(String value) {
            addCriterion("has_refund like", value, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundNotLike(String value) {
            addCriterion("has_refund not like", value, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundIn(List<String> values) {
            addCriterion("has_refund in", values, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundNotIn(List<String> values) {
            addCriterion("has_refund not in", values, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundBetween(String value1, String value2) {
            addCriterion("has_refund between", value1, value2, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andHasRefundNotBetween(String value1, String value2) {
            addCriterion("has_refund not between", value1, value2, "hasRefund");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIsNull() {
            addCriterion("withdraw_status is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIsNotNull() {
            addCriterion("withdraw_status is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusEqualTo(String value) {
            addCriterion("withdraw_status =", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotEqualTo(String value) {
            addCriterion("withdraw_status <>", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusGreaterThan(String value) {
            addCriterion("withdraw_status >", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_status >=", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusLessThan(String value) {
            addCriterion("withdraw_status <", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusLessThanOrEqualTo(String value) {
            addCriterion("withdraw_status <=", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusLike(String value) {
            addCriterion("withdraw_status like", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotLike(String value) {
            addCriterion("withdraw_status not like", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIn(List<String> values) {
            addCriterion("withdraw_status in", values, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotIn(List<String> values) {
            addCriterion("withdraw_status not in", values, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusBetween(String value1, String value2) {
            addCriterion("withdraw_status between", value1, value2, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotBetween(String value1, String value2) {
            addCriterion("withdraw_status not between", value1, value2, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoIsNull() {
            addCriterion("withdraw_order_no is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoIsNotNull() {
            addCriterion("withdraw_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoEqualTo(String value) {
            addCriterion("withdraw_order_no =", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoNotEqualTo(String value) {
            addCriterion("withdraw_order_no <>", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoGreaterThan(String value) {
            addCriterion("withdraw_order_no >", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_order_no >=", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoLessThan(String value) {
            addCriterion("withdraw_order_no <", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoLessThanOrEqualTo(String value) {
            addCriterion("withdraw_order_no <=", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoLike(String value) {
            addCriterion("withdraw_order_no like", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoNotLike(String value) {
            addCriterion("withdraw_order_no not like", value, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoIn(List<String> values) {
            addCriterion("withdraw_order_no in", values, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoNotIn(List<String> values) {
            addCriterion("withdraw_order_no not in", values, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoBetween(String value1, String value2) {
            addCriterion("withdraw_order_no between", value1, value2, "withdrawOrderNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawOrderNoNotBetween(String value1, String value2) {
            addCriterion("withdraw_order_no not between", value1, value2, "withdrawOrderNo");
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

        public Criteria andApplyPayTimeIsNull() {
            addCriterion("apply_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeIsNotNull() {
            addCriterion("apply_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeEqualTo(Date value) {
            addCriterion("apply_pay_time =", value, "applyPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeNotEqualTo(Date value) {
            addCriterion("apply_pay_time <>", value, "applyPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeGreaterThan(Date value) {
            addCriterion("apply_pay_time >", value, "applyPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_pay_time >=", value, "applyPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeLessThan(Date value) {
            addCriterion("apply_pay_time <", value, "applyPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_pay_time <=", value, "applyPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeIn(List<Date> values) {
            addCriterion("apply_pay_time in", values, "applyPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeNotIn(List<Date> values) {
            addCriterion("apply_pay_time not in", values, "applyPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeBetween(Date value1, Date value2) {
            addCriterion("apply_pay_time between", value1, value2, "applyPayTime");
            return (Criteria) this;
        }

        public Criteria andApplyPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_pay_time not between", value1, value2, "applyPayTime");
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

        public Criteria andBrandedCardNoIsNull() {
            addCriterion("branded_card_no is null");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoIsNotNull() {
            addCriterion("branded_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoEqualTo(String value) {
            addCriterion("branded_card_no =", value, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoNotEqualTo(String value) {
            addCriterion("branded_card_no <>", value, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoGreaterThan(String value) {
            addCriterion("branded_card_no >", value, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("branded_card_no >=", value, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoLessThan(String value) {
            addCriterion("branded_card_no <", value, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoLessThanOrEqualTo(String value) {
            addCriterion("branded_card_no <=", value, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoLike(String value) {
            addCriterion("branded_card_no like", value, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoNotLike(String value) {
            addCriterion("branded_card_no not like", value, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoIn(List<String> values) {
            addCriterion("branded_card_no in", values, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoNotIn(List<String> values) {
            addCriterion("branded_card_no not in", values, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoBetween(String value1, String value2) {
            addCriterion("branded_card_no between", value1, value2, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNoNotBetween(String value1, String value2) {
            addCriterion("branded_card_no not between", value1, value2, "brandedCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameIsNull() {
            addCriterion("branded_card_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameIsNotNull() {
            addCriterion("branded_card_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameEqualTo(String value) {
            addCriterion("branded_card_name =", value, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameNotEqualTo(String value) {
            addCriterion("branded_card_name <>", value, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameGreaterThan(String value) {
            addCriterion("branded_card_name >", value, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("branded_card_name >=", value, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameLessThan(String value) {
            addCriterion("branded_card_name <", value, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameLessThanOrEqualTo(String value) {
            addCriterion("branded_card_name <=", value, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameLike(String value) {
            addCriterion("branded_card_name like", value, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameNotLike(String value) {
            addCriterion("branded_card_name not like", value, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameIn(List<String> values) {
            addCriterion("branded_card_name in", values, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameNotIn(List<String> values) {
            addCriterion("branded_card_name not in", values, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameBetween(String value1, String value2) {
            addCriterion("branded_card_name between", value1, value2, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andBrandedCardNameNotBetween(String value1, String value2) {
            addCriterion("branded_card_name not between", value1, value2, "brandedCardName");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankIsNull() {
            addCriterion("need_jump_bank is null");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankIsNotNull() {
            addCriterion("need_jump_bank is not null");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankEqualTo(String value) {
            addCriterion("need_jump_bank =", value, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankNotEqualTo(String value) {
            addCriterion("need_jump_bank <>", value, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankGreaterThan(String value) {
            addCriterion("need_jump_bank >", value, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankGreaterThanOrEqualTo(String value) {
            addCriterion("need_jump_bank >=", value, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankLessThan(String value) {
            addCriterion("need_jump_bank <", value, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankLessThanOrEqualTo(String value) {
            addCriterion("need_jump_bank <=", value, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankLike(String value) {
            addCriterion("need_jump_bank like", value, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankNotLike(String value) {
            addCriterion("need_jump_bank not like", value, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankIn(List<String> values) {
            addCriterion("need_jump_bank in", values, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankNotIn(List<String> values) {
            addCriterion("need_jump_bank not in", values, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankBetween(String value1, String value2) {
            addCriterion("need_jump_bank between", value1, value2, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andNeedJumpBankNotBetween(String value1, String value2) {
            addCriterion("need_jump_bank not between", value1, value2, "needJumpBank");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeIsNull() {
            addCriterion("offline_pay_code is null");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeIsNotNull() {
            addCriterion("offline_pay_code is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeEqualTo(String value) {
            addCriterion("offline_pay_code =", value, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeNotEqualTo(String value) {
            addCriterion("offline_pay_code <>", value, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeGreaterThan(String value) {
            addCriterion("offline_pay_code >", value, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("offline_pay_code >=", value, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeLessThan(String value) {
            addCriterion("offline_pay_code <", value, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeLessThanOrEqualTo(String value) {
            addCriterion("offline_pay_code <=", value, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeLike(String value) {
            addCriterion("offline_pay_code like", value, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeNotLike(String value) {
            addCriterion("offline_pay_code not like", value, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeIn(List<String> values) {
            addCriterion("offline_pay_code in", values, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeNotIn(List<String> values) {
            addCriterion("offline_pay_code not in", values, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeBetween(String value1, String value2) {
            addCriterion("offline_pay_code between", value1, value2, "offlinePayCode");
            return (Criteria) this;
        }

        public Criteria andOfflinePayCodeNotBetween(String value1, String value2) {
            addCriterion("offline_pay_code not between", value1, value2, "offlinePayCode");
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
     * corresponds to the database table fast_pay
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
     * corresponds to the database table fast_pay
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