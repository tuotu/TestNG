/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PaymentRecordDOExample.java
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

public class PaymentRecordDOExample {
    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    public PaymentRecordDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table payment_record
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
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table payment_record
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
     * corresponds to the database table payment_record
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

        public Criteria andBusinessIsNull() {
            addCriterion("business is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNotNull() {
            addCriterion("business is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEqualTo(String value) {
            addCriterion("business =", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotEqualTo(String value) {
            addCriterion("business <>", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThan(String value) {
            addCriterion("business >", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("business >=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThan(String value) {
            addCriterion("business <", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThanOrEqualTo(String value) {
            addCriterion("business <=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLike(String value) {
            addCriterion("business like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotLike(String value) {
            addCriterion("business not like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessIn(List<String> values) {
            addCriterion("business in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotIn(List<String> values) {
            addCriterion("business not in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessBetween(String value1, String value2) {
            addCriterion("business between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotBetween(String value1, String value2) {
            addCriterion("business not between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andCreditSideIsNull() {
            addCriterion("credit_side is null");
            return (Criteria) this;
        }

        public Criteria andCreditSideIsNotNull() {
            addCriterion("credit_side is not null");
            return (Criteria) this;
        }

        public Criteria andCreditSideEqualTo(String value) {
            addCriterion("credit_side =", value, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideNotEqualTo(String value) {
            addCriterion("credit_side <>", value, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideGreaterThan(String value) {
            addCriterion("credit_side >", value, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideGreaterThanOrEqualTo(String value) {
            addCriterion("credit_side >=", value, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideLessThan(String value) {
            addCriterion("credit_side <", value, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideLessThanOrEqualTo(String value) {
            addCriterion("credit_side <=", value, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideLike(String value) {
            addCriterion("credit_side like", value, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideNotLike(String value) {
            addCriterion("credit_side not like", value, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideIn(List<String> values) {
            addCriterion("credit_side in", values, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideNotIn(List<String> values) {
            addCriterion("credit_side not in", values, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideBetween(String value1, String value2) {
            addCriterion("credit_side between", value1, value2, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCreditSideNotBetween(String value1, String value2) {
            addCriterion("credit_side not between", value1, value2, "creditSide");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNull() {
            addCriterion("current_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("current_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(String value) {
            addCriterion("current_status =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(String value) {
            addCriterion("current_status <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(String value) {
            addCriterion("current_status >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("current_status >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(String value) {
            addCriterion("current_status <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(String value) {
            addCriterion("current_status <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLike(String value) {
            addCriterion("current_status like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotLike(String value) {
            addCriterion("current_status not like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<String> values) {
            addCriterion("current_status in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<String> values) {
            addCriterion("current_status not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(String value1, String value2) {
            addCriterion("current_status between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(String value1, String value2) {
            addCriterion("current_status not between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andDebitSideIsNull() {
            addCriterion("debit_side is null");
            return (Criteria) this;
        }

        public Criteria andDebitSideIsNotNull() {
            addCriterion("debit_side is not null");
            return (Criteria) this;
        }

        public Criteria andDebitSideEqualTo(String value) {
            addCriterion("debit_side =", value, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideNotEqualTo(String value) {
            addCriterion("debit_side <>", value, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideGreaterThan(String value) {
            addCriterion("debit_side >", value, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideGreaterThanOrEqualTo(String value) {
            addCriterion("debit_side >=", value, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideLessThan(String value) {
            addCriterion("debit_side <", value, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideLessThanOrEqualTo(String value) {
            addCriterion("debit_side <=", value, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideLike(String value) {
            addCriterion("debit_side like", value, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideNotLike(String value) {
            addCriterion("debit_side not like", value, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideIn(List<String> values) {
            addCriterion("debit_side in", values, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideNotIn(List<String> values) {
            addCriterion("debit_side not in", values, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideBetween(String value1, String value2) {
            addCriterion("debit_side between", value1, value2, "debitSide");
            return (Criteria) this;
        }

        public Criteria andDebitSideNotBetween(String value1, String value2) {
            addCriterion("debit_side not between", value1, value2, "debitSide");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberIsNull() {
            addCriterion("external_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberIsNotNull() {
            addCriterion("external_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberEqualTo(String value) {
            addCriterion("external_serial_number =", value, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberNotEqualTo(String value) {
            addCriterion("external_serial_number <>", value, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberGreaterThan(String value) {
            addCriterion("external_serial_number >", value, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("external_serial_number >=", value, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberLessThan(String value) {
            addCriterion("external_serial_number <", value, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("external_serial_number <=", value, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberLike(String value) {
            addCriterion("external_serial_number like", value, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberNotLike(String value) {
            addCriterion("external_serial_number not like", value, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberIn(List<String> values) {
            addCriterion("external_serial_number in", values, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberNotIn(List<String> values) {
            addCriterion("external_serial_number not in", values, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberBetween(String value1, String value2) {
            addCriterion("external_serial_number between", value1, value2, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andExternalSerialNumberNotBetween(String value1, String value2) {
            addCriterion("external_serial_number not between", value1, value2, "externalSerialNumber");
            return (Criteria) this;
        }

        public Criteria andFinalStatusIsNull() {
            addCriterion("final_status is null");
            return (Criteria) this;
        }

        public Criteria andFinalStatusIsNotNull() {
            addCriterion("final_status is not null");
            return (Criteria) this;
        }

        public Criteria andFinalStatusEqualTo(String value) {
            addCriterion("final_status =", value, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusNotEqualTo(String value) {
            addCriterion("final_status <>", value, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusGreaterThan(String value) {
            addCriterion("final_status >", value, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("final_status >=", value, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusLessThan(String value) {
            addCriterion("final_status <", value, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusLessThanOrEqualTo(String value) {
            addCriterion("final_status <=", value, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusLike(String value) {
            addCriterion("final_status like", value, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusNotLike(String value) {
            addCriterion("final_status not like", value, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusIn(List<String> values) {
            addCriterion("final_status in", values, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusNotIn(List<String> values) {
            addCriterion("final_status not in", values, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusBetween(String value1, String value2) {
            addCriterion("final_status between", value1, value2, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andFinalStatusNotBetween(String value1, String value2) {
            addCriterion("final_status not between", value1, value2, "finalStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountIsNull() {
            addCriterion("merchant_capital_acount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountIsNotNull() {
            addCriterion("merchant_capital_acount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountEqualTo(String value) {
            addCriterion("merchant_capital_acount =", value, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountNotEqualTo(String value) {
            addCriterion("merchant_capital_acount <>", value, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountGreaterThan(String value) {
            addCriterion("merchant_capital_acount >", value, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_capital_acount >=", value, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountLessThan(String value) {
            addCriterion("merchant_capital_acount <", value, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountLessThanOrEqualTo(String value) {
            addCriterion("merchant_capital_acount <=", value, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountLike(String value) {
            addCriterion("merchant_capital_acount like", value, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountNotLike(String value) {
            addCriterion("merchant_capital_acount not like", value, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountIn(List<String> values) {
            addCriterion("merchant_capital_acount in", values, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountNotIn(List<String> values) {
            addCriterion("merchant_capital_acount not in", values, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountBetween(String value1, String value2) {
            addCriterion("merchant_capital_acount between", value1, value2, "merchantCapitalAcount");
            return (Criteria) this;
        }

        public Criteria andMerchantCapitalAcountNotBetween(String value1, String value2) {
            addCriterion("merchant_capital_acount not between", value1, value2, "merchantCapitalAcount");
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

        public Criteria andPaymentCompleteTimeIsNull() {
            addCriterion("payment_complete_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeIsNotNull() {
            addCriterion("payment_complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeEqualTo(Date value) {
            addCriterion("payment_complete_time =", value, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeNotEqualTo(Date value) {
            addCriterion("payment_complete_time <>", value, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeGreaterThan(Date value) {
            addCriterion("payment_complete_time >", value, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_complete_time >=", value, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeLessThan(Date value) {
            addCriterion("payment_complete_time <", value, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_complete_time <=", value, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeIn(List<Date> values) {
            addCriterion("payment_complete_time in", values, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeNotIn(List<Date> values) {
            addCriterion("payment_complete_time not in", values, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("payment_complete_time between", value1, value2, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_complete_time not between", value1, value2, "paymentCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeIsNull() {
            addCriterion("payment_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeIsNotNull() {
            addCriterion("payment_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeEqualTo(Date value) {
            addCriterion("payment_start_time =", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeNotEqualTo(Date value) {
            addCriterion("payment_start_time <>", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeGreaterThan(Date value) {
            addCriterion("payment_start_time >", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_start_time >=", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeLessThan(Date value) {
            addCriterion("payment_start_time <", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_start_time <=", value, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeIn(List<Date> values) {
            addCriterion("payment_start_time in", values, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeNotIn(List<Date> values) {
            addCriterion("payment_start_time not in", values, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeBetween(Date value1, Date value2) {
            addCriterion("payment_start_time between", value1, value2, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_start_time not between", value1, value2, "paymentStartTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
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
    }

    /**
     * corresponds to the database table payment_record
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
     * corresponds to the database table payment_record
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