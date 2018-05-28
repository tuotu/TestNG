/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferBankInfoDO.java
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

public class TransferBankInfoDO implements Serializable {
    /**
     * corresponds to the database column transfer_bank_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column transfer_bank_info.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column transfer_bank_info.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column transfer_bank_info.active
     *
     * @mbggenerated
     */
    private String active;

    /**
     * corresponds to the database column transfer_bank_info.bank_account_name
     *
     * @mbggenerated
     */
    private String bankAccountName;

    /**
     * corresponds to the database column transfer_bank_info.bank_account_no
     *
     * @mbggenerated
     */
    private String bankAccountNo;

    /**
     * corresponds to the database column transfer_bank_info.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column transfer_bank_info.bank_account_no_mask
     *
     * @mbggenerated
     */
    private String bankAccountNoMask;

    /**
     * corresponds to the database column transfer_bank_info.bank_address
     *
     * @mbggenerated
     */
    private String bankAddress;

    /**
     * corresponds to the database column transfer_bank_info.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column transfer_bank_info.bank_img_url
     *
     * @mbggenerated
     */
    private String bankImgUrl;

    /**
     * corresponds to the database column transfer_bank_info.bank_info_status
     *
     * @mbggenerated
     */
    private String bankInfoStatus;

    /**
     * corresponds to the database column transfer_bank_info.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * corresponds to the database column transfer_bank_info.bind_id
     *
     * @mbggenerated
     */
    private String bindId;

    /**
     * corresponds to the database column transfer_bank_info.city_name
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * corresponds to the database column transfer_bank_info.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column transfer_bank_info.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column transfer_bank_info.prov_name
     *
     * @mbggenerated
     */
    private String provName;

    /**
     * corresponds to the database column transfer_bank_info.public_tag
     *
     * @mbggenerated
     */
    private String publicTag;

    /**
     * corresponds to the database column transfer_bank_info.real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * corresponds to the database column transfer_bank_info.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column transfer_bank_info.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * corresponds to the database column transfer_bank_info.voucher_image_url
     *
     * @mbggenerated
     */
    private String voucherImageUrl;

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column transfer_bank_info.id
     *
     * @return the value of transfer_bank_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column transfer_bank_info.id
     *
     * @param id the value for transfer_bank_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column transfer_bank_info.raw_add_time
     *
     * @return the value of transfer_bank_info.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column transfer_bank_info.raw_add_time
     *
     * @param rawAddTime the value for transfer_bank_info.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column transfer_bank_info.raw_update_time
     *
     * @return the value of transfer_bank_info.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column transfer_bank_info.raw_update_time
     *
     * @param rawUpdateTime the value for transfer_bank_info.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column transfer_bank_info.active
     *
     * @return the value of transfer_bank_info.active
     *
     * @mbggenerated
     */
    public String getActive() {
        return active;
    }

    /**
     * set the value of the database column transfer_bank_info.active
     *
     * @param active the value for transfer_bank_info.active
     *
     * @mbggenerated
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.bank_account_name
     *
     * @return the value of transfer_bank_info.bank_account_name
     *
     * @mbggenerated
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * set the value of the database column transfer_bank_info.bank_account_name
     *
     * @param bankAccountName the value for transfer_bank_info.bank_account_name
     *
     * @mbggenerated
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.bank_account_no
     *
     * @return the value of transfer_bank_info.bank_account_no
     *
     * @mbggenerated
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * set the value of the database column transfer_bank_info.bank_account_no
     *
     * @param bankAccountNo the value for transfer_bank_info.bank_account_no
     *
     * @mbggenerated
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.sec_index
     *
     * @return the value of transfer_bank_info.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column transfer_bank_info.sec_index
     *
     * @param secIndex the value for transfer_bank_info.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.bank_account_no_mask
     *
     * @return the value of transfer_bank_info.bank_account_no_mask
     *
     * @mbggenerated
     */
    public String getBankAccountNoMask() {
        return bankAccountNoMask;
    }

