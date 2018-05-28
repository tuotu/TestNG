/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AdDeductUserInfoDO.java
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

public class AdDeductUserInfoDO implements Serializable {
    /**
     * corresponds to the database column ad_deduct_user_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column ad_deduct_user_info.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column ad_deduct_user_info.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column ad_deduct_user_info.audit_memo
     *
     * @mbggenerated
     */
    private String auditMemo;

    /**
     * corresponds to the database column ad_deduct_user_info.audit_status
     *
     * @mbggenerated
     */
    private String auditStatus;

    /**
     * corresponds to the database column ad_deduct_user_info.bank_account_no
     *
     * @mbggenerated
     */
    private String bankAccountNo;

    /**
     * corresponds to the database column ad_deduct_user_info.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column ad_deduct_user_info.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * corresponds to the database column ad_deduct_user_info.cert_no
     *
     * @mbggenerated
     */
    private String certNo;

    /**
     * corresponds to the database column ad_deduct_user_info.cert_type
     *
     * @mbggenerated
     */
    private String certType;

    /**
     * corresponds to the database column ad_deduct_user_info.contract_no
     *
     * @mbggenerated
     */
    private String contractNo;

    /**
     * corresponds to the database column ad_deduct_user_info.contract_validity
     *
     * @mbggenerated
     */
    private Date contractValidity;

    /**
     * corresponds to the database column ad_deduct_user_info.is_delete
     *
     * @mbggenerated
     */
    private Boolean isDelete;

    /**
     * corresponds to the database column ad_deduct_user_info.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column ad_deduct_user_info.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column ad_deduct_user_info.phone_no
     *
     * @mbggenerated
     */
    private String phoneNo;

    /**
     * corresponds to the database column ad_deduct_user_info.real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column ad_deduct_user_info.id
     *
     * @return the value of ad_deduct_user_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column ad_deduct_user_info.id
     *
     * @param id the value for ad_deduct_user_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column ad_deduct_user_info.raw_add_time
     *
     * @return the value of ad_deduct_user_info.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column ad_deduct_user_info.raw_add_time
     *
     * @param rawAddTime the value for ad_deduct_user_info.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column ad_deduct_user_info.raw_update_time
     *
     * @return the value of ad_deduct_user_info.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column ad_deduct_user_info.raw_update_time
     *
     * @param rawUpdateTime the value for ad_deduct_user_info.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column ad_deduct_user_info.audit_memo
     *
     * @return the value of ad_deduct_user_info.audit_memo
     *
     * @mbggenerated
     */
    public String getAuditMemo() {
        return auditMemo;
    }

