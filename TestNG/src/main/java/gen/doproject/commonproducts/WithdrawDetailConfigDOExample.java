/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawDetailConfigDOExample.java
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

public class WithdrawDetailConfigDOExample {
    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    public WithdrawDetailConfigDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table withdraw_detail_config
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
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table withdraw_detail_config
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
     * corresponds to the database table withdraw_detail_config
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

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(String value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(String value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(String value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(String value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(String value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(String value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLike(String value) {
            addCriterion("active like", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotLike(String value) {
            addCriterion("active not like", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<String> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<String> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(String value1, String value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(String value1, String value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalIsNull() {
            addCriterion("plat_approval is null");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalIsNotNull() {
            addCriterion("plat_approval is not null");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalEqualTo(String value) {
            addCriterion("plat_approval =", value, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalNotEqualTo(String value) {
            addCriterion("plat_approval <>", value, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalGreaterThan(String value) {
            addCriterion("plat_approval >", value, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("plat_approval >=", value, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalLessThan(String value) {
            addCriterion("plat_approval <", value, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalLessThanOrEqualTo(String value) {
            addCriterion("plat_approval <=", value, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalLike(String value) {
            addCriterion("plat_approval like", value, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalNotLike(String value) {
            addCriterion("plat_approval not like", value, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalIn(List<String> values) {
            addCriterion("plat_approval in", values, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalNotIn(List<String> values) {
            addCriterion("plat_approval not in", values, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalBetween(String value1, String value2) {
            addCriterion("plat_approval between", value1, value2, "platApproval");
            return (Criteria) this;
        }

        public Criteria andPlatApprovalNotBetween(String value1, String value2) {
            addCriterion("plat_approval not between", value1, value2, "platApproval");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountIsNull() {
            addCriterion("yjf_approval_amount is null");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountIsNotNull() {
            addCriterion("yjf_approval_amount is not null");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountEqualTo(Long value) {
            addCriterion("yjf_approval_amount =", value, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountNotEqualTo(Long value) {
            addCriterion("yjf_approval_amount <>", value, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountGreaterThan(Long value) {
            addCriterion("yjf_approval_amount >", value, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("yjf_approval_amount >=", value, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountLessThan(Long value) {
            addCriterion("yjf_approval_amount <", value, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountLessThanOrEqualTo(Long value) {
            addCriterion("yjf_approval_amount <=", value, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountIn(List<Long> values) {
            addCriterion("yjf_approval_amount in", values, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountNotIn(List<Long> values) {
            addCriterion("yjf_approval_amount not in", values, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountBetween(Long value1, Long value2) {
            addCriterion("yjf_approval_amount between", value1, value2, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andYjfApprovalAmountNotBetween(Long value1, Long value2) {
            addCriterion("yjf_approval_amount not between", value1, value2, "yjfApprovalAmount");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigIsNull() {
            addCriterion("business_config is null");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigIsNotNull() {
            addCriterion("business_config is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigEqualTo(Integer value) {
            addCriterion("business_config =", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigNotEqualTo(Integer value) {
            addCriterion("business_config <>", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigGreaterThan(Integer value) {
            addCriterion("business_config >", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_config >=", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigLessThan(Integer value) {
            addCriterion("business_config <", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigLessThanOrEqualTo(Integer value) {
            addCriterion("business_config <=", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigIn(List<Integer> values) {
            addCriterion("business_config in", values, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigNotIn(List<Integer> values) {
            addCriterion("business_config not in", values, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigBetween(Integer value1, Integer value2) {
            addCriterion("business_config between", value1, value2, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigNotBetween(Integer value1, Integer value2) {
            addCriterion("business_config not between", value1, value2, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigIsNull() {
            addCriterion("person_config is null");
            return (Criteria) this;
        }

        public Criteria andPersonConfigIsNotNull() {
            addCriterion("person_config is not null");
            return (Criteria) this;
        }

        public Criteria andPersonConfigEqualTo(Integer value) {
            addCriterion("person_config =", value, "personConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigNotEqualTo(Integer value) {
            addCriterion("person_config <>", value, "personConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigGreaterThan(Integer value) {
            addCriterion("person_config >", value, "personConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_config >=", value, "personConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigLessThan(Integer value) {
            addCriterion("person_config <", value, "personConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigLessThanOrEqualTo(Integer value) {
            addCriterion("person_config <=", value, "personConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigIn(List<Integer> values) {
            addCriterion("person_config in", values, "personConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigNotIn(List<Integer> values) {
            addCriterion("person_config not in", values, "personConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigBetween(Integer value1, Integer value2) {
            addCriterion("person_config between", value1, value2, "personConfig");
            return (Criteria) this;
        }

        public Criteria andPersonConfigNotBetween(Integer value1, Integer value2) {
            addCriterion("person_config not between", value1, value2, "personConfig");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table withdraw_detail_config
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
     * corresponds to the database table withdraw_detail_config
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