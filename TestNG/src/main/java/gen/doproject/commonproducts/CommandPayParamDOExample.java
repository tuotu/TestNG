/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename CommandPayParamDOExample.java
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

public class CommandPayParamDOExample {
    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    public CommandPayParamDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table command_pay_param
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
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table command_pay_param
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
     * corresponds to the database table command_pay_param
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

        public Criteria andShareLimitIsNull() {
            addCriterion("share_limit is null");
            return (Criteria) this;
        }

        public Criteria andShareLimitIsNotNull() {
            addCriterion("share_limit is not null");
            return (Criteria) this;
        }

        public Criteria andShareLimitEqualTo(String value) {
            addCriterion("share_limit =", value, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitNotEqualTo(String value) {
            addCriterion("share_limit <>", value, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitGreaterThan(String value) {
            addCriterion("share_limit >", value, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitGreaterThanOrEqualTo(String value) {
            addCriterion("share_limit >=", value, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitLessThan(String value) {
            addCriterion("share_limit <", value, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitLessThanOrEqualTo(String value) {
            addCriterion("share_limit <=", value, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitLike(String value) {
            addCriterion("share_limit like", value, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitNotLike(String value) {
            addCriterion("share_limit not like", value, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitIn(List<String> values) {
            addCriterion("share_limit in", values, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitNotIn(List<String> values) {
            addCriterion("share_limit not in", values, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitBetween(String value1, String value2) {
            addCriterion("share_limit between", value1, value2, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andShareLimitNotBetween(String value1, String value2) {
            addCriterion("share_limit not between", value1, value2, "shareLimit");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNull() {
            addCriterion("quota is null");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNotNull() {
            addCriterion("quota is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaEqualTo(String value) {
            addCriterion("quota =", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotEqualTo(String value) {
            addCriterion("quota <>", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThan(String value) {
            addCriterion("quota >", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThanOrEqualTo(String value) {
            addCriterion("quota >=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThan(String value) {
            addCriterion("quota <", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThanOrEqualTo(String value) {
            addCriterion("quota <=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLike(String value) {
            addCriterion("quota like", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotLike(String value) {
            addCriterion("quota not like", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaIn(List<String> values) {
            addCriterion("quota in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotIn(List<String> values) {
            addCriterion("quota not in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaBetween(String value1, String value2) {
            addCriterion("quota between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotBetween(String value1, String value2) {
            addCriterion("quota not between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeIsNull() {
            addCriterion("freeze_time is null");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeIsNotNull() {
            addCriterion("freeze_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeEqualTo(String value) {
            addCriterion("freeze_time =", value, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeNotEqualTo(String value) {
            addCriterion("freeze_time <>", value, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeGreaterThan(String value) {
            addCriterion("freeze_time >", value, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("freeze_time >=", value, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeLessThan(String value) {
            addCriterion("freeze_time <", value, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeLessThanOrEqualTo(String value) {
            addCriterion("freeze_time <=", value, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeLike(String value) {
            addCriterion("freeze_time like", value, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeNotLike(String value) {
            addCriterion("freeze_time not like", value, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeIn(List<String> values) {
            addCriterion("freeze_time in", values, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeNotIn(List<String> values) {
            addCriterion("freeze_time not in", values, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeBetween(String value1, String value2) {
            addCriterion("freeze_time between", value1, value2, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andFreezeTimeNotBetween(String value1, String value2) {
            addCriterion("freeze_time not between", value1, value2, "freezeTime");
            return (Criteria) this;
        }

        public Criteria andRefundChargeIsNull() {
            addCriterion("refund_charge is null");
            return (Criteria) this;
        }

        public Criteria andRefundChargeIsNotNull() {
            addCriterion("refund_charge is not null");
            return (Criteria) this;
        }

        public Criteria andRefundChargeEqualTo(String value) {
            addCriterion("refund_charge =", value, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeNotEqualTo(String value) {
            addCriterion("refund_charge <>", value, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeGreaterThan(String value) {
            addCriterion("refund_charge >", value, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeGreaterThanOrEqualTo(String value) {
            addCriterion("refund_charge >=", value, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeLessThan(String value) {
            addCriterion("refund_charge <", value, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeLessThanOrEqualTo(String value) {
            addCriterion("refund_charge <=", value, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeLike(String value) {
            addCriterion("refund_charge like", value, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeNotLike(String value) {
            addCriterion("refund_charge not like", value, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeIn(List<String> values) {
            addCriterion("refund_charge in", values, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeNotIn(List<String> values) {
            addCriterion("refund_charge not in", values, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeBetween(String value1, String value2) {
            addCriterion("refund_charge between", value1, value2, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andRefundChargeNotBetween(String value1, String value2) {
            addCriterion("refund_charge not between", value1, value2, "refundCharge");
            return (Criteria) this;
        }

        public Criteria andToBankIsNull() {
            addCriterion("to_bank is null");
            return (Criteria) this;
        }

        public Criteria andToBankIsNotNull() {
            addCriterion("to_bank is not null");
            return (Criteria) this;
        }

        public Criteria andToBankEqualTo(String value) {
            addCriterion("to_bank =", value, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankNotEqualTo(String value) {
            addCriterion("to_bank <>", value, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankGreaterThan(String value) {
            addCriterion("to_bank >", value, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankGreaterThanOrEqualTo(String value) {
            addCriterion("to_bank >=", value, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankLessThan(String value) {
            addCriterion("to_bank <", value, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankLessThanOrEqualTo(String value) {
            addCriterion("to_bank <=", value, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankLike(String value) {
            addCriterion("to_bank like", value, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankNotLike(String value) {
            addCriterion("to_bank not like", value, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankIn(List<String> values) {
            addCriterion("to_bank in", values, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankNotIn(List<String> values) {
            addCriterion("to_bank not in", values, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankBetween(String value1, String value2) {
            addCriterion("to_bank between", value1, value2, "toBank");
            return (Criteria) this;
        }

        public Criteria andToBankNotBetween(String value1, String value2) {
            addCriterion("to_bank not between", value1, value2, "toBank");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkIsNull() {
            addCriterion("merchant_mark is null");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkIsNotNull() {
            addCriterion("merchant_mark is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkEqualTo(String value) {
            addCriterion("merchant_mark =", value, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkNotEqualTo(String value) {
            addCriterion("merchant_mark <>", value, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkGreaterThan(String value) {
            addCriterion("merchant_mark >", value, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_mark >=", value, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkLessThan(String value) {
            addCriterion("merchant_mark <", value, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkLessThanOrEqualTo(String value) {
            addCriterion("merchant_mark <=", value, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkLike(String value) {
            addCriterion("merchant_mark like", value, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkNotLike(String value) {
            addCriterion("merchant_mark not like", value, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkIn(List<String> values) {
            addCriterion("merchant_mark in", values, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkNotIn(List<String> values) {
            addCriterion("merchant_mark not in", values, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkBetween(String value1, String value2) {
            addCriterion("merchant_mark between", value1, value2, "merchantMark");
            return (Criteria) this;
        }

        public Criteria andMerchantMarkNotBetween(String value1, String value2) {
            addCriterion("merchant_mark not between", value1, value2, "merchantMark");
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

        public Criteria andToCardFreezeTimeIsNull() {
            addCriterion("to_card_freeze_time is null");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeIsNotNull() {
            addCriterion("to_card_freeze_time is not null");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeEqualTo(String value) {
            addCriterion("to_card_freeze_time =", value, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeNotEqualTo(String value) {
            addCriterion("to_card_freeze_time <>", value, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeGreaterThan(String value) {
            addCriterion("to_card_freeze_time >", value, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("to_card_freeze_time >=", value, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeLessThan(String value) {
            addCriterion("to_card_freeze_time <", value, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeLessThanOrEqualTo(String value) {
            addCriterion("to_card_freeze_time <=", value, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeLike(String value) {
            addCriterion("to_card_freeze_time like", value, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeNotLike(String value) {
            addCriterion("to_card_freeze_time not like", value, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeIn(List<String> values) {
            addCriterion("to_card_freeze_time in", values, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeNotIn(List<String> values) {
            addCriterion("to_card_freeze_time not in", values, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeBetween(String value1, String value2) {
            addCriterion("to_card_freeze_time between", value1, value2, "toCardFreezeTime");
            return (Criteria) this;
        }

        public Criteria andToCardFreezeTimeNotBetween(String value1, String value2) {
            addCriterion("to_card_freeze_time not between", value1, value2, "toCardFreezeTime");
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

        public Criteria andRefundAuditIsNull() {
            addCriterion("refund_audit is null");
            return (Criteria) this;
        }

        public Criteria andRefundAuditIsNotNull() {
            addCriterion("refund_audit is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAuditEqualTo(String value) {
            addCriterion("refund_audit =", value, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditNotEqualTo(String value) {
            addCriterion("refund_audit <>", value, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditGreaterThan(String value) {
            addCriterion("refund_audit >", value, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditGreaterThanOrEqualTo(String value) {
            addCriterion("refund_audit >=", value, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditLessThan(String value) {
            addCriterion("refund_audit <", value, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditLessThanOrEqualTo(String value) {
            addCriterion("refund_audit <=", value, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditLike(String value) {
            addCriterion("refund_audit like", value, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditNotLike(String value) {
            addCriterion("refund_audit not like", value, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditIn(List<String> values) {
            addCriterion("refund_audit in", values, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditNotIn(List<String> values) {
            addCriterion("refund_audit not in", values, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditBetween(String value1, String value2) {
            addCriterion("refund_audit between", value1, value2, "refundAudit");
            return (Criteria) this;
        }

        public Criteria andRefundAuditNotBetween(String value1, String value2) {
            addCriterion("refund_audit not between", value1, value2, "refundAudit");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table command_pay_param
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
     * corresponds to the database table command_pay_param
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