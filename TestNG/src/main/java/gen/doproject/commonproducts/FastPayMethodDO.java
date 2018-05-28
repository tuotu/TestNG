/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayMethodDO.java
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

public class FastPayMethodDO implements Serializable {
    /**
     * corresponds to the database column fast_pay_method.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column fast_pay_method.method_code
     *
     * @mbggenerated
     */
    private String methodCode;

    /**
     * corresponds to the database column fast_pay_method.method_name
     *
     * @mbggenerated
     */
    private String methodName;

    /**
     * corresponds to the database column fast_pay_method.transaction_type
     *
     * @mbggenerated
     */
    private String transactionType;

    /**
     * corresponds to the database column fast_pay_method.sub_transaction_type
     *
     * @mbggenerated
     */
    private String subTransactionType;

    /**
     * corresponds to the database column fast_pay_method.personal_corporate_type
     *
     * @mbggenerated
     */
    private String personalCorporateType;

    /**
     * corresponds to the database column fast_pay_method.card_type
     *
     * @mbggenerated
     */
    private String cardType;

    /**
     * corresponds to the database column fast_pay_method.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * corresponds to the database column fast_pay_method.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column fast_pay_method.operator_name
     *
     * @mbggenerated
     */
    private String operatorName;

    /**
     * corresponds to the database column fast_pay_method.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay_method.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay_method.id
     *
     * @return the value of fast_pay_method.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay_method.id
     *
     * @param id the value for fast_pay_method.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay_method.method_code
     *
     * @return the value of fast_pay_method.method_code
     *
     * @mbggenerated
     */
    public String getMethodCode() {
        return methodCode;
    }

    /**
     * set the value of the database column fast_pay_method.method_code
     *
     * @param methodCode the value for fast_pay_method.method_code
     *
     * @mbggenerated
     */
    public void setMethodCode(String methodCode) {
        this.methodCode = methodCode == null ? null : methodCode.trim();
    }

    /**
     * return the value of the database column fast_pay_method.method_name
     *
     * @return the value of fast_pay_method.method_name
     *
     * @mbggenerated
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * set the value of the database column fast_pay_method.method_name
     *
     * @param methodName the value for fast_pay_method.method_name
     *
     * @mbggenerated
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * return the value of the database column fast_pay_method.transaction_type
     *
     * @return the value of fast_pay_method.transaction_type
     *
     * @mbggenerated
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * set the value of the database column fast_pay_method.transaction_type
     *
     * @param transactionType the value for fast_pay_method.transaction_type
     *
     * @mbggenerated
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType == null ? null : transactionType.trim();
    }

    /**
     * return the value of the database column fast_pay_method.sub_transaction_type
     *
     * @return the value of fast_pay_method.sub_transaction_type
     *
     * @mbggenerated
     */
    public String getSubTransactionType() {
        return subTransactionType;
    }

    /**
     * set the value of the database column fast_pay_method.sub_transaction_type
     *
     * @param subTransactionType the value for fast_pay_method.sub_transaction_type
     *
     * @mbggenerated
     */
    public void setSubTransactionType(String subTransactionType) {
        this.subTransactionType = subTransactionType == null ? null : subTransactionType.trim();
    }

    /**
     * return the value of the database column fast_pay_method.personal_corporate_type
     *
     * @return the value of fast_pay_method.personal_corporate_type
     *
     * @mbggenerated
     */
    public String getPersonalCorporateType() {
        return personalCorporateType;
    }

    /**
     * set the value of the database column fast_pay_method.personal_corporate_type
     *
     * @param personalCorporateType the value for fast_pay_method.personal_corporate_type
     *
     * @mbggenerated
     */
    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType == null ? null : personalCorporateType.trim();
    }

    /**
     * return the value of the database column fast_pay_method.card_type
     *
     * @return the value of fast_pay_method.card_type
     *
     * @mbggenerated
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * set the value of the database column fast_pay_method.card_type
     *
     * @param cardType the value for fast_pay_method.card_type
     *
     * @mbggenerated
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    /**
     * return the value of the database column fast_pay_method.status
     *
     * @return the value of fast_pay_method.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * set the value of the database column fast_pay_method.status
     *
     * @param status the value for fast_pay_method.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * return the value of the database column fast_pay_method.memo
     *
     * @return the value of fast_pay_method.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column fast_pay_method.memo
     *
     * @param memo the value for fast_pay_method.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column fast_pay_method.operator_name
     *
     * @return the value of fast_pay_method.operator_name
     *
     * @mbggenerated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * set the value of the database column fast_pay_method.operator_name
     *
     * @param operatorName the value for fast_pay_method.operator_name
     *
     * @mbggenerated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * return the value of the database column fast_pay_method.raw_add_time
     *
     * @return the value of fast_pay_method.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay_method.raw_add_time
     *
     * @param rawAddTime the value for fast_pay_method.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay_method.raw_update_time
     *
     * @return the value of fast_pay_method.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay_method.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay_method.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", methodCode=").append(methodCode);
        sb.append(", methodName=").append(methodName);
        sb.append(", transactionType=").append(transactionType);
        sb.append(", subTransactionType=").append(subTransactionType);
        sb.append(", personalCorporateType=").append(personalCorporateType);
        sb.append(", cardType=").append(cardType);
        sb.append(", status=").append(status);
        sb.append(", memo=").append(memo);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay_method
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
        FastPayMethodDO other = (FastPayMethodDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMethodCode() == null ? other.getMethodCode() == null : this.getMethodCode().equals(other.getMethodCode()))
            && (this.getMethodName() == null ? other.getMethodName() == null : this.getMethodName().equals(other.getMethodName()))
            && (this.getTransactionType() == null ? other.getTransactionType() == null : this.getTransactionType().equals(other.getTransactionType()))
            && (this.getSubTransactionType() == null ? other.getSubTransactionType() == null : this.getSubTransactionType().equals(other.getSubTransactionType()))
            && (this.getPersonalCorporateType() == null ? other.getPersonalCorporateType() == null : this.getPersonalCorporateType().equals(other.getPersonalCorporateType()))
            && (this.getCardType() == null ? other.getCardType() == null : this.getCardType().equals(other.getCardType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMethodCode() == null) ? 0 : getMethodCode().hashCode());
        result = prime * result + ((getMethodName() == null) ? 0 : getMethodName().hashCode());
        result = prime * result + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        result = prime * result + ((getSubTransactionType() == null) ? 0 : getSubTransactionType().hashCode());
        result = prime * result + ((getPersonalCorporateType() == null) ? 0 : getPersonalCorporateType().hashCode());
        result = prime * result + ((getCardType() == null) ? 0 : getCardType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}