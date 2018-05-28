/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename CommandPayParamDO.java
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

public class CommandPayParamDO implements Serializable {
    /**
     * corresponds to the database column command_pay_param.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column command_pay_param.merchant_id
     *
     * @mbggenerated
     */
    private String merchantId;

    /**
     * corresponds to the database column command_pay_param.share_limit
     *
     * @mbggenerated
     */
    private String shareLimit;

    /**
     * corresponds to the database column command_pay_param.quota
     *
     * @mbggenerated
     */
    private String quota;

    /**
     * corresponds to the database column command_pay_param.freeze_time
     *
     * @mbggenerated
     */
    private String freezeTime;

    /**
     * corresponds to the database column command_pay_param.refund_charge
     *
     * @mbggenerated
     */
    private String refundCharge;

    /**
     * corresponds to the database column command_pay_param.to_bank
     *
     * @mbggenerated
     */
    private String toBank;

    /**
     * corresponds to the database column command_pay_param.merchant_mark
     *
     * @mbggenerated
     */
    private String merchantMark;

    /**
     * corresponds to the database column command_pay_param.need_jump_bank
     *
     * @mbggenerated
     */
    private String needJumpBank;

    /**
     * corresponds to the database column command_pay_param.operator_name
     *
     * @mbggenerated
     */
    private String operatorName;

    /**
     * corresponds to the database column command_pay_param.to_card_freeze_time
     *
     * @mbggenerated
     */
    private String toCardFreezeTime;

    /**
     * corresponds to the database column command_pay_param.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column command_pay_param.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column command_pay_param.refund_audit
     *
     * @mbggenerated
     */
    private String refundAudit;

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column command_pay_param.id
     *
     * @return the value of command_pay_param.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column command_pay_param.id
     *
     * @param id the value for command_pay_param.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column command_pay_param.merchant_id
     *
     * @return the value of command_pay_param.merchant_id
     *
     * @mbggenerated
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * set the value of the database column command_pay_param.merchant_id
     *
     * @param merchantId the value for command_pay_param.merchant_id
     *
     * @mbggenerated
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * return the value of the database column command_pay_param.share_limit
     *
     * @return the value of command_pay_param.share_limit
     *
     * @mbggenerated
     */
    public String getShareLimit() {
        return shareLimit;
    }

    /**
     * set the value of the database column command_pay_param.share_limit
     *
     * @param shareLimit the value for command_pay_param.share_limit
     *
     * @mbggenerated
     */
    public void setShareLimit(String shareLimit) {
        this.shareLimit = shareLimit == null ? null : shareLimit.trim();
    }

    /**
     * return the value of the database column command_pay_param.quota
     *
     * @return the value of command_pay_param.quota
     *
     * @mbggenerated
     */
    public String getQuota() {
        return quota;
    }

    /**
     * set the value of the database column command_pay_param.quota
     *
     * @param quota the value for command_pay_param.quota
     *
     * @mbggenerated
     */
    public void setQuota(String quota) {
        this.quota = quota == null ? null : quota.trim();
    }

    /**
     * return the value of the database column command_pay_param.freeze_time
     *
     * @return the value of command_pay_param.freeze_time
     *
     * @mbggenerated
     */
    public String getFreezeTime() {
        return freezeTime;
    }

    /**
     * set the value of the database column command_pay_param.freeze_time
     *
     * @param freezeTime the value for command_pay_param.freeze_time
     *
     * @mbggenerated
     */
    public void setFreezeTime(String freezeTime) {
        this.freezeTime = freezeTime == null ? null : freezeTime.trim();
    }

    /**
     * return the value of the database column command_pay_param.refund_charge
     *
     * @return the value of command_pay_param.refund_charge
     *
     * @mbggenerated
     */
    public String getRefundCharge() {
        return refundCharge;
    }

    /**
     * set the value of the database column command_pay_param.refund_charge
     *
     * @param refundCharge the value for command_pay_param.refund_charge
     *
     * @mbggenerated
     */
    public void setRefundCharge(String refundCharge) {
        this.refundCharge = refundCharge == null ? null : refundCharge.trim();
    }

    /**
     * return the value of the database column command_pay_param.to_bank
     *
     * @return the value of command_pay_param.to_bank
     *
     * @mbggenerated
     */
    public String getToBank() {
        return toBank;
    }

    /**
     * set the value of the database column command_pay_param.to_bank
     *
     * @param toBank the value for command_pay_param.to_bank
     *
     * @mbggenerated
     */
    public void setToBank(String toBank) {
        this.toBank = toBank == null ? null : toBank.trim();
    }

    /**
     * return the value of the database column command_pay_param.merchant_mark
     *
     * @return the value of command_pay_param.merchant_mark
     *
     * @mbggenerated
     */
    public String getMerchantMark() {
        return merchantMark;
    }

    /**
     * set the value of the database column command_pay_param.merchant_mark
     *
     * @param merchantMark the value for command_pay_param.merchant_mark
     *
     * @mbggenerated
     */
    public void setMerchantMark(String merchantMark) {
        this.merchantMark = merchantMark == null ? null : merchantMark.trim();
    }

