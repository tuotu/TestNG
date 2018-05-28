/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastTradeMerchantDO.java
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

public class FastTradeMerchantDO implements Serializable {
    /**
     * corresponds to the database column fast_trade_merchant.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column fast_trade_merchant.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_trade_merchant.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column fast_trade_merchant.channel_enable
     *
     * @mbggenerated
     */
    private String channelEnable;

    /**
     * corresponds to the database column fast_trade_merchant.channel_validate_way
     *
     * @mbggenerated
     */
    private String channelValidateWay;

    /**
     * corresponds to the database column fast_trade_merchant.enable
     *
     * @mbggenerated
     */
    private String enable;

    /**
     * corresponds to the database column fast_trade_merchant.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column fast_trade_merchant.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column fast_trade_merchant.merchant_name
     *
     * @mbggenerated
     */
    private String merchantName;

    /**
     * corresponds to the database column fast_trade_merchant.operation_name
     *
     * @mbggenerated
     */
    private String operationName;

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_trade_merchant.id
     *
     * @return the value of fast_trade_merchant.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column fast_trade_merchant.id
     *
     * @param id the value for fast_trade_merchant.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_trade_merchant.raw_add_time
     *
     * @return the value of fast_trade_merchant.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_trade_merchant.raw_add_time
     *
     * @param rawAddTime the value for fast_trade_merchant.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_trade_merchant.raw_update_time
     *
     * @return the value of fast_trade_merchant.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_trade_merchant.raw_update_time
     *
     * @param rawUpdateTime the value for fast_trade_merchant.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column fast_trade_merchant.channel_enable
     *
     * @return the value of fast_trade_merchant.channel_enable
     *
     * @mbggenerated
     */
    public String getChannelEnable() {
        return channelEnable;
    }

    /**
     * set the value of the database column fast_trade_merchant.channel_enable
     *
     * @param channelEnable the value for fast_trade_merchant.channel_enable
     *
     * @mbggenerated
     */
    public void setChannelEnable(String channelEnable) {
        this.channelEnable = channelEnable == null ? null : channelEnable.trim();
    }

    /**
     * return the value of the database column fast_trade_merchant.channel_validate_way
     *
     * @return the value of fast_trade_merchant.channel_validate_way
     *
     * @mbggenerated
     */
    public String getChannelValidateWay() {
        return channelValidateWay;
    }

    /**
     * set the value of the database column fast_trade_merchant.channel_validate_way
     *
     * @param channelValidateWay the value for fast_trade_merchant.channel_validate_way
     *
     * @mbggenerated
     */
    public void setChannelValidateWay(String channelValidateWay) {
        this.channelValidateWay = channelValidateWay == null ? null : channelValidateWay.trim();
    }

    /**
     * return the value of the database column fast_trade_merchant.enable
     *
     * @return the value of fast_trade_merchant.enable
     *
     * @mbggenerated
     */
    public String getEnable() {
        return enable;
    }

    /**
     * set the value of the database column fast_trade_merchant.enable
     *
     * @param enable the value for fast_trade_merchant.enable
     *
     * @mbggenerated
     */
    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    /**
     * return the value of the database column fast_trade_merchant.memo
     *
     * @return the value of fast_trade_merchant.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column fast_trade_merchant.memo
     *
     * @param memo the value for fast_trade_merchant.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column fast_trade_merchant.merchant_card_no
     *
     * @return the value of fast_trade_merchant.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column fast_trade_merchant.merchant_card_no
     *
     * @param merchantCardNo the value for fast_trade_merchant.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column fast_trade_merchant.merchant_name
     *
     * @return the value of fast_trade_merchant.merchant_name
     *
     * @mbggenerated
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * set the value of the database column fast_trade_merchant.merchant_name
     *
     * @param merchantName the value for fast_trade_merchant.merchant_name
     *
     * @mbggenerated
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    /**
     * return the value of the database column fast_trade_merchant.operation_name
     *
     * @return the value of fast_trade_merchant.operation_name
     *
     * @mbggenerated
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * set the value of the database column fast_trade_merchant.operation_name
     *
     * @param operationName the value for fast_trade_merchant.operation_name
     *
     * @mbggenerated
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    /**
     * corresponds to the database table fast_trade_merchant
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
        sb.append(", channelEnable=").append(channelEnable);
        sb.append(", channelValidateWay=").append(channelValidateWay);
        sb.append(", enable=").append(enable);
        sb.append(", memo=").append(memo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", operationName=").append(operationName);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_trade_merchant
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
        FastTradeMerchantDO other = (FastTradeMerchantDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getChannelEnable() == null ? other.getChannelEnable() == null : this.getChannelEnable().equals(other.getChannelEnable()))
            && (this.getChannelValidateWay() == null ? other.getChannelValidateWay() == null : this.getChannelValidateWay().equals(other.getChannelValidateWay()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getOperationName() == null ? other.getOperationName() == null : this.getOperationName().equals(other.getOperationName()));
    }

    /**
     * corresponds to the database table fast_trade_merchant
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
        result = prime * result + ((getChannelEnable() == null) ? 0 : getChannelEnable().hashCode());
        result = prime * result + ((getChannelValidateWay() == null) ? 0 : getChannelValidateWay().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        return result;
    }
}