/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradePayInfoDO.java
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

public class TradePayInfoDO implements Serializable {
    /**
     * corresponds to the database column trade_pay_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column trade_pay_info.pay_biz_no
     *
     * @mbggenerated
     */
    private String payBizNo;

    /**
     * corresponds to the database column trade_pay_info.batch_no
     *
     * @mbggenerated
     */
    private String batchNo;

    /**
     * corresponds to the database column trade_pay_info.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column trade_pay_info.deposit_no
     *
     * @mbggenerated
     */
    private String depositNo;

    /**
     * corresponds to the database column trade_pay_info.withdraw_no
     *
     * @mbggenerated
     */
    private String withdrawNo;

    /**
     * corresponds to the database column trade_pay_info.ious_pay_no
     *
     * @mbggenerated
     */
    private String iousPayNo;

    /**
     * corresponds to the database column trade_pay_info.transfer_no
     *
     * @mbggenerated
     */
    private String transferNo;

    /**
     * corresponds to the database column trade_pay_info.confirm_transfer_no
     *
     * @mbggenerated
     */
    private String confirmTransferNo;

    /**
     * corresponds to the database column trade_pay_info.transfer_to_super_no
     *
     * @mbggenerated
     */
    private String transferToSuperNo;

    /**
     * corresponds to the database column trade_pay_info.settle_biz_no
     *
     * @mbggenerated
     */
    private String settleBizNo;

    /**
     * corresponds to the database column trade_pay_info.deposit_amount
     *
     * @mbggenerated
     */
    private Money depositAmount;

    /**
     * corresponds to the database column trade_pay_info.bail_pay_amount
     *
     * @mbggenerated
     */
    private Money bailPayAmount;

    /**
     * corresponds to the database column trade_pay_info.pay_amount
     *
     * @mbggenerated
     */
    private Money payAmount;

    /**
     * corresponds to the database column trade_pay_info.share_amount
     *
     * @mbggenerated
     */
    private Money shareAmount;

    /**
     * corresponds to the database column trade_pay_info.surplus_amount
     *
     * @mbggenerated
     */
    private Long surplusAmount;

    /**
     * corresponds to the database column trade_pay_info.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * corresponds to the database column trade_pay_info.charge_no
     *
     * @mbggenerated
     */
    private String chargeNo;

    /**
     * corresponds to the database column trade_pay_info.buyer_fee
     *
     * @mbggenerated
     */
    private Money buyerFee;

    /**
     * corresponds to the database column trade_pay_info.seller_fee
     *
     * @mbggenerated
     */
    private Money sellerFee;

    /**
     * corresponds to the database column trade_pay_info.partner_fee
     *
     * @mbggenerated
     */
    private Money partnerFee;

    /**
     * corresponds to the database column trade_pay_info.merge_flag
     *
     * @mbggenerated
     */
    private String mergeFlag;

    /**
     * corresponds to the database column trade_pay_info.payer_user_id
     *
     * @mbggenerated
     */
    private String payerUserId;

    /**
     * corresponds to the database column trade_pay_info.payer_card_no
     *
     * @mbggenerated
     */
    private String payerCardNo;

    /**
     * corresponds to the database column trade_pay_info.payer_acc_no
     *
     * @mbggenerated
     */
    private String payerAccNo;

    /**
     * corresponds to the database column trade_pay_info.supervision_acc_no
     *
     * @mbggenerated
     */
    private String supervisionAccNo;

    /**
     * corresponds to the database column trade_pay_info.pay_method
     *
     * @mbggenerated
     */
    private String payMethod;

    /**
     * corresponds to the database column trade_pay_info.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column trade_pay_info.personal_corporate_type
     *
     * @mbggenerated
     */
    private String personalCorporateType;

    /**
     * corresponds to the database column trade_pay_info.card_type
     *
     * @mbggenerated
     */
    private String cardType;

    /**
     * corresponds to the database column trade_pay_info.mutable_type
     *
     * @mbggenerated
     */
    private String mutableType;

    /**
     * corresponds to the database column trade_pay_info.protocol_no
     *
     * @mbggenerated
     */
    private String protocolNo;

    /**
     * corresponds to the database column trade_pay_info.pact_no
     *
     * @mbggenerated
     */
    private String pactNo;

    /**
     * corresponds to the database column trade_pay_info.bank_account_no
     *
     * @mbggenerated
     */
    private String bankAccountNo;

    /**
     * corresponds to the database column trade_pay_info.bank_account_no_digest
     *
     * @mbggenerated
     */
    private String bankAccountNoDigest;

