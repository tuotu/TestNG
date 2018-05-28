/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferConfigurationDOExample.java
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

public class TransferConfigurationDOExample {
    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    public TransferConfigurationDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table transfer_configuration
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
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table transfer_configuration
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
     * corresponds to the database table transfer_configuration
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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

        public Criteria andChargeCodeIsNull() {
            addCriterion("charge_code is null");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIsNotNull() {
            addCriterion("charge_code is not null");
            return (Criteria) this;
        }

        public Criteria andChargeCodeEqualTo(String value) {
            addCriterion("charge_code =", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotEqualTo(String value) {
            addCriterion("charge_code <>", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeGreaterThan(String value) {
            addCriterion("charge_code >", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_code >=", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLessThan(String value) {
            addCriterion("charge_code <", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLessThanOrEqualTo(String value) {
            addCriterion("charge_code <=", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLike(String value) {
            addCriterion("charge_code like", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotLike(String value) {
            addCriterion("charge_code not like", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIn(List<String> values) {
            addCriterion("charge_code in", values, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotIn(List<String> values) {
            addCriterion("charge_code not in", values, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeBetween(String value1, String value2) {
            addCriterion("charge_code between", value1, value2, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotBetween(String value1, String value2) {
            addCriterion("charge_code not between", value1, value2, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIsNull() {
            addCriterion("charge_status is null");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIsNotNull() {
            addCriterion("charge_status is not null");
            return (Criteria) this;
        }

        public Criteria andChargeStatusEqualTo(String value) {
            addCriterion("charge_status =", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotEqualTo(String value) {
            addCriterion("charge_status <>", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusGreaterThan(String value) {
            addCriterion("charge_status >", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("charge_status >=", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLessThan(String value) {
            addCriterion("charge_status <", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLessThanOrEqualTo(String value) {
            addCriterion("charge_status <=", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLike(String value) {
            addCriterion("charge_status like", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotLike(String value) {
            addCriterion("charge_status not like", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIn(List<String> values) {
            addCriterion("charge_status in", values, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotIn(List<String> values) {
            addCriterion("charge_status not in", values, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusBetween(String value1, String value2) {
            addCriterion("charge_status between", value1, value2, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotBetween(String value1, String value2) {
            addCriterion("charge_status not between", value1, value2, "chargeStatus");
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

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andNormalStatusIsNull() {
            addCriterion("normal_status is null");
            return (Criteria) this;
        }

        public Criteria andNormalStatusIsNotNull() {
            addCriterion("normal_status is not null");
            return (Criteria) this;
        }

        public Criteria andNormalStatusEqualTo(String value) {
            addCriterion("normal_status =", value, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusNotEqualTo(String value) {
            addCriterion("normal_status <>", value, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusGreaterThan(String value) {
            addCriterion("normal_status >", value, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("normal_status >=", value, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusLessThan(String value) {
            addCriterion("normal_status <", value, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusLessThanOrEqualTo(String value) {
            addCriterion("normal_status <=", value, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusLike(String value) {
            addCriterion("normal_status like", value, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusNotLike(String value) {
            addCriterion("normal_status not like", value, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusIn(List<String> values) {
            addCriterion("normal_status in", values, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusNotIn(List<String> values) {
            addCriterion("normal_status not in", values, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusBetween(String value1, String value2) {
            addCriterion("normal_status between", value1, value2, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andNormalStatusNotBetween(String value1, String value2) {
            addCriterion("normal_status not between", value1, value2, "normalStatus");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeIsNull() {
            addCriterion("parent_product_code is null");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeIsNotNull() {
            addCriterion("parent_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeEqualTo(String value) {
            addCriterion("parent_product_code =", value, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeNotEqualTo(String value) {
            addCriterion("parent_product_code <>", value, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeGreaterThan(String value) {
            addCriterion("parent_product_code >", value, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_product_code >=", value, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeLessThan(String value) {
            addCriterion("parent_product_code <", value, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_product_code <=", value, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeLike(String value) {
            addCriterion("parent_product_code like", value, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeNotLike(String value) {
            addCriterion("parent_product_code not like", value, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeIn(List<String> values) {
            addCriterion("parent_product_code in", values, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeNotIn(List<String> values) {
            addCriterion("parent_product_code not in", values, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeBetween(String value1, String value2) {
            addCriterion("parent_product_code between", value1, value2, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductCodeNotBetween(String value1, String value2) {
            addCriterion("parent_product_code not between", value1, value2, "parentProductCode");
            return (Criteria) this;
        }

        public Criteria andParentProductNameIsNull() {
            addCriterion("parent_product_name is null");
            return (Criteria) this;
        }

        public Criteria andParentProductNameIsNotNull() {
            addCriterion("parent_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentProductNameEqualTo(String value) {
            addCriterion("parent_product_name =", value, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameNotEqualTo(String value) {
            addCriterion("parent_product_name <>", value, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameGreaterThan(String value) {
            addCriterion("parent_product_name >", value, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_product_name >=", value, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameLessThan(String value) {
            addCriterion("parent_product_name <", value, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameLessThanOrEqualTo(String value) {
            addCriterion("parent_product_name <=", value, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameLike(String value) {
            addCriterion("parent_product_name like", value, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameNotLike(String value) {
            addCriterion("parent_product_name not like", value, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameIn(List<String> values) {
            addCriterion("parent_product_name in", values, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameNotIn(List<String> values) {
            addCriterion("parent_product_name not in", values, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameBetween(String value1, String value2) {
            addCriterion("parent_product_name between", value1, value2, "parentProductName");
            return (Criteria) this;
        }

        public Criteria andParentProductNameNotBetween(String value1, String value2) {
            addCriterion("parent_product_name not between", value1, value2, "parentProductName");
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesIsNull() {
            addCriterion("transfer_method_codes is null");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesIsNotNull() {
            addCriterion("transfer_method_codes is not null");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesEqualTo(String value) {
            addCriterion("transfer_method_codes =", value, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesNotEqualTo(String value) {
            addCriterion("transfer_method_codes <>", value, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesGreaterThan(String value) {
            addCriterion("transfer_method_codes >", value, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_method_codes >=", value, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesLessThan(String value) {
            addCriterion("transfer_method_codes <", value, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesLessThanOrEqualTo(String value) {
            addCriterion("transfer_method_codes <=", value, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesLike(String value) {
            addCriterion("transfer_method_codes like", value, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesNotLike(String value) {
            addCriterion("transfer_method_codes not like", value, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesIn(List<String> values) {
            addCriterion("transfer_method_codes in", values, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesNotIn(List<String> values) {
            addCriterion("transfer_method_codes not in", values, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesBetween(String value1, String value2) {
            addCriterion("transfer_method_codes between", value1, value2, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferMethodCodesNotBetween(String value1, String value2) {
            addCriterion("transfer_method_codes not between", value1, value2, "transferMethodCodes");
            return (Criteria) this;
        }

        public Criteria andTransferProductIsNull() {
            addCriterion("transfer_product is null");
            return (Criteria) this;
        }

        public Criteria andTransferProductIsNotNull() {
            addCriterion("transfer_product is not null");
            return (Criteria) this;
        }

        public Criteria andTransferProductEqualTo(String value) {
            addCriterion("transfer_product =", value, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductNotEqualTo(String value) {
            addCriterion("transfer_product <>", value, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductGreaterThan(String value) {
            addCriterion("transfer_product >", value, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_product >=", value, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductLessThan(String value) {
            addCriterion("transfer_product <", value, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductLessThanOrEqualTo(String value) {
            addCriterion("transfer_product <=", value, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductLike(String value) {
            addCriterion("transfer_product like", value, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductNotLike(String value) {
            addCriterion("transfer_product not like", value, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductIn(List<String> values) {
            addCriterion("transfer_product in", values, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductNotIn(List<String> values) {
            addCriterion("transfer_product not in", values, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductBetween(String value1, String value2) {
            addCriterion("transfer_product between", value1, value2, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andTransferProductNotBetween(String value1, String value2) {
            addCriterion("transfer_product not between", value1, value2, "transferProduct");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitIsNull() {
            addCriterion("verify_limit is null");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitIsNotNull() {
            addCriterion("verify_limit is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitEqualTo(Integer value) {
            addCriterion("verify_limit =", value, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitNotEqualTo(Integer value) {
            addCriterion("verify_limit <>", value, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitGreaterThan(Integer value) {
            addCriterion("verify_limit >", value, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_limit >=", value, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitLessThan(Integer value) {
            addCriterion("verify_limit <", value, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitLessThanOrEqualTo(Integer value) {
            addCriterion("verify_limit <=", value, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitIn(List<Integer> values) {
            addCriterion("verify_limit in", values, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitNotIn(List<Integer> values) {
            addCriterion("verify_limit not in", values, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitBetween(Integer value1, Integer value2) {
            addCriterion("verify_limit between", value1, value2, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_limit not between", value1, value2, "verifyLimit");
            return (Criteria) this;
        }

        public Criteria andVerifyWayIsNull() {
            addCriterion("verify_way is null");
            return (Criteria) this;
        }

        public Criteria andVerifyWayIsNotNull() {
            addCriterion("verify_way is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyWayEqualTo(String value) {
            addCriterion("verify_way =", value, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayNotEqualTo(String value) {
            addCriterion("verify_way <>", value, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayGreaterThan(String value) {
            addCriterion("verify_way >", value, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayGreaterThanOrEqualTo(String value) {
            addCriterion("verify_way >=", value, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayLessThan(String value) {
            addCriterion("verify_way <", value, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayLessThanOrEqualTo(String value) {
            addCriterion("verify_way <=", value, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayLike(String value) {
            addCriterion("verify_way like", value, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayNotLike(String value) {
            addCriterion("verify_way not like", value, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayIn(List<String> values) {
            addCriterion("verify_way in", values, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayNotIn(List<String> values) {
            addCriterion("verify_way not in", values, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayBetween(String value1, String value2) {
            addCriterion("verify_way between", value1, value2, "verifyWay");
            return (Criteria) this;
        }

        public Criteria andVerifyWayNotBetween(String value1, String value2) {
            addCriterion("verify_way not between", value1, value2, "verifyWay");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table transfer_configuration
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
     * corresponds to the database table transfer_configuration
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