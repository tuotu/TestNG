/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PaymentRecordDO.java
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

public class PaymentRecordDO implements Serializable {
    /**
     * corresponds to the database column payment_record.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column payment_record.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column payment_record.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column payment_record.amount
     *
     * @mbggenerated
     */
    private Money amount;

    /**
     * corresponds to the database column payment_record.business
     *
     * @mbggenerated
     */
    private String business;

    /**
     * corresponds to the database column payment_record.credit_side
     *
     * @mbggenerated
     */
    private String creditSide;

    /**
     * corresponds to the database column payment_record.current_status
     *
     * @mbggenerated
     */
    private String currentStatus;

    /**
     * corresponds to the database column payment_record.debit_side
     *
     * @mbggenerated
     */
    private String debitSide;

    /**
     * corresponds to the database column payment_record.external_serial_number
     *
     * @mbggenerated
     */
    private String externalSerialNumber;

    /**
     * corresponds to the database column payment_record.final_status
     *
     * @mbggenerated
     */
    private String finalStatus;

    /**
     * corresponds to the database column payment_record.merchant_capital_acount
     *
     * @mbggenerated
     */
    private String merchantCapitalAcount;

    /**
     * corresponds to the database column payment_record.merchant_id
     *
     * @mbggenerated
     */
    private String merchantId;

    /**
     * corresponds to the database column payment_record.payment_complete_time
     *
     * @mbggenerated
     */
    private Date paymentCompleteTime;

    /**
     * corresponds to the database column payment_record.payment_start_time
     *
     * @mbggenerated
     */
    private Date paymentStartTime;

    /**
     * corresponds to the database column payment_record.payment_type
     *
     * @mbggenerated
     */
    private String paymentType;

    /**
     * corresponds to the database column payment_record.serial_number
     *
     * @mbggenerated
     */
    private String serialNumber;

    /**
     * corresponds to the database column payment_record.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column payment_record.id
     *
     * @return the value of payment_record.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column payment_record.id
     *
     * @param id the value for payment_record.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column payment_record.raw_add_time
     *
     * @return the value of payment_record.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column payment_record.raw_add_time
     *
     * @param rawAddTime the value for payment_record.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column payment_record.raw_update_time
     *
     * @return the value of payment_record.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column payment_record.raw_update_time
     *
     * @param rawUpdateTime the value for payment_record.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column payment_record.amount
     *
     * @return the value of payment_record.amount
     *
     * @mbggenerated
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * set the value of the database column payment_record.amount
     *
     * @param amount the value for payment_record.amount
     *
     * @mbggenerated
     */
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * return the value of the database column payment_record.business
     *
     * @return the value of payment_record.business
     *
     * @mbggenerated
     */
    public String getBusiness() {
        return business;
    }

    /**
     * set the value of the database column payment_record.business
     *
     * @param business the value for payment_record.business
     *
     * @mbggenerated
     */
    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    /**
     * return the value of the database column payment_record.credit_side
     *
     * @return the value of payment_record.credit_side
     *
     * @mbggenerated
     */
    public String getCreditSide() {
        return creditSide;
    }

    /**
     * set the value of the database column payment_record.credit_side
     *
     * @param creditSide the value for payment_record.credit_side
     *
     * @mbggenerated
     */
    public void setCreditSide(String creditSide) {
        this.creditSide = creditSide == null ? null : creditSide.trim();
    }

