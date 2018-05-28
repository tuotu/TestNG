/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferDO.java
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

public class TransferDO implements Serializable {
    /**
     * corresponds to the database column transfer.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column transfer.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column transfer.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column transfer.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column transfer.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column transfer.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column transfer.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column transfer.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column transfer.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column transfer.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column transfer.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column transfer.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column transfer.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column transfer.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column transfer.account_no
     *
     * @mbggenerated
     */
    private String accountNo;

    /**
     * corresponds to the database column transfer.amount
     *
     * @mbggenerated
     */
    private Long amount;

    /**
     * corresponds to the database column transfer.bank_account_name
     *
     * @mbggenerated
     */
    private String bankAccountName;

    /**
     * corresponds to the database column transfer.bank_account_no
     *
     * @mbggenerated
     */
    private String bankAccountNo;

    /**
     * corresponds to the database column transfer.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column transfer.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column transfer.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * corresponds to the database column transfer.card_no
     *
     * @mbggenerated
     */
    private String cardNo;

    /**
     * corresponds to the database column transfer.charge_amount
     *
     * @mbggenerated
     */
    private Long chargeAmount;

    /**
     * corresponds to the database column transfer.charge_no
     *
     * @mbggenerated
     */
    private String chargeNo;

    /**
     * corresponds to the database column transfer.control_type
     *
     * @mbggenerated
     */
    private String controlType;

    /**
     * corresponds to the database column transfer.currency
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * corresponds to the database column transfer.delay_hours
     *
     * @mbggenerated
     */
    private Integer delayHours;

    /**
     * corresponds to the database column transfer.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column transfer.joint_account_no
     *
     * @mbggenerated
     */
    private String jointAccountNo;

    /**
     * corresponds to the database column transfer.joint_use_for
     *
     * @mbggenerated
     */
    private String jointUseFor;

    /**
     * corresponds to the database column transfer.seller_card_no
     *
     * @mbggenerated
     */
    private String sellerCardNo;

    /**
     * corresponds to the database column transfer.seller_user_id
     *
     * @mbggenerated
     */
    private String sellerUserId;

    /**
     * corresponds to the database column transfer.selller_account_no
     *
     * @mbggenerated
     */
    private String selllerAccountNo;

    /**
     * corresponds to the database column transfer.transfer_no
     *
     * @mbggenerated
     */
    private String transferNo;

    /**
     * corresponds to the database column transfer.joint_out_type
     *
     * @mbggenerated
     */
    private String jointOutType;

    /**
     * corresponds to the database column transfer.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column transfer.orgi_delay_hours
     *
     * @mbggenerated
     */
    private Integer orgiDelayHours;

