/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingPartnerSumDOExample.java
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

public class ClearingPartnerSumDOExample {
    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    public ClearingPartnerSumDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table clearing_partner_sum
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
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table clearing_partner_sum
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
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> clearingAmountCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            clearingAmountCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getClearingAmountCriteria() {
            return clearingAmountCriteria;
        }

        protected void addClearingAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            clearingAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addClearingAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            clearingAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || clearingAmountCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(clearingAmountCriteria);
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

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterion("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterion("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterion("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterion("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterion("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterion("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterion("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterion("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterion("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNull() {
            addCriterion("partner_name is null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNotNull() {
            addCriterion("partner_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameEqualTo(String value) {
            addCriterion("partner_name =", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotEqualTo(String value) {
            addCriterion("partner_name <>", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThan(String value) {
            addCriterion("partner_name >", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("partner_name >=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThan(String value) {
            addCriterion("partner_name <", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThanOrEqualTo(String value) {
            addCriterion("partner_name <=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLike(String value) {
            addCriterion("partner_name like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotLike(String value) {
            addCriterion("partner_name not like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIn(List<String> values) {
            addCriterion("partner_name in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotIn(List<String> values) {
            addCriterion("partner_name not in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameBetween(String value1, String value2) {
            addCriterion("partner_name between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotBetween(String value1, String value2) {
            addCriterion("partner_name not between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNull() {
            addCriterion("partner_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNotNull() {
            addCriterion("partner_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdEqualTo(String value) {
            addCriterion("partner_id =", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotEqualTo(String value) {
            addCriterion("partner_id <>", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThan(String value) {
            addCriterion("partner_id >", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("partner_id >=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThan(String value) {
            addCriterion("partner_id <", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThanOrEqualTo(String value) {
            addCriterion("partner_id <=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLike(String value) {
            addCriterion("partner_id like", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotLike(String value) {
            addCriterion("partner_id not like", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIn(List<String> values) {
            addCriterion("partner_id in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotIn(List<String> values) {
            addCriterion("partner_id not in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdBetween(String value1, String value2) {
            addCriterion("partner_id between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotBetween(String value1, String value2) {
            addCriterion("partner_id not between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andClearingAmountIsNull() {
            addCriterion("clearing_amount is null");
            return (Criteria) this;
        }

        public Criteria andClearingAmountIsNotNull() {
            addCriterion("clearing_amount is not null");
            return (Criteria) this;
        }

        public Criteria andClearingAmountEqualTo(Money value) {
            addClearingAmountCriterion("clearing_amount =", value, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingAmountNotEqualTo(Money value) {
            addClearingAmountCriterion("clearing_amount <>", value, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingAmountGreaterThan(Money value) {
            addClearingAmountCriterion("clearing_amount >", value, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingAmountGreaterThanOrEqualTo(Money value) {
            addClearingAmountCriterion("clearing_amount >=", value, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingAmountLessThan(Money value) {
            addClearingAmountCriterion("clearing_amount <", value, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingAmountLessThanOrEqualTo(Money value) {
            addClearingAmountCriterion("clearing_amount <=", value, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingAmountIn(List<Money> values) {
            addClearingAmountCriterion("clearing_amount in", values, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingAmountNotIn(List<Money> values) {
            addClearingAmountCriterion("clearing_amount not in", values, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingAmountBetween(Money value1, Money value2) {
            addClearingAmountCriterion("clearing_amount between", value1, value2, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingAmountNotBetween(Money value1, Money value2) {
            addClearingAmountCriterion("clearing_amount not between", value1, value2, "clearingAmount");
            return (Criteria) this;
        }

        public Criteria andClearingStatusIsNull() {
            addCriterion("clearing_status is null");
            return (Criteria) this;
        }

        public Criteria andClearingStatusIsNotNull() {
            addCriterion("clearing_status is not null");
            return (Criteria) this;
        }

        public Criteria andClearingStatusEqualTo(String value) {
            addCriterion("clearing_status =", value, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusNotEqualTo(String value) {
            addCriterion("clearing_status <>", value, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusGreaterThan(String value) {
            addCriterion("clearing_status >", value, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("clearing_status >=", value, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusLessThan(String value) {
            addCriterion("clearing_status <", value, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusLessThanOrEqualTo(String value) {
            addCriterion("clearing_status <=", value, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusLike(String value) {
            addCriterion("clearing_status like", value, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusNotLike(String value) {
            addCriterion("clearing_status not like", value, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusIn(List<String> values) {
            addCriterion("clearing_status in", values, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusNotIn(List<String> values) {
            addCriterion("clearing_status not in", values, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusBetween(String value1, String value2) {
            addCriterion("clearing_status between", value1, value2, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andClearingStatusNotBetween(String value1, String value2) {
            addCriterion("clearing_status not between", value1, value2, "clearingStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIsNull() {
            addCriterion("out_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIsNotNull() {
            addCriterion("out_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoEqualTo(String value) {
            addCriterion("out_order_no =", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotEqualTo(String value) {
            addCriterion("out_order_no <>", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoGreaterThan(String value) {
            addCriterion("out_order_no >", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_order_no >=", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLessThan(String value) {
            addCriterion("out_order_no <", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLessThanOrEqualTo(String value) {
            addCriterion("out_order_no <=", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoLike(String value) {
            addCriterion("out_order_no like", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotLike(String value) {
            addCriterion("out_order_no not like", value, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoIn(List<String> values) {
            addCriterion("out_order_no in", values, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotIn(List<String> values) {
            addCriterion("out_order_no not in", values, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoBetween(String value1, String value2) {
            addCriterion("out_order_no between", value1, value2, "outOrderNo");
            return (Criteria) this;
        }

        public Criteria andOutOrderNoNotBetween(String value1, String value2) {
            addCriterion("out_order_no not between", value1, value2, "outOrderNo");
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

        public Criteria andTimeOutIsNull() {
            addCriterion("time_out is null");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNotNull() {
            addCriterion("time_out is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOutEqualTo(String value) {
            addCriterion("time_out =", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotEqualTo(String value) {
            addCriterion("time_out <>", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThan(String value) {
            addCriterion("time_out >", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThanOrEqualTo(String value) {
            addCriterion("time_out >=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThan(String value) {
            addCriterion("time_out <", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThanOrEqualTo(String value) {
            addCriterion("time_out <=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLike(String value) {
            addCriterion("time_out like", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotLike(String value) {
            addCriterion("time_out not like", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutIn(List<String> values) {
            addCriterion("time_out in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotIn(List<String> values) {
            addCriterion("time_out not in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutBetween(String value1, String value2) {
            addCriterion("time_out between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotBetween(String value1, String value2) {
            addCriterion("time_out not between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNull() {
            addCriterion("pay_no is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("pay_no =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("pay_no <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("pay_no >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_no >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("pay_no <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("pay_no <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("pay_no like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("pay_no not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("pay_no in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("pay_no not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("pay_no between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("pay_no not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andSendDataIsNull() {
            addCriterion("send_data is null");
            return (Criteria) this;
        }

        public Criteria andSendDataIsNotNull() {
            addCriterion("send_data is not null");
            return (Criteria) this;
        }

        public Criteria andSendDataEqualTo(String value) {
            addCriterion("send_data =", value, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataNotEqualTo(String value) {
            addCriterion("send_data <>", value, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataGreaterThan(String value) {
            addCriterion("send_data >", value, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataGreaterThanOrEqualTo(String value) {
            addCriterion("send_data >=", value, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataLessThan(String value) {
            addCriterion("send_data <", value, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataLessThanOrEqualTo(String value) {
            addCriterion("send_data <=", value, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataLike(String value) {
            addCriterion("send_data like", value, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataNotLike(String value) {
            addCriterion("send_data not like", value, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataIn(List<String> values) {
            addCriterion("send_data in", values, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataNotIn(List<String> values) {
            addCriterion("send_data not in", values, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataBetween(String value1, String value2) {
            addCriterion("send_data between", value1, value2, "sendData");
            return (Criteria) this;
        }

        public Criteria andSendDataNotBetween(String value1, String value2) {
            addCriterion("send_data not between", value1, value2, "sendData");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table clearing_partner_sum
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
     * corresponds to the database table clearing_partner_sum
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