/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayChannelDO.java
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

public class FastPayChannelDO implements Serializable {
    /**
     * corresponds to the database column fast_pay_channel.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column fast_pay_channel.merchant_id
     *
     * @mbggenerated
     */
    private String merchantId;

    /**
     * corresponds to the database column fast_pay_channel.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column fast_pay_channel.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * corresponds to the database column fast_pay_channel.method_code
     *
     * @mbggenerated
     */
    private String methodCode;

    /**
     * corresponds to the database column fast_pay_channel.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column fast_pay_channel.mutable_type
     *
     * @mbggenerated
     */
    private String mutableType;

    /**
     * corresponds to the database column fast_pay_channel.type
     *
     * @mbggenerated
     */
    private String type;

    /**
     * corresponds to the database column fast_pay_channel.operator_name
     *
     * @mbggenerated
     */
    private String operatorName;

    /**
     * corresponds to the database column fast_pay_channel.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay_channel.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay_channel.id
     *
     * @return the value of fast_pay_channel.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay_channel.id
     *
     * @param id the value for fast_pay_channel.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay_channel.merchant_id
     *
     * @return the value of fast_pay_channel.merchant_id
     *
     * @mbggenerated
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * set the value of the database column fast_pay_channel.merchant_id
     *
     * @param merchantId the value for fast_pay_channel.merchant_id
     *
     * @mbggenerated
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * return the value of the database column fast_pay_channel.product_code
     *
     * @return the value of fast_pay_channel.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column fast_pay_channel.product_code
     *
     * @param productCode the value for fast_pay_channel.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column fast_pay_channel.source
     *
     * @return the value of fast_pay_channel.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * set the value of the database column fast_pay_channel.source
     *
     * @param source the value for fast_pay_channel.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * return the value of the database column fast_pay_channel.method_code
     *
     * @return the value of fast_pay_channel.method_code
     *
     * @mbggenerated
     */
    public String getMethodCode() {
        return methodCode;
    }

    /**
     * set the value of the database column fast_pay_channel.method_code
     *
     * @param methodCode the value for fast_pay_channel.method_code
     *
     * @mbggenerated
     */
    public void setMethodCode(String methodCode) {
        this.methodCode = methodCode == null ? null : methodCode.trim();
    }

    /**
     * return the value of the database column fast_pay_channel.bank_code
     *
     * @return the value of fast_pay_channel.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column fast_pay_channel.bank_code
     *
     * @param bankCode the value for fast_pay_channel.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column fast_pay_channel.mutable_type
     *
     * @return the value of fast_pay_channel.mutable_type
     *
     * @mbggenerated
     */
    public String getMutableType() {
        return mutableType;
    }

    /**
     * set the value of the database column fast_pay_channel.mutable_type
     *
     * @param mutableType the value for fast_pay_channel.mutable_type
     *
     * @mbggenerated
     */
    public void setMutableType(String mutableType) {
        this.mutableType = mutableType == null ? null : mutableType.trim();
    }

    /**
     * return the value of the database column fast_pay_channel.type
     *
     * @return the value of fast_pay_channel.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * set the value of the database column fast_pay_channel.type
     *
     * @param type the value for fast_pay_channel.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * return the value of the database column fast_pay_channel.operator_name
     *
     * @return the value of fast_pay_channel.operator_name
     *
     * @mbggenerated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * set the value of the database column fast_pay_channel.operator_name
     *
     * @param operatorName the value for fast_pay_channel.operator_name
     *
     * @mbggenerated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * return the value of the database column fast_pay_channel.raw_add_time
     *
     * @return the value of fast_pay_channel.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay_channel.raw_add_time
     *
     * @param rawAddTime the value for fast_pay_channel.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay_channel.raw_update_time
     *
     * @return the value of fast_pay_channel.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay_channel.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay_channel.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table fast_pay_channel
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
        sb.append(", productCode=").append(productCode);
        sb.append(", source=").append(source);
        sb.append(", methodCode=").append(methodCode);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", mutableType=").append(mutableType);
        sb.append(", type=").append(type);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay_channel
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
        FastPayChannelDO other = (FastPayChannelDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getMethodCode() == null ? other.getMethodCode() == null : this.getMethodCode().equals(other.getMethodCode()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getMutableType() == null ? other.getMutableType() == null : this.getMutableType().equals(other.getMutableType()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getMethodCode() == null) ? 0 : getMethodCode().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getMutableType() == null) ? 0 : getMutableType().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}