    /**
     * set the value of the database column transfer_bank_info.bank_account_no_mask
     *
     * @param bankAccountNoMask the value for transfer_bank_info.bank_account_no_mask
     *
     * @mbggenerated
     */
    public void setBankAccountNoMask(String bankAccountNoMask) {
        this.bankAccountNoMask = bankAccountNoMask == null ? null : bankAccountNoMask.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.bank_address
     *
     * @return the value of transfer_bank_info.bank_address
     *
     * @mbggenerated
     */
    public String getBankAddress() {
        return bankAddress;
    }

    /**
     * set the value of the database column transfer_bank_info.bank_address
     *
     * @param bankAddress the value for transfer_bank_info.bank_address
     *
     * @mbggenerated
     */
    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.bank_code
     *
     * @return the value of transfer_bank_info.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column transfer_bank_info.bank_code
     *
     * @param bankCode the value for transfer_bank_info.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.bank_img_url
     *
     * @return the value of transfer_bank_info.bank_img_url
     *
     * @mbggenerated
     */
    public String getBankImgUrl() {
        return bankImgUrl;
    }

    /**
     * set the value of the database column transfer_bank_info.bank_img_url
     *
     * @param bankImgUrl the value for transfer_bank_info.bank_img_url
     *
     * @mbggenerated
     */
    public void setBankImgUrl(String bankImgUrl) {
        this.bankImgUrl = bankImgUrl == null ? null : bankImgUrl.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.bank_info_status
     *
     * @return the value of transfer_bank_info.bank_info_status
     *
     * @mbggenerated
     */
    public String getBankInfoStatus() {
        return bankInfoStatus;
    }

    /**
     * set the value of the database column transfer_bank_info.bank_info_status
     *
     * @param bankInfoStatus the value for transfer_bank_info.bank_info_status
     *
     * @mbggenerated
     */
    public void setBankInfoStatus(String bankInfoStatus) {
        this.bankInfoStatus = bankInfoStatus == null ? null : bankInfoStatus.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.bank_name
     *
     * @return the value of transfer_bank_info.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set the value of the database column transfer_bank_info.bank_name
     *
     * @param bankName the value for transfer_bank_info.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.bind_id
     *
     * @return the value of transfer_bank_info.bind_id
     *
     * @mbggenerated
     */
    public String getBindId() {
        return bindId;
    }

    /**
     * set the value of the database column transfer_bank_info.bind_id
     *
     * @param bindId the value for transfer_bank_info.bind_id
     *
     * @mbggenerated
     */
    public void setBindId(String bindId) {
        this.bindId = bindId == null ? null : bindId.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.city_name
     *
     * @return the value of transfer_bank_info.city_name
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * set the value of the database column transfer_bank_info.city_name
     *
     * @param cityName the value for transfer_bank_info.city_name
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.memo
     *
     * @return the value of transfer_bank_info.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column transfer_bank_info.memo
     *
     * @param memo the value for transfer_bank_info.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.merchant_card_no
     *
     * @return the value of transfer_bank_info.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column transfer_bank_info.merchant_card_no
     *
     * @param merchantCardNo the value for transfer_bank_info.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.prov_name
     *
     * @return the value of transfer_bank_info.prov_name
     *
     * @mbggenerated
     */
    public String getProvName() {
        return provName;
    }

    /**
     * set the value of the database column transfer_bank_info.prov_name
     *
     * @param provName the value for transfer_bank_info.prov_name
     *
     * @mbggenerated
     */
    public void setProvName(String provName) {
        this.provName = provName == null ? null : provName.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.public_tag
     *
     * @return the value of transfer_bank_info.public_tag
     *
     * @mbggenerated
     */
    public String getPublicTag() {
        return publicTag;
    }

    /**
     * set the value of the database column transfer_bank_info.public_tag
     *
     * @param publicTag the value for transfer_bank_info.public_tag
     *
     * @mbggenerated
     */
    public void setPublicTag(String publicTag) {
        this.publicTag = publicTag == null ? null : publicTag.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.real_name
     *
     * @return the value of transfer_bank_info.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * set the value of the database column transfer_bank_info.real_name
     *
     * @param realName the value for transfer_bank_info.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.user_id
     *
     * @return the value of transfer_bank_info.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column transfer_bank_info.user_id
     *
     * @param userId the value for transfer_bank_info.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.user_name
     *
     * @return the value of transfer_bank_info.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set the value of the database column transfer_bank_info.user_name
     *
     * @param userName the value for transfer_bank_info.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * return the value of the database column transfer_bank_info.voucher_image_url
     *
     * @return the value of transfer_bank_info.voucher_image_url
     *
     * @mbggenerated
     */
    public String getVoucherImageUrl() {
        return voucherImageUrl;
    }

    /**
     * set the value of the database column transfer_bank_info.voucher_image_url
     *
     * @param voucherImageUrl the value for transfer_bank_info.voucher_image_url
     *
     * @mbggenerated
     */
    public void setVoucherImageUrl(String voucherImageUrl) {
        this.voucherImageUrl = voucherImageUrl == null ? null : voucherImageUrl.trim();
    }

    /**
     * corresponds to the database table transfer_bank_info
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
        sb.append(", active=").append(active);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", bankAccountNoMask=").append(bankAccountNoMask);
        sb.append(", bankAddress=").append(bankAddress);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankImgUrl=").append(bankImgUrl);
        sb.append(", bankInfoStatus=").append(bankInfoStatus);
        sb.append(", bankName=").append(bankName);
        sb.append(", bindId=").append(bindId);
        sb.append(", cityName=").append(cityName);
        sb.append(", memo=").append(memo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", provName=").append(provName);
        sb.append(", publicTag=").append(publicTag);
        sb.append(", realName=").append(realName);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", voucherImageUrl=").append(voucherImageUrl);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table transfer_bank_info
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
        TransferBankInfoDO other = (TransferBankInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getBankAccountName() == null ? other.getBankAccountName() == null : this.getBankAccountName().equals(other.getBankAccountName()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getBankAccountNoMask() == null ? other.getBankAccountNoMask() == null : this.getBankAccountNoMask().equals(other.getBankAccountNoMask()))
            && (this.getBankAddress() == null ? other.getBankAddress() == null : this.getBankAddress().equals(other.getBankAddress()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankImgUrl() == null ? other.getBankImgUrl() == null : this.getBankImgUrl().equals(other.getBankImgUrl()))
            && (this.getBankInfoStatus() == null ? other.getBankInfoStatus() == null : this.getBankInfoStatus().equals(other.getBankInfoStatus()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBindId() == null ? other.getBindId() == null : this.getBindId().equals(other.getBindId()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getProvName() == null ? other.getProvName() == null : this.getProvName().equals(other.getProvName()))
            && (this.getPublicTag() == null ? other.getPublicTag() == null : this.getPublicTag().equals(other.getPublicTag()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getVoucherImageUrl() == null ? other.getVoucherImageUrl() == null : this.getVoucherImageUrl().equals(other.getVoucherImageUrl()));
    }

    /**
     * corresponds to the database table transfer_bank_info
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
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getBankAccountName() == null) ? 0 : getBankAccountName().hashCode());
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getBankAccountNoMask() == null) ? 0 : getBankAccountNoMask().hashCode());
        result = prime * result + ((getBankAddress() == null) ? 0 : getBankAddress().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankImgUrl() == null) ? 0 : getBankImgUrl().hashCode());
        result = prime * result + ((getBankInfoStatus() == null) ? 0 : getBankInfoStatus().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBindId() == null) ? 0 : getBindId().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getProvName() == null) ? 0 : getProvName().hashCode());
        result = prime * result + ((getPublicTag() == null) ? 0 : getPublicTag().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getVoucherImageUrl() == null) ? 0 : getVoucherImageUrl().hashCode());
        return result;
    }
}