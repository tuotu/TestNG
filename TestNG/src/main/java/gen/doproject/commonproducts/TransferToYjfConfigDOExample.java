/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferToYjfConfigDOExample.java
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

public class TransferToYjfConfigDOExample {
    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    public TransferToYjfConfigDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
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
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
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
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> attachValidateAmountCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            attachValidateAmountCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getAttachValidateAmountCriteria() {
            return attachValidateAmountCriteria;
        }

        protected void addAttachValidateAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            attachValidateAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addAttachValidateAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            attachValidateAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || attachValidateAmountCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(attachValidateAmountCriteria);
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

        public Criteria andAttachValidateIsNull() {
            addCriterion("attach_validate is null");
            return (Criteria) this;
        }

        public Criteria andAttachValidateIsNotNull() {
            addCriterion("attach_validate is not null");
            return (Criteria) this;
        }

        public Criteria andAttachValidateEqualTo(String value) {
            addCriterion("attach_validate =", value, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateNotEqualTo(String value) {
            addCriterion("attach_validate <>", value, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateGreaterThan(String value) {
            addCriterion("attach_validate >", value, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateGreaterThanOrEqualTo(String value) {
            addCriterion("attach_validate >=", value, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateLessThan(String value) {
            addCriterion("attach_validate <", value, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateLessThanOrEqualTo(String value) {
            addCriterion("attach_validate <=", value, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateLike(String value) {
            addCriterion("attach_validate like", value, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateNotLike(String value) {
            addCriterion("attach_validate not like", value, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateIn(List<String> values) {
            addCriterion("attach_validate in", values, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateNotIn(List<String> values) {
            addCriterion("attach_validate not in", values, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateBetween(String value1, String value2) {
            addCriterion("attach_validate between", value1, value2, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateNotBetween(String value1, String value2) {
            addCriterion("attach_validate not between", value1, value2, "attachValidate");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountIsNull() {
            addCriterion("attach_validate_amount is null");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountIsNotNull() {
            addCriterion("attach_validate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountEqualTo(Money value) {
            addAttachValidateAmountCriterion("attach_validate_amount =", value, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountNotEqualTo(Money value) {
            addAttachValidateAmountCriterion("attach_validate_amount <>", value, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountGreaterThan(Money value) {
            addAttachValidateAmountCriterion("attach_validate_amount >", value, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountGreaterThanOrEqualTo(Money value) {
            addAttachValidateAmountCriterion("attach_validate_amount >=", value, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountLessThan(Money value) {
            addAttachValidateAmountCriterion("attach_validate_amount <", value, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountLessThanOrEqualTo(Money value) {
            addAttachValidateAmountCriterion("attach_validate_amount <=", value, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountIn(List<Money> values) {
            addAttachValidateAmountCriterion("attach_validate_amount in", values, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountNotIn(List<Money> values) {
            addAttachValidateAmountCriterion("attach_validate_amount not in", values, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountBetween(Money value1, Money value2) {
            addAttachValidateAmountCriterion("attach_validate_amount between", value1, value2, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateAmountNotBetween(Money value1, Money value2) {
            addAttachValidateAmountCriterion("attach_validate_amount not between", value1, value2, "attachValidateAmount");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeIsNull() {
            addCriterion("attach_validate_type is null");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeIsNotNull() {
            addCriterion("attach_validate_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeEqualTo(String value) {
            addCriterion("attach_validate_type =", value, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeNotEqualTo(String value) {
            addCriterion("attach_validate_type <>", value, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeGreaterThan(String value) {
            addCriterion("attach_validate_type >", value, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("attach_validate_type >=", value, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeLessThan(String value) {
            addCriterion("attach_validate_type <", value, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeLessThanOrEqualTo(String value) {
            addCriterion("attach_validate_type <=", value, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeLike(String value) {
            addCriterion("attach_validate_type like", value, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeNotLike(String value) {
            addCriterion("attach_validate_type not like", value, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeIn(List<String> values) {
            addCriterion("attach_validate_type in", values, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeNotIn(List<String> values) {
            addCriterion("attach_validate_type not in", values, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeBetween(String value1, String value2) {
            addCriterion("attach_validate_type between", value1, value2, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAttachValidateTypeNotBetween(String value1, String value2) {
            addCriterion("attach_validate_type not between", value1, value2, "attachValidateType");
            return (Criteria) this;
        }

        public Criteria andAutoIsNull() {
            addCriterion("auto is null");
            return (Criteria) this;
        }

        public Criteria andAutoIsNotNull() {
            addCriterion("auto is not null");
            return (Criteria) this;
        }

        public Criteria andAutoEqualTo(String value) {
            addCriterion("auto =", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoNotEqualTo(String value) {
            addCriterion("auto <>", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoGreaterThan(String value) {
            addCriterion("auto >", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoGreaterThanOrEqualTo(String value) {
            addCriterion("auto >=", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoLessThan(String value) {
            addCriterion("auto <", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoLessThanOrEqualTo(String value) {
            addCriterion("auto <=", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoLike(String value) {
            addCriterion("auto like", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoNotLike(String value) {
            addCriterion("auto not like", value, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoIn(List<String> values) {
            addCriterion("auto in", values, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoNotIn(List<String> values) {
            addCriterion("auto not in", values, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoBetween(String value1, String value2) {
            addCriterion("auto between", value1, value2, "auto");
            return (Criteria) this;
        }

        public Criteria andAutoNotBetween(String value1, String value2) {
            addCriterion("auto not between", value1, value2, "auto");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveIsNull() {
            addCriterion("business_active is null");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveIsNotNull() {
            addCriterion("business_active is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveEqualTo(String value) {
            addCriterion("business_active =", value, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveNotEqualTo(String value) {
            addCriterion("business_active <>", value, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveGreaterThan(String value) {
            addCriterion("business_active >", value, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveGreaterThanOrEqualTo(String value) {
            addCriterion("business_active >=", value, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveLessThan(String value) {
            addCriterion("business_active <", value, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveLessThanOrEqualTo(String value) {
            addCriterion("business_active <=", value, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveLike(String value) {
            addCriterion("business_active like", value, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveNotLike(String value) {
            addCriterion("business_active not like", value, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveIn(List<String> values) {
            addCriterion("business_active in", values, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveNotIn(List<String> values) {
            addCriterion("business_active not in", values, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveBetween(String value1, String value2) {
            addCriterion("business_active between", value1, value2, "businessActive");
            return (Criteria) this;
        }

        public Criteria andBusinessActiveNotBetween(String value1, String value2) {
            addCriterion("business_active not between", value1, value2, "businessActive");
            return (Criteria) this;
        }

        public Criteria andNormalIsNull() {
            addCriterion("normal is null");
            return (Criteria) this;
        }

        public Criteria andNormalIsNotNull() {
            addCriterion("normal is not null");
            return (Criteria) this;
        }

        public Criteria andNormalEqualTo(String value) {
            addCriterion("normal =", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotEqualTo(String value) {
            addCriterion("normal <>", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalGreaterThan(String value) {
            addCriterion("normal >", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalGreaterThanOrEqualTo(String value) {
            addCriterion("normal >=", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalLessThan(String value) {
            addCriterion("normal <", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalLessThanOrEqualTo(String value) {
            addCriterion("normal <=", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalLike(String value) {
            addCriterion("normal like", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotLike(String value) {
            addCriterion("normal not like", value, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalIn(List<String> values) {
            addCriterion("normal in", values, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotIn(List<String> values) {
            addCriterion("normal not in", values, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalBetween(String value1, String value2) {
            addCriterion("normal between", value1, value2, "normal");
            return (Criteria) this;
        }

        public Criteria andNormalNotBetween(String value1, String value2) {
            addCriterion("normal not between", value1, value2, "normal");
            return (Criteria) this;
        }

        public Criteria andPersonActiveIsNull() {
            addCriterion("person_active is null");
            return (Criteria) this;
        }

        public Criteria andPersonActiveIsNotNull() {
            addCriterion("person_active is not null");
            return (Criteria) this;
        }

        public Criteria andPersonActiveEqualTo(String value) {
            addCriterion("person_active =", value, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveNotEqualTo(String value) {
            addCriterion("person_active <>", value, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveGreaterThan(String value) {
            addCriterion("person_active >", value, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveGreaterThanOrEqualTo(String value) {
            addCriterion("person_active >=", value, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveLessThan(String value) {
            addCriterion("person_active <", value, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveLessThanOrEqualTo(String value) {
            addCriterion("person_active <=", value, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveLike(String value) {
            addCriterion("person_active like", value, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveNotLike(String value) {
            addCriterion("person_active not like", value, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveIn(List<String> values) {
            addCriterion("person_active in", values, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveNotIn(List<String> values) {
            addCriterion("person_active not in", values, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveBetween(String value1, String value2) {
            addCriterion("person_active between", value1, value2, "personActive");
            return (Criteria) this;
        }

        public Criteria andPersonActiveNotBetween(String value1, String value2) {
            addCriterion("person_active not between", value1, value2, "personActive");
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

        public Criteria andDelayHoursEqualTo(String value) {
            addCriterion("delay_hours =", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotEqualTo(String value) {
            addCriterion("delay_hours <>", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursGreaterThan(String value) {
            addCriterion("delay_hours >", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursGreaterThanOrEqualTo(String value) {
            addCriterion("delay_hours >=", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursLessThan(String value) {
            addCriterion("delay_hours <", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursLessThanOrEqualTo(String value) {
            addCriterion("delay_hours <=", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursLike(String value) {
            addCriterion("delay_hours like", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotLike(String value) {
            addCriterion("delay_hours not like", value, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursIn(List<String> values) {
            addCriterion("delay_hours in", values, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotIn(List<String> values) {
            addCriterion("delay_hours not in", values, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursBetween(String value1, String value2) {
            addCriterion("delay_hours between", value1, value2, "delayHours");
            return (Criteria) this;
        }

        public Criteria andDelayHoursNotBetween(String value1, String value2) {
            addCriterion("delay_hours not between", value1, value2, "delayHours");
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

        public Criteria andBusinessConfigEqualTo(Long value) {
            addCriterion("business_config =", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigNotEqualTo(Long value) {
            addCriterion("business_config <>", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigGreaterThan(Long value) {
            addCriterion("business_config >", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigGreaterThanOrEqualTo(Long value) {
            addCriterion("business_config >=", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigLessThan(Long value) {
            addCriterion("business_config <", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigLessThanOrEqualTo(Long value) {
            addCriterion("business_config <=", value, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigIn(List<Long> values) {
            addCriterion("business_config in", values, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigNotIn(List<Long> values) {
            addCriterion("business_config not in", values, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigBetween(Long value1, Long value2) {
            addCriterion("business_config between", value1, value2, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andBusinessConfigNotBetween(Long value1, Long value2) {
            addCriterion("business_config not between", value1, value2, "businessConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigIsNull() {
            addCriterion("personal_config is null");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigIsNotNull() {
            addCriterion("personal_config is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigEqualTo(Long value) {
            addCriterion("personal_config =", value, "personalConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigNotEqualTo(Long value) {
            addCriterion("personal_config <>", value, "personalConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigGreaterThan(Long value) {
            addCriterion("personal_config >", value, "personalConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigGreaterThanOrEqualTo(Long value) {
            addCriterion("personal_config >=", value, "personalConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigLessThan(Long value) {
            addCriterion("personal_config <", value, "personalConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigLessThanOrEqualTo(Long value) {
            addCriterion("personal_config <=", value, "personalConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigIn(List<Long> values) {
            addCriterion("personal_config in", values, "personalConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigNotIn(List<Long> values) {
            addCriterion("personal_config not in", values, "personalConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigBetween(Long value1, Long value2) {
            addCriterion("personal_config between", value1, value2, "personalConfig");
            return (Criteria) this;
        }

        public Criteria andPersonalConfigNotBetween(Long value1, Long value2) {
            addCriterion("personal_config not between", value1, value2, "personalConfig");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
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
     * corresponds to the database table transfer_to_yjf_config
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