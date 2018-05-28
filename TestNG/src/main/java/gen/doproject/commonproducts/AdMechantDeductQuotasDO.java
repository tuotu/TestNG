/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AdMechantDeductQuotasDO.java
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

public class AdMechantDeductQuotasDO implements Serializable {
    /**
     * corresponds to the database column ad_mechant_deduct_quotas.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column ad_mechant_deduct_quotas.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column ad_mechant_deduct_quotas.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column ad_mechant_deduct_quotas.bussiness_product
     *
     * @mbggenerated
     */
    private String bussinessProduct;

    /**
     * corresponds to the database column ad_mechant_deduct_quotas.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * corresponds to the database column ad_mechant_deduct_quotas.enable
     *
     * @mbggenerated
     */
    private Boolean enable;

    /**
     * corresponds to the database column ad_mechant_deduct_quotas.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column ad_mechant_deduct_quotas.merchant_name
     *
     * @mbggenerated
     */
    private String merchantName;

    /**
     * corresponds to the database column ad_mechant_deduct_quotas.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column ad_mechant_deduct_quotas.quotas
     *
     * @mbggenerated
     */
    private String quotas;

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column ad_mechant_deduct_quotas.id
     *
     * @return the value of ad_mechant_deduct_quotas.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.id
     *
     * @param id the value for ad_mechant_deduct_quotas.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column ad_mechant_deduct_quotas.raw_add_time
     *
     * @return the value of ad_mechant_deduct_quotas.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.raw_add_time
     *
     * @param rawAddTime the value for ad_mechant_deduct_quotas.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column ad_mechant_deduct_quotas.raw_update_time
     *
     * @return the value of ad_mechant_deduct_quotas.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.raw_update_time
     *
     * @param rawUpdateTime the value for ad_mechant_deduct_quotas.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column ad_mechant_deduct_quotas.bussiness_product
     *
     * @return the value of ad_mechant_deduct_quotas.bussiness_product
     *
     * @mbggenerated
     */
    public String getBussinessProduct() {
        return bussinessProduct;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.bussiness_product
     *
     * @param bussinessProduct the value for ad_mechant_deduct_quotas.bussiness_product
     *
     * @mbggenerated
     */
    public void setBussinessProduct(String bussinessProduct) {
        this.bussinessProduct = bussinessProduct == null ? null : bussinessProduct.trim();
    }

    /**
     * return the value of the database column ad_mechant_deduct_quotas.creator
     *
     * @return the value of ad_mechant_deduct_quotas.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.creator
     *
     * @param creator the value for ad_mechant_deduct_quotas.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * return the value of the database column ad_mechant_deduct_quotas.enable
     *
     * @return the value of ad_mechant_deduct_quotas.enable
     *
     * @mbggenerated
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.enable
     *
     * @param enable the value for ad_mechant_deduct_quotas.enable
     *
     * @mbggenerated
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * return the value of the database column ad_mechant_deduct_quotas.memo
     *
     * @return the value of ad_mechant_deduct_quotas.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.memo
     *
     * @param memo the value for ad_mechant_deduct_quotas.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column ad_mechant_deduct_quotas.merchant_name
     *
     * @return the value of ad_mechant_deduct_quotas.merchant_name
     *
     * @mbggenerated
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.merchant_name
     *
     * @param merchantName the value for ad_mechant_deduct_quotas.merchant_name
     *
     * @mbggenerated
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    /**
     * return the value of the database column ad_mechant_deduct_quotas.merchant_user_id
     *
     * @return the value of ad_mechant_deduct_quotas.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.merchant_user_id
     *
     * @param merchantUserId the value for ad_mechant_deduct_quotas.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column ad_mechant_deduct_quotas.quotas
     *
     * @return the value of ad_mechant_deduct_quotas.quotas
     *
     * @mbggenerated
     */
    public String getQuotas() {
        return quotas;
    }

    /**
     * set the value of the database column ad_mechant_deduct_quotas.quotas
     *
     * @param quotas the value for ad_mechant_deduct_quotas.quotas
     *
     * @mbggenerated
     */
    public void setQuotas(String quotas) {
        this.quotas = quotas == null ? null : quotas.trim();
    }

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
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
        sb.append(", bussinessProduct=").append(bussinessProduct);
        sb.append(", creator=").append(creator);
        sb.append(", enable=").append(enable);
        sb.append(", memo=").append(memo);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", quotas=").append(quotas);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
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
        AdMechantDeductQuotasDO other = (AdMechantDeductQuotasDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getBussinessProduct() == null ? other.getBussinessProduct() == null : this.getBussinessProduct().equals(other.getBussinessProduct()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getQuotas() == null ? other.getQuotas() == null : this.getQuotas().equals(other.getQuotas()));
    }

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
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
        result = prime * result + ((getBussinessProduct() == null) ? 0 : getBussinessProduct().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getQuotas() == null) ? 0 : getQuotas().hashCode());
        return result;
    }
}