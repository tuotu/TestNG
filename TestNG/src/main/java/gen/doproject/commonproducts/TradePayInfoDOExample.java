/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradePayInfoDOExample.java
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

public class TradePayInfoDOExample {
    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    public TradePayInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table trade_pay_info
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
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table trade_pay_info
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
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> depositAmountCriteria;

        protected List<Criterion> bailPayAmountCriteria;

        protected List<Criterion> payAmountCriteria;

        protected List<Criterion> shareAmountCriteria;

        protected List<Criterion> buyerFeeCriteria;

        protected List<Criterion> sellerFeeCriteria;

        protected List<Criterion> partnerFeeCriteria;

        protected List<Criterion> subsidyAmountCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            depositAmountCriteria = new ArrayList<Criterion>();
            bailPayAmountCriteria = new ArrayList<Criterion>();
            payAmountCriteria = new ArrayList<Criterion>();
            shareAmountCriteria = new ArrayList<Criterion>();
            buyerFeeCriteria = new ArrayList<Criterion>();
            sellerFeeCriteria = new ArrayList<Criterion>();
            partnerFeeCriteria = new ArrayList<Criterion>();
            subsidyAmountCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getDepositAmountCriteria() {
            return depositAmountCriteria;
        }

        protected void addDepositAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            depositAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addDepositAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            depositAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getBailPayAmountCriteria() {
            return bailPayAmountCriteria;
        }

        protected void addBailPayAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            bailPayAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addBailPayAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            bailPayAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getPayAmountCriteria() {
            return payAmountCriteria;
        }

        protected void addPayAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            payAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addPayAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            payAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
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

        public List<Criterion> getSellerFeeCriteria() {
            return sellerFeeCriteria;
        }

        protected void addSellerFeeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            sellerFeeCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addSellerFeeCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            sellerFeeCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
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

        public List<Criterion> getSubsidyAmountCriteria() {
            return subsidyAmountCriteria;
        }

        protected void addSubsidyAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            subsidyAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addSubsidyAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            subsidyAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || depositAmountCriteria.size() > 0
                || bailPayAmountCriteria.size() > 0
                || payAmountCriteria.size() > 0
                || shareAmountCriteria.size() > 0
                || buyerFeeCriteria.size() > 0
                || sellerFeeCriteria.size() > 0
                || partnerFeeCriteria.size() > 0
                || subsidyAmountCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(depositAmountCriteria);
                allCriteria.addAll(bailPayAmountCriteria);
                allCriteria.addAll(payAmountCriteria);
                allCriteria.addAll(shareAmountCriteria);
                allCriteria.addAll(buyerFeeCriteria);
                allCriteria.addAll(sellerFeeCriteria);
                allCriteria.addAll(partnerFeeCriteria);
                allCriteria.addAll(subsidyAmountCriteria);
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

