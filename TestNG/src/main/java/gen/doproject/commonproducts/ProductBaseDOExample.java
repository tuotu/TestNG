/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductBaseDOExample.java
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

public class ProductBaseDOExample {
    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    public ProductBaseDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table product_base
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
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table product_base
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
     * corresponds to the database table product_base
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
    }

    /**
     * corresponds to the database table product_base
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
     * corresponds to the database table product_base
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