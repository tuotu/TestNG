/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ForeignPayDO.java
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

public class ForeignPayDO implements Serializable {
    /**
     * corresponds to the database column foreign_pay.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column foreign_pay.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column foreign_pay.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column foreign_pay.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column foreign_pay.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column foreign_pay.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column foreign_pay.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column foreign_pay.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column foreign_pay.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column foreign_pay.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column foreign_pay.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column foreign_pay.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column foreign_pay.transfer_no
     *
     * @mbggenerated
     */
    private String transferNo;

    /**
     * corresponds to the database column foreign_pay.transfer_back_no
     *
     * @mbggenerated
     */
    private String transferBackNo;

    /**
     * corresponds to the database column foreign_pay.foreign_pay_no
     *
     * @mbggenerated
     */
    private String foreignPayNo;

    /**
     * corresponds to the database column foreign_pay.charge_no
     *
     * @mbggenerated
     */
    private String chargeNo;

    /**
     * corresponds to the database column foreign_pay.batch_no
     *
     * @mbggenerated
     */
    private String batchNo;

    /**
     * corresponds to the database column foreign_pay.trade_name
     *
     * @mbggenerated
     */
    private String tradeName;

    /**
     * corresponds to the database column foreign_pay.trade_amount
     *
     * @mbggenerated
     */
    private Money tradeAmount;

    /**
     * corresponds to the database column foreign_pay.buyer_fee
     *
     * @mbggenerated
     */
    private Money buyerFee;

    /**
     * corresponds to the database column foreign_pay.partner_fee
     *
     * @mbggenerated
     */
    private Money partnerFee;

    /**
     * corresponds to the database column foreign_pay.currency
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * corresponds to the database column foreign_pay.buyer_user_id
     *
     * @mbggenerated
     */
    private String buyerUserId;

    /**
     * corresponds to the database column foreign_pay.buyer_card_no
     *
     * @mbggenerated
     */
    private String buyerCardNo;

    /**
     * corresponds to the database column foreign_pay.buyer_acc_no
     *
     * @mbggenerated
     */
    private String buyerAccNo;

    /**
     * corresponds to the database column foreign_pay.buyer_real_name
     *
     * @mbggenerated
     */
    private String buyerRealName;

    /**
     * corresponds to the database column foreign_pay.supervision_acc_no
     *
     * @mbggenerated
     */
    private String supervisionAccNo;

    /**
     * corresponds to the database column foreign_pay.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column foreign_pay.bank_account_no
     *
     * @mbggenerated
     */
    private String bankAccountNo;

    /**
     * corresponds to the database column foreign_pay.seller_real_name
     *
     * @mbggenerated
     */
    private String sellerRealName;

    /**
     * corresponds to the database column foreign_pay.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column foreign_pay.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column foreign_pay.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column foreign_pay.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column foreign_pay.iban_no
     *
     * @mbggenerated
     */
    private String ibanNo;

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column foreign_pay.id
     *
     * @return the value of foreign_pay.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column foreign_pay.id
     *
     * @param id the value for foreign_pay.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column foreign_pay.biz_no
     *
     * @return the value of foreign_pay.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column foreign_pay.biz_no
     *
     * @param bizNo the value for foreign_pay.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.product_code
     *
     * @return the value of foreign_pay.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column foreign_pay.product_code
     *
     * @param productCode the value for foreign_pay.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column foreign_pay.gid
     *
     * @return the value of foreign_pay.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column foreign_pay.gid
     *
     * @param gid the value for foreign_pay.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column foreign_pay.merchant_order_no
     *
     * @return the value of foreign_pay.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column foreign_pay.merchant_order_no
     *
     * @param merchantOrderNo the value for foreign_pay.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.merch_order_no
     *
     * @return the value of foreign_pay.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column foreign_pay.merch_order_no
     *
     * @param merchOrderNo the value for foreign_pay.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.merchant_user_id
     *
     * @return the value of foreign_pay.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column foreign_pay.merchant_user_id
     *
     * @param merchantUserId the value for foreign_pay.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column foreign_pay.merchant_card_no
     *
     * @return the value of foreign_pay.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column foreign_pay.merchant_card_no
     *
     * @param merchantCardNo the value for foreign_pay.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.merchant_acc_no
     *
     * @return the value of foreign_pay.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column foreign_pay.merchant_acc_no
     *
     * @param merchantAccNo the value for foreign_pay.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.product_status
     *
     * @return the value of foreign_pay.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column foreign_pay.product_status
     *
     * @param productStatus the value for foreign_pay.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column foreign_pay.inlet
     *
     * @return the value of foreign_pay.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column foreign_pay.inlet
     *
     * @param inlet the value for foreign_pay.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column foreign_pay.memo
     *
     * @return the value of foreign_pay.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column foreign_pay.memo
     *
     * @param memo the value for foreign_pay.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column foreign_pay.transfer_no
     *
     * @return the value of foreign_pay.transfer_no
     *
     * @mbggenerated
     */
    public String getTransferNo() {
        return transferNo;
    }

