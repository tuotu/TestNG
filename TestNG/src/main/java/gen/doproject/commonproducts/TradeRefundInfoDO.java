/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradeRefundInfoDO.java
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

public class TradeRefundInfoDO implements Serializable {
    /**
     * corresponds to the database column trade_refund_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column trade_refund_info.refund_biz_no
     *
     * @mbggenerated
     */
    private String refundBizNo;

    /**
     * corresponds to the database column trade_refund_info.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column trade_refund_info.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column trade_refund_info.partner_id
     *
     * @mbggenerated
     */
    private String partnerId;

    /**
     * corresponds to the database column trade_refund_info.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column trade_refund_info.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column trade_refund_info.refund_amount
     *
     * @mbggenerated
     */
    private Money refundAmount;

    /**
     * corresponds to the database column trade_refund_info.buyer_user_id
     *
     * @mbggenerated
     */
    private String buyerUserId;

    /**
     * corresponds to the database column trade_refund_info.out_buyer_user_id
     *
     * @mbggenerated
     */
    private String outBuyerUserId;

    /**
     * corresponds to the database column trade_refund_info.seller_user_id
     *
     * @mbggenerated
     */
    private String sellerUserId;

    /**
     * corresponds to the database column trade_refund_info.payer_user_id
     *
     * @mbggenerated
     */
    private String payerUserId;

    /**
     * corresponds to the database column trade_refund_info.user_end_ip
     *
     * @mbggenerated
     */
    private String userEndIp;

    /**
     * corresponds to the database column trade_refund_info.mac_address
     *
     * @mbggenerated
     */
    private String macAddress;

    /**
     * corresponds to the database column trade_refund_info.user_terminal_type
     *
     * @mbggenerated
     */
    private String userTerminalType;

    /**
     * corresponds to the database column trade_refund_info.refund_status
     *
     * @mbggenerated
     */
    private String refundStatus;

    /**
     * corresponds to the database column trade_refund_info.refund_mode
     *
     * @mbggenerated
     */
    private String refundMode;

    /**
     * corresponds to the database column trade_refund_info.data_index
     *
     * @mbggenerated
     */
    private String dataIndex;

    /**
     * corresponds to the database column trade_refund_info.remittance_no
     *
     * @mbggenerated
     */
    private String remittanceNo;

    /**
     * corresponds to the database column trade_refund_info.offline_withdraw_no
     *
     * @mbggenerated
     */
    private String offlineWithdrawNo;

    /**
     * corresponds to the database column trade_refund_info.refund_reason
     *
     * @mbggenerated
     */
    private String refundReason;

    /**
     * corresponds to the database column trade_refund_info.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column trade_refund_info.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column trade_refund_info.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column trade_refund_info.contain_refund_share
     *
     * @mbggenerated
     */
    private String containRefundShare;

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column trade_refund_info.id
     *
     * @return the value of trade_refund_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column trade_refund_info.id
     *
     * @param id the value for trade_refund_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column trade_refund_info.refund_biz_no
     *
     * @return the value of trade_refund_info.refund_biz_no
     *
     * @mbggenerated
     */
    public String getRefundBizNo() {
        return refundBizNo;
    }

    /**
     * set the value of the database column trade_refund_info.refund_biz_no
     *
     * @param refundBizNo the value for trade_refund_info.refund_biz_no
     *
     * @mbggenerated
     */
    public void setRefundBizNo(String refundBizNo) {
        this.refundBizNo = refundBizNo == null ? null : refundBizNo.trim();
    }

    /**
     * return the value of the database column trade_refund_info.inlet
     *
     * @return the value of trade_refund_info.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column trade_refund_info.inlet
     *
     * @param inlet the value for trade_refund_info.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column trade_refund_info.gid
     *
     * @return the value of trade_refund_info.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column trade_refund_info.gid
     *
     * @param gid the value for trade_refund_info.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column trade_refund_info.partner_id
     *
     * @return the value of trade_refund_info.partner_id
     *
     * @mbggenerated
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * set the value of the database column trade_refund_info.partner_id
     *
     * @param partnerId the value for trade_refund_info.partner_id
     *
     * @mbggenerated
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    /**
     * return the value of the database column trade_refund_info.merch_order_no
     *
     * @return the value of trade_refund_info.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column trade_refund_info.merch_order_no
     *
     * @param merchOrderNo the value for trade_refund_info.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column trade_refund_info.biz_no
     *
     * @return the value of trade_refund_info.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column trade_refund_info.biz_no
     *
     * @param bizNo the value for trade_refund_info.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column trade_refund_info.refund_amount
     *
     * @return the value of trade_refund_info.refund_amount
     *
     * @mbggenerated
     */
    public Money getRefundAmount() {
        return refundAmount;
    }

