/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferConfigurationDO.java
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

public class TransferConfigurationDO implements Serializable {
    /**
     * corresponds to the database column transfer_configuration.product_id
     *
     * @mbggenerated
     */
    private Long productId;

    /**
     * corresponds to the database column transfer_configuration.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column transfer_configuration.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column transfer_configuration.charge_code
     *
     * @mbggenerated
     */
    private String chargeCode;

    /**
     * corresponds to the database column transfer_configuration.charge_status
     *
     * @mbggenerated
     */
    private String chargeStatus;

    /**
     * corresponds to the database column transfer_configuration.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column transfer_configuration.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column transfer_configuration.merchant_id
     *
     * @mbggenerated
     */
    private String merchantId;

    /**
     * corresponds to the database column transfer_configuration.normal_status
     *
     * @mbggenerated
     */
    private String normalStatus;

    /**
     * corresponds to the database column transfer_configuration.operator_name
     *
     * @mbggenerated
     */
    private String operatorName;

    /**
     * corresponds to the database column transfer_configuration.parent_product_code
     *
     * @mbggenerated
     */
    private String parentProductCode;

    /**
     * corresponds to the database column transfer_configuration.parent_product_name
     *
     * @mbggenerated
     */
    private String parentProductName;

    /**
     * corresponds to the database column transfer_configuration.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column transfer_configuration.product_name
     *
     * @mbggenerated
     */
    private String productName;

    /**
     * corresponds to the database column transfer_configuration.transfer_method_codes
     *
     * @mbggenerated
     */
    private String transferMethodCodes;

    /**
     * corresponds to the database column transfer_configuration.transfer_product
     *
     * @mbggenerated
     */
    private String transferProduct;

    /**
     * corresponds to the database column transfer_configuration.verify_limit
     *
     * @mbggenerated
     */
    private Integer verifyLimit;

