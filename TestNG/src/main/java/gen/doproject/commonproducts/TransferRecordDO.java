/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferRecordDO.java
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

public class TransferRecordDO implements Serializable {
    /**
     * corresponds to the database column transfer_record.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column transfer_record.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column transfer_record.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column transfer_record.charge_code
     *
     * @mbggenerated
     */
    private String chargeCode;

    /**
     * corresponds to the database column transfer_record.dubbo_group
     *
     * @mbggenerated
     */
    private String dubboGroup;

    /**
     * corresponds to the database column transfer_record.dubbo_version
     *
     * @mbggenerated
     */
    private String dubboVersion;

    /**
     * corresponds to the database column transfer_record.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column transfer_record.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column transfer_record.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column transfer_record.merchant_id
     *
     * @mbggenerated
     */
    private String merchantId;

    /**
     * corresponds to the database column transfer_record.merchant_order_biz_no
     *
     * @mbggenerated
     */
    private String merchantOrderBizNo;

    /**
     * corresponds to the database column transfer_record.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column transfer_record.order_no
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * corresponds to the database column transfer_record.payee_id
     *
     * @mbggenerated
     */
    private String payeeId;

    /**
     * corresponds to the database column transfer_record.payer_id
     *
     * @mbggenerated
     */
    private String payerId;

    /**
     * corresponds to the database column transfer_record.system_id
     *
     * @mbggenerated
     */
    private String systemId;

    /**
     * corresponds to the database column transfer_record.trade_amount
     *
     * @mbggenerated
     */
    private Money tradeAmount;

    /**
     * corresponds to the database column transfer_record.trade_memo
     *
     * @mbggenerated
     */
    private String tradeMemo;

    /**
     * corresponds to the database column transfer_record.trade_name
     *
     * @mbggenerated
     */
    private String tradeName;

    /**
     * corresponds to the database column transfer_record.trade_no
     *
     * @mbggenerated
     */
    private String tradeNo;

