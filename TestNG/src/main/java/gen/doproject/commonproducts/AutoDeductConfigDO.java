/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoDeductConfigDO.java
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

public class AutoDeductConfigDO implements Serializable {
    /**
     * corresponds to the database column auto_deduct_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column auto_deduct_config.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column auto_deduct_config.bank_ele_acc_no
     *
     * @mbggenerated
     */
    private String bankEleAccNo;

    /**
     * corresponds to the database column auto_deduct_config.bank_ele_acc_name
     *
     * @mbggenerated
     */
    private String bankEleAccName;

    /**
     * corresponds to the database column auto_deduct_config.bank_account_no
     *
     * @mbggenerated
     */
    private String bankAccountNo;

    /**
     * corresponds to the database column auto_deduct_config.cert_no
     *
     * @mbggenerated
     */
    private String certNo;

    /**
     * corresponds to the database column auto_deduct_config.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column auto_deduct_config.bank_account_name
     *
     * @mbggenerated
     */
    private String bankAccountName;

    /**
     * corresponds to the database column auto_deduct_config.bank_card_type
     *
     * @mbggenerated
     */
    private String bankCardType;

    /**
     * corresponds to the database column auto_deduct_config.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column auto_deduct_config.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column auto_deduct_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column auto_deduct_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column auto_deduct_config.id
     *
     * @return the value of auto_deduct_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column auto_deduct_config.id
     *
     * @param id the value for auto_deduct_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column auto_deduct_config.user_id
     *
     * @return the value of auto_deduct_config.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column auto_deduct_config.user_id
     *
     * @param userId the value for auto_deduct_config.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.bank_ele_acc_no
     *
     * @return the value of auto_deduct_config.bank_ele_acc_no
     *
     * @mbggenerated
     */
    public String getBankEleAccNo() {
        return bankEleAccNo;
    }

    /**
     * set the value of the database column auto_deduct_config.bank_ele_acc_no
     *
     * @param bankEleAccNo the value for auto_deduct_config.bank_ele_acc_no
     *
     * @mbggenerated
     */
    public void setBankEleAccNo(String bankEleAccNo) {
        this.bankEleAccNo = bankEleAccNo == null ? null : bankEleAccNo.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.bank_ele_acc_name
     *
     * @return the value of auto_deduct_config.bank_ele_acc_name
     *
     * @mbggenerated
     */
    public String getBankEleAccName() {
        return bankEleAccName;
    }

    /**
     * set the value of the database column auto_deduct_config.bank_ele_acc_name
     *
     * @param bankEleAccName the value for auto_deduct_config.bank_ele_acc_name
     *
     * @mbggenerated
     */
    public void setBankEleAccName(String bankEleAccName) {
        this.bankEleAccName = bankEleAccName == null ? null : bankEleAccName.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.bank_account_no
     *
     * @return the value of auto_deduct_config.bank_account_no
     *
     * @mbggenerated
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * set the value of the database column auto_deduct_config.bank_account_no
     *
     * @param bankAccountNo the value for auto_deduct_config.bank_account_no
     *
     * @mbggenerated
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.cert_no
     *
     * @return the value of auto_deduct_config.cert_no
     *
     * @mbggenerated
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * set the value of the database column auto_deduct_config.cert_no
     *
     * @param certNo the value for auto_deduct_config.cert_no
     *
     * @mbggenerated
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.bank_code
     *
     * @return the value of auto_deduct_config.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column auto_deduct_config.bank_code
     *
     * @param bankCode the value for auto_deduct_config.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.bank_account_name
     *
     * @return the value of auto_deduct_config.bank_account_name
     *
     * @mbggenerated
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * set the value of the database column auto_deduct_config.bank_account_name
     *
     * @param bankAccountName the value for auto_deduct_config.bank_account_name
     *
     * @mbggenerated
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.bank_card_type
     *
     * @return the value of auto_deduct_config.bank_card_type
     *
     * @mbggenerated
     */
    public String getBankCardType() {
        return bankCardType;
    }

    /**
     * set the value of the database column auto_deduct_config.bank_card_type
     *
     * @param bankCardType the value for auto_deduct_config.bank_card_type
     *
     * @mbggenerated
     */
    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType == null ? null : bankCardType.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.inlet
     *
     * @return the value of auto_deduct_config.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column auto_deduct_config.inlet
     *
     * @param inlet the value for auto_deduct_config.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.sec_index
     *
     * @return the value of auto_deduct_config.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column auto_deduct_config.sec_index
     *
     * @param secIndex the value for auto_deduct_config.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column auto_deduct_config.raw_add_time
     *
     * @return the value of auto_deduct_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column auto_deduct_config.raw_add_time
     *
     * @param rawAddTime the value for auto_deduct_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column auto_deduct_config.raw_update_time
     *
     * @return the value of auto_deduct_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column auto_deduct_config.raw_update_time
     *
     * @param rawUpdateTime the value for auto_deduct_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", bankEleAccNo=").append(bankEleAccNo);
        sb.append(", bankEleAccName=").append(bankEleAccName);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", certNo=").append(certNo);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", bankCardType=").append(bankCardType);
        sb.append(", inlet=").append(inlet);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table auto_deduct_config
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
        AutoDeductConfigDO other = (AutoDeductConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBankEleAccNo() == null ? other.getBankEleAccNo() == null : this.getBankEleAccNo().equals(other.getBankEleAccNo()))
            && (this.getBankEleAccName() == null ? other.getBankEleAccName() == null : this.getBankEleAccName().equals(other.getBankEleAccName()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankAccountName() == null ? other.getBankAccountName() == null : this.getBankAccountName().equals(other.getBankAccountName()))
            && (this.getBankCardType() == null ? other.getBankCardType() == null : this.getBankCardType().equals(other.getBankCardType()))
            && (this.getInlet() == null ? other.getInlet() == null : this.getInlet().equals(other.getInlet()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBankEleAccNo() == null) ? 0 : getBankEleAccNo().hashCode());
        result = prime * result + ((getBankEleAccName() == null) ? 0 : getBankEleAccName().hashCode());
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankAccountName() == null) ? 0 : getBankAccountName().hashCode());
        result = prime * result + ((getBankCardType() == null) ? 0 : getBankCardType().hashCode());
        result = prime * result + ((getInlet() == null) ? 0 : getInlet().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}