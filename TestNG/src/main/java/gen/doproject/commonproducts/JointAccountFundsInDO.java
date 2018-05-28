/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointAccountFundsInDO.java
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

public class JointAccountFundsInDO implements Serializable {
    /**
     * corresponds to the database column joint_account_funds_in.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column joint_account_funds_in.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column joint_account_funds_in.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column joint_account_funds_in.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column joint_account_funds_in.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column joint_account_funds_in.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column joint_account_funds_in.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column joint_account_funds_in.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column joint_account_funds_in.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column joint_account_funds_in.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column joint_account_funds_in.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column joint_account_funds_in.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column joint_account_funds_in.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column joint_account_funds_in.amount
     *
     * @mbggenerated
     */
    private Money amount;

    /**
     * corresponds to the database column joint_account_funds_in.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column joint_account_funds_in.bank_serial_no
     *
     * @mbggenerated
     */
    private String bankSerialNo;

    /**
     * corresponds to the database column joint_account_funds_in.deposit_id
     *
     * @mbggenerated
     */
    private String depositId;

    /**
     * corresponds to the database column joint_account_funds_in.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * corresponds to the database column joint_account_funds_in.direction
     *
     * @mbggenerated
     */
    private String direction;

    /**
     * corresponds to the database column joint_account_funds_in.joint_account_bank_code
     *
     * @mbggenerated
     */
    private String jointAccountBankCode;

    /**
     * corresponds to the database column joint_account_funds_in.joint_account_bank_ibkn
     *
     * @mbggenerated
     */
    private String jointAccountBankIbkn;

    /**
     * corresponds to the database column joint_account_funds_in.joint_account_name
     *
     * @mbggenerated
     */
    private String jointAccountName;

    /**
     * corresponds to the database column joint_account_funds_in.notify_url
     *
     * @mbggenerated
     */
    private String notifyUrl;

    /**
     * corresponds to the database column joint_account_funds_in.operation
     *
     * @mbggenerated
     */
    private String operation;

    /**
     * corresponds to the database column joint_account_funds_in.payer_bank_account_no
     *
     * @mbggenerated
     */
    private String payerBankAccountNo;

    /**
     * corresponds to the database column joint_account_funds_in.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column joint_account_funds_in.payer_bank_name
     *
     * @mbggenerated
     */
    private String payerBankName;

    /**
     * corresponds to the database column joint_account_funds_in.payer_bank_swift_code
     *
     * @mbggenerated
     */
    private String payerBankSwiftCode;

    /**
     * corresponds to the database column joint_account_funds_in.payer_name
     *
     * @mbggenerated
     */
    private String payerName;

    /**
     * corresponds to the database column joint_account_funds_in.sublayer_order_no
     *
     * @mbggenerated
     */
    private String sublayerOrderNo;

    /**
     * corresponds to the database column joint_account_funds_in.trans_date
     *
     * @mbggenerated
     */
    private Date transDate;

    /**
     * corresponds to the database column joint_account_funds_in.joint_account_no
     *
     * @mbggenerated
     */
    private Long jointAccountNo;

    /**
     * corresponds to the database column joint_account_funds_in.is_freeze
     *
     * @mbggenerated
     */
    private Integer isFreeze;

    /**
     * corresponds to the database column joint_account_funds_in.busi_date
     *
     * @mbggenerated
     */
    private Date busiDate;

    /**
     * corresponds to the database column joint_account_funds_in.joint_account_bank_name
     *
     * @mbggenerated
     */
    private String jointAccountBankName;

    /**
     * corresponds to the database column joint_account_funds_in.use_info
     *
     * @mbggenerated
     */
    private String useInfo;

    /**
     * corresponds to the database column joint_account_funds_in.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * corresponds to the database column joint_account_funds_in.acsref
     *
     * @mbggenerated
     */
    private String acsref;

    /**
     * corresponds to the database column joint_account_funds_in.remit_postscript
     *
     * @mbggenerated
     */
    private String remitPostscript;