    /**
     * set the value of the database column trade_refund_info.refund_amount
     *
     * @param refundAmount the value for trade_refund_info.refund_amount
     *
     * @mbggenerated
     */
    public void setRefundAmount(Money refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * return the value of the database column trade_refund_info.buyer_user_id
     *
     * @return the value of trade_refund_info.buyer_user_id
     *
     * @mbggenerated
     */
    public String getBuyerUserId() {
        return buyerUserId;
    }

    /**
     * set the value of the database column trade_refund_info.buyer_user_id
     *
     * @param buyerUserId the value for trade_refund_info.buyer_user_id
     *
     * @mbggenerated
     */
    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId == null ? null : buyerUserId.trim();
    }

    /**
     * return the value of the database column trade_refund_info.out_buyer_user_id
     *
     * @return the value of trade_refund_info.out_buyer_user_id
     *
     * @mbggenerated
     */
    public String getOutBuyerUserId() {
        return outBuyerUserId;
    }

    /**
     * set the value of the database column trade_refund_info.out_buyer_user_id
     *
     * @param outBuyerUserId the value for trade_refund_info.out_buyer_user_id
     *
     * @mbggenerated
     */
    public void setOutBuyerUserId(String outBuyerUserId) {
        this.outBuyerUserId = outBuyerUserId == null ? null : outBuyerUserId.trim();
    }

    /**
     * return the value of the database column trade_refund_info.seller_user_id
     *
     * @return the value of trade_refund_info.seller_user_id
     *
     * @mbggenerated
     */
    public String getSellerUserId() {
        return sellerUserId;
    }

