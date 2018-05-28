/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename BatchBehalfDetailDO.java
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

public class BatchBehalfDetailDO implements Serializable {
    /**
     * corresponds to the database column batch_behalf_detail.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column batch_behalf_detail.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column batch_behalf_detail.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column batch_behalf_detail.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column batch_behalf_detail.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column batch_behalf_detail.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column batch_behalf_detail.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column batch_behalf_detail.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column batch_behalf_detail.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column batch_behalf_detail.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column batch_behalf_detail.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column batch_behalf_detail.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column batch_behalf_detail.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column batch_behalf_detail.amount
     *
     * @mbggenerated
     */
    private Money amount;

    /**
     * corresponds to the database column batch_behalf_detail.bank_account_name
     *
     * @mbggenerated
     */
    private String bankAccountName;

    /**
     * corresponds to the database column batch_behalf_detail.bank_account_no
     *
     * @mbggenerated
     */
    private String bankAccountNo;

    /**
     * corresponds to the database column batch_behalf_detail.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column batch_behalf_detail.bank_branch
     *
     * @mbggenerated
     */
    private String bankBranch;

    /**
     * corresponds to the database column batch_behalf_detail.bank_city
     *
     * @mbggenerated
     */
    private String bankCity;

    /**
     * corresponds to the database column batch_behalf_detail.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column batch_behalf_detail.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * corresponds to the database column batch_behalf_detail.bank_province
     *
     * @mbggenerated
     */
    private String bankProvince;

    /**
     * corresponds to the database column batch_behalf_detail.batch_biz_no
     *
     * @mbggenerated
     */
    private String batchBizNo;

    /**
     * corresponds to the database column batch_behalf_detail.business_no
     *
     * @mbggenerated
     */
    private String businessNo;

    /**
     * corresponds to the database column batch_behalf_detail.charge_no
     *
     * @mbggenerated
     */
    private String chargeNo;

    /**
     * corresponds to the database column batch_behalf_detail.counter_fee
     *
     * @mbggenerated
     */
    private Money counterFee;

    /**
     * corresponds to the database column batch_behalf_detail.currency
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * corresponds to the database column batch_behalf_detail.delay_hours
     *
     * @mbggenerated
     */
    private Integer delayHours;

    /**
     * corresponds to the database column batch_behalf_detail.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column batch_behalf_detail.seller_account
     *
     * @mbggenerated
     */
    private String sellerAccount;

    /**
     * corresponds to the database column batch_behalf_detail.seller_card_no
     *
     * @mbggenerated
     */
    private String sellerCardNo;

    /**
     * corresponds to the database column batch_behalf_detail.seller_account_no
     *
     * @mbggenerated
     */
    private String sellerAccountNo;

    /**
     * corresponds to the database column batch_behalf_detail.seller_user_id
     *
     * @mbggenerated
     */
    private String sellerUserId;

    /**
     * corresponds to the database column batch_behalf_detail.transfer_no
     *
     * @mbggenerated
     */
    private String transferNo;

    /**
     * corresponds to the database column batch_behalf_detail.target_account_type
     *
     * @mbggenerated
     */
    private String targetAccountType;

    /**
     * corresponds to the database column batch_behalf_detail.userEndIp
     *
     * @mbggenerated
     */
    private String userendip;

    /**
     * corresponds to the database column batch_behalf_detail.sellerAccountNo
     *
     * @mbggenerated
     */
    private String selleraccountno;

    /**
     * corresponds to the database column batch_behalf_detail.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column batch_behalf_detail.sellerAccount
     *
     * @mbggenerated
     */
    private String selleraccount;

