/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferContactsDO.java
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

public class TransferContactsDO implements Serializable {
    /**
     * corresponds to the database column transfer_contacts.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column transfer_contacts.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column transfer_contacts.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column transfer_contacts.bank_account_no
     *
     * @mbggenerated
     */
    private String bankAccountNo;

    /**
     * corresponds to the database column transfer_contacts.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column transfer_contacts.bank_account_no_mask
     *
     * @mbggenerated
     */
    private String bankAccountNoMask;

    /**
     * corresponds to the database column transfer_contacts.bank_address
     *
     * @mbggenerated
     */
    private String bankAddress;

    /**
     * corresponds to the database column transfer_contacts.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column transfer_contacts.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * corresponds to the database column transfer_contacts.bind_id
     *
     * @mbggenerated
     */
    private String bindId;

    /**
     * corresponds to the database column transfer_contacts.city_name
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * corresponds to the database column transfer_contacts.contact_real_name
     *
     * @mbggenerated
     */
    private String contactRealName;

    /**
     * corresponds to the database column transfer_contacts.contact_user_id
     *
     * @mbggenerated
     */
    private String contactUserId;

    /**
     * corresponds to the database column transfer_contacts.contact_user_name
     *
     * @mbggenerated
     */
    private String contactUserName;

    /**
     * corresponds to the database column transfer_contacts.prov_name
     *
     * @mbggenerated
     */
    private String provName;

    /**
     * corresponds to the database column transfer_contacts.public_tag
     *
     * @mbggenerated
     */
    private String publicTag;

    /**
     * corresponds to the database column transfer_contacts.transfer_contacts_type
     *
     * @mbggenerated
     */
    private String transferContactsType;

    /**
     * corresponds to the database column transfer_contacts.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column transfer_contacts.id
     *
     * @return the value of transfer_contacts.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column transfer_contacts.id
     *
     * @param id the value for transfer_contacts.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column transfer_contacts.raw_add_time
     *
     * @return the value of transfer_contacts.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column transfer_contacts.raw_add_time
     *
     * @param rawAddTime the value for transfer_contacts.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column transfer_contacts.raw_update_time
     *
     * @return the value of transfer_contacts.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column transfer_contacts.raw_update_time
     *
     * @param rawUpdateTime the value for transfer_contacts.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column transfer_contacts.bank_account_no
     *
     * @return the value of transfer_contacts.bank_account_no
     *
     * @mbggenerated
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * set the value of the database column transfer_contacts.bank_account_no
     *
     * @param bankAccountNo the value for transfer_contacts.bank_account_no
     *
     * @mbggenerated
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * return the value of the database column transfer_contacts.sec_index
     *
     * @return the value of transfer_contacts.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column transfer_contacts.sec_index
     *
     * @param secIndex the value for transfer_contacts.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column transfer_contacts.bank_account_no_mask
     *
     * @return the value of transfer_contacts.bank_account_no_mask
     *
     * @mbggenerated
     */
    public String getBankAccountNoMask() {
        return bankAccountNoMask;
    }

    /**
     * set the value of the database column transfer_contacts.bank_account_no_mask
     *
     * @param bankAccountNoMask the value for transfer_contacts.bank_account_no_mask
     *
     * @mbggenerated
     */
    public void setBankAccountNoMask(String bankAccountNoMask) {
        this.bankAccountNoMask = bankAccountNoMask == null ? null : bankAccountNoMask.trim();
    }

    /**
     * return the value of the database column transfer_contacts.bank_address
     *
     * @return the value of transfer_contacts.bank_address
     *
     * @mbggenerated
     */
    public String getBankAddress() {
        return bankAddress;
    }

    /**
     * set the value of the database column transfer_contacts.bank_address
     *
     * @param bankAddress the value for transfer_contacts.bank_address
     *
     * @mbggenerated
     */
    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    /**
     * return the value of the database column transfer_contacts.bank_code
     *
     * @return the value of transfer_contacts.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column transfer_contacts.bank_code
     *
     * @param bankCode the value for transfer_contacts.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column transfer_contacts.bank_name
     *
     * @return the value of transfer_contacts.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set the value of the database column transfer_contacts.bank_name
     *
     * @param bankName the value for transfer_contacts.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * return the value of the database column transfer_contacts.bind_id
     *
     * @return the value of transfer_contacts.bind_id
     *
     * @mbggenerated
     */
    public String getBindId() {
        return bindId;
    }

    /**
     * set the value of the database column transfer_contacts.bind_id
     *
     * @param bindId the value for transfer_contacts.bind_id
     *
     * @mbggenerated
     */
    public void setBindId(String bindId) {
        this.bindId = bindId == null ? null : bindId.trim();
    }

    /**
     * return the value of the database column transfer_contacts.city_name
     *
     * @return the value of transfer_contacts.city_name
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * set the value of the database column transfer_contacts.city_name
     *
     * @param cityName the value for transfer_contacts.city_name
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * return the value of the database column transfer_contacts.contact_real_name
     *
     * @return the value of transfer_contacts.contact_real_name
     *
     * @mbggenerated
     */
    public String getContactRealName() {
        return contactRealName;
    }

    /**
     * set the value of the database column transfer_contacts.contact_real_name
     *
     * @param contactRealName the value for transfer_contacts.contact_real_name
     *
     * @mbggenerated
     */
    public void setContactRealName(String contactRealName) {
        this.contactRealName = contactRealName == null ? null : contactRealName.trim();
    }

