/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointAccountsApplyLogsDO.java
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

public class JointAccountsApplyLogsDO implements Serializable {
    /**
     * corresponds to the database column joint_accounts_apply_logs.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column joint_accounts_apply_logs.flow_no
     *
     * @mbggenerated
     */
    private String flowNo;

    /**
     * corresponds to the database column joint_accounts_apply_logs.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column joint_accounts_apply_logs.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column joint_accounts_apply_logs.apply_status
     *
     * @mbggenerated
     */
    private String applyStatus;

    /**
     * corresponds to the database column joint_accounts_apply_logs.joint_account_count
     *
     * @mbggenerated
     */
    private Long jointAccountCount;

    /**
     * corresponds to the database column joint_accounts_apply_logs.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column joint_accounts_apply_logs.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column joint_accounts_apply_logs.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column joint_accounts_apply_logs.user_real_name
     *
     * @mbggenerated
     */
    private String userRealName;

    /**
     * corresponds to the database column joint_accounts_apply_logs.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column joint_accounts_apply_logs.open_bank_name
     *
     * @mbggenerated
     */
    private String openBankName;

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column joint_accounts_apply_logs.id
     *
     * @return the value of joint_accounts_apply_logs.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.id
     *
     * @param id the value for joint_accounts_apply_logs.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.flow_no
     *
     * @return the value of joint_accounts_apply_logs.flow_no
     *
     * @mbggenerated
     */
    public String getFlowNo() {
        return flowNo;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.flow_no
     *
     * @param flowNo the value for joint_accounts_apply_logs.flow_no
     *
     * @mbggenerated
     */
    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo == null ? null : flowNo.trim();
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.raw_add_time
     *
     * @return the value of joint_accounts_apply_logs.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.raw_add_time
     *
     * @param rawAddTime the value for joint_accounts_apply_logs.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.raw_update_time
     *
     * @return the value of joint_accounts_apply_logs.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.raw_update_time
     *
     * @param rawUpdateTime the value for joint_accounts_apply_logs.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.apply_status
     *
     * @return the value of joint_accounts_apply_logs.apply_status
     *
     * @mbggenerated
     */
    public String getApplyStatus() {
        return applyStatus;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.apply_status
     *
     * @param applyStatus the value for joint_accounts_apply_logs.apply_status
     *
     * @mbggenerated
     */
    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus == null ? null : applyStatus.trim();
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.joint_account_count
     *
     * @return the value of joint_accounts_apply_logs.joint_account_count
     *
     * @mbggenerated
     */
    public Long getJointAccountCount() {
        return jointAccountCount;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.joint_account_count
     *
     * @param jointAccountCount the value for joint_accounts_apply_logs.joint_account_count
     *
     * @mbggenerated
     */
    public void setJointAccountCount(Long jointAccountCount) {
        this.jointAccountCount = jointAccountCount;
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.memo
     *
     * @return the value of joint_accounts_apply_logs.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.memo
     *
     * @param memo the value for joint_accounts_apply_logs.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.merchant_card_no
     *
     * @return the value of joint_accounts_apply_logs.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.merchant_card_no
     *
     * @param merchantCardNo the value for joint_accounts_apply_logs.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.user_id
     *
     * @return the value of joint_accounts_apply_logs.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.user_id
     *
     * @param userId the value for joint_accounts_apply_logs.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.user_real_name
     *
     * @return the value of joint_accounts_apply_logs.user_real_name
     *
     * @mbggenerated
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.user_real_name
     *
     * @param userRealName the value for joint_accounts_apply_logs.user_real_name
     *
     * @mbggenerated
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.bank_code
     *
     * @return the value of joint_accounts_apply_logs.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.bank_code
     *
     * @param bankCode the value for joint_accounts_apply_logs.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column joint_accounts_apply_logs.open_bank_name
     *
     * @return the value of joint_accounts_apply_logs.open_bank_name
     *
     * @mbggenerated
     */
    public String getOpenBankName() {
        return openBankName;
    }

    /**
     * set the value of the database column joint_accounts_apply_logs.open_bank_name
     *
     * @param openBankName the value for joint_accounts_apply_logs.open_bank_name
     *
     * @mbggenerated
     */
    public void setOpenBankName(String openBankName) {
        this.openBankName = openBankName == null ? null : openBankName.trim();
    }

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", flowNo=").append(flowNo);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", applyStatus=").append(applyStatus);
        sb.append(", jointAccountCount=").append(jointAccountCount);
        sb.append(", memo=").append(memo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", userId=").append(userId);
        sb.append(", userRealName=").append(userRealName);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", openBankName=").append(openBankName);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table joint_accounts_apply_logs
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
        JointAccountsApplyLogsDO other = (JointAccountsApplyLogsDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlowNo() == null ? other.getFlowNo() == null : this.getFlowNo().equals(other.getFlowNo()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getApplyStatus() == null ? other.getApplyStatus() == null : this.getApplyStatus().equals(other.getApplyStatus()))
            && (this.getJointAccountCount() == null ? other.getJointAccountCount() == null : this.getJointAccountCount().equals(other.getJointAccountCount()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserRealName() == null ? other.getUserRealName() == null : this.getUserRealName().equals(other.getUserRealName()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getOpenBankName() == null ? other.getOpenBankName() == null : this.getOpenBankName().equals(other.getOpenBankName()));
    }

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlowNo() == null) ? 0 : getFlowNo().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getApplyStatus() == null) ? 0 : getApplyStatus().hashCode());
        result = prime * result + ((getJointAccountCount() == null) ? 0 : getJointAccountCount().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserRealName() == null) ? 0 : getUserRealName().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getOpenBankName() == null) ? 0 : getOpenBankName().hashCode());
        return result;
    }
}