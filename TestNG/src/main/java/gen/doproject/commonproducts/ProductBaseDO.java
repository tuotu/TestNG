/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductBaseDO.java
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

public class ProductBaseDO implements Serializable {
    /**
     * corresponds to the database column product_base.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column product_base.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column product_base.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column product_base.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column product_base.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column product_base.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column product_base.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column product_base.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column product_base.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column product_base.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column product_base.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column product_base.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column product_base.biz_no
     *
     * @return the value of product_base.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column product_base.biz_no
     *
     * @param bizNo the value for product_base.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column product_base.raw_add_time
     *
     * @return the value of product_base.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column product_base.raw_add_time
     *
     * @param rawAddTime the value for product_base.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column product_base.raw_update_time
     *
     * @return the value of product_base.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column product_base.raw_update_time
     *
     * @param rawUpdateTime the value for product_base.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column product_base.gid
     *
     * @return the value of product_base.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column product_base.gid
     *
     * @param gid the value for product_base.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column product_base.inlet
     *
     * @return the value of product_base.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column product_base.inlet
     *
     * @param inlet the value for product_base.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column product_base.memo
     *
     * @return the value of product_base.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column product_base.memo
     *
     * @param memo the value for product_base.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column product_base.merchant_acc_no
     *
     * @return the value of product_base.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column product_base.merchant_acc_no
     *
     * @param merchantAccNo the value for product_base.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column product_base.merchant_card_no
     *
     * @return the value of product_base.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column product_base.merchant_card_no
     *
     * @param merchantCardNo the value for product_base.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column product_base.merchant_order_no
     *
     * @return the value of product_base.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column product_base.merchant_order_no
     *
     * @param merchantOrderNo the value for product_base.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column product_base.merchant_user_id
     *
     * @return the value of product_base.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column product_base.merchant_user_id
     *
     * @param merchantUserId the value for product_base.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column product_base.product_code
     *
     * @return the value of product_base.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column product_base.product_code
     *
     * @param productCode the value for product_base.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column product_base.product_status
     *
     * @return the value of product_base.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column product_base.product_status
     *
     * @param productStatus the value for product_base.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * corresponds to the database table product_base
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
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", productCode=").append(productCode);
        sb.append(", productStatus=").append(productStatus);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table product_base
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
        ProductBaseDO other = (ProductBaseDO) that;
        return (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
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
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()));
    }

    /**
     * corresponds to the database table product_base
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
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        return result;
    }
}