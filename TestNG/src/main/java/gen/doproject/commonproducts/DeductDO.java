/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename DeductDO.java
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

public class DeductDO implements Serializable {
    /**
     * corresponds to the database column deduct.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column deduct.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column deduct.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column deduct.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column deduct.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column deduct.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column deduct.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column deduct.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column deduct.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column deduct.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column deduct.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column deduct.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column deduct.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column deduct.amount
     *
     * @mbggenerated
     */
    private Money amount;

    /**
     * corresponds to the database column deduct.bank_account_name
     *
     * @mbggenerated
     */
    private String bankAccountName;

    /**
     * corresponds to the database column deduct.bank_account_no
     *
     * @mbggenerated
     */
    private String bankAccountNo;

    /**
     * corresponds to the database column deduct.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column deduct.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column deduct.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * corresponds to the database column deduct.cert_no
     *
     * @mbggenerated
     */
    private String certNo;

    /**
     * corresponds to the database column deduct.cert_type
     *
     * @mbggenerated
     */
    private String certType;

    /**
     * corresponds to the database column deduct.charge_amount
     *
     * @mbggenerated
     */
    private Money chargeAmount;

    /**
     * corresponds to the database column deduct.charge_no
     *
     * @mbggenerated
     */
    private String chargeNo;

    /**
     * corresponds to the database column deduct.currency
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * corresponds to the database column deduct.deduct_amount
     *
     * @mbggenerated
     */
    private Money deductAmount;

    /**
     * corresponds to the database column deduct.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column deduct.pay_no
     *
     * @mbggenerated
     */
    private String payNo;

    /**
     * corresponds to the database column deduct.sign_no
     *
     * @mbggenerated
     */
    private String signNo;

    /**
     * corresponds to the database column deduct.user_acc_no
     *
     * @mbggenerated
     */
    private String userAccNo;

    /**
     * corresponds to the database column deduct.user_card_no
     *
     * @mbggenerated
     */
    private String userCardNo;

    /**
     * corresponds to the database column deduct.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column deduct.biz_no
     *
     * @return the value of deduct.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column deduct.biz_no
     *
     * @param bizNo the value for deduct.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column deduct.raw_add_time
     *
     * @return the value of deduct.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column deduct.raw_add_time
     *
     * @param rawAddTime the value for deduct.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column deduct.raw_update_time
     *
     * @return the value of deduct.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column deduct.raw_update_time
     *
     * @param rawUpdateTime the value for deduct.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column deduct.gid
     *
     * @return the value of deduct.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column deduct.gid
     *
     * @param gid the value for deduct.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column deduct.inlet
     *
     * @return the value of deduct.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column deduct.inlet
     *
     * @param inlet the value for deduct.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column deduct.memo
     *
     * @return the value of deduct.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column deduct.memo
     *
     * @param memo the value for deduct.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column deduct.merchant_acc_no
     *
     * @return the value of deduct.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column deduct.merchant_acc_no
     *
     * @param merchantAccNo the value for deduct.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column deduct.merchant_card_no
     *
     * @return the value of deduct.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column deduct.merchant_card_no
     *
     * @param merchantCardNo the value for deduct.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column deduct.merchant_order_no
     *
     * @return the value of deduct.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column deduct.merchant_order_no
     *
     * @param merchantOrderNo the value for deduct.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column deduct.merch_order_no
     *
     * @return the value of deduct.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column deduct.merch_order_no
     *
     * @param merchOrderNo the value for deduct.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column deduct.merchant_user_id
     *
     * @return the value of deduct.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column deduct.merchant_user_id
     *
     * @param merchantUserId the value for deduct.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column deduct.product_code
     *
     * @return the value of deduct.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column deduct.product_code
     *
     * @param productCode the value for deduct.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column deduct.product_status
     *
     * @return the value of deduct.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column deduct.product_status
     *
     * @param productStatus the value for deduct.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column deduct.amount
     *
     * @return the value of deduct.amount
     *
     * @mbggenerated
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * set the value of the database column deduct.amount
     *
     * @param amount the value for deduct.amount
     *
     * @mbggenerated
     */
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * return the value of the database column deduct.bank_account_name
     *
     * @return the value of deduct.bank_account_name
     *
     * @mbggenerated
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * set the value of the database column deduct.bank_account_name
     *
     * @param bankAccountName the value for deduct.bank_account_name
     *
     * @mbggenerated
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    /**
     * return the value of the database column deduct.bank_account_no
     *
     * @return the value of deduct.bank_account_no
     *
     * @mbggenerated
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * set the value of the database column deduct.bank_account_no
     *
     * @param bankAccountNo the value for deduct.bank_account_no
     *
     * @mbggenerated
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * return the value of the database column deduct.sec_index
     *
     * @return the value of deduct.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column deduct.sec_index
     *
     * @param secIndex the value for deduct.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column deduct.bank_code
     *
     * @return the value of deduct.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column deduct.bank_code
     *
     * @param bankCode the value for deduct.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column deduct.bank_name
     *
     * @return the value of deduct.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set the value of the database column deduct.bank_name
     *
     * @param bankName the value for deduct.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * return the value of the database column deduct.cert_no
     *
     * @return the value of deduct.cert_no
     *
     * @mbggenerated
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * set the value of the database column deduct.cert_no
     *
     * @param certNo the value for deduct.cert_no
     *
     * @mbggenerated
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * return the value of the database column deduct.cert_type
     *
     * @return the value of deduct.cert_type
     *
     * @mbggenerated
     */
    public String getCertType() {
        return certType;
    }