    /**
     * set the value of the database column trade_refund_info.seller_user_id
     *
     * @param sellerUserId the value for trade_refund_info.seller_user_id
     *
     * @mbggenerated
     */
    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId == null ? null : sellerUserId.trim();
    }

    /**
     * return the value of the database column trade_refund_info.payer_user_id
     *
     * @return the value of trade_refund_info.payer_user_id
     *
     * @mbggenerated
     */
    public String getPayerUserId() {
        return payerUserId;
    }

    /**
     * set the value of the database column trade_refund_info.payer_user_id
     *
     * @param payerUserId the value for trade_refund_info.payer_user_id
     *
     * @mbggenerated
     */
    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId == null ? null : payerUserId.trim();
    }

    /**
     * return the value of the database column trade_refund_info.user_end_ip
     *
     * @return the value of trade_refund_info.user_end_ip
     *
     * @mbggenerated
     */
    public String getUserEndIp() {
        return userEndIp;
    }

    /**
     * set the value of the database column trade_refund_info.user_end_ip
     *
     * @param userEndIp the value for trade_refund_info.user_end_ip
     *
     * @mbggenerated
     */
    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp == null ? null : userEndIp.trim();
    }

    /**
     * return the value of the database column trade_refund_info.mac_address
     *
     * @return the value of trade_refund_info.mac_address
     *
     * @mbggenerated
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * set the value of the database column trade_refund_info.mac_address
     *
     * @param macAddress the value for trade_refund_info.mac_address
     *
     * @mbggenerated
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    /**
     * return the value of the database column trade_refund_info.user_terminal_type
     *
     * @return the value of trade_refund_info.user_terminal_type
     *
     * @mbggenerated
     */
    public String getUserTerminalType() {
        return userTerminalType;
    }

    /**
     * set the value of the database column trade_refund_info.user_terminal_type
     *
     * @param userTerminalType the value for trade_refund_info.user_terminal_type
     *
     * @mbggenerated
     */
    public void setUserTerminalType(String userTerminalType) {
        this.userTerminalType = userTerminalType == null ? null : userTerminalType.trim();
    }

    /**
     * return the value of the database column trade_refund_info.refund_status
     *
     * @return the value of trade_refund_info.refund_status
     *
     * @mbggenerated
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * set the value of the database column trade_refund_info.refund_status
     *
     * @param refundStatus the value for trade_refund_info.refund_status
     *
     * @mbggenerated
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    /**
     * return the value of the database column trade_refund_info.refund_mode
     *
     * @return the value of trade_refund_info.refund_mode
     *
     * @mbggenerated
     */
    public String getRefundMode() {
        return refundMode;
    }

    /**
     * set the value of the database column trade_refund_info.refund_mode
     *
     * @param refundMode the value for trade_refund_info.refund_mode
     *
     * @mbggenerated
     */
    public void setRefundMode(String refundMode) {
        this.refundMode = refundMode == null ? null : refundMode.trim();
    }

    /**
     * return the value of the database column trade_refund_info.data_index
     *
     * @return the value of trade_refund_info.data_index
     *
     * @mbggenerated
     */
    public String getDataIndex() {
        return dataIndex;
    }

    /**
     * set the value of the database column trade_refund_info.data_index
     *
     * @param dataIndex the value for trade_refund_info.data_index
     *
     * @mbggenerated
     */
    public void setDataIndex(String dataIndex) {
        this.dataIndex = dataIndex == null ? null : dataIndex.trim();
    }

    /**
     * return the value of the database column trade_refund_info.remittance_no
     *
     * @return the value of trade_refund_info.remittance_no
     *
     * @mbggenerated
     */
    public String getRemittanceNo() {
        return remittanceNo;
    }

    /**
     * set the value of the database column trade_refund_info.remittance_no
     *
     * @param remittanceNo the value for trade_refund_info.remittance_no
     *
     * @mbggenerated
     */
    public void setRemittanceNo(String remittanceNo) {
        this.remittanceNo = remittanceNo == null ? null : remittanceNo.trim();
    }

    /**
     * return the value of the database column trade_refund_info.offline_withdraw_no
     *
     * @return the value of trade_refund_info.offline_withdraw_no
     *
     * @mbggenerated
     */
    public String getOfflineWithdrawNo() {
        return offlineWithdrawNo;
    }

    /**
     * set the value of the database column trade_refund_info.offline_withdraw_no
     *
     * @param offlineWithdrawNo the value for trade_refund_info.offline_withdraw_no
     *
     * @mbggenerated
     */
    public void setOfflineWithdrawNo(String offlineWithdrawNo) {
        this.offlineWithdrawNo = offlineWithdrawNo == null ? null : offlineWithdrawNo.trim();
    }

    /**
     * return the value of the database column trade_refund_info.refund_reason
     *
     * @return the value of trade_refund_info.refund_reason
     *
     * @mbggenerated
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * set the value of the database column trade_refund_info.refund_reason
     *
     * @param refundReason the value for trade_refund_info.refund_reason
     *
     * @mbggenerated
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    /**
     * return the value of the database column trade_refund_info.memo
     *
     * @return the value of trade_refund_info.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column trade_refund_info.memo
     *
     * @param memo the value for trade_refund_info.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column trade_refund_info.raw_add_time
     *
     * @return the value of trade_refund_info.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column trade_refund_info.raw_add_time
     *
     * @param rawAddTime the value for trade_refund_info.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column trade_refund_info.raw_update_time
     *
     * @return the value of trade_refund_info.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column trade_refund_info.raw_update_time
     *
     * @param rawUpdateTime the value for trade_refund_info.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column trade_refund_info.contain_refund_share
     *
     * @return the value of trade_refund_info.contain_refund_share
     *
     * @mbggenerated
     */
    public String getContainRefundShare() {
        return containRefundShare;
    }

    /**
     * set the value of the database column trade_refund_info.contain_refund_share
     *
     * @param containRefundShare the value for trade_refund_info.contain_refund_share
     *
     * @mbggenerated
     */
    public void setContainRefundShare(String containRefundShare) {
        this.containRefundShare = containRefundShare == null ? null : containRefundShare.trim();
    }

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", refundBizNo=").append(refundBizNo);
        sb.append(", inlet=").append(inlet);
        sb.append(", gid=").append(gid);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", merchOrderNo=").append(merchOrderNo);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", buyerUserId=").append(buyerUserId);
        sb.append(", outBuyerUserId=").append(outBuyerUserId);
        sb.append(", sellerUserId=").append(sellerUserId);
        sb.append(", payerUserId=").append(payerUserId);
        sb.append(", userEndIp=").append(userEndIp);
        sb.append(", macAddress=").append(macAddress);
        sb.append(", userTerminalType=").append(userTerminalType);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", refundMode=").append(refundMode);
        sb.append(", dataIndex=").append(dataIndex);
        sb.append(", remittanceNo=").append(remittanceNo);
        sb.append(", offlineWithdrawNo=").append(offlineWithdrawNo);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", memo=").append(memo);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", containRefundShare=").append(containRefundShare);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table trade_refund_info
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
        TradeRefundInfoDO other = (TradeRefundInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRefundBizNo() == null ? other.getRefundBizNo() == null : this.getRefundBizNo().equals(other.getRefundBizNo()))
            && (this.getInlet() == null ? other.getInlet() == null : this.getInlet().equals(other.getInlet()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getPartnerId() == null ? other.getPartnerId() == null : this.getPartnerId().equals(other.getPartnerId()))
            && (this.getMerchOrderNo() == null ? other.getMerchOrderNo() == null : this.getMerchOrderNo().equals(other.getMerchOrderNo()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getRefundAmount() == null ? other.getRefundAmount() == null : this.getRefundAmount().equals(other.getRefundAmount()))
            && (this.getBuyerUserId() == null ? other.getBuyerUserId() == null : this.getBuyerUserId().equals(other.getBuyerUserId()))
            && (this.getOutBuyerUserId() == null ? other.getOutBuyerUserId() == null : this.getOutBuyerUserId().equals(other.getOutBuyerUserId()))
            && (this.getSellerUserId() == null ? other.getSellerUserId() == null : this.getSellerUserId().equals(other.getSellerUserId()))
            && (this.getPayerUserId() == null ? other.getPayerUserId() == null : this.getPayerUserId().equals(other.getPayerUserId()))
            && (this.getUserEndIp() == null ? other.getUserEndIp() == null : this.getUserEndIp().equals(other.getUserEndIp()))
            && (this.getMacAddress() == null ? other.getMacAddress() == null : this.getMacAddress().equals(other.getMacAddress()))
            && (this.getUserTerminalType() == null ? other.getUserTerminalType() == null : this.getUserTerminalType().equals(other.getUserTerminalType()))
            && (this.getRefundStatus() == null ? other.getRefundStatus() == null : this.getRefundStatus().equals(other.getRefundStatus()))
            && (this.getRefundMode() == null ? other.getRefundMode() == null : this.getRefundMode().equals(other.getRefundMode()))
            && (this.getDataIndex() == null ? other.getDataIndex() == null : this.getDataIndex().equals(other.getDataIndex()))
            && (this.getRemittanceNo() == null ? other.getRemittanceNo() == null : this.getRemittanceNo().equals(other.getRemittanceNo()))
            && (this.getOfflineWithdrawNo() == null ? other.getOfflineWithdrawNo() == null : this.getOfflineWithdrawNo().equals(other.getOfflineWithdrawNo()))
            && (this.getRefundReason() == null ? other.getRefundReason() == null : this.getRefundReason().equals(other.getRefundReason()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getContainRefundShare() == null ? other.getContainRefundShare() == null : this.getContainRefundShare().equals(other.getContainRefundShare()));
    }

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRefundBizNo() == null) ? 0 : getRefundBizNo().hashCode());
        result = prime * result + ((getInlet() == null) ? 0 : getInlet().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getPartnerId() == null) ? 0 : getPartnerId().hashCode());
        result = prime * result + ((getMerchOrderNo() == null) ? 0 : getMerchOrderNo().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getRefundAmount() == null) ? 0 : getRefundAmount().hashCode());
        result = prime * result + ((getBuyerUserId() == null) ? 0 : getBuyerUserId().hashCode());
        result = prime * result + ((getOutBuyerUserId() == null) ? 0 : getOutBuyerUserId().hashCode());
        result = prime * result + ((getSellerUserId() == null) ? 0 : getSellerUserId().hashCode());
        result = prime * result + ((getPayerUserId() == null) ? 0 : getPayerUserId().hashCode());
        result = prime * result + ((getUserEndIp() == null) ? 0 : getUserEndIp().hashCode());
        result = prime * result + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        result = prime * result + ((getUserTerminalType() == null) ? 0 : getUserTerminalType().hashCode());
        result = prime * result + ((getRefundStatus() == null) ? 0 : getRefundStatus().hashCode());
        result = prime * result + ((getRefundMode() == null) ? 0 : getRefundMode().hashCode());
        result = prime * result + ((getDataIndex() == null) ? 0 : getDataIndex().hashCode());
        result = prime * result + ((getRemittanceNo() == null) ? 0 : getRemittanceNo().hashCode());
        result = prime * result + ((getOfflineWithdrawNo() == null) ? 0 : getOfflineWithdrawNo().hashCode());
        result = prime * result + ((getRefundReason() == null) ? 0 : getRefundReason().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getContainRefundShare() == null) ? 0 : getContainRefundShare().hashCode());
        return result;
    }
}