/**
 *
 * A database access helper class
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SecurityConfigDOExample.java
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

public class SecurityConfigDOExample {
    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    public SecurityConfigDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * corresponds to the database table security_config
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
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * corresponds to the database table security_config
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
     * corresponds to the database table security_config
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

        public Criteria andCipherAlgorithmIsNull() {
            addCriterion("cipher_algorithm is null");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmIsNotNull() {
            addCriterion("cipher_algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmEqualTo(String value) {
            addCriterion("cipher_algorithm =", value, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmNotEqualTo(String value) {
            addCriterion("cipher_algorithm <>", value, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmGreaterThan(String value) {
            addCriterion("cipher_algorithm >", value, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("cipher_algorithm >=", value, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmLessThan(String value) {
            addCriterion("cipher_algorithm <", value, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("cipher_algorithm <=", value, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmLike(String value) {
            addCriterion("cipher_algorithm like", value, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmNotLike(String value) {
            addCriterion("cipher_algorithm not like", value, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmIn(List<String> values) {
            addCriterion("cipher_algorithm in", values, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmNotIn(List<String> values) {
            addCriterion("cipher_algorithm not in", values, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmBetween(String value1, String value2) {
            addCriterion("cipher_algorithm between", value1, value2, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherAlgorithmNotBetween(String value1, String value2) {
            addCriterion("cipher_algorithm not between", value1, value2, "cipherAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetIsNull() {
            addCriterion("cipher_charset is null");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetIsNotNull() {
            addCriterion("cipher_charset is not null");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetEqualTo(String value) {
            addCriterion("cipher_charset =", value, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetNotEqualTo(String value) {
            addCriterion("cipher_charset <>", value, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetGreaterThan(String value) {
            addCriterion("cipher_charset >", value, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetGreaterThanOrEqualTo(String value) {
            addCriterion("cipher_charset >=", value, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetLessThan(String value) {
            addCriterion("cipher_charset <", value, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetLessThanOrEqualTo(String value) {
            addCriterion("cipher_charset <=", value, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetLike(String value) {
            addCriterion("cipher_charset like", value, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetNotLike(String value) {
            addCriterion("cipher_charset not like", value, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetIn(List<String> values) {
            addCriterion("cipher_charset in", values, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetNotIn(List<String> values) {
            addCriterion("cipher_charset not in", values, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetBetween(String value1, String value2) {
            addCriterion("cipher_charset between", value1, value2, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andCipherCharsetNotBetween(String value1, String value2) {
            addCriterion("cipher_charset not between", value1, value2, "cipherCharset");
            return (Criteria) this;
        }

        public Criteria andModeIsNull() {
            addCriterion("mode is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("mode is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(String value) {
            addCriterion("mode =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(String value) {
            addCriterion("mode <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(String value) {
            addCriterion("mode >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(String value) {
            addCriterion("mode >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(String value) {
            addCriterion("mode <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(String value) {
            addCriterion("mode <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLike(String value) {
            addCriterion("mode like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotLike(String value) {
            addCriterion("mode not like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<String> values) {
            addCriterion("mode in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<String> values) {
            addCriterion("mode not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(String value1, String value2) {
            addCriterion("mode between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(String value1, String value2) {
            addCriterion("mode not between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetIsNull() {
            addCriterion("original_charset is null");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetIsNotNull() {
            addCriterion("original_charset is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetEqualTo(String value) {
            addCriterion("original_charset =", value, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetNotEqualTo(String value) {
            addCriterion("original_charset <>", value, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetGreaterThan(String value) {
            addCriterion("original_charset >", value, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetGreaterThanOrEqualTo(String value) {
            addCriterion("original_charset >=", value, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetLessThan(String value) {
            addCriterion("original_charset <", value, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetLessThanOrEqualTo(String value) {
            addCriterion("original_charset <=", value, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetLike(String value) {
            addCriterion("original_charset like", value, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetNotLike(String value) {
            addCriterion("original_charset not like", value, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetIn(List<String> values) {
            addCriterion("original_charset in", values, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetNotIn(List<String> values) {
            addCriterion("original_charset not in", values, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetBetween(String value1, String value2) {
            addCriterion("original_charset between", value1, value2, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andOriginalCharsetNotBetween(String value1, String value2) {
            addCriterion("original_charset not between", value1, value2, "originalCharset");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIsNull() {
            addCriterion("security_user is null");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIsNotNull() {
            addCriterion("security_user is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityUserEqualTo(String value) {
            addCriterion("security_user =", value, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserNotEqualTo(String value) {
            addCriterion("security_user <>", value, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserGreaterThan(String value) {
            addCriterion("security_user >", value, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserGreaterThanOrEqualTo(String value) {
            addCriterion("security_user >=", value, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserLessThan(String value) {
            addCriterion("security_user <", value, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserLessThanOrEqualTo(String value) {
            addCriterion("security_user <=", value, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserLike(String value) {
            addCriterion("security_user like", value, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserNotLike(String value) {
            addCriterion("security_user not like", value, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIn(List<String> values) {
            addCriterion("security_user in", values, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserNotIn(List<String> values) {
            addCriterion("security_user not in", values, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserBetween(String value1, String value2) {
            addCriterion("security_user between", value1, value2, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSecurityUserNotBetween(String value1, String value2) {
            addCriterion("security_user not between", value1, value2, "securityUser");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmIsNull() {
            addCriterion("signature_algorithm is null");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmIsNotNull() {
            addCriterion("signature_algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmEqualTo(String value) {
            addCriterion("signature_algorithm =", value, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmNotEqualTo(String value) {
            addCriterion("signature_algorithm <>", value, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmGreaterThan(String value) {
            addCriterion("signature_algorithm >", value, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("signature_algorithm >=", value, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmLessThan(String value) {
            addCriterion("signature_algorithm <", value, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("signature_algorithm <=", value, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmLike(String value) {
            addCriterion("signature_algorithm like", value, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmNotLike(String value) {
            addCriterion("signature_algorithm not like", value, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmIn(List<String> values) {
            addCriterion("signature_algorithm in", values, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmNotIn(List<String> values) {
            addCriterion("signature_algorithm not in", values, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmBetween(String value1, String value2) {
            addCriterion("signature_algorithm between", value1, value2, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureAlgorithmNotBetween(String value1, String value2) {
            addCriterion("signature_algorithm not between", value1, value2, "signatureAlgorithm");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetIsNull() {
            addCriterion("signature_charset is null");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetIsNotNull() {
            addCriterion("signature_charset is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetEqualTo(String value) {
            addCriterion("signature_charset =", value, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetNotEqualTo(String value) {
            addCriterion("signature_charset <>", value, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetGreaterThan(String value) {
            addCriterion("signature_charset >", value, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetGreaterThanOrEqualTo(String value) {
            addCriterion("signature_charset >=", value, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetLessThan(String value) {
            addCriterion("signature_charset <", value, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetLessThanOrEqualTo(String value) {
            addCriterion("signature_charset <=", value, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetLike(String value) {
            addCriterion("signature_charset like", value, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetNotLike(String value) {
            addCriterion("signature_charset not like", value, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetIn(List<String> values) {
            addCriterion("signature_charset in", values, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetNotIn(List<String> values) {
            addCriterion("signature_charset not in", values, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetBetween(String value1, String value2) {
            addCriterion("signature_charset between", value1, value2, "signatureCharset");
            return (Criteria) this;
        }

        public Criteria andSignatureCharsetNotBetween(String value1, String value2) {
            addCriterion("signature_charset not between", value1, value2, "signatureCharset");
            return (Criteria) this;
        }
    }

    /**
     * corresponds to the database table security_config
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
     * corresponds to the database table security_config
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