    /**
     * set the value of the database column deduct.cert_type
     *
     * @param certType the value for deduct.cert_type
     *
     * @mbggenerated
     */
    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    /**
     * return the value of the database column deduct.charge_amount
     *
     * @return the value of deduct.charge_amount
     *
     * @mbggenerated
     */
    public Money getChargeAmount() {
        return chargeAmount;
    }

    /**
     * set the value of the database column deduct.charge_amount
     *
     * @param chargeAmount the value for deduct.charge_amount
     *
     * @mbggenerated
     */
    public void setChargeAmount(Money chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * return the value of the database column deduct.charge_no
     *
     * @return the value of deduct.charge_no
     *
     * @mbggenerated
     */
    public String getChargeNo() {
        return chargeNo;
    }

    /**
     * set the value of the database column deduct.charge_no
     *
     * @param chargeNo the value for deduct.charge_no
     *
     * @mbggenerated
     */
    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo == null ? null : chargeNo.trim();
    }

    /**
     * return the value of the database column deduct.currency
     *
     * @return the value of deduct.currency
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * set the value of the database column deduct.currency
     *
     * @param currency the value for deduct.currency
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * return the value of the database column deduct.deduct_amount
     *
     * @return the value of deduct.deduct_amount
     *
     * @mbggenerated
     */
    public Money getDeductAmount() {
        return deductAmount;
    }

    /**
     * set the value of the database column deduct.deduct_amount
     *
     * @param deductAmount the value for deduct.deduct_amount
     *
     * @mbggenerated
     */
    public void setDeductAmount(Money deductAmount) {
        this.deductAmount = deductAmount;
    }

    /**
     * return the value of the database column deduct.fail_reason
     *
     * @return the value of deduct.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column deduct.fail_reason
     *
     * @param failReason the value for deduct.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column deduct.pay_no
     *
     * @return the value of deduct.pay_no
     *
     * @mbggenerated
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * set the value of the database column deduct.pay_no
     *
     * @param payNo the value for deduct.pay_no
     *
     * @mbggenerated
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    /**
     * return the value of the database column deduct.sign_no
     *
     * @return the value of deduct.sign_no
     *
     * @mbggenerated
     */
    public String getSignNo() {
        return signNo;
    }

