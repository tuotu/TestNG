/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PaymentResultNotifyInfoDO.java
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

public class PaymentResultNotifyInfoDO implements Serializable {
    /**
     * corresponds to the database column payment_result_notify_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column payment_result_notify_info.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column payment_result_notify_info.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column payment_result_notify_info.serial_number
     *
     * @mbggenerated
     */
    private String serialNumber;

    /**
     * corresponds to the database column payment_result_notify_info.payment_record_id
     *
     * @mbggenerated
     */
    private Long paymentRecordId;

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column payment_result_notify_info.id
     *
     * @return the value of payment_result_notify_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column payment_result_notify_info.id
     *
     * @param id the value for payment_result_notify_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column payment_result_notify_info.raw_add_time
     *
     * @return the value of payment_result_notify_info.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column payment_result_notify_info.raw_add_time
     *
     * @param rawAddTime the value for payment_result_notify_info.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column payment_result_notify_info.raw_update_time
     *
     * @return the value of payment_result_notify_info.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column payment_result_notify_info.raw_update_time
     *
     * @param rawUpdateTime the value for payment_result_notify_info.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column payment_result_notify_info.serial_number
     *
     * @return the value of payment_result_notify_info.serial_number
     *
     * @mbggenerated
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * set the value of the database column payment_result_notify_info.serial_number
     *
     * @param serialNumber the value for payment_result_notify_info.serial_number
     *
     * @mbggenerated
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * return the value of the database column payment_result_notify_info.payment_record_id
     *
     * @return the value of payment_result_notify_info.payment_record_id
     *
     * @mbggenerated
     */
    public Long getPaymentRecordId() {
        return paymentRecordId;
    }

    /**
     * set the value of the database column payment_result_notify_info.payment_record_id
     *
     * @param paymentRecordId the value for payment_result_notify_info.payment_record_id
     *
     * @mbggenerated
     */
    public void setPaymentRecordId(Long paymentRecordId) {
        this.paymentRecordId = paymentRecordId;
    }

    /**
     * corresponds to the database table payment_result_notify_info
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
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", paymentRecordId=").append(paymentRecordId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table payment_result_notify_info
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
        PaymentResultNotifyInfoDO other = (PaymentResultNotifyInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getPaymentRecordId() == null ? other.getPaymentRecordId() == null : this.getPaymentRecordId().equals(other.getPaymentRecordId()));
    }

    /**
     * corresponds to the database table payment_result_notify_info
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
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getPaymentRecordId() == null) ? 0 : getPaymentRecordId().hashCode());
        return result;
    }
}