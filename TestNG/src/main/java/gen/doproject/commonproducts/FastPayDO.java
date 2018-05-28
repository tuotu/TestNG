/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayDO.java
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

public class FastPayDO implements Serializable {
    /**
     * corresponds to the database column fast_pay.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column fast_pay.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column fast_pay.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column fast_pay.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column fast_pay.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column fast_pay.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column fast_pay.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column fast_pay.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column fast_pay.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column fast_pay.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column fast_pay.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column fast_pay.national_type
     *
     * @mbggenerated
     */
    private String nationalType;

    /**
     * corresponds to the database column fast_pay.pay_mode
     *
     * @mbggenerated
     */
    private String payMode;

    /**
     * corresponds to the database column fast_pay.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column fast_pay.auto_close_duration
     *
     * @mbggenerated
     */
    private Long autoCloseDuration;

    /**
     * corresponds to the database column fast_pay.trade_name
     *
     * @mbggenerated
     */
    private String tradeName;

    /**
     * corresponds to the database column fast_pay.out_user_id
     *
     * @mbggenerated
     */
    private String outUserId;

    /**
     * corresponds to the database column fast_pay.buyer_user_id
     *
     * @mbggenerated
     */
    private String buyerUserId;

    /**
     * corresponds to the database column fast_pay.buyer_card_no
     *
     * @mbggenerated
     */
    private String buyerCardNo;

    /**
     * corresponds to the database column fast_pay.buyer_acc_no
     *
     * @mbggenerated
     */
    private String buyerAccNo;

    /**
     * corresponds to the database column fast_pay.buyer_org_name
     *
     * @mbggenerated
     */
    private String buyerOrgName;

    /**
     * corresponds to the database column fast_pay.buyer_real_name
     *
     * @mbggenerated
     */
    private String buyerRealName;

    /**
     * corresponds to the database column fast_pay.seller_user_id
     *
     * @mbggenerated
     */
    private String sellerUserId;

    /**
     * corresponds to the database column fast_pay.seller_card_no
     *
     * @mbggenerated
     */
    private String sellerCardNo;

    /**
     * corresponds to the database column fast_pay.seller_acc_no
     *
     * @mbggenerated
     */
    private String sellerAccNo;

    /**
     * corresponds to the database column fast_pay.seller_real_name
     *
     * @mbggenerated
     */
    private String sellerRealName;

    /**
     * corresponds to the database column fast_pay.seller_org_name
     *
     * @mbggenerated
     */
    private String sellerOrgName;

    /**
     * corresponds to the database column fast_pay.seller_bank_account_no
     *
     * @mbggenerated
     */
    private String sellerBankAccountNo;

    /**
     * corresponds to the database column fast_pay.trade_amount
     *
     * @mbggenerated
     */
    private Money tradeAmount;

    /**
     * corresponds to the database column fast_pay.currency
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * corresponds to the database column fast_pay.foreign_amount
     *
     * @mbggenerated
     */
    private Money foreignAmount;

    /**
     * corresponds to the database column fast_pay.foreign_currency
     *
     * @mbggenerated
     */
    private String foreignCurrency;

    /**
     * corresponds to the database column fast_pay.rate
     *
     * @mbggenerated
     */
    private String rate;

    /**
     * corresponds to the database column fast_pay.share_amount
     *
     * @mbggenerated
     */
    private Money shareAmount;

    /**
     * corresponds to the database column fast_pay.pact_no
     *
     * @mbggenerated
     */
    private String pactNo;

    /**
     * corresponds to the database column fast_pay.has_refund
     *
     * @mbggenerated
     */
    private String hasRefund;

    /**
     * corresponds to the database column fast_pay.withdraw_status
     *
     * @mbggenerated
     */
    private String withdrawStatus;

    /**
     * corresponds to the database column fast_pay.withdraw_order_no
     *
     * @mbggenerated
     */
    private String withdrawOrderNo;

    /**
     * corresponds to the database column fast_pay.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column fast_pay.apply_pay_time
     *
     * @mbggenerated
     */
    private Date applyPayTime;

