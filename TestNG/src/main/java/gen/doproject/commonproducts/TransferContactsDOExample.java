/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferContactsDOExample.java
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

public class TransferContactsDOExample {
    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    public TransferContactsDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table transfer_contacts
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
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table transfer_contacts
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
     * corresponds to the database table transfer_contacts
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

        public Criteria andBankAccountNoMaskIsNull() {
            addCriterion("bank_account_no_mask is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskIsNotNull() {
            addCriterion("bank_account_no_mask is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskEqualTo(String value) {
            addCriterion("bank_account_no_mask =", value, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskNotEqualTo(String value) {
            addCriterion("bank_account_no_mask <>", value, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskGreaterThan(String value) {
            addCriterion("bank_account_no_mask >", value, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_no_mask >=", value, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskLessThan(String value) {
            addCriterion("bank_account_no_mask <", value, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskLessThanOrEqualTo(String value) {
            addCriterion("bank_account_no_mask <=", value, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskLike(String value) {
            addCriterion("bank_account_no_mask like", value, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskNotLike(String value) {
            addCriterion("bank_account_no_mask not like", value, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskIn(List<String> values) {
            addCriterion("bank_account_no_mask in", values, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskNotIn(List<String> values) {
            addCriterion("bank_account_no_mask not in", values, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskBetween(String value1, String value2) {
            addCriterion("bank_account_no_mask between", value1, value2, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoMaskNotBetween(String value1, String value2) {
            addCriterion("bank_account_no_mask not between", value1, value2, "bankAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNull() {
            addCriterion("bank_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNotNull() {
            addCriterion("bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("bank_address =", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("bank_address <>", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("bank_address >", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_address >=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThan(String value) {
            addCriterion("bank_address <", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_address <=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLike(String value) {
            addCriterion("bank_address like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotLike(String value) {
            addCriterion("bank_address not like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("bank_address in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("bank_address not in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("bank_address between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("bank_address not between", value1, value2, "bankAddress");
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

        public Criteria andBindIdIsNull() {
            addCriterion("bind_id is null");
            return (Criteria) this;
        }

        public Criteria andBindIdIsNotNull() {
            addCriterion("bind_id is not null");
            return (Criteria) this;
        }

        public Criteria andBindIdEqualTo(String value) {
            addCriterion("bind_id =", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotEqualTo(String value) {
            addCriterion("bind_id <>", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdGreaterThan(String value) {
            addCriterion("bind_id >", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdGreaterThanOrEqualTo(String value) {
            addCriterion("bind_id >=", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdLessThan(String value) {
            addCriterion("bind_id <", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdLessThanOrEqualTo(String value) {
            addCriterion("bind_id <=", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdLike(String value) {
            addCriterion("bind_id like", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotLike(String value) {
            addCriterion("bind_id not like", value, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdIn(List<String> values) {
            addCriterion("bind_id in", values, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotIn(List<String> values) {
            addCriterion("bind_id not in", values, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdBetween(String value1, String value2) {
            addCriterion("bind_id between", value1, value2, "bindId");
            return (Criteria) this;
        }

        public Criteria andBindIdNotBetween(String value1, String value2) {
            addCriterion("bind_id not between", value1, value2, "bindId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameIsNull() {
            addCriterion("contact_real_name is null");
            return (Criteria) this;
        }

        public Criteria andContactRealNameIsNotNull() {
            addCriterion("contact_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactRealNameEqualTo(String value) {
            addCriterion("contact_real_name =", value, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameNotEqualTo(String value) {
            addCriterion("contact_real_name <>", value, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameGreaterThan(String value) {
            addCriterion("contact_real_name >", value, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_real_name >=", value, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameLessThan(String value) {
            addCriterion("contact_real_name <", value, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameLessThanOrEqualTo(String value) {
            addCriterion("contact_real_name <=", value, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameLike(String value) {
            addCriterion("contact_real_name like", value, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameNotLike(String value) {
            addCriterion("contact_real_name not like", value, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameIn(List<String> values) {
            addCriterion("contact_real_name in", values, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameNotIn(List<String> values) {
            addCriterion("contact_real_name not in", values, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameBetween(String value1, String value2) {
            addCriterion("contact_real_name between", value1, value2, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactRealNameNotBetween(String value1, String value2) {
            addCriterion("contact_real_name not between", value1, value2, "contactRealName");
            return (Criteria) this;
        }

        public Criteria andContactUserIdIsNull() {
            addCriterion("contact_user_id is null");
            return (Criteria) this;
        }

        public Criteria andContactUserIdIsNotNull() {
            addCriterion("contact_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactUserIdEqualTo(String value) {
            addCriterion("contact_user_id =", value, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdNotEqualTo(String value) {
            addCriterion("contact_user_id <>", value, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdGreaterThan(String value) {
            addCriterion("contact_user_id >", value, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("contact_user_id >=", value, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdLessThan(String value) {
            addCriterion("contact_user_id <", value, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdLessThanOrEqualTo(String value) {
            addCriterion("contact_user_id <=", value, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdLike(String value) {
            addCriterion("contact_user_id like", value, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdNotLike(String value) {
            addCriterion("contact_user_id not like", value, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdIn(List<String> values) {
            addCriterion("contact_user_id in", values, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdNotIn(List<String> values) {
            addCriterion("contact_user_id not in", values, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdBetween(String value1, String value2) {
            addCriterion("contact_user_id between", value1, value2, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserIdNotBetween(String value1, String value2) {
            addCriterion("contact_user_id not between", value1, value2, "contactUserId");
            return (Criteria) this;
        }

        public Criteria andContactUserNameIsNull() {
            addCriterion("contact_user_name is null");
            return (Criteria) this;
        }

        public Criteria andContactUserNameIsNotNull() {
            addCriterion("contact_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactUserNameEqualTo(String value) {
            addCriterion("contact_user_name =", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameNotEqualTo(String value) {
            addCriterion("contact_user_name <>", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameGreaterThan(String value) {
            addCriterion("contact_user_name >", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_user_name >=", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameLessThan(String value) {
            addCriterion("contact_user_name <", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameLessThanOrEqualTo(String value) {
            addCriterion("contact_user_name <=", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameLike(String value) {
            addCriterion("contact_user_name like", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameNotLike(String value) {
            addCriterion("contact_user_name not like", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameIn(List<String> values) {
            addCriterion("contact_user_name in", values, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameNotIn(List<String> values) {
            addCriterion("contact_user_name not in", values, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameBetween(String value1, String value2) {
            addCriterion("contact_user_name between", value1, value2, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameNotBetween(String value1, String value2) {
            addCriterion("contact_user_name not between", value1, value2, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNull() {
            addCriterion("prov_name is null");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNotNull() {
            addCriterion("prov_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvNameEqualTo(String value) {
            addCriterion("prov_name =", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotEqualTo(String value) {
            addCriterion("prov_name <>", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThan(String value) {
            addCriterion("prov_name >", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThanOrEqualTo(String value) {
            addCriterion("prov_name >=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThan(String value) {
            addCriterion("prov_name <", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThanOrEqualTo(String value) {
            addCriterion("prov_name <=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLike(String value) {
            addCriterion("prov_name like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotLike(String value) {
            addCriterion("prov_name not like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameIn(List<String> values) {
            addCriterion("prov_name in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotIn(List<String> values) {
            addCriterion("prov_name not in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameBetween(String value1, String value2) {
            addCriterion("prov_name between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotBetween(String value1, String value2) {
            addCriterion("prov_name not between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andPublicTagIsNull() {
            addCriterion("public_tag is null");
            return (Criteria) this;
        }

        public Criteria andPublicTagIsNotNull() {
            addCriterion("public_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPublicTagEqualTo(String value) {
            addCriterion("public_tag =", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagNotEqualTo(String value) {
            addCriterion("public_tag <>", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagGreaterThan(String value) {
            addCriterion("public_tag >", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagGreaterThanOrEqualTo(String value) {
            addCriterion("public_tag >=", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagLessThan(String value) {
            addCriterion("public_tag <", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagLessThanOrEqualTo(String value) {
            addCriterion("public_tag <=", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagLike(String value) {
            addCriterion("public_tag like", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagNotLike(String value) {
            addCriterion("public_tag not like", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagIn(List<String> values) {
            addCriterion("public_tag in", values, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagNotIn(List<String> values) {
            addCriterion("public_tag not in", values, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagBetween(String value1, String value2) {
            addCriterion("public_tag between", value1, value2, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagNotBetween(String value1, String value2) {
            addCriterion("public_tag not between", value1, value2, "publicTag");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeIsNull() {
            addCriterion("transfer_contacts_type is null");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeIsNotNull() {
            addCriterion("transfer_contacts_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeEqualTo(String value) {
            addCriterion("transfer_contacts_type =", value, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeNotEqualTo(String value) {
            addCriterion("transfer_contacts_type <>", value, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeGreaterThan(String value) {
            addCriterion("transfer_contacts_type >", value, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_contacts_type >=", value, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeLessThan(String value) {
            addCriterion("transfer_contacts_type <", value, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeLessThanOrEqualTo(String value) {
            addCriterion("transfer_contacts_type <=", value, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeLike(String value) {
            addCriterion("transfer_contacts_type like", value, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeNotLike(String value) {
            addCriterion("transfer_contacts_type not like", value, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeIn(List<String> values) {
            addCriterion("transfer_contacts_type in", values, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeNotIn(List<String> values) {
            addCriterion("transfer_contacts_type not in", values, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeBetween(String value1, String value2) {
            addCriterion("transfer_contacts_type between", value1, value2, "transferContactsType");
            return (Criteria) this;
        }

        public Criteria andTransferContactsTypeNotBetween(String value1, String value2) {
            addCriterion("transfer_contacts_type not between", value1, value2, "transferContactsType");
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
    }

    /**
     * corresponds to the database table transfer_contacts
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
     * corresponds to the database table transfer_contacts
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