    /**
     * return the value of the database column command_pay_param.need_jump_bank
     *
     * @return the value of command_pay_param.need_jump_bank
     *
     * @mbggenerated
     */
    public String getNeedJumpBank() {
        return needJumpBank;
    }

    /**
     * set the value of the database column command_pay_param.need_jump_bank
     *
     * @param needJumpBank the value for command_pay_param.need_jump_bank
     *
     * @mbggenerated
     */
    public void setNeedJumpBank(String needJumpBank) {
        this.needJumpBank = needJumpBank == null ? null : needJumpBank.trim();
    }

    /**
     * return the value of the database column command_pay_param.operator_name
     *
     * @return the value of command_pay_param.operator_name
     *
     * @mbggenerated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * set the value of the database column command_pay_param.operator_name
     *
     * @param operatorName the value for command_pay_param.operator_name
     *
     * @mbggenerated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * return the value of the database column command_pay_param.to_card_freeze_time
     *
     * @return the value of command_pay_param.to_card_freeze_time
     *
     * @mbggenerated
     */
    public String getToCardFreezeTime() {
        return toCardFreezeTime;
    }

    /**
     * set the value of the database column command_pay_param.to_card_freeze_time
     *
     * @param toCardFreezeTime the value for command_pay_param.to_card_freeze_time
     *
     * @mbggenerated
     */
    public void setToCardFreezeTime(String toCardFreezeTime) {
        this.toCardFreezeTime = toCardFreezeTime == null ? null : toCardFreezeTime.trim();
    }

    /**
     * return the value of the database column command_pay_param.raw_add_time
     *
     * @return the value of command_pay_param.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column command_pay_param.raw_add_time
     *
     * @param rawAddTime the value for command_pay_param.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column command_pay_param.raw_update_time
     *
     * @return the value of command_pay_param.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column command_pay_param.raw_update_time
     *
     * @param rawUpdateTime the value for command_pay_param.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column command_pay_param.refund_audit
     *
     * @return the value of command_pay_param.refund_audit
     *
     * @mbggenerated
     */
    public String getRefundAudit() {
        return refundAudit;
    }

    /**
     * set the value of the database column command_pay_param.refund_audit
     *
     * @param refundAudit the value for command_pay_param.refund_audit
     *
     * @mbggenerated
     */
    public void setRefundAudit(String refundAudit) {
        this.refundAudit = refundAudit == null ? null : refundAudit.trim();
    }

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", shareLimit=").append(shareLimit);
        sb.append(", quota=").append(quota);
        sb.append(", freezeTime=").append(freezeTime);
        sb.append(", refundCharge=").append(refundCharge);
        sb.append(", toBank=").append(toBank);
        sb.append(", merchantMark=").append(merchantMark);
        sb.append(", needJumpBank=").append(needJumpBank);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", toCardFreezeTime=").append(toCardFreezeTime);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", refundAudit=").append(refundAudit);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table command_pay_param
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
        CommandPayParamDO other = (CommandPayParamDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getShareLimit() == null ? other.getShareLimit() == null : this.getShareLimit().equals(other.getShareLimit()))
            && (this.getQuota() == null ? other.getQuota() == null : this.getQuota().equals(other.getQuota()))
            && (this.getFreezeTime() == null ? other.getFreezeTime() == null : this.getFreezeTime().equals(other.getFreezeTime()))
            && (this.getRefundCharge() == null ? other.getRefundCharge() == null : this.getRefundCharge().equals(other.getRefundCharge()))
            && (this.getToBank() == null ? other.getToBank() == null : this.getToBank().equals(other.getToBank()))
            && (this.getMerchantMark() == null ? other.getMerchantMark() == null : this.getMerchantMark().equals(other.getMerchantMark()))
            && (this.getNeedJumpBank() == null ? other.getNeedJumpBank() == null : this.getNeedJumpBank().equals(other.getNeedJumpBank()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getToCardFreezeTime() == null ? other.getToCardFreezeTime() == null : this.getToCardFreezeTime().equals(other.getToCardFreezeTime()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getRefundAudit() == null ? other.getRefundAudit() == null : this.getRefundAudit().equals(other.getRefundAudit()));
    }

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getShareLimit() == null) ? 0 : getShareLimit().hashCode());
        result = prime * result + ((getQuota() == null) ? 0 : getQuota().hashCode());
        result = prime * result + ((getFreezeTime() == null) ? 0 : getFreezeTime().hashCode());
        result = prime * result + ((getRefundCharge() == null) ? 0 : getRefundCharge().hashCode());
        result = prime * result + ((getToBank() == null) ? 0 : getToBank().hashCode());
        result = prime * result + ((getMerchantMark() == null) ? 0 : getMerchantMark().hashCode());
        result = prime * result + ((getNeedJumpBank() == null) ? 0 : getNeedJumpBank().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getToCardFreezeTime() == null) ? 0 : getToCardFreezeTime().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getRefundAudit() == null) ? 0 : getRefundAudit().hashCode());
        return result;
    }
}