    /**
     * set the value of the database column foreign_pay.transfer_no
     *
     * @param transferNo the value for foreign_pay.transfer_no
     *
     * @mbggenerated
     */
    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo == null ? null : transferNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.transfer_back_no
     *
     * @return the value of foreign_pay.transfer_back_no
     *
     * @mbggenerated
     */
    public String getTransferBackNo() {
        return transferBackNo;
    }

    /**
     * set the value of the database column foreign_pay.transfer_back_no
     *
     * @param transferBackNo the value for foreign_pay.transfer_back_no
     *
     * @mbggenerated
     */
    public void setTransferBackNo(String transferBackNo) {
        this.transferBackNo = transferBackNo == null ? null : transferBackNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.foreign_pay_no
     *
     * @return the value of foreign_pay.foreign_pay_no
     *
     * @mbggenerated
     */
    public String getForeignPayNo() {
        return foreignPayNo;
    }

    /**
     * set the value of the database column foreign_pay.foreign_pay_no
     *
     * @param foreignPayNo the value for foreign_pay.foreign_pay_no
     *
     * @mbggenerated
     */
    public void setForeignPayNo(String foreignPayNo) {
        this.foreignPayNo = foreignPayNo == null ? null : foreignPayNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.charge_no
     *
     * @return the value of foreign_pay.charge_no
     *
     * @mbggenerated
     */
    public String getChargeNo() {
        return chargeNo;
    }

    /**
     * set the value of the database column foreign_pay.charge_no
     *
     * @param chargeNo the value for foreign_pay.charge_no
     *
     * @mbggenerated
     */
    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo == null ? null : chargeNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.batch_no
     *
     * @return the value of foreign_pay.batch_no
     *
     * @mbggenerated
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * set the value of the database column foreign_pay.batch_no
     *
     * @param batchNo the value for foreign_pay.batch_no
     *
     * @mbggenerated
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.trade_name
     *
     * @return the value of foreign_pay.trade_name
     *
     * @mbggenerated
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * set the value of the database column foreign_pay.trade_name
     *
     * @param tradeName the value for foreign_pay.trade_name
     *
     * @mbggenerated
     */
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName == null ? null : tradeName.trim();
    }

    /**
     * return the value of the database column foreign_pay.trade_amount
     *
     * @return the value of foreign_pay.trade_amount
     *
     * @mbggenerated
     */
    public Money getTradeAmount() {
        return tradeAmount;
    }

    /**
     * set the value of the database column foreign_pay.trade_amount
     *
     * @param tradeAmount the value for foreign_pay.trade_amount
     *
     * @mbggenerated
     */
    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * return the value of the database column foreign_pay.buyer_fee
     *
     * @return the value of foreign_pay.buyer_fee
     *
     * @mbggenerated
     */
    public Money getBuyerFee() {
        return buyerFee;
    }

    /**
     * set the value of the database column foreign_pay.buyer_fee
     *
     * @param buyerFee the value for foreign_pay.buyer_fee
     *
     * @mbggenerated
     */
    public void setBuyerFee(Money buyerFee) {
        this.buyerFee = buyerFee;
    }

    /**
     * return the value of the database column foreign_pay.partner_fee
     *
     * @return the value of foreign_pay.partner_fee
     *
     * @mbggenerated
     */
    public Money getPartnerFee() {
        return partnerFee;
    }

    /**
     * set the value of the database column foreign_pay.partner_fee
     *
     * @param partnerFee the value for foreign_pay.partner_fee
     *
     * @mbggenerated
     */
    public void setPartnerFee(Money partnerFee) {
        this.partnerFee = partnerFee;
    }

    /**
     * return the value of the database column foreign_pay.currency
     *
     * @return the value of foreign_pay.currency
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * set the value of the database column foreign_pay.currency
     *
     * @param currency the value for foreign_pay.currency
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * return the value of the database column foreign_pay.buyer_user_id
     *
     * @return the value of foreign_pay.buyer_user_id
     *
     * @mbggenerated
     */
    public String getBuyerUserId() {
        return buyerUserId;
    }

    /**
     * set the value of the database column foreign_pay.buyer_user_id
     *
     * @param buyerUserId the value for foreign_pay.buyer_user_id
     *
     * @mbggenerated
     */
    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId == null ? null : buyerUserId.trim();
    }