    /**
     * corresponds to the database column fast_pay.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column fast_pay.branded_card_no
     *
     * @mbggenerated
     */
    private String brandedCardNo;

    /**
     * corresponds to the database column fast_pay.branded_card_name
     *
     * @mbggenerated
     */
    private String brandedCardName;

    /**
     * corresponds to the database column fast_pay.need_jump_bank
     *
     * @mbggenerated
     */
    private String needJumpBank;

    /**
     * corresponds to the database column fast_pay.offline_pay_code
     *
     * @mbggenerated
     */
    private String offlinePayCode;

    /**
     * corresponds to the database column fast_pay.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay.id
     *
     * @return the value of fast_pay.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay.id
     *
     * @param id the value for fast_pay.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay.biz_no
     *
     * @return the value of fast_pay.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column fast_pay.biz_no
     *
     * @param bizNo the value for fast_pay.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column fast_pay.product_code
     *
     * @return the value of fast_pay.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column fast_pay.product_code
     *
     * @param productCode the value for fast_pay.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column fast_pay.gid
     *
     * @return the value of fast_pay.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column fast_pay.gid
     *
     * @param gid the value for fast_pay.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column fast_pay.merchant_order_no
     *
     * @return the value of fast_pay.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column fast_pay.merchant_order_no
     *
     * @param merchantOrderNo the value for fast_pay.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column fast_pay.merch_order_no
     *
     * @return the value of fast_pay.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column fast_pay.merch_order_no
     *
     * @param merchOrderNo the value for fast_pay.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column fast_pay.merchant_user_id
     *
     * @return the value of fast_pay.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column fast_pay.merchant_user_id
     *
     * @param merchantUserId the value for fast_pay.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column fast_pay.merchant_card_no
     *
     * @return the value of fast_pay.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column fast_pay.merchant_card_no
     *
     * @param merchantCardNo the value for fast_pay.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column fast_pay.merchant_acc_no
     *
     * @return the value of fast_pay.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column fast_pay.merchant_acc_no
     *
     * @param merchantAccNo the value for fast_pay.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column fast_pay.product_status
     *
     * @return the value of fast_pay.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column fast_pay.product_status
     *
     * @param productStatus the value for fast_pay.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column fast_pay.inlet
     *
     * @return the value of fast_pay.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column fast_pay.inlet
     *
     * @param inlet the value for fast_pay.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column fast_pay.national_type
     *
     * @return the value of fast_pay.national_type
     *
     * @mbggenerated
     */
    public String getNationalType() {
        return nationalType;
    }

    /**
     * set the value of the database column fast_pay.national_type
     *
     * @param nationalType the value for fast_pay.national_type
     *
     * @mbggenerated
     */
    public void setNationalType(String nationalType) {
        this.nationalType = nationalType == null ? null : nationalType.trim();
    }

    /**
     * return the value of the database column fast_pay.pay_mode
     *
     * @return the value of fast_pay.pay_mode
     *
     * @mbggenerated
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * set the value of the database column fast_pay.pay_mode
     *
     * @param payMode the value for fast_pay.pay_mode
     *
     * @mbggenerated
     */
    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    /**
     * return the value of the database column fast_pay.memo
     *
     * @return the value of fast_pay.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column fast_pay.memo
     *
     * @param memo the value for fast_pay.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column fast_pay.auto_close_duration
     *
     * @return the value of fast_pay.auto_close_duration
     *
     * @mbggenerated
     */
    public Long getAutoCloseDuration() {
        return autoCloseDuration;
    }

    /**
     * set the value of the database column fast_pay.auto_close_duration
     *
     * @param autoCloseDuration the value for fast_pay.auto_close_duration
     *
     * @mbggenerated
     */
    public void setAutoCloseDuration(Long autoCloseDuration) {
        this.autoCloseDuration = autoCloseDuration;
    }

