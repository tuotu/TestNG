/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingCheckingInfoDOExample.java
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

public class ClearingCheckingInfoDOExample {
    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    public ClearingCheckingInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table clearing_checking_info
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
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table clearing_checking_info
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
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> tradeAmountCriteria;

        protected List<Criterion> channelFeeCriteria;

        protected List<Criterion> partnerAmountCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            tradeAmountCriteria = new ArrayList<Criterion>();
            channelFeeCriteria = new ArrayList<Criterion>();
            partnerAmountCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getTradeAmountCriteria() {
            return tradeAmountCriteria;
        }

        protected void addTradeAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            tradeAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addTradeAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            tradeAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getChannelFeeCriteria() {
            return channelFeeCriteria;
        }

        protected void addChannelFeeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            channelFeeCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addChannelFeeCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            channelFeeCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getPartnerAmountCriteria() {
            return partnerAmountCriteria;
        }

        protected void addPartnerAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            partnerAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addPartnerAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            partnerAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || tradeAmountCriteria.size() > 0
                || channelFeeCriteria.size() > 0
                || partnerAmountCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(tradeAmountCriteria);
                allCriteria.addAll(channelFeeCriteria);
                allCriteria.addAll(partnerAmountCriteria);
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

        public Criteria andSystemNoIsNull() {
            addCriterion("system_no is null");
            return (Criteria) this;
        }

        public Criteria andSystemNoIsNotNull() {
            addCriterion("system_no is not null");
            return (Criteria) this;
        }