    /**
     * corresponds to the database column transfer.delay_hours_change_memo
     *
     * @mbggenerated
     */
    private String delayHoursChangeMemo;

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column transfer.id
     *
     * @return the value of transfer.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column transfer.id
     *
     * @param id the value for transfer.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column transfer.biz_no
     *
     * @return the value of transfer.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column transfer.biz_no
     *
     * @param bizNo the value for transfer.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column transfer.raw_add_time
     *
     * @return the value of transfer.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column transfer.raw_add_time
     *
     * @param rawAddTime the value for transfer.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column transfer.raw_update_time
     *
     * @return the value of transfer.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column transfer.raw_update_time
     *
     * @param rawUpdateTime the value for transfer.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column transfer.gid
     *
     * @return the value of transfer.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column transfer.gid
     *
     * @param gid the value for transfer.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column transfer.inlet
     *
     * @return the value of transfer.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column transfer.inlet
     *
     * @param inlet the value for transfer.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column transfer.memo
     *
     * @return the value of transfer.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column transfer.memo
     *
     * @param memo the value for transfer.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column transfer.merchant_acc_no
     *
     * @return the value of transfer.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column transfer.merchant_acc_no
     *
     * @param merchantAccNo the value for transfer.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column transfer.merchant_card_no
     *
     * @return the value of transfer.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column transfer.merchant_card_no
     *
     * @param merchantCardNo the value for transfer.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column transfer.merchant_order_no
     *
     * @return the value of transfer.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column transfer.merchant_order_no
     *
     * @param merchantOrderNo the value for transfer.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column transfer.merch_order_no
     *
     * @return the value of transfer.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column transfer.merch_order_no
     *
     * @param merchOrderNo the value for transfer.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column transfer.merchant_user_id
     *
     * @return the value of transfer.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column transfer.merchant_user_id
     *
     * @param merchantUserId the value for transfer.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column transfer.product_code
     *
     * @return the value of transfer.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column transfer.product_code
     *
     * @param productCode the value for transfer.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column transfer.product_status
     *
     * @return the value of transfer.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column transfer.product_status
     *
     * @param productStatus the value for transfer.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column transfer.account_no
     *
     * @return the value of transfer.account_no
     *
     * @mbggenerated
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * set the value of the database column transfer.account_no
     *
     * @param accountNo the value for transfer.account_no
     *
     * @mbggenerated
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * return the value of the database column transfer.amount
     *
     * @return the value of transfer.amount
     *
     * @mbggenerated
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * set the value of the database column transfer.amount
     *
     * @param amount the value for transfer.amount
     *
     * @mbggenerated
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * return the value of the database column transfer.bank_account_name
     *
     * @return the value of transfer.bank_account_name
     *
     * @mbggenerated
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * set the value of the database column transfer.bank_account_name
     *
     * @param bankAccountName the value for transfer.bank_account_name
     *
     * @mbggenerated
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    /**
     * return the value of the database column transfer.bank_account_no
     *
     * @return the value of transfer.bank_account_no
     *
     * @mbggenerated
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * set the value of the database column transfer.bank_account_no
     *
     * @param bankAccountNo the value for transfer.bank_account_no
     *
     * @mbggenerated
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * return the value of the database column transfer.sec_index
     *
     * @return the value of transfer.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column transfer.sec_index
     *
     * @param secIndex the value for transfer.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column transfer.bank_code
     *
     * @return the value of transfer.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column transfer.bank_code
     *
     * @param bankCode the value for transfer.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column transfer.bank_name
     *
     * @return the value of transfer.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set the value of the database column transfer.bank_name
     *
     * @param bankName the value for transfer.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * return the value of the database column transfer.card_no
     *
     * @return the value of transfer.card_no
     *
     * @mbggenerated
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * set the value of the database column transfer.card_no
     *
     * @param cardNo the value for transfer.card_no
     *
     * @mbggenerated
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * return the value of the database column transfer.charge_amount
     *
     * @return the value of transfer.charge_amount
     *
     * @mbggenerated
     */
    public Long getChargeAmount() {
        return chargeAmount;
    }

    /**
     * set the value of the database column transfer.charge_amount
     *
     * @param chargeAmount the value for transfer.charge_amount
     *
     * @mbggenerated
     */
    public void setChargeAmount(Long chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * return the value of the database column transfer.charge_no
     *
     * @return the value of transfer.charge_no
     *
     * @mbggenerated
     */
    public String getChargeNo() {
        return chargeNo;
    }

    /**
     * set the value of the database column transfer.charge_no
     *
     * @param chargeNo the value for transfer.charge_no
     *
     * @mbggenerated
     */
    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo == null ? null : chargeNo.trim();
    }

    /**
     * return the value of the database column transfer.control_type
     *
     * @return the value of transfer.control_type
     *
     * @mbggenerated
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * set the value of the database column transfer.control_type
     *
     * @param controlType the value for transfer.control_type
     *
     * @mbggenerated
     */
    public void setControlType(String controlType) {
        this.controlType = controlType == null ? null : controlType.trim();
    }

    /**
     * return the value of the database column transfer.currency
     *
     * @return the value of transfer.currency
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * set the value of the database column transfer.currency
     *
     * @param currency the value for transfer.currency
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * return the value of the database column transfer.delay_hours
     *
     * @return the value of transfer.delay_hours
     *
     * @mbggenerated
     */
    public Integer getDelayHours() {
        return delayHours;
    }

    /**
     * set the value of the database column transfer.delay_hours
     *
     * @param delayHours the value for transfer.delay_hours
     *
     * @mbggenerated
     */
    public void setDelayHours(Integer delayHours) {
        this.delayHours = delayHours;
    }

    /**
     * return the value of the database column transfer.fail_reason
     *
     * @return the value of transfer.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column transfer.fail_reason
     *
     * @param failReason the value for transfer.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column transfer.joint_account_no
     *
     * @return the value of transfer.joint_account_no
     *
     * @mbggenerated
     */
    public String getJointAccountNo() {
        return jointAccountNo;
    }

    /**
     * set the value of the database column transfer.joint_account_no
     *
     * @param jointAccountNo the value for transfer.joint_account_no
     *
     * @mbggenerated
     */
    public void setJointAccountNo(String jointAccountNo) {
        this.jointAccountNo = jointAccountNo == null ? null : jointAccountNo.trim();
    }

    /**
     * return the value of the database column transfer.joint_use_for
     *
     * @return the value of transfer.joint_use_for
     *
     * @mbggenerated
     */
    public String getJointUseFor() {
        return jointUseFor;
    }