    /**
     * corresponds to the database column joint_account_funds_in.payer_bank_code
     *
     * @mbggenerated
     */
    private String payerBankCode;

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column joint_account_funds_in.biz_no
     *
     * @return the value of joint_account_funds_in.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column joint_account_funds_in.biz_no
     *
     * @param bizNo the value for joint_account_funds_in.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.raw_add_time
     *
     * @return the value of joint_account_funds_in.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column joint_account_funds_in.raw_add_time
     *
     * @param rawAddTime the value for joint_account_funds_in.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column joint_account_funds_in.raw_update_time
     *
     * @return the value of joint_account_funds_in.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column joint_account_funds_in.raw_update_time
     *
     * @param rawUpdateTime the value for joint_account_funds_in.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column joint_account_funds_in.gid
     *
     * @return the value of joint_account_funds_in.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column joint_account_funds_in.gid
     *
     * @param gid the value for joint_account_funds_in.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.inlet
     *
     * @return the value of joint_account_funds_in.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column joint_account_funds_in.inlet
     *
     * @param inlet the value for joint_account_funds_in.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.memo
     *
     * @return the value of joint_account_funds_in.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column joint_account_funds_in.memo
     *
     * @param memo the value for joint_account_funds_in.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.merchant_acc_no
     *
     * @return the value of joint_account_funds_in.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column joint_account_funds_in.merchant_acc_no
     *
     * @param merchantAccNo the value for joint_account_funds_in.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.merchant_card_no
     *
     * @return the value of joint_account_funds_in.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column joint_account_funds_in.merchant_card_no
     *
     * @param merchantCardNo the value for joint_account_funds_in.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.merchant_order_no
     *
     * @return the value of joint_account_funds_in.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column joint_account_funds_in.merchant_order_no
     *
     * @param merchantOrderNo the value for joint_account_funds_in.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.merch_order_no
     *
     * @return the value of joint_account_funds_in.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column joint_account_funds_in.merch_order_no
     *
     * @param merchOrderNo the value for joint_account_funds_in.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.merchant_user_id
     *
     * @return the value of joint_account_funds_in.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column joint_account_funds_in.merchant_user_id
     *
     * @param merchantUserId the value for joint_account_funds_in.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.product_code
     *
     * @return the value of joint_account_funds_in.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column joint_account_funds_in.product_code
     *
     * @param productCode the value for joint_account_funds_in.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.product_status
     *
     * @return the value of joint_account_funds_in.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column joint_account_funds_in.product_status
     *
     * @param productStatus the value for joint_account_funds_in.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.amount
     *
     * @return the value of joint_account_funds_in.amount
     *
     * @mbggenerated
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * set the value of the database column joint_account_funds_in.amount
     *
     * @param amount the value for joint_account_funds_in.amount
     *
     * @mbggenerated
     */
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * return the value of the database column joint_account_funds_in.bank_code
     *
     * @return the value of joint_account_funds_in.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column joint_account_funds_in.bank_code
     *
     * @param bankCode the value for joint_account_funds_in.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.bank_serial_no
     *
     * @return the value of joint_account_funds_in.bank_serial_no
     *
     * @mbggenerated
     */
    public String getBankSerialNo() {
        return bankSerialNo;
    }

