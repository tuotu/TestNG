/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastTradeDO.java
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

public class FastTradeDO implements Serializable {
    /**
     * corresponds to the database column fast_trade.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column fast_trade.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_trade.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column fast_trade.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column fast_trade.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column fast_trade.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column fast_trade.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column fast_trade.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column fast_trade.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column fast_trade.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column fast_trade.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column fast_trade.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column fast_trade.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column fast_trade.auto_changeable
     *
     * @mbggenerated
     */
    private String autoChangeable;

    /**
     * corresponds to the database column fast_trade.bank_account_name
     *
     * @mbggenerated
     */
    private String bankAccountName;

    /**
     * corresponds to the database column fast_trade.bank_card_no
     *
     * @mbggenerated
     */
    private String bankCardNo;

    /**
     * corresponds to the database column fast_trade.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column fast_trade.bank_card_type
     *
     * @mbggenerated
     */
    private String bankCardType;

    /**
     * corresponds to the database column fast_trade.personal_corporate_type
     *
     * @mbggenerated
     */
    private String personalCorporateType;

    /**
     * corresponds to the database column fast_trade.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column fast_trade.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * corresponds to the database column fast_trade.cert_no
     *
     * @mbggenerated
     */
    private String certNo;

    /**
     * corresponds to the database column fast_trade.cert_type
     *
     * @mbggenerated
     */
    private String certType;

    /**
     * corresponds to the database column fast_trade.charge_no
     *
     * @mbggenerated
     */
    private String chargeNo;

    /**
     * corresponds to the database column fast_trade.command_amount
     *
     * @mbggenerated
     */
    private Long commandAmount;

    /**
     * corresponds to the database column fast_trade.deduct_out_order_no
     *
     * @mbggenerated
     */
    private String deductOutOrderNo;

    /**
     * corresponds to the database column fast_trade.deposit_amount
     *
     * @mbggenerated
     */
    private Long depositAmount;

    /**
     * corresponds to the database column fast_trade.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column fast_trade.merchant_charge_acc_no
     *
     * @mbggenerated
     */
    private String merchantChargeAccNo;

    /**
     * corresponds to the database column fast_trade.merchant_charge_amount
     *
     * @mbggenerated
     */
    private Long merchantChargeAmount;

    /**
     * corresponds to the database column fast_trade.merchant_custodia_acc_no
     *
     * @mbggenerated
     */
    private String merchantCustodiaAccNo;

    /**
     * corresponds to the database column fast_trade.merchant_name
     *
     * @mbggenerated
     */
    private String merchantName;

    /**
     * corresponds to the database column fast_trade.mobile
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * corresponds to the database column fast_trade.pay_amount
     *
     * @mbggenerated
     */
    private Long payAmount;

    /**
     * corresponds to the database column fast_trade.pay_no
     *
     * @mbggenerated
     */
    private String payNo;

    /**
     * corresponds to the database column fast_trade.pay_out_order_no
     *
     * @mbggenerated
     */
    private String payOutOrderNo;

    /**
     * corresponds to the database column fast_trade.present_channel
     *
     * @mbggenerated
     */
    private String presentChannel;

    /**
     * corresponds to the database column fast_trade.protocol_no
     *
     * @mbggenerated
     */
    private String protocolNo;

    /**
     * corresponds to the database column fast_trade.seller_acc_no
     *
     * @mbggenerated
     */
    private String sellerAccNo;

    /**
     * corresponds to the database column fast_trade.seller_card_no
     *
     * @mbggenerated
     */
    private String sellerCardNo;

    /**
     * corresponds to the database column fast_trade.seller_charge_amount
     *
     * @mbggenerated
     */
    private Long sellerChargeAmount;

    /**
     * corresponds to the database column fast_trade.seller_user_id
     *
     * @mbggenerated
     */
    private String sellerUserId;

    /**
     * corresponds to the database column fast_trade.seller_user_real_name
     *
     * @mbggenerated
     */
    private String sellerUserRealName;

    /**
     * corresponds to the database column fast_trade.sub_protocol_no
     *
     * @mbggenerated
     */
    private String subProtocolNo;

    /**
     * corresponds to the database column fast_trade.trade_no
     *
     * @mbggenerated
     */
    private String tradeNo;

    /**
     * corresponds to the database column fast_trade.used_channels
     *
     * @mbggenerated
     */
    private String usedChannels;

