/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayBankDO.java
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

public class FastPayBankDO implements Serializable {
    /**
     * corresponds to the database column fast_pay_bank.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column fast_pay_bank.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column fast_pay_bank.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * corresponds to the database column fast_pay_bank.operator_name
     *
     * @mbggenerated
     */
    private String operatorName;

    /**
     * corresponds to the database column fast_pay_bank.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay_bank.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay_bank.id
     *
     * @return the value of fast_pay_bank.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay_bank.id
     *
     * @param id the value for fast_pay_bank.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay_bank.bank_code
     *
     * @return the value of fast_pay_bank.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column fast_pay_bank.bank_code
     *
     * @param bankCode the value for fast_pay_bank.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column fast_pay_bank.bank_name
     *
     * @return the value of fast_pay_bank.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set the value of the database column fast_pay_bank.bank_name
     *
     * @param bankName the value for fast_pay_bank.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * return the value of the database column fast_pay_bank.operator_name
     *
     * @return the value of fast_pay_bank.operator_name
     *
     * @mbggenerated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * set the value of the database column fast_pay_bank.operator_name
     *
     * @param operatorName the value for fast_pay_bank.operator_name
     *
     * @mbggenerated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * return the value of the database column fast_pay_bank.raw_add_time
     *
     * @return the value of fast_pay_bank.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay_bank.raw_add_time
     *
     * @param rawAddTime the value for fast_pay_bank.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay_bank.raw_update_time
     *
     * @return the value of fast_pay_bank.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay_bank.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay_bank.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay_bank
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
        FastPayBankDO other = (FastPayBankDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}