    /**
     * corresponds to the database column transfer_record.transfer_result
     *
     * @mbggenerated
     */
    private String transferResult;

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column transfer_record.id
     *
     * @return the value of transfer_record.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column transfer_record.id
     *
     * @param id the value for transfer_record.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column transfer_record.raw_add_time
     *
     * @return the value of transfer_record.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column transfer_record.raw_add_time
     *
     * @param rawAddTime the value for transfer_record.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column transfer_record.raw_update_time
     *
     * @return the value of transfer_record.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column transfer_record.raw_update_time
     *
     * @param rawUpdateTime the value for transfer_record.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column transfer_record.charge_code
     *
     * @return the value of transfer_record.charge_code
     *
     * @mbggenerated
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * set the value of the database column transfer_record.charge_code
     *
     * @param chargeCode the value for transfer_record.charge_code
     *
     * @mbggenerated
     */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode == null ? null : chargeCode.trim();
    }

    /**
     * return the value of the database column transfer_record.dubbo_group
     *
     * @return the value of transfer_record.dubbo_group
     *
     * @mbggenerated
     */
    public String getDubboGroup() {
        return dubboGroup;
    }

    /**
     * set the value of the database column transfer_record.dubbo_group
     *
     * @param dubboGroup the value for transfer_record.dubbo_group
     *
     * @mbggenerated
     */
    public void setDubboGroup(String dubboGroup) {
        this.dubboGroup = dubboGroup == null ? null : dubboGroup.trim();
    }

    /**
     * return the value of the database column transfer_record.dubbo_version
     *
     * @return the value of transfer_record.dubbo_version
     *
     * @mbggenerated
     */
    public String getDubboVersion() {
        return dubboVersion;
    }

    /**
     * set the value of the database column transfer_record.dubbo_version
     *
     * @param dubboVersion the value for transfer_record.dubbo_version
     *
     * @mbggenerated
     */
    public void setDubboVersion(String dubboVersion) {
        this.dubboVersion = dubboVersion == null ? null : dubboVersion.trim();
    }

    /**
     * return the value of the database column transfer_record.gid
     *
     * @return the value of transfer_record.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column transfer_record.gid
     *
     * @param gid the value for transfer_record.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column transfer_record.merchant_acc_no
     *
     * @return the value of transfer_record.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column transfer_record.merchant_acc_no
     *
     * @param merchantAccNo the value for transfer_record.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column transfer_record.merchant_card_no
     *
     * @return the value of transfer_record.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column transfer_record.merchant_card_no
     *
     * @param merchantCardNo the value for transfer_record.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column transfer_record.merchant_id
     *
     * @return the value of transfer_record.merchant_id
     *
     * @mbggenerated
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * set the value of the database column transfer_record.merchant_id
     *
     * @param merchantId the value for transfer_record.merchant_id
     *
     * @mbggenerated
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * return the value of the database column transfer_record.merchant_order_biz_no
     *
     * @return the value of transfer_record.merchant_order_biz_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderBizNo() {
        return merchantOrderBizNo;
    }

    /**
     * set the value of the database column transfer_record.merchant_order_biz_no
     *
     * @param merchantOrderBizNo the value for transfer_record.merchant_order_biz_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderBizNo(String merchantOrderBizNo) {
        this.merchantOrderBizNo = merchantOrderBizNo == null ? null : merchantOrderBizNo.trim();
    }

    /**
     * return the value of the database column transfer_record.merchant_user_id
     *
     * @return the value of transfer_record.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column transfer_record.merchant_user_id
     *
     * @param merchantUserId the value for transfer_record.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column transfer_record.order_no
     *
     * @return the value of transfer_record.order_no
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * set the value of the database column transfer_record.order_no
     *
     * @param orderNo the value for transfer_record.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * return the value of the database column transfer_record.payee_id
     *
     * @return the value of transfer_record.payee_id
     *
     * @mbggenerated
     */
    public String getPayeeId() {
        return payeeId;
    }

    /**
     * set the value of the database column transfer_record.payee_id
     *
     * @param payeeId the value for transfer_record.payee_id
     *
     * @mbggenerated
     */
    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId == null ? null : payeeId.trim();
    }

    /**
     * return the value of the database column transfer_record.payer_id
     *
     * @return the value of transfer_record.payer_id
     *
     * @mbggenerated
     */
    public String getPayerId() {
        return payerId;
    }

    /**
     * set the value of the database column transfer_record.payer_id
     *
     * @param payerId the value for transfer_record.payer_id
     *
     * @mbggenerated
     */
    public void setPayerId(String payerId) {
        this.payerId = payerId == null ? null : payerId.trim();
    }

    /**
     * return the value of the database column transfer_record.system_id
     *
     * @return the value of transfer_record.system_id
     *
     * @mbggenerated
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * set the value of the database column transfer_record.system_id
     *
     * @param systemId the value for transfer_record.system_id
     *
     * @mbggenerated
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }

    /**
     * return the value of the database column transfer_record.trade_amount
     *
     * @return the value of transfer_record.trade_amount
     *
     * @mbggenerated
     */
    public Money getTradeAmount() {
        return tradeAmount;
    }

    /**
     * set the value of the database column transfer_record.trade_amount
     *
     * @param tradeAmount the value for transfer_record.trade_amount
     *
     * @mbggenerated
     */
    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * return the value of the database column transfer_record.trade_memo
     *
     * @return the value of transfer_record.trade_memo
     *
     * @mbggenerated
     */
    public String getTradeMemo() {
        return tradeMemo;
    }

    /**
     * set the value of the database column transfer_record.trade_memo
     *
     * @param tradeMemo the value for transfer_record.trade_memo
     *
     * @mbggenerated
     */
    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo == null ? null : tradeMemo.trim();
    }

    /**
     * return the value of the database column transfer_record.trade_name
     *
     * @return the value of transfer_record.trade_name
     *
     * @mbggenerated
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * set the value of the database column transfer_record.trade_name
     *
     * @param tradeName the value for transfer_record.trade_name
     *
     * @mbggenerated
     */
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName == null ? null : tradeName.trim();
    }

    /**
     * return the value of the database column transfer_record.trade_no
     *
     * @return the value of transfer_record.trade_no
     *
     * @mbggenerated
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * set the value of the database column transfer_record.trade_no
     *
     * @param tradeNo the value for transfer_record.trade_no
     *
     * @mbggenerated
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    /**
     * return the value of the database column transfer_record.transfer_result
     *
     * @return the value of transfer_record.transfer_result
     *
     * @mbggenerated
     */
    public String getTransferResult() {
        return transferResult;
    }

    /**
     * set the value of the database column transfer_record.transfer_result
     *
     * @param transferResult the value for transfer_record.transfer_result
     *
     * @mbggenerated
     */
    public void setTransferResult(String transferResult) {
        this.transferResult = transferResult == null ? null : transferResult.trim();
    }

    /**
     * corresponds to the database table transfer_record
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
        sb.append(", chargeCode=").append(chargeCode);
        sb.append(", dubboGroup=").append(dubboGroup);
        sb.append(", dubboVersion=").append(dubboVersion);
        sb.append(", gid=").append(gid);
        sb.append(", merchantAccNo=").append(merchantAccNo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", merchantOrderBizNo=").append(merchantOrderBizNo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", payeeId=").append(payeeId);
        sb.append(", payerId=").append(payerId);
        sb.append(", systemId=").append(systemId);
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", tradeMemo=").append(tradeMemo);
        sb.append(", tradeName=").append(tradeName);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", transferResult=").append(transferResult);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table transfer_record
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
        TransferRecordDO other = (TransferRecordDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getChargeCode() == null ? other.getChargeCode() == null : this.getChargeCode().equals(other.getChargeCode()))
            && (this.getDubboGroup() == null ? other.getDubboGroup() == null : this.getDubboGroup().equals(other.getDubboGroup()))
            && (this.getDubboVersion() == null ? other.getDubboVersion() == null : this.getDubboVersion().equals(other.getDubboVersion()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getMerchantAccNo() == null ? other.getMerchantAccNo() == null : this.getMerchantAccNo().equals(other.getMerchantAccNo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getMerchantOrderBizNo() == null ? other.getMerchantOrderBizNo() == null : this.getMerchantOrderBizNo().equals(other.getMerchantOrderBizNo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getPayeeId() == null ? other.getPayeeId() == null : this.getPayeeId().equals(other.getPayeeId()))
            && (this.getPayerId() == null ? other.getPayerId() == null : this.getPayerId().equals(other.getPayerId()))
            && (this.getSystemId() == null ? other.getSystemId() == null : this.getSystemId().equals(other.getSystemId()))
            && (this.getTradeAmount() == null ? other.getTradeAmount() == null : this.getTradeAmount().equals(other.getTradeAmount()))
            && (this.getTradeMemo() == null ? other.getTradeMemo() == null : this.getTradeMemo().equals(other.getTradeMemo()))
            && (this.getTradeName() == null ? other.getTradeName() == null : this.getTradeName().equals(other.getTradeName()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getTransferResult() == null ? other.getTransferResult() == null : this.getTransferResult().equals(other.getTransferResult()));
    }

    /**
     * corresponds to the database table transfer_record
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
        result = prime * result + ((getChargeCode() == null) ? 0 : getChargeCode().hashCode());
        result = prime * result + ((getDubboGroup() == null) ? 0 : getDubboGroup().hashCode());
        result = prime * result + ((getDubboVersion() == null) ? 0 : getDubboVersion().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getMerchantAccNo() == null) ? 0 : getMerchantAccNo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getMerchantOrderBizNo() == null) ? 0 : getMerchantOrderBizNo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getPayeeId() == null) ? 0 : getPayeeId().hashCode());
        result = prime * result + ((getPayerId() == null) ? 0 : getPayerId().hashCode());
        result = prime * result + ((getSystemId() == null) ? 0 : getSystemId().hashCode());
        result = prime * result + ((getTradeAmount() == null) ? 0 : getTradeAmount().hashCode());
        result = prime * result + ((getTradeMemo() == null) ? 0 : getTradeMemo().hashCode());
        result = prime * result + ((getTradeName() == null) ? 0 : getTradeName().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getTransferResult() == null) ? 0 : getTransferResult().hashCode());
        return result;
    }
}