/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayShareProfitDO.java
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

public class FastPayShareProfitDO implements Serializable {
    /**
     * corresponds to the database column fast_pay_share_profit.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column fast_pay_share_profit.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column fast_pay_share_profit.share_biz_no
     *
     * @mbggenerated
     */
    private String shareBizNo;

    /**
     * corresponds to the database column fast_pay_share_profit.transfer_no
     *
     * @mbggenerated
     */
    private String transferNo;

    /**
     * corresponds to the database column fast_pay_share_profit.payer_user_id
     *
     * @mbggenerated
     */
    private String payerUserId;

    /**
     * corresponds to the database column fast_pay_share_profit.payer_card_no
     *
     * @mbggenerated
     */
    private String payerCardNo;

    /**
     * corresponds to the database column fast_pay_share_profit.payer_acc_no
     *
     * @mbggenerated
     */
    private String payerAccNo;

    /**
     * corresponds to the database column fast_pay_share_profit.payee_user_id
     *
     * @mbggenerated
     */
    private String payeeUserId;

    /**
     * corresponds to the database column fast_pay_share_profit.payee_card_no
     *
     * @mbggenerated
     */
    private String payeeCardNo;

    /**
     * corresponds to the database column fast_pay_share_profit.payee_acc_no
     *
     * @mbggenerated
     */
    private String payeeAccNo;

    /**
     * corresponds to the database column fast_pay_share_profit.share_amount
     *
     * @mbggenerated
     */
    private Money shareAmount;

    /**
     * corresponds to the database column fast_pay_share_profit.refund_amount
     *
     * @mbggenerated
     */
    private Money refundAmount;

    /**
     * corresponds to the database column fast_pay_share_profit.currency
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * corresponds to the database column fast_pay_share_profit.share_status
     *
     * @mbggenerated
     */
    private String shareStatus;

    /**
     * corresponds to the database column fast_pay_share_profit.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column fast_pay_share_profit.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay_share_profit.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay_share_profit.id
     *
     * @return the value of fast_pay_share_profit.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay_share_profit.id
     *
     * @param id the value for fast_pay_share_profit.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay_share_profit.biz_no
     *
     * @return the value of fast_pay_share_profit.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column fast_pay_share_profit.biz_no
     *
     * @param bizNo the value for fast_pay_share_profit.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.share_biz_no
     *
     * @return the value of fast_pay_share_profit.share_biz_no
     *
     * @mbggenerated
     */
    public String getShareBizNo() {
        return shareBizNo;
    }

