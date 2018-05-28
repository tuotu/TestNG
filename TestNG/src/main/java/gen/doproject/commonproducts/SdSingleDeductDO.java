/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SdSingleDeductDO.java
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

public class SdSingleDeductDO implements Serializable {
    /**
     * corresponds to the database column sd_single_deduct.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column sd_single_deduct.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column sd_single_deduct.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column sd_single_deduct.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column sd_single_deduct.deduct_amount
     *
     * @mbggenerated
     */
    private Money deductAmount;

    /**
     * corresponds to the database column sd_single_deduct.deposit_id
     *
     * @mbggenerated
     */
    private String depositId;

    /**
     * corresponds to the database column sd_single_deduct.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column sd_single_deduct.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column sd_single_deduct.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column sd_single_deduct.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column sd_single_deduct.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column sd_single_deduct.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column sd_single_deduct.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column sd_single_deduct.sign_no
     *
     * @mbggenerated
     */
    private String signNo;

    /**
     * corresponds to the database column sd_single_deduct.single_deduct_status
     *
     * @mbggenerated
     */
    private String singleDeductStatus;

    /**
     * corresponds to the database column sd_single_deduct.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column sd_single_deduct.id
     *
     * @return the value of sd_single_deduct.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column sd_single_deduct.id
     *
     * @param id the value for sd_single_deduct.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column sd_single_deduct.raw_add_time
     *
     * @return the value of sd_single_deduct.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column sd_single_deduct.raw_add_time
     *
     * @param rawAddTime the value for sd_single_deduct.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column sd_single_deduct.raw_update_time
     *
     * @return the value of sd_single_deduct.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column sd_single_deduct.raw_update_time
     *
     * @param rawUpdateTime the value for sd_single_deduct.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column sd_single_deduct.biz_no
     *
     * @return the value of sd_single_deduct.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column sd_single_deduct.biz_no
     *
     * @param bizNo the value for sd_single_deduct.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.deduct_amount
     *
     * @return the value of sd_single_deduct.deduct_amount
     *
     * @mbggenerated
     */
    public Money getDeductAmount() {
        return deductAmount;
    }

    /**
     * set the value of the database column sd_single_deduct.deduct_amount
     *
     * @param deductAmount the value for sd_single_deduct.deduct_amount
     *
     * @mbggenerated
     */
    public void setDeductAmount(Money deductAmount) {
        this.deductAmount = deductAmount;
    }

    /**
     * return the value of the database column sd_single_deduct.deposit_id
     *
     * @return the value of sd_single_deduct.deposit_id
     *
     * @mbggenerated
     */
    public String getDepositId() {
        return depositId;
    }

    /**
     * set the value of the database column sd_single_deduct.deposit_id
     *
     * @param depositId the value for sd_single_deduct.deposit_id
     *
     * @mbggenerated
     */
    public void setDepositId(String depositId) {
        this.depositId = depositId == null ? null : depositId.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.gid
     *
     * @return the value of sd_single_deduct.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column sd_single_deduct.gid
     *
     * @param gid the value for sd_single_deduct.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.memo
     *
     * @return the value of sd_single_deduct.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column sd_single_deduct.memo
     *
     * @param memo the value for sd_single_deduct.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.merchant_acc_no
     *
     * @return the value of sd_single_deduct.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column sd_single_deduct.merchant_acc_no
     *
     * @param merchantAccNo the value for sd_single_deduct.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.merchant_card_no
     *
     * @return the value of sd_single_deduct.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column sd_single_deduct.merchant_card_no
     *
     * @param merchantCardNo the value for sd_single_deduct.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.merchant_order_no
     *
     * @return the value of sd_single_deduct.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column sd_single_deduct.merchant_order_no
     *
     * @param merchantOrderNo the value for sd_single_deduct.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.merchant_user_id
     *
     * @return the value of sd_single_deduct.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column sd_single_deduct.merchant_user_id
     *
     * @param merchantUserId the value for sd_single_deduct.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.product_code
     *
     * @return the value of sd_single_deduct.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column sd_single_deduct.product_code
     *
     * @param productCode the value for sd_single_deduct.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.sign_no
     *
     * @return the value of sd_single_deduct.sign_no
     *
     * @mbggenerated
     */
    public String getSignNo() {
        return signNo;
    }

    /**
     * set the value of the database column sd_single_deduct.sign_no
     *
     * @param signNo the value for sd_single_deduct.sign_no
     *
     * @mbggenerated
     */
    public void setSignNo(String signNo) {
        this.signNo = signNo == null ? null : signNo.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.single_deduct_status
     *
     * @return the value of sd_single_deduct.single_deduct_status
     *
     * @mbggenerated
     */
    public String getSingleDeductStatus() {
        return singleDeductStatus;
    }

    /**
     * set the value of the database column sd_single_deduct.single_deduct_status
     *
     * @param singleDeductStatus the value for sd_single_deduct.single_deduct_status
     *
     * @mbggenerated
     */
    public void setSingleDeductStatus(String singleDeductStatus) {
        this.singleDeductStatus = singleDeductStatus == null ? null : singleDeductStatus.trim();
    }

    /**
     * return the value of the database column sd_single_deduct.user_id
     *
     * @return the value of sd_single_deduct.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column sd_single_deduct.user_id
     *
     * @param userId the value for sd_single_deduct.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", deductAmount=").append(deductAmount);
        sb.append(", depositId=").append(depositId);
        sb.append(", gid=").append(gid);
        sb.append(", memo=").append(memo);
        sb.append(", merchantAccNo=").append(merchantAccNo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", productCode=").append(productCode);
        sb.append(", signNo=").append(signNo);
        sb.append(", singleDeductStatus=").append(singleDeductStatus);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table sd_single_deduct
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
        SdSingleDeductDO other = (SdSingleDeductDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getDeductAmount() == null ? other.getDeductAmount() == null : this.getDeductAmount().equals(other.getDeductAmount()))
            && (this.getDepositId() == null ? other.getDepositId() == null : this.getDepositId().equals(other.getDepositId()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantAccNo() == null ? other.getMerchantAccNo() == null : this.getMerchantAccNo().equals(other.getMerchantAccNo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantOrderNo() == null ? other.getMerchantOrderNo() == null : this.getMerchantOrderNo().equals(other.getMerchantOrderNo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getSignNo() == null ? other.getSignNo() == null : this.getSignNo().equals(other.getSignNo()))
            && (this.getSingleDeductStatus() == null ? other.getSingleDeductStatus() == null : this.getSingleDeductStatus().equals(other.getSingleDeductStatus()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getDeductAmount() == null) ? 0 : getDeductAmount().hashCode());
        result = prime * result + ((getDepositId() == null) ? 0 : getDepositId().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantAccNo() == null) ? 0 : getMerchantAccNo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantOrderNo() == null) ? 0 : getMerchantOrderNo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getSignNo() == null) ? 0 : getSignNo().hashCode());
        result = prime * result + ((getSingleDeductStatus() == null) ? 0 : getSingleDeductStatus().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}