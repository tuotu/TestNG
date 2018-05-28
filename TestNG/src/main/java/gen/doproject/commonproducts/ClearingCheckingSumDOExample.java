/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingCheckingSumDOExample.java
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

public class ClearingCheckingSumDOExample {
    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    public ClearingCheckingSumDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table clearing_checking_sum
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
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table clearing_checking_sum
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
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> unionAmountCriteria;

        protected List<Criterion> yjfClearingAmountCriteria;

        protected List<Criterion> ipaynowClearingAmountCriteria;

        protected List<Criterion> yjfGetAmountCriteria;

        protected List<Criterion> ipaynowGetAmountCriteria;

        protected List<Criterion> tradeamountSumCriteria;

        protected List<Criterion> channelfeeSumCriteria;

        protected List<Criterion> partneramountSumCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            unionAmountCriteria = new ArrayList<Criterion>();
            yjfClearingAmountCriteria = new ArrayList<Criterion>();
            ipaynowClearingAmountCriteria = new ArrayList<Criterion>();
            yjfGetAmountCriteria = new ArrayList<Criterion>();
            ipaynowGetAmountCriteria = new ArrayList<Criterion>();
            tradeamountSumCriteria = new ArrayList<Criterion>();
            channelfeeSumCriteria = new ArrayList<Criterion>();
            partneramountSumCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getUnionAmountCriteria() {
            return unionAmountCriteria;
        }

        protected void addUnionAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            unionAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addUnionAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            unionAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getYjfClearingAmountCriteria() {
            return yjfClearingAmountCriteria;
        }

        protected void addYjfClearingAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            yjfClearingAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addYjfClearingAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            yjfClearingAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getIpaynowClearingAmountCriteria() {
            return ipaynowClearingAmountCriteria;
        }

        protected void addIpaynowClearingAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            ipaynowClearingAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addIpaynowClearingAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            ipaynowClearingAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getYjfGetAmountCriteria() {
            return yjfGetAmountCriteria;
        }

        protected void addYjfGetAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            yjfGetAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addYjfGetAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            yjfGetAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getIpaynowGetAmountCriteria() {
            return ipaynowGetAmountCriteria;
        }

        protected void addIpaynowGetAmountCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            ipaynowGetAmountCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addIpaynowGetAmountCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            ipaynowGetAmountCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getTradeamountSumCriteria() {
            return tradeamountSumCriteria;
        }

        protected void addTradeamountSumCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            tradeamountSumCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addTradeamountSumCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            tradeamountSumCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getChannelfeeSumCriteria() {
            return channelfeeSumCriteria;
        }

        protected void addChannelfeeSumCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            channelfeeSumCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addChannelfeeSumCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            channelfeeSumCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getPartneramountSumCriteria() {
            return partneramountSumCriteria;
        }