    /**
     * set the value of the database column ad_deduct_user_info.audit_memo
     *
     * @param auditMemo the value for ad_deduct_user_info.audit_memo
     *
     * @mbggenerated
     */
    public void setAuditMemo(String auditMemo) {
        this.auditMemo = auditMemo == null ? null : auditMemo.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.audit_status
     *
     * @return the value of ad_deduct_user_info.audit_status
     *
     * @mbggenerated
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * set the value of the database column ad_deduct_user_info.audit_status
     *
     * @param auditStatus the value for ad_deduct_user_info.audit_status
     *
     * @mbggenerated
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.bank_account_no
     *
     * @return the value of ad_deduct_user_info.bank_account_no
     *
     * @mbggenerated
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * set the value of the database column ad_deduct_user_info.bank_account_no
     *
     * @param bankAccountNo the value for ad_deduct_user_info.bank_account_no
     *
     * @mbggenerated
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.bank_code
     *
     * @return the value of ad_deduct_user_info.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column ad_deduct_user_info.bank_code
     *
     * @param bankCode the value for ad_deduct_user_info.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.bank_name
     *
     * @return the value of ad_deduct_user_info.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set the value of the database column ad_deduct_user_info.bank_name
     *
     * @param bankName the value for ad_deduct_user_info.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.cert_no
     *
     * @return the value of ad_deduct_user_info.cert_no
     *
     * @mbggenerated
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * set the value of the database column ad_deduct_user_info.cert_no
     *
     * @param certNo the value for ad_deduct_user_info.cert_no
     *
     * @mbggenerated
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.cert_type
     *
     * @return the value of ad_deduct_user_info.cert_type
     *
     * @mbggenerated
     */
    public String getCertType() {
        return certType;
    }

    /**
     * set the value of the database column ad_deduct_user_info.cert_type
     *
     * @param certType the value for ad_deduct_user_info.cert_type
     *
     * @mbggenerated
     */
    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.contract_no
     *
     * @return the value of ad_deduct_user_info.contract_no
     *
     * @mbggenerated
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * set the value of the database column ad_deduct_user_info.contract_no
     *
     * @param contractNo the value for ad_deduct_user_info.contract_no
     *
     * @mbggenerated
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.contract_validity
     *
     * @return the value of ad_deduct_user_info.contract_validity
     *
     * @mbggenerated
     */
    public Date getContractValidity() {
        return contractValidity;
    }

    /**
     * set the value of the database column ad_deduct_user_info.contract_validity
     *
     * @param contractValidity the value for ad_deduct_user_info.contract_validity
     *
     * @mbggenerated
     */
    public void setContractValidity(Date contractValidity) {
        this.contractValidity = contractValidity;
    }

    /**
     * return the value of the database column ad_deduct_user_info.is_delete
     *
     * @return the value of ad_deduct_user_info.is_delete
     *
     * @mbggenerated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * set the value of the database column ad_deduct_user_info.is_delete
     *
     * @param isDelete the value for ad_deduct_user_info.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * return the value of the database column ad_deduct_user_info.memo
     *
     * @return the value of ad_deduct_user_info.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column ad_deduct_user_info.memo
     *
     * @param memo the value for ad_deduct_user_info.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.merchant_user_id
     *
     * @return the value of ad_deduct_user_info.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column ad_deduct_user_info.merchant_user_id
     *
     * @param merchantUserId the value for ad_deduct_user_info.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.phone_no
     *
     * @return the value of ad_deduct_user_info.phone_no
     *
     * @mbggenerated
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * set the value of the database column ad_deduct_user_info.phone_no
     *
     * @param phoneNo the value for ad_deduct_user_info.phone_no
     *
     * @mbggenerated
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    /**
     * return the value of the database column ad_deduct_user_info.real_name
     *
     * @return the value of ad_deduct_user_info.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * set the value of the database column ad_deduct_user_info.real_name
     *
     * @param realName the value for ad_deduct_user_info.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * corresponds to the database table ad_deduct_user_info
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
        sb.append(", auditMemo=").append(auditMemo);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", certNo=").append(certNo);
        sb.append(", certType=").append(certType);
        sb.append(", contractNo=").append(contractNo);
        sb.append(", contractValidity=").append(contractValidity);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", memo=").append(memo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", phoneNo=").append(phoneNo);
        sb.append(", realName=").append(realName);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table ad_deduct_user_info
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
        AdDeductUserInfoDO other = (AdDeductUserInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getAuditMemo() == null ? other.getAuditMemo() == null : this.getAuditMemo().equals(other.getAuditMemo()))
            && (this.getAuditStatus() == null ? other.getAuditStatus() == null : this.getAuditStatus().equals(other.getAuditStatus()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getCertType() == null ? other.getCertType() == null : this.getCertType().equals(other.getCertType()))
            && (this.getContractNo() == null ? other.getContractNo() == null : this.getContractNo().equals(other.getContractNo()))
            && (this.getContractValidity() == null ? other.getContractValidity() == null : this.getContractValidity().equals(other.getContractValidity()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getPhoneNo() == null ? other.getPhoneNo() == null : this.getPhoneNo().equals(other.getPhoneNo()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()));
    }

    /**
     * corresponds to the database table ad_deduct_user_info
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
        result = prime * result + ((getAuditMemo() == null) ? 0 : getAuditMemo().hashCode());
        result = prime * result + ((getAuditStatus() == null) ? 0 : getAuditStatus().hashCode());
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getCertType() == null) ? 0 : getCertType().hashCode());
        result = prime * result + ((getContractNo() == null) ? 0 : getContractNo().hashCode());
        result = prime * result + ((getContractValidity() == null) ? 0 : getContractValidity().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getPhoneNo() == null) ? 0 : getPhoneNo().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        return result;
    }
}