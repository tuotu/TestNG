/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename BatchBehalfDOExample.java
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

public class BatchBehalfDOExample {
    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    public BatchBehalfDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table batch_behalf
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
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table batch_behalf
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
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> behalfAmtCriteria;

        protected List<Criterion> counterFeeCriteria;

        protected List<Criterion> failureAmtCriteria;

        protected List<Criterion> itemCounterFeeCriteria;

        protected List<Criterion> successAmtCriteria;

        protected List<Criterion> itemCounterFeePublicCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            behalfAmtCriteria = new ArrayList<Criterion>();
            counterFeeCriteria = new ArrayList<Criterion>();
            failureAmtCriteria = new ArrayList<Criterion>();
            itemCounterFeeCriteria = new ArrayList<Criterion>();
            successAmtCriteria = new ArrayList<Criterion>();
            itemCounterFeePublicCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getBehalfAmtCriteria() {
            return behalfAmtCriteria;
        }

        protected void addBehalfAmtCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            behalfAmtCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addBehalfAmtCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            behalfAmtCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
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

        public List<Criterion> getFailureAmtCriteria() {
            return failureAmtCriteria;
        }

        protected void addFailureAmtCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            failureAmtCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addFailureAmtCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            failureAmtCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getItemCounterFeeCriteria() {
            return itemCounterFeeCriteria;
        }

        protected void addItemCounterFeeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            itemCounterFeeCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addItemCounterFeeCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            itemCounterFeeCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getSuccessAmtCriteria() {
            return successAmtCriteria;
        }

        protected void addSuccessAmtCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            successAmtCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addSuccessAmtCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            successAmtCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getItemCounterFeePublicCriteria() {
            return itemCounterFeePublicCriteria;
        }

        protected void addItemCounterFeePublicCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            itemCounterFeePublicCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addItemCounterFeePublicCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            itemCounterFeePublicCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || behalfAmtCriteria.size() > 0
                || counterFeeCriteria.size() > 0
                || failureAmtCriteria.size() > 0
                || itemCounterFeeCriteria.size() > 0
                || successAmtCriteria.size() > 0
                || itemCounterFeePublicCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(behalfAmtCriteria);
                allCriteria.addAll(counterFeeCriteria);
                allCriteria.addAll(failureAmtCriteria);
                allCriteria.addAll(itemCounterFeeCriteria);
                allCriteria.addAll(successAmtCriteria);
                allCriteria.addAll(itemCounterFeePublicCriteria);
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

        public Criteria andAllFileNameIsNull() {
            addCriterion("all_file_name is null");
            return (Criteria) this;
        }

