/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename BatchBehalfDetailDOExample.java
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

public class BatchBehalfDetailDOExample {
    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    public BatchBehalfDetailDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table batch_behalf_detail
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
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table batch_behalf_detail
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
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> amountCriteria;

        protected List<Criterion> counterFeeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            amountCriteria = new ArrayList<Criterion>();
            counterFeeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getAmountCriteria() {
            return amountCriteria;
        }

        protected void addAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            amountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            amountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getCounterFeeCriteria() {
            return counterFeeCriteria;
        }

        protected void addCounterFeeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            counterFeeCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addCounterFeeCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            counterFeeCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || amountCriteria.size() > 0
                || counterFeeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(amountCriteria);
                allCriteria.addAll(counterFeeCriteria);
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

        public Criteria andAmountEqualTo(Money value) {
            addAmountCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Money value) {
            addAmountCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Money value) {
            addAmountCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Money value) {
            addAmountCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Money value) {
            addAmountCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Money value) {
            addAmountCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Money> values) {
            addAmountCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Money> values) {
            addAmountCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Money value1, Money value2) {
            addAmountCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Money value1, Money value2) {
            addAmountCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andBankBranchIsNull() {
            addCriterion("bank_branch is null");
            return (Criteria) this;
        }

        public Criteria andBankBranchIsNotNull() {
            addCriterion("bank_branch is not null");
            return (Criteria) this;
        }

        public Criteria andBankBranchEqualTo(String value) {
            addCriterion("bank_branch =", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotEqualTo(String value) {
            addCriterion("bank_branch <>", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchGreaterThan(String value) {
            addCriterion("bank_branch >", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchGreaterThanOrEqualTo(String value) {
            addCriterion("bank_branch >=", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLessThan(String value) {
            addCriterion("bank_branch <", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLessThanOrEqualTo(String value) {
            addCriterion("bank_branch <=", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchLike(String value) {
            addCriterion("bank_branch like", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotLike(String value) {
            addCriterion("bank_branch not like", value, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchIn(List<String> values) {
            addCriterion("bank_branch in", values, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotIn(List<String> values) {
            addCriterion("bank_branch not in", values, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchBetween(String value1, String value2) {
            addCriterion("bank_branch between", value1, value2, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankBranchNotBetween(String value1, String value2) {
            addCriterion("bank_branch not between", value1, value2, "bankBranch");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNull() {
            addCriterion("bank_city is null");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNotNull() {
            addCriterion("bank_city is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityEqualTo(String value) {
            addCriterion("bank_city =", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotEqualTo(String value) {
            addCriterion("bank_city <>", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThan(String value) {
            addCriterion("bank_city >", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThanOrEqualTo(String value) {
            addCriterion("bank_city >=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThan(String value) {
            addCriterion("bank_city <", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThanOrEqualTo(String value) {
            addCriterion("bank_city <=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLike(String value) {
            addCriterion("bank_city like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotLike(String value) {
            addCriterion("bank_city not like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityIn(List<String> values) {
            addCriterion("bank_city in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotIn(List<String> values) {
            addCriterion("bank_city not in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityBetween(String value1, String value2) {
            addCriterion("bank_city between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotBetween(String value1, String value2) {
            addCriterion("bank_city not between", value1, value2, "bankCity");
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

        public Criteria andBankProvinceIsNull() {
            addCriterion("bank_province is null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNotNull() {
            addCriterion("bank_province is not null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceEqualTo(String value) {
            addCriterion("bank_province =", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotEqualTo(String value) {
            addCriterion("bank_province <>", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThan(String value) {
            addCriterion("bank_province >", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("bank_province >=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThan(String value) {
            addCriterion("bank_province <", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThanOrEqualTo(String value) {
            addCriterion("bank_province <=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLike(String value) {
            addCriterion("bank_province like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotLike(String value) {
            addCriterion("bank_province not like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIn(List<String> values) {
            addCriterion("bank_province in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotIn(List<String> values) {
            addCriterion("bank_province not in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceBetween(String value1, String value2) {
            addCriterion("bank_province between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotBetween(String value1, String value2) {
            addCriterion("bank_province not between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoIsNull() {
            addCriterion("batch_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoIsNotNull() {
            addCriterion("batch_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoEqualTo(String value) {
            addCriterion("batch_biz_no =", value, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoNotEqualTo(String value) {
            addCriterion("batch_biz_no <>", value, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoGreaterThan(String value) {
            addCriterion("batch_biz_no >", value, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_biz_no >=", value, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoLessThan(String value) {
            addCriterion("batch_biz_no <", value, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoLessThanOrEqualTo(String value) {
            addCriterion("batch_biz_no <=", value, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoLike(String value) {
            addCriterion("batch_biz_no like", value, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoNotLike(String value) {
            addCriterion("batch_biz_no not like", value, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoIn(List<String> values) {
            addCriterion("batch_biz_no in", values, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoNotIn(List<String> values) {
            addCriterion("batch_biz_no not in", values, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoBetween(String value1, String value2) {
            addCriterion("batch_biz_no between", value1, value2, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBatchBizNoNotBetween(String value1, String value2) {
            addCriterion("batch_biz_no not between", value1, value2, "batchBizNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoIsNull() {
            addCriterion("business_no is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNoIsNotNull() {
            addCriterion("business_no is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNoEqualTo(String value) {
            addCriterion("business_no =", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotEqualTo(String value) {
            addCriterion("business_no <>", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoGreaterThan(String value) {
            addCriterion("business_no >", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoGreaterThanOrEqualTo(String value) {
            addCriterion("business_no >=", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoLessThan(String value) {
            addCriterion("business_no <", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoLessThanOrEqualTo(String value) {
            addCriterion("business_no <=", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoLike(String value) {
            addCriterion("business_no like", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotLike(String value) {
            addCriterion("business_no not like", value, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoIn(List<String> values) {
            addCriterion("business_no in", values, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotIn(List<String> values) {
            addCriterion("business_no not in", values, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoBetween(String value1, String value2) {
            addCriterion("business_no between", value1, value2, "businessNo");
            return (Criteria) this;
        }

        public Criteria andBusinessNoNotBetween(String value1, String value2) {
            addCriterion("business_no not between", value1, value2, "businessNo");
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

        public Criteria andCounterFeeIsNull() {
            addCriterion("counter_fee is null");
            return (Criteria) this;
        }

        public Criteria andCounterFeeIsNotNull() {
            addCriterion("counter_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCounterFeeEqualTo(Money value) {
            addCounterFeeCriterion("counter_fee =", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeNotEqualTo(Money value) {
            addCounterFeeCriterion("counter_fee <>", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeGreaterThan(Money value) {
            addCounterFeeCriterion("counter_fee >", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeGreaterThanOrEqualTo(Money value) {
            addCounterFeeCriterion("counter_fee >=", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeLessThan(Money value) {
            addCounterFeeCriterion("counter_fee <", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeLessThanOrEqualTo(Money value) {
            addCounterFeeCriterion("counter_fee <=", value, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeIn(List<Money> values) {
            addCounterFeeCriterion("counter_fee in", values, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeNotIn(List<Money> values) {
            addCounterFeeCriterion("counter_fee not in", values, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeBetween(Money value1, Money value2) {
            addCounterFeeCriterion("counter_fee between", value1, value2, "counterFee");
            return (Criteria) this;
        }

        public Criteria andCounterFeeNotBetween(Money value1, Money value2) {
            addCounterFeeCriterion("counter_fee not between", value1, value2, "counterFee");
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

        public Criteria andDelayHoursEqualTo(Integer value) {
            addCriterion("delay_hours =", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotEqualTo(Integer value) {
            addCriterion("delay_hours <>", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursGreaterThan(Integer value) {
            addCriterion("delay_hours >", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("delay_hours >=", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursLessThan(Integer value) {
            addCriterion("delay_hours <", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursLessThanOrEqualTo(Integer value) {
            addCriterion("delay_hours <=", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursIn(List<Integer> values) {
            addCriterion("delay_hours in", values, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotIn(List<Integer> values) {
            addCriterion("delay_hours not in", values, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursBetween(Integer value1, Integer value2) {
            addCriterion("delay_hours between", value1, value2, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSellerAccountIsNull() {
            addCriterion("seller_account is null");
            return (Criteria) this;
        }

        public Criteria andSellerAccountIsNotNull() {
            addCriterion("seller_account is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAccountEqualTo(String value) {
            addCriterion("seller_account =", value, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNotEqualTo(String value) {
            addCriterion("seller_account <>", value, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountGreaterThan(String value) {
            addCriterion("seller_account >", value, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("seller_account >=", value, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountLessThan(String value) {
            addCriterion("seller_account <", value, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountLessThanOrEqualTo(String value) {
            addCriterion("seller_account <=", value, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountLike(String value) {
            addCriterion("seller_account like", value, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNotLike(String value) {
            addCriterion("seller_account not like", value, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountIn(List<String> values) {
            addCriterion("seller_account in", values, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNotIn(List<String> values) {
            addCriterion("seller_account not in", values, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountBetween(String value1, String value2) {
            addCriterion("seller_account between", value1, value2, "sellerAccount");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNotBetween(String value1, String value2) {
            addCriterion("seller_account not between", value1, value2, "sellerAccount");
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

        public Criteria andSellerAccountNoIsNull() {
            addCriterion("seller_account_no is null");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoIsNotNull() {
            addCriterion("seller_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoEqualTo(String value) {
            addCriterion("seller_account_no =", value, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoNotEqualTo(String value) {
            addCriterion("seller_account_no <>", value, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoGreaterThan(String value) {
            addCriterion("seller_account_no >", value, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("seller_account_no >=", value, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoLessThan(String value) {
            addCriterion("seller_account_no <", value, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoLessThanOrEqualTo(String value) {
            addCriterion("seller_account_no <=", value, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoLike(String value) {
            addCriterion("seller_account_no like", value, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoNotLike(String value) {
            addCriterion("seller_account_no not like", value, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoIn(List<String> values) {
            addCriterion("seller_account_no in", values, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoNotIn(List<String> values) {
            addCriterion("seller_account_no not in", values, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoBetween(String value1, String value2) {
            addCriterion("seller_account_no between", value1, value2, "sellerAccountNo");
            return (Criteria) this;
        }

        public Criteria andSellerAccountNoNotBetween(String value1, String value2) {
            addCriterion("seller_account_no not between", value1, value2, "sellerAccountNo");
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

        public Criteria andTargetAccountTypeIsNull() {
            addCriterion("target_account_type is null");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeIsNotNull() {
            addCriterion("target_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeEqualTo(String value) {
            addCriterion("target_account_type =", value, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeNotEqualTo(String value) {
            addCriterion("target_account_type <>", value, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeGreaterThan(String value) {
            addCriterion("target_account_type >", value, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("target_account_type >=", value, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeLessThan(String value) {
            addCriterion("target_account_type <", value, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("target_account_type <=", value, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeLike(String value) {
            addCriterion("target_account_type like", value, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeNotLike(String value) {
            addCriterion("target_account_type not like", value, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeIn(List<String> values) {
            addCriterion("target_account_type in", values, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeNotIn(List<String> values) {
            addCriterion("target_account_type not in", values, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeBetween(String value1, String value2) {
            addCriterion("target_account_type between", value1, value2, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andTargetAccountTypeNotBetween(String value1, String value2) {
            addCriterion("target_account_type not between", value1, value2, "targetAccountType");
            return (Criteria) this;
        }

        public Criteria andUserendipIsNull() {
            addCriterion("userEndIp is null");
            return (Criteria) this;
        }

        public Criteria andUserendipIsNotNull() {
            addCriterion("userEndIp is not null");
            return (Criteria) this;
        }

        public Criteria andUserendipEqualTo(String value) {
            addCriterion("userEndIp =", value, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipNotEqualTo(String value) {
            addCriterion("userEndIp <>", value, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipGreaterThan(String value) {
            addCriterion("userEndIp >", value, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipGreaterThanOrEqualTo(String value) {
            addCriterion("userEndIp >=", value, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipLessThan(String value) {
            addCriterion("userEndIp <", value, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipLessThanOrEqualTo(String value) {
            addCriterion("userEndIp <=", value, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipLike(String value) {
            addCriterion("userEndIp like", value, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipNotLike(String value) {
            addCriterion("userEndIp not like", value, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipIn(List<String> values) {
            addCriterion("userEndIp in", values, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipNotIn(List<String> values) {
            addCriterion("userEndIp not in", values, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipBetween(String value1, String value2) {
            addCriterion("userEndIp between", value1, value2, "userendip");
            return (Criteria) this;
        }

        public Criteria andUserendipNotBetween(String value1, String value2) {
            addCriterion("userEndIp not between", value1, value2, "userendip");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoIsNull() {
            addCriterion("sellerAccountNo is null");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoIsNotNull() {
            addCriterion("sellerAccountNo is not null");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoEqualTo(String value) {
            addCriterion("sellerAccountNo =", value, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoNotEqualTo(String value) {
            addCriterion("sellerAccountNo <>", value, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoGreaterThan(String value) {
            addCriterion("sellerAccountNo >", value, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("sellerAccountNo >=", value, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoLessThan(String value) {
            addCriterion("sellerAccountNo <", value, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoLessThanOrEqualTo(String value) {
            addCriterion("sellerAccountNo <=", value, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoLike(String value) {
            addCriterion("sellerAccountNo like", value, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoNotLike(String value) {
            addCriterion("sellerAccountNo not like", value, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoIn(List<String> values) {
            addCriterion("sellerAccountNo in", values, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoNotIn(List<String> values) {
            addCriterion("sellerAccountNo not in", values, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoBetween(String value1, String value2) {
            addCriterion("sellerAccountNo between", value1, value2, "selleraccountno");
            return (Criteria) this;
        }

        public Criteria andSelleraccountnoNotBetween(String value1, String value2) {
            addCriterion("sellerAccountNo not between", value1, value2, "selleraccountno");
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

        public Criteria andSelleraccountIsNull() {
            addCriterion("sellerAccount is null");
            return (Criteria) this;
        }

        public Criteria andSelleraccountIsNotNull() {
            addCriterion("sellerAccount is not null");
            return (Criteria) this;
        }

        public Criteria andSelleraccountEqualTo(String value) {
            addCriterion("sellerAccount =", value, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountNotEqualTo(String value) {
            addCriterion("sellerAccount <>", value, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountGreaterThan(String value) {
            addCriterion("sellerAccount >", value, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountGreaterThanOrEqualTo(String value) {
            addCriterion("sellerAccount >=", value, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountLessThan(String value) {
            addCriterion("sellerAccount <", value, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountLessThanOrEqualTo(String value) {
            addCriterion("sellerAccount <=", value, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountLike(String value) {
            addCriterion("sellerAccount like", value, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountNotLike(String value) {
            addCriterion("sellerAccount not like", value, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountIn(List<String> values) {
            addCriterion("sellerAccount in", values, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountNotIn(List<String> values) {
            addCriterion("sellerAccount not in", values, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountBetween(String value1, String value2) {
            addCriterion("sellerAccount between", value1, value2, "selleraccount");
            return (Criteria) this;
        }

        public Criteria andSelleraccountNotBetween(String value1, String value2) {
            addCriterion("sellerAccount not between", value1, value2, "selleraccount");
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
    }

    /**
     * corresponds to the database table batch_behalf_detail
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
     * corresponds to the database table batch_behalf_detail
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