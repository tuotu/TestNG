/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PaymentOperateRecordDO.java
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

public class PaymentOperateRecordDO implements Serializable {
    /**
     * corresponds to the database column payment_operate_record.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column payment_operate_record.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column payment_operate_record.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column payment_operate_record.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * corresponds to the database column payment_operate_record.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column payment_operate_record.operate_serial_number
     *
     * @mbggenerated
     */
    private String operateSerialNumber;

    /**
     * corresponds to the database column payment_operate_record.operate_type
     *
     * @mbggenerated
     */
    private String operateType;

    /**
     * corresponds to the database column payment_operate_record.operator
     *
     * @mbggenerated
     */
    private String operator;

    /**
     * corresponds to the database column payment_operate_record.start_time
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * corresponds to the database column payment_operate_record.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * corresponds to the database column payment_operate_record.payment_record_id
     *
     * @mbggenerated
     */
    private Long paymentRecordId;

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column payment_operate_record.id
     *
     * @return the value of payment_operate_record.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column payment_operate_record.id
     *
     * @param id the value for payment_operate_record.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column payment_operate_record.raw_add_time
     *
     * @return the value of payment_operate_record.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column payment_operate_record.raw_add_time
     *
     * @param rawAddTime the value for payment_operate_record.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column payment_operate_record.raw_update_time
     *
     * @return the value of payment_operate_record.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column payment_operate_record.raw_update_time
     *
     * @param rawUpdateTime the value for payment_operate_record.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column payment_operate_record.end_time
     *
     * @return the value of payment_operate_record.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * set the value of the database column payment_operate_record.end_time
     *
     * @param endTime the value for payment_operate_record.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * return the value of the database column payment_operate_record.gid
     *
     * @return the value of payment_operate_record.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column payment_operate_record.gid
     *
     * @param gid the value for payment_operate_record.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column payment_operate_record.operate_serial_number
     *
     * @return the value of payment_operate_record.operate_serial_number
     *
     * @mbggenerated
     */
    public String getOperateSerialNumber() {
        return operateSerialNumber;
    }

    /**
     * set the value of the database column payment_operate_record.operate_serial_number
     *
     * @param operateSerialNumber the value for payment_operate_record.operate_serial_number
     *
     * @mbggenerated
     */
    public void setOperateSerialNumber(String operateSerialNumber) {
        this.operateSerialNumber = operateSerialNumber == null ? null : operateSerialNumber.trim();
    }

    /**
     * return the value of the database column payment_operate_record.operate_type
     *
     * @return the value of payment_operate_record.operate_type
     *
     * @mbggenerated
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     * set the value of the database column payment_operate_record.operate_type
     *
     * @param operateType the value for payment_operate_record.operate_type
     *
     * @mbggenerated
     */
    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    /**
     * return the value of the database column payment_operate_record.operator
     *
     * @return the value of payment_operate_record.operator
     *
     * @mbggenerated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set the value of the database column payment_operate_record.operator
     *
     * @param operator the value for payment_operate_record.operator
     *
     * @mbggenerated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * return the value of the database column payment_operate_record.start_time
     *
     * @return the value of payment_operate_record.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * set the value of the database column payment_operate_record.start_time
     *
     * @param startTime the value for payment_operate_record.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * return the value of the database column payment_operate_record.status
     *
     * @return the value of payment_operate_record.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * set the value of the database column payment_operate_record.status
     *
     * @param status the value for payment_operate_record.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * return the value of the database column payment_operate_record.payment_record_id
     *
     * @return the value of payment_operate_record.payment_record_id
     *
     * @mbggenerated
     */
    public Long getPaymentRecordId() {
        return paymentRecordId;
    }

    /**
     * set the value of the database column payment_operate_record.payment_record_id
     *
     * @param paymentRecordId the value for payment_operate_record.payment_record_id
     *
     * @mbggenerated
     */
    public void setPaymentRecordId(Long paymentRecordId) {
        this.paymentRecordId = paymentRecordId;
    }

    /**
     * corresponds to the database table payment_operate_record
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
        sb.append(", endTime=").append(endTime);
        sb.append(", gid=").append(gid);
        sb.append(", operateSerialNumber=").append(operateSerialNumber);
        sb.append(", operateType=").append(operateType);
        sb.append(", operator=").append(operator);
        sb.append(", startTime=").append(startTime);
        sb.append(", status=").append(status);
        sb.append(", paymentRecordId=").append(paymentRecordId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table payment_operate_record
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
        PaymentOperateRecordDO other = (PaymentOperateRecordDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getOperateSerialNumber() == null ? other.getOperateSerialNumber() == null : this.getOperateSerialNumber().equals(other.getOperateSerialNumber()))
            && (this.getOperateType() == null ? other.getOperateType() == null : this.getOperateType().equals(other.getOperateType()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPaymentRecordId() == null ? other.getPaymentRecordId() == null : this.getPaymentRecordId().equals(other.getPaymentRecordId()));
    }

    /**
     * corresponds to the database table payment_operate_record
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
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getOperateSerialNumber() == null) ? 0 : getOperateSerialNumber().hashCode());
        result = prime * result + ((getOperateType() == null) ? 0 : getOperateType().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPaymentRecordId() == null) ? 0 : getPaymentRecordId().hashCode());
        return result;
    }
}