/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointAccountsDO.java
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

public class JointAccountsDO implements Serializable {
    /**
     * corresponds to the database column joint_accounts.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column joint_accounts.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column joint_accounts.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column joint_accounts.enable
     *
     * @mbggenerated
     */
    private Long enable;

    /**
     * corresponds to the database column joint_accounts.joint_account_no
     *
     * @mbggenerated
     */
    private String jointAccountNo;

    /**
     * corresponds to the database column joint_accounts.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column joint_accounts.joint_account_no_mask
     *
     * @mbggenerated
     */
    private String jointAccountNoMask;

    /**
     * corresponds to the database column joint_accounts.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column joint_accounts.notify_url
     *
     * @mbggenerated
     */
    private String notifyUrl;

    /**
     * corresponds to the database column joint_accounts.use_for
     *
     * @mbggenerated
     */
    private String useFor;

    /**
     * corresponds to the database column joint_accounts.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column joint_accounts.user_real_name
     *
     * @mbggenerated
     */
    private String userRealName;

    /**
     * corresponds to the database column joint_accounts.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column joint_accounts.open_bank_name
     *
     * @mbggenerated
     */
    private String openBankName;

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column joint_accounts.id
     *
     * @return the value of joint_accounts.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column joint_accounts.id
     *
     * @param id the value for joint_accounts.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column joint_accounts.raw_add_time
     *
     * @return the value of joint_accounts.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column joint_accounts.raw_add_time
     *
     * @param rawAddTime the value for joint_accounts.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column joint_accounts.raw_update_time
     *
     * @return the value of joint_accounts.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column joint_accounts.raw_update_time
     *
     * @param rawUpdateTime the value for joint_accounts.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column joint_accounts.enable
     *
     * @return the value of joint_accounts.enable
     *
     * @mbggenerated
     */
    public Long getEnable() {
        return enable;
    }

    /**
     * set the value of the database column joint_accounts.enable
     *
     * @param enable the value for joint_accounts.enable
     *
     * @mbggenerated
     */
    public void setEnable(Long enable) {
        this.enable = enable;
    }

    /**
     * return the value of the database column joint_accounts.joint_account_no
     *
     * @return the value of joint_accounts.joint_account_no
     *
     * @mbggenerated
     */
    public String getJointAccountNo() {
        return jointAccountNo;
    }

    /**
     * set the value of the database column joint_accounts.joint_account_no
     *
     * @param jointAccountNo the value for joint_accounts.joint_account_no
     *
     * @mbggenerated
     */
    public void setJointAccountNo(String jointAccountNo) {
        this.jointAccountNo = jointAccountNo == null ? null : jointAccountNo.trim();
    }

    /**
     * return the value of the database column joint_accounts.sec_index
     *
     * @return the value of joint_accounts.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column joint_accounts.sec_index
     *
     * @param secIndex the value for joint_accounts.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column joint_accounts.joint_account_no_mask
     *
     * @return the value of joint_accounts.joint_account_no_mask
     *
     * @mbggenerated
     */
    public String getJointAccountNoMask() {
        return jointAccountNoMask;
    }

    /**
     * set the value of the database column joint_accounts.joint_account_no_mask
     *
     * @param jointAccountNoMask the value for joint_accounts.joint_account_no_mask
     *
     * @mbggenerated
     */
    public void setJointAccountNoMask(String jointAccountNoMask) {
        this.jointAccountNoMask = jointAccountNoMask == null ? null : jointAccountNoMask.trim();
    }

    /**
     * return the value of the database column joint_accounts.merchant_card_no
     *
     * @return the value of joint_accounts.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column joint_accounts.merchant_card_no
     *
     * @param merchantCardNo the value for joint_accounts.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column joint_accounts.notify_url
     *
     * @return the value of joint_accounts.notify_url
     *
     * @mbggenerated
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * set the value of the database column joint_accounts.notify_url
     *
     * @param notifyUrl the value for joint_accounts.notify_url
     *
     * @mbggenerated
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    /**
     * return the value of the database column joint_accounts.use_for
     *
     * @return the value of joint_accounts.use_for
     *
     * @mbggenerated
     */
    public String getUseFor() {
        return useFor;
    }

    /**
     * set the value of the database column joint_accounts.use_for
     *
     * @param useFor the value for joint_accounts.use_for
     *
     * @mbggenerated
     */
    public void setUseFor(String useFor) {
        this.useFor = useFor == null ? null : useFor.trim();
    }

    /**
     * return the value of the database column joint_accounts.user_id
     *
     * @return the value of joint_accounts.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column joint_accounts.user_id
     *
     * @param userId the value for joint_accounts.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column joint_accounts.user_real_name
     *
     * @return the value of joint_accounts.user_real_name
     *
     * @mbggenerated
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * set the value of the database column joint_accounts.user_real_name
     *
     * @param userRealName the value for joint_accounts.user_real_name
     *
     * @mbggenerated
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /**
     * return the value of the database column joint_accounts.bank_code
     *
     * @return the value of joint_accounts.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column joint_accounts.bank_code
     *
     * @param bankCode the value for joint_accounts.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column joint_accounts.open_bank_name
     *
     * @return the value of joint_accounts.open_bank_name
     *
     * @mbggenerated
     */
    public String getOpenBankName() {
        return openBankName;
    }

    /**
     * set the value of the database column joint_accounts.open_bank_name
     *
     * @param openBankName the value for joint_accounts.open_bank_name
     *
     * @mbggenerated
     */
    public void setOpenBankName(String openBankName) {
        this.openBankName = openBankName == null ? null : openBankName.trim();
    }

    /**
     * corresponds to the database table joint_accounts
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
        sb.append(", enable=").append(enable);
        sb.append(", jointAccountNo=").append(jointAccountNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", jointAccountNoMask=").append(jointAccountNoMask);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", useFor=").append(useFor);
        sb.append(", userId=").append(userId);
        sb.append(", userRealName=").append(userRealName);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", openBankName=").append(openBankName);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table joint_accounts
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
        JointAccountsDO other = (JointAccountsDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getJointAccountNo() == null ? other.getJointAccountNo() == null : this.getJointAccountNo().equals(other.getJointAccountNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getJointAccountNoMask() == null ? other.getJointAccountNoMask() == null : this.getJointAccountNoMask().equals(other.getJointAccountNoMask()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getNotifyUrl() == null ? other.getNotifyUrl() == null : this.getNotifyUrl().equals(other.getNotifyUrl()))
            && (this.getUseFor() == null ? other.getUseFor() == null : this.getUseFor().equals(other.getUseFor()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserRealName() == null ? other.getUserRealName() == null : this.getUserRealName().equals(other.getUserRealName()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getOpenBankName() == null ? other.getOpenBankName() == null : this.getOpenBankName().equals(other.getOpenBankName()));
    }

    /**
     * corresponds to the database table joint_accounts
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
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getJointAccountNo() == null) ? 0 : getJointAccountNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getJointAccountNoMask() == null) ? 0 : getJointAccountNoMask().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getNotifyUrl() == null) ? 0 : getNotifyUrl().hashCode());
        result = prime * result + ((getUseFor() == null) ? 0 : getUseFor().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserRealName() == null) ? 0 : getUserRealName().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getOpenBankName() == null) ? 0 : getOpenBankName().hashCode());
        return result;
    }
}