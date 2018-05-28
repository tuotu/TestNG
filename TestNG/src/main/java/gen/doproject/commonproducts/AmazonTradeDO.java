/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AmazonTradeDO.java
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

public class AmazonTradeDO implements Serializable {
    /**
     * corresponds to the database column amazon_trade.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column amazon_trade.deposit_id
     *
     * @mbggenerated
     */
    private String depositId;

    /**
     * corresponds to the database column amazon_trade.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column amazon_trade.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column amazon_trade.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column amazon_trade.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column amazon_trade.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column amazon_trade.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column amazon_trade.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column amazon_trade.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column amazon_trade.capital_status
     *
     * @mbggenerated
     */
    private String capitalStatus;

    /**
     * corresponds to the database column amazon_trade.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column amazon_trade.amount
     *
     * @mbggenerated
     */
    private Money amount;

    /**
     * corresponds to the database column amazon_trade.currency
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * corresponds to the database column amazon_trade.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column amazon_trade.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * corresponds to the database column amazon_trade.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column amazon_trade.bank_update_time
     *
     * @mbggenerated
     */
    private Date bankUpdateTime;

    /**
     * corresponds to the database column amazon_trade.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column amazon_trade.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column amazon_trade.biz_no
     *
     * @return the value of amazon_trade.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column amazon_trade.biz_no
     *
     * @param bizNo the value for amazon_trade.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column amazon_trade.deposit_id
     *
     * @return the value of amazon_trade.deposit_id
     *
     * @mbggenerated
     */
    public String getDepositId() {
        return depositId;
    }

    /**
     * set the value of the database column amazon_trade.deposit_id
     *
     * @param depositId the value for amazon_trade.deposit_id
     *
     * @mbggenerated
     */
    public void setDepositId(String depositId) {
        this.depositId = depositId == null ? null : depositId.trim();
    }

    /**
     * return the value of the database column amazon_trade.gid
     *
     * @return the value of amazon_trade.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column amazon_trade.gid
     *
     * @param gid the value for amazon_trade.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column amazon_trade.merchant_order_no
     *
     * @return the value of amazon_trade.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column amazon_trade.merchant_order_no
     *
     * @param merchantOrderNo the value for amazon_trade.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column amazon_trade.merch_order_no
     *
     * @return the value of amazon_trade.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column amazon_trade.merch_order_no
     *
     * @param merchOrderNo the value for amazon_trade.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column amazon_trade.merchant_acc_no
     *
     * @return the value of amazon_trade.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column amazon_trade.merchant_acc_no
     *
     * @param merchantAccNo the value for amazon_trade.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column amazon_trade.merchant_card_no
     *
     * @return the value of amazon_trade.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column amazon_trade.merchant_card_no
     *
     * @param merchantCardNo the value for amazon_trade.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column amazon_trade.merchant_user_id
     *
     * @return the value of amazon_trade.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column amazon_trade.merchant_user_id
     *
     * @param merchantUserId the value for amazon_trade.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column amazon_trade.product_code
     *
     * @return the value of amazon_trade.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column amazon_trade.product_code
     *
     * @param productCode the value for amazon_trade.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column amazon_trade.product_status
     *
     * @return the value of amazon_trade.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column amazon_trade.product_status
     *
     * @param productStatus the value for amazon_trade.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column amazon_trade.capital_status
     *
     * @return the value of amazon_trade.capital_status
     *
     * @mbggenerated
     */
    public String getCapitalStatus() {
        return capitalStatus;
    }

    /**
     * set the value of the database column amazon_trade.capital_status
     *
     * @param capitalStatus the value for amazon_trade.capital_status
     *
     * @mbggenerated
     */
    public void setCapitalStatus(String capitalStatus) {
        this.capitalStatus = capitalStatus == null ? null : capitalStatus.trim();
    }