    /**
     * corresponds to the database column transfer_configuration.verify_way
     *
     * @mbggenerated
     */
    private String verifyWay;

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column transfer_configuration.product_id
     *
     * @return the value of transfer_configuration.product_id
     *
     * @mbggenerated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * set the value of the database column transfer_configuration.product_id
     *
     * @param productId the value for transfer_configuration.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * return the value of the database column transfer_configuration.raw_add_time
     *
     * @return the value of transfer_configuration.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column transfer_configuration.raw_add_time
     *
     * @param rawAddTime the value for transfer_configuration.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column transfer_configuration.raw_update_time
     *
     * @return the value of transfer_configuration.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column transfer_configuration.raw_update_time
     *
     * @param rawUpdateTime the value for transfer_configuration.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column transfer_configuration.charge_code
     *
     * @return the value of transfer_configuration.charge_code
     *
     * @mbggenerated
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * set the value of the database column transfer_configuration.charge_code
     *
     * @param chargeCode the value for transfer_configuration.charge_code
     *
     * @mbggenerated
     */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode == null ? null : chargeCode.trim();
    }

    /**
     * return the value of the database column transfer_configuration.charge_status
     *
     * @return the value of transfer_configuration.charge_status
     *
     * @mbggenerated
     */
    public String getChargeStatus() {
        return chargeStatus;
    }

    /**
     * set the value of the database column transfer_configuration.charge_status
     *
     * @param chargeStatus the value for transfer_configuration.charge_status
     *
     * @mbggenerated
     */
    public void setChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus == null ? null : chargeStatus.trim();
    }

    /**
     * return the value of the database column transfer_configuration.gid
     *
     * @return the value of transfer_configuration.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column transfer_configuration.gid
     *
     * @param gid the value for transfer_configuration.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column transfer_configuration.memo
     *
     * @return the value of transfer_configuration.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column transfer_configuration.memo
     *
     * @param memo the value for transfer_configuration.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column transfer_configuration.merchant_id
     *
     * @return the value of transfer_configuration.merchant_id
     *
     * @mbggenerated
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * set the value of the database column transfer_configuration.merchant_id
     *
     * @param merchantId the value for transfer_configuration.merchant_id
     *
     * @mbggenerated
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * return the value of the database column transfer_configuration.normal_status
     *
     * @return the value of transfer_configuration.normal_status
     *
     * @mbggenerated
     */
    public String getNormalStatus() {
        return normalStatus;
    }

    /**
     * set the value of the database column transfer_configuration.normal_status
     *
     * @param normalStatus the value for transfer_configuration.normal_status
     *
     * @mbggenerated
     */
    public void setNormalStatus(String normalStatus) {
        this.normalStatus = normalStatus == null ? null : normalStatus.trim();
    }

    /**
     * return the value of the database column transfer_configuration.operator_name
     *
     * @return the value of transfer_configuration.operator_name
     *
     * @mbggenerated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * set the value of the database column transfer_configuration.operator_name
     *
     * @param operatorName the value for transfer_configuration.operator_name
     *
     * @mbggenerated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * return the value of the database column transfer_configuration.parent_product_code
     *
     * @return the value of transfer_configuration.parent_product_code
     *
     * @mbggenerated
     */
    public String getParentProductCode() {
        return parentProductCode;
    }

    /**
     * set the value of the database column transfer_configuration.parent_product_code
     *
     * @param parentProductCode the value for transfer_configuration.parent_product_code
     *
     * @mbggenerated
     */
    public void setParentProductCode(String parentProductCode) {
        this.parentProductCode = parentProductCode == null ? null : parentProductCode.trim();
    }

    /**
     * return the value of the database column transfer_configuration.parent_product_name
     *
     * @return the value of transfer_configuration.parent_product_name
     *
     * @mbggenerated
     */
    public String getParentProductName() {
        return parentProductName;
    }

    /**
     * set the value of the database column transfer_configuration.parent_product_name
     *
     * @param parentProductName the value for transfer_configuration.parent_product_name
     *
     * @mbggenerated
     */
    public void setParentProductName(String parentProductName) {
        this.parentProductName = parentProductName == null ? null : parentProductName.trim();
    }

    /**
     * return the value of the database column transfer_configuration.product_code
     *
     * @return the value of transfer_configuration.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column transfer_configuration.product_code
     *
     * @param productCode the value for transfer_configuration.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column transfer_configuration.product_name
     *
     * @return the value of transfer_configuration.product_name
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set the value of the database column transfer_configuration.product_name
     *
     * @param productName the value for transfer_configuration.product_name
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * return the value of the database column transfer_configuration.transfer_method_codes
     *
     * @return the value of transfer_configuration.transfer_method_codes
     *
     * @mbggenerated
     */
    public String getTransferMethodCodes() {
        return transferMethodCodes;
    }

    /**
     * set the value of the database column transfer_configuration.transfer_method_codes
     *
     * @param transferMethodCodes the value for transfer_configuration.transfer_method_codes
     *
     * @mbggenerated
     */
    public void setTransferMethodCodes(String transferMethodCodes) {
        this.transferMethodCodes = transferMethodCodes == null ? null : transferMethodCodes.trim();
    }

    /**
     * return the value of the database column transfer_configuration.transfer_product
     *
     * @return the value of transfer_configuration.transfer_product
     *
     * @mbggenerated
     */
    public String getTransferProduct() {
        return transferProduct;
    }

    /**
     * set the value of the database column transfer_configuration.transfer_product
     *
     * @param transferProduct the value for transfer_configuration.transfer_product
     *
     * @mbggenerated
     */
    public void setTransferProduct(String transferProduct) {
        this.transferProduct = transferProduct == null ? null : transferProduct.trim();
    }

    /**
     * return the value of the database column transfer_configuration.verify_limit
     *
     * @return the value of transfer_configuration.verify_limit
     *
     * @mbggenerated
     */
    public Integer getVerifyLimit() {
        return verifyLimit;
    }

    /**
     * set the value of the database column transfer_configuration.verify_limit
     *
     * @param verifyLimit the value for transfer_configuration.verify_limit
     *
     * @mbggenerated
     */
    public void setVerifyLimit(Integer verifyLimit) {
        this.verifyLimit = verifyLimit;
    }

    /**
     * return the value of the database column transfer_configuration.verify_way
     *
     * @return the value of transfer_configuration.verify_way
     *
     * @mbggenerated
     */
    public String getVerifyWay() {
        return verifyWay;
    }

    /**
     * set the value of the database column transfer_configuration.verify_way
     *
     * @param verifyWay the value for transfer_configuration.verify_way
     *
     * @mbggenerated
     */
    public void setVerifyWay(String verifyWay) {
        this.verifyWay = verifyWay == null ? null : verifyWay.trim();
    }

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", productId=").append(productId);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", chargeCode=").append(chargeCode);
        sb.append(", chargeStatus=").append(chargeStatus);
        sb.append(", gid=").append(gid);
        sb.append(", memo=").append(memo);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", normalStatus=").append(normalStatus);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", parentProductCode=").append(parentProductCode);
        sb.append(", parentProductName=").append(parentProductName);
        sb.append(", productCode=").append(productCode);
        sb.append(", productName=").append(productName);
        sb.append(", transferMethodCodes=").append(transferMethodCodes);
        sb.append(", transferProduct=").append(transferProduct);
        sb.append(", verifyLimit=").append(verifyLimit);
        sb.append(", verifyWay=").append(verifyWay);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table transfer_configuration
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
        TransferConfigurationDO other = (TransferConfigurationDO) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getChargeCode() == null ? other.getChargeCode() == null : this.getChargeCode().equals(other.getChargeCode()))
            && (this.getChargeStatus() == null ? other.getChargeStatus() == null : this.getChargeStatus().equals(other.getChargeStatus()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getNormalStatus() == null ? other.getNormalStatus() == null : this.getNormalStatus().equals(other.getNormalStatus()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getParentProductCode() == null ? other.getParentProductCode() == null : this.getParentProductCode().equals(other.getParentProductCode()))
            && (this.getParentProductName() == null ? other.getParentProductName() == null : this.getParentProductName().equals(other.getParentProductName()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getTransferMethodCodes() == null ? other.getTransferMethodCodes() == null : this.getTransferMethodCodes().equals(other.getTransferMethodCodes()))
            && (this.getTransferProduct() == null ? other.getTransferProduct() == null : this.getTransferProduct().equals(other.getTransferProduct()))
            && (this.getVerifyLimit() == null ? other.getVerifyLimit() == null : this.getVerifyLimit().equals(other.getVerifyLimit()))
            && (this.getVerifyWay() == null ? other.getVerifyWay() == null : this.getVerifyWay().equals(other.getVerifyWay()));
    }

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getChargeCode() == null) ? 0 : getChargeCode().hashCode());
        result = prime * result + ((getChargeStatus() == null) ? 0 : getChargeStatus().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getNormalStatus() == null) ? 0 : getNormalStatus().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getParentProductCode() == null) ? 0 : getParentProductCode().hashCode());
        result = prime * result + ((getParentProductName() == null) ? 0 : getParentProductName().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getTransferMethodCodes() == null) ? 0 : getTransferMethodCodes().hashCode());
        result = prime * result + ((getTransferProduct() == null) ? 0 : getTransferProduct().hashCode());
        result = prime * result + ((getVerifyLimit() == null) ? 0 : getVerifyLimit().hashCode());
        result = prime * result + ((getVerifyWay() == null) ? 0 : getVerifyWay().hashCode());
        return result;
    }
}