    /**
     * return the value of the database column fast_pay.trade_name
     *
     * @return the value of fast_pay.trade_name
     *
     * @mbggenerated
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * set the value of the database column fast_pay.trade_name
     *
     * @param tradeName the value for fast_pay.trade_name
     *
     * @mbggenerated
     */
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName == null ? null : tradeName.trim();
    }

    /**
     * return the value of the database column fast_pay.out_user_id
     *
     * @return the value of fast_pay.out_user_id
     *
     * @mbggenerated
     */
    public String getOutUserId() {
        return outUserId;
    }

    /**
     * set the value of the database column fast_pay.out_user_id
     *
     * @param outUserId the value for fast_pay.out_user_id
     *
     * @mbggenerated
     */
    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId == null ? null : outUserId.trim();
    }

    /**
     * return the value of the database column fast_pay.buyer_user_id
     *
     * @return the value of fast_pay.buyer_user_id
     *
     * @mbggenerated
     */
    public String getBuyerUserId() {
        return buyerUserId;
    }

    /**
     * set the value of the database column fast_pay.buyer_user_id
     *
     * @param buyerUserId the value for fast_pay.buyer_user_id
     *
     * @mbggenerated
     */
    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId == null ? null : buyerUserId.trim();
    }

    /**
     * return the value of the database column fast_pay.buyer_card_no
     *
     * @return the value of fast_pay.buyer_card_no
     *
     * @mbggenerated
     */
    public String getBuyerCardNo() {
        return buyerCardNo;
    }

    /**
     * set the value of the database column fast_pay.buyer_card_no
     *
     * @param buyerCardNo the value for fast_pay.buyer_card_no
     *
     * @mbggenerated
     */
    public void setBuyerCardNo(String buyerCardNo) {
        this.buyerCardNo = buyerCardNo == null ? null : buyerCardNo.trim();
    }

    /**
     * return the value of the database column fast_pay.buyer_acc_no
     *
     * @return the value of fast_pay.buyer_acc_no
     *
     * @mbggenerated
     */
    public String getBuyerAccNo() {
        return buyerAccNo;
    }

    /**
     * set the value of the database column fast_pay.buyer_acc_no
     *
     * @param buyerAccNo the value for fast_pay.buyer_acc_no
     *
     * @mbggenerated
     */
    public void setBuyerAccNo(String buyerAccNo) {
        this.buyerAccNo = buyerAccNo == null ? null : buyerAccNo.trim();
    }

    /**
     * return the value of the database column fast_pay.buyer_org_name
     *
     * @return the value of fast_pay.buyer_org_name
     *
     * @mbggenerated
     */
    public String getBuyerOrgName() {
        return buyerOrgName;
    }

    /**
     * set the value of the database column fast_pay.buyer_org_name
     *
     * @param buyerOrgName the value for fast_pay.buyer_org_name
     *
     * @mbggenerated
     */
    public void setBuyerOrgName(String buyerOrgName) {
        this.buyerOrgName = buyerOrgName == null ? null : buyerOrgName.trim();
    }

    /**
     * return the value of the database column fast_pay.buyer_real_name
     *
     * @return the value of fast_pay.buyer_real_name
     *
     * @mbggenerated
     */
    public String getBuyerRealName() {
        return buyerRealName;
    }

    /**
     * set the value of the database column fast_pay.buyer_real_name
     *
     * @param buyerRealName the value for fast_pay.buyer_real_name
     *
     * @mbggenerated
     */
    public void setBuyerRealName(String buyerRealName) {
        this.buyerRealName = buyerRealName == null ? null : buyerRealName.trim();
    }

    /**
     * return the value of the database column fast_pay.seller_user_id
     *
     * @return the value of fast_pay.seller_user_id
     *
     * @mbggenerated
     */
    public String getSellerUserId() {
        return sellerUserId;
    }

    /**
     * set the value of the database column fast_pay.seller_user_id
     *
     * @param sellerUserId the value for fast_pay.seller_user_id
     *
     * @mbggenerated
     */
    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId == null ? null : sellerUserId.trim();
    }

    /**
     * return the value of the database column fast_pay.seller_card_no
     *
     * @return the value of fast_pay.seller_card_no
     *
     * @mbggenerated
     */
    public String getSellerCardNo() {
        return sellerCardNo;
    }

    /**
     * set the value of the database column fast_pay.seller_card_no
     *
     * @param sellerCardNo the value for fast_pay.seller_card_no
     *
     * @mbggenerated
     */
    public void setSellerCardNo(String sellerCardNo) {
        this.sellerCardNo = sellerCardNo == null ? null : sellerCardNo.trim();
    }

    /**
     * return the value of the database column fast_pay.seller_acc_no
     *
     * @return the value of fast_pay.seller_acc_no
     *
     * @mbggenerated
     */
    public String getSellerAccNo() {
        return sellerAccNo;
    }

    /**
     * set the value of the database column fast_pay.seller_acc_no
     *
     * @param sellerAccNo the value for fast_pay.seller_acc_no
     *
     * @mbggenerated
     */
    public void setSellerAccNo(String sellerAccNo) {
        this.sellerAccNo = sellerAccNo == null ? null : sellerAccNo.trim();
    }

    /**
     * return the value of the database column fast_pay.seller_real_name
     *
     * @return the value of fast_pay.seller_real_name
     *
     * @mbggenerated
     */
    public String getSellerRealName() {
        return sellerRealName;
    }

    /**
     * set the value of the database column fast_pay.seller_real_name
     *
     * @param sellerRealName the value for fast_pay.seller_real_name
     *
     * @mbggenerated
     */
    public void setSellerRealName(String sellerRealName) {
        this.sellerRealName = sellerRealName == null ? null : sellerRealName.trim();
    }

    /**
     * return the value of the database column fast_pay.seller_org_name
     *
     * @return the value of fast_pay.seller_org_name
     *
     * @mbggenerated
     */
    public String getSellerOrgName() {
        return sellerOrgName;
    }

    /**
     * set the value of the database column fast_pay.seller_org_name
     *
     * @param sellerOrgName the value for fast_pay.seller_org_name
     *
     * @mbggenerated
     */
    public void setSellerOrgName(String sellerOrgName) {
        this.sellerOrgName = sellerOrgName == null ? null : sellerOrgName.trim();
    }

    /**
     * return the value of the database column fast_pay.seller_bank_account_no
     *
     * @return the value of fast_pay.seller_bank_account_no
     *
     * @mbggenerated
     */
    public String getSellerBankAccountNo() {
        return sellerBankAccountNo;
    }

    /**
     * set the value of the database column fast_pay.seller_bank_account_no
     *
     * @param sellerBankAccountNo the value for fast_pay.seller_bank_account_no
     *
     * @mbggenerated
     */
    public void setSellerBankAccountNo(String sellerBankAccountNo) {
        this.sellerBankAccountNo = sellerBankAccountNo == null ? null : sellerBankAccountNo.trim();
    }

    /**
     * return the value of the database column fast_pay.trade_amount
     *
     * @return the value of fast_pay.trade_amount
     *
     * @mbggenerated
     */
    public Money getTradeAmount() {
        return tradeAmount;
    }

    /**
     * set the value of the database column fast_pay.trade_amount
     *
     * @param tradeAmount the value for fast_pay.trade_amount
     *
     * @mbggenerated
     */
    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * return the value of the database column fast_pay.currency
     *
     * @return the value of fast_pay.currency
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * set the value of the database column fast_pay.currency
     *
     * @param currency the value for fast_pay.currency
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * return the value of the database column fast_pay.foreign_amount
     *
     * @return the value of fast_pay.foreign_amount
     *
     * @mbggenerated
     */
    public Money getForeignAmount() {
        return foreignAmount;
    }

    /**
     * set the value of the database column fast_pay.foreign_amount
     *
     * @param foreignAmount the value for fast_pay.foreign_amount
     *
     * @mbggenerated
     */
    public void setForeignAmount(Money foreignAmount) {
        this.foreignAmount = foreignAmount;
    }

    /**
     * return the value of the database column fast_pay.foreign_currency
     *
     * @return the value of fast_pay.foreign_currency
     *
     * @mbggenerated
     */
    public String getForeignCurrency() {
        return foreignCurrency;
    }

    /**
     * set the value of the database column fast_pay.foreign_currency
     *
     * @param foreignCurrency the value for fast_pay.foreign_currency
     *
     * @mbggenerated
     */
    public void setForeignCurrency(String foreignCurrency) {
        this.foreignCurrency = foreignCurrency == null ? null : foreignCurrency.trim();
    }

    /**
     * return the value of the database column fast_pay.rate
     *
     * @return the value of fast_pay.rate
     *
     * @mbggenerated
     */
    public String getRate() {
        return rate;
    }

    /**
     * set the value of the database column fast_pay.rate
     *
     * @param rate the value for fast_pay.rate
     *
     * @mbggenerated
     */
    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    /**
     * return the value of the database column fast_pay.share_amount
     *
     * @return the value of fast_pay.share_amount
     *
     * @mbggenerated
     */
    public Money getShareAmount() {
        return shareAmount;
    }

    /**
     * set the value of the database column fast_pay.share_amount
     *
     * @param shareAmount the value for fast_pay.share_amount
     *
     * @mbggenerated
     */
    public void setShareAmount(Money shareAmount) {
        this.shareAmount = shareAmount;
    }

    /**
     * return the value of the database column fast_pay.pact_no
     *
     * @return the value of fast_pay.pact_no
     *
     * @mbggenerated
     */
    public String getPactNo() {
        return pactNo;
    }

    /**
     * set the value of the database column fast_pay.pact_no
     *
     * @param pactNo the value for fast_pay.pact_no
     *
     * @mbggenerated
     */
    public void setPactNo(String pactNo) {
        this.pactNo = pactNo == null ? null : pactNo.trim();
    }

    /**
     * return the value of the database column fast_pay.has_refund
     *
     * @return the value of fast_pay.has_refund
     *
     * @mbggenerated
     */
    public String getHasRefund() {
        return hasRefund;
    }

    /**
     * set the value of the database column fast_pay.has_refund
     *
     * @param hasRefund the value for fast_pay.has_refund
     *
     * @mbggenerated
     */
    public void setHasRefund(String hasRefund) {
        this.hasRefund = hasRefund == null ? null : hasRefund.trim();
    }

    /**
     * return the value of the database column fast_pay.withdraw_status
     *
     * @return the value of fast_pay.withdraw_status
     *
     * @mbggenerated
     */
    public String getWithdrawStatus() {
        return withdrawStatus;
    }

    /**
     * set the value of the database column fast_pay.withdraw_status
     *
     * @param withdrawStatus the value for fast_pay.withdraw_status
     *
     * @mbggenerated
     */
    public void setWithdrawStatus(String withdrawStatus) {
        this.withdrawStatus = withdrawStatus == null ? null : withdrawStatus.trim();
    }

    /**
     * return the value of the database column fast_pay.withdraw_order_no
     *
     * @return the value of fast_pay.withdraw_order_no
     *
     * @mbggenerated
     */
    public String getWithdrawOrderNo() {
        return withdrawOrderNo;
    }

    /**
     * set the value of the database column fast_pay.withdraw_order_no
     *
     * @param withdrawOrderNo the value for fast_pay.withdraw_order_no
     *
     * @mbggenerated
     */
    public void setWithdrawOrderNo(String withdrawOrderNo) {
        this.withdrawOrderNo = withdrawOrderNo == null ? null : withdrawOrderNo.trim();
    }

    /**
     * return the value of the database column fast_pay.fail_reason
     *
     * @return the value of fast_pay.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column fast_pay.fail_reason
     *
     * @param failReason the value for fast_pay.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column fast_pay.apply_pay_time
     *
     * @return the value of fast_pay.apply_pay_time
     *
     * @mbggenerated
     */
    public Date getApplyPayTime() {
        return applyPayTime;
    }

    /**
     * set the value of the database column fast_pay.apply_pay_time
     *
     * @param applyPayTime the value for fast_pay.apply_pay_time
     *
     * @mbggenerated
     */
    public void setApplyPayTime(Date applyPayTime) {
        this.applyPayTime = applyPayTime;
    }

    /**
     * return the value of the database column fast_pay.sec_index
     *
     * @return the value of fast_pay.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column fast_pay.sec_index
     *
     * @param secIndex the value for fast_pay.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column fast_pay.branded_card_no
     *
     * @return the value of fast_pay.branded_card_no
     *
     * @mbggenerated
     */
    public String getBrandedCardNo() {
        return brandedCardNo;
    }

    /**
     * set the value of the database column fast_pay.branded_card_no
     *
     * @param brandedCardNo the value for fast_pay.branded_card_no
     *
     * @mbggenerated
     */
    public void setBrandedCardNo(String brandedCardNo) {
        this.brandedCardNo = brandedCardNo == null ? null : brandedCardNo.trim();
    }

    /**
     * return the value of the database column fast_pay.branded_card_name
     *
     * @return the value of fast_pay.branded_card_name
     *
     * @mbggenerated
     */
    public String getBrandedCardName() {
        return brandedCardName;
    }

    /**
     * set the value of the database column fast_pay.branded_card_name
     *
     * @param brandedCardName the value for fast_pay.branded_card_name
     *
     * @mbggenerated
     */
    public void setBrandedCardName(String brandedCardName) {
        this.brandedCardName = brandedCardName == null ? null : brandedCardName.trim();
    }

    /**
     * return the value of the database column fast_pay.need_jump_bank
     *
     * @return the value of fast_pay.need_jump_bank
     *
     * @mbggenerated
     */
    public String getNeedJumpBank() {
        return needJumpBank;
    }

    /**
     * set the value of the database column fast_pay.need_jump_bank
     *
     * @param needJumpBank the value for fast_pay.need_jump_bank
     *
     * @mbggenerated
     */
    public void setNeedJumpBank(String needJumpBank) {
        this.needJumpBank = needJumpBank == null ? null : needJumpBank.trim();
    }

    /**
     * return the value of the database column fast_pay.offline_pay_code
     *
     * @return the value of fast_pay.offline_pay_code
     *
     * @mbggenerated
     */
    public String getOfflinePayCode() {
        return offlinePayCode;
    }

    /**
     * set the value of the database column fast_pay.offline_pay_code
     *
     * @param offlinePayCode the value for fast_pay.offline_pay_code
     *
     * @mbggenerated
     */
    public void setOfflinePayCode(String offlinePayCode) {
        this.offlinePayCode = offlinePayCode == null ? null : offlinePayCode.trim();
    }

    /**
     * return the value of the database column fast_pay.raw_add_time
     *
     * @return the value of fast_pay.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay.raw_add_time
     *
     * @param rawAddTime the value for fast_pay.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay.raw_update_time
     *
     * @return the value of fast_pay.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table fast_pay
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
        sb.append(", nationalType=").append(nationalType);
        sb.append(", payMode=").append(payMode);
        sb.append(", memo=").append(memo);
        sb.append(", autoCloseDuration=").append(autoCloseDuration);
        sb.append(", tradeName=").append(tradeName);
        sb.append(", outUserId=").append(outUserId);
        sb.append(", buyerUserId=").append(buyerUserId);
        sb.append(", buyerCardNo=").append(buyerCardNo);
        sb.append(", buyerAccNo=").append(buyerAccNo);
        sb.append(", buyerOrgName=").append(buyerOrgName);
        sb.append(", buyerRealName=").append(buyerRealName);
        sb.append(", sellerUserId=").append(sellerUserId);
        sb.append(", sellerCardNo=").append(sellerCardNo);
        sb.append(", sellerAccNo=").append(sellerAccNo);
        sb.append(", sellerRealName=").append(sellerRealName);
        sb.append(", sellerOrgName=").append(sellerOrgName);
        sb.append(", sellerBankAccountNo=").append(sellerBankAccountNo);
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", currency=").append(currency);
        sb.append(", foreignAmount=").append(foreignAmount);
        sb.append(", foreignCurrency=").append(foreignCurrency);
        sb.append(", rate=").append(rate);
        sb.append(", shareAmount=").append(shareAmount);
        sb.append(", pactNo=").append(pactNo);
        sb.append(", hasRefund=").append(hasRefund);
        sb.append(", withdrawStatus=").append(withdrawStatus);
        sb.append(", withdrawOrderNo=").append(withdrawOrderNo);
        sb.append(", failReason=").append(failReason);
        sb.append(", applyPayTime=").append(applyPayTime);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", brandedCardNo=").append(brandedCardNo);
        sb.append(", brandedCardName=").append(brandedCardName);
        sb.append(", needJumpBank=").append(needJumpBank);
        sb.append(", offlinePayCode=").append(offlinePayCode);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay
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
        FastPayDO other = (FastPayDO) that;
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
            && (this.getNationalType() == null ? other.getNationalType() == null : this.getNationalType().equals(other.getNationalType()))
            && (this.getPayMode() == null ? other.getPayMode() == null : this.getPayMode().equals(other.getPayMode()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getAutoCloseDuration() == null ? other.getAutoCloseDuration() == null : this.getAutoCloseDuration().equals(other.getAutoCloseDuration()))
            && (this.getTradeName() == null ? other.getTradeName() == null : this.getTradeName().equals(other.getTradeName()))
            && (this.getOutUserId() == null ? other.getOutUserId() == null : this.getOutUserId().equals(other.getOutUserId()))
            && (this.getBuyerUserId() == null ? other.getBuyerUserId() == null : this.getBuyerUserId().equals(other.getBuyerUserId()))
            && (this.getBuyerCardNo() == null ? other.getBuyerCardNo() == null : this.getBuyerCardNo().equals(other.getBuyerCardNo()))
            && (this.getBuyerAccNo() == null ? other.getBuyerAccNo() == null : this.getBuyerAccNo().equals(other.getBuyerAccNo()))
            && (this.getBuyerOrgName() == null ? other.getBuyerOrgName() == null : this.getBuyerOrgName().equals(other.getBuyerOrgName()))
            && (this.getBuyerRealName() == null ? other.getBuyerRealName() == null : this.getBuyerRealName().equals(other.getBuyerRealName()))
            && (this.getSellerUserId() == null ? other.getSellerUserId() == null : this.getSellerUserId().equals(other.getSellerUserId()))
            && (this.getSellerCardNo() == null ? other.getSellerCardNo() == null : this.getSellerCardNo().equals(other.getSellerCardNo()))
            && (this.getSellerAccNo() == null ? other.getSellerAccNo() == null : this.getSellerAccNo().equals(other.getSellerAccNo()))
            && (this.getSellerRealName() == null ? other.getSellerRealName() == null : this.getSellerRealName().equals(other.getSellerRealName()))
            && (this.getSellerOrgName() == null ? other.getSellerOrgName() == null : this.getSellerOrgName().equals(other.getSellerOrgName()))
            && (this.getSellerBankAccountNo() == null ? other.getSellerBankAccountNo() == null : this.getSellerBankAccountNo().equals(other.getSellerBankAccountNo()))
            && (this.getTradeAmount() == null ? other.getTradeAmount() == null : this.getTradeAmount().equals(other.getTradeAmount()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getForeignAmount() == null ? other.getForeignAmount() == null : this.getForeignAmount().equals(other.getForeignAmount()))
            && (this.getForeignCurrency() == null ? other.getForeignCurrency() == null : this.getForeignCurrency().equals(other.getForeignCurrency()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getShareAmount() == null ? other.getShareAmount() == null : this.getShareAmount().equals(other.getShareAmount()))
            && (this.getPactNo() == null ? other.getPactNo() == null : this.getPactNo().equals(other.getPactNo()))
            && (this.getHasRefund() == null ? other.getHasRefund() == null : this.getHasRefund().equals(other.getHasRefund()))
            && (this.getWithdrawStatus() == null ? other.getWithdrawStatus() == null : this.getWithdrawStatus().equals(other.getWithdrawStatus()))
            && (this.getWithdrawOrderNo() == null ? other.getWithdrawOrderNo() == null : this.getWithdrawOrderNo().equals(other.getWithdrawOrderNo()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getApplyPayTime() == null ? other.getApplyPayTime() == null : this.getApplyPayTime().equals(other.getApplyPayTime()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getBrandedCardNo() == null ? other.getBrandedCardNo() == null : this.getBrandedCardNo().equals(other.getBrandedCardNo()))
            && (this.getBrandedCardName() == null ? other.getBrandedCardName() == null : this.getBrandedCardName().equals(other.getBrandedCardName()))
            && (this.getNeedJumpBank() == null ? other.getNeedJumpBank() == null : this.getNeedJumpBank().equals(other.getNeedJumpBank()))
            && (this.getOfflinePayCode() == null ? other.getOfflinePayCode() == null : this.getOfflinePayCode().equals(other.getOfflinePayCode()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table fast_pay
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
        result = prime * result + ((getNationalType() == null) ? 0 : getNationalType().hashCode());
        result = prime * result + ((getPayMode() == null) ? 0 : getPayMode().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getAutoCloseDuration() == null) ? 0 : getAutoCloseDuration().hashCode());
        result = prime * result + ((getTradeName() == null) ? 0 : getTradeName().hashCode());
        result = prime * result + ((getOutUserId() == null) ? 0 : getOutUserId().hashCode());
        result = prime * result + ((getBuyerUserId() == null) ? 0 : getBuyerUserId().hashCode());
        result = prime * result + ((getBuyerCardNo() == null) ? 0 : getBuyerCardNo().hashCode());
        result = prime * result + ((getBuyerAccNo() == null) ? 0 : getBuyerAccNo().hashCode());
        result = prime * result + ((getBuyerOrgName() == null) ? 0 : getBuyerOrgName().hashCode());
        result = prime * result + ((getBuyerRealName() == null) ? 0 : getBuyerRealName().hashCode());
        result = prime * result + ((getSellerUserId() == null) ? 0 : getSellerUserId().hashCode());
        result = prime * result + ((getSellerCardNo() == null) ? 0 : getSellerCardNo().hashCode());
        result = prime * result + ((getSellerAccNo() == null) ? 0 : getSellerAccNo().hashCode());
        result = prime * result + ((getSellerRealName() == null) ? 0 : getSellerRealName().hashCode());
        result = prime * result + ((getSellerOrgName() == null) ? 0 : getSellerOrgName().hashCode());
        result = prime * result + ((getSellerBankAccountNo() == null) ? 0 : getSellerBankAccountNo().hashCode());
        result = prime * result + ((getTradeAmount() == null) ? 0 : getTradeAmount().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getForeignAmount() == null) ? 0 : getForeignAmount().hashCode());
        result = prime * result + ((getForeignCurrency() == null) ? 0 : getForeignCurrency().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getShareAmount() == null) ? 0 : getShareAmount().hashCode());
        result = prime * result + ((getPactNo() == null) ? 0 : getPactNo().hashCode());
        result = prime * result + ((getHasRefund() == null) ? 0 : getHasRefund().hashCode());
        result = prime * result + ((getWithdrawStatus() == null) ? 0 : getWithdrawStatus().hashCode());
        result = prime * result + ((getWithdrawOrderNo() == null) ? 0 : getWithdrawOrderNo().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getApplyPayTime() == null) ? 0 : getApplyPayTime().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getBrandedCardNo() == null) ? 0 : getBrandedCardNo().hashCode());
        result = prime * result + ((getBrandedCardName() == null) ? 0 : getBrandedCardName().hashCode());
        result = prime * result + ((getNeedJumpBank() == null) ? 0 : getNeedJumpBank().hashCode());
        result = prime * result + ((getOfflinePayCode() == null) ? 0 : getOfflinePayCode().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}