    /**
     * corresponds to the database column batch_behalf_detail.payer_user_id
     *
     * @mbggenerated
     */
    private String payerUserId;

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column batch_behalf_detail.id
     *
     * @return the value of batch_behalf_detail.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column batch_behalf_detail.id
     *
     * @param id the value for batch_behalf_detail.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column batch_behalf_detail.biz_no
     *
     * @return the value of batch_behalf_detail.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.biz_no
     *
     * @param bizNo the value for batch_behalf_detail.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.raw_add_time
     *
     * @return the value of batch_behalf_detail.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column batch_behalf_detail.raw_add_time
     *
     * @param rawAddTime the value for batch_behalf_detail.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column batch_behalf_detail.raw_update_time
     *
     * @return the value of batch_behalf_detail.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column batch_behalf_detail.raw_update_time
     *
     * @param rawUpdateTime the value for batch_behalf_detail.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column batch_behalf_detail.gid
     *
     * @return the value of batch_behalf_detail.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column batch_behalf_detail.gid
     *
     * @param gid the value for batch_behalf_detail.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.inlet
     *
     * @return the value of batch_behalf_detail.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column batch_behalf_detail.inlet
     *
     * @param inlet the value for batch_behalf_detail.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.memo
     *
     * @return the value of batch_behalf_detail.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column batch_behalf_detail.memo
     *
     * @param memo the value for batch_behalf_detail.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.merchant_acc_no
     *
     * @return the value of batch_behalf_detail.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.merchant_acc_no
     *
     * @param merchantAccNo the value for batch_behalf_detail.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.merchant_card_no
     *
     * @return the value of batch_behalf_detail.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.merchant_card_no
     *
     * @param merchantCardNo the value for batch_behalf_detail.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.merchant_order_no
     *
     * @return the value of batch_behalf_detail.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.merchant_order_no
     *
     * @param merchantOrderNo the value for batch_behalf_detail.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.merchant_user_id
     *
     * @return the value of batch_behalf_detail.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column batch_behalf_detail.merchant_user_id
     *
     * @param merchantUserId the value for batch_behalf_detail.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.product_code
     *
     * @return the value of batch_behalf_detail.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column batch_behalf_detail.product_code
     *
     * @param productCode the value for batch_behalf_detail.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.product_status
     *
     * @return the value of batch_behalf_detail.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column batch_behalf_detail.product_status
     *
     * @param productStatus the value for batch_behalf_detail.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.amount
     *
     * @return the value of batch_behalf_detail.amount
     *
     * @mbggenerated
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * set the value of the database column batch_behalf_detail.amount
     *
     * @param amount the value for batch_behalf_detail.amount
     *
     * @mbggenerated
     */
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * return the value of the database column batch_behalf_detail.bank_account_name
     *
     * @return the value of batch_behalf_detail.bank_account_name
     *
     * @mbggenerated
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * set the value of the database column batch_behalf_detail.bank_account_name
     *
     * @param bankAccountName the value for batch_behalf_detail.bank_account_name
     *
     * @mbggenerated
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.bank_account_no
     *
     * @return the value of batch_behalf_detail.bank_account_no
     *
     * @mbggenerated
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.bank_account_no
     *
     * @param bankAccountNo the value for batch_behalf_detail.bank_account_no
     *
     * @mbggenerated
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.sec_index
     *
     * @return the value of batch_behalf_detail.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column batch_behalf_detail.sec_index
     *
     * @param secIndex the value for batch_behalf_detail.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.bank_branch
     *
     * @return the value of batch_behalf_detail.bank_branch
     *
     * @mbggenerated
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * set the value of the database column batch_behalf_detail.bank_branch
     *
     * @param bankBranch the value for batch_behalf_detail.bank_branch
     *
     * @mbggenerated
     */
    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch == null ? null : bankBranch.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.bank_city
     *
     * @return the value of batch_behalf_detail.bank_city
     *
     * @mbggenerated
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * set the value of the database column batch_behalf_detail.bank_city
     *
     * @param bankCity the value for batch_behalf_detail.bank_city
     *
     * @mbggenerated
     */
    public void setBankCity(String bankCity) {
        this.bankCity = bankCity == null ? null : bankCity.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.bank_code
     *
     * @return the value of batch_behalf_detail.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column batch_behalf_detail.bank_code
     *
     * @param bankCode the value for batch_behalf_detail.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.bank_name
     *
     * @return the value of batch_behalf_detail.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set the value of the database column batch_behalf_detail.bank_name
     *
     * @param bankName the value for batch_behalf_detail.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.bank_province
     *
     * @return the value of batch_behalf_detail.bank_province
     *
     * @mbggenerated
     */
    public String getBankProvince() {
        return bankProvince;
    }

    /**
     * set the value of the database column batch_behalf_detail.bank_province
     *
     * @param bankProvince the value for batch_behalf_detail.bank_province
     *
     * @mbggenerated
     */
    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince == null ? null : bankProvince.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.batch_biz_no
     *
     * @return the value of batch_behalf_detail.batch_biz_no
     *
     * @mbggenerated
     */
    public String getBatchBizNo() {
        return batchBizNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.batch_biz_no
     *
     * @param batchBizNo the value for batch_behalf_detail.batch_biz_no
     *
     * @mbggenerated
     */
    public void setBatchBizNo(String batchBizNo) {
        this.batchBizNo = batchBizNo == null ? null : batchBizNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.business_no
     *
     * @return the value of batch_behalf_detail.business_no
     *
     * @mbggenerated
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.business_no
     *
     * @param businessNo the value for batch_behalf_detail.business_no
     *
     * @mbggenerated
     */
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.charge_no
     *
     * @return the value of batch_behalf_detail.charge_no
     *
     * @mbggenerated
     */
    public String getChargeNo() {
        return chargeNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.charge_no
     *
     * @param chargeNo the value for batch_behalf_detail.charge_no
     *
     * @mbggenerated
     */
    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo == null ? null : chargeNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.counter_fee
     *
     * @return the value of batch_behalf_detail.counter_fee
     *
     * @mbggenerated
     */
    public Money getCounterFee() {
        return counterFee;
    }

    /**
     * set the value of the database column batch_behalf_detail.counter_fee
     *
     * @param counterFee the value for batch_behalf_detail.counter_fee
     *
     * @mbggenerated
     */
    public void setCounterFee(Money counterFee) {
        this.counterFee = counterFee;
    }

    /**
     * return the value of the database column batch_behalf_detail.currency
     *
     * @return the value of batch_behalf_detail.currency
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * set the value of the database column batch_behalf_detail.currency
     *
     * @param currency the value for batch_behalf_detail.currency
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.delay_hours
     *
     * @return the value of batch_behalf_detail.delay_hours
     *
     * @mbggenerated
     */
    public Integer getDelayHours() {
        return delayHours;
    }

    /**
     * set the value of the database column batch_behalf_detail.delay_hours
     *
     * @param delayHours the value for batch_behalf_detail.delay_hours
     *
     * @mbggenerated
     */
    public void setDelayHours(Integer delayHours) {
        this.delayHours = delayHours;
    }

    /**
     * return the value of the database column batch_behalf_detail.fail_reason
     *
     * @return the value of batch_behalf_detail.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column batch_behalf_detail.fail_reason
     *
     * @param failReason the value for batch_behalf_detail.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.seller_account
     *
     * @return the value of batch_behalf_detail.seller_account
     *
     * @mbggenerated
     */
    public String getSellerAccount() {
        return sellerAccount;
    }

    /**
     * set the value of the database column batch_behalf_detail.seller_account
     *
     * @param sellerAccount the value for batch_behalf_detail.seller_account
     *
     * @mbggenerated
     */
    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount == null ? null : sellerAccount.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.seller_card_no
     *
     * @return the value of batch_behalf_detail.seller_card_no
     *
     * @mbggenerated
     */
    public String getSellerCardNo() {
        return sellerCardNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.seller_card_no
     *
     * @param sellerCardNo the value for batch_behalf_detail.seller_card_no
     *
     * @mbggenerated
     */
    public void setSellerCardNo(String sellerCardNo) {
        this.sellerCardNo = sellerCardNo == null ? null : sellerCardNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.seller_account_no
     *
     * @return the value of batch_behalf_detail.seller_account_no
     *
     * @mbggenerated
     */
    public String getSellerAccountNo() {
        return sellerAccountNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.seller_account_no
     *
     * @param sellerAccountNo the value for batch_behalf_detail.seller_account_no
     *
     * @mbggenerated
     */
    public void setSellerAccountNo(String sellerAccountNo) {
        this.sellerAccountNo = sellerAccountNo == null ? null : sellerAccountNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.seller_user_id
     *
     * @return the value of batch_behalf_detail.seller_user_id
     *
     * @mbggenerated
     */
    public String getSellerUserId() {
        return sellerUserId;
    }

    /**
     * set the value of the database column batch_behalf_detail.seller_user_id
     *
     * @param sellerUserId the value for batch_behalf_detail.seller_user_id
     *
     * @mbggenerated
     */
    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId == null ? null : sellerUserId.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.transfer_no
     *
     * @return the value of batch_behalf_detail.transfer_no
     *
     * @mbggenerated
     */
    public String getTransferNo() {
        return transferNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.transfer_no
     *
     * @param transferNo the value for batch_behalf_detail.transfer_no
     *
     * @mbggenerated
     */
    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo == null ? null : transferNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.target_account_type
     *
     * @return the value of batch_behalf_detail.target_account_type
     *
     * @mbggenerated
     */
    public String getTargetAccountType() {
        return targetAccountType;
    }

    /**
     * set the value of the database column batch_behalf_detail.target_account_type
     *
     * @param targetAccountType the value for batch_behalf_detail.target_account_type
     *
     * @mbggenerated
     */
    public void setTargetAccountType(String targetAccountType) {
        this.targetAccountType = targetAccountType == null ? null : targetAccountType.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.userEndIp
     *
     * @return the value of batch_behalf_detail.userEndIp
     *
     * @mbggenerated
     */
    public String getUserendip() {
        return userendip;
    }

    /**
     * set the value of the database column batch_behalf_detail.userEndIp
     *
     * @param userendip the value for batch_behalf_detail.userEndIp
     *
     * @mbggenerated
     */
    public void setUserendip(String userendip) {
        this.userendip = userendip == null ? null : userendip.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.sellerAccountNo
     *
     * @return the value of batch_behalf_detail.sellerAccountNo
     *
     * @mbggenerated
     */
    public String getSelleraccountno() {
        return selleraccountno;
    }

    /**
     * set the value of the database column batch_behalf_detail.sellerAccountNo
     *
     * @param selleraccountno the value for batch_behalf_detail.sellerAccountNo
     *
     * @mbggenerated
     */
    public void setSelleraccountno(String selleraccountno) {
        this.selleraccountno = selleraccountno == null ? null : selleraccountno.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.merch_order_no
     *
     * @return the value of batch_behalf_detail.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column batch_behalf_detail.merch_order_no
     *
     * @param merchOrderNo the value for batch_behalf_detail.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.sellerAccount
     *
     * @return the value of batch_behalf_detail.sellerAccount
     *
     * @mbggenerated
     */
    public String getSelleraccount() {
        return selleraccount;
    }

    /**
     * set the value of the database column batch_behalf_detail.sellerAccount
     *
     * @param selleraccount the value for batch_behalf_detail.sellerAccount
     *
     * @mbggenerated
     */
    public void setSelleraccount(String selleraccount) {
        this.selleraccount = selleraccount == null ? null : selleraccount.trim();
    }

    /**
     * return the value of the database column batch_behalf_detail.payer_user_id
     *
     * @return the value of batch_behalf_detail.payer_user_id
     *
     * @mbggenerated
     */
    public String getPayerUserId() {
        return payerUserId;
    }

    /**
     * set the value of the database column batch_behalf_detail.payer_user_id
     *
     * @param payerUserId the value for batch_behalf_detail.payer_user_id
     *
     * @mbggenerated
     */
    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId == null ? null : payerUserId.trim();
    }

    /**
     * corresponds to the database table batch_behalf_detail
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
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", gid=").append(gid);
        sb.append(", inlet=").append(inlet);
        sb.append(", memo=").append(memo);
        sb.append(", merchantAccNo=").append(merchantAccNo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", productCode=").append(productCode);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", amount=").append(amount);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", bankBranch=").append(bankBranch);
        sb.append(", bankCity=").append(bankCity);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankProvince=").append(bankProvince);
        sb.append(", batchBizNo=").append(batchBizNo);
        sb.append(", businessNo=").append(businessNo);
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", counterFee=").append(counterFee);
        sb.append(", currency=").append(currency);
        sb.append(", delayHours=").append(delayHours);
        sb.append(", failReason=").append(failReason);
        sb.append(", sellerAccount=").append(sellerAccount);
        sb.append(", sellerCardNo=").append(sellerCardNo);
        sb.append(", sellerAccountNo=").append(sellerAccountNo);
        sb.append(", sellerUserId=").append(sellerUserId);
        sb.append(", transferNo=").append(transferNo);
        sb.append(", targetAccountType=").append(targetAccountType);
        sb.append(", userendip=").append(userendip);
        sb.append(", selleraccountno=").append(selleraccountno);
        sb.append(", merchOrderNo=").append(merchOrderNo);
        sb.append(", selleraccount=").append(selleraccount);
        sb.append(", payerUserId=").append(payerUserId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table batch_behalf_detail
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
        BatchBehalfDetailDO other = (BatchBehalfDetailDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getInlet() == null ? other.getInlet() == null : this.getInlet().equals(other.getInlet()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantAccNo() == null ? other.getMerchantAccNo() == null : this.getMerchantAccNo().equals(other.getMerchantAccNo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantOrderNo() == null ? other.getMerchantOrderNo() == null : this.getMerchantOrderNo().equals(other.getMerchantOrderNo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBankAccountName() == null ? other.getBankAccountName() == null : this.getBankAccountName().equals(other.getBankAccountName()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getBankBranch() == null ? other.getBankBranch() == null : this.getBankBranch().equals(other.getBankBranch()))
            && (this.getBankCity() == null ? other.getBankCity() == null : this.getBankCity().equals(other.getBankCity()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBankProvince() == null ? other.getBankProvince() == null : this.getBankProvince().equals(other.getBankProvince()))
            && (this.getBatchBizNo() == null ? other.getBatchBizNo() == null : this.getBatchBizNo().equals(other.getBatchBizNo()))
            && (this.getBusinessNo() == null ? other.getBusinessNo() == null : this.getBusinessNo().equals(other.getBusinessNo()))
            && (this.getChargeNo() == null ? other.getChargeNo() == null : this.getChargeNo().equals(other.getChargeNo()))
            && (this.getCounterFee() == null ? other.getCounterFee() == null : this.getCounterFee().equals(other.getCounterFee()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getDelayHours() == null ? other.getDelayHours() == null : this.getDelayHours().equals(other.getDelayHours()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getSellerAccount() == null ? other.getSellerAccount() == null : this.getSellerAccount().equals(other.getSellerAccount()))
            && (this.getSellerCardNo() == null ? other.getSellerCardNo() == null : this.getSellerCardNo().equals(other.getSellerCardNo()))
            && (this.getSellerAccountNo() == null ? other.getSellerAccountNo() == null : this.getSellerAccountNo().equals(other.getSellerAccountNo()))
            && (this.getSellerUserId() == null ? other.getSellerUserId() == null : this.getSellerUserId().equals(other.getSellerUserId()))
            && (this.getTransferNo() == null ? other.getTransferNo() == null : this.getTransferNo().equals(other.getTransferNo()))
            && (this.getTargetAccountType() == null ? other.getTargetAccountType() == null : this.getTargetAccountType().equals(other.getTargetAccountType()))
            && (this.getUserendip() == null ? other.getUserendip() == null : this.getUserendip().equals(other.getUserendip()))
            && (this.getSelleraccountno() == null ? other.getSelleraccountno() == null : this.getSelleraccountno().equals(other.getSelleraccountno()))
            && (this.getMerchOrderNo() == null ? other.getMerchOrderNo() == null : this.getMerchOrderNo().equals(other.getMerchOrderNo()))
            && (this.getSelleraccount() == null ? other.getSelleraccount() == null : this.getSelleraccount().equals(other.getSelleraccount()))
            && (this.getPayerUserId() == null ? other.getPayerUserId() == null : this.getPayerUserId().equals(other.getPayerUserId()));
    }

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getInlet() == null) ? 0 : getInlet().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantAccNo() == null) ? 0 : getMerchantAccNo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantOrderNo() == null) ? 0 : getMerchantOrderNo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBankAccountName() == null) ? 0 : getBankAccountName().hashCode());
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getBankBranch() == null) ? 0 : getBankBranch().hashCode());
        result = prime * result + ((getBankCity() == null) ? 0 : getBankCity().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBankProvince() == null) ? 0 : getBankProvince().hashCode());
        result = prime * result + ((getBatchBizNo() == null) ? 0 : getBatchBizNo().hashCode());
        result = prime * result + ((getBusinessNo() == null) ? 0 : getBusinessNo().hashCode());
        result = prime * result + ((getChargeNo() == null) ? 0 : getChargeNo().hashCode());
        result = prime * result + ((getCounterFee() == null) ? 0 : getCounterFee().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getDelayHours() == null) ? 0 : getDelayHours().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getSellerAccount() == null) ? 0 : getSellerAccount().hashCode());
        result = prime * result + ((getSellerCardNo() == null) ? 0 : getSellerCardNo().hashCode());
        result = prime * result + ((getSellerAccountNo() == null) ? 0 : getSellerAccountNo().hashCode());
        result = prime * result + ((getSellerUserId() == null) ? 0 : getSellerUserId().hashCode());
        result = prime * result + ((getTransferNo() == null) ? 0 : getTransferNo().hashCode());
        result = prime * result + ((getTargetAccountType() == null) ? 0 : getTargetAccountType().hashCode());
        result = prime * result + ((getUserendip() == null) ? 0 : getUserendip().hashCode());
        result = prime * result + ((getSelleraccountno() == null) ? 0 : getSelleraccountno().hashCode());
        result = prime * result + ((getMerchOrderNo() == null) ? 0 : getMerchOrderNo().hashCode());
        result = prime * result + ((getSelleraccount() == null) ? 0 : getSelleraccount().hashCode());
        result = prime * result + ((getPayerUserId() == null) ? 0 : getPayerUserId().hashCode());
        return result;
    }
}