    /**
     * corresponds to the database column fast_trade.user_charge_amount
     *
     * @mbggenerated
     */
    private Long userChargeAmount;

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_trade.biz_no
     *
     * @return the value of fast_trade.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column fast_trade.biz_no
     *
     * @param bizNo the value for fast_trade.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column fast_trade.raw_add_time
     *
     * @return the value of fast_trade.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_trade.raw_add_time
     *
     * @param rawAddTime the value for fast_trade.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_trade.raw_update_time
     *
     * @return the value of fast_trade.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_trade.raw_update_time
     *
     * @param rawUpdateTime the value for fast_trade.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column fast_trade.gid
     *
     * @return the value of fast_trade.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column fast_trade.gid
     *
     * @param gid the value for fast_trade.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column fast_trade.inlet
     *
     * @return the value of fast_trade.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column fast_trade.inlet
     *
     * @param inlet the value for fast_trade.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column fast_trade.memo
     *
     * @return the value of fast_trade.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column fast_trade.memo
     *
     * @param memo the value for fast_trade.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column fast_trade.merchant_acc_no
     *
     * @return the value of fast_trade.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column fast_trade.merchant_acc_no
     *
     * @param merchantAccNo the value for fast_trade.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column fast_trade.merchant_card_no
     *
     * @return the value of fast_trade.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column fast_trade.merchant_card_no
     *
     * @param merchantCardNo the value for fast_trade.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column fast_trade.merchant_order_no
     *
     * @return the value of fast_trade.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column fast_trade.merchant_order_no
     *
     * @param merchantOrderNo the value for fast_trade.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column fast_trade.merch_order_no
     *
     * @return the value of fast_trade.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column fast_trade.merch_order_no
     *
     * @param merchOrderNo the value for fast_trade.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column fast_trade.merchant_user_id
     *
     * @return the value of fast_trade.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column fast_trade.merchant_user_id
     *
     * @param merchantUserId the value for fast_trade.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column fast_trade.product_code
     *
     * @return the value of fast_trade.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column fast_trade.product_code
     *
     * @param productCode the value for fast_trade.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column fast_trade.product_status
     *
     * @return the value of fast_trade.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column fast_trade.product_status
     *
     * @param productStatus the value for fast_trade.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column fast_trade.auto_changeable
     *
     * @return the value of fast_trade.auto_changeable
     *
     * @mbggenerated
     */
    public String getAutoChangeable() {
        return autoChangeable;
    }

    /**
     * set the value of the database column fast_trade.auto_changeable
     *
     * @param autoChangeable the value for fast_trade.auto_changeable
     *
     * @mbggenerated
     */
    public void setAutoChangeable(String autoChangeable) {
        this.autoChangeable = autoChangeable == null ? null : autoChangeable.trim();
    }

    /**
     * return the value of the database column fast_trade.bank_account_name
     *
     * @return the value of fast_trade.bank_account_name
     *
     * @mbggenerated
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * set the value of the database column fast_trade.bank_account_name
     *
     * @param bankAccountName the value for fast_trade.bank_account_name
     *
     * @mbggenerated
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    /**
     * return the value of the database column fast_trade.bank_card_no
     *
     * @return the value of fast_trade.bank_card_no
     *
     * @mbggenerated
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * set the value of the database column fast_trade.bank_card_no
     *
     * @param bankCardNo the value for fast_trade.bank_card_no
     *
     * @mbggenerated
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    /**
     * return the value of the database column fast_trade.sec_index
     *
     * @return the value of fast_trade.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column fast_trade.sec_index
     *
     * @param secIndex the value for fast_trade.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column fast_trade.bank_card_type
     *
     * @return the value of fast_trade.bank_card_type
     *
     * @mbggenerated
     */
    public String getBankCardType() {
        return bankCardType;
    }

