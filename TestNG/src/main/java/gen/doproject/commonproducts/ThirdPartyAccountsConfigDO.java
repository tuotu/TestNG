/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ThirdPartyAccountsConfigDO.java
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

public class ThirdPartyAccountsConfigDO implements Serializable {
    /**
     * corresponds to the database column third_party_accounts_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column third_party_accounts_config.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column third_party_accounts_config.channel_type
     *
     * @mbggenerated
     */
    private String channelType;

    /**
     * corresponds to the database column third_party_accounts_config.config_type
     *
     * @mbggenerated
     */
    private String configType;

    /**
     * corresponds to the database column third_party_accounts_config.config_value
     *
     * @mbggenerated
     */
    private String configValue;

    /**
     * corresponds to the database column third_party_accounts_config.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column third_party_accounts_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column third_party_accounts_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column third_party_accounts_config.id
     *
     * @return the value of third_party_accounts_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column third_party_accounts_config.id
     *
     * @param id the value for third_party_accounts_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column third_party_accounts_config.biz_no
     *
     * @return the value of third_party_accounts_config.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column third_party_accounts_config.biz_no
     *
     * @param bizNo the value for third_party_accounts_config.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column third_party_accounts_config.channel_type
     *
     * @return the value of third_party_accounts_config.channel_type
     *
     * @mbggenerated
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * set the value of the database column third_party_accounts_config.channel_type
     *
     * @param channelType the value for third_party_accounts_config.channel_type
     *
     * @mbggenerated
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    /**
     * return the value of the database column third_party_accounts_config.config_type
     *
     * @return the value of third_party_accounts_config.config_type
     *
     * @mbggenerated
     */
    public String getConfigType() {
        return configType;
    }

    /**
     * set the value of the database column third_party_accounts_config.config_type
     *
     * @param configType the value for third_party_accounts_config.config_type
     *
     * @mbggenerated
     */
    public void setConfigType(String configType) {
        this.configType = configType == null ? null : configType.trim();
    }

    /**
     * return the value of the database column third_party_accounts_config.config_value
     *
     * @return the value of third_party_accounts_config.config_value
     *
     * @mbggenerated
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * set the value of the database column third_party_accounts_config.config_value
     *
     * @param configValue the value for third_party_accounts_config.config_value
     *
     * @mbggenerated
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }

    /**
     * return the value of the database column third_party_accounts_config.merchant_user_id
     *
     * @return the value of third_party_accounts_config.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column third_party_accounts_config.merchant_user_id
     *
     * @param merchantUserId the value for third_party_accounts_config.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column third_party_accounts_config.raw_add_time
     *
     * @return the value of third_party_accounts_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column third_party_accounts_config.raw_add_time
     *
     * @param rawAddTime the value for third_party_accounts_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column third_party_accounts_config.raw_update_time
     *
     * @return the value of third_party_accounts_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column third_party_accounts_config.raw_update_time
     *
     * @param rawUpdateTime the value for third_party_accounts_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table third_party_accounts_config
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
        sb.append(", channelType=").append(channelType);
        sb.append(", configType=").append(configType);
        sb.append(", configValue=").append(configValue);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table third_party_accounts_config
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
        ThirdPartyAccountsConfigDO other = (ThirdPartyAccountsConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getChannelType() == null ? other.getChannelType() == null : this.getChannelType().equals(other.getChannelType()))
            && (this.getConfigType() == null ? other.getConfigType() == null : this.getConfigType().equals(other.getConfigType()))
            && (this.getConfigValue() == null ? other.getConfigValue() == null : this.getConfigValue().equals(other.getConfigValue()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        result = prime * result + ((getConfigType() == null) ? 0 : getConfigType().hashCode());
        result = prime * result + ((getConfigValue() == null) ? 0 : getConfigValue().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}