    /**
     * set the value of the database column fast_pay_share_profit.share_biz_no
     *
     * @param shareBizNo the value for fast_pay_share_profit.share_biz_no
     *
     * @mbggenerated
     */
    public void setShareBizNo(String shareBizNo) {
        this.shareBizNo = shareBizNo == null ? null : shareBizNo.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.transfer_no
     *
     * @return the value of fast_pay_share_profit.transfer_no
     *
     * @mbggenerated
     */
    public String getTransferNo() {
        return transferNo;
    }

    /**
     * set the value of the database column fast_pay_share_profit.transfer_no
     *
     * @param transferNo the value for fast_pay_share_profit.transfer_no
     *
     * @mbggenerated
     */
    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo == null ? null : transferNo.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.payer_user_id
     *
     * @return the value of fast_pay_share_profit.payer_user_id
     *
     * @mbggenerated
     */
    public String getPayerUserId() {
        return payerUserId;
    }

    /**
     * set the value of the database column fast_pay_share_profit.payer_user_id
     *
     * @param payerUserId the value for fast_pay_share_profit.payer_user_id
     *
     * @mbggenerated
     */
    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId == null ? null : payerUserId.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.payer_card_no
     *
     * @return the value of fast_pay_share_profit.payer_card_no
     *
     * @mbggenerated
     */
    public String getPayerCardNo() {
        return payerCardNo;
    }

    /**
     * set the value of the database column fast_pay_share_profit.payer_card_no
     *
     * @param payerCardNo the value for fast_pay_share_profit.payer_card_no
     *
     * @mbggenerated
     */
    public void setPayerCardNo(String payerCardNo) {
        this.payerCardNo = payerCardNo == null ? null : payerCardNo.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.payer_acc_no
     *
     * @return the value of fast_pay_share_profit.payer_acc_no
     *
     * @mbggenerated
     */
    public String getPayerAccNo() {
        return payerAccNo;
    }

    /**
     * set the value of the database column fast_pay_share_profit.payer_acc_no
     *
     * @param payerAccNo the value for fast_pay_share_profit.payer_acc_no
     *
     * @mbggenerated
     */
    public void setPayerAccNo(String payerAccNo) {
        this.payerAccNo = payerAccNo == null ? null : payerAccNo.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.payee_user_id
     *
     * @return the value of fast_pay_share_profit.payee_user_id
     *
     * @mbggenerated
     */
    public String getPayeeUserId() {
        return payeeUserId;
    }

    /**
     * set the value of the database column fast_pay_share_profit.payee_user_id
     *
     * @param payeeUserId the value for fast_pay_share_profit.payee_user_id
     *
     * @mbggenerated
     */
    public void setPayeeUserId(String payeeUserId) {
        this.payeeUserId = payeeUserId == null ? null : payeeUserId.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.payee_card_no
     *
     * @return the value of fast_pay_share_profit.payee_card_no
     *
     * @mbggenerated
     */
    public String getPayeeCardNo() {
        return payeeCardNo;
    }

    /**
     * set the value of the database column fast_pay_share_profit.payee_card_no
     *
     * @param payeeCardNo the value for fast_pay_share_profit.payee_card_no
     *
     * @mbggenerated
     */
    public void setPayeeCardNo(String payeeCardNo) {
        this.payeeCardNo = payeeCardNo == null ? null : payeeCardNo.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.payee_acc_no
     *
     * @return the value of fast_pay_share_profit.payee_acc_no
     *
     * @mbggenerated
     */
    public String getPayeeAccNo() {
        return payeeAccNo;
    }

    /**
     * set the value of the database column fast_pay_share_profit.payee_acc_no
     *
     * @param payeeAccNo the value for fast_pay_share_profit.payee_acc_no
     *
     * @mbggenerated
     */
    public void setPayeeAccNo(String payeeAccNo) {
        this.payeeAccNo = payeeAccNo == null ? null : payeeAccNo.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.share_amount
     *
     * @return the value of fast_pay_share_profit.share_amount
     *
     * @mbggenerated
     */
    public Money getShareAmount() {
        return shareAmount;
    }

    /**
     * set the value of the database column fast_pay_share_profit.share_amount
     *
     * @param shareAmount the value for fast_pay_share_profit.share_amount
     *
     * @mbggenerated
     */
    public void setShareAmount(Money shareAmount) {
        this.shareAmount = shareAmount;
    }

    /**
     * return the value of the database column fast_pay_share_profit.refund_amount
     *
     * @return the value of fast_pay_share_profit.refund_amount
     *
     * @mbggenerated
     */
    public Money getRefundAmount() {
        return refundAmount;
    }

    /**
     * set the value of the database column fast_pay_share_profit.refund_amount
     *
     * @param refundAmount the value for fast_pay_share_profit.refund_amount
     *
     * @mbggenerated
     */
    public void setRefundAmount(Money refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * return the value of the database column fast_pay_share_profit.currency
     *
     * @return the value of fast_pay_share_profit.currency
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * set the value of the database column fast_pay_share_profit.currency
     *
     * @param currency the value for fast_pay_share_profit.currency
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.share_status
     *
     * @return the value of fast_pay_share_profit.share_status
     *
     * @mbggenerated
     */
    public String getShareStatus() {
        return shareStatus;
    }

    /**
     * set the value of the database column fast_pay_share_profit.share_status
     *
     * @param shareStatus the value for fast_pay_share_profit.share_status
     *
     * @mbggenerated
     */
    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus == null ? null : shareStatus.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.memo
     *
     * @return the value of fast_pay_share_profit.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column fast_pay_share_profit.memo
     *
     * @param memo the value for fast_pay_share_profit.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column fast_pay_share_profit.raw_add_time
     *
     * @return the value of fast_pay_share_profit.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay_share_profit.raw_add_time
     *
     * @param rawAddTime the value for fast_pay_share_profit.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay_share_profit.raw_update_time
     *
     * @return the value of fast_pay_share_profit.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay_share_profit.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay_share_profit.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table fast_pay_share_profit
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
        sb.append(", shareBizNo=").append(shareBizNo);
        sb.append(", transferNo=").append(transferNo);
        sb.append(", payerUserId=").append(payerUserId);
        sb.append(", payerCardNo=").append(payerCardNo);
        sb.append(", payerAccNo=").append(payerAccNo);
        sb.append(", payeeUserId=").append(payeeUserId);
        sb.append(", payeeCardNo=").append(payeeCardNo);
        sb.append(", payeeAccNo=").append(payeeAccNo);
        sb.append(", shareAmount=").append(shareAmount);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", currency=").append(currency);
        sb.append(", shareStatus=").append(shareStatus);
        sb.append(", memo=").append(memo);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay_share_profit
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
        FastPayShareProfitDO other = (FastPayShareProfitDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getShareBizNo() == null ? other.getShareBizNo() == null : this.getShareBizNo().equals(other.getShareBizNo()))
            && (this.getTransferNo() == null ? other.getTransferNo() == null : this.getTransferNo().equals(other.getTransferNo()))
            && (this.getPayerUserId() == null ? other.getPayerUserId() == null : this.getPayerUserId().equals(other.getPayerUserId()))
            && (this.getPayerCardNo() == null ? other.getPayerCardNo() == null : this.getPayerCardNo().equals(other.getPayerCardNo()))
            && (this.getPayerAccNo() == null ? other.getPayerAccNo() == null : this.getPayerAccNo().equals(other.getPayerAccNo()))
            && (this.getPayeeUserId() == null ? other.getPayeeUserId() == null : this.getPayeeUserId().equals(other.getPayeeUserId()))
            && (this.getPayeeCardNo() == null ? other.getPayeeCardNo() == null : this.getPayeeCardNo().equals(other.getPayeeCardNo()))
            && (this.getPayeeAccNo() == null ? other.getPayeeAccNo() == null : this.getPayeeAccNo().equals(other.getPayeeAccNo()))
            && (this.getShareAmount() == null ? other.getShareAmount() == null : this.getShareAmount().equals(other.getShareAmount()))
            && (this.getRefundAmount() == null ? other.getRefundAmount() == null : this.getRefundAmount().equals(other.getRefundAmount()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getShareStatus() == null ? other.getShareStatus() == null : this.getShareStatus().equals(other.getShareStatus()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getShareBizNo() == null) ? 0 : getShareBizNo().hashCode());
        result = prime * result + ((getTransferNo() == null) ? 0 : getTransferNo().hashCode());
        result = prime * result + ((getPayerUserId() == null) ? 0 : getPayerUserId().hashCode());
        result = prime * result + ((getPayerCardNo() == null) ? 0 : getPayerCardNo().hashCode());
        result = prime * result + ((getPayerAccNo() == null) ? 0 : getPayerAccNo().hashCode());
        result = prime * result + ((getPayeeUserId() == null) ? 0 : getPayeeUserId().hashCode());
        result = prime * result + ((getPayeeCardNo() == null) ? 0 : getPayeeCardNo().hashCode());
        result = prime * result + ((getPayeeAccNo() == null) ? 0 : getPayeeAccNo().hashCode());
        result = prime * result + ((getShareAmount() == null) ? 0 : getShareAmount().hashCode());
        result = prime * result + ((getRefundAmount() == null) ? 0 : getRefundAmount().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getShareStatus() == null) ? 0 : getShareStatus().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}