    /**
     * set the value of the database column fast_trade.bank_card_type
     *
     * @param bankCardType the value for fast_trade.bank_card_type
     *
     * @mbggenerated
     */
    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType == null ? null : bankCardType.trim();
    }

    /**
     * return the value of the database column fast_trade.personal_corporate_type
     *
     * @return the value of fast_trade.personal_corporate_type
     *
     * @mbggenerated
     */
    public String getPersonalCorporateType() {
        return personalCorporateType;
    }

    /**
     * set the value of the database column fast_trade.personal_corporate_type
     *
     * @param personalCorporateType the value for fast_trade.personal_corporate_type
     *
     * @mbggenerated
     */
    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType == null ? null : personalCorporateType.trim();
    }

    /**
     * return the value of the database column fast_trade.bank_code
     *
     * @return the value of fast_trade.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column fast_trade.bank_code
     *
     * @param bankCode the value for fast_trade.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column fast_trade.bank_name
     *
     * @return the value of fast_trade.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set the value of the database column fast_trade.bank_name
     *
     * @param bankName the value for fast_trade.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * return the value of the database column fast_trade.cert_no
     *
     * @return the value of fast_trade.cert_no
     *
     * @mbggenerated
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * set the value of the database column fast_trade.cert_no
     *
     * @param certNo the value for fast_trade.cert_no
     *
     * @mbggenerated
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * return the value of the database column fast_trade.cert_type
     *
     * @return the value of fast_trade.cert_type
     *
     * @mbggenerated
     */
    public String getCertType() {
        return certType;
    }

    /**
     * set the value of the database column fast_trade.cert_type
     *
     * @param certType the value for fast_trade.cert_type
     *
     * @mbggenerated
     */
    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    /**
     * return the value of the database column fast_trade.charge_no
     *
     * @return the value of fast_trade.charge_no
     *
     * @mbggenerated
     */
    public String getChargeNo() {
        return chargeNo;
    }

    /**
     * set the value of the database column fast_trade.charge_no
     *
     * @param chargeNo the value for fast_trade.charge_no
     *
     * @mbggenerated
     */
    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo == null ? null : chargeNo.trim();
    }

    /**
     * return the value of the database column fast_trade.command_amount
     *
     * @return the value of fast_trade.command_amount
     *
     * @mbggenerated
     */
    public Long getCommandAmount() {
        return commandAmount;
    }

    /**
     * set the value of the database column fast_trade.command_amount
     *
     * @param commandAmount the value for fast_trade.command_amount
     *
     * @mbggenerated
     */
    public void setCommandAmount(Long commandAmount) {
        this.commandAmount = commandAmount;
    }

    /**
     * return the value of the database column fast_trade.deduct_out_order_no
     *
     * @return the value of fast_trade.deduct_out_order_no
     *
     * @mbggenerated
     */
    public String getDeductOutOrderNo() {
        return deductOutOrderNo;
    }

    /**
     * set the value of the database column fast_trade.deduct_out_order_no
     *
     * @param deductOutOrderNo the value for fast_trade.deduct_out_order_no
     *
     * @mbggenerated
     */
    public void setDeductOutOrderNo(String deductOutOrderNo) {
        this.deductOutOrderNo = deductOutOrderNo == null ? null : deductOutOrderNo.trim();
    }

    /**
     * return the value of the database column fast_trade.deposit_amount
     *
     * @return the value of fast_trade.deposit_amount
     *
     * @mbggenerated
     */
    public Long getDepositAmount() {
        return depositAmount;
    }

    /**
     * set the value of the database column fast_trade.deposit_amount
     *
     * @param depositAmount the value for fast_trade.deposit_amount
     *
     * @mbggenerated
     */
    public void setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    /**
     * return the value of the database column fast_trade.fail_reason
     *
     * @return the value of fast_trade.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column fast_trade.fail_reason
     *
     * @param failReason the value for fast_trade.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column fast_trade.merchant_charge_acc_no
     *
     * @return the value of fast_trade.merchant_charge_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantChargeAccNo() {
        return merchantChargeAccNo;
    }

    /**
     * set the value of the database column fast_trade.merchant_charge_acc_no
     *
     * @param merchantChargeAccNo the value for fast_trade.merchant_charge_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantChargeAccNo(String merchantChargeAccNo) {
        this.merchantChargeAccNo = merchantChargeAccNo == null ? null : merchantChargeAccNo.trim();
    }

    /**
     * return the value of the database column fast_trade.merchant_charge_amount
     *
     * @return the value of fast_trade.merchant_charge_amount
     *
     * @mbggenerated
     */
    public Long getMerchantChargeAmount() {
        return merchantChargeAmount;
    }

    /**
     * set the value of the database column fast_trade.merchant_charge_amount
     *
     * @param merchantChargeAmount the value for fast_trade.merchant_charge_amount
     *
     * @mbggenerated
     */
    public void setMerchantChargeAmount(Long merchantChargeAmount) {
        this.merchantChargeAmount = merchantChargeAmount;
    }

    /**
     * return the value of the database column fast_trade.merchant_custodia_acc_no
     *
     * @return the value of fast_trade.merchant_custodia_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantCustodiaAccNo() {
        return merchantCustodiaAccNo;
    }

    /**
     * set the value of the database column fast_trade.merchant_custodia_acc_no
     *
     * @param merchantCustodiaAccNo the value for fast_trade.merchant_custodia_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantCustodiaAccNo(String merchantCustodiaAccNo) {
        this.merchantCustodiaAccNo = merchantCustodiaAccNo == null ? null : merchantCustodiaAccNo.trim();
    }

    /**
     * return the value of the database column fast_trade.merchant_name
     *
     * @return the value of fast_trade.merchant_name
     *
     * @mbggenerated
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * set the value of the database column fast_trade.merchant_name
     *
     * @param merchantName the value for fast_trade.merchant_name
     *
     * @mbggenerated
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    /**
     * return the value of the database column fast_trade.mobile
     *
     * @return the value of fast_trade.mobile
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * set the value of the database column fast_trade.mobile
     *
     * @param mobile the value for fast_trade.mobile
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * return the value of the database column fast_trade.pay_amount
     *
     * @return the value of fast_trade.pay_amount
     *
     * @mbggenerated
     */
    public Long getPayAmount() {
        return payAmount;
    }

    /**
     * set the value of the database column fast_trade.pay_amount
     *
     * @param payAmount the value for fast_trade.pay_amount
     *
     * @mbggenerated
     */
    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * return the value of the database column fast_trade.pay_no
     *
     * @return the value of fast_trade.pay_no
     *
     * @mbggenerated
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * set the value of the database column fast_trade.pay_no
     *
     * @param payNo the value for fast_trade.pay_no
     *
     * @mbggenerated
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    /**
     * return the value of the database column fast_trade.pay_out_order_no
     *
     * @return the value of fast_trade.pay_out_order_no
     *
     * @mbggenerated
     */
    public String getPayOutOrderNo() {
        return payOutOrderNo;
    }

    /**
     * set the value of the database column fast_trade.pay_out_order_no
     *
     * @param payOutOrderNo the value for fast_trade.pay_out_order_no
     *
     * @mbggenerated
     */
    public void setPayOutOrderNo(String payOutOrderNo) {
        this.payOutOrderNo = payOutOrderNo == null ? null : payOutOrderNo.trim();
    }

    /**
     * return the value of the database column fast_trade.present_channel
     *
     * @return the value of fast_trade.present_channel
     *
     * @mbggenerated
     */
    public String getPresentChannel() {
        return presentChannel;
    }

    /**
     * set the value of the database column fast_trade.present_channel
     *
     * @param presentChannel the value for fast_trade.present_channel
     *
     * @mbggenerated
     */
    public void setPresentChannel(String presentChannel) {
        this.presentChannel = presentChannel == null ? null : presentChannel.trim();
    }

    /**
     * return the value of the database column fast_trade.protocol_no
     *
     * @return the value of fast_trade.protocol_no
     *
     * @mbggenerated
     */
    public String getProtocolNo() {
        return protocolNo;
    }

    /**
     * set the value of the database column fast_trade.protocol_no
     *
     * @param protocolNo the value for fast_trade.protocol_no
     *
     * @mbggenerated
     */
    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo == null ? null : protocolNo.trim();
    }

    /**
     * return the value of the database column fast_trade.seller_acc_no
     *
     * @return the value of fast_trade.seller_acc_no
     *
     * @mbggenerated
     */
    public String getSellerAccNo() {
        return sellerAccNo;
    }

    /**
     * set the value of the database column fast_trade.seller_acc_no
     *
     * @param sellerAccNo the value for fast_trade.seller_acc_no
     *
     * @mbggenerated
     */
    public void setSellerAccNo(String sellerAccNo) {
        this.sellerAccNo = sellerAccNo == null ? null : sellerAccNo.trim();
    }

    /**
     * return the value of the database column fast_trade.seller_card_no
     *
     * @return the value of fast_trade.seller_card_no
     *
     * @mbggenerated
     */
    public String getSellerCardNo() {
        return sellerCardNo;
    }

    /**
     * set the value of the database column fast_trade.seller_card_no
     *
     * @param sellerCardNo the value for fast_trade.seller_card_no
     *
     * @mbggenerated
     */
    public void setSellerCardNo(String sellerCardNo) {
        this.sellerCardNo = sellerCardNo == null ? null : sellerCardNo.trim();
    }

    /**
     * return the value of the database column fast_trade.seller_charge_amount
     *
     * @return the value of fast_trade.seller_charge_amount
     *
     * @mbggenerated
     */
    public Long getSellerChargeAmount() {
        return sellerChargeAmount;
    }

    /**
     * set the value of the database column fast_trade.seller_charge_amount
     *
     * @param sellerChargeAmount the value for fast_trade.seller_charge_amount
     *
     * @mbggenerated
     */
    public void setSellerChargeAmount(Long sellerChargeAmount) {
        this.sellerChargeAmount = sellerChargeAmount;
    }

    /**
     * return the value of the database column fast_trade.seller_user_id
     *
     * @return the value of fast_trade.seller_user_id
     *
     * @mbggenerated
     */
    public String getSellerUserId() {
        return sellerUserId;
    }

    /**
     * set the value of the database column fast_trade.seller_user_id
     *
     * @param sellerUserId the value for fast_trade.seller_user_id
     *
     * @mbggenerated
     */
    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId == null ? null : sellerUserId.trim();
    }

    /**
     * return the value of the database column fast_trade.seller_user_real_name
     *
     * @return the value of fast_trade.seller_user_real_name
     *
     * @mbggenerated
     */
    public String getSellerUserRealName() {
        return sellerUserRealName;
    }

    /**
     * set the value of the database column fast_trade.seller_user_real_name
     *
     * @param sellerUserRealName the value for fast_trade.seller_user_real_name
     *
     * @mbggenerated
     */
    public void setSellerUserRealName(String sellerUserRealName) {
        this.sellerUserRealName = sellerUserRealName == null ? null : sellerUserRealName.trim();
    }

    /**
     * return the value of the database column fast_trade.sub_protocol_no
     *
     * @return the value of fast_trade.sub_protocol_no
     *
     * @mbggenerated
     */
    public String getSubProtocolNo() {
        return subProtocolNo;
    }

    /**
     * set the value of the database column fast_trade.sub_protocol_no
     *
     * @param subProtocolNo the value for fast_trade.sub_protocol_no
     *
     * @mbggenerated
     */
    public void setSubProtocolNo(String subProtocolNo) {
        this.subProtocolNo = subProtocolNo == null ? null : subProtocolNo.trim();
    }

    /**
     * return the value of the database column fast_trade.trade_no
     *
     * @return the value of fast_trade.trade_no
     *
     * @mbggenerated
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * set the value of the database column fast_trade.trade_no
     *
     * @param tradeNo the value for fast_trade.trade_no
     *
     * @mbggenerated
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    /**
     * return the value of the database column fast_trade.used_channels
     *
     * @return the value of fast_trade.used_channels
     *
     * @mbggenerated
     */
    public String getUsedChannels() {
        return usedChannels;
    }

    /**
     * set the value of the database column fast_trade.used_channels
     *
     * @param usedChannels the value for fast_trade.used_channels
     *
     * @mbggenerated
     */
    public void setUsedChannels(String usedChannels) {
        this.usedChannels = usedChannels == null ? null : usedChannels.trim();
    }

    /**
     * return the value of the database column fast_trade.user_charge_amount
     *
     * @return the value of fast_trade.user_charge_amount
     *
     * @mbggenerated
     */
    public Long getUserChargeAmount() {
        return userChargeAmount;
    }

    /**
     * set the value of the database column fast_trade.user_charge_amount
     *
     * @param userChargeAmount the value for fast_trade.user_charge_amount
     *
     * @mbggenerated
     */
    public void setUserChargeAmount(Long userChargeAmount) {
        this.userChargeAmount = userChargeAmount;
    }

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", bizNo=").append(bizNo);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", gid=").append(gid);
        sb.append(", inlet=").append(inlet);
        sb.append(", memo=").append(memo);
        sb.append(", merchantAccNo=").append(merchantAccNo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", merchOrderNo=").append(merchOrderNo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", productCode=").append(productCode);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", autoChangeable=").append(autoChangeable);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", bankCardNo=").append(bankCardNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", bankCardType=").append(bankCardType);
        sb.append(", personalCorporateType=").append(personalCorporateType);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", certNo=").append(certNo);
        sb.append(", certType=").append(certType);
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", commandAmount=").append(commandAmount);
        sb.append(", deductOutOrderNo=").append(deductOutOrderNo);
        sb.append(", depositAmount=").append(depositAmount);
        sb.append(", failReason=").append(failReason);
        sb.append(", merchantChargeAccNo=").append(merchantChargeAccNo);
        sb.append(", merchantChargeAmount=").append(merchantChargeAmount);
        sb.append(", merchantCustodiaAccNo=").append(merchantCustodiaAccNo);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", mobile=").append(mobile);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", payNo=").append(payNo);
        sb.append(", payOutOrderNo=").append(payOutOrderNo);
        sb.append(", presentChannel=").append(presentChannel);
        sb.append(", protocolNo=").append(protocolNo);
        sb.append(", sellerAccNo=").append(sellerAccNo);
        sb.append(", sellerCardNo=").append(sellerCardNo);
        sb.append(", sellerChargeAmount=").append(sellerChargeAmount);
        sb.append(", sellerUserId=").append(sellerUserId);
        sb.append(", sellerUserRealName=").append(sellerUserRealName);
        sb.append(", subProtocolNo=").append(subProtocolNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", usedChannels=").append(usedChannels);
        sb.append(", userChargeAmount=").append(userChargeAmount);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_trade
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
        FastTradeDO other = (FastTradeDO) that;
        return (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getInlet() == null ? other.getInlet() == null : this.getInlet().equals(other.getInlet()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantAccNo() == null ? other.getMerchantAccNo() == null : this.getMerchantAccNo().equals(other.getMerchantAccNo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantOrderNo() == null ? other.getMerchantOrderNo() == null : this.getMerchantOrderNo().equals(other.getMerchantOrderNo()))
            && (this.getMerchOrderNo() == null ? other.getMerchOrderNo() == null : this.getMerchOrderNo().equals(other.getMerchOrderNo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getAutoChangeable() == null ? other.getAutoChangeable() == null : this.getAutoChangeable().equals(other.getAutoChangeable()))
            && (this.getBankAccountName() == null ? other.getBankAccountName() == null : this.getBankAccountName().equals(other.getBankAccountName()))
            && (this.getBankCardNo() == null ? other.getBankCardNo() == null : this.getBankCardNo().equals(other.getBankCardNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getBankCardType() == null ? other.getBankCardType() == null : this.getBankCardType().equals(other.getBankCardType()))
            && (this.getPersonalCorporateType() == null ? other.getPersonalCorporateType() == null : this.getPersonalCorporateType().equals(other.getPersonalCorporateType()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getCertType() == null ? other.getCertType() == null : this.getCertType().equals(other.getCertType()))
            && (this.getChargeNo() == null ? other.getChargeNo() == null : this.getChargeNo().equals(other.getChargeNo()))
            && (this.getCommandAmount() == null ? other.getCommandAmount() == null : this.getCommandAmount().equals(other.getCommandAmount()))
            && (this.getDeductOutOrderNo() == null ? other.getDeductOutOrderNo() == null : this.getDeductOutOrderNo().equals(other.getDeductOutOrderNo()))
            && (this.getDepositAmount() == null ? other.getDepositAmount() == null : this.getDepositAmount().equals(other.getDepositAmount()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getMerchantChargeAccNo() == null ? other.getMerchantChargeAccNo() == null : this.getMerchantChargeAccNo().equals(other.getMerchantChargeAccNo()))
            && (this.getMerchantChargeAmount() == null ? other.getMerchantChargeAmount() == null : this.getMerchantChargeAmount().equals(other.getMerchantChargeAmount()))
            && (this.getMerchantCustodiaAccNo() == null ? other.getMerchantCustodiaAccNo() == null : this.getMerchantCustodiaAccNo().equals(other.getMerchantCustodiaAccNo()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getPayNo() == null ? other.getPayNo() == null : this.getPayNo().equals(other.getPayNo()))
            && (this.getPayOutOrderNo() == null ? other.getPayOutOrderNo() == null : this.getPayOutOrderNo().equals(other.getPayOutOrderNo()))
            && (this.getPresentChannel() == null ? other.getPresentChannel() == null : this.getPresentChannel().equals(other.getPresentChannel()))
            && (this.getProtocolNo() == null ? other.getProtocolNo() == null : this.getProtocolNo().equals(other.getProtocolNo()))
            && (this.getSellerAccNo() == null ? other.getSellerAccNo() == null : this.getSellerAccNo().equals(other.getSellerAccNo()))
            && (this.getSellerCardNo() == null ? other.getSellerCardNo() == null : this.getSellerCardNo().equals(other.getSellerCardNo()))
            && (this.getSellerChargeAmount() == null ? other.getSellerChargeAmount() == null : this.getSellerChargeAmount().equals(other.getSellerChargeAmount()))
            && (this.getSellerUserId() == null ? other.getSellerUserId() == null : this.getSellerUserId().equals(other.getSellerUserId()))
            && (this.getSellerUserRealName() == null ? other.getSellerUserRealName() == null : this.getSellerUserRealName().equals(other.getSellerUserRealName()))
            && (this.getSubProtocolNo() == null ? other.getSubProtocolNo() == null : this.getSubProtocolNo().equals(other.getSubProtocolNo()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getUsedChannels() == null ? other.getUsedChannels() == null : this.getUsedChannels().equals(other.getUsedChannels()))
            && (this.getUserChargeAmount() == null ? other.getUserChargeAmount() == null : this.getUserChargeAmount().equals(other.getUserChargeAmount()));
    }

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getInlet() == null) ? 0 : getInlet().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantAccNo() == null) ? 0 : getMerchantAccNo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantOrderNo() == null) ? 0 : getMerchantOrderNo().hashCode());
        result = prime * result + ((getMerchOrderNo() == null) ? 0 : getMerchOrderNo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getAutoChangeable() == null) ? 0 : getAutoChangeable().hashCode());
        result = prime * result + ((getBankAccountName() == null) ? 0 : getBankAccountName().hashCode());
        result = prime * result + ((getBankCardNo() == null) ? 0 : getBankCardNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getBankCardType() == null) ? 0 : getBankCardType().hashCode());
        result = prime * result + ((getPersonalCorporateType() == null) ? 0 : getPersonalCorporateType().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getCertType() == null) ? 0 : getCertType().hashCode());
        result = prime * result + ((getChargeNo() == null) ? 0 : getChargeNo().hashCode());
        result = prime * result + ((getCommandAmount() == null) ? 0 : getCommandAmount().hashCode());
        result = prime * result + ((getDeductOutOrderNo() == null) ? 0 : getDeductOutOrderNo().hashCode());
        result = prime * result + ((getDepositAmount() == null) ? 0 : getDepositAmount().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getMerchantChargeAccNo() == null) ? 0 : getMerchantChargeAccNo().hashCode());
        result = prime * result + ((getMerchantChargeAmount() == null) ? 0 : getMerchantChargeAmount().hashCode());
        result = prime * result + ((getMerchantCustodiaAccNo() == null) ? 0 : getMerchantCustodiaAccNo().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getPayNo() == null) ? 0 : getPayNo().hashCode());
        result = prime * result + ((getPayOutOrderNo() == null) ? 0 : getPayOutOrderNo().hashCode());
        result = prime * result + ((getPresentChannel() == null) ? 0 : getPresentChannel().hashCode());
        result = prime * result + ((getProtocolNo() == null) ? 0 : getProtocolNo().hashCode());
        result = prime * result + ((getSellerAccNo() == null) ? 0 : getSellerAccNo().hashCode());
        result = prime * result + ((getSellerCardNo() == null) ? 0 : getSellerCardNo().hashCode());
        result = prime * result + ((getSellerChargeAmount() == null) ? 0 : getSellerChargeAmount().hashCode());
        result = prime * result + ((getSellerUserId() == null) ? 0 : getSellerUserId().hashCode());
        result = prime * result + ((getSellerUserRealName() == null) ? 0 : getSellerUserRealName().hashCode());
        result = prime * result + ((getSubProtocolNo() == null) ? 0 : getSubProtocolNo().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getUsedChannels() == null) ? 0 : getUsedChannels().hashCode());
        result = prime * result + ((getUserChargeAmount() == null) ? 0 : getUserChargeAmount().hashCode());
        return result;
    }
}