/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconFileDOExample.java
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

public class ReconFileDOExample {
    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    public ReconFileDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table recon_file
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
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table recon_file
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
     * corresponds to the database table recon_file
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

        public Criteria andAccountAliasIsNull() {
            addCriterion("account_alias is null");
            return (Criteria) this;
        }

        public Criteria andAccountAliasIsNotNull() {
            addCriterion("account_alias is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAliasEqualTo(String value) {
            addCriterion("account_alias =", value, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasNotEqualTo(String value) {
            addCriterion("account_alias <>", value, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasGreaterThan(String value) {
            addCriterion("account_alias >", value, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasGreaterThanOrEqualTo(String value) {
            addCriterion("account_alias >=", value, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasLessThan(String value) {
            addCriterion("account_alias <", value, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasLessThanOrEqualTo(String value) {
            addCriterion("account_alias <=", value, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasLike(String value) {
            addCriterion("account_alias like", value, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasNotLike(String value) {
            addCriterion("account_alias not like", value, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasIn(List<String> values) {
            addCriterion("account_alias in", values, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasNotIn(List<String> values) {
            addCriterion("account_alias not in", values, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasBetween(String value1, String value2) {
            addCriterion("account_alias between", value1, value2, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountAliasNotBetween(String value1, String value2) {
            addCriterion("account_alias not between", value1, value2, "accountAlias");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("account_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("account_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("account_no =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("account_no <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("account_no >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("account_no <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("account_no like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("account_no not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("account_no in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("account_no not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "accountNo");
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

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andReconDateIsNull() {
            addCriterion("recon_date is null");
            return (Criteria) this;
        }

        public Criteria andReconDateIsNotNull() {
            addCriterion("recon_date is not null");
            return (Criteria) this;
        }

        public Criteria andReconDateEqualTo(String value) {
            addCriterion("recon_date =", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateNotEqualTo(String value) {
            addCriterion("recon_date <>", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateGreaterThan(String value) {
            addCriterion("recon_date >", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateGreaterThanOrEqualTo(String value) {
            addCriterion("recon_date >=", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateLessThan(String value) {
            addCriterion("recon_date <", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateLessThanOrEqualTo(String value) {
            addCriterion("recon_date <=", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateLike(String value) {
            addCriterion("recon_date like", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateNotLike(String value) {
            addCriterion("recon_date not like", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateIn(List<String> values) {
            addCriterion("recon_date in", values, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateNotIn(List<String> values) {
            addCriterion("recon_date not in", values, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateBetween(String value1, String value2) {
            addCriterion("recon_date between", value1, value2, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateNotBetween(String value1, String value2) {
            addCriterion("recon_date not between", value1, value2, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconFileDirIsNull() {
            addCriterion("recon_file_dir is null");
            return (Criteria) this;
        }

        public Criteria andReconFileDirIsNotNull() {
            addCriterion("recon_file_dir is not null");
            return (Criteria) this;
        }

        public Criteria andReconFileDirEqualTo(String value) {
            addCriterion("recon_file_dir =", value, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirNotEqualTo(String value) {
            addCriterion("recon_file_dir <>", value, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirGreaterThan(String value) {
            addCriterion("recon_file_dir >", value, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirGreaterThanOrEqualTo(String value) {
            addCriterion("recon_file_dir >=", value, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirLessThan(String value) {
            addCriterion("recon_file_dir <", value, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirLessThanOrEqualTo(String value) {
            addCriterion("recon_file_dir <=", value, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirLike(String value) {
            addCriterion("recon_file_dir like", value, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirNotLike(String value) {
            addCriterion("recon_file_dir not like", value, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirIn(List<String> values) {
            addCriterion("recon_file_dir in", values, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirNotIn(List<String> values) {
            addCriterion("recon_file_dir not in", values, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirBetween(String value1, String value2) {
            addCriterion("recon_file_dir between", value1, value2, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileDirNotBetween(String value1, String value2) {
            addCriterion("recon_file_dir not between", value1, value2, "reconFileDir");
            return (Criteria) this;
        }

        public Criteria andReconFileNameIsNull() {
            addCriterion("recon_file_name is null");
            return (Criteria) this;
        }

        public Criteria andReconFileNameIsNotNull() {
            addCriterion("recon_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andReconFileNameEqualTo(String value) {
            addCriterion("recon_file_name =", value, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameNotEqualTo(String value) {
            addCriterion("recon_file_name <>", value, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameGreaterThan(String value) {
            addCriterion("recon_file_name >", value, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("recon_file_name >=", value, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameLessThan(String value) {
            addCriterion("recon_file_name <", value, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameLessThanOrEqualTo(String value) {
            addCriterion("recon_file_name <=", value, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameLike(String value) {
            addCriterion("recon_file_name like", value, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameNotLike(String value) {
            addCriterion("recon_file_name not like", value, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameIn(List<String> values) {
            addCriterion("recon_file_name in", values, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameNotIn(List<String> values) {
            addCriterion("recon_file_name not in", values, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameBetween(String value1, String value2) {
            addCriterion("recon_file_name between", value1, value2, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileNameNotBetween(String value1, String value2) {
            addCriterion("recon_file_name not between", value1, value2, "reconFileName");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusIsNull() {
            addCriterion("recon_file_status is null");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusIsNotNull() {
            addCriterion("recon_file_status is not null");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusEqualTo(String value) {
            addCriterion("recon_file_status =", value, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusNotEqualTo(String value) {
            addCriterion("recon_file_status <>", value, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusGreaterThan(String value) {
            addCriterion("recon_file_status >", value, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusGreaterThanOrEqualTo(String value) {
            addCriterion("recon_file_status >=", value, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusLessThan(String value) {
            addCriterion("recon_file_status <", value, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusLessThanOrEqualTo(String value) {
            addCriterion("recon_file_status <=", value, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusLike(String value) {
            addCriterion("recon_file_status like", value, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusNotLike(String value) {
            addCriterion("recon_file_status not like", value, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusIn(List<String> values) {
            addCriterion("recon_file_status in", values, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusNotIn(List<String> values) {
            addCriterion("recon_file_status not in", values, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusBetween(String value1, String value2) {
            addCriterion("recon_file_status between", value1, value2, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andReconFileStatusNotBetween(String value1, String value2) {
            addCriterion("recon_file_status not between", value1, value2, "reconFileStatus");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Long value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Long value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Long value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Long value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Long value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Long> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Long> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Long value1, Long value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Long value1, Long value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andReadStatusIsNull() {
            addCriterion("read_status is null");
            return (Criteria) this;
        }

        public Criteria andReadStatusIsNotNull() {
            addCriterion("read_status is not null");
            return (Criteria) this;
        }

        public Criteria andReadStatusEqualTo(String value) {
            addCriterion("read_status =", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotEqualTo(String value) {
            addCriterion("read_status <>", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusGreaterThan(String value) {
            addCriterion("read_status >", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusGreaterThanOrEqualTo(String value) {
            addCriterion("read_status >=", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusLessThan(String value) {
            addCriterion("read_status <", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusLessThanOrEqualTo(String value) {
            addCriterion("read_status <=", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusLike(String value) {
            addCriterion("read_status like", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotLike(String value) {
            addCriterion("read_status not like", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusIn(List<String> values) {
            addCriterion("read_status in", values, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotIn(List<String> values) {
            addCriterion("read_status not in", values, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusBetween(String value1, String value2) {
            addCriterion("read_status between", value1, value2, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotBetween(String value1, String value2) {
            addCriterion("read_status not between", value1, value2, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeIsNull() {
            addCriterion("recon_template_code is null");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeIsNotNull() {
            addCriterion("recon_template_code is not null");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeEqualTo(String value) {
            addCriterion("recon_template_code =", value, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeNotEqualTo(String value) {
            addCriterion("recon_template_code <>", value, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeGreaterThan(String value) {
            addCriterion("recon_template_code >", value, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("recon_template_code >=", value, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeLessThan(String value) {
            addCriterion("recon_template_code <", value, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("recon_template_code <=", value, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeLike(String value) {
            addCriterion("recon_template_code like", value, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeNotLike(String value) {
            addCriterion("recon_template_code not like", value, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeIn(List<String> values) {
            addCriterion("recon_template_code in", values, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeNotIn(List<String> values) {
            addCriterion("recon_template_code not in", values, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeBetween(String value1, String value2) {
            addCriterion("recon_template_code between", value1, value2, "reconTemplateCode");
            return (Criteria) this;
        }

        public Criteria andReconTemplateCodeNotBetween(String value1, String value2) {
            addCriterion("recon_template_code not between", value1, value2, "reconTemplateCode");
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
     * corresponds to the database table recon_file
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
     * corresponds to the database table recon_file
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