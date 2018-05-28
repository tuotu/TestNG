/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoConfigTriggerDO.java
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

public class AutoConfigTriggerDO implements Serializable {
    /**
     * corresponds to the database column auto_config_trigger.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column auto_config_trigger.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column auto_config_trigger.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column auto_config_trigger.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column auto_config_trigger.level
     *
     * @mbggenerated
     */
    private Integer level;

    /**
     * corresponds to the database column auto_config_trigger.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column auto_config_trigger.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column auto_config_trigger.target_account
     *
     * @mbggenerated
     */
    private String targetAccount;

    /**
     * corresponds to the database column auto_config_trigger.trigger_amount
     *
     * @mbggenerated
     */
    private Long triggerAmount;

    /**
     * corresponds to the database column auto_config_trigger.trigger_status
     *
     * @mbggenerated
     */
    private String triggerStatus;

    /**
     * corresponds to the database column auto_config_trigger.type
     *
     * @mbggenerated
     */
    private String type;

    /**
     * corresponds to the database column auto_config_trigger.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column auto_config_trigger.id
     *
     * @return the value of auto_config_trigger.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column auto_config_trigger.id
     *
     * @param id the value for auto_config_trigger.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column auto_config_trigger.raw_add_time
     *
     * @return the value of auto_config_trigger.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column auto_config_trigger.raw_add_time
     *
     * @param rawAddTime the value for auto_config_trigger.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column auto_config_trigger.raw_update_time
     *
     * @return the value of auto_config_trigger.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column auto_config_trigger.raw_update_time
     *
     * @param rawUpdateTime the value for auto_config_trigger.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column auto_config_trigger.fail_reason
     *
     * @return the value of auto_config_trigger.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column auto_config_trigger.fail_reason
     *
     * @param failReason the value for auto_config_trigger.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column auto_config_trigger.level
     *
     * @return the value of auto_config_trigger.level
     *
     * @mbggenerated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * set the value of the database column auto_config_trigger.level
     *
     * @param level the value for auto_config_trigger.level
     *
     * @mbggenerated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * return the value of the database column auto_config_trigger.memo
     *
     * @return the value of auto_config_trigger.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column auto_config_trigger.memo
     *
     * @param memo the value for auto_config_trigger.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column auto_config_trigger.merchant_card_no
     *
     * @return the value of auto_config_trigger.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column auto_config_trigger.merchant_card_no
     *
     * @param merchantCardNo the value for auto_config_trigger.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column auto_config_trigger.target_account
     *
     * @return the value of auto_config_trigger.target_account
     *
     * @mbggenerated
     */
    public String getTargetAccount() {
        return targetAccount;
    }

    /**
     * set the value of the database column auto_config_trigger.target_account
     *
     * @param targetAccount the value for auto_config_trigger.target_account
     *
     * @mbggenerated
     */
    public void setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount == null ? null : targetAccount.trim();
    }

    /**
     * return the value of the database column auto_config_trigger.trigger_amount
     *
     * @return the value of auto_config_trigger.trigger_amount
     *
     * @mbggenerated
     */
    public Long getTriggerAmount() {
        return triggerAmount;
    }

    /**
     * set the value of the database column auto_config_trigger.trigger_amount
     *
     * @param triggerAmount the value for auto_config_trigger.trigger_amount
     *
     * @mbggenerated
     */
    public void setTriggerAmount(Long triggerAmount) {
        this.triggerAmount = triggerAmount;
    }

    /**
     * return the value of the database column auto_config_trigger.trigger_status
     *
     * @return the value of auto_config_trigger.trigger_status
     *
     * @mbggenerated
     */
    public String getTriggerStatus() {
        return triggerStatus;
    }

    /**
     * set the value of the database column auto_config_trigger.trigger_status
     *
     * @param triggerStatus the value for auto_config_trigger.trigger_status
     *
     * @mbggenerated
     */
    public void setTriggerStatus(String triggerStatus) {
        this.triggerStatus = triggerStatus == null ? null : triggerStatus.trim();
    }

    /**
     * return the value of the database column auto_config_trigger.type
     *
     * @return the value of auto_config_trigger.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * set the value of the database column auto_config_trigger.type
     *
     * @param type the value for auto_config_trigger.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * return the value of the database column auto_config_trigger.user_id
     *
     * @return the value of auto_config_trigger.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column auto_config_trigger.user_id
     *
     * @param userId the value for auto_config_trigger.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", failReason=").append(failReason);
        sb.append(", level=").append(level);
        sb.append(", memo=").append(memo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", targetAccount=").append(targetAccount);
        sb.append(", triggerAmount=").append(triggerAmount);
        sb.append(", triggerStatus=").append(triggerStatus);
        sb.append(", type=").append(type);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table auto_config_trigger
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
        AutoConfigTriggerDO other = (AutoConfigTriggerDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getTargetAccount() == null ? other.getTargetAccount() == null : this.getTargetAccount().equals(other.getTargetAccount()))
            && (this.getTriggerAmount() == null ? other.getTriggerAmount() == null : this.getTriggerAmount().equals(other.getTriggerAmount()))
            && (this.getTriggerStatus() == null ? other.getTriggerStatus() == null : this.getTriggerStatus().equals(other.getTriggerStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getTargetAccount() == null) ? 0 : getTargetAccount().hashCode());
        result = prime * result + ((getTriggerAmount() == null) ? 0 : getTriggerAmount().hashCode());
        result = prime * result + ((getTriggerStatus() == null) ? 0 : getTriggerStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}