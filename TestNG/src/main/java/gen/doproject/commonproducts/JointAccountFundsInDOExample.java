/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointAccountFundsInDOExample.java
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
import java.util.Iterator;
import java.util.List;

public class JointAccountFundsInDOExample {
    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    public JointAccountFundsInDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table joint_account_funds_in
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
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table joint_account_funds_in
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
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> amountCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            amountCriteria = new ArrayList<Criterion>();
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

        public boolean isValid() {
            return criteria.size() > 0
                || amountCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(amountCriteria);
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andBankSerialNoIsNull() {
            addCriterion("bank_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoIsNotNull() {
            addCriterion("bank_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoEqualTo(String value) {
            addCriterion("bank_serial_no =", value, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoNotEqualTo(String value) {
            addCriterion("bank_serial_no <>", value, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoGreaterThan(String value) {
            addCriterion("bank_serial_no >", value, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_serial_no >=", value, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoLessThan(String value) {
            addCriterion("bank_serial_no <", value, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoLessThanOrEqualTo(String value) {
            addCriterion("bank_serial_no <=", value, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoLike(String value) {
            addCriterion("bank_serial_no like", value, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoNotLike(String value) {
            addCriterion("bank_serial_no not like", value, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoIn(List<String> values) {
            addCriterion("bank_serial_no in", values, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoNotIn(List<String> values) {
            addCriterion("bank_serial_no not in", values, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoBetween(String value1, String value2) {
            addCriterion("bank_serial_no between", value1, value2, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andBankSerialNoNotBetween(String value1, String value2) {
            addCriterion("bank_serial_no not between", value1, value2, "bankSerialNo");
            return (Criteria) this;
        }

        public Criteria andDepositIdIsNull() {
            addCriterion("deposit_id is null");
            return (Criteria) this;
        }

        public Criteria andDepositIdIsNotNull() {
            addCriterion("deposit_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepositIdEqualTo(String value) {
            addCriterion("deposit_id =", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotEqualTo(String value) {
            addCriterion("deposit_id <>", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdGreaterThan(String value) {
            addCriterion("deposit_id >", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_id >=", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLessThan(String value) {
            addCriterion("deposit_id <", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLessThanOrEqualTo(String value) {
            addCriterion("deposit_id <=", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLike(String value) {
            addCriterion("deposit_id like", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotLike(String value) {
            addCriterion("deposit_id not like", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdIn(List<String> values) {
            addCriterion("deposit_id in", values, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotIn(List<String> values) {
            addCriterion("deposit_id not in", values, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdBetween(String value1, String value2) {
            addCriterion("deposit_id between", value1, value2, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotBetween(String value1, String value2) {
            addCriterion("deposit_id not between", value1, value2, "depositId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeIsNull() {
            addCriterion("joint_account_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeIsNotNull() {
            addCriterion("joint_account_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeEqualTo(String value) {
            addCriterion("joint_account_bank_code =", value, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeNotEqualTo(String value) {
            addCriterion("joint_account_bank_code <>", value, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeGreaterThan(String value) {
            addCriterion("joint_account_bank_code >", value, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("joint_account_bank_code >=", value, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeLessThan(String value) {
            addCriterion("joint_account_bank_code <", value, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeLessThanOrEqualTo(String value) {
            addCriterion("joint_account_bank_code <=", value, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeLike(String value) {
            addCriterion("joint_account_bank_code like", value, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeNotLike(String value) {
            addCriterion("joint_account_bank_code not like", value, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeIn(List<String> values) {
            addCriterion("joint_account_bank_code in", values, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeNotIn(List<String> values) {
            addCriterion("joint_account_bank_code not in", values, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeBetween(String value1, String value2) {
            addCriterion("joint_account_bank_code between", value1, value2, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankCodeNotBetween(String value1, String value2) {
            addCriterion("joint_account_bank_code not between", value1, value2, "jointAccountBankCode");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknIsNull() {
            addCriterion("joint_account_bank_ibkn is null");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknIsNotNull() {
            addCriterion("joint_account_bank_ibkn is not null");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknEqualTo(String value) {
            addCriterion("joint_account_bank_ibkn =", value, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknNotEqualTo(String value) {
            addCriterion("joint_account_bank_ibkn <>", value, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknGreaterThan(String value) {
            addCriterion("joint_account_bank_ibkn >", value, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknGreaterThanOrEqualTo(String value) {
            addCriterion("joint_account_bank_ibkn >=", value, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknLessThan(String value) {
            addCriterion("joint_account_bank_ibkn <", value, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknLessThanOrEqualTo(String value) {
            addCriterion("joint_account_bank_ibkn <=", value, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknLike(String value) {
            addCriterion("joint_account_bank_ibkn like", value, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknNotLike(String value) {
            addCriterion("joint_account_bank_ibkn not like", value, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknIn(List<String> values) {
            addCriterion("joint_account_bank_ibkn in", values, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknNotIn(List<String> values) {
            addCriterion("joint_account_bank_ibkn not in", values, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknBetween(String value1, String value2) {
            addCriterion("joint_account_bank_ibkn between", value1, value2, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankIbknNotBetween(String value1, String value2) {
            addCriterion("joint_account_bank_ibkn not between", value1, value2, "jointAccountBankIbkn");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameIsNull() {
            addCriterion("joint_account_name is null");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameIsNotNull() {
            addCriterion("joint_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameEqualTo(String value) {
            addCriterion("joint_account_name =", value, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameNotEqualTo(String value) {
            addCriterion("joint_account_name <>", value, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameGreaterThan(String value) {
            addCriterion("joint_account_name >", value, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("joint_account_name >=", value, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameLessThan(String value) {
            addCriterion("joint_account_name <", value, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameLessThanOrEqualTo(String value) {
            addCriterion("joint_account_name <=", value, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameLike(String value) {
            addCriterion("joint_account_name like", value, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameNotLike(String value) {
            addCriterion("joint_account_name not like", value, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameIn(List<String> values) {
            addCriterion("joint_account_name in", values, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameNotIn(List<String> values) {
            addCriterion("joint_account_name not in", values, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameBetween(String value1, String value2) {
            addCriterion("joint_account_name between", value1, value2, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andJointAccountNameNotBetween(String value1, String value2) {
            addCriterion("joint_account_name not between", value1, value2, "jointAccountName");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("operation not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoIsNull() {
            addCriterion("payer_bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoIsNotNull() {
            addCriterion("payer_bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoEqualTo(String value) {
            addCriterion("payer_bank_account_no =", value, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoNotEqualTo(String value) {
            addCriterion("payer_bank_account_no <>", value, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoGreaterThan(String value) {
            addCriterion("payer_bank_account_no >", value, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_account_no >=", value, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoLessThan(String value) {
            addCriterion("payer_bank_account_no <", value, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_account_no <=", value, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoLike(String value) {
            addCriterion("payer_bank_account_no like", value, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoNotLike(String value) {
            addCriterion("payer_bank_account_no not like", value, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoIn(List<String> values) {
            addCriterion("payer_bank_account_no in", values, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoNotIn(List<String> values) {
            addCriterion("payer_bank_account_no not in", values, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoBetween(String value1, String value2) {
            addCriterion("payer_bank_account_no between", value1, value2, "payerBankAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankAccountNoNotBetween(String value1, String value2) {
            addCriterion("payer_bank_account_no not between", value1, value2, "payerBankAccountNo");
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

        public Criteria andPayerBankNameIsNull() {
            addCriterion("payer_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameIsNotNull() {
            addCriterion("payer_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameEqualTo(String value) {
            addCriterion("payer_bank_name =", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameNotEqualTo(String value) {
            addCriterion("payer_bank_name <>", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameGreaterThan(String value) {
            addCriterion("payer_bank_name >", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_name >=", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameLessThan(String value) {
            addCriterion("payer_bank_name <", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_name <=", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameLike(String value) {
            addCriterion("payer_bank_name like", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameNotLike(String value) {
            addCriterion("payer_bank_name not like", value, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameIn(List<String> values) {
            addCriterion("payer_bank_name in", values, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameNotIn(List<String> values) {
            addCriterion("payer_bank_name not in", values, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameBetween(String value1, String value2) {
            addCriterion("payer_bank_name between", value1, value2, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankNameNotBetween(String value1, String value2) {
            addCriterion("payer_bank_name not between", value1, value2, "payerBankName");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeIsNull() {
            addCriterion("payer_bank_swift_code is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeIsNotNull() {
            addCriterion("payer_bank_swift_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeEqualTo(String value) {
            addCriterion("payer_bank_swift_code =", value, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeNotEqualTo(String value) {
            addCriterion("payer_bank_swift_code <>", value, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeGreaterThan(String value) {
            addCriterion("payer_bank_swift_code >", value, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_swift_code >=", value, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeLessThan(String value) {
            addCriterion("payer_bank_swift_code <", value, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_swift_code <=", value, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeLike(String value) {
            addCriterion("payer_bank_swift_code like", value, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeNotLike(String value) {
            addCriterion("payer_bank_swift_code not like", value, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeIn(List<String> values) {
            addCriterion("payer_bank_swift_code in", values, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeNotIn(List<String> values) {
            addCriterion("payer_bank_swift_code not in", values, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeBetween(String value1, String value2) {
            addCriterion("payer_bank_swift_code between", value1, value2, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankSwiftCodeNotBetween(String value1, String value2) {
            addCriterion("payer_bank_swift_code not between", value1, value2, "payerBankSwiftCode");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNull() {
            addCriterion("payer_name is null");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNotNull() {
            addCriterion("payer_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNameEqualTo(String value) {
            addCriterion("payer_name =", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotEqualTo(String value) {
            addCriterion("payer_name <>", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThan(String value) {
            addCriterion("payer_name >", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("payer_name >=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThan(String value) {
            addCriterion("payer_name <", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThanOrEqualTo(String value) {
            addCriterion("payer_name <=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLike(String value) {
            addCriterion("payer_name like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotLike(String value) {
            addCriterion("payer_name not like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameIn(List<String> values) {
            addCriterion("payer_name in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotIn(List<String> values) {
            addCriterion("payer_name not in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameBetween(String value1, String value2) {
            addCriterion("payer_name between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotBetween(String value1, String value2) {
            addCriterion("payer_name not between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoIsNull() {
            addCriterion("sublayer_order_no is null");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoIsNotNull() {
            addCriterion("sublayer_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoEqualTo(String value) {
            addCriterion("sublayer_order_no =", value, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoNotEqualTo(String value) {
            addCriterion("sublayer_order_no <>", value, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoGreaterThan(String value) {
            addCriterion("sublayer_order_no >", value, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("sublayer_order_no >=", value, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoLessThan(String value) {
            addCriterion("sublayer_order_no <", value, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoLessThanOrEqualTo(String value) {
            addCriterion("sublayer_order_no <=", value, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoLike(String value) {
            addCriterion("sublayer_order_no like", value, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoNotLike(String value) {
            addCriterion("sublayer_order_no not like", value, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoIn(List<String> values) {
            addCriterion("sublayer_order_no in", values, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoNotIn(List<String> values) {
            addCriterion("sublayer_order_no not in", values, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoBetween(String value1, String value2) {
            addCriterion("sublayer_order_no between", value1, value2, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andSublayerOrderNoNotBetween(String value1, String value2) {
            addCriterion("sublayer_order_no not between", value1, value2, "sublayerOrderNo");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNull() {
            addCriterion("trans_date is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("trans_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(Date value) {
            addCriterion("trans_date =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(Date value) {
            addCriterion("trans_date <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(Date value) {
            addCriterion("trans_date >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(Date value) {
            addCriterion("trans_date >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(Date value) {
            addCriterion("trans_date <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(Date value) {
            addCriterion("trans_date <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<Date> values) {
            addCriterion("trans_date in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<Date> values) {
            addCriterion("trans_date not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(Date value1, Date value2) {
            addCriterion("trans_date between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(Date value1, Date value2) {
            addCriterion("trans_date not between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoIsNull() {
            addCriterion("joint_account_no is null");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoIsNotNull() {
            addCriterion("joint_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoEqualTo(Long value) {
            addCriterion("joint_account_no =", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoNotEqualTo(Long value) {
            addCriterion("joint_account_no <>", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoGreaterThan(Long value) {
            addCriterion("joint_account_no >", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoGreaterThanOrEqualTo(Long value) {
            addCriterion("joint_account_no >=", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoLessThan(Long value) {
            addCriterion("joint_account_no <", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoLessThanOrEqualTo(Long value) {
            addCriterion("joint_account_no <=", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoIn(List<Long> values) {
            addCriterion("joint_account_no in", values, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoNotIn(List<Long> values) {
            addCriterion("joint_account_no not in", values, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoBetween(Long value1, Long value2) {
            addCriterion("joint_account_no between", value1, value2, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoNotBetween(Long value1, Long value2) {
            addCriterion("joint_account_no not between", value1, value2, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIsNull() {
            addCriterion("is_freeze is null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIsNotNull() {
            addCriterion("is_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeEqualTo(Integer value) {
            addCriterion("is_freeze =", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotEqualTo(Integer value) {
            addCriterion("is_freeze <>", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeGreaterThan(Integer value) {
            addCriterion("is_freeze >", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_freeze >=", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeLessThan(Integer value) {
            addCriterion("is_freeze <", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeLessThanOrEqualTo(Integer value) {
            addCriterion("is_freeze <=", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIn(List<Integer> values) {
            addCriterion("is_freeze in", values, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotIn(List<Integer> values) {
            addCriterion("is_freeze not in", values, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeBetween(Integer value1, Integer value2) {
            addCriterion("is_freeze between", value1, value2, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_freeze not between", value1, value2, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andBusiDateIsNull() {
            addCriterion("busi_date is null");
            return (Criteria) this;
        }

        public Criteria andBusiDateIsNotNull() {
            addCriterion("busi_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusiDateEqualTo(Date value) {
            addCriterionForJDBCDate("busi_date =", value, "busiDate");
            return (Criteria) this;
        }

        public Criteria andBusiDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("busi_date <>", value, "busiDate");
            return (Criteria) this;
        }

        public Criteria andBusiDateGreaterThan(Date value) {
            addCriterionForJDBCDate("busi_date >", value, "busiDate");
            return (Criteria) this;
        }

        public Criteria andBusiDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("busi_date >=", value, "busiDate");
            return (Criteria) this;
        }

        public Criteria andBusiDateLessThan(Date value) {
            addCriterionForJDBCDate("busi_date <", value, "busiDate");
            return (Criteria) this;
        }

        public Criteria andBusiDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("busi_date <=", value, "busiDate");
            return (Criteria) this;
        }

        public Criteria andBusiDateIn(List<Date> values) {
            addCriterionForJDBCDate("busi_date in", values, "busiDate");
            return (Criteria) this;
        }

        public Criteria andBusiDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("busi_date not in", values, "busiDate");
            return (Criteria) this;
        }

        public Criteria andBusiDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("busi_date between", value1, value2, "busiDate");
            return (Criteria) this;
        }

        public Criteria andBusiDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("busi_date not between", value1, value2, "busiDate");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameIsNull() {
            addCriterion("joint_account_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameIsNotNull() {
            addCriterion("joint_account_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameEqualTo(String value) {
            addCriterion("joint_account_bank_name =", value, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameNotEqualTo(String value) {
            addCriterion("joint_account_bank_name <>", value, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameGreaterThan(String value) {
            addCriterion("joint_account_bank_name >", value, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("joint_account_bank_name >=", value, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameLessThan(String value) {
            addCriterion("joint_account_bank_name <", value, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameLessThanOrEqualTo(String value) {
            addCriterion("joint_account_bank_name <=", value, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameLike(String value) {
            addCriterion("joint_account_bank_name like", value, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameNotLike(String value) {
            addCriterion("joint_account_bank_name not like", value, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameIn(List<String> values) {
            addCriterion("joint_account_bank_name in", values, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameNotIn(List<String> values) {
            addCriterion("joint_account_bank_name not in", values, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameBetween(String value1, String value2) {
            addCriterion("joint_account_bank_name between", value1, value2, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andJointAccountBankNameNotBetween(String value1, String value2) {
            addCriterion("joint_account_bank_name not between", value1, value2, "jointAccountBankName");
            return (Criteria) this;
        }

        public Criteria andUseInfoIsNull() {
            addCriterion("use_info is null");
            return (Criteria) this;
        }

        public Criteria andUseInfoIsNotNull() {
            addCriterion("use_info is not null");
            return (Criteria) this;
        }

        public Criteria andUseInfoEqualTo(String value) {
            addCriterion("use_info =", value, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoNotEqualTo(String value) {
            addCriterion("use_info <>", value, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoGreaterThan(String value) {
            addCriterion("use_info >", value, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("use_info >=", value, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoLessThan(String value) {
            addCriterion("use_info <", value, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoLessThanOrEqualTo(String value) {
            addCriterion("use_info <=", value, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoLike(String value) {
            addCriterion("use_info like", value, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoNotLike(String value) {
            addCriterion("use_info not like", value, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoIn(List<String> values) {
            addCriterion("use_info in", values, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoNotIn(List<String> values) {
            addCriterion("use_info not in", values, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoBetween(String value1, String value2) {
            addCriterion("use_info between", value1, value2, "useInfo");
            return (Criteria) this;
        }

        public Criteria andUseInfoNotBetween(String value1, String value2) {
            addCriterion("use_info not between", value1, value2, "useInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAcsrefIsNull() {
            addCriterion("acsref is null");
            return (Criteria) this;
        }

        public Criteria andAcsrefIsNotNull() {
            addCriterion("acsref is not null");
            return (Criteria) this;
        }

        public Criteria andAcsrefEqualTo(String value) {
            addCriterion("acsref =", value, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefNotEqualTo(String value) {
            addCriterion("acsref <>", value, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefGreaterThan(String value) {
            addCriterion("acsref >", value, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefGreaterThanOrEqualTo(String value) {
            addCriterion("acsref >=", value, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefLessThan(String value) {
            addCriterion("acsref <", value, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefLessThanOrEqualTo(String value) {
            addCriterion("acsref <=", value, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefLike(String value) {
            addCriterion("acsref like", value, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefNotLike(String value) {
            addCriterion("acsref not like", value, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefIn(List<String> values) {
            addCriterion("acsref in", values, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefNotIn(List<String> values) {
            addCriterion("acsref not in", values, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefBetween(String value1, String value2) {
            addCriterion("acsref between", value1, value2, "acsref");
            return (Criteria) this;
        }

        public Criteria andAcsrefNotBetween(String value1, String value2) {
            addCriterion("acsref not between", value1, value2, "acsref");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptIsNull() {
            addCriterion("remit_postscript is null");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptIsNotNull() {
            addCriterion("remit_postscript is not null");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptEqualTo(String value) {
            addCriterion("remit_postscript =", value, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptNotEqualTo(String value) {
            addCriterion("remit_postscript <>", value, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptGreaterThan(String value) {
            addCriterion("remit_postscript >", value, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptGreaterThanOrEqualTo(String value) {
            addCriterion("remit_postscript >=", value, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptLessThan(String value) {
            addCriterion("remit_postscript <", value, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptLessThanOrEqualTo(String value) {
            addCriterion("remit_postscript <=", value, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptLike(String value) {
            addCriterion("remit_postscript like", value, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptNotLike(String value) {
            addCriterion("remit_postscript not like", value, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptIn(List<String> values) {
            addCriterion("remit_postscript in", values, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptNotIn(List<String> values) {
            addCriterion("remit_postscript not in", values, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptBetween(String value1, String value2) {
            addCriterion("remit_postscript between", value1, value2, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andRemitPostscriptNotBetween(String value1, String value2) {
            addCriterion("remit_postscript not between", value1, value2, "remitPostscript");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeIsNull() {
            addCriterion("payer_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeIsNotNull() {
            addCriterion("payer_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeEqualTo(String value) {
            addCriterion("payer_bank_code =", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeNotEqualTo(String value) {
            addCriterion("payer_bank_code <>", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeGreaterThan(String value) {
            addCriterion("payer_bank_code >", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("payer_bank_code >=", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeLessThan(String value) {
            addCriterion("payer_bank_code <", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeLessThanOrEqualTo(String value) {
            addCriterion("payer_bank_code <=", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeLike(String value) {
            addCriterion("payer_bank_code like", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeNotLike(String value) {
            addCriterion("payer_bank_code not like", value, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeIn(List<String> values) {
            addCriterion("payer_bank_code in", values, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeNotIn(List<String> values) {
            addCriterion("payer_bank_code not in", values, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeBetween(String value1, String value2) {
            addCriterion("payer_bank_code between", value1, value2, "payerBankCode");
            return (Criteria) this;
        }

        public Criteria andPayerBankCodeNotBetween(String value1, String value2) {
            addCriterion("payer_bank_code not between", value1, value2, "payerBankCode");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table joint_account_funds_in
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
     * corresponds to the database table joint_account_funds_in
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