        public Criteria andAllFileNameIsNotNull() {
            addCriterion("all_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllFileNameEqualTo(String value) {
            addCriterion("all_file_name =", value, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameNotEqualTo(String value) {
            addCriterion("all_file_name <>", value, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameGreaterThan(String value) {
            addCriterion("all_file_name >", value, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("all_file_name >=", value, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameLessThan(String value) {
            addCriterion("all_file_name <", value, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameLessThanOrEqualTo(String value) {
            addCriterion("all_file_name <=", value, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameLike(String value) {
            addCriterion("all_file_name like", value, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameNotLike(String value) {
            addCriterion("all_file_name not like", value, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameIn(List<String> values) {
            addCriterion("all_file_name in", values, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameNotIn(List<String> values) {
            addCriterion("all_file_name not in", values, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameBetween(String value1, String value2) {
            addCriterion("all_file_name between", value1, value2, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFileNameNotBetween(String value1, String value2) {
            addCriterion("all_file_name not between", value1, value2, "allFileName");
            return (Criteria) this;
        }

        public Criteria andAllFilePathIsNull() {
            addCriterion("all_file_path is null");
            return (Criteria) this;
        }

        public Criteria andAllFilePathIsNotNull() {
            addCriterion("all_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andAllFilePathEqualTo(String value) {
            addCriterion("all_file_path =", value, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathNotEqualTo(String value) {
            addCriterion("all_file_path <>", value, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathGreaterThan(String value) {
            addCriterion("all_file_path >", value, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("all_file_path >=", value, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathLessThan(String value) {
            addCriterion("all_file_path <", value, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathLessThanOrEqualTo(String value) {
            addCriterion("all_file_path <=", value, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathLike(String value) {
            addCriterion("all_file_path like", value, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathNotLike(String value) {
            addCriterion("all_file_path not like", value, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathIn(List<String> values) {
            addCriterion("all_file_path in", values, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathNotIn(List<String> values) {
            addCriterion("all_file_path not in", values, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathBetween(String value1, String value2) {
            addCriterion("all_file_path between", value1, value2, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andAllFilePathNotBetween(String value1, String value2) {
            addCriterion("all_file_path not between", value1, value2, "allFilePath");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtIsNull() {
            addCriterion("behalf_amt is null");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtIsNotNull() {
            addCriterion("behalf_amt is not null");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtEqualTo(Money value) {
            addBehalfAmtCriterion("behalf_amt =", value, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtNotEqualTo(Money value) {
            addBehalfAmtCriterion("behalf_amt <>", value, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtGreaterThan(Money value) {
            addBehalfAmtCriterion("behalf_amt >", value, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtGreaterThanOrEqualTo(Money value) {
            addBehalfAmtCriterion("behalf_amt >=", value, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtLessThan(Money value) {
            addBehalfAmtCriterion("behalf_amt <", value, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtLessThanOrEqualTo(Money value) {
            addBehalfAmtCriterion("behalf_amt <=", value, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtIn(List<Money> values) {
            addBehalfAmtCriterion("behalf_amt in", values, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtNotIn(List<Money> values) {
            addBehalfAmtCriterion("behalf_amt not in", values, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtBetween(Money value1, Money value2) {
            addBehalfAmtCriterion("behalf_amt between", value1, value2, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfAmtNotBetween(Money value1, Money value2) {
            addBehalfAmtCriterion("behalf_amt not between", value1, value2, "behalfAmt");
            return (Criteria) this;
        }

        public Criteria andBehalfCountIsNull() {
            addCriterion("behalf_count is null");
            return (Criteria) this;
        }

        public Criteria andBehalfCountIsNotNull() {
            addCriterion("behalf_count is not null");
            return (Criteria) this;
        }

        public Criteria andBehalfCountEqualTo(Integer value) {
            addCriterion("behalf_count =", value, "behalfCount");
            return (Criteria) this;
        }

        public Criteria andBehalfCountNotEqualTo(Integer value) {
            addCriterion("behalf_count <>", value, "behalfCount");
            return (Criteria) this;
        }

        public Criteria andBehalfCountGreaterThan(Integer value) {
            addCriterion("behalf_count >", value, "behalfCount");
            return (Criteria) this;
        }

        public Criteria andBehalfCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("behalf_count >=", value, "behalfCount");
            return (Criteria) this;
        }

        public Criteria andBehalfCountLessThan(Integer value) {
            addCriterion("behalf_count <", value, "behalfCount");
            return (Criteria) this;
        }

        public Criteria andBehalfCountLessThanOrEqualTo(Integer value) {
            addCriterion("behalf_count <=", value, "behalfCount");
            return (Criteria) this;
        }

        public Criteria andBehalfCountIn(List<Integer> values) {
            addCriterion("behalf_count in", values, "behalfCount");
            return (Criteria) this;
        }

        public Criteria andBehalfCountNotIn(List<Integer> values) {
            addCriterion("behalf_count not in", values, "behalfCount");
            return (Criteria) this;
        }

        public Criteria andBehalfCountBetween(Integer value1, Integer value2) {
            addCriterion("behalf_count between", value1, value2, "behalfCount");
            return (Criteria) this;
        }

        public Criteria andBehalfCountNotBetween(Integer value1, Integer value2) {
            addCriterion("behalf_count not between", value1, value2, "behalfCount");
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

        public Criteria andFailureAmtIsNull() {
            addCriterion("failure_amt is null");
            return (Criteria) this;
        }

        public Criteria andFailureAmtIsNotNull() {
            addCriterion("failure_amt is not null");
            return (Criteria) this;
        }

        public Criteria andFailureAmtEqualTo(Money value) {
            addFailureAmtCriterion("failure_amt =", value, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureAmtNotEqualTo(Money value) {
            addFailureAmtCriterion("failure_amt <>", value, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureAmtGreaterThan(Money value) {
            addFailureAmtCriterion("failure_amt >", value, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureAmtGreaterThanOrEqualTo(Money value) {
            addFailureAmtCriterion("failure_amt >=", value, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureAmtLessThan(Money value) {
            addFailureAmtCriterion("failure_amt <", value, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureAmtLessThanOrEqualTo(Money value) {
            addFailureAmtCriterion("failure_amt <=", value, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureAmtIn(List<Money> values) {
            addFailureAmtCriterion("failure_amt in", values, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureAmtNotIn(List<Money> values) {
            addFailureAmtCriterion("failure_amt not in", values, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureAmtBetween(Money value1, Money value2) {
            addFailureAmtCriterion("failure_amt between", value1, value2, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureAmtNotBetween(Money value1, Money value2) {
            addFailureAmtCriterion("failure_amt not between", value1, value2, "failureAmt");
            return (Criteria) this;
        }

        public Criteria andFailureCountIsNull() {
            addCriterion("failure_count is null");
            return (Criteria) this;
        }

        public Criteria andFailureCountIsNotNull() {
            addCriterion("failure_count is not null");
            return (Criteria) this;
        }

        public Criteria andFailureCountEqualTo(Integer value) {
            addCriterion("failure_count =", value, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFailureCountNotEqualTo(Integer value) {
            addCriterion("failure_count <>", value, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFailureCountGreaterThan(Integer value) {
            addCriterion("failure_count >", value, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFailureCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("failure_count >=", value, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFailureCountLessThan(Integer value) {
            addCriterion("failure_count <", value, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFailureCountLessThanOrEqualTo(Integer value) {
            addCriterion("failure_count <=", value, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFailureCountIn(List<Integer> values) {
            addCriterion("failure_count in", values, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFailureCountNotIn(List<Integer> values) {
            addCriterion("failure_count not in", values, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFailureCountBetween(Integer value1, Integer value2) {
            addCriterion("failure_count between", value1, value2, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFailureCountNotBetween(Integer value1, Integer value2) {
            addCriterion("failure_count not between", value1, value2, "failureCount");
            return (Criteria) this;
        }

        public Criteria andFreezeNoIsNull() {
            addCriterion("freeze_no is null");
            return (Criteria) this;
        }

        public Criteria andFreezeNoIsNotNull() {
            addCriterion("freeze_no is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeNoEqualTo(String value) {
            addCriterion("freeze_no =", value, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoNotEqualTo(String value) {
            addCriterion("freeze_no <>", value, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoGreaterThan(String value) {
            addCriterion("freeze_no >", value, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoGreaterThanOrEqualTo(String value) {
            addCriterion("freeze_no >=", value, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoLessThan(String value) {
            addCriterion("freeze_no <", value, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoLessThanOrEqualTo(String value) {
            addCriterion("freeze_no <=", value, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoLike(String value) {
            addCriterion("freeze_no like", value, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoNotLike(String value) {
            addCriterion("freeze_no not like", value, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoIn(List<String> values) {
            addCriterion("freeze_no in", values, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoNotIn(List<String> values) {
            addCriterion("freeze_no not in", values, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoBetween(String value1, String value2) {
            addCriterion("freeze_no between", value1, value2, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFreezeNoNotBetween(String value1, String value2) {
            addCriterion("freeze_no not between", value1, value2, "freezeNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoIsNull() {
            addCriterion("frozen_no is null");
            return (Criteria) this;
        }

        public Criteria andFrozenNoIsNotNull() {
            addCriterion("frozen_no is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenNoEqualTo(String value) {
            addCriterion("frozen_no =", value, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoNotEqualTo(String value) {
            addCriterion("frozen_no <>", value, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoGreaterThan(String value) {
            addCriterion("frozen_no >", value, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoGreaterThanOrEqualTo(String value) {
            addCriterion("frozen_no >=", value, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoLessThan(String value) {
            addCriterion("frozen_no <", value, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoLessThanOrEqualTo(String value) {
            addCriterion("frozen_no <=", value, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoLike(String value) {
            addCriterion("frozen_no like", value, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoNotLike(String value) {
            addCriterion("frozen_no not like", value, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoIn(List<String> values) {
            addCriterion("frozen_no in", values, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoNotIn(List<String> values) {
            addCriterion("frozen_no not in", values, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoBetween(String value1, String value2) {
            addCriterion("frozen_no between", value1, value2, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andFrozenNoNotBetween(String value1, String value2) {
            addCriterion("frozen_no not between", value1, value2, "frozenNo");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeIsNull() {
            addCriterion("item_counter_fee is null");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeIsNotNull() {
            addCriterion("item_counter_fee is not null");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeEqualTo(Money value) {
            addItemCounterFeeCriterion("item_counter_fee =", value, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeNotEqualTo(Money value) {
            addItemCounterFeeCriterion("item_counter_fee <>", value, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeGreaterThan(Money value) {
            addItemCounterFeeCriterion("item_counter_fee >", value, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeGreaterThanOrEqualTo(Money value) {
            addItemCounterFeeCriterion("item_counter_fee >=", value, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeLessThan(Money value) {
            addItemCounterFeeCriterion("item_counter_fee <", value, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeLessThanOrEqualTo(Money value) {
            addItemCounterFeeCriterion("item_counter_fee <=", value, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeIn(List<Money> values) {
            addItemCounterFeeCriterion("item_counter_fee in", values, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeNotIn(List<Money> values) {
            addItemCounterFeeCriterion("item_counter_fee not in", values, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeBetween(Money value1, Money value2) {
            addItemCounterFeeCriterion("item_counter_fee between", value1, value2, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeeNotBetween(Money value1, Money value2) {
            addItemCounterFeeCriterion("item_counter_fee not between", value1, value2, "itemCounterFee");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtIsNull() {
            addCriterion("success_amt is null");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtIsNotNull() {
            addCriterion("success_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtEqualTo(Money value) {
            addSuccessAmtCriterion("success_amt =", value, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtNotEqualTo(Money value) {
            addSuccessAmtCriterion("success_amt <>", value, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtGreaterThan(Money value) {
            addSuccessAmtCriterion("success_amt >", value, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtGreaterThanOrEqualTo(Money value) {
            addSuccessAmtCriterion("success_amt >=", value, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtLessThan(Money value) {
            addSuccessAmtCriterion("success_amt <", value, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtLessThanOrEqualTo(Money value) {
            addSuccessAmtCriterion("success_amt <=", value, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtIn(List<Money> values) {
            addSuccessAmtCriterion("success_amt in", values, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtNotIn(List<Money> values) {
            addSuccessAmtCriterion("success_amt not in", values, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtBetween(Money value1, Money value2) {
            addSuccessAmtCriterion("success_amt between", value1, value2, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessAmtNotBetween(Money value1, Money value2) {
            addSuccessAmtCriterion("success_amt not between", value1, value2, "successAmt");
            return (Criteria) this;
        }

        public Criteria andSuccessCountIsNull() {
            addCriterion("success_count is null");
            return (Criteria) this;
        }

        public Criteria andSuccessCountIsNotNull() {
            addCriterion("success_count is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessCountEqualTo(Integer value) {
            addCriterion("success_count =", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountNotEqualTo(Integer value) {
            addCriterion("success_count <>", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountGreaterThan(Integer value) {
            addCriterion("success_count >", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("success_count >=", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountLessThan(Integer value) {
            addCriterion("success_count <", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountLessThanOrEqualTo(Integer value) {
            addCriterion("success_count <=", value, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountIn(List<Integer> values) {
            addCriterion("success_count in", values, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountNotIn(List<Integer> values) {
            addCriterion("success_count not in", values, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountBetween(Integer value1, Integer value2) {
            addCriterion("success_count between", value1, value2, "successCount");
            return (Criteria) this;
        }

        public Criteria andSuccessCountNotBetween(Integer value1, Integer value2) {
            addCriterion("success_count not between", value1, value2, "successCount");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeIsNull() {
            addCriterion("file_fail_code is null");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeIsNotNull() {
            addCriterion("file_fail_code is not null");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeEqualTo(String value) {
            addCriterion("file_fail_code =", value, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeNotEqualTo(String value) {
            addCriterion("file_fail_code <>", value, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeGreaterThan(String value) {
            addCriterion("file_fail_code >", value, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("file_fail_code >=", value, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeLessThan(String value) {
            addCriterion("file_fail_code <", value, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeLessThanOrEqualTo(String value) {
            addCriterion("file_fail_code <=", value, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeLike(String value) {
            addCriterion("file_fail_code like", value, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeNotLike(String value) {
            addCriterion("file_fail_code not like", value, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeIn(List<String> values) {
            addCriterion("file_fail_code in", values, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeNotIn(List<String> values) {
            addCriterion("file_fail_code not in", values, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeBetween(String value1, String value2) {
            addCriterion("file_fail_code between", value1, value2, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFileFailCodeNotBetween(String value1, String value2) {
            addCriterion("file_fail_code not between", value1, value2, "fileFailCode");
            return (Criteria) this;
        }

        public Criteria andFailFileNameIsNull() {
            addCriterion("fail_file_name is null");
            return (Criteria) this;
        }

        public Criteria andFailFileNameIsNotNull() {
            addCriterion("fail_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFailFileNameEqualTo(String value) {
            addCriterion("fail_file_name =", value, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameNotEqualTo(String value) {
            addCriterion("fail_file_name <>", value, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameGreaterThan(String value) {
            addCriterion("fail_file_name >", value, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("fail_file_name >=", value, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameLessThan(String value) {
            addCriterion("fail_file_name <", value, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameLessThanOrEqualTo(String value) {
            addCriterion("fail_file_name <=", value, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameLike(String value) {
            addCriterion("fail_file_name like", value, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameNotLike(String value) {
            addCriterion("fail_file_name not like", value, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameIn(List<String> values) {
            addCriterion("fail_file_name in", values, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameNotIn(List<String> values) {
            addCriterion("fail_file_name not in", values, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameBetween(String value1, String value2) {
            addCriterion("fail_file_name between", value1, value2, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFileNameNotBetween(String value1, String value2) {
            addCriterion("fail_file_name not between", value1, value2, "failFileName");
            return (Criteria) this;
        }

        public Criteria andFailFilePathIsNull() {
            addCriterion("fail_file_path is null");
            return (Criteria) this;
        }

        public Criteria andFailFilePathIsNotNull() {
            addCriterion("fail_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFailFilePathEqualTo(String value) {
            addCriterion("fail_file_path =", value, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathNotEqualTo(String value) {
            addCriterion("fail_file_path <>", value, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathGreaterThan(String value) {
            addCriterion("fail_file_path >", value, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("fail_file_path >=", value, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathLessThan(String value) {
            addCriterion("fail_file_path <", value, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathLessThanOrEqualTo(String value) {
            addCriterion("fail_file_path <=", value, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathLike(String value) {
            addCriterion("fail_file_path like", value, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathNotLike(String value) {
            addCriterion("fail_file_path not like", value, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathIn(List<String> values) {
            addCriterion("fail_file_path in", values, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathNotIn(List<String> values) {
            addCriterion("fail_file_path not in", values, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathBetween(String value1, String value2) {
            addCriterion("fail_file_path between", value1, value2, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andFailFilePathNotBetween(String value1, String value2) {
            addCriterion("fail_file_path not between", value1, value2, "failFilePath");
            return (Criteria) this;
        }

        public Criteria andDubboGroupIsNull() {
            addCriterion("dubbo_group is null");
            return (Criteria) this;
        }

        public Criteria andDubboGroupIsNotNull() {
            addCriterion("dubbo_group is not null");
            return (Criteria) this;
        }

        public Criteria andDubboGroupEqualTo(String value) {
            addCriterion("dubbo_group =", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupNotEqualTo(String value) {
            addCriterion("dubbo_group <>", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupGreaterThan(String value) {
            addCriterion("dubbo_group >", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupGreaterThanOrEqualTo(String value) {
            addCriterion("dubbo_group >=", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupLessThan(String value) {
            addCriterion("dubbo_group <", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupLessThanOrEqualTo(String value) {
            addCriterion("dubbo_group <=", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupLike(String value) {
            addCriterion("dubbo_group like", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupNotLike(String value) {
            addCriterion("dubbo_group not like", value, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupIn(List<String> values) {
            addCriterion("dubbo_group in", values, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupNotIn(List<String> values) {
            addCriterion("dubbo_group not in", values, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupBetween(String value1, String value2) {
            addCriterion("dubbo_group between", value1, value2, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboGroupNotBetween(String value1, String value2) {
            addCriterion("dubbo_group not between", value1, value2, "dubboGroup");
            return (Criteria) this;
        }

        public Criteria andDubboVersionIsNull() {
            addCriterion("dubbo_version is null");
            return (Criteria) this;
        }

        public Criteria andDubboVersionIsNotNull() {
            addCriterion("dubbo_version is not null");
            return (Criteria) this;
        }

        public Criteria andDubboVersionEqualTo(String value) {
            addCriterion("dubbo_version =", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionNotEqualTo(String value) {
            addCriterion("dubbo_version <>", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionGreaterThan(String value) {
            addCriterion("dubbo_version >", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionGreaterThanOrEqualTo(String value) {
            addCriterion("dubbo_version >=", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionLessThan(String value) {
            addCriterion("dubbo_version <", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionLessThanOrEqualTo(String value) {
            addCriterion("dubbo_version <=", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionLike(String value) {
            addCriterion("dubbo_version like", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionNotLike(String value) {
            addCriterion("dubbo_version not like", value, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionIn(List<String> values) {
            addCriterion("dubbo_version in", values, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionNotIn(List<String> values) {
            addCriterion("dubbo_version not in", values, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionBetween(String value1, String value2) {
            addCriterion("dubbo_version between", value1, value2, "dubboVersion");
            return (Criteria) this;
        }

        public Criteria andDubboVersionNotBetween(String value1, String value2) {
            addCriterion("dubbo_version not between", value1, value2, "dubboVersion");
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

        public Criteria andBehalfTypeIsNull() {
            addCriterion("behalf_type is null");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeIsNotNull() {
            addCriterion("behalf_type is not null");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeEqualTo(String value) {
            addCriterion("behalf_type =", value, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeNotEqualTo(String value) {
            addCriterion("behalf_type <>", value, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeGreaterThan(String value) {
            addCriterion("behalf_type >", value, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("behalf_type >=", value, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeLessThan(String value) {
            addCriterion("behalf_type <", value, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeLessThanOrEqualTo(String value) {
            addCriterion("behalf_type <=", value, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeLike(String value) {
            addCriterion("behalf_type like", value, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeNotLike(String value) {
            addCriterion("behalf_type not like", value, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeIn(List<String> values) {
            addCriterion("behalf_type in", values, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeNotIn(List<String> values) {
            addCriterion("behalf_type not in", values, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeBetween(String value1, String value2) {
            addCriterion("behalf_type between", value1, value2, "behalfType");
            return (Criteria) this;
        }

        public Criteria andBehalfTypeNotBetween(String value1, String value2) {
            addCriterion("behalf_type not between", value1, value2, "behalfType");
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

        public Criteria andBehalfCountPublicIsNull() {
            addCriterion("behalf_count_public is null");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicIsNotNull() {
            addCriterion("behalf_count_public is not null");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicEqualTo(Integer value) {
            addCriterion("behalf_count_public =", value, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicNotEqualTo(Integer value) {
            addCriterion("behalf_count_public <>", value, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicGreaterThan(Integer value) {
            addCriterion("behalf_count_public >", value, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicGreaterThanOrEqualTo(Integer value) {
            addCriterion("behalf_count_public >=", value, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicLessThan(Integer value) {
            addCriterion("behalf_count_public <", value, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicLessThanOrEqualTo(Integer value) {
            addCriterion("behalf_count_public <=", value, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicIn(List<Integer> values) {
            addCriterion("behalf_count_public in", values, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicNotIn(List<Integer> values) {
            addCriterion("behalf_count_public not in", values, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicBetween(Integer value1, Integer value2) {
            addCriterion("behalf_count_public between", value1, value2, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andBehalfCountPublicNotBetween(Integer value1, Integer value2) {
            addCriterion("behalf_count_public not between", value1, value2, "behalfCountPublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicIsNull() {
            addCriterion("item_counter_fee_public is null");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicIsNotNull() {
            addCriterion("item_counter_fee_public is not null");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicEqualTo(Money value) {
            addItemCounterFeePublicCriterion("item_counter_fee_public =", value, "itemCounterFeePublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicNotEqualTo(Money value) {
            addItemCounterFeePublicCriterion("item_counter_fee_public <>", value, "itemCounterFeePublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicGreaterThan(Money value) {
            addItemCounterFeePublicCriterion("item_counter_fee_public >", value, "itemCounterFeePublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicGreaterThanOrEqualTo(Money value) {
            addItemCounterFeePublicCriterion("item_counter_fee_public >=", value, "itemCounterFeePublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicLessThan(Money value) {
            addItemCounterFeePublicCriterion("item_counter_fee_public <", value, "itemCounterFeePublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicLessThanOrEqualTo(Money value) {
            addItemCounterFeePublicCriterion("item_counter_fee_public <=", value, "itemCounterFeePublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicIn(List<Money> values) {
            addItemCounterFeePublicCriterion("item_counter_fee_public in", values, "itemCounterFeePublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicNotIn(List<Money> values) {
            addItemCounterFeePublicCriterion("item_counter_fee_public not in", values, "itemCounterFeePublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicBetween(Money value1, Money value2) {
            addItemCounterFeePublicCriterion("item_counter_fee_public between", value1, value2, "itemCounterFeePublic");
            return (Criteria) this;
        }

        public Criteria andItemCounterFeePublicNotBetween(Money value1, Money value2) {
            addItemCounterFeePublicCriterion("item_counter_fee_public not between", value1, value2, "itemCounterFeePublic");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table batch_behalf
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
     * corresponds to the database table batch_behalf
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