        protected void addPartneramountSumCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            partneramountSumCriteria.add(new Criterion(condition, value, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        protected void addPartneramountSumCriterion(String condition, Money value1, Money value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            partneramountSumCriteria.add(new Criterion(condition, value1, value2, "core.generatorName.MoneyTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || unionAmountCriteria.size() > 0
                || yjfClearingAmountCriteria.size() > 0
                || ipaynowClearingAmountCriteria.size() > 0
                || yjfGetAmountCriteria.size() > 0
                || ipaynowGetAmountCriteria.size() > 0
                || tradeamountSumCriteria.size() > 0
                || channelfeeSumCriteria.size() > 0
                || partneramountSumCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(unionAmountCriteria);
                allCriteria.addAll(yjfClearingAmountCriteria);
                allCriteria.addAll(ipaynowClearingAmountCriteria);
                allCriteria.addAll(yjfGetAmountCriteria);
                allCriteria.addAll(ipaynowGetAmountCriteria);
                allCriteria.addAll(tradeamountSumCriteria);
                allCriteria.addAll(channelfeeSumCriteria);
                allCriteria.addAll(partneramountSumCriteria);
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

        public Criteria andTradeTimeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(Date value) {
            addCriterion("trade_time =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<Date> values) {
            addCriterion("trade_time in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<Date> values) {
            addCriterion("trade_time not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(Date value1, Date value2) {
            addCriterion("trade_time between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("trade_time not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andUnionAmountIsNull() {
            addCriterion("union_amount is null");
            return (Criteria) this;
        }

        public Criteria andUnionAmountIsNotNull() {
            addCriterion("union_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUnionAmountEqualTo(Money value) {
            addUnionAmountCriterion("union_amount =", value, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andUnionAmountNotEqualTo(Money value) {
            addUnionAmountCriterion("union_amount <>", value, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andUnionAmountGreaterThan(Money value) {
            addUnionAmountCriterion("union_amount >", value, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andUnionAmountGreaterThanOrEqualTo(Money value) {
            addUnionAmountCriterion("union_amount >=", value, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andUnionAmountLessThan(Money value) {
            addUnionAmountCriterion("union_amount <", value, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andUnionAmountLessThanOrEqualTo(Money value) {
            addUnionAmountCriterion("union_amount <=", value, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andUnionAmountIn(List<Money> values) {
            addUnionAmountCriterion("union_amount in", values, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andUnionAmountNotIn(List<Money> values) {
            addUnionAmountCriterion("union_amount not in", values, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andUnionAmountBetween(Money value1, Money value2) {
            addUnionAmountCriterion("union_amount between", value1, value2, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andUnionAmountNotBetween(Money value1, Money value2) {
            addUnionAmountCriterion("union_amount not between", value1, value2, "unionAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountIsNull() {
            addCriterion("yjf_clearing_amount is null");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountIsNotNull() {
            addCriterion("yjf_clearing_amount is not null");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountEqualTo(Money value) {
            addYjfClearingAmountCriterion("yjf_clearing_amount =", value, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountNotEqualTo(Money value) {
            addYjfClearingAmountCriterion("yjf_clearing_amount <>", value, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountGreaterThan(Money value) {
            addYjfClearingAmountCriterion("yjf_clearing_amount >", value, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountGreaterThanOrEqualTo(Money value) {
            addYjfClearingAmountCriterion("yjf_clearing_amount >=", value, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountLessThan(Money value) {
            addYjfClearingAmountCriterion("yjf_clearing_amount <", value, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountLessThanOrEqualTo(Money value) {
            addYjfClearingAmountCriterion("yjf_clearing_amount <=", value, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountIn(List<Money> values) {
            addYjfClearingAmountCriterion("yjf_clearing_amount in", values, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountNotIn(List<Money> values) {
            addYjfClearingAmountCriterion("yjf_clearing_amount not in", values, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountBetween(Money value1, Money value2) {
            addYjfClearingAmountCriterion("yjf_clearing_amount between", value1, value2, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfClearingAmountNotBetween(Money value1, Money value2) {
            addYjfClearingAmountCriterion("yjf_clearing_amount not between", value1, value2, "yjfClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountIsNull() {
            addCriterion("ipaynow_clearing_amount is null");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountIsNotNull() {
            addCriterion("ipaynow_clearing_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountEqualTo(Money value) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount =", value, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountNotEqualTo(Money value) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount <>", value, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountGreaterThan(Money value) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount >", value, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountGreaterThanOrEqualTo(Money value) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount >=", value, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountLessThan(Money value) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount <", value, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountLessThanOrEqualTo(Money value) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount <=", value, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountIn(List<Money> values) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount in", values, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountNotIn(List<Money> values) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount not in", values, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountBetween(Money value1, Money value2) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount between", value1, value2, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowClearingAmountNotBetween(Money value1, Money value2) {
            addIpaynowClearingAmountCriterion("ipaynow_clearing_amount not between", value1, value2, "ipaynowClearingAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountIsNull() {
            addCriterion("yjf_get_amount is null");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountIsNotNull() {
            addCriterion("yjf_get_amount is not null");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountEqualTo(Money value) {
            addYjfGetAmountCriterion("yjf_get_amount =", value, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountNotEqualTo(Money value) {
            addYjfGetAmountCriterion("yjf_get_amount <>", value, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountGreaterThan(Money value) {
            addYjfGetAmountCriterion("yjf_get_amount >", value, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountGreaterThanOrEqualTo(Money value) {
            addYjfGetAmountCriterion("yjf_get_amount >=", value, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountLessThan(Money value) {
            addYjfGetAmountCriterion("yjf_get_amount <", value, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountLessThanOrEqualTo(Money value) {
            addYjfGetAmountCriterion("yjf_get_amount <=", value, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountIn(List<Money> values) {
            addYjfGetAmountCriterion("yjf_get_amount in", values, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountNotIn(List<Money> values) {
            addYjfGetAmountCriterion("yjf_get_amount not in", values, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountBetween(Money value1, Money value2) {
            addYjfGetAmountCriterion("yjf_get_amount between", value1, value2, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andYjfGetAmountNotBetween(Money value1, Money value2) {
            addYjfGetAmountCriterion("yjf_get_amount not between", value1, value2, "yjfGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountIsNull() {
            addCriterion("ipaynow_get_amount is null");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountIsNotNull() {
            addCriterion("ipaynow_get_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountEqualTo(Money value) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount =", value, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountNotEqualTo(Money value) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount <>", value, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountGreaterThan(Money value) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount >", value, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountGreaterThanOrEqualTo(Money value) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount >=", value, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountLessThan(Money value) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount <", value, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountLessThanOrEqualTo(Money value) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount <=", value, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountIn(List<Money> values) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount in", values, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountNotIn(List<Money> values) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount not in", values, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountBetween(Money value1, Money value2) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount between", value1, value2, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andIpaynowGetAmountNotBetween(Money value1, Money value2) {
            addIpaynowGetAmountCriterion("ipaynow_get_amount not between", value1, value2, "ipaynowGetAmount");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumIsNull() {
            addCriterion("tradeAmount_sum is null");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumIsNotNull() {
            addCriterion("tradeAmount_sum is not null");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumEqualTo(Money value) {
            addTradeamountSumCriterion("tradeAmount_sum =", value, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumNotEqualTo(Money value) {
            addTradeamountSumCriterion("tradeAmount_sum <>", value, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumGreaterThan(Money value) {
            addTradeamountSumCriterion("tradeAmount_sum >", value, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumGreaterThanOrEqualTo(Money value) {
            addTradeamountSumCriterion("tradeAmount_sum >=", value, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumLessThan(Money value) {
            addTradeamountSumCriterion("tradeAmount_sum <", value, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumLessThanOrEqualTo(Money value) {
            addTradeamountSumCriterion("tradeAmount_sum <=", value, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumIn(List<Money> values) {
            addTradeamountSumCriterion("tradeAmount_sum in", values, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumNotIn(List<Money> values) {
            addTradeamountSumCriterion("tradeAmount_sum not in", values, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumBetween(Money value1, Money value2) {
            addTradeamountSumCriterion("tradeAmount_sum between", value1, value2, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andTradeamountSumNotBetween(Money value1, Money value2) {
            addTradeamountSumCriterion("tradeAmount_sum not between", value1, value2, "tradeamountSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumIsNull() {
            addCriterion("channelFee_sum is null");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumIsNotNull() {
            addCriterion("channelFee_sum is not null");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumEqualTo(Money value) {
            addChannelfeeSumCriterion("channelFee_sum =", value, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumNotEqualTo(Money value) {
            addChannelfeeSumCriterion("channelFee_sum <>", value, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumGreaterThan(Money value) {
            addChannelfeeSumCriterion("channelFee_sum >", value, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumGreaterThanOrEqualTo(Money value) {
            addChannelfeeSumCriterion("channelFee_sum >=", value, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumLessThan(Money value) {
            addChannelfeeSumCriterion("channelFee_sum <", value, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumLessThanOrEqualTo(Money value) {
            addChannelfeeSumCriterion("channelFee_sum <=", value, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumIn(List<Money> values) {
            addChannelfeeSumCriterion("channelFee_sum in", values, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumNotIn(List<Money> values) {
            addChannelfeeSumCriterion("channelFee_sum not in", values, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumBetween(Money value1, Money value2) {
            addChannelfeeSumCriterion("channelFee_sum between", value1, value2, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andChannelfeeSumNotBetween(Money value1, Money value2) {
            addChannelfeeSumCriterion("channelFee_sum not between", value1, value2, "channelfeeSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumIsNull() {
            addCriterion("partnerAmount_sum is null");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumIsNotNull() {
            addCriterion("partnerAmount_sum is not null");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumEqualTo(Money value) {
            addPartneramountSumCriterion("partnerAmount_sum =", value, "partneramountSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumNotEqualTo(Money value) {
            addPartneramountSumCriterion("partnerAmount_sum <>", value, "partneramountSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumGreaterThan(Money value) {
            addPartneramountSumCriterion("partnerAmount_sum >", value, "partneramountSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumGreaterThanOrEqualTo(Money value) {
            addPartneramountSumCriterion("partnerAmount_sum >=", value, "partneramountSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumLessThan(Money value) {
            addPartneramountSumCriterion("partnerAmount_sum <", value, "partneramountSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumLessThanOrEqualTo(Money value) {
            addPartneramountSumCriterion("partnerAmount_sum <=", value, "partneramountSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumIn(List<Money> values) {
            addPartneramountSumCriterion("partnerAmount_sum in", values, "partneramountSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumNotIn(List<Money> values) {
            addPartneramountSumCriterion("partnerAmount_sum not in", values, "partneramountSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumBetween(Money value1, Money value2) {
            addPartneramountSumCriterion("partnerAmount_sum between", value1, value2, "partneramountSum");
            return (Criteria) this;
        }

        public Criteria andPartneramountSumNotBetween(Money value1, Money value2) {
            addPartneramountSumCriterion("partnerAmount_sum not between", value1, value2, "partneramountSum");
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
     * corresponds to the database table clearing_checking_sum
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
     * corresponds to the database table clearing_checking_sum
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