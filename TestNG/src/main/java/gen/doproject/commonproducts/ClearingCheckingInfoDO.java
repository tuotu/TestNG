/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingCheckingInfoDO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.doproject.commonproducts;

import com.yjf.common.lang.util.money.Money;
import java.io.Serializable;
import java.util.Date;

public class ClearingCheckingInfoDO implements Serializable {
    /**
     * corresponds to the database column clearing_checking_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column clearing_checking_info.out_order_no
     *
     * @mbggenerated
     */
    private String outOrderNo;

    /**
     * corresponds to the database column clearing_checking_info.system_no
     *
     * @mbggenerated
     */
    private String systemNo;

    /**
     * corresponds to the database column clearing_checking_info.union_trade_time
     *
     * @mbggenerated
     */
    private Date unionTradeTime;

    /**
     * corresponds to the database column clearing_checking_info.partner_trade_time
     *
     * @mbggenerated
     */
    private Date partnerTradeTime;

    /**
     * corresponds to the database column clearing_checking_info.union_partner_id
     *
     * @mbggenerated
     */
    private String unionPartnerId;

    /**
     * corresponds to the database column clearing_checking_info.partner_id
     *
     * @mbggenerated
     */
    private String partnerId;

    /**
     * corresponds to the database column clearing_checking_info.partner_name
     *
     * @mbggenerated
     */
    private String partnerName;

    /**
     * corresponds to the database column clearing_checking_info.pay_flag
     *
     * @mbggenerated
     */
    private String payFlag;

    /**
     * corresponds to the database column clearing_checking_info.trade_amount
     *
     * @mbggenerated
     */
    private Money tradeAmount;

    /**
     * corresponds to the database column clearing_checking_info.channel_no
     *
     * @mbggenerated
     */
    private String channelNo;

    /**
     * corresponds to the database column clearing_checking_info.channel_fee
     *
     * @mbggenerated
     */
    private Money channelFee;

    /**
     * corresponds to the database column clearing_checking_info.checking_status
     *
     * @mbggenerated
     */
    private String checkingStatus;

    /**
     * corresponds to the database column clearing_checking_info.checking_time
     *
     * @mbggenerated
     */
    private Date checkingTime;

    /**
     * corresponds to the database column clearing_checking_info.partner_amount
     *
     * @mbggenerated
     */
    private Money partnerAmount;

    /**
     * corresponds to the database column clearing_checking_info.old_order_no
     *
     * @mbggenerated
     */
    private String oldOrderNo;

    /**
     * corresponds to the database column clearing_checking_info.order_info
     *
     * @mbggenerated
     */
    private String orderInfo;

    /**
     * corresponds to the database column clearing_checking_info.trade_date
     *
     * @mbggenerated
     */
    private Date tradeDate;

    /**
     * corresponds to the database column clearing_checking_info.inner_biz_no
     *
     * @mbggenerated
     */
    private String innerBizNo;

    /**
     * corresponds to the database column clearing_checking_info.unique_checking
     *
     * @mbggenerated
     */
    private String uniqueChecking;

    /**
     * corresponds to the database column clearing_checking_info.send_data
     *
     * @mbggenerated
     */
    private String sendData;

    /**
     * corresponds to the database column clearing_checking_info.partner_pay_no
     *
     * @mbggenerated
     */
    private String partnerPayNo;

    /**
     * corresponds to the database column clearing_checking_info.yjf_pay_no
     *
     * @mbggenerated
     */
    private String yjfPayNo;

    /**
     * corresponds to the database column clearing_checking_info.ipaynow_pay_no
     *
     * @mbggenerated
     */
    private String ipaynowPayNo;

    /**
     * corresponds to the database column clearing_checking_info.gmt_create
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * corresponds to the database column clearing_checking_info.gmt_modified
     *
     * @mbggenerated
     */
    private Date gmtModified;

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column clearing_checking_info.id
     *
     * @return the value of clearing_checking_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column clearing_checking_info.id
     *
     * @param id the value for clearing_checking_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column clearing_checking_info.out_order_no
     *
     * @return the value of clearing_checking_info.out_order_no
     *
     * @mbggenerated
     */
    public String getOutOrderNo() {
        return outOrderNo;
    }

    /**
     * set the value of the database column clearing_checking_info.out_order_no
     *
     * @param outOrderNo the value for clearing_checking_info.out_order_no
     *
     * @mbggenerated
     */
    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.system_no
     *
     * @return the value of clearing_checking_info.system_no
     *
     * @mbggenerated
     */
    public String getSystemNo() {
        return systemNo;
    }