    /**
     * corresponds to the database column trade_pay_info.real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * corresponds to the database column trade_pay_info.cert_no
     *
     * @mbggenerated
     */
    private String certNo;

    /**
     * corresponds to the database column trade_pay_info.cert_type
     *
     * @mbggenerated
     */
    private String certType;

    /**
     * corresponds to the database column trade_pay_info.user_end_ip
     *
     * @mbggenerated
     */
    private String userEndIp;

    /**
     * corresponds to the database column trade_pay_info.mac_address
     *
     * @mbggenerated
     */
    private String macAddress;

    /**
     * corresponds to the database column trade_pay_info.user_terminal_type
     *
     * @mbggenerated
     */
    private String userTerminalType;

    /**
     * corresponds to the database column trade_pay_info.pay_status
     *
     * @mbggenerated
     */
    private String payStatus;

    /**
     * corresponds to the database column trade_pay_info.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column trade_pay_info.data_index
     *
     * @mbggenerated
     */
    private String dataIndex;

    /**
     * corresponds to the database column trade_pay_info.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column trade_pay_info.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column trade_pay_info.subsidy_transfer_no
     *
     * @mbggenerated
     */
    private String subsidyTransferNo;

    /**
     * corresponds to the database column trade_pay_info.subsidy_amount
     *
     * @mbggenerated
     */
    private Money subsidyAmount;

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column trade_pay_info.id
     *
     * @return the value of trade_pay_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column trade_pay_info.id
     *
     * @param id the value for trade_pay_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column trade_pay_info.pay_biz_no
     *
     * @return the value of trade_pay_info.pay_biz_no
     *
     * @mbggenerated
     */
    public String getPayBizNo() {
        return payBizNo;
    }