    /**
     * return the value of the database column payment_record.current_status
     *
     * @return the value of payment_record.current_status
     *
     * @mbggenerated
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * set the value of the database column payment_record.current_status
     *
     * @param currentStatus the value for payment_record.current_status
     *
     * @mbggenerated
     */
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus == null ? null : currentStatus.trim();
    }

    /**
     * return the value of the database column payment_record.debit_side
     *
     * @return the value of payment_record.debit_side
     *
     * @mbggenerated
     */
    public String getDebitSide() {
        return debitSide;
    }

    /**
     * set the value of the database column payment_record.debit_side
     *
     * @param debitSide the value for payment_record.debit_side
     *
     * @mbggenerated
     */
    public void setDebitSide(String debitSide) {
        this.debitSide = debitSide == null ? null : debitSide.trim();
    }

    /**
     * return the value of the database column payment_record.external_serial_number
     *
     * @return the value of payment_record.external_serial_number
     *
     * @mbggenerated
     */
    public String getExternalSerialNumber() {
        return externalSerialNumber;
    }

    /**
     * set the value of the database column payment_record.external_serial_number
     *
     * @param externalSerialNumber the value for payment_record.external_serial_number
     *
     * @mbggenerated
     */
    public void setExternalSerialNumber(String externalSerialNumber) {
        this.externalSerialNumber = externalSerialNumber == null ? null : externalSerialNumber.trim();
    }

    /**
     * return the value of the database column payment_record.final_status
     *
     * @return the value of payment_record.final_status
     *
     * @mbggenerated
     */
    public String getFinalStatus() {
        return finalStatus;
    }

    /**
     * set the value of the database column payment_record.final_status
     *
     * @param finalStatus the value for payment_record.final_status
     *
     * @mbggenerated
     */
    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus == null ? null : finalStatus.trim();
    }

    /**
     * return the value of the database column payment_record.merchant_capital_acount
     *
     * @return the value of payment_record.merchant_capital_acount
     *
     * @mbggenerated
     */
    public String getMerchantCapitalAcount() {
        return merchantCapitalAcount;
    }

    /**
     * set the value of the database column payment_record.merchant_capital_acount
     *
     * @param merchantCapitalAcount the value for payment_record.merchant_capital_acount
     *
     * @mbggenerated
     */
    public void setMerchantCapitalAcount(String merchantCapitalAcount) {
        this.merchantCapitalAcount = merchantCapitalAcount == null ? null : merchantCapitalAcount.trim();
    }

    /**
     * return the value of the database column payment_record.merchant_id
     *
     * @return the value of payment_record.merchant_id
     *
     * @mbggenerated
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * set the value of the database column payment_record.merchant_id
     *
     * @param merchantId the value for payment_record.merchant_id
     *
     * @mbggenerated
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * return the value of the database column payment_record.payment_complete_time
     *
     * @return the value of payment_record.payment_complete_time
     *
     * @mbggenerated
     */
    public Date getPaymentCompleteTime() {
        return paymentCompleteTime;
    }

    /**
     * set the value of the database column payment_record.payment_complete_time
     *
     * @param paymentCompleteTime the value for payment_record.payment_complete_time
     *
     * @mbggenerated
     */
    public void setPaymentCompleteTime(Date paymentCompleteTime) {
        this.paymentCompleteTime = paymentCompleteTime;
    }

    /**
     * return the value of the database column payment_record.payment_start_time
     *
     * @return the value of payment_record.payment_start_time
     *
     * @mbggenerated
     */
    public Date getPaymentStartTime() {
        return paymentStartTime;
    }

    /**
     * set the value of the database column payment_record.payment_start_time
     *
     * @param paymentStartTime the value for payment_record.payment_start_time
     *
     * @mbggenerated
     */
    public void setPaymentStartTime(Date paymentStartTime) {
        this.paymentStartTime = paymentStartTime;
    }

    /**
     * return the value of the database column payment_record.payment_type
     *
     * @return the value of payment_record.payment_type
     *
     * @mbggenerated
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * set the value of the database column payment_record.payment_type
     *
     * @param paymentType the value for payment_record.payment_type
     *
     * @mbggenerated
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    /**
     * return the value of the database column payment_record.serial_number
     *
     * @return the value of payment_record.serial_number
     *
     * @mbggenerated
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * set the value of the database column payment_record.serial_number
     *
     * @param serialNumber the value for payment_record.serial_number
     *
     * @mbggenerated
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * return the value of the database column payment_record.source
     *
     * @return the value of payment_record.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * set the value of the database column payment_record.source
     *
     * @param source the value for payment_record.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * corresponds to the database table payment_record
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
        sb.append(", amount=").append(amount);
        sb.append(", business=").append(business);
        sb.append(", creditSide=").append(creditSide);
        sb.append(", currentStatus=").append(currentStatus);
        sb.append(", debitSide=").append(debitSide);
        sb.append(", externalSerialNumber=").append(externalSerialNumber);
        sb.append(", finalStatus=").append(finalStatus);
        sb.append(", merchantCapitalAcount=").append(merchantCapitalAcount);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", paymentCompleteTime=").append(paymentCompleteTime);
        sb.append(", paymentStartTime=").append(paymentStartTime);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", source=").append(source);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table payment_record
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
        PaymentRecordDO other = (PaymentRecordDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBusiness() == null ? other.getBusiness() == null : this.getBusiness().equals(other.getBusiness()))
            && (this.getCreditSide() == null ? other.getCreditSide() == null : this.getCreditSide().equals(other.getCreditSide()))
            && (this.getCurrentStatus() == null ? other.getCurrentStatus() == null : this.getCurrentStatus().equals(other.getCurrentStatus()))
            && (this.getDebitSide() == null ? other.getDebitSide() == null : this.getDebitSide().equals(other.getDebitSide()))
            && (this.getExternalSerialNumber() == null ? other.getExternalSerialNumber() == null : this.getExternalSerialNumber().equals(other.getExternalSerialNumber()))
            && (this.getFinalStatus() == null ? other.getFinalStatus() == null : this.getFinalStatus().equals(other.getFinalStatus()))
            && (this.getMerchantCapitalAcount() == null ? other.getMerchantCapitalAcount() == null : this.getMerchantCapitalAcount().equals(other.getMerchantCapitalAcount()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getPaymentCompleteTime() == null ? other.getPaymentCompleteTime() == null : this.getPaymentCompleteTime().equals(other.getPaymentCompleteTime()))
            && (this.getPaymentStartTime() == null ? other.getPaymentStartTime() == null : this.getPaymentStartTime().equals(other.getPaymentStartTime()))
            && (this.getPaymentType() == null ? other.getPaymentType() == null : this.getPaymentType().equals(other.getPaymentType()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()));
    }

    /**
     * corresponds to the database table payment_record
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
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBusiness() == null) ? 0 : getBusiness().hashCode());
        result = prime * result + ((getCreditSide() == null) ? 0 : getCreditSide().hashCode());
        result = prime * result + ((getCurrentStatus() == null) ? 0 : getCurrentStatus().hashCode());
        result = prime * result + ((getDebitSide() == null) ? 0 : getDebitSide().hashCode());
        result = prime * result + ((getExternalSerialNumber() == null) ? 0 : getExternalSerialNumber().hashCode());
        result = prime * result + ((getFinalStatus() == null) ? 0 : getFinalStatus().hashCode());
        result = prime * result + ((getMerchantCapitalAcount() == null) ? 0 : getMerchantCapitalAcount().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getPaymentCompleteTime() == null) ? 0 : getPaymentCompleteTime().hashCode());
        result = prime * result + ((getPaymentStartTime() == null) ? 0 : getPaymentStartTime().hashCode());
        result = prime * result + ((getPaymentType() == null) ? 0 : getPaymentType().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        return result;
    }
}