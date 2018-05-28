/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ThirdPartyAccountsDO.java
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

public class ThirdPartyAccountsDO implements Serializable {
    /**
     * corresponds to the database column third_party_accounts.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column third_party_accounts.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column third_party_accounts.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column third_party_accounts.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column third_party_accounts.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * corresponds to the database column third_party_accounts.account_type
     *
     * @mbggenerated
     */
    private String accountType;

    /**
     * corresponds to the database column third_party_accounts.channel_type
     *
     * @mbggenerated
     */
    private String channelType;

    /**
     * corresponds to the database column third_party_accounts.short_name
     *
     * @mbggenerated
     */
    private String shortName;

    /**
     * corresponds to the database column third_party_accounts.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * corresponds to the database column third_party_accounts.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * corresponds to the database column third_party_accounts.county
     *
     * @mbggenerated
     */
    private String county;

    /**
     * corresponds to the database column third_party_accounts.merchant_address
     *
     * @mbggenerated
     */
    private String merchantAddress;

    /**
     * corresponds to the database column third_party_accounts.category
     *
     * @mbggenerated
     */
    private String category;

    /**
     * corresponds to the database column third_party_accounts.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column third_party_accounts.merchant_code
     *
     * @mbggenerated
     */
    private String merchantCode;

    /**
     * corresponds to the database column third_party_accounts.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column third_party_accounts.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column third_party_accounts.id
     *
     * @return the value of third_party_accounts.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column third_party_accounts.id
     *
     * @param id the value for third_party_accounts.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column third_party_accounts.biz_no
     *
     * @return the value of third_party_accounts.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column third_party_accounts.biz_no
     *
     * @param bizNo the value for third_party_accounts.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column third_party_accounts.gid
     *
     * @return the value of third_party_accounts.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column third_party_accounts.gid
     *
     * @param gid the value for third_party_accounts.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column third_party_accounts.merchant_user_id
     *
     * @return the value of third_party_accounts.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column third_party_accounts.merchant_user_id
     *
     * @param merchantUserId the value for third_party_accounts.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column third_party_accounts.status
     *
     * @return the value of third_party_accounts.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * set the value of the database column third_party_accounts.status
     *
     * @param status the value for third_party_accounts.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * return the value of the database column third_party_accounts.account_type
     *
     * @return the value of third_party_accounts.account_type
     *
     * @mbggenerated
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * set the value of the database column third_party_accounts.account_type
     *
     * @param accountType the value for third_party_accounts.account_type
     *
     * @mbggenerated
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * return the value of the database column third_party_accounts.channel_type
     *
     * @return the value of third_party_accounts.channel_type
     *
     * @mbggenerated
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * set the value of the database column third_party_accounts.channel_type
     *
     * @param channelType the value for third_party_accounts.channel_type
     *
     * @mbggenerated
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    /**
     * return the value of the database column third_party_accounts.short_name
     *
     * @return the value of third_party_accounts.short_name
     *
     * @mbggenerated
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * set the value of the database column third_party_accounts.short_name
     *
     * @param shortName the value for third_party_accounts.short_name
     *
     * @mbggenerated
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * return the value of the database column third_party_accounts.province
     *
     * @return the value of third_party_accounts.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * set the value of the database column third_party_accounts.province
     *
     * @param province the value for third_party_accounts.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * return the value of the database column third_party_accounts.city
     *
     * @return the value of third_party_accounts.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * set the value of the database column third_party_accounts.city
     *
     * @param city the value for third_party_accounts.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * return the value of the database column third_party_accounts.county
     *
     * @return the value of third_party_accounts.county
     *
     * @mbggenerated
     */
    public String getCounty() {
        return county;
    }

    /**
     * set the value of the database column third_party_accounts.county
     *
     * @param county the value for third_party_accounts.county
     *
     * @mbggenerated
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * return the value of the database column third_party_accounts.merchant_address
     *
     * @return the value of third_party_accounts.merchant_address
     *
     * @mbggenerated
     */
    public String getMerchantAddress() {
        return merchantAddress;
    }

    /**
     * set the value of the database column third_party_accounts.merchant_address
     *
     * @param merchantAddress the value for third_party_accounts.merchant_address
     *
     * @mbggenerated
     */
    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress == null ? null : merchantAddress.trim();
    }

    /**
     * return the value of the database column third_party_accounts.category
     *
     * @return the value of third_party_accounts.category
     *
     * @mbggenerated
     */
    public String getCategory() {
        return category;
    }

    /**
     * set the value of the database column third_party_accounts.category
     *
     * @param category the value for third_party_accounts.category
     *
     * @mbggenerated
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * return the value of the database column third_party_accounts.memo
     *
     * @return the value of third_party_accounts.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column third_party_accounts.memo
     *
     * @param memo the value for third_party_accounts.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column third_party_accounts.merchant_code
     *
     * @return the value of third_party_accounts.merchant_code
     *
     * @mbggenerated
     */
    public String getMerchantCode() {
        return merchantCode;
    }

    /**
     * set the value of the database column third_party_accounts.merchant_code
     *
     * @param merchantCode the value for third_party_accounts.merchant_code
     *
     * @mbggenerated
     */
    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    /**
     * return the value of the database column third_party_accounts.raw_add_time
     *
     * @return the value of third_party_accounts.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column third_party_accounts.raw_add_time
     *
     * @param rawAddTime the value for third_party_accounts.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column third_party_accounts.raw_update_time
     *
     * @return the value of third_party_accounts.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column third_party_accounts.raw_update_time
     *
     * @param rawUpdateTime the value for third_party_accounts.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", gid=").append(gid);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", status=").append(status);
        sb.append(", accountType=").append(accountType);
        sb.append(", channelType=").append(channelType);
        sb.append(", shortName=").append(shortName);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", merchantAddress=").append(merchantAddress);
        sb.append(", category=").append(category);
        sb.append(", memo=").append(memo);
        sb.append(", merchantCode=").append(merchantCode);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table third_party_accounts
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
        ThirdPartyAccountsDO other = (ThirdPartyAccountsDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getChannelType() == null ? other.getChannelType() == null : this.getChannelType().equals(other.getChannelType()))
            && (this.getShortName() == null ? other.getShortName() == null : this.getShortName().equals(other.getShortName()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCounty() == null ? other.getCounty() == null : this.getCounty().equals(other.getCounty()))
            && (this.getMerchantAddress() == null ? other.getMerchantAddress() == null : this.getMerchantAddress().equals(other.getMerchantAddress()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantCode() == null ? other.getMerchantCode() == null : this.getMerchantCode().equals(other.getMerchantCode()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        result = prime * result + ((getShortName() == null) ? 0 : getShortName().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCounty() == null) ? 0 : getCounty().hashCode());
        result = prime * result + ((getMerchantAddress() == null) ? 0 : getMerchantAddress().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantCode() == null) ? 0 : getMerchantCode().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}