        public Criteria andPayBizNoIsNull() {
            addCriterion("pay_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andPayBizNoIsNotNull() {
            addCriterion("pay_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayBizNoEqualTo(String value) {
            addCriterion("pay_biz_no =", value, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoNotEqualTo(String value) {
            addCriterion("pay_biz_no <>", value, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoGreaterThan(String value) {
            addCriterion("pay_biz_no >", value, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_biz_no >=", value, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoLessThan(String value) {
            addCriterion("pay_biz_no <", value, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoLessThanOrEqualTo(String value) {
            addCriterion("pay_biz_no <=", value, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoLike(String value) {
            addCriterion("pay_biz_no like", value, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoNotLike(String value) {
            addCriterion("pay_biz_no not like", value, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoIn(List<String> values) {
            addCriterion("pay_biz_no in", values, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoNotIn(List<String> values) {
            addCriterion("pay_biz_no not in", values, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoBetween(String value1, String value2) {
            addCriterion("pay_biz_no between", value1, value2, "payBizNo");
            return (Criteria) this;
        }

        public Criteria andPayBizNoNotBetween(String value1, String value2) {
            addCriterion("pay_biz_no not between", value1, value2, "payBizNo");
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

        public Criteria andWithdrawNoIsNull() {
            addCriterion("withdraw_no is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoIsNotNull() {
            addCriterion("withdraw_no is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoEqualTo(String value) {
            addCriterion("withdraw_no =", value, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoNotEqualTo(String value) {
            addCriterion("withdraw_no <>", value, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoGreaterThan(String value) {
            addCriterion("withdraw_no >", value, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_no >=", value, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoLessThan(String value) {
            addCriterion("withdraw_no <", value, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoLessThanOrEqualTo(String value) {
            addCriterion("withdraw_no <=", value, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoLike(String value) {
            addCriterion("withdraw_no like", value, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoNotLike(String value) {
            addCriterion("withdraw_no not like", value, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoIn(List<String> values) {
            addCriterion("withdraw_no in", values, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoNotIn(List<String> values) {
            addCriterion("withdraw_no not in", values, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoBetween(String value1, String value2) {
            addCriterion("withdraw_no between", value1, value2, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawNoNotBetween(String value1, String value2) {
            addCriterion("withdraw_no not between", value1, value2, "withdrawNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoIsNull() {
            addCriterion("ious_pay_no is null");
            return (Criteria) this;
        }

        public Criteria andIousPayNoIsNotNull() {
            addCriterion("ious_pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andIousPayNoEqualTo(String value) {
            addCriterion("ious_pay_no =", value, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoNotEqualTo(String value) {
            addCriterion("ious_pay_no <>", value, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoGreaterThan(String value) {
            addCriterion("ious_pay_no >", value, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("ious_pay_no >=", value, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoLessThan(String value) {
            addCriterion("ious_pay_no <", value, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoLessThanOrEqualTo(String value) {
            addCriterion("ious_pay_no <=", value, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoLike(String value) {
            addCriterion("ious_pay_no like", value, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoNotLike(String value) {
            addCriterion("ious_pay_no not like", value, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoIn(List<String> values) {
            addCriterion("ious_pay_no in", values, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoNotIn(List<String> values) {
            addCriterion("ious_pay_no not in", values, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoBetween(String value1, String value2) {
            addCriterion("ious_pay_no between", value1, value2, "iousPayNo");
            return (Criteria) this;
        }

        public Criteria andIousPayNoNotBetween(String value1, String value2) {
            addCriterion("ious_pay_no not between", value1, value2, "iousPayNo");
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

        public Criteria andConfirmTransferNoIsNull() {
            addCriterion("confirm_transfer_no is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoIsNotNull() {
            addCriterion("confirm_transfer_no is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoEqualTo(String value) {
            addCriterion("confirm_transfer_no =", value, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoNotEqualTo(String value) {
            addCriterion("confirm_transfer_no <>", value, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoGreaterThan(String value) {
            addCriterion("confirm_transfer_no >", value, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_transfer_no >=", value, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoLessThan(String value) {
            addCriterion("confirm_transfer_no <", value, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoLessThanOrEqualTo(String value) {
            addCriterion("confirm_transfer_no <=", value, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoLike(String value) {
            addCriterion("confirm_transfer_no like", value, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoNotLike(String value) {
            addCriterion("confirm_transfer_no not like", value, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoIn(List<String> values) {
            addCriterion("confirm_transfer_no in", values, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoNotIn(List<String> values) {
            addCriterion("confirm_transfer_no not in", values, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoBetween(String value1, String value2) {
            addCriterion("confirm_transfer_no between", value1, value2, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andConfirmTransferNoNotBetween(String value1, String value2) {
            addCriterion("confirm_transfer_no not between", value1, value2, "confirmTransferNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoIsNull() {
            addCriterion("transfer_to_super_no is null");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoIsNotNull() {
            addCriterion("transfer_to_super_no is not null");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoEqualTo(String value) {
            addCriterion("transfer_to_super_no =", value, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoNotEqualTo(String value) {
            addCriterion("transfer_to_super_no <>", value, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoGreaterThan(String value) {
            addCriterion("transfer_to_super_no >", value, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_to_super_no >=", value, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoLessThan(String value) {
            addCriterion("transfer_to_super_no <", value, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoLessThanOrEqualTo(String value) {
            addCriterion("transfer_to_super_no <=", value, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoLike(String value) {
            addCriterion("transfer_to_super_no like", value, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoNotLike(String value) {
            addCriterion("transfer_to_super_no not like", value, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoIn(List<String> values) {
            addCriterion("transfer_to_super_no in", values, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoNotIn(List<String> values) {
            addCriterion("transfer_to_super_no not in", values, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoBetween(String value1, String value2) {
            addCriterion("transfer_to_super_no between", value1, value2, "transferToSuperNo");
            return (Criteria) this;
        }

        public Criteria andTransferToSuperNoNotBetween(String value1, String value2) {
            addCriterion("transfer_to_super_no not between", value1, value2, "transferToSuperNo");
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

        public Criteria andDepositAmountIsNull() {
            addCriterion("deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(Money value) {
            addDepositAmountCriterion("deposit_amount =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(Money value) {
            addDepositAmountCriterion("deposit_amount <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(Money value) {
            addDepositAmountCriterion("deposit_amount >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(Money value) {
            addDepositAmountCriterion("deposit_amount >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(Money value) {
            addDepositAmountCriterion("deposit_amount <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(Money value) {
            addDepositAmountCriterion("deposit_amount <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<Money> values) {
            addDepositAmountCriterion("deposit_amount in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<Money> values) {
            addDepositAmountCriterion("deposit_amount not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(Money value1, Money value2) {
            addDepositAmountCriterion("deposit_amount between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(Money value1, Money value2) {
            addDepositAmountCriterion("deposit_amount not between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountIsNull() {
            addCriterion("bail_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountIsNotNull() {
            addCriterion("bail_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountEqualTo(Money value) {
            addBailPayAmountCriterion("bail_pay_amount =", value, "bailPayAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountNotEqualTo(Money value) {
            addBailPayAmountCriterion("bail_pay_amount <>", value, "bailPayAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountGreaterThan(Money value) {
            addBailPayAmountCriterion("bail_pay_amount >", value, "bailPayAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountGreaterThanOrEqualTo(Money value) {
            addBailPayAmountCriterion("bail_pay_amount >=", value, "bailPayAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountLessThan(Money value) {
            addBailPayAmountCriterion("bail_pay_amount <", value, "bailPayAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountLessThanOrEqualTo(Money value) {
            addBailPayAmountCriterion("bail_pay_amount <=", value, "bailPayAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountIn(List<Money> values) {
            addBailPayAmountCriterion("bail_pay_amount in", values, "bailPayAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountNotIn(List<Money> values) {
            addBailPayAmountCriterion("bail_pay_amount not in", values, "bailPayAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountBetween(Money value1, Money value2) {
            addBailPayAmountCriterion("bail_pay_amount between", value1, value2, "bailPayAmount");
            return (Criteria) this;
        }

        public Criteria andBailPayAmountNotBetween(Money value1, Money value2) {
            addBailPayAmountCriterion("bail_pay_amount not between", value1, value2, "bailPayAmount");
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

        public Criteria andPayAmountEqualTo(Money value) {
            addPayAmountCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(Money value) {
            addPayAmountCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(Money value) {
            addPayAmountCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(Money value) {
            addPayAmountCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(Money value) {
            addPayAmountCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(Money value) {
            addPayAmountCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<Money> values) {
            addPayAmountCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<Money> values) {
            addPayAmountCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(Money value1, Money value2) {
            addPayAmountCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(Money value1, Money value2) {
            addPayAmountCriterion("pay_amount not between", value1, value2, "payAmount");
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

        public Criteria andSurplusAmountIsNull() {
            addCriterion("surplus_amount is null");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountIsNotNull() {
            addCriterion("surplus_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountEqualTo(Long value) {
            addCriterion("surplus_amount =", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountNotEqualTo(Long value) {
            addCriterion("surplus_amount <>", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountGreaterThan(Long value) {
            addCriterion("surplus_amount >", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("surplus_amount >=", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountLessThan(Long value) {
            addCriterion("surplus_amount <", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountLessThanOrEqualTo(Long value) {
            addCriterion("surplus_amount <=", value, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountIn(List<Long> values) {
            addCriterion("surplus_amount in", values, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountNotIn(List<Long> values) {
            addCriterion("surplus_amount not in", values, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountBetween(Long value1, Long value2) {
            addCriterion("surplus_amount between", value1, value2, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSurplusAmountNotBetween(Long value1, Long value2) {
            addCriterion("surplus_amount not between", value1, value2, "surplusAmount");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andSellerFeeIsNull() {
            addCriterion("seller_fee is null");
            return (Criteria) this;
        }

        public Criteria andSellerFeeIsNotNull() {
            addCriterion("seller_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSellerFeeEqualTo(Money value) {
            addSellerFeeCriterion("seller_fee =", value, "sellerFee");
            return (Criteria) this;
        }

        public Criteria andSellerFeeNotEqualTo(Money value) {
            addSellerFeeCriterion("seller_fee <>", value, "sellerFee");
            return (Criteria) this;
        }

        public Criteria andSellerFeeGreaterThan(Money value) {
            addSellerFeeCriterion("seller_fee >", value, "sellerFee");
            return (Criteria) this;
        }

        public Criteria andSellerFeeGreaterThanOrEqualTo(Money value) {
            addSellerFeeCriterion("seller_fee >=", value, "sellerFee");
            return (Criteria) this;
        }

        public Criteria andSellerFeeLessThan(Money value) {
            addSellerFeeCriterion("seller_fee <", value, "sellerFee");
            return (Criteria) this;
        }

        public Criteria andSellerFeeLessThanOrEqualTo(Money value) {
            addSellerFeeCriterion("seller_fee <=", value, "sellerFee");
            return (Criteria) this;
        }

        public Criteria andSellerFeeIn(List<Money> values) {
            addSellerFeeCriterion("seller_fee in", values, "sellerFee");
            return (Criteria) this;
        }

        public Criteria andSellerFeeNotIn(List<Money> values) {
            addSellerFeeCriterion("seller_fee not in", values, "sellerFee");
            return (Criteria) this;
        }

        public Criteria andSellerFeeBetween(Money value1, Money value2) {
            addSellerFeeCriterion("seller_fee between", value1, value2, "sellerFee");
            return (Criteria) this;
        }

        public Criteria andSellerFeeNotBetween(Money value1, Money value2) {
            addSellerFeeCriterion("seller_fee not between", value1, value2, "sellerFee");
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

        public Criteria andMergeFlagIsNull() {
            addCriterion("merge_flag is null");
            return (Criteria) this;
        }

        public Criteria andMergeFlagIsNotNull() {
            addCriterion("merge_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMergeFlagEqualTo(String value) {
            addCriterion("merge_flag =", value, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagNotEqualTo(String value) {
            addCriterion("merge_flag <>", value, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagGreaterThan(String value) {
            addCriterion("merge_flag >", value, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("merge_flag >=", value, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagLessThan(String value) {
            addCriterion("merge_flag <", value, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagLessThanOrEqualTo(String value) {
            addCriterion("merge_flag <=", value, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagLike(String value) {
            addCriterion("merge_flag like", value, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagNotLike(String value) {
            addCriterion("merge_flag not like", value, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagIn(List<String> values) {
            addCriterion("merge_flag in", values, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagNotIn(List<String> values) {
            addCriterion("merge_flag not in", values, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagBetween(String value1, String value2) {
            addCriterion("merge_flag between", value1, value2, "mergeFlag");
            return (Criteria) this;
        }

        public Criteria andMergeFlagNotBetween(String value1, String value2) {
            addCriterion("merge_flag not between", value1, value2, "mergeFlag");
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

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("pay_method like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("pay_method not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
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

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("card_type like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("card_type not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeIsNull() {
            addCriterion("mutable_type is null");
            return (Criteria) this;
        }

        public Criteria andMutableTypeIsNotNull() {
            addCriterion("mutable_type is not null");
            return (Criteria) this;
        }

        public Criteria andMutableTypeEqualTo(String value) {
            addCriterion("mutable_type =", value, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeNotEqualTo(String value) {
            addCriterion("mutable_type <>", value, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeGreaterThan(String value) {
            addCriterion("mutable_type >", value, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mutable_type >=", value, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeLessThan(String value) {
            addCriterion("mutable_type <", value, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeLessThanOrEqualTo(String value) {
            addCriterion("mutable_type <=", value, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeLike(String value) {
            addCriterion("mutable_type like", value, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeNotLike(String value) {
            addCriterion("mutable_type not like", value, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeIn(List<String> values) {
            addCriterion("mutable_type in", values, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeNotIn(List<String> values) {
            addCriterion("mutable_type not in", values, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeBetween(String value1, String value2) {
            addCriterion("mutable_type between", value1, value2, "mutableType");
            return (Criteria) this;
        }

        public Criteria andMutableTypeNotBetween(String value1, String value2) {
            addCriterion("mutable_type not between", value1, value2, "mutableType");
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

        public Criteria andBankAccountNoDigestIsNull() {
            addCriterion("bank_account_no_digest is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestIsNotNull() {
            addCriterion("bank_account_no_digest is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestEqualTo(String value) {
            addCriterion("bank_account_no_digest =", value, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestNotEqualTo(String value) {
            addCriterion("bank_account_no_digest <>", value, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestGreaterThan(String value) {
            addCriterion("bank_account_no_digest >", value, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_no_digest >=", value, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestLessThan(String value) {
            addCriterion("bank_account_no_digest <", value, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestLessThanOrEqualTo(String value) {
            addCriterion("bank_account_no_digest <=", value, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestLike(String value) {
            addCriterion("bank_account_no_digest like", value, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestNotLike(String value) {
            addCriterion("bank_account_no_digest not like", value, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestIn(List<String> values) {
            addCriterion("bank_account_no_digest in", values, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestNotIn(List<String> values) {
            addCriterion("bank_account_no_digest not in", values, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestBetween(String value1, String value2) {
            addCriterion("bank_account_no_digest between", value1, value2, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoDigestNotBetween(String value1, String value2) {
            addCriterion("bank_account_no_digest not between", value1, value2, "bankAccountNoDigest");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
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

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("pay_status like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("pay_status not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
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

        public Criteria andSubsidyTransferNoIsNull() {
            addCriterion("subsidy_transfer_no is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoIsNotNull() {
            addCriterion("subsidy_transfer_no is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoEqualTo(String value) {
            addCriterion("subsidy_transfer_no =", value, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoNotEqualTo(String value) {
            addCriterion("subsidy_transfer_no <>", value, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoGreaterThan(String value) {
            addCriterion("subsidy_transfer_no >", value, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoGreaterThanOrEqualTo(String value) {
            addCriterion("subsidy_transfer_no >=", value, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoLessThan(String value) {
            addCriterion("subsidy_transfer_no <", value, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoLessThanOrEqualTo(String value) {
            addCriterion("subsidy_transfer_no <=", value, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoLike(String value) {
            addCriterion("subsidy_transfer_no like", value, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoNotLike(String value) {
            addCriterion("subsidy_transfer_no not like", value, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoIn(List<String> values) {
            addCriterion("subsidy_transfer_no in", values, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoNotIn(List<String> values) {
            addCriterion("subsidy_transfer_no not in", values, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoBetween(String value1, String value2) {
            addCriterion("subsidy_transfer_no between", value1, value2, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyTransferNoNotBetween(String value1, String value2) {
            addCriterion("subsidy_transfer_no not between", value1, value2, "subsidyTransferNo");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountIsNull() {
            addCriterion("subsidy_amount is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountIsNotNull() {
            addCriterion("subsidy_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountEqualTo(Money value) {
            addSubsidyAmountCriterion("subsidy_amount =", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountNotEqualTo(Money value) {
            addSubsidyAmountCriterion("subsidy_amount <>", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountGreaterThan(Money value) {
            addSubsidyAmountCriterion("subsidy_amount >", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountGreaterThanOrEqualTo(Money value) {
            addSubsidyAmountCriterion("subsidy_amount >=", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountLessThan(Money value) {
            addSubsidyAmountCriterion("subsidy_amount <", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountLessThanOrEqualTo(Money value) {
            addSubsidyAmountCriterion("subsidy_amount <=", value, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountIn(List<Money> values) {
            addSubsidyAmountCriterion("subsidy_amount in", values, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountNotIn(List<Money> values) {
            addSubsidyAmountCriterion("subsidy_amount not in", values, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountBetween(Money value1, Money value2) {
            addSubsidyAmountCriterion("subsidy_amount between", value1, value2, "subsidyAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyAmountNotBetween(Money value1, Money value2) {
            addSubsidyAmountCriterion("subsidy_amount not between", value1, value2, "subsidyAmount");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table trade_pay_info
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
     * corresponds to the database table trade_pay_info
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