    /**
     * set the value of the database column transfer.joint_use_for
     *
     * @param jointUseFor the value for transfer.joint_use_for
     *
     * @mbggenerated
     */
    public void setJointUseFor(String jointUseFor) {
        this.jointUseFor = jointUseFor == null ? null : jointUseFor.trim();
    }

    /**
     * return the value of the database column transfer.seller_card_no
     *
     * @return the value of transfer.seller_card_no
     *
     * @mbggenerated
     */
    public String getSellerCardNo() {
        return sellerCardNo;
    }

    /**
     * set the value of the database column transfer.seller_card_no
     *
     * @param sellerCardNo the value for transfer.seller_card_no
     *
     * @mbggenerated
     */
    public void setSellerCardNo(String sellerCardNo) {
        this.sellerCardNo = sellerCardNo == null ? null : sellerCardNo.trim();
    }

    /**
     * return the value of the database column transfer.seller_user_id
     *
     * @return the value of transfer.seller_user_id
     *
     * @mbggenerated
     */
    public String getSellerUserId() {
        return sellerUserId;
    }

    /**
     * set the value of the database column transfer.seller_user_id
     *
     * @param sellerUserId the value for transfer.seller_user_id
     *
     * @mbggenerated
     */
    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId == null ? null : sellerUserId.trim();
    }

    /**
     * return the value of the database column transfer.selller_account_no
     *
     * @return the value of transfer.selller_account_no
     *
     * @mbggenerated
     */
    public String getSelllerAccountNo() {
        return selllerAccountNo;
    }

    /**
     * set the value of the database column transfer.selller_account_no
     *
     * @param selllerAccountNo the value for transfer.selller_account_no
     *
     * @mbggenerated
     */
    public void setSelllerAccountNo(String selllerAccountNo) {
        this.selllerAccountNo = selllerAccountNo == null ? null : selllerAccountNo.trim();
    }

    /**
     * return the value of the database column transfer.transfer_no
     *
     * @return the value of transfer.transfer_no
     *
     * @mbggenerated
     */
    public String getTransferNo() {
        return transferNo;
    }

    /**
     * set the value of the database column transfer.transfer_no
     *
     * @param transferNo the value for transfer.transfer_no
     *
     * @mbggenerated
     */
    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo == null ? null : transferNo.trim();
    }

    /**
     * return the value of the database column transfer.joint_out_type
     *
     * @return the value of transfer.joint_out_type
     *
     * @mbggenerated
     */
    public String getJointOutType() {
        return jointOutType;
    }

    /**
     * set the value of the database column transfer.joint_out_type
     *
     * @param jointOutType the value for transfer.joint_out_type
     *
     * @mbggenerated
     */
    public void setJointOutType(String jointOutType) {
        this.jointOutType = jointOutType == null ? null : jointOutType.trim();
    }

    /**
     * return the value of the database column transfer.user_id
     *
     * @return the value of transfer.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column transfer.user_id
     *
     * @param userId the value for transfer.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column transfer.orgi_delay_hours
     *
     * @return the value of transfer.orgi_delay_hours
     *
     * @mbggenerated
     */
    public Integer getOrgiDelayHours() {
        return orgiDelayHours;
    }

    /**
     * set the value of the database column transfer.orgi_delay_hours
     *
     * @param orgiDelayHours the value for transfer.orgi_delay_hours
     *
     * @mbggenerated
     */
    public void setOrgiDelayHours(Integer orgiDelayHours) {
        this.orgiDelayHours = orgiDelayHours;
    }

    /**
     * return the value of the database column transfer.delay_hours_change_memo
     *
     * @return the value of transfer.delay_hours_change_memo
     *
     * @mbggenerated
     */
    public String getDelayHoursChangeMemo() {
        return delayHoursChangeMemo;
    }

    /**
     * set the value of the database column transfer.delay_hours_change_memo
     *
     * @param delayHoursChangeMemo the value for transfer.delay_hours_change_memo
     *
     * @mbggenerated
     */
    public void setDelayHoursChangeMemo(String delayHoursChangeMemo) {
        this.delayHoursChangeMemo = delayHoursChangeMemo == null ? null : delayHoursChangeMemo.trim();
    }

    /**
     * corresponds to the database table transfer
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
        sb.append(", merchOrderNo=").append(merchOrderNo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", productCode=").append(productCode);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", amount=").append(amount);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", chargeAmount=").append(chargeAmount);
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", controlType=").append(controlType);
        sb.append(", currency=").append(currency);
        sb.append(", delayHours=").append(delayHours);
        sb.append(", failReason=").append(failReason);
        sb.append(", jointAccountNo=").append(jointAccountNo);
        sb.append(", jointUseFor=").append(jointUseFor);
        sb.append(", sellerCardNo=").append(sellerCardNo);
        sb.append(", sellerUserId=").append(sellerUserId);
        sb.append(", selllerAccountNo=").append(selllerAccountNo);
        sb.append(", transferNo=").append(transferNo);
        sb.append(", jointOutType=").append(jointOutType);
        sb.append(", userId=").append(userId);
        sb.append(", orgiDelayHours=").append(orgiDelayHours);
        sb.append(", delayHoursChangeMemo=").append(delayHoursChangeMemo);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table transfer
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
        TransferDO other = (TransferDO) that;
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
            && (this.getMerchOrderNo() == null ? other.getMerchOrderNo() == null : this.getMerchOrderNo().equals(other.getMerchOrderNo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getAccountNo() == null ? other.getAccountNo() == null : this.getAccountNo().equals(other.getAccountNo()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBankAccountName() == null ? other.getBankAccountName() == null : this.getBankAccountName().equals(other.getBankAccountName()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getChargeAmount() == null ? other.getChargeAmount() == null : this.getChargeAmount().equals(other.getChargeAmount()))
            && (this.getChargeNo() == null ? other.getChargeNo() == null : this.getChargeNo().equals(other.getChargeNo()))
            && (this.getControlType() == null ? other.getControlType() == null : this.getControlType().equals(other.getControlType()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getDelayHours() == null ? other.getDelayHours() == null : this.getDelayHours().equals(other.getDelayHours()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getJointAccountNo() == null ? other.getJointAccountNo() == null : this.getJointAccountNo().equals(other.getJointAccountNo()))
            && (this.getJointUseFor() == null ? other.getJointUseFor() == null : this.getJointUseFor().equals(other.getJointUseFor()))
            && (this.getSellerCardNo() == null ? other.getSellerCardNo() == null : this.getSellerCardNo().equals(other.getSellerCardNo()))
            && (this.getSellerUserId() == null ? other.getSellerUserId() == null : this.getSellerUserId().equals(other.getSellerUserId()))
            && (this.getSelllerAccountNo() == null ? other.getSelllerAccountNo() == null : this.getSelllerAccountNo().equals(other.getSelllerAccountNo()))
            && (this.getTransferNo() == null ? other.getTransferNo() == null : this.getTransferNo().equals(other.getTransferNo()))
            && (this.getJointOutType() == null ? other.getJointOutType() == null : this.getJointOutType().equals(other.getJointOutType()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrgiDelayHours() == null ? other.getOrgiDelayHours() == null : this.getOrgiDelayHours().equals(other.getOrgiDelayHours()))
            && (this.getDelayHoursChangeMemo() == null ? other.getDelayHoursChangeMemo() == null : this.getDelayHoursChangeMemo().equals(other.getDelayHoursChangeMemo()));
    }

    /**
     * corresponds to the database table transfer
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
        result = prime * result + ((getMerchOrderNo() == null) ? 0 : getMerchOrderNo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getAccountNo() == null) ? 0 : getAccountNo().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBankAccountName() == null) ? 0 : getBankAccountName().hashCode());
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getChargeAmount() == null) ? 0 : getChargeAmount().hashCode());
        result = prime * result + ((getChargeNo() == null) ? 0 : getChargeNo().hashCode());
        result = prime * result + ((getControlType() == null) ? 0 : getControlType().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getDelayHours() == null) ? 0 : getDelayHours().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getJointAccountNo() == null) ? 0 : getJointAccountNo().hashCode());
        result = prime * result + ((getJointUseFor() == null) ? 0 : getJointUseFor().hashCode());
        result = prime * result + ((getSellerCardNo() == null) ? 0 : getSellerCardNo().hashCode());
        result = prime * result + ((getSellerUserId() == null) ? 0 : getSellerUserId().hashCode());
        result = prime * result + ((getSelllerAccountNo() == null) ? 0 : getSelllerAccountNo().hashCode());
        result = prime * result + ((getTransferNo() == null) ? 0 : getTransferNo().hashCode());
        result = prime * result + ((getJointOutType() == null) ? 0 : getJointOutType().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrgiDelayHours() == null) ? 0 : getOrgiDelayHours().hashCode());
        result = prime * result + ((getDelayHoursChangeMemo() == null) ? 0 : getDelayHoursChangeMemo().hashCode());
        return result;
    }
}