    /**
     * return the value of the database column transfer_contacts.contact_user_id
     *
     * @return the value of transfer_contacts.contact_user_id
     *
     * @mbggenerated
     */
    public String getContactUserId() {
        return contactUserId;
    }

    /**
     * set the value of the database column transfer_contacts.contact_user_id
     *
     * @param contactUserId the value for transfer_contacts.contact_user_id
     *
     * @mbggenerated
     */
    public void setContactUserId(String contactUserId) {
        this.contactUserId = contactUserId == null ? null : contactUserId.trim();
    }

    /**
     * return the value of the database column transfer_contacts.contact_user_name
     *
     * @return the value of transfer_contacts.contact_user_name
     *
     * @mbggenerated
     */
    public String getContactUserName() {
        return contactUserName;
    }

    /**
     * set the value of the database column transfer_contacts.contact_user_name
     *
     * @param contactUserName the value for transfer_contacts.contact_user_name
     *
     * @mbggenerated
     */
    public void setContactUserName(String contactUserName) {
        this.contactUserName = contactUserName == null ? null : contactUserName.trim();
    }

    /**
     * return the value of the database column transfer_contacts.prov_name
     *
     * @return the value of transfer_contacts.prov_name
     *
     * @mbggenerated
     */
    public String getProvName() {
        return provName;
    }

    /**
     * set the value of the database column transfer_contacts.prov_name
     *
     * @param provName the value for transfer_contacts.prov_name
     *
     * @mbggenerated
     */
    public void setProvName(String provName) {
        this.provName = provName == null ? null : provName.trim();
    }

    /**
     * return the value of the database column transfer_contacts.public_tag
     *
     * @return the value of transfer_contacts.public_tag
     *
     * @mbggenerated
     */
    public String getPublicTag() {
        return publicTag;
    }

    /**
     * set the value of the database column transfer_contacts.public_tag
     *
     * @param publicTag the value for transfer_contacts.public_tag
     *
     * @mbggenerated
     */
    public void setPublicTag(String publicTag) {
        this.publicTag = publicTag == null ? null : publicTag.trim();
    }

    /**
     * return the value of the database column transfer_contacts.transfer_contacts_type
     *
     * @return the value of transfer_contacts.transfer_contacts_type
     *
     * @mbggenerated
     */
    public String getTransferContactsType() {
        return transferContactsType;
    }

    /**
     * set the value of the database column transfer_contacts.transfer_contacts_type
     *
     * @param transferContactsType the value for transfer_contacts.transfer_contacts_type
     *
     * @mbggenerated
     */
    public void setTransferContactsType(String transferContactsType) {
        this.transferContactsType = transferContactsType == null ? null : transferContactsType.trim();
    }

    /**
     * return the value of the database column transfer_contacts.user_id
     *
     * @return the value of transfer_contacts.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column transfer_contacts.user_id
     *
     * @param userId the value for transfer_contacts.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * corresponds to the database table transfer_contacts
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
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", bankAccountNoMask=").append(bankAccountNoMask);
        sb.append(", bankAddress=").append(bankAddress);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", bindId=").append(bindId);
        sb.append(", cityName=").append(cityName);
        sb.append(", contactRealName=").append(contactRealName);
        sb.append(", contactUserId=").append(contactUserId);
        sb.append(", contactUserName=").append(contactUserName);
        sb.append(", provName=").append(provName);
        sb.append(", publicTag=").append(publicTag);
        sb.append(", transferContactsType=").append(transferContactsType);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table transfer_contacts
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
        TransferContactsDO other = (TransferContactsDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getBankAccountNoMask() == null ? other.getBankAccountNoMask() == null : this.getBankAccountNoMask().equals(other.getBankAccountNoMask()))
            && (this.getBankAddress() == null ? other.getBankAddress() == null : this.getBankAddress().equals(other.getBankAddress()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBindId() == null ? other.getBindId() == null : this.getBindId().equals(other.getBindId()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getContactRealName() == null ? other.getContactRealName() == null : this.getContactRealName().equals(other.getContactRealName()))
            && (this.getContactUserId() == null ? other.getContactUserId() == null : this.getContactUserId().equals(other.getContactUserId()))
            && (this.getContactUserName() == null ? other.getContactUserName() == null : this.getContactUserName().equals(other.getContactUserName()))
            && (this.getProvName() == null ? other.getProvName() == null : this.getProvName().equals(other.getProvName()))
            && (this.getPublicTag() == null ? other.getPublicTag() == null : this.getPublicTag().equals(other.getPublicTag()))
            && (this.getTransferContactsType() == null ? other.getTransferContactsType() == null : this.getTransferContactsType().equals(other.getTransferContactsType()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * corresponds to the database table transfer_contacts
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
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getBankAccountNoMask() == null) ? 0 : getBankAccountNoMask().hashCode());
        result = prime * result + ((getBankAddress() == null) ? 0 : getBankAddress().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBindId() == null) ? 0 : getBindId().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getContactRealName() == null) ? 0 : getContactRealName().hashCode());
        result = prime * result + ((getContactUserId() == null) ? 0 : getContactUserId().hashCode());
        result = prime * result + ((getContactUserName() == null) ? 0 : getContactUserName().hashCode());
        result = prime * result + ((getProvName() == null) ? 0 : getProvName().hashCode());
        result = prime * result + ((getPublicTag() == null) ? 0 : getPublicTag().hashCode());
        result = prime * result + ((getTransferContactsType() == null) ? 0 : getTransferContactsType().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}