    /**
     * set the value of the database column trade_pay_info.pay_biz_no
     *
     * @param payBizNo the value for trade_pay_info.pay_biz_no
     *
     * @mbggenerated
     */
    public void setPayBizNo(String payBizNo) {
        this.payBizNo = payBizNo == null ? null : payBizNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.batch_no
     *
     * @return the value of trade_pay_info.batch_no
     *
     * @mbggenerated
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * set the value of the database column trade_pay_info.batch_no
     *
     * @param batchNo the value for trade_pay_info.batch_no
     *
     * @mbggenerated
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.biz_no
     *
     * @return the value of trade_pay_info.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column trade_pay_info.biz_no
     *
     * @param bizNo the value for trade_pay_info.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.deposit_no
     *
     * @return the value of trade_pay_info.deposit_no
     *
     * @mbggenerated
     */
    public String getDepositNo() {
        return depositNo;
    }

    /**
     * set the value of the database column trade_pay_info.deposit_no
     *
     * @param depositNo the value for trade_pay_info.deposit_no
     *
     * @mbggenerated
     */
    public void setDepositNo(String depositNo) {
        this.depositNo = depositNo == null ? null : depositNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.withdraw_no
     *
     * @return the value of trade_pay_info.withdraw_no
     *
     * @mbggenerated
     */
    public String getWithdrawNo() {
        return withdrawNo;
    }

    /**
     * set the value of the database column trade_pay_info.withdraw_no
     *
     * @param withdrawNo the value for trade_pay_info.withdraw_no
     *
     * @mbggenerated
     */
    public void setWithdrawNo(String withdrawNo) {
        this.withdrawNo = withdrawNo == null ? null : withdrawNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.ious_pay_no
     *
     * @return the value of trade_pay_info.ious_pay_no
     *
     * @mbggenerated
     */
    public String getIousPayNo() {
        return iousPayNo;
    }

    /**
     * set the value of the database column trade_pay_info.ious_pay_no
     *
     * @param iousPayNo the value for trade_pay_info.ious_pay_no
     *
     * @mbggenerated
     */
    public void setIousPayNo(String iousPayNo) {
        this.iousPayNo = iousPayNo == null ? null : iousPayNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.transfer_no
     *
     * @return the value of trade_pay_info.transfer_no
     *
     * @mbggenerated
     */
    public String getTransferNo() {
        return transferNo;
    }

    /**
     * set the value of the database column trade_pay_info.transfer_no
     *
     * @param transferNo the value for trade_pay_info.transfer_no
     *
     * @mbggenerated
     */
    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo == null ? null : transferNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.confirm_transfer_no
     *
     * @return the value of trade_pay_info.confirm_transfer_no
     *
     * @mbggenerated
     */
    public String getConfirmTransferNo() {
        return confirmTransferNo;
    }

    /**
     * set the value of the database column trade_pay_info.confirm_transfer_no
     *
     * @param confirmTransferNo the value for trade_pay_info.confirm_transfer_no
     *
     * @mbggenerated
     */
    public void setConfirmTransferNo(String confirmTransferNo) {
        this.confirmTransferNo = confirmTransferNo == null ? null : confirmTransferNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.transfer_to_super_no
     *
     * @return the value of trade_pay_info.transfer_to_super_no
     *
     * @mbggenerated
     */
    public String getTransferToSuperNo() {
        return transferToSuperNo;
    }

    /**
     * set the value of the database column trade_pay_info.transfer_to_super_no
     *
     * @param transferToSuperNo the value for trade_pay_info.transfer_to_super_no
     *
     * @mbggenerated
     */
    public void setTransferToSuperNo(String transferToSuperNo) {
        this.transferToSuperNo = transferToSuperNo == null ? null : transferToSuperNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.settle_biz_no
     *
     * @return the value of trade_pay_info.settle_biz_no
     *
     * @mbggenerated
     */
    public String getSettleBizNo() {
        return settleBizNo;
    }

    /**
     * set the value of the database column trade_pay_info.settle_biz_no
     *
     * @param settleBizNo the value for trade_pay_info.settle_biz_no
     *
     * @mbggenerated
     */
    public void setSettleBizNo(String settleBizNo) {
        this.settleBizNo = settleBizNo == null ? null : settleBizNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.deposit_amount
     *
     * @return the value of trade_pay_info.deposit_amount
     *
     * @mbggenerated
     */
    public Money getDepositAmount() {
        return depositAmount;
    }

    /**
     * set the value of the database column trade_pay_info.deposit_amount
     *
     * @param depositAmount the value for trade_pay_info.deposit_amount
     *
     * @mbggenerated
     */
    public void setDepositAmount(Money depositAmount) {
        this.depositAmount = depositAmount;
    }

    /**
     * return the value of the database column trade_pay_info.bail_pay_amount
     *
     * @return the value of trade_pay_info.bail_pay_amount
     *
     * @mbggenerated
     */
    public Money getBailPayAmount() {
        return bailPayAmount;
    }

    /**
     * set the value of the database column trade_pay_info.bail_pay_amount
     *
     * @param bailPayAmount the value for trade_pay_info.bail_pay_amount
     *
     * @mbggenerated
     */
    public void setBailPayAmount(Money bailPayAmount) {
        this.bailPayAmount = bailPayAmount;
    }

    /**
     * return the value of the database column trade_pay_info.pay_amount
     *
     * @return the value of trade_pay_info.pay_amount
     *
     * @mbggenerated
     */
    public Money getPayAmount() {
        return payAmount;
    }

    /**
     * set the value of the database column trade_pay_info.pay_amount
     *
     * @param payAmount the value for trade_pay_info.pay_amount
     *
     * @mbggenerated
     */
    public void setPayAmount(Money payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * return the value of the database column trade_pay_info.share_amount
     *
     * @return the value of trade_pay_info.share_amount
     *
     * @mbggenerated
     */
    public Money getShareAmount() {
        return shareAmount;
    }

    /**
     * set the value of the database column trade_pay_info.share_amount
     *
     * @param shareAmount the value for trade_pay_info.share_amount
     *
     * @mbggenerated
     */
    public void setShareAmount(Money shareAmount) {
        this.shareAmount = shareAmount;
    }

    /**
     * return the value of the database column trade_pay_info.surplus_amount
     *
     * @return the value of trade_pay_info.surplus_amount
     *
     * @mbggenerated
     */
    public Long getSurplusAmount() {
        return surplusAmount;
    }

    /**
     * set the value of the database column trade_pay_info.surplus_amount
     *
     * @param surplusAmount the value for trade_pay_info.surplus_amount
     *
     * @mbggenerated
     */
    public void setSurplusAmount(Long surplusAmount) {
        this.surplusAmount = surplusAmount;
    }

    /**
     * return the value of the database column trade_pay_info.source
     *
     * @return the value of trade_pay_info.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * set the value of the database column trade_pay_info.source
     *
     * @param source the value for trade_pay_info.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * return the value of the database column trade_pay_info.charge_no
     *
     * @return the value of trade_pay_info.charge_no
     *
     * @mbggenerated
     */
    public String getChargeNo() {
        return chargeNo;
    }

    /**
     * set the value of the database column trade_pay_info.charge_no
     *
     * @param chargeNo the value for trade_pay_info.charge_no
     *
     * @mbggenerated
     */
    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo == null ? null : chargeNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.buyer_fee
     *
     * @return the value of trade_pay_info.buyer_fee
     *
     * @mbggenerated
     */
    public Money getBuyerFee() {
        return buyerFee;
    }

    /**
     * set the value of the database column trade_pay_info.buyer_fee
     *
     * @param buyerFee the value for trade_pay_info.buyer_fee
     *
     * @mbggenerated
     */
    public void setBuyerFee(Money buyerFee) {
        this.buyerFee = buyerFee;
    }

    /**
     * return the value of the database column trade_pay_info.seller_fee
     *
     * @return the value of trade_pay_info.seller_fee
     *
     * @mbggenerated
     */
    public Money getSellerFee() {
        return sellerFee;
    }

    /**
     * set the value of the database column trade_pay_info.seller_fee
     *
     * @param sellerFee the value for trade_pay_info.seller_fee
     *
     * @mbggenerated
     */
    public void setSellerFee(Money sellerFee) {
        this.sellerFee = sellerFee;
    }

    /**
     * return the value of the database column trade_pay_info.partner_fee
     *
     * @return the value of trade_pay_info.partner_fee
     *
     * @mbggenerated
     */
    public Money getPartnerFee() {
        return partnerFee;
    }

    /**
     * set the value of the database column trade_pay_info.partner_fee
     *
     * @param partnerFee the value for trade_pay_info.partner_fee
     *
     * @mbggenerated
     */
    public void setPartnerFee(Money partnerFee) {
        this.partnerFee = partnerFee;
    }

    /**
     * return the value of the database column trade_pay_info.merge_flag
     *
     * @return the value of trade_pay_info.merge_flag
     *
     * @mbggenerated
     */
    public String getMergeFlag() {
        return mergeFlag;
    }

    /**
     * set the value of the database column trade_pay_info.merge_flag
     *
     * @param mergeFlag the value for trade_pay_info.merge_flag
     *
     * @mbggenerated
     */
    public void setMergeFlag(String mergeFlag) {
        this.mergeFlag = mergeFlag == null ? null : mergeFlag.trim();
    }

    /**
     * return the value of the database column trade_pay_info.payer_user_id
     *
     * @return the value of trade_pay_info.payer_user_id
     *
     * @mbggenerated
     */
    public String getPayerUserId() {
        return payerUserId;
    }

    /**
     * set the value of the database column trade_pay_info.payer_user_id
     *
     * @param payerUserId the value for trade_pay_info.payer_user_id
     *
     * @mbggenerated
     */
    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId == null ? null : payerUserId.trim();
    }

    /**
     * return the value of the database column trade_pay_info.payer_card_no
     *
     * @return the value of trade_pay_info.payer_card_no
     *
     * @mbggenerated
     */
    public String getPayerCardNo() {
        return payerCardNo;
    }

    /**
     * set the value of the database column trade_pay_info.payer_card_no
     *
     * @param payerCardNo the value for trade_pay_info.payer_card_no
     *
     * @mbggenerated
     */
    public void setPayerCardNo(String payerCardNo) {
        this.payerCardNo = payerCardNo == null ? null : payerCardNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.payer_acc_no
     *
     * @return the value of trade_pay_info.payer_acc_no
     *
     * @mbggenerated
     */
    public String getPayerAccNo() {
        return payerAccNo;
    }

    /**
     * set the value of the database column trade_pay_info.payer_acc_no
     *
     * @param payerAccNo the value for trade_pay_info.payer_acc_no
     *
     * @mbggenerated
     */
    public void setPayerAccNo(String payerAccNo) {
        this.payerAccNo = payerAccNo == null ? null : payerAccNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.supervision_acc_no
     *
     * @return the value of trade_pay_info.supervision_acc_no
     *
     * @mbggenerated
     */
    public String getSupervisionAccNo() {
        return supervisionAccNo;
    }

    /**
     * set the value of the database column trade_pay_info.supervision_acc_no
     *
     * @param supervisionAccNo the value for trade_pay_info.supervision_acc_no
     *
     * @mbggenerated
     */
    public void setSupervisionAccNo(String supervisionAccNo) {
        this.supervisionAccNo = supervisionAccNo == null ? null : supervisionAccNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.pay_method
     *
     * @return the value of trade_pay_info.pay_method
     *
     * @mbggenerated
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * set the value of the database column trade_pay_info.pay_method
     *
     * @param payMethod the value for trade_pay_info.pay_method
     *
     * @mbggenerated
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    /**
     * return the value of the database column trade_pay_info.bank_code
     *
     * @return the value of trade_pay_info.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column trade_pay_info.bank_code
     *
     * @param bankCode the value for trade_pay_info.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column trade_pay_info.personal_corporate_type
     *
     * @return the value of trade_pay_info.personal_corporate_type
     *
     * @mbggenerated
     */
    public String getPersonalCorporateType() {
        return personalCorporateType;
    }

    /**
     * set the value of the database column trade_pay_info.personal_corporate_type
     *
     * @param personalCorporateType the value for trade_pay_info.personal_corporate_type
     *
     * @mbggenerated
     */
    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType == null ? null : personalCorporateType.trim();
    }

    /**
     * return the value of the database column trade_pay_info.card_type
     *
     * @return the value of trade_pay_info.card_type
     *
     * @mbggenerated
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * set the value of the database column trade_pay_info.card_type
     *
     * @param cardType the value for trade_pay_info.card_type
     *
     * @mbggenerated
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    /**
     * return the value of the database column trade_pay_info.mutable_type
     *
     * @return the value of trade_pay_info.mutable_type
     *
     * @mbggenerated
     */
    public String getMutableType() {
        return mutableType;
    }

    /**
     * set the value of the database column trade_pay_info.mutable_type
     *
     * @param mutableType the value for trade_pay_info.mutable_type
     *
     * @mbggenerated
     */
    public void setMutableType(String mutableType) {
        this.mutableType = mutableType == null ? null : mutableType.trim();
    }

    /**
     * return the value of the database column trade_pay_info.protocol_no
     *
     * @return the value of trade_pay_info.protocol_no
     *
     * @mbggenerated
     */
    public String getProtocolNo() {
        return protocolNo;
    }

    /**
     * set the value of the database column trade_pay_info.protocol_no
     *
     * @param protocolNo the value for trade_pay_info.protocol_no
     *
     * @mbggenerated
     */
    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo == null ? null : protocolNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.pact_no
     *
     * @return the value of trade_pay_info.pact_no
     *
     * @mbggenerated
     */
    public String getPactNo() {
        return pactNo;
    }

    /**
     * set the value of the database column trade_pay_info.pact_no
     *
     * @param pactNo the value for trade_pay_info.pact_no
     *
     * @mbggenerated
     */
    public void setPactNo(String pactNo) {
        this.pactNo = pactNo == null ? null : pactNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.bank_account_no
     *
     * @return the value of trade_pay_info.bank_account_no
     *
     * @mbggenerated
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * set the value of the database column trade_pay_info.bank_account_no
     *
     * @param bankAccountNo the value for trade_pay_info.bank_account_no
     *
     * @mbggenerated
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.bank_account_no_digest
     *
     * @return the value of trade_pay_info.bank_account_no_digest
     *
     * @mbggenerated
     */
    public String getBankAccountNoDigest() {
        return bankAccountNoDigest;
    }

    /**
     * set the value of the database column trade_pay_info.bank_account_no_digest
     *
     * @param bankAccountNoDigest the value for trade_pay_info.bank_account_no_digest
     *
     * @mbggenerated
     */
    public void setBankAccountNoDigest(String bankAccountNoDigest) {
        this.bankAccountNoDigest = bankAccountNoDigest == null ? null : bankAccountNoDigest.trim();
    }

    /**
     * return the value of the database column trade_pay_info.real_name
     *
     * @return the value of trade_pay_info.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * set the value of the database column trade_pay_info.real_name
     *
     * @param realName the value for trade_pay_info.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * return the value of the database column trade_pay_info.cert_no
     *
     * @return the value of trade_pay_info.cert_no
     *
     * @mbggenerated
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * set the value of the database column trade_pay_info.cert_no
     *
     * @param certNo the value for trade_pay_info.cert_no
     *
     * @mbggenerated
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.cert_type
     *
     * @return the value of trade_pay_info.cert_type
     *
     * @mbggenerated
     */
    public String getCertType() {
        return certType;
    }

    /**
     * set the value of the database column trade_pay_info.cert_type
     *
     * @param certType the value for trade_pay_info.cert_type
     *
     * @mbggenerated
     */
    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    /**
     * return the value of the database column trade_pay_info.user_end_ip
     *
     * @return the value of trade_pay_info.user_end_ip
     *
     * @mbggenerated
     */
    public String getUserEndIp() {
        return userEndIp;
    }

    /**
     * set the value of the database column trade_pay_info.user_end_ip
     *
     * @param userEndIp the value for trade_pay_info.user_end_ip
     *
     * @mbggenerated
     */
    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp == null ? null : userEndIp.trim();
    }

    /**
     * return the value of the database column trade_pay_info.mac_address
     *
     * @return the value of trade_pay_info.mac_address
     *
     * @mbggenerated
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * set the value of the database column trade_pay_info.mac_address
     *
     * @param macAddress the value for trade_pay_info.mac_address
     *
     * @mbggenerated
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    /**
     * return the value of the database column trade_pay_info.user_terminal_type
     *
     * @return the value of trade_pay_info.user_terminal_type
     *
     * @mbggenerated
     */
    public String getUserTerminalType() {
        return userTerminalType;
    }

    /**
     * set the value of the database column trade_pay_info.user_terminal_type
     *
     * @param userTerminalType the value for trade_pay_info.user_terminal_type
     *
     * @mbggenerated
     */
    public void setUserTerminalType(String userTerminalType) {
        this.userTerminalType = userTerminalType == null ? null : userTerminalType.trim();
    }

    /**
     * return the value of the database column trade_pay_info.pay_status
     *
     * @return the value of trade_pay_info.pay_status
     *
     * @mbggenerated
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * set the value of the database column trade_pay_info.pay_status
     *
     * @param payStatus the value for trade_pay_info.pay_status
     *
     * @mbggenerated
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    /**
     * return the value of the database column trade_pay_info.memo
     *
     * @return the value of trade_pay_info.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column trade_pay_info.memo
     *
     * @param memo the value for trade_pay_info.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.data_index
     *
     * @return the value of trade_pay_info.data_index
     *
     * @mbggenerated
     */
    public String getDataIndex() {
        return dataIndex;
    }

    /**
     * set the value of the database column trade_pay_info.data_index
     *
     * @param dataIndex the value for trade_pay_info.data_index
     *
     * @mbggenerated
     */
    public void setDataIndex(String dataIndex) {
        this.dataIndex = dataIndex == null ? null : dataIndex.trim();
    }

    /**
     * return the value of the database column trade_pay_info.raw_add_time
     *
     * @return the value of trade_pay_info.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column trade_pay_info.raw_add_time
     *
     * @param rawAddTime the value for trade_pay_info.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column trade_pay_info.raw_update_time
     *
     * @return the value of trade_pay_info.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column trade_pay_info.raw_update_time
     *
     * @param rawUpdateTime the value for trade_pay_info.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column trade_pay_info.subsidy_transfer_no
     *
     * @return the value of trade_pay_info.subsidy_transfer_no
     *
     * @mbggenerated
     */
    public String getSubsidyTransferNo() {
        return subsidyTransferNo;
    }

    /**
     * set the value of the database column trade_pay_info.subsidy_transfer_no
     *
     * @param subsidyTransferNo the value for trade_pay_info.subsidy_transfer_no
     *
     * @mbggenerated
     */
    public void setSubsidyTransferNo(String subsidyTransferNo) {
        this.subsidyTransferNo = subsidyTransferNo == null ? null : subsidyTransferNo.trim();
    }

    /**
     * return the value of the database column trade_pay_info.subsidy_amount
     *
     * @return the value of trade_pay_info.subsidy_amount
     *
     * @mbggenerated
     */
    public Money getSubsidyAmount() {
        return subsidyAmount;
    }

    /**
     * set the value of the database column trade_pay_info.subsidy_amount
     *
     * @param subsidyAmount the value for trade_pay_info.subsidy_amount
     *
     * @mbggenerated
     */
    public void setSubsidyAmount(Money subsidyAmount) {
        this.subsidyAmount = subsidyAmount;
    }

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", payBizNo=").append(payBizNo);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", depositNo=").append(depositNo);
        sb.append(", withdrawNo=").append(withdrawNo);
        sb.append(", iousPayNo=").append(iousPayNo);
        sb.append(", transferNo=").append(transferNo);
        sb.append(", confirmTransferNo=").append(confirmTransferNo);
        sb.append(", transferToSuperNo=").append(transferToSuperNo);
        sb.append(", settleBizNo=").append(settleBizNo);
        sb.append(", depositAmount=").append(depositAmount);
        sb.append(", bailPayAmount=").append(bailPayAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", shareAmount=").append(shareAmount);
        sb.append(", surplusAmount=").append(surplusAmount);
        sb.append(", source=").append(source);
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", buyerFee=").append(buyerFee);
        sb.append(", sellerFee=").append(sellerFee);
        sb.append(", partnerFee=").append(partnerFee);
        sb.append(", mergeFlag=").append(mergeFlag);
        sb.append(", payerUserId=").append(payerUserId);
        sb.append(", payerCardNo=").append(payerCardNo);
        sb.append(", payerAccNo=").append(payerAccNo);
        sb.append(", supervisionAccNo=").append(supervisionAccNo);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", personalCorporateType=").append(personalCorporateType);
        sb.append(", cardType=").append(cardType);
        sb.append(", mutableType=").append(mutableType);
        sb.append(", protocolNo=").append(protocolNo);
        sb.append(", pactNo=").append(pactNo);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", bankAccountNoDigest=").append(bankAccountNoDigest);
        sb.append(", realName=").append(realName);
        sb.append(", certNo=").append(certNo);
        sb.append(", certType=").append(certType);
        sb.append(", userEndIp=").append(userEndIp);
        sb.append(", macAddress=").append(macAddress);
        sb.append(", userTerminalType=").append(userTerminalType);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", memo=").append(memo);
        sb.append(", dataIndex=").append(dataIndex);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", subsidyTransferNo=").append(subsidyTransferNo);
        sb.append(", subsidyAmount=").append(subsidyAmount);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table trade_pay_info
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
        TradePayInfoDO other = (TradePayInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPayBizNo() == null ? other.getPayBizNo() == null : this.getPayBizNo().equals(other.getPayBizNo()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getDepositNo() == null ? other.getDepositNo() == null : this.getDepositNo().equals(other.getDepositNo()))
            && (this.getWithdrawNo() == null ? other.getWithdrawNo() == null : this.getWithdrawNo().equals(other.getWithdrawNo()))
            && (this.getIousPayNo() == null ? other.getIousPayNo() == null : this.getIousPayNo().equals(other.getIousPayNo()))
            && (this.getTransferNo() == null ? other.getTransferNo() == null : this.getTransferNo().equals(other.getTransferNo()))
            && (this.getConfirmTransferNo() == null ? other.getConfirmTransferNo() == null : this.getConfirmTransferNo().equals(other.getConfirmTransferNo()))
            && (this.getTransferToSuperNo() == null ? other.getTransferToSuperNo() == null : this.getTransferToSuperNo().equals(other.getTransferToSuperNo()))
            && (this.getSettleBizNo() == null ? other.getSettleBizNo() == null : this.getSettleBizNo().equals(other.getSettleBizNo()))
            && (this.getDepositAmount() == null ? other.getDepositAmount() == null : this.getDepositAmount().equals(other.getDepositAmount()))
            && (this.getBailPayAmount() == null ? other.getBailPayAmount() == null : this.getBailPayAmount().equals(other.getBailPayAmount()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getShareAmount() == null ? other.getShareAmount() == null : this.getShareAmount().equals(other.getShareAmount()))
            && (this.getSurplusAmount() == null ? other.getSurplusAmount() == null : this.getSurplusAmount().equals(other.getSurplusAmount()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getChargeNo() == null ? other.getChargeNo() == null : this.getChargeNo().equals(other.getChargeNo()))
            && (this.getBuyerFee() == null ? other.getBuyerFee() == null : this.getBuyerFee().equals(other.getBuyerFee()))
            && (this.getSellerFee() == null ? other.getSellerFee() == null : this.getSellerFee().equals(other.getSellerFee()))
            && (this.getPartnerFee() == null ? other.getPartnerFee() == null : this.getPartnerFee().equals(other.getPartnerFee()))
            && (this.getMergeFlag() == null ? other.getMergeFlag() == null : this.getMergeFlag().equals(other.getMergeFlag()))
            && (this.getPayerUserId() == null ? other.getPayerUserId() == null : this.getPayerUserId().equals(other.getPayerUserId()))
            && (this.getPayerCardNo() == null ? other.getPayerCardNo() == null : this.getPayerCardNo().equals(other.getPayerCardNo()))
            && (this.getPayerAccNo() == null ? other.getPayerAccNo() == null : this.getPayerAccNo().equals(other.getPayerAccNo()))
            && (this.getSupervisionAccNo() == null ? other.getSupervisionAccNo() == null : this.getSupervisionAccNo().equals(other.getSupervisionAccNo()))
            && (this.getPayMethod() == null ? other.getPayMethod() == null : this.getPayMethod().equals(other.getPayMethod()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getPersonalCorporateType() == null ? other.getPersonalCorporateType() == null : this.getPersonalCorporateType().equals(other.getPersonalCorporateType()))
            && (this.getCardType() == null ? other.getCardType() == null : this.getCardType().equals(other.getCardType()))
            && (this.getMutableType() == null ? other.getMutableType() == null : this.getMutableType().equals(other.getMutableType()))
            && (this.getProtocolNo() == null ? other.getProtocolNo() == null : this.getProtocolNo().equals(other.getProtocolNo()))
            && (this.getPactNo() == null ? other.getPactNo() == null : this.getPactNo().equals(other.getPactNo()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getBankAccountNoDigest() == null ? other.getBankAccountNoDigest() == null : this.getBankAccountNoDigest().equals(other.getBankAccountNoDigest()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getCertType() == null ? other.getCertType() == null : this.getCertType().equals(other.getCertType()))
            && (this.getUserEndIp() == null ? other.getUserEndIp() == null : this.getUserEndIp().equals(other.getUserEndIp()))
            && (this.getMacAddress() == null ? other.getMacAddress() == null : this.getMacAddress().equals(other.getMacAddress()))
            && (this.getUserTerminalType() == null ? other.getUserTerminalType() == null : this.getUserTerminalType().equals(other.getUserTerminalType()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getDataIndex() == null ? other.getDataIndex() == null : this.getDataIndex().equals(other.getDataIndex()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getSubsidyTransferNo() == null ? other.getSubsidyTransferNo() == null : this.getSubsidyTransferNo().equals(other.getSubsidyTransferNo()))
            && (this.getSubsidyAmount() == null ? other.getSubsidyAmount() == null : this.getSubsidyAmount().equals(other.getSubsidyAmount()));
    }

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPayBizNo() == null) ? 0 : getPayBizNo().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getDepositNo() == null) ? 0 : getDepositNo().hashCode());
        result = prime * result + ((getWithdrawNo() == null) ? 0 : getWithdrawNo().hashCode());
        result = prime * result + ((getIousPayNo() == null) ? 0 : getIousPayNo().hashCode());
        result = prime * result + ((getTransferNo() == null) ? 0 : getTransferNo().hashCode());
        result = prime * result + ((getConfirmTransferNo() == null) ? 0 : getConfirmTransferNo().hashCode());
        result = prime * result + ((getTransferToSuperNo() == null) ? 0 : getTransferToSuperNo().hashCode());
        result = prime * result + ((getSettleBizNo() == null) ? 0 : getSettleBizNo().hashCode());
        result = prime * result + ((getDepositAmount() == null) ? 0 : getDepositAmount().hashCode());
        result = prime * result + ((getBailPayAmount() == null) ? 0 : getBailPayAmount().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getShareAmount() == null) ? 0 : getShareAmount().hashCode());
        result = prime * result + ((getSurplusAmount() == null) ? 0 : getSurplusAmount().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getChargeNo() == null) ? 0 : getChargeNo().hashCode());
        result = prime * result + ((getBuyerFee() == null) ? 0 : getBuyerFee().hashCode());
        result = prime * result + ((getSellerFee() == null) ? 0 : getSellerFee().hashCode());
        result = prime * result + ((getPartnerFee() == null) ? 0 : getPartnerFee().hashCode());
        result = prime * result + ((getMergeFlag() == null) ? 0 : getMergeFlag().hashCode());
        result = prime * result + ((getPayerUserId() == null) ? 0 : getPayerUserId().hashCode());
        result = prime * result + ((getPayerCardNo() == null) ? 0 : getPayerCardNo().hashCode());
        result = prime * result + ((getPayerAccNo() == null) ? 0 : getPayerAccNo().hashCode());
        result = prime * result + ((getSupervisionAccNo() == null) ? 0 : getSupervisionAccNo().hashCode());
        result = prime * result + ((getPayMethod() == null) ? 0 : getPayMethod().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getPersonalCorporateType() == null) ? 0 : getPersonalCorporateType().hashCode());
        result = prime * result + ((getCardType() == null) ? 0 : getCardType().hashCode());
        result = prime * result + ((getMutableType() == null) ? 0 : getMutableType().hashCode());
        result = prime * result + ((getProtocolNo() == null) ? 0 : getProtocolNo().hashCode());
        result = prime * result + ((getPactNo() == null) ? 0 : getPactNo().hashCode());
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getBankAccountNoDigest() == null) ? 0 : getBankAccountNoDigest().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getCertType() == null) ? 0 : getCertType().hashCode());
        result = prime * result + ((getUserEndIp() == null) ? 0 : getUserEndIp().hashCode());
        result = prime * result + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        result = prime * result + ((getUserTerminalType() == null) ? 0 : getUserTerminalType().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getDataIndex() == null) ? 0 : getDataIndex().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getSubsidyTransferNo() == null) ? 0 : getSubsidyTransferNo().hashCode());
        result = prime * result + ((getSubsidyAmount() == null) ? 0 : getSubsidyAmount().hashCode());
        return result;
    }
}