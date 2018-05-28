/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointStreamLogDOExample.java
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

public class JointStreamLogDOExample {
    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    public JointStreamLogDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table joint_stream_log
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
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table joint_stream_log
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
     * corresponds to the database table joint_stream_log
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoIsNull() {
            addCriterion("joint_account_no is null");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoIsNotNull() {
            addCriterion("joint_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoEqualTo(String value) {
            addCriterion("joint_account_no =", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoNotEqualTo(String value) {
            addCriterion("joint_account_no <>", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoGreaterThan(String value) {
            addCriterion("joint_account_no >", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("joint_account_no >=", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoLessThan(String value) {
            addCriterion("joint_account_no <", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoLessThanOrEqualTo(String value) {
            addCriterion("joint_account_no <=", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoLike(String value) {
            addCriterion("joint_account_no like", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoNotLike(String value) {
            addCriterion("joint_account_no not like", value, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoIn(List<String> values) {
            addCriterion("joint_account_no in", values, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoNotIn(List<String> values) {
            addCriterion("joint_account_no not in", values, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoBetween(String value1, String value2) {
            addCriterion("joint_account_no between", value1, value2, "jointAccountNo");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoNotBetween(String value1, String value2) {
            addCriterion("joint_account_no not between", value1, value2, "jointAccountNo");
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

        public Criteria andJointAccountNoMaskIsNull() {
            addCriterion("joint_account_no_mask is null");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskIsNotNull() {
            addCriterion("joint_account_no_mask is not null");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskEqualTo(String value) {
            addCriterion("joint_account_no_mask =", value, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskNotEqualTo(String value) {
            addCriterion("joint_account_no_mask <>", value, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskGreaterThan(String value) {
            addCriterion("joint_account_no_mask >", value, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskGreaterThanOrEqualTo(String value) {
            addCriterion("joint_account_no_mask >=", value, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskLessThan(String value) {
            addCriterion("joint_account_no_mask <", value, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskLessThanOrEqualTo(String value) {
            addCriterion("joint_account_no_mask <=", value, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskLike(String value) {
            addCriterion("joint_account_no_mask like", value, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskNotLike(String value) {
            addCriterion("joint_account_no_mask not like", value, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskIn(List<String> values) {
            addCriterion("joint_account_no_mask in", values, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskNotIn(List<String> values) {
            addCriterion("joint_account_no_mask not in", values, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskBetween(String value1, String value2) {
            addCriterion("joint_account_no_mask between", value1, value2, "jointAccountNoMask");
            return (Criteria) this;
        }

        public Criteria andJointAccountNoMaskNotBetween(String value1, String value2) {
            addCriterion("joint_account_no_mask not between", value1, value2, "jointAccountNoMask");
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

        public Criteria andOutBizNoIsNull() {
            addCriterion("out_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIsNotNull() {
            addCriterion("out_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoEqualTo(String value) {
            addCriterion("out_biz_no =", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotEqualTo(String value) {
            addCriterion("out_biz_no <>", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThan(String value) {
            addCriterion("out_biz_no >", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_biz_no >=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThan(String value) {
            addCriterion("out_biz_no <", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThanOrEqualTo(String value) {
            addCriterion("out_biz_no <=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLike(String value) {
            addCriterion("out_biz_no like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotLike(String value) {
            addCriterion("out_biz_no not like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIn(List<String> values) {
            addCriterion("out_biz_no in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotIn(List<String> values) {
            addCriterion("out_biz_no not in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoBetween(String value1, String value2) {
            addCriterion("out_biz_no between", value1, value2, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotBetween(String value1, String value2) {
            addCriterion("out_biz_no not between", value1, value2, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andUseForIsNull() {
            addCriterion("use_for is null");
            return (Criteria) this;
        }

        public Criteria andUseForIsNotNull() {
            addCriterion("use_for is not null");
            return (Criteria) this;
        }

        public Criteria andUseForEqualTo(String value) {
            addCriterion("use_for =", value, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForNotEqualTo(String value) {
            addCriterion("use_for <>", value, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForGreaterThan(String value) {
            addCriterion("use_for >", value, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForGreaterThanOrEqualTo(String value) {
            addCriterion("use_for >=", value, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForLessThan(String value) {
            addCriterion("use_for <", value, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForLessThanOrEqualTo(String value) {
            addCriterion("use_for <=", value, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForLike(String value) {
            addCriterion("use_for like", value, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForNotLike(String value) {
            addCriterion("use_for not like", value, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForIn(List<String> values) {
            addCriterion("use_for in", values, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForNotIn(List<String> values) {
            addCriterion("use_for not in", values, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForBetween(String value1, String value2) {
            addCriterion("use_for between", value1, value2, "useFor");
            return (Criteria) this;
        }

        public Criteria andUseForNotBetween(String value1, String value2) {
            addCriterion("use_for not between", value1, value2, "useFor");
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
     * corresponds to the database table joint_stream_log
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
     * corresponds to the database table joint_stream_log
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