    /**
     * set the value of the database column clearing_checking_info.system_no
     *
     * @param systemNo the value for clearing_checking_info.system_no
     *
     * @mbggenerated
     */
    public void setSystemNo(String systemNo) {
        this.systemNo = systemNo == null ? null : systemNo.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.union_trade_time
     *
     * @return the value of clearing_checking_info.union_trade_time
     *
     * @mbggenerated
     */
    public Date getUnionTradeTime() {
        return unionTradeTime;
    }

    /**
     * set the value of the database column clearing_checking_info.union_trade_time
     *
     * @param unionTradeTime the value for clearing_checking_info.union_trade_time
     *
     * @mbggenerated
     */
    public void setUnionTradeTime(Date unionTradeTime) {
        this.unionTradeTime = unionTradeTime;
    }

    /**
     * return the value of the database column clearing_checking_info.partner_trade_time
     *
     * @return the value of clearing_checking_info.partner_trade_time
     *
     * @mbggenerated
     */
    public Date getPartnerTradeTime() {
        return partnerTradeTime;
    }

    /**
     * set the value of the database column clearing_checking_info.partner_trade_time
     *
     * @param partnerTradeTime the value for clearing_checking_info.partner_trade_time
     *
     * @mbggenerated
     */
    public void setPartnerTradeTime(Date partnerTradeTime) {
        this.partnerTradeTime = partnerTradeTime;
    }

    /**
     * return the value of the database column clearing_checking_info.union_partner_id
     *
     * @return the value of clearing_checking_info.union_partner_id
     *
     * @mbggenerated
     */
    public String getUnionPartnerId() {
        return unionPartnerId;
    }

    /**
     * set the value of the database column clearing_checking_info.union_partner_id
     *
     * @param unionPartnerId the value for clearing_checking_info.union_partner_id
     *
     * @mbggenerated
     */
    public void setUnionPartnerId(String unionPartnerId) {
        this.unionPartnerId = unionPartnerId == null ? null : unionPartnerId.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.partner_id
     *
     * @return the value of clearing_checking_info.partner_id
     *
     * @mbggenerated
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * set the value of the database column clearing_checking_info.partner_id
     *
     * @param partnerId the value for clearing_checking_info.partner_id
     *
     * @mbggenerated
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.partner_name
     *
     * @return the value of clearing_checking_info.partner_name
     *
     * @mbggenerated
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * set the value of the database column clearing_checking_info.partner_name
     *
     * @param partnerName the value for clearing_checking_info.partner_name
     *
     * @mbggenerated
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.pay_flag
     *
     * @return the value of clearing_checking_info.pay_flag
     *
     * @mbggenerated
     */
    public String getPayFlag() {
        return payFlag;
    }

    /**
     * set the value of the database column clearing_checking_info.pay_flag
     *
     * @param payFlag the value for clearing_checking_info.pay_flag
     *
     * @mbggenerated
     */
    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag == null ? null : payFlag.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.trade_amount
     *
     * @return the value of clearing_checking_info.trade_amount
     *
     * @mbggenerated
     */
    public Money getTradeAmount() {
        return tradeAmount;
    }

    /**
     * set the value of the database column clearing_checking_info.trade_amount
     *
     * @param tradeAmount the value for clearing_checking_info.trade_amount
     *
     * @mbggenerated
     */
    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * return the value of the database column clearing_checking_info.channel_no
     *
     * @return the value of clearing_checking_info.channel_no
     *
     * @mbggenerated
     */
    public String getChannelNo() {
        return channelNo;
    }

    /**
     * set the value of the database column clearing_checking_info.channel_no
     *
     * @param channelNo the value for clearing_checking_info.channel_no
     *
     * @mbggenerated
     */
    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo == null ? null : channelNo.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.channel_fee
     *
     * @return the value of clearing_checking_info.channel_fee
     *
     * @mbggenerated
     */
    public Money getChannelFee() {
        return channelFee;
    }

    /**
     * set the value of the database column clearing_checking_info.channel_fee
     *
     * @param channelFee the value for clearing_checking_info.channel_fee
     *
     * @mbggenerated
     */
    public void setChannelFee(Money channelFee) {
        this.channelFee = channelFee;
    }

    /**
     * return the value of the database column clearing_checking_info.checking_status
     *
     * @return the value of clearing_checking_info.checking_status
     *
     * @mbggenerated
     */
    public String getCheckingStatus() {
        return checkingStatus;
    }

    /**
     * set the value of the database column clearing_checking_info.checking_status
     *
     * @param checkingStatus the value for clearing_checking_info.checking_status
     *
     * @mbggenerated
     */
    public void setCheckingStatus(String checkingStatus) {
        this.checkingStatus = checkingStatus == null ? null : checkingStatus.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.checking_time
     *
     * @return the value of clearing_checking_info.checking_time
     *
     * @mbggenerated
     */
    public Date getCheckingTime() {
        return checkingTime;
    }

    /**
     * set the value of the database column clearing_checking_info.checking_time
     *
     * @param checkingTime the value for clearing_checking_info.checking_time
     *
     * @mbggenerated
     */
    public void setCheckingTime(Date checkingTime) {
        this.checkingTime = checkingTime;
    }

    /**
     * return the value of the database column clearing_checking_info.partner_amount
     *
     * @return the value of clearing_checking_info.partner_amount
     *
     * @mbggenerated
     */
    public Money getPartnerAmount() {
        return partnerAmount;
    }

    /**
     * set the value of the database column clearing_checking_info.partner_amount
     *
     * @param partnerAmount the value for clearing_checking_info.partner_amount
     *
     * @mbggenerated
     */
    public void setPartnerAmount(Money partnerAmount) {
        this.partnerAmount = partnerAmount;
    }

    /**
     * return the value of the database column clearing_checking_info.old_order_no
     *
     * @return the value of clearing_checking_info.old_order_no
     *
     * @mbggenerated
     */
    public String getOldOrderNo() {
        return oldOrderNo;
    }

    /**
     * set the value of the database column clearing_checking_info.old_order_no
     *
     * @param oldOrderNo the value for clearing_checking_info.old_order_no
     *
     * @mbggenerated
     */
    public void setOldOrderNo(String oldOrderNo) {
        this.oldOrderNo = oldOrderNo == null ? null : oldOrderNo.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.order_info
     *
     * @return the value of clearing_checking_info.order_info
     *
     * @mbggenerated
     */
    public String getOrderInfo() {
        return orderInfo;
    }

    /**
     * set the value of the database column clearing_checking_info.order_info
     *
     * @param orderInfo the value for clearing_checking_info.order_info
     *
     * @mbggenerated
     */
    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo == null ? null : orderInfo.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.trade_date
     *
     * @return the value of clearing_checking_info.trade_date
     *
     * @mbggenerated
     */
    public Date getTradeDate() {
        return tradeDate;
    }

    /**
     * set the value of the database column clearing_checking_info.trade_date
     *
     * @param tradeDate the value for clearing_checking_info.trade_date
     *
     * @mbggenerated
     */
    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    /**
     * return the value of the database column clearing_checking_info.inner_biz_no
     *
     * @return the value of clearing_checking_info.inner_biz_no
     *
     * @mbggenerated
     */
    public String getInnerBizNo() {
        return innerBizNo;
    }

    /**
     * set the value of the database column clearing_checking_info.inner_biz_no
     *
     * @param innerBizNo the value for clearing_checking_info.inner_biz_no
     *
     * @mbggenerated
     */
    public void setInnerBizNo(String innerBizNo) {
        this.innerBizNo = innerBizNo == null ? null : innerBizNo.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.unique_checking
     *
     * @return the value of clearing_checking_info.unique_checking
     *
     * @mbggenerated
     */
    public String getUniqueChecking() {
        return uniqueChecking;
    }

    /**
     * set the value of the database column clearing_checking_info.unique_checking
     *
     * @param uniqueChecking the value for clearing_checking_info.unique_checking
     *
     * @mbggenerated
     */
    public void setUniqueChecking(String uniqueChecking) {
        this.uniqueChecking = uniqueChecking == null ? null : uniqueChecking.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.send_data
     *
     * @return the value of clearing_checking_info.send_data
     *
     * @mbggenerated
     */
    public String getSendData() {
        return sendData;
    }

    /**
     * set the value of the database column clearing_checking_info.send_data
     *
     * @param sendData the value for clearing_checking_info.send_data
     *
     * @mbggenerated
     */
    public void setSendData(String sendData) {
        this.sendData = sendData == null ? null : sendData.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.partner_pay_no
     *
     * @return the value of clearing_checking_info.partner_pay_no
     *
     * @mbggenerated
     */
    public String getPartnerPayNo() {
        return partnerPayNo;
    }

    /**
     * set the value of the database column clearing_checking_info.partner_pay_no
     *
     * @param partnerPayNo the value for clearing_checking_info.partner_pay_no
     *
     * @mbggenerated
     */
    public void setPartnerPayNo(String partnerPayNo) {
        this.partnerPayNo = partnerPayNo == null ? null : partnerPayNo.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.yjf_pay_no
     *
     * @return the value of clearing_checking_info.yjf_pay_no
     *
     * @mbggenerated
     */
    public String getYjfPayNo() {
        return yjfPayNo;
    }

    /**
     * set the value of the database column clearing_checking_info.yjf_pay_no
     *
     * @param yjfPayNo the value for clearing_checking_info.yjf_pay_no
     *
     * @mbggenerated
     */
    public void setYjfPayNo(String yjfPayNo) {
        this.yjfPayNo = yjfPayNo == null ? null : yjfPayNo.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.ipaynow_pay_no
     *
     * @return the value of clearing_checking_info.ipaynow_pay_no
     *
     * @mbggenerated
     */
    public String getIpaynowPayNo() {
        return ipaynowPayNo;
    }

    /**
     * set the value of the database column clearing_checking_info.ipaynow_pay_no
     *
     * @param ipaynowPayNo the value for clearing_checking_info.ipaynow_pay_no
     *
     * @mbggenerated
     */
    public void setIpaynowPayNo(String ipaynowPayNo) {
        this.ipaynowPayNo = ipaynowPayNo == null ? null : ipaynowPayNo.trim();
    }

    /**
     * return the value of the database column clearing_checking_info.gmt_create
     *
     * @return the value of clearing_checking_info.gmt_create
     *
     * @mbggenerated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * set the value of the database column clearing_checking_info.gmt_create
     *
     * @param gmtCreate the value for clearing_checking_info.gmt_create
     *
     * @mbggenerated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * return the value of the database column clearing_checking_info.gmt_modified
     *
     * @return the value of clearing_checking_info.gmt_modified
     *
     * @mbggenerated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * set the value of the database column clearing_checking_info.gmt_modified
     *
     * @param gmtModified the value for clearing_checking_info.gmt_modified
     *
     * @mbggenerated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", outOrderNo=").append(outOrderNo);
        sb.append(", systemNo=").append(systemNo);
        sb.append(", unionTradeTime=").append(unionTradeTime);
        sb.append(", partnerTradeTime=").append(partnerTradeTime);
        sb.append(", unionPartnerId=").append(unionPartnerId);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", partnerName=").append(partnerName);
        sb.append(", payFlag=").append(payFlag);
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", channelNo=").append(channelNo);
        sb.append(", channelFee=").append(channelFee);
        sb.append(", checkingStatus=").append(checkingStatus);
        sb.append(", checkingTime=").append(checkingTime);
        sb.append(", partnerAmount=").append(partnerAmount);
        sb.append(", oldOrderNo=").append(oldOrderNo);
        sb.append(", orderInfo=").append(orderInfo);
        sb.append(", tradeDate=").append(tradeDate);
        sb.append(", innerBizNo=").append(innerBizNo);
        sb.append(", uniqueChecking=").append(uniqueChecking);
        sb.append(", sendData=").append(sendData);
        sb.append(", partnerPayNo=").append(partnerPayNo);
        sb.append(", yjfPayNo=").append(yjfPayNo);
        sb.append(", ipaynowPayNo=").append(ipaynowPayNo);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table clearing_checking_info
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
        ClearingCheckingInfoDO other = (ClearingCheckingInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOutOrderNo() == null ? other.getOutOrderNo() == null : this.getOutOrderNo().equals(other.getOutOrderNo()))
            && (this.getSystemNo() == null ? other.getSystemNo() == null : this.getSystemNo().equals(other.getSystemNo()))
            && (this.getUnionTradeTime() == null ? other.getUnionTradeTime() == null : this.getUnionTradeTime().equals(other.getUnionTradeTime()))
            && (this.getPartnerTradeTime() == null ? other.getPartnerTradeTime() == null : this.getPartnerTradeTime().equals(other.getPartnerTradeTime()))
            && (this.getUnionPartnerId() == null ? other.getUnionPartnerId() == null : this.getUnionPartnerId().equals(other.getUnionPartnerId()))
            && (this.getPartnerId() == null ? other.getPartnerId() == null : this.getPartnerId().equals(other.getPartnerId()))
            && (this.getPartnerName() == null ? other.getPartnerName() == null : this.getPartnerName().equals(other.getPartnerName()))
            && (this.getPayFlag() == null ? other.getPayFlag() == null : this.getPayFlag().equals(other.getPayFlag()))
            && (this.getTradeAmount() == null ? other.getTradeAmount() == null : this.getTradeAmount().equals(other.getTradeAmount()))
            && (this.getChannelNo() == null ? other.getChannelNo() == null : this.getChannelNo().equals(other.getChannelNo()))
            && (this.getChannelFee() == null ? other.getChannelFee() == null : this.getChannelFee().equals(other.getChannelFee()))
            && (this.getCheckingStatus() == null ? other.getCheckingStatus() == null : this.getCheckingStatus().equals(other.getCheckingStatus()))
            && (this.getCheckingTime() == null ? other.getCheckingTime() == null : this.getCheckingTime().equals(other.getCheckingTime()))
            && (this.getPartnerAmount() == null ? other.getPartnerAmount() == null : this.getPartnerAmount().equals(other.getPartnerAmount()))
            && (this.getOldOrderNo() == null ? other.getOldOrderNo() == null : this.getOldOrderNo().equals(other.getOldOrderNo()))
            && (this.getOrderInfo() == null ? other.getOrderInfo() == null : this.getOrderInfo().equals(other.getOrderInfo()))
            && (this.getTradeDate() == null ? other.getTradeDate() == null : this.getTradeDate().equals(other.getTradeDate()))
            && (this.getInnerBizNo() == null ? other.getInnerBizNo() == null : this.getInnerBizNo().equals(other.getInnerBizNo()))
            && (this.getUniqueChecking() == null ? other.getUniqueChecking() == null : this.getUniqueChecking().equals(other.getUniqueChecking()))
            && (this.getSendData() == null ? other.getSendData() == null : this.getSendData().equals(other.getSendData()))
            && (this.getPartnerPayNo() == null ? other.getPartnerPayNo() == null : this.getPartnerPayNo().equals(other.getPartnerPayNo()))
            && (this.getYjfPayNo() == null ? other.getYjfPayNo() == null : this.getYjfPayNo().equals(other.getYjfPayNo()))
            && (this.getIpaynowPayNo() == null ? other.getIpaynowPayNo() == null : this.getIpaynowPayNo().equals(other.getIpaynowPayNo()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOutOrderNo() == null) ? 0 : getOutOrderNo().hashCode());
        result = prime * result + ((getSystemNo() == null) ? 0 : getSystemNo().hashCode());
        result = prime * result + ((getUnionTradeTime() == null) ? 0 : getUnionTradeTime().hashCode());
        result = prime * result + ((getPartnerTradeTime() == null) ? 0 : getPartnerTradeTime().hashCode());
        result = prime * result + ((getUnionPartnerId() == null) ? 0 : getUnionPartnerId().hashCode());
        result = prime * result + ((getPartnerId() == null) ? 0 : getPartnerId().hashCode());
        result = prime * result + ((getPartnerName() == null) ? 0 : getPartnerName().hashCode());
        result = prime * result + ((getPayFlag() == null) ? 0 : getPayFlag().hashCode());
        result = prime * result + ((getTradeAmount() == null) ? 0 : getTradeAmount().hashCode());
        result = prime * result + ((getChannelNo() == null) ? 0 : getChannelNo().hashCode());
        result = prime * result + ((getChannelFee() == null) ? 0 : getChannelFee().hashCode());
        result = prime * result + ((getCheckingStatus() == null) ? 0 : getCheckingStatus().hashCode());
        result = prime * result + ((getCheckingTime() == null) ? 0 : getCheckingTime().hashCode());
        result = prime * result + ((getPartnerAmount() == null) ? 0 : getPartnerAmount().hashCode());
        result = prime * result + ((getOldOrderNo() == null) ? 0 : getOldOrderNo().hashCode());
        result = prime * result + ((getOrderInfo() == null) ? 0 : getOrderInfo().hashCode());
        result = prime * result + ((getTradeDate() == null) ? 0 : getTradeDate().hashCode());
        result = prime * result + ((getInnerBizNo() == null) ? 0 : getInnerBizNo().hashCode());
        result = prime * result + ((getUniqueChecking() == null) ? 0 : getUniqueChecking().hashCode());
        result = prime * result + ((getSendData() == null) ? 0 : getSendData().hashCode());
        result = prime * result + ((getPartnerPayNo() == null) ? 0 : getPartnerPayNo().hashCode());
        result = prime * result + ((getYjfPayNo() == null) ? 0 : getYjfPayNo().hashCode());
        result = prime * result + ((getIpaynowPayNo() == null) ? 0 : getIpaynowPayNo().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}