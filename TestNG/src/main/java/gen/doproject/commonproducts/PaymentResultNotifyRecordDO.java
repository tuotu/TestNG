/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PaymentResultNotifyRecordDO.java
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

public class PaymentResultNotifyRecordDO implements Serializable {
    /**
     * corresponds to the database column payment_result_notify_record.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column payment_result_notify_record.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column payment_result_notify_record.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column payment_result_notify_record.notify_time
     *
     * @mbggenerated
     */
    private Date notifyTime;

    /**
     * corresponds to the database column payment_result_notify_record.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * corresponds to the database column payment_result_notify_record.payment_result_notify_info_id
     *
     * @mbggenerated
     */
    private Long paymentResultNotifyInfoId;

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column payment_result_notify_record.id
     *
     * @return the value of payment_result_notify_record.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column payment_result_notify_record.id
     *
     * @param id the value for payment_result_notify_record.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column payment_result_notify_record.raw_add_time
     *
     * @return the value of payment_result_notify_record.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column payment_result_notify_record.raw_add_time
     *
     * @param rawAddTime the value for payment_result_notify_record.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column payment_result_notify_record.raw_update_time
     *
     * @return the value of payment_result_notify_record.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column payment_result_notify_record.raw_update_time
     *
     * @param rawUpdateTime the value for payment_result_notify_record.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column payment_result_notify_record.notify_time
     *
     * @return the value of payment_result_notify_record.notify_time
     *
     * @mbggenerated
     */
    public Date getNotifyTime() {
        return notifyTime;
    }

    /**
     * set the value of the database column payment_result_notify_record.notify_time
     *
     * @param notifyTime the value for payment_result_notify_record.notify_time
     *
     * @mbggenerated
     */
    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    /**
     * return the value of the database column payment_result_notify_record.status
     *
     * @return the value of payment_result_notify_record.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * set the value of the database column payment_result_notify_record.status
     *
     * @param status the value for payment_result_notify_record.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * return the value of the database column payment_result_notify_record.payment_result_notify_info_id
     *
     * @return the value of payment_result_notify_record.payment_result_notify_info_id
     *
     * @mbggenerated
     */
    public Long getPaymentResultNotifyInfoId() {
        return paymentResultNotifyInfoId;
    }

    /**
     * set the value of the database column payment_result_notify_record.payment_result_notify_info_id
     *
     * @param paymentResultNotifyInfoId the value for payment_result_notify_record.payment_result_notify_info_id
     *
     * @mbggenerated
     */
    public void setPaymentResultNotifyInfoId(Long paymentResultNotifyInfoId) {
        this.paymentResultNotifyInfoId = paymentResultNotifyInfoId;
    }

    /**
     * corresponds to the database table payment_result_notify_record
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
        sb.append(", notifyTime=").append(notifyTime);
        sb.append(", status=").append(status);
        sb.append(", paymentResultNotifyInfoId=").append(paymentResultNotifyInfoId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table payment_result_notify_record
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
        PaymentResultNotifyRecordDO other = (PaymentResultNotifyRecordDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getNotifyTime() == null ? other.getNotifyTime() == null : this.getNotifyTime().equals(other.getNotifyTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPaymentResultNotifyInfoId() == null ? other.getPaymentResultNotifyInfoId() == null : this.getPaymentResultNotifyInfoId().equals(other.getPaymentResultNotifyInfoId()));
    }

    /**
     * corresponds to the database table payment_result_notify_record
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
        result = prime * result + ((getNotifyTime() == null) ? 0 : getNotifyTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPaymentResultNotifyInfoId() == null) ? 0 : getPaymentResultNotifyInfoId().hashCode());
        return result;
    }
}