    /**
     * set the value of the database column deduct.sign_no
     *
     * @param signNo the value for deduct.sign_no
     *
     * @mbggenerated
     */
    public void setSignNo(String signNo) {
        this.signNo = signNo == null ? null : signNo.trim();
    }

    /**
     * return the value of the database column deduct.user_acc_no
     *
     * @return the value of deduct.user_acc_no
     *
     * @mbggenerated
     */
    public String getUserAccNo() {
        return userAccNo;
    }

    /**
     * set the value of the database column deduct.user_acc_no
     *
     * @param userAccNo the value for deduct.user_acc_no
     *
     * @mbggenerated
     */
    public void setUserAccNo(String userAccNo) {
        this.userAccNo = userAccNo == null ? null : userAccNo.trim();
    }

    /**
     * return the value of the database column deduct.user_card_no
     *
     * @return the value of deduct.user_card_no
     *
     * @mbggenerated
     */
    public String getUserCardNo() {
        return userCardNo;
    }

    /**
     * set the value of the database column deduct.user_card_no
     *
     * @param userCardNo the value for deduct.user_card_no
     *
     * @mbggenerated
     */
    public void setUserCardNo(String userCardNo) {
        this.userCardNo = userCardNo == null ? null : userCardNo.trim();
    }

    /**
     * return the value of the database column deduct.user_id
     *
     * @return the value of deduct.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column deduct.user_id
     *
     * @param userId the value for deduct.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * corresponds to the database table deduct
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
        sb.append(", amount=").append(amount);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", certNo=").append(certNo);
        sb.append(", certType=").append(certType);
        sb.append(", chargeAmount=").append(chargeAmount);
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", currency=").append(currency);
        sb.append(", deductAmount=").append(deductAmount);
        sb.append(", failReason=").append(failReason);
        sb.append(", payNo=").append(payNo);
        sb.append(", signNo=").append(signNo);
        sb.append(", userAccNo=").append(userAccNo);
        sb.append(", userCardNo=").append(userCardNo);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table deduct
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
        DeductDO other = (DeductDO) that;
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
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBankAccountName() == null ? other.getBankAccountName() == null : this.getBankAccountName().equals(other.getBankAccountName()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getCertType() == null ? other.getCertType() == null : this.getCertType().equals(other.getCertType()))
            && (this.getChargeAmount() == null ? other.getChargeAmount() == null : this.getChargeAmount().equals(other.getChargeAmount()))
            && (this.getChargeNo() == null ? other.getChargeNo() == null : this.getChargeNo().equals(other.getChargeNo()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getDeductAmount() == null ? other.getDeductAmount() == null : this.getDeductAmount().equals(other.getDeductAmount()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getPayNo() == null ? other.getPayNo() == null : this.getPayNo().equals(other.getPayNo()))
            && (this.getSignNo() == null ? other.getSignNo() == null : this.getSignNo().equals(other.getSignNo()))
            && (this.getUserAccNo() == null ? other.getUserAccNo() == null : this.getUserAccNo().equals(other.getUserAccNo()))
            && (this.getUserCardNo() == null ? other.getUserCardNo() == null : this.getUserCardNo().equals(other.getUserCardNo()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * corresponds to the database table deduct
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
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBankAccountName() == null) ? 0 : getBankAccountName().hashCode());
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getCertType() == null) ? 0 : getCertType().hashCode());
        result = prime * result + ((getChargeAmount() == null) ? 0 : getChargeAmount().hashCode());
        result = prime * result + ((getChargeNo() == null) ? 0 : getChargeNo().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getDeductAmount() == null) ? 0 : getDeductAmount().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getPayNo() == null) ? 0 : getPayNo().hashCode());
        result = prime * result + ((getSignNo() == null) ? 0 : getSignNo().hashCode());
        result = prime * result + ((getUserAccNo() == null) ? 0 : getUserAccNo().hashCode());
        result = prime * result + ((getUserCardNo() == null) ? 0 : getUserCardNo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}