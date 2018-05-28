/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoWithdrawConfigDOExample.java
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

public class AutoWithdrawConfigDOExample {
    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    public AutoWithdrawConfigDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table auto_withdraw_config
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
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table auto_withdraw_config
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
     * corresponds to the database table auto_withdraw_config
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

        public Criteria andAmountOptionIsNull() {
            addCriterion("amount_option is null");
            return (Criteria) this;
        }

        public Criteria andAmountOptionIsNotNull() {
            addCriterion("amount_option is not null");
            return (Criteria) this;
        }

        public Criteria andAmountOptionEqualTo(String value) {
            addCriterion("amount_option =", value, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionNotEqualTo(String value) {
            addCriterion("amount_option <>", value, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionGreaterThan(String value) {
            addCriterion("amount_option >", value, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionGreaterThanOrEqualTo(String value) {
            addCriterion("amount_option >=", value, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionLessThan(String value) {
            addCriterion("amount_option <", value, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionLessThanOrEqualTo(String value) {
            addCriterion("amount_option <=", value, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionLike(String value) {
            addCriterion("amount_option like", value, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionNotLike(String value) {
            addCriterion("amount_option not like", value, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionIn(List<String> values) {
            addCriterion("amount_option in", values, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionNotIn(List<String> values) {
            addCriterion("amount_option not in", values, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionBetween(String value1, String value2) {
            addCriterion("amount_option between", value1, value2, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionNotBetween(String value1, String value2) {
            addCriterion("amount_option not between", value1, value2, "amountOption");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueIsNull() {
            addCriterion("amount_option_value is null");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueIsNotNull() {
            addCriterion("amount_option_value is not null");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueEqualTo(Long value) {
            addCriterion("amount_option_value =", value, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueNotEqualTo(Long value) {
            addCriterion("amount_option_value <>", value, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueGreaterThan(Long value) {
            addCriterion("amount_option_value >", value, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueGreaterThanOrEqualTo(Long value) {
            addCriterion("amount_option_value >=", value, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueLessThan(Long value) {
            addCriterion("amount_option_value <", value, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueLessThanOrEqualTo(Long value) {
            addCriterion("amount_option_value <=", value, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueIn(List<Long> values) {
            addCriterion("amount_option_value in", values, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueNotIn(List<Long> values) {
            addCriterion("amount_option_value not in", values, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueBetween(Long value1, Long value2) {
            addCriterion("amount_option_value between", value1, value2, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountOptionValueNotBetween(Long value1, Long value2) {
            addCriterion("amount_option_value not between", value1, value2, "amountOptionValue");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdIsNull() {
            addCriterion("amount_threshold is null");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdIsNotNull() {
            addCriterion("amount_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdEqualTo(Long value) {
            addCriterion("amount_threshold =", value, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdNotEqualTo(Long value) {
            addCriterion("amount_threshold <>", value, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdGreaterThan(Long value) {
            addCriterion("amount_threshold >", value, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdGreaterThanOrEqualTo(Long value) {
            addCriterion("amount_threshold >=", value, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdLessThan(Long value) {
            addCriterion("amount_threshold <", value, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdLessThanOrEqualTo(Long value) {
            addCriterion("amount_threshold <=", value, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdIn(List<Long> values) {
            addCriterion("amount_threshold in", values, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdNotIn(List<Long> values) {
            addCriterion("amount_threshold not in", values, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdBetween(Long value1, Long value2) {
            addCriterion("amount_threshold between", value1, value2, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andAmountThresholdNotBetween(Long value1, Long value2) {
            addCriterion("amount_threshold not between", value1, value2, "amountThreshold");
            return (Criteria) this;
        }

        public Criteria andConfigFromIsNull() {
            addCriterion("config_from is null");
            return (Criteria) this;
        }

        public Criteria andConfigFromIsNotNull() {
            addCriterion("config_from is not null");
            return (Criteria) this;
        }

        public Criteria andConfigFromEqualTo(String value) {
            addCriterion("config_from =", value, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromNotEqualTo(String value) {
            addCriterion("config_from <>", value, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromGreaterThan(String value) {
            addCriterion("config_from >", value, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromGreaterThanOrEqualTo(String value) {
            addCriterion("config_from >=", value, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromLessThan(String value) {
            addCriterion("config_from <", value, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromLessThanOrEqualTo(String value) {
            addCriterion("config_from <=", value, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromLike(String value) {
            addCriterion("config_from like", value, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromNotLike(String value) {
            addCriterion("config_from not like", value, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromIn(List<String> values) {
            addCriterion("config_from in", values, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromNotIn(List<String> values) {
            addCriterion("config_from not in", values, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromBetween(String value1, String value2) {
            addCriterion("config_from between", value1, value2, "configFrom");
            return (Criteria) this;
        }

        public Criteria andConfigFromNotBetween(String value1, String value2) {
            addCriterion("config_from not between", value1, value2, "configFrom");
            return (Criteria) this;
        }

        public Criteria andEnvIsNull() {
            addCriterion("env is null");
            return (Criteria) this;
        }

        public Criteria andEnvIsNotNull() {
            addCriterion("env is not null");
            return (Criteria) this;
        }

        public Criteria andEnvEqualTo(String value) {
            addCriterion("env =", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotEqualTo(String value) {
            addCriterion("env <>", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThan(String value) {
            addCriterion("env >", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThanOrEqualTo(String value) {
            addCriterion("env >=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThan(String value) {
            addCriterion("env <", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThanOrEqualTo(String value) {
            addCriterion("env <=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLike(String value) {
            addCriterion("env like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotLike(String value) {
            addCriterion("env not like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvIn(List<String> values) {
            addCriterion("env in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotIn(List<String> values) {
            addCriterion("env not in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvBetween(String value1, String value2) {
            addCriterion("env between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotBetween(String value1, String value2) {
            addCriterion("env not between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeIsNull() {
            addCriterion("first_execute_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeIsNotNull() {
            addCriterion("first_execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeEqualTo(Date value) {
            addCriterion("first_execute_time =", value, "firstExecuteTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeNotEqualTo(Date value) {
            addCriterion("first_execute_time <>", value, "firstExecuteTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeGreaterThan(Date value) {
            addCriterion("first_execute_time >", value, "firstExecuteTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_execute_time >=", value, "firstExecuteTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeLessThan(Date value) {
            addCriterion("first_execute_time <", value, "firstExecuteTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_execute_time <=", value, "firstExecuteTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeIn(List<Date> values) {
            addCriterion("first_execute_time in", values, "firstExecuteTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeNotIn(List<Date> values) {
            addCriterion("first_execute_time not in", values, "firstExecuteTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeBetween(Date value1, Date value2) {
            addCriterion("first_execute_time between", value1, value2, "firstExecuteTime");
            return (Criteria) this;
        }

        public Criteria andFirstExecuteTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_execute_time not between", value1, value2, "firstExecuteTime");
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

        public Criteria andLastExecuteTimeIsNull() {
            addCriterion("last_execute_time is null");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeIsNotNull() {
            addCriterion("last_execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeEqualTo(Date value) {
            addCriterion("last_execute_time =", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeNotEqualTo(Date value) {
            addCriterion("last_execute_time <>", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeGreaterThan(Date value) {
            addCriterion("last_execute_time >", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_execute_time >=", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeLessThan(Date value) {
            addCriterion("last_execute_time <", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_execute_time <=", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeIn(List<Date> values) {
            addCriterion("last_execute_time in", values, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeNotIn(List<Date> values) {
            addCriterion("last_execute_time not in", values, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeBetween(Date value1, Date value2) {
            addCriterion("last_execute_time between", value1, value2, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_execute_time not between", value1, value2, "lastExecuteTime");
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

        public Criteria andNextExecuteTimeIsNull() {
            addCriterion("next_execute_time is null");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeIsNotNull() {
            addCriterion("next_execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeEqualTo(Date value) {
            addCriterion("next_execute_time =", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeNotEqualTo(Date value) {
            addCriterion("next_execute_time <>", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeGreaterThan(Date value) {
            addCriterion("next_execute_time >", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("next_execute_time >=", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeLessThan(Date value) {
            addCriterion("next_execute_time <", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeLessThanOrEqualTo(Date value) {
            addCriterion("next_execute_time <=", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeIn(List<Date> values) {
            addCriterion("next_execute_time in", values, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeNotIn(List<Date> values) {
            addCriterion("next_execute_time not in", values, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeBetween(Date value1, Date value2) {
            addCriterion("next_execute_time between", value1, value2, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeNotBetween(Date value1, Date value2) {
            addCriterion("next_execute_time not between", value1, value2, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andOpenedIsNull() {
            addCriterion("opened is null");
            return (Criteria) this;
        }

        public Criteria andOpenedIsNotNull() {
            addCriterion("opened is not null");
            return (Criteria) this;
        }

        public Criteria andOpenedEqualTo(Byte value) {
            addCriterion("opened =", value, "opened");
            return (Criteria) this;
        }

        public Criteria andOpenedNotEqualTo(Byte value) {
            addCriterion("opened <>", value, "opened");
            return (Criteria) this;
        }

        public Criteria andOpenedGreaterThan(Byte value) {
            addCriterion("opened >", value, "opened");
            return (Criteria) this;
        }

        public Criteria andOpenedGreaterThanOrEqualTo(Byte value) {
            addCriterion("opened >=", value, "opened");
            return (Criteria) this;
        }

        public Criteria andOpenedLessThan(Byte value) {
            addCriterion("opened <", value, "opened");
            return (Criteria) this;
        }

        public Criteria andOpenedLessThanOrEqualTo(Byte value) {
            addCriterion("opened <=", value, "opened");
            return (Criteria) this;
        }

        public Criteria andOpenedIn(List<Byte> values) {
            addCriterion("opened in", values, "opened");
            return (Criteria) this;
        }

        public Criteria andOpenedNotIn(List<Byte> values) {
            addCriterion("opened not in", values, "opened");
            return (Criteria) this;
        }

        public Criteria andOpenedBetween(Byte value1, Byte value2) {
            addCriterion("opened between", value1, value2, "opened");
            return (Criteria) this;
        }

        public Criteria andOpenedNotBetween(Byte value1, Byte value2) {
            addCriterion("opened not between", value1, value2, "opened");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleIsNull() {
            addCriterion("period_rule is null");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleIsNotNull() {
            addCriterion("period_rule is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleEqualTo(String value) {
            addCriterion("period_rule =", value, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleNotEqualTo(String value) {
            addCriterion("period_rule <>", value, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleGreaterThan(String value) {
            addCriterion("period_rule >", value, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleGreaterThanOrEqualTo(String value) {
            addCriterion("period_rule >=", value, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleLessThan(String value) {
            addCriterion("period_rule <", value, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleLessThanOrEqualTo(String value) {
            addCriterion("period_rule <=", value, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleLike(String value) {
            addCriterion("period_rule like", value, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleNotLike(String value) {
            addCriterion("period_rule not like", value, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleIn(List<String> values) {
            addCriterion("period_rule in", values, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleNotIn(List<String> values) {
            addCriterion("period_rule not in", values, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleBetween(String value1, String value2) {
            addCriterion("period_rule between", value1, value2, "periodRule");
            return (Criteria) this;
        }

        public Criteria andPeriodRuleNotBetween(String value1, String value2) {
            addCriterion("period_rule not between", value1, value2, "periodRule");
            return (Criteria) this;
        }

        public Criteria andStrategyIsNull() {
            addCriterion("strategy is null");
            return (Criteria) this;
        }

        public Criteria andStrategyIsNotNull() {
            addCriterion("strategy is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyEqualTo(String value) {
            addCriterion("strategy =", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyNotEqualTo(String value) {
            addCriterion("strategy <>", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyGreaterThan(String value) {
            addCriterion("strategy >", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("strategy >=", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyLessThan(String value) {
            addCriterion("strategy <", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyLessThanOrEqualTo(String value) {
            addCriterion("strategy <=", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyLike(String value) {
            addCriterion("strategy like", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyNotLike(String value) {
            addCriterion("strategy not like", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyIn(List<String> values) {
            addCriterion("strategy in", values, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyNotIn(List<String> values) {
            addCriterion("strategy not in", values, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyBetween(String value1, String value2) {
            addCriterion("strategy between", value1, value2, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyNotBetween(String value1, String value2) {
            addCriterion("strategy not between", value1, value2, "strategy");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionIsNull() {
            addCriterion("trigger_option is null");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionIsNotNull() {
            addCriterion("trigger_option is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionEqualTo(String value) {
            addCriterion("trigger_option =", value, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionNotEqualTo(String value) {
            addCriterion("trigger_option <>", value, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionGreaterThan(String value) {
            addCriterion("trigger_option >", value, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionGreaterThanOrEqualTo(String value) {
            addCriterion("trigger_option >=", value, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionLessThan(String value) {
            addCriterion("trigger_option <", value, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionLessThanOrEqualTo(String value) {
            addCriterion("trigger_option <=", value, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionLike(String value) {
            addCriterion("trigger_option like", value, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionNotLike(String value) {
            addCriterion("trigger_option not like", value, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionIn(List<String> values) {
            addCriterion("trigger_option in", values, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionNotIn(List<String> values) {
            addCriterion("trigger_option not in", values, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionBetween(String value1, String value2) {
            addCriterion("trigger_option between", value1, value2, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andTriggerOptionNotBetween(String value1, String value2) {
            addCriterion("trigger_option not between", value1, value2, "triggerOption");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNull() {
            addCriterion("user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNotNull() {
            addCriterion("user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameEqualTo(String value) {
            addCriterion("user_real_name =", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotEqualTo(String value) {
            addCriterion("user_real_name <>", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThan(String value) {
            addCriterion("user_real_name >", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_name >=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThan(String value) {
            addCriterion("user_real_name <", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("user_real_name <=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLike(String value) {
            addCriterion("user_real_name like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotLike(String value) {
            addCriterion("user_real_name not like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIn(List<String> values) {
            addCriterion("user_real_name in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotIn(List<String> values) {
            addCriterion("user_real_name not in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameBetween(String value1, String value2) {
            addCriterion("user_real_name between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotBetween(String value1, String value2) {
            addCriterion("user_real_name not between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andDelaysIsNull() {
            addCriterion("delays is null");
            return (Criteria) this;
        }

        public Criteria andDelaysIsNotNull() {
            addCriterion("delays is not null");
            return (Criteria) this;
        }

        public Criteria andDelaysEqualTo(Integer value) {
            addCriterion("delays =", value, "delays");
            return (Criteria) this;
        }

        public Criteria andDelaysNotEqualTo(Integer value) {
            addCriterion("delays <>", value, "delays");
            return (Criteria) this;
        }

        public Criteria andDelaysGreaterThan(Integer value) {
            addCriterion("delays >", value, "delays");
            return (Criteria) this;
        }

        public Criteria andDelaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("delays >=", value, "delays");
            return (Criteria) this;
        }

        public Criteria andDelaysLessThan(Integer value) {
            addCriterion("delays <", value, "delays");
            return (Criteria) this;
        }

        public Criteria andDelaysLessThanOrEqualTo(Integer value) {
            addCriterion("delays <=", value, "delays");
            return (Criteria) this;
        }

        public Criteria andDelaysIn(List<Integer> values) {
            addCriterion("delays in", values, "delays");
            return (Criteria) this;
        }

        public Criteria andDelaysNotIn(List<Integer> values) {
            addCriterion("delays not in", values, "delays");
            return (Criteria) this;
        }

        public Criteria andDelaysBetween(Integer value1, Integer value2) {
            addCriterion("delays between", value1, value2, "delays");
            return (Criteria) this;
        }

        public Criteria andDelaysNotBetween(Integer value1, Integer value2) {
            addCriterion("delays not between", value1, value2, "delays");
            return (Criteria) this;
        }

        public Criteria andSignNoIsNull() {
            addCriterion("sign_no is null");
            return (Criteria) this;
        }

        public Criteria andSignNoIsNotNull() {
            addCriterion("sign_no is not null");
            return (Criteria) this;
        }

        public Criteria andSignNoEqualTo(String value) {
            addCriterion("sign_no =", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoNotEqualTo(String value) {
            addCriterion("sign_no <>", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoGreaterThan(String value) {
            addCriterion("sign_no >", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoGreaterThanOrEqualTo(String value) {
            addCriterion("sign_no >=", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoLessThan(String value) {
            addCriterion("sign_no <", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoLessThanOrEqualTo(String value) {
            addCriterion("sign_no <=", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoLike(String value) {
            addCriterion("sign_no like", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoNotLike(String value) {
            addCriterion("sign_no not like", value, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoIn(List<String> values) {
            addCriterion("sign_no in", values, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoNotIn(List<String> values) {
            addCriterion("sign_no not in", values, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoBetween(String value1, String value2) {
            addCriterion("sign_no between", value1, value2, "signNo");
            return (Criteria) this;
        }

        public Criteria andSignNoNotBetween(String value1, String value2) {
            addCriterion("sign_no not between", value1, value2, "signNo");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table auto_withdraw_config
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
     * corresponds to the database table auto_withdraw_config
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