    /**
     * return the value of the database column amazon_trade.user_id
     *
     * @return the value of amazon_trade.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column amazon_trade.user_id
     *
     * @param userId the value for amazon_trade.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column amazon_trade.amount
     *
     * @return the value of amazon_trade.amount
     *
     * @mbggenerated
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * set the value of the database column amazon_trade.amount
     *
     * @param amount the value for amazon_trade.amount
     *
     * @mbggenerated
     */
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * return the value of the database column amazon_trade.currency
     *
     * @return the value of amazon_trade.currency
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * set the value of the database column amazon_trade.currency
     *
     * @param currency the value for amazon_trade.currency
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * return the value of the database column amazon_trade.memo
     *
     * @return the value of amazon_trade.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column amazon_trade.memo
     *
     * @param memo the value for amazon_trade.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column amazon_trade.remark
     *
     * @return the value of amazon_trade.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set the value of the database column amazon_trade.remark
     *
     * @param remark the value for amazon_trade.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * return the value of the database column amazon_trade.inlet
     *
     * @return the value of amazon_trade.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column amazon_trade.inlet
     *
     * @param inlet the value for amazon_trade.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column amazon_trade.bank_update_time
     *
     * @return the value of amazon_trade.bank_update_time
     *
     * @mbggenerated
     */
    public Date getBankUpdateTime() {
        return bankUpdateTime;
    }

    /**
     * set the value of the database column amazon_trade.bank_update_time
     *
     * @param bankUpdateTime the value for amazon_trade.bank_update_time
     *
     * @mbggenerated
     */
    public void setBankUpdateTime(Date bankUpdateTime) {
        this.bankUpdateTime = bankUpdateTime;
    }

    /**
     * return the value of the database column amazon_trade.raw_add_time
     *
     * @return the value of amazon_trade.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column amazon_trade.raw_add_time
     *
     * @param rawAddTime the value for amazon_trade.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column amazon_trade.raw_update_time
     *
     * @return the value of amazon_trade.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column amazon_trade.raw_update_time
     *
     * @param rawUpdateTime the value for amazon_trade.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", bizNo=").append(bizNo);
        sb.append(", depositId=").append(depositId);
        sb.append(", gid=").append(gid);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", merchOrderNo=").append(merchOrderNo);
        sb.append(", merchantAccNo=").append(merchantAccNo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", productCode=").append(productCode);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", capitalStatus=").append(capitalStatus);
        sb.append(", userId=").append(userId);
        sb.append(", amount=").append(amount);
        sb.append(", currency=").append(currency);
        sb.append(", memo=").append(memo);
        sb.append(", remark=").append(remark);
        sb.append(", inlet=").append(inlet);
        sb.append(", bankUpdateTime=").append(bankUpdateTime);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table amazon_trade
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
        AmazonTradeDO other = (AmazonTradeDO) that;
        return (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getDepositId() == null ? other.getDepositId() == null : this.getDepositId().equals(other.getDepositId()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getMerchantOrderNo() == null ? other.getMerchantOrderNo() == null : this.getMerchantOrderNo().equals(other.getMerchantOrderNo()))
            && (this.getMerchOrderNo() == null ? other.getMerchOrderNo() == null : this.getMerchOrderNo().equals(other.getMerchOrderNo()))
            && (this.getMerchantAccNo() == null ? other.getMerchantAccNo() == null : this.getMerchantAccNo().equals(other.getMerchantAccNo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getCapitalStatus() == null ? other.getCapitalStatus() == null : this.getCapitalStatus().equals(other.getCapitalStatus()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getInlet() == null ? other.getInlet() == null : this.getInlet().equals(other.getInlet()))
            && (this.getBankUpdateTime() == null ? other.getBankUpdateTime() == null : this.getBankUpdateTime().equals(other.getBankUpdateTime()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getDepositId() == null) ? 0 : getDepositId().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getMerchantOrderNo() == null) ? 0 : getMerchantOrderNo().hashCode());
        result = prime * result + ((getMerchOrderNo() == null) ? 0 : getMerchOrderNo().hashCode());
        result = prime * result + ((getMerchantAccNo() == null) ? 0 : getMerchantAccNo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getCapitalStatus() == null) ? 0 : getCapitalStatus().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getInlet() == null) ? 0 : getInlet().hashCode());
        result = prime * result + ((getBankUpdateTime() == null) ? 0 : getBankUpdateTime().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}