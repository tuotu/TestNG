/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoDeductTriggerDO.java
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
import java.io.Serializable;
import java.util.Date;

public class AutoDeductTriggerDO implements Serializable {
    /**
     * corresponds to the database column auto_deduct_trigger.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column auto_deduct_trigger.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column auto_deduct_trigger.card_no
     *
     * @mbggenerated
     */
    private String cardNo;

    /**
     * corresponds to the database column auto_deduct_trigger.account_no
     *
     * @mbggenerated
     */
    private String accountNo;

    /**
     * corresponds to the database column auto_deduct_trigger.order_no
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * corresponds to the database column auto_deduct_trigger.pay_no
     *
     * @mbggenerated
     */
    private String payNo;

    /**
     * corresponds to the database column auto_deduct_trigger.deduct_amount
     *
     * @mbggenerated
     */
    private Money deductAmount;

    /**
     * corresponds to the database column auto_deduct_trigger.trigger_status
     *
     * @mbggenerated
     */
    private String triggerStatus;

    /**
     * corresponds to the database column auto_deduct_trigger.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column auto_deduct_trigger.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column auto_deduct_trigger.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column auto_deduct_trigger.id
     *
     * @return the value of auto_deduct_trigger.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column auto_deduct_trigger.id
     *
     * @param id the value for auto_deduct_trigger.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column auto_deduct_trigger.user_id
     *
     * @return the value of auto_deduct_trigger.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column auto_deduct_trigger.user_id
     *
     * @param userId the value for auto_deduct_trigger.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column auto_deduct_trigger.card_no
     *
     * @return the value of auto_deduct_trigger.card_no
     *
     * @mbggenerated
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * set the value of the database column auto_deduct_trigger.card_no
     *
     * @param cardNo the value for auto_deduct_trigger.card_no
     *
     * @mbggenerated
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * return the value of the database column auto_deduct_trigger.account_no
     *
     * @return the value of auto_deduct_trigger.account_no
     *
     * @mbggenerated
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * set the value of the database column auto_deduct_trigger.account_no
     *
     * @param accountNo the value for auto_deduct_trigger.account_no
     *
     * @mbggenerated
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * return the value of the database column auto_deduct_trigger.order_no
     *
     * @return the value of auto_deduct_trigger.order_no
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * set the value of the database column auto_deduct_trigger.order_no
     *
     * @param orderNo the value for auto_deduct_trigger.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * return the value of the database column auto_deduct_trigger.pay_no
     *
     * @return the value of auto_deduct_trigger.pay_no
     *
     * @mbggenerated
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * set the value of the database column auto_deduct_trigger.pay_no
     *
     * @param payNo the value for auto_deduct_trigger.pay_no
     *
     * @mbggenerated
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    /**
     * return the value of the database column auto_deduct_trigger.deduct_amount
     *
     * @return the value of auto_deduct_trigger.deduct_amount
     *
     * @mbggenerated
     */
    public Money getDeductAmount() {
        return deductAmount;
    }

    /**
     * set the value of the database column auto_deduct_trigger.deduct_amount
     *
     * @param deductAmount the value for auto_deduct_trigger.deduct_amount
     *
     * @mbggenerated
     */
    public void setDeductAmount(Money deductAmount) {
        this.deductAmount = deductAmount;
    }

    /**
     * return the value of the database column auto_deduct_trigger.trigger_status
     *
     * @return the value of auto_deduct_trigger.trigger_status
     *
     * @mbggenerated
     */
    public String getTriggerStatus() {
        return triggerStatus;
    }

    /**
     * set the value of the database column auto_deduct_trigger.trigger_status
     *
     * @param triggerStatus the value for auto_deduct_trigger.trigger_status
     *
     * @mbggenerated
     */
    public void setTriggerStatus(String triggerStatus) {
        this.triggerStatus = triggerStatus == null ? null : triggerStatus.trim();
    }

    /**
     * return the value of the database column auto_deduct_trigger.fail_reason
     *
     * @return the value of auto_deduct_trigger.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column auto_deduct_trigger.fail_reason
     *
     * @param failReason the value for auto_deduct_trigger.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column auto_deduct_trigger.raw_add_time
     *
     * @return the value of auto_deduct_trigger.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column auto_deduct_trigger.raw_add_time
     *
     * @param rawAddTime the value for auto_deduct_trigger.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column auto_deduct_trigger.raw_update_time
     *
     * @return the value of auto_deduct_trigger.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column auto_deduct_trigger.raw_update_time
     *
     * @param rawUpdateTime the value for auto_deduct_trigger.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table auto_deduct_trigger
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
        sb.append(", cardNo=").append(cardNo);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", payNo=").append(payNo);
        sb.append(", deductAmount=").append(deductAmount);
        sb.append(", triggerStatus=").append(triggerStatus);
        sb.append(", failReason=").append(failReason);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table auto_deduct_trigger
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
        AutoDeductTriggerDO other = (AutoDeductTriggerDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getAccountNo() == null ? other.getAccountNo() == null : this.getAccountNo().equals(other.getAccountNo()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getPayNo() == null ? other.getPayNo() == null : this.getPayNo().equals(other.getPayNo()))
            && (this.getDeductAmount() == null ? other.getDeductAmount() == null : this.getDeductAmount().equals(other.getDeductAmount()))
            && (this.getTriggerStatus() == null ? other.getTriggerStatus() == null : this.getTriggerStatus().equals(other.getTriggerStatus()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getAccountNo() == null) ? 0 : getAccountNo().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getPayNo() == null) ? 0 : getPayNo().hashCode());
        result = prime * result + ((getDeductAmount() == null) ? 0 : getDeductAmount().hashCode());
        result = prime * result + ((getTriggerStatus() == null) ? 0 : getTriggerStatus().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}