    /**
     * return the value of the database column foreign_pay.buyer_card_no
     *
     * @return the value of foreign_pay.buyer_card_no
     *
     * @mbggenerated
     */
    public String getBuyerCardNo() {
        return buyerCardNo;
    }

    /**
     * set the value of the database column foreign_pay.buyer_card_no
     *
     * @param buyerCardNo the value for foreign_pay.buyer_card_no
     *
     * @mbggenerated
     */
    public void setBuyerCardNo(String buyerCardNo) {
        this.buyerCardNo = buyerCardNo == null ? null : buyerCardNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.buyer_acc_no
     *
     * @return the value of foreign_pay.buyer_acc_no
     *
     * @mbggenerated
     */
    public String getBuyerAccNo() {
        return buyerAccNo;
    }

    /**
     * set the value of the database column foreign_pay.buyer_acc_no
     *
     * @param buyerAccNo the value for foreign_pay.buyer_acc_no
     *
     * @mbggenerated
     */
    public void setBuyerAccNo(String buyerAccNo) {
        this.buyerAccNo = buyerAccNo == null ? null : buyerAccNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.buyer_real_name
     *
     * @return the value of foreign_pay.buyer_real_name
     *
     * @mbggenerated
     */
    public String getBuyerRealName() {
        return buyerRealName;
    }

    /**
     * set the value of the database column foreign_pay.buyer_real_name
     *
     * @param buyerRealName the value for foreign_pay.buyer_real_name
     *
     * @mbggenerated
     */
    public void setBuyerRealName(String buyerRealName) {
        this.buyerRealName = buyerRealName == null ? null : buyerRealName.trim();
    }

    /**
     * return the value of the database column foreign_pay.supervision_acc_no
     *
     * @return the value of foreign_pay.supervision_acc_no
     *
     * @mbggenerated
     */
    public String getSupervisionAccNo() {
        return supervisionAccNo;
    }

    /**
     * set the value of the database column foreign_pay.supervision_acc_no
     *
     * @param supervisionAccNo the value for foreign_pay.supervision_acc_no
     *
     * @mbggenerated
     */
    public void setSupervisionAccNo(String supervisionAccNo) {
        this.supervisionAccNo = supervisionAccNo == null ? null : supervisionAccNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.bank_code
     *
     * @return the value of foreign_pay.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column foreign_pay.bank_code
     *
     * @param bankCode the value for foreign_pay.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column foreign_pay.bank_account_no
     *
     * @return the value of foreign_pay.bank_account_no
     *
     * @mbggenerated
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * set the value of the database column foreign_pay.bank_account_no
     *
     * @param bankAccountNo the value for foreign_pay.bank_account_no
     *
     * @mbggenerated
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * return the value of the database column foreign_pay.seller_real_name
     *
     * @return the value of foreign_pay.seller_real_name
     *
     * @mbggenerated
     */
    public String getSellerRealName() {
        return sellerRealName;
    }

    /**
     * set the value of the database column foreign_pay.seller_real_name
     *
     * @param sellerRealName the value for foreign_pay.seller_real_name
     *
     * @mbggenerated
     */
    public void setSellerRealName(String sellerRealName) {
        this.sellerRealName = sellerRealName == null ? null : sellerRealName.trim();
    }

    /**
     * return the value of the database column foreign_pay.fail_reason
     *
     * @return the value of foreign_pay.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column foreign_pay.fail_reason
     *
     * @param failReason the value for foreign_pay.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column foreign_pay.sec_index
     *
     * @return the value of foreign_pay.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column foreign_pay.sec_index
     *
     * @param secIndex the value for foreign_pay.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column foreign_pay.raw_add_time
     *
     * @return the value of foreign_pay.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column foreign_pay.raw_add_time
     *
     * @param rawAddTime the value for foreign_pay.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column foreign_pay.raw_update_time
     *
     * @return the value of foreign_pay.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column foreign_pay.raw_update_time
     *
     * @param rawUpdateTime the value for foreign_pay.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column foreign_pay.iban_no
     *
     * @return the value of foreign_pay.iban_no
     *
     * @mbggenerated
     */
    public String getIbanNo() {
        return ibanNo;
    }

    /**
     * set the value of the database column foreign_pay.iban_no
     *
     * @param ibanNo the value for foreign_pay.iban_no
     *
     * @mbggenerated
     */
    public void setIbanNo(String ibanNo) {
        this.ibanNo = ibanNo == null ? null : ibanNo.trim();
    }

    /**
     * corresponds to the database table foreign_pay
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
        sb.append(", productCode=").append(productCode);
        sb.append(", gid=").append(gid);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", merchOrderNo=").append(merchOrderNo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantAccNo=").append(merchantAccNo);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", inlet=").append(inlet);
        sb.append(", memo=").append(memo);
        sb.append(", transferNo=").append(transferNo);
        sb.append(", transferBackNo=").append(transferBackNo);
        sb.append(", foreignPayNo=").append(foreignPayNo);
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", tradeName=").append(tradeName);
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", buyerFee=").append(buyerFee);
        sb.append(", partnerFee=").append(partnerFee);
        sb.append(", currency=").append(currency);
        sb.append(", buyerUserId=").append(buyerUserId);
        sb.append(", buyerCardNo=").append(buyerCardNo);
        sb.append(", buyerAccNo=").append(buyerAccNo);
        sb.append(", buyerRealName=").append(buyerRealName);
        sb.append(", supervisionAccNo=").append(supervisionAccNo);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", sellerRealName=").append(sellerRealName);
        sb.append(", failReason=").append(failReason);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", ibanNo=").append(ibanNo);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table foreign_pay
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
        ForeignPayDO other = (ForeignPayDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getMerchantOrderNo() == null ? other.getMerchantOrderNo() == null : this.getMerchantOrderNo().equals(other.getMerchantOrderNo()))
            && (this.getMerchOrderNo() == null ? other.getMerchOrderNo() == null : this.getMerchOrderNo().equals(other.getMerchOrderNo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantAccNo() == null ? other.getMerchantAccNo() == null : this.getMerchantAccNo().equals(other.getMerchantAccNo()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getInlet() == null ? other.getInlet() == null : this.getInlet().equals(other.getInlet()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getTransferNo() == null ? other.getTransferNo() == null : this.getTransferNo().equals(other.getTransferNo()))
            && (this.getTransferBackNo() == null ? other.getTransferBackNo() == null : this.getTransferBackNo().equals(other.getTransferBackNo()))
            && (this.getForeignPayNo() == null ? other.getForeignPayNo() == null : this.getForeignPayNo().equals(other.getForeignPayNo()))
            && (this.getChargeNo() == null ? other.getChargeNo() == null : this.getChargeNo().equals(other.getChargeNo()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getTradeName() == null ? other.getTradeName() == null : this.getTradeName().equals(other.getTradeName()))
            && (this.getTradeAmount() == null ? other.getTradeAmount() == null : this.getTradeAmount().equals(other.getTradeAmount()))
            && (this.getBuyerFee() == null ? other.getBuyerFee() == null : this.getBuyerFee().equals(other.getBuyerFee()))
            && (this.getPartnerFee() == null ? other.getPartnerFee() == null : this.getPartnerFee().equals(other.getPartnerFee()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getBuyerUserId() == null ? other.getBuyerUserId() == null : this.getBuyerUserId().equals(other.getBuyerUserId()))
            && (this.getBuyerCardNo() == null ? other.getBuyerCardNo() == null : this.getBuyerCardNo().equals(other.getBuyerCardNo()))
            && (this.getBuyerAccNo() == null ? other.getBuyerAccNo() == null : this.getBuyerAccNo().equals(other.getBuyerAccNo()))
            && (this.getBuyerRealName() == null ? other.getBuyerRealName() == null : this.getBuyerRealName().equals(other.getBuyerRealName()))
            && (this.getSupervisionAccNo() == null ? other.getSupervisionAccNo() == null : this.getSupervisionAccNo().equals(other.getSupervisionAccNo()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getSellerRealName() == null ? other.getSellerRealName() == null : this.getSellerRealName().equals(other.getSellerRealName()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getIbanNo() == null ? other.getIbanNo() == null : this.getIbanNo().equals(other.getIbanNo()));
    }

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getMerchantOrderNo() == null) ? 0 : getMerchantOrderNo().hashCode());
        result = prime * result + ((getMerchOrderNo() == null) ? 0 : getMerchOrderNo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantAccNo() == null) ? 0 : getMerchantAccNo().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getInlet() == null) ? 0 : getInlet().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getTransferNo() == null) ? 0 : getTransferNo().hashCode());
        result = prime * result + ((getTransferBackNo() == null) ? 0 : getTransferBackNo().hashCode());
        result = prime * result + ((getForeignPayNo() == null) ? 0 : getForeignPayNo().hashCode());
        result = prime * result + ((getChargeNo() == null) ? 0 : getChargeNo().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getTradeName() == null) ? 0 : getTradeName().hashCode());
        result = prime * result + ((getTradeAmount() == null) ? 0 : getTradeAmount().hashCode());
        result = prime * result + ((getBuyerFee() == null) ? 0 : getBuyerFee().hashCode());
        result = prime * result + ((getPartnerFee() == null) ? 0 : getPartnerFee().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getBuyerUserId() == null) ? 0 : getBuyerUserId().hashCode());
        result = prime * result + ((getBuyerCardNo() == null) ? 0 : getBuyerCardNo().hashCode());
        result = prime * result + ((getBuyerAccNo() == null) ? 0 : getBuyerAccNo().hashCode());
        result = prime * result + ((getBuyerRealName() == null) ? 0 : getBuyerRealName().hashCode());
        result = prime * result + ((getSupervisionAccNo() == null) ? 0 : getSupervisionAccNo().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getSellerRealName() == null) ? 0 : getSellerRealName().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getIbanNo() == null) ? 0 : getIbanNo().hashCode());
        return result;
    }
}