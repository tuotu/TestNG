/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayMerchantDO.java
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

public class FastPayMerchantDO implements Serializable {
    /**
     * corresponds to the database column fast_pay_merchant.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column fast_pay_merchant.merchant_id
     *
     * @mbggenerated
     */
    private String merchantId;

    /**
     * corresponds to the database column fast_pay_merchant.merchant_name
     *
     * @mbggenerated
     */
    private String merchantName;

    /**
     * corresponds to the database column fast_pay_merchant.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column fast_pay_merchant.product_name
     *
     * @mbggenerated
     */
    private String productName;

    /**
     * corresponds to the database column fast_pay_merchant.sources
     *
     * @mbggenerated
     */
    private String sources;

    /**
     * corresponds to the database column fast_pay_merchant.method_codes
     *
     * @mbggenerated
     */
    private String methodCodes;

    /**
     * corresponds to the database column fast_pay_merchant.operator_name
     *
     * @mbggenerated
     */
    private String operatorName;

    /**
     * corresponds to the database column fast_pay_merchant.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay_merchant.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay_merchant.id
     *
     * @return the value of fast_pay_merchant.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay_merchant.id
     *
     * @param id the value for fast_pay_merchant.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay_merchant.merchant_id
     *
     * @return the value of fast_pay_merchant.merchant_id
     *
     * @mbggenerated
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * set the value of the database column fast_pay_merchant.merchant_id
     *
     * @param merchantId the value for fast_pay_merchant.merchant_id
     *
     * @mbggenerated
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * return the value of the database column fast_pay_merchant.merchant_name
     *
     * @return the value of fast_pay_merchant.merchant_name
     *
     * @mbggenerated
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * set the value of the database column fast_pay_merchant.merchant_name
     *
     * @param merchantName the value for fast_pay_merchant.merchant_name
     *
     * @mbggenerated
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    /**
     * return the value of the database column fast_pay_merchant.product_code
     *
     * @return the value of fast_pay_merchant.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column fast_pay_merchant.product_code
     *
     * @param productCode the value for fast_pay_merchant.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column fast_pay_merchant.product_name
     *
     * @return the value of fast_pay_merchant.product_name
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set the value of the database column fast_pay_merchant.product_name
     *
     * @param productName the value for fast_pay_merchant.product_name
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * return the value of the database column fast_pay_merchant.sources
     *
     * @return the value of fast_pay_merchant.sources
     *
     * @mbggenerated
     */
    public String getSources() {
        return sources;
    }

    /**
     * set the value of the database column fast_pay_merchant.sources
     *
     * @param sources the value for fast_pay_merchant.sources
     *
     * @mbggenerated
     */
    public void setSources(String sources) {
        this.sources = sources == null ? null : sources.trim();
    }

    /**
     * return the value of the database column fast_pay_merchant.method_codes
     *
     * @return the value of fast_pay_merchant.method_codes
     *
     * @mbggenerated
     */
    public String getMethodCodes() {
        return methodCodes;
    }

    /**
     * set the value of the database column fast_pay_merchant.method_codes
     *
     * @param methodCodes the value for fast_pay_merchant.method_codes
     *
     * @mbggenerated
     */
    public void setMethodCodes(String methodCodes) {
        this.methodCodes = methodCodes == null ? null : methodCodes.trim();
    }

    /**
     * return the value of the database column fast_pay_merchant.operator_name
     *
     * @return the value of fast_pay_merchant.operator_name
     *
     * @mbggenerated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * set the value of the database column fast_pay_merchant.operator_name
     *
     * @param operatorName the value for fast_pay_merchant.operator_name
     *
     * @mbggenerated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * return the value of the database column fast_pay_merchant.raw_add_time
     *
     * @return the value of fast_pay_merchant.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay_merchant.raw_add_time
     *
     * @param rawAddTime the value for fast_pay_merchant.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay_merchant.raw_update_time
     *
     * @return the value of fast_pay_merchant.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay_merchant.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay_merchant.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", productCode=").append(productCode);
        sb.append(", productName=").append(productName);
        sb.append(", sources=").append(sources);
        sb.append(", methodCodes=").append(methodCodes);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay_merchant
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
        FastPayMerchantDO other = (FastPayMerchantDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getSources() == null ? other.getSources() == null : this.getSources().equals(other.getSources()))
            && (this.getMethodCodes() == null ? other.getMethodCodes() == null : this.getMethodCodes().equals(other.getMethodCodes()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getSources() == null) ? 0 : getSources().hashCode());
        result = prime * result + ((getMethodCodes() == null) ? 0 : getMethodCodes().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}