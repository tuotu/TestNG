/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayHabitDO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.doproject.commonproducts;

import java.io.Serializable;
import java.util.Date;

public class FastPayHabitDO implements Serializable {
    /**
     * corresponds to the database column fast_pay_habit.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column fast_pay_habit.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column fast_pay_habit.merchant_id
     *
     * @mbggenerated
     */
    private String merchantId;

    /**
     * corresponds to the database column fast_pay_habit.method_code
     *
     * @mbggenerated
     */
    private String methodCode;

    /**
     * corresponds to the database column fast_pay_habit.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column fast_pay_habit.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay_habit.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column fast_pay_habit.pact_no
     *
     * @mbggenerated
     */
    private String pactNo;

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay_habit.id
     *
     * @return the value of fast_pay_habit.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay_habit.id
     *
     * @param id the value for fast_pay_habit.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay_habit.user_id
     *
     * @return the value of fast_pay_habit.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column fast_pay_habit.user_id
     *
     * @param userId the value for fast_pay_habit.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column fast_pay_habit.merchant_id
     *
     * @return the value of fast_pay_habit.merchant_id
     *
     * @mbggenerated
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * set the value of the database column fast_pay_habit.merchant_id
     *
     * @param merchantId the value for fast_pay_habit.merchant_id
     *
     * @mbggenerated
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * return the value of the database column fast_pay_habit.method_code
     *
     * @return the value of fast_pay_habit.method_code
     *
     * @mbggenerated
     */
    public String getMethodCode() {
        return methodCode;
    }

    /**
     * set the value of the database column fast_pay_habit.method_code
     *
     * @param methodCode the value for fast_pay_habit.method_code
     *
     * @mbggenerated
     */
    public void setMethodCode(String methodCode) {
        this.methodCode = methodCode == null ? null : methodCode.trim();
    }

    /**
     * return the value of the database column fast_pay_habit.bank_code
     *
     * @return the value of fast_pay_habit.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column fast_pay_habit.bank_code
     *
     * @param bankCode the value for fast_pay_habit.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column fast_pay_habit.raw_add_time
     *
     * @return the value of fast_pay_habit.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay_habit.raw_add_time
     *
     * @param rawAddTime the value for fast_pay_habit.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay_habit.raw_update_time
     *
     * @return the value of fast_pay_habit.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay_habit.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay_habit.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column fast_pay_habit.pact_no
     *
     * @return the value of fast_pay_habit.pact_no
     *
     * @mbggenerated
     */
    public String getPactNo() {
        return pactNo;
    }

    /**
     * set the value of the database column fast_pay_habit.pact_no
     *
     * @param pactNo the value for fast_pay_habit.pact_no
     *
     * @mbggenerated
     */
    public void setPactNo(String pactNo) {
        this.pactNo = pactNo == null ? null : pactNo.trim();
    }

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", methodCode=").append(methodCode);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", pactNo=").append(pactNo);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FastPayHabitDO other = (FastPayHabitDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getMethodCode() == null ? other.getMethodCode() == null : this.getMethodCode().equals(other.getMethodCode()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getPactNo() == null ? other.getPactNo() == null : this.getPactNo().equals(other.getPactNo()));
    }

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getMethodCode() == null) ? 0 : getMethodCode().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getPactNo() == null) ? 0 : getPactNo().hashCode());
        return result;
    }
}