        public Criteria andSystemNoEqualTo(String value) {
            addCriterion("system_no =", value, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoNotEqualTo(String value) {
            addCriterion("system_no <>", value, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoGreaterThan(String value) {
            addCriterion("system_no >", value, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoGreaterThanOrEqualTo(String value) {
            addCriterion("system_no >=", value, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoLessThan(String value) {
            addCriterion("system_no <", value, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoLessThanOrEqualTo(String value) {
            addCriterion("system_no <=", value, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoLike(String value) {
            addCriterion("system_no like", value, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoNotLike(String value) {
            addCriterion("system_no not like", value, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoIn(List<String> values) {
            addCriterion("system_no in", values, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoNotIn(List<String> values) {
            addCriterion("system_no not in", values, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoBetween(String value1, String value2) {
            addCriterion("system_no between", value1, value2, "systemNo");
            return (Criteria) this;
        }

        public Criteria andSystemNoNotBetween(String value1, String value2) {
            addCriterion("system_no not between", value1, value2, "systemNo");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeIsNull() {
            addCriterion("union_trade_time is null");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeIsNotNull() {
            addCriterion("union_trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeEqualTo(Date value) {
            addCriterion("union_trade_time =", value, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeNotEqualTo(Date value) {
            addCriterion("union_trade_time <>", value, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeGreaterThan(Date value) {
            addCriterion("union_trade_time >", value, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("union_trade_time >=", value, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeLessThan(Date value) {
            addCriterion("union_trade_time <", value, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("union_trade_time <=", value, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeIn(List<Date> values) {
            addCriterion("union_trade_time in", values, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeNotIn(List<Date> values) {
            addCriterion("union_trade_time not in", values, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeBetween(Date value1, Date value2) {
            addCriterion("union_trade_time between", value1, value2, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("union_trade_time not between", value1, value2, "unionTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeIsNull() {
            addCriterion("partner_trade_time is null");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeIsNotNull() {
            addCriterion("partner_trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeEqualTo(Date value) {
            addCriterion("partner_trade_time =", value, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeNotEqualTo(Date value) {
            addCriterion("partner_trade_time <>", value, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeGreaterThan(Date value) {
            addCriterion("partner_trade_time >", value, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("partner_trade_time >=", value, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeLessThan(Date value) {
            addCriterion("partner_trade_time <", value, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("partner_trade_time <=", value, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeIn(List<Date> values) {
            addCriterion("partner_trade_time in", values, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeNotIn(List<Date> values) {
            addCriterion("partner_trade_time not in", values, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeBetween(Date value1, Date value2) {
            addCriterion("partner_trade_time between", value1, value2, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("partner_trade_time not between", value1, value2, "partnerTradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdIsNull() {
            addCriterion("union_partner_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdIsNotNull() {
            addCriterion("union_partner_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdEqualTo(String value) {
            addCriterion("union_partner_id =", value, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdNotEqualTo(String value) {
            addCriterion("union_partner_id <>", value, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdGreaterThan(String value) {
            addCriterion("union_partner_id >", value, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("union_partner_id >=", value, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdLessThan(String value) {
            addCriterion("union_partner_id <", value, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdLessThanOrEqualTo(String value) {
            addCriterion("union_partner_id <=", value, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdLike(String value) {
            addCriterion("union_partner_id like", value, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdNotLike(String value) {
            addCriterion("union_partner_id not like", value, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdIn(List<String> values) {
            addCriterion("union_partner_id in", values, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdNotIn(List<String> values) {
            addCriterion("union_partner_id not in", values, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdBetween(String value1, String value2) {
            addCriterion("union_partner_id between", value1, value2, "unionPartnerId");
            return (Criteria) this;
        }

        public Criteria andUnionPartnerIdNotBetween(String value1, String value2) {
            addCriterion("union_partner_id not between", value1, value2, "unionPartnerId");
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

        public Criteria andPayFlagIsNull() {
            addCriterion("pay_flag is null");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNotNull() {
            addCriterion("pay_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPayFlagEqualTo(String value) {
            addCriterion("pay_flag =", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotEqualTo(String value) {
            addCriterion("pay_flag <>", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThan(String value) {
            addCriterion("pay_flag >", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThanOrEqualTo(String value) {
            addCriterion("pay_flag >=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThan(String value) {
            addCriterion("pay_flag <", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThanOrEqualTo(String value) {
            addCriterion("pay_flag <=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLike(String value) {
            addCriterion("pay_flag like", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotLike(String value) {
            addCriterion("pay_flag not like", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagIn(List<String> values) {
            addCriterion("pay_flag in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotIn(List<String> values) {
            addCriterion("pay_flag not in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagBetween(String value1, String value2) {
            addCriterion("pay_flag between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotBetween(String value1, String value2) {
            addCriterion("pay_flag not between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(Money value) {
            addTradeAmountCriterion("trade_amount =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(Money value) {
            addTradeAmountCriterion("trade_amount <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(Money value) {
            addTradeAmountCriterion("trade_amount >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(Money value) {
            addTradeAmountCriterion("trade_amount >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(Money value) {
            addTradeAmountCriterion("trade_amount <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(Money value) {
            addTradeAmountCriterion("trade_amount <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<Money> values) {
            addTradeAmountCriterion("trade_amount in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<Money> values) {
            addTradeAmountCriterion("trade_amount not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(Money value1, Money value2) {
            addTradeAmountCriterion("trade_amount between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(Money value1, Money value2) {
            addTradeAmountCriterion("trade_amount not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNull() {
            addCriterion("channel_no is null");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNotNull() {
            addCriterion("channel_no is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNoEqualTo(String value) {
            addCriterion("channel_no =", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotEqualTo(String value) {
            addCriterion("channel_no <>", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThan(String value) {
            addCriterion("channel_no >", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThanOrEqualTo(String value) {
            addCriterion("channel_no >=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThan(String value) {
            addCriterion("channel_no <", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThanOrEqualTo(String value) {
            addCriterion("channel_no <=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLike(String value) {
            addCriterion("channel_no like", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotLike(String value) {
            addCriterion("channel_no not like", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoIn(List<String> values) {
            addCriterion("channel_no in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotIn(List<String> values) {
            addCriterion("channel_no not in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoBetween(String value1, String value2) {
            addCriterion("channel_no between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotBetween(String value1, String value2) {
            addCriterion("channel_no not between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelFeeIsNull() {
            addCriterion("channel_fee is null");
            return (Criteria) this;
        }

        public Criteria andChannelFeeIsNotNull() {
            addCriterion("channel_fee is not null");
            return (Criteria) this;
        }

        public Criteria andChannelFeeEqualTo(Money value) {
            addChannelFeeCriterion("channel_fee =", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeNotEqualTo(Money value) {
            addChannelFeeCriterion("channel_fee <>", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeGreaterThan(Money value) {
            addChannelFeeCriterion("channel_fee >", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeGreaterThanOrEqualTo(Money value) {
            addChannelFeeCriterion("channel_fee >=", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeLessThan(Money value) {
            addChannelFeeCriterion("channel_fee <", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeLessThanOrEqualTo(Money value) {
            addChannelFeeCriterion("channel_fee <=", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeIn(List<Money> values) {
            addChannelFeeCriterion("channel_fee in", values, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeNotIn(List<Money> values) {
            addChannelFeeCriterion("channel_fee not in", values, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeBetween(Money value1, Money value2) {
            addChannelFeeCriterion("channel_fee between", value1, value2, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeNotBetween(Money value1, Money value2) {
            addChannelFeeCriterion("channel_fee not between", value1, value2, "channelFee");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusIsNull() {
            addCriterion("checking_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusIsNotNull() {
            addCriterion("checking_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusEqualTo(String value) {
            addCriterion("checking_status =", value, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusNotEqualTo(String value) {
            addCriterion("checking_status <>", value, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusGreaterThan(String value) {
            addCriterion("checking_status >", value, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("checking_status >=", value, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusLessThan(String value) {
            addCriterion("checking_status <", value, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusLessThanOrEqualTo(String value) {
            addCriterion("checking_status <=", value, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusLike(String value) {
            addCriterion("checking_status like", value, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusNotLike(String value) {
            addCriterion("checking_status not like", value, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusIn(List<String> values) {
            addCriterion("checking_status in", values, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusNotIn(List<String> values) {
            addCriterion("checking_status not in", values, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusBetween(String value1, String value2) {
            addCriterion("checking_status between", value1, value2, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingStatusNotBetween(String value1, String value2) {
            addCriterion("checking_status not between", value1, value2, "checkingStatus");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeIsNull() {
            addCriterion("checking_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeIsNotNull() {
            addCriterion("checking_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeEqualTo(Date value) {
            addCriterion("checking_time =", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeNotEqualTo(Date value) {
            addCriterion("checking_time <>", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeGreaterThan(Date value) {
            addCriterion("checking_time >", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checking_time >=", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeLessThan(Date value) {
            addCriterion("checking_time <", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeLessThanOrEqualTo(Date value) {
            addCriterion("checking_time <=", value, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeIn(List<Date> values) {
            addCriterion("checking_time in", values, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeNotIn(List<Date> values) {
            addCriterion("checking_time not in", values, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeBetween(Date value1, Date value2) {
            addCriterion("checking_time between", value1, value2, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andCheckingTimeNotBetween(Date value1, Date value2) {
            addCriterion("checking_time not between", value1, value2, "checkingTime");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountIsNull() {
            addCriterion("partner_amount is null");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountIsNotNull() {
            addCriterion("partner_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountEqualTo(Money value) {
            addPartnerAmountCriterion("partner_amount =", value, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountNotEqualTo(Money value) {
            addPartnerAmountCriterion("partner_amount <>", value, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountGreaterThan(Money value) {
            addPartnerAmountCriterion("partner_amount >", value, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountGreaterThanOrEqualTo(Money value) {
            addPartnerAmountCriterion("partner_amount >=", value, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountLessThan(Money value) {
            addPartnerAmountCriterion("partner_amount <", value, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountLessThanOrEqualTo(Money value) {
            addPartnerAmountCriterion("partner_amount <=", value, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountIn(List<Money> values) {
            addPartnerAmountCriterion("partner_amount in", values, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountNotIn(List<Money> values) {
            addPartnerAmountCriterion("partner_amount not in", values, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountBetween(Money value1, Money value2) {
            addPartnerAmountCriterion("partner_amount between", value1, value2, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andPartnerAmountNotBetween(Money value1, Money value2) {
            addPartnerAmountCriterion("partner_amount not between", value1, value2, "partnerAmount");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoIsNull() {
            addCriterion("old_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoIsNotNull() {
            addCriterion("old_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoEqualTo(String value) {
            addCriterion("old_order_no =", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotEqualTo(String value) {
            addCriterion("old_order_no <>", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoGreaterThan(String value) {
            addCriterion("old_order_no >", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("old_order_no >=", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoLessThan(String value) {
            addCriterion("old_order_no <", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoLessThanOrEqualTo(String value) {
            addCriterion("old_order_no <=", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoLike(String value) {
            addCriterion("old_order_no like", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotLike(String value) {
            addCriterion("old_order_no not like", value, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoIn(List<String> values) {
            addCriterion("old_order_no in", values, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotIn(List<String> values) {
            addCriterion("old_order_no not in", values, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoBetween(String value1, String value2) {
            addCriterion("old_order_no between", value1, value2, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOldOrderNoNotBetween(String value1, String value2) {
            addCriterion("old_order_no not between", value1, value2, "oldOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIsNull() {
            addCriterion("order_info is null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIsNotNull() {
            addCriterion("order_info is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoEqualTo(String value) {
            addCriterion("order_info =", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotEqualTo(String value) {
            addCriterion("order_info <>", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoGreaterThan(String value) {
            addCriterion("order_info >", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoGreaterThanOrEqualTo(String value) {
            addCriterion("order_info >=", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoLessThan(String value) {
            addCriterion("order_info <", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoLessThanOrEqualTo(String value) {
            addCriterion("order_info <=", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoLike(String value) {
            addCriterion("order_info like", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotLike(String value) {
            addCriterion("order_info not like", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIn(List<String> values) {
            addCriterion("order_info in", values, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotIn(List<String> values) {
            addCriterion("order_info not in", values, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoBetween(String value1, String value2) {
            addCriterion("order_info between", value1, value2, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotBetween(String value1, String value2) {
            addCriterion("order_info not between", value1, value2, "orderInfo");
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

        public Criteria andInnerBizNoIsNull() {
            addCriterion("inner_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoIsNotNull() {
            addCriterion("inner_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoEqualTo(String value) {
            addCriterion("inner_biz_no =", value, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoNotEqualTo(String value) {
            addCriterion("inner_biz_no <>", value, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoGreaterThan(String value) {
            addCriterion("inner_biz_no >", value, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("inner_biz_no >=", value, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoLessThan(String value) {
            addCriterion("inner_biz_no <", value, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoLessThanOrEqualTo(String value) {
            addCriterion("inner_biz_no <=", value, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoLike(String value) {
            addCriterion("inner_biz_no like", value, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoNotLike(String value) {
            addCriterion("inner_biz_no not like", value, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoIn(List<String> values) {
            addCriterion("inner_biz_no in", values, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoNotIn(List<String> values) {
            addCriterion("inner_biz_no not in", values, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoBetween(String value1, String value2) {
            addCriterion("inner_biz_no between", value1, value2, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andInnerBizNoNotBetween(String value1, String value2) {
            addCriterion("inner_biz_no not between", value1, value2, "innerBizNo");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingIsNull() {
            addCriterion("unique_checking is null");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingIsNotNull() {
            addCriterion("unique_checking is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingEqualTo(String value) {
            addCriterion("unique_checking =", value, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingNotEqualTo(String value) {
            addCriterion("unique_checking <>", value, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingGreaterThan(String value) {
            addCriterion("unique_checking >", value, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingGreaterThanOrEqualTo(String value) {
            addCriterion("unique_checking >=", value, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingLessThan(String value) {
            addCriterion("unique_checking <", value, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingLessThanOrEqualTo(String value) {
            addCriterion("unique_checking <=", value, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingLike(String value) {
            addCriterion("unique_checking like", value, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingNotLike(String value) {
            addCriterion("unique_checking not like", value, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingIn(List<String> values) {
            addCriterion("unique_checking in", values, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingNotIn(List<String> values) {
            addCriterion("unique_checking not in", values, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingBetween(String value1, String value2) {
            addCriterion("unique_checking between", value1, value2, "uniqueChecking");
            return (Criteria) this;
        }

        public Criteria andUniqueCheckingNotBetween(String value1, String value2) {
            addCriterion("unique_checking not between", value1, value2, "uniqueChecking");
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

        public Criteria andPartnerPayNoIsNull() {
            addCriterion("partner_pay_no is null");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoIsNotNull() {
            addCriterion("partner_pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoEqualTo(String value) {
            addCriterion("partner_pay_no =", value, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoNotEqualTo(String value) {
            addCriterion("partner_pay_no <>", value, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoGreaterThan(String value) {
            addCriterion("partner_pay_no >", value, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("partner_pay_no >=", value, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoLessThan(String value) {
            addCriterion("partner_pay_no <", value, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoLessThanOrEqualTo(String value) {
            addCriterion("partner_pay_no <=", value, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoLike(String value) {
            addCriterion("partner_pay_no like", value, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoNotLike(String value) {
            addCriterion("partner_pay_no not like", value, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoIn(List<String> values) {
            addCriterion("partner_pay_no in", values, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoNotIn(List<String> values) {
            addCriterion("partner_pay_no not in", values, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoBetween(String value1, String value2) {
            addCriterion("partner_pay_no between", value1, value2, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andPartnerPayNoNotBetween(String value1, String value2) {
            addCriterion("partner_pay_no not between", value1, value2, "partnerPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoIsNull() {
            addCriterion("yjf_pay_no is null");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoIsNotNull() {
            addCriterion("yjf_pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoEqualTo(String value) {
            addCriterion("yjf_pay_no =", value, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoNotEqualTo(String value) {
            addCriterion("yjf_pay_no <>", value, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoGreaterThan(String value) {
            addCriterion("yjf_pay_no >", value, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("yjf_pay_no >=", value, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoLessThan(String value) {
            addCriterion("yjf_pay_no <", value, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoLessThanOrEqualTo(String value) {
            addCriterion("yjf_pay_no <=", value, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoLike(String value) {
            addCriterion("yjf_pay_no like", value, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoNotLike(String value) {
            addCriterion("yjf_pay_no not like", value, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoIn(List<String> values) {
            addCriterion("yjf_pay_no in", values, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoNotIn(List<String> values) {
            addCriterion("yjf_pay_no not in", values, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoBetween(String value1, String value2) {
            addCriterion("yjf_pay_no between", value1, value2, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andYjfPayNoNotBetween(String value1, String value2) {
            addCriterion("yjf_pay_no not between", value1, value2, "yjfPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoIsNull() {
            addCriterion("ipaynow_pay_no is null");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoIsNotNull() {
            addCriterion("ipaynow_pay_no is not null");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoEqualTo(String value) {
            addCriterion("ipaynow_pay_no =", value, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoNotEqualTo(String value) {
            addCriterion("ipaynow_pay_no <>", value, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoGreaterThan(String value) {
            addCriterion("ipaynow_pay_no >", value, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("ipaynow_pay_no >=", value, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoLessThan(String value) {
            addCriterion("ipaynow_pay_no <", value, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoLessThanOrEqualTo(String value) {
            addCriterion("ipaynow_pay_no <=", value, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoLike(String value) {
            addCriterion("ipaynow_pay_no like", value, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoNotLike(String value) {
            addCriterion("ipaynow_pay_no not like", value, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoIn(List<String> values) {
            addCriterion("ipaynow_pay_no in", values, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoNotIn(List<String> values) {
            addCriterion("ipaynow_pay_no not in", values, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoBetween(String value1, String value2) {
            addCriterion("ipaynow_pay_no between", value1, value2, "ipaynowPayNo");
            return (Criteria) this;
        }

        public Criteria andIpaynowPayNoNotBetween(String value1, String value2) {
            addCriterion("ipaynow_pay_no not between", value1, value2, "ipaynowPayNo");
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
     * corresponds to the database table clearing_checking_info
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
     * corresponds to the database table clearing_checking_info
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