    /**
     * set the value of the database column joint_account_funds_in.bank_serial_no
     *
     * @param bankSerialNo the value for joint_account_funds_in.bank_serial_no
     *
     * @mbggenerated
     */
    public void setBankSerialNo(String bankSerialNo) {
        this.bankSerialNo = bankSerialNo == null ? null : bankSerialNo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.deposit_id
     *
     * @return the value of joint_account_funds_in.deposit_id
     *
     * @mbggenerated
     */
    public String getDepositId() {
        return depositId;
    }

    /**
     * set the value of the database column joint_account_funds_in.deposit_id
     *
     * @param depositId the value for joint_account_funds_in.deposit_id
     *
     * @mbggenerated
     */
    public void setDepositId(String depositId) {
        this.depositId = depositId == null ? null : depositId.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.description
     *
     * @return the value of joint_account_funds_in.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * set the value of the database column joint_account_funds_in.description
     *
     * @param description the value for joint_account_funds_in.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.direction
     *
     * @return the value of joint_account_funds_in.direction
     *
     * @mbggenerated
     */
    public String getDirection() {
        return direction;
    }

    /**
     * set the value of the database column joint_account_funds_in.direction
     *
     * @param direction the value for joint_account_funds_in.direction
     *
     * @mbggenerated
     */
    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.joint_account_bank_code
     *
     * @return the value of joint_account_funds_in.joint_account_bank_code
     *
     * @mbggenerated
     */
    public String getJointAccountBankCode() {
        return jointAccountBankCode;
    }

    /**
     * set the value of the database column joint_account_funds_in.joint_account_bank_code
     *
     * @param jointAccountBankCode the value for joint_account_funds_in.joint_account_bank_code
     *
     * @mbggenerated
     */
    public void setJointAccountBankCode(String jointAccountBankCode) {
        this.jointAccountBankCode = jointAccountBankCode == null ? null : jointAccountBankCode.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.joint_account_bank_ibkn
     *
     * @return the value of joint_account_funds_in.joint_account_bank_ibkn
     *
     * @mbggenerated
     */
    public String getJointAccountBankIbkn() {
        return jointAccountBankIbkn;
    }

    /**
     * set the value of the database column joint_account_funds_in.joint_account_bank_ibkn
     *
     * @param jointAccountBankIbkn the value for joint_account_funds_in.joint_account_bank_ibkn
     *
     * @mbggenerated
     */
    public void setJointAccountBankIbkn(String jointAccountBankIbkn) {
        this.jointAccountBankIbkn = jointAccountBankIbkn == null ? null : jointAccountBankIbkn.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.joint_account_name
     *
     * @return the value of joint_account_funds_in.joint_account_name
     *
     * @mbggenerated
     */
    public String getJointAccountName() {
        return jointAccountName;
    }

    /**
     * set the value of the database column joint_account_funds_in.joint_account_name
     *
     * @param jointAccountName the value for joint_account_funds_in.joint_account_name
     *
     * @mbggenerated
     */
    public void setJointAccountName(String jointAccountName) {
        this.jointAccountName = jointAccountName == null ? null : jointAccountName.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.notify_url
     *
     * @return the value of joint_account_funds_in.notify_url
     *
     * @mbggenerated
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * set the value of the database column joint_account_funds_in.notify_url
     *
     * @param notifyUrl the value for joint_account_funds_in.notify_url
     *
     * @mbggenerated
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.operation
     *
     * @return the value of joint_account_funds_in.operation
     *
     * @mbggenerated
     */
    public String getOperation() {
        return operation;
    }

    /**
     * set the value of the database column joint_account_funds_in.operation
     *
     * @param operation the value for joint_account_funds_in.operation
     *
     * @mbggenerated
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.payer_bank_account_no
     *
     * @return the value of joint_account_funds_in.payer_bank_account_no
     *
     * @mbggenerated
     */
    public String getPayerBankAccountNo() {
        return payerBankAccountNo;
    }

    /**
     * set the value of the database column joint_account_funds_in.payer_bank_account_no
     *
     * @param payerBankAccountNo the value for joint_account_funds_in.payer_bank_account_no
     *
     * @mbggenerated
     */
    public void setPayerBankAccountNo(String payerBankAccountNo) {
        this.payerBankAccountNo = payerBankAccountNo == null ? null : payerBankAccountNo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.sec_index
     *
     * @return the value of joint_account_funds_in.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column joint_account_funds_in.sec_index
     *
     * @param secIndex the value for joint_account_funds_in.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.payer_bank_name
     *
     * @return the value of joint_account_funds_in.payer_bank_name
     *
     * @mbggenerated
     */
    public String getPayerBankName() {
        return payerBankName;
    }

    /**
     * set the value of the database column joint_account_funds_in.payer_bank_name
     *
     * @param payerBankName the value for joint_account_funds_in.payer_bank_name
     *
     * @mbggenerated
     */
    public void setPayerBankName(String payerBankName) {
        this.payerBankName = payerBankName == null ? null : payerBankName.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.payer_bank_swift_code
     *
     * @return the value of joint_account_funds_in.payer_bank_swift_code
     *
     * @mbggenerated
     */
    public String getPayerBankSwiftCode() {
        return payerBankSwiftCode;
    }

    /**
     * set the value of the database column joint_account_funds_in.payer_bank_swift_code
     *
     * @param payerBankSwiftCode the value for joint_account_funds_in.payer_bank_swift_code
     *
     * @mbggenerated
     */
    public void setPayerBankSwiftCode(String payerBankSwiftCode) {
        this.payerBankSwiftCode = payerBankSwiftCode == null ? null : payerBankSwiftCode.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.payer_name
     *
     * @return the value of joint_account_funds_in.payer_name
     *
     * @mbggenerated
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * set the value of the database column joint_account_funds_in.payer_name
     *
     * @param payerName the value for joint_account_funds_in.payer_name
     *
     * @mbggenerated
     */
    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.sublayer_order_no
     *
     * @return the value of joint_account_funds_in.sublayer_order_no
     *
     * @mbggenerated
     */
    public String getSublayerOrderNo() {
        return sublayerOrderNo;
    }

    /**
     * set the value of the database column joint_account_funds_in.sublayer_order_no
     *
     * @param sublayerOrderNo the value for joint_account_funds_in.sublayer_order_no
     *
     * @mbggenerated
     */
    public void setSublayerOrderNo(String sublayerOrderNo) {
        this.sublayerOrderNo = sublayerOrderNo == null ? null : sublayerOrderNo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.trans_date
     *
     * @return the value of joint_account_funds_in.trans_date
     *
     * @mbggenerated
     */
    public Date getTransDate() {
        return transDate;
    }

    /**
     * set the value of the database column joint_account_funds_in.trans_date
     *
     * @param transDate the value for joint_account_funds_in.trans_date
     *
     * @mbggenerated
     */
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    /**
     * return the value of the database column joint_account_funds_in.joint_account_no
     *
     * @return the value of joint_account_funds_in.joint_account_no
     *
     * @mbggenerated
     */
    public Long getJointAccountNo() {
        return jointAccountNo;
    }

    /**
     * set the value of the database column joint_account_funds_in.joint_account_no
     *
     * @param jointAccountNo the value for joint_account_funds_in.joint_account_no
     *
     * @mbggenerated
     */
    public void setJointAccountNo(Long jointAccountNo) {
        this.jointAccountNo = jointAccountNo;
    }

    /**
     * return the value of the database column joint_account_funds_in.is_freeze
     *
     * @return the value of joint_account_funds_in.is_freeze
     *
     * @mbggenerated
     */
    public Integer getIsFreeze() {
        return isFreeze;
    }

    /**
     * set the value of the database column joint_account_funds_in.is_freeze
     *
     * @param isFreeze the value for joint_account_funds_in.is_freeze
     *
     * @mbggenerated
     */
    public void setIsFreeze(Integer isFreeze) {
        this.isFreeze = isFreeze;
    }

    /**
     * return the value of the database column joint_account_funds_in.busi_date
     *
     * @return the value of joint_account_funds_in.busi_date
     *
     * @mbggenerated
     */
    public Date getBusiDate() {
        return busiDate;
    }

    /**
     * set the value of the database column joint_account_funds_in.busi_date
     *
     * @param busiDate the value for joint_account_funds_in.busi_date
     *
     * @mbggenerated
     */
    public void setBusiDate(Date busiDate) {
        this.busiDate = busiDate;
    }

    /**
     * return the value of the database column joint_account_funds_in.joint_account_bank_name
     *
     * @return the value of joint_account_funds_in.joint_account_bank_name
     *
     * @mbggenerated
     */
    public String getJointAccountBankName() {
        return jointAccountBankName;
    }

    /**
     * set the value of the database column joint_account_funds_in.joint_account_bank_name
     *
     * @param jointAccountBankName the value for joint_account_funds_in.joint_account_bank_name
     *
     * @mbggenerated
     */
    public void setJointAccountBankName(String jointAccountBankName) {
        this.jointAccountBankName = jointAccountBankName == null ? null : jointAccountBankName.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.use_info
     *
     * @return the value of joint_account_funds_in.use_info
     *
     * @mbggenerated
     */
    public String getUseInfo() {
        return useInfo;
    }

    /**
     * set the value of the database column joint_account_funds_in.use_info
     *
     * @param useInfo the value for joint_account_funds_in.use_info
     *
     * @mbggenerated
     */
    public void setUseInfo(String useInfo) {
        this.useInfo = useInfo == null ? null : useInfo.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.remark
     *
     * @return the value of joint_account_funds_in.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set the value of the database column joint_account_funds_in.remark
     *
     * @param remark the value for joint_account_funds_in.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.acsref
     *
     * @return the value of joint_account_funds_in.acsref
     *
     * @mbggenerated
     */
    public String getAcsref() {
        return acsref;
    }

    /**
     * set the value of the database column joint_account_funds_in.acsref
     *
     * @param acsref the value for joint_account_funds_in.acsref
     *
     * @mbggenerated
     */
    public void setAcsref(String acsref) {
        this.acsref = acsref == null ? null : acsref.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.remit_postscript
     *
     * @return the value of joint_account_funds_in.remit_postscript
     *
     * @mbggenerated
     */
    public String getRemitPostscript() {
        return remitPostscript;
    }

    /**
     * set the value of the database column joint_account_funds_in.remit_postscript
     *
     * @param remitPostscript the value for joint_account_funds_in.remit_postscript
     *
     * @mbggenerated
     */
    public void setRemitPostscript(String remitPostscript) {
        this.remitPostscript = remitPostscript == null ? null : remitPostscript.trim();
    }

    /**
     * return the value of the database column joint_account_funds_in.payer_bank_code
     *
     * @return the value of joint_account_funds_in.payer_bank_code
     *
     * @mbggenerated
     */
    public String getPayerBankCode() {
        return payerBankCode;
    }

    /**
     * set the value of the database column joint_account_funds_in.payer_bank_code
     *
     * @param payerBankCode the value for joint_account_funds_in.payer_bank_code
     *
     * @mbggenerated
     */
    public void setPayerBankCode(String payerBankCode) {
        this.payerBankCode = payerBankCode == null ? null : payerBankCode.trim();
    }

    /**
     * corresponds to the database table joint_account_funds_in
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
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankSerialNo=").append(bankSerialNo);
        sb.append(", depositId=").append(depositId);
        sb.append(", description=").append(description);
        sb.append(", direction=").append(direction);
        sb.append(", jointAccountBankCode=").append(jointAccountBankCode);
        sb.append(", jointAccountBankIbkn=").append(jointAccountBankIbkn);
        sb.append(", jointAccountName=").append(jointAccountName);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", operation=").append(operation);
        sb.append(", payerBankAccountNo=").append(payerBankAccountNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", payerBankName=").append(payerBankName);
        sb.append(", payerBankSwiftCode=").append(payerBankSwiftCode);
        sb.append(", payerName=").append(payerName);
        sb.append(", sublayerOrderNo=").append(sublayerOrderNo);
        sb.append(", transDate=").append(transDate);
        sb.append(", jointAccountNo=").append(jointAccountNo);
        sb.append(", isFreeze=").append(isFreeze);
        sb.append(", busiDate=").append(busiDate);
        sb.append(", jointAccountBankName=").append(jointAccountBankName);
        sb.append(", useInfo=").append(useInfo);
        sb.append(", remark=").append(remark);
        sb.append(", acsref=").append(acsref);
        sb.append(", remitPostscript=").append(remitPostscript);
        sb.append(", payerBankCode=").append(payerBankCode);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table joint_account_funds_in
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
        JointAccountFundsInDO other = (JointAccountFundsInDO) that;
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
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankSerialNo() == null ? other.getBankSerialNo() == null : this.getBankSerialNo().equals(other.getBankSerialNo()))
            && (this.getDepositId() == null ? other.getDepositId() == null : this.getDepositId().equals(other.getDepositId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()))
            && (this.getJointAccountBankCode() == null ? other.getJointAccountBankCode() == null : this.getJointAccountBankCode().equals(other.getJointAccountBankCode()))
            && (this.getJointAccountBankIbkn() == null ? other.getJointAccountBankIbkn() == null : this.getJointAccountBankIbkn().equals(other.getJointAccountBankIbkn()))
            && (this.getJointAccountName() == null ? other.getJointAccountName() == null : this.getJointAccountName().equals(other.getJointAccountName()))
            && (this.getNotifyUrl() == null ? other.getNotifyUrl() == null : this.getNotifyUrl().equals(other.getNotifyUrl()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()))
            && (this.getPayerBankAccountNo() == null ? other.getPayerBankAccountNo() == null : this.getPayerBankAccountNo().equals(other.getPayerBankAccountNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getPayerBankName() == null ? other.getPayerBankName() == null : this.getPayerBankName().equals(other.getPayerBankName()))
            && (this.getPayerBankSwiftCode() == null ? other.getPayerBankSwiftCode() == null : this.getPayerBankSwiftCode().equals(other.getPayerBankSwiftCode()))
            && (this.getPayerName() == null ? other.getPayerName() == null : this.getPayerName().equals(other.getPayerName()))
            && (this.getSublayerOrderNo() == null ? other.getSublayerOrderNo() == null : this.getSublayerOrderNo().equals(other.getSublayerOrderNo()))
            && (this.getTransDate() == null ? other.getTransDate() == null : this.getTransDate().equals(other.getTransDate()))
            && (this.getJointAccountNo() == null ? other.getJointAccountNo() == null : this.getJointAccountNo().equals(other.getJointAccountNo()))
            && (this.getIsFreeze() == null ? other.getIsFreeze() == null : this.getIsFreeze().equals(other.getIsFreeze()))
            && (this.getBusiDate() == null ? other.getBusiDate() == null : this.getBusiDate().equals(other.getBusiDate()))
            && (this.getJointAccountBankName() == null ? other.getJointAccountBankName() == null : this.getJointAccountBankName().equals(other.getJointAccountBankName()))
            && (this.getUseInfo() == null ? other.getUseInfo() == null : this.getUseInfo().equals(other.getUseInfo()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAcsref() == null ? other.getAcsref() == null : this.getAcsref().equals(other.getAcsref()))
            && (this.getRemitPostscript() == null ? other.getRemitPostscript() == null : this.getRemitPostscript().equals(other.getRemitPostscript()))
            && (this.getPayerBankCode() == null ? other.getPayerBankCode() == null : this.getPayerBankCode().equals(other.getPayerBankCode()));
    }

    /**
     * corresponds to the database table joint_account_funds_in
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
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankSerialNo() == null) ? 0 : getBankSerialNo().hashCode());
        result = prime * result + ((getDepositId() == null) ? 0 : getDepositId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        result = prime * result + ((getJointAccountBankCode() == null) ? 0 : getJointAccountBankCode().hashCode());
        result = prime * result + ((getJointAccountBankIbkn() == null) ? 0 : getJointAccountBankIbkn().hashCode());
        result = prime * result + ((getJointAccountName() == null) ? 0 : getJointAccountName().hashCode());
        result = prime * result + ((getNotifyUrl() == null) ? 0 : getNotifyUrl().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        result = prime * result + ((getPayerBankAccountNo() == null) ? 0 : getPayerBankAccountNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getPayerBankName() == null) ? 0 : getPayerBankName().hashCode());
        result = prime * result + ((getPayerBankSwiftCode() == null) ? 0 : getPayerBankSwiftCode().hashCode());
        result = prime * result + ((getPayerName() == null) ? 0 : getPayerName().hashCode());
        result = prime * result + ((getSublayerOrderNo() == null) ? 0 : getSublayerOrderNo().hashCode());
        result = prime * result + ((getTransDate() == null) ? 0 : getTransDate().hashCode());
        result = prime * result + ((getJointAccountNo() == null) ? 0 : getJointAccountNo().hashCode());
        result = prime * result + ((getIsFreeze() == null) ? 0 : getIsFreeze().hashCode());
        result = prime * result + ((getBusiDate() == null) ? 0 : getBusiDate().hashCode());
        result = prime * result + ((getJointAccountBankName() == null) ? 0 : getJointAccountBankName().hashCode());
        result = prime * result + ((getUseInfo() == null) ? 0 : getUseInfo().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAcsref() == null) ? 0 : getAcsref().hashCode());
        result = prime * result + ((getRemitPostscript() == null) ? 0 : getRemitPostscript().hashCode());
        result = prime * result + ((getPayerBankCode() == null) ? 0 : getPayerBankCode().hashCode());
        return result;
    }
}