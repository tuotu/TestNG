/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename MergePayDO.java
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

public class MergePayDO implements Serializable {
    /**
     * corresponds to the database column merge_pay.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column merge_pay.batch_no
     *
     * @mbggenerated
     */
    private String batchNo;

    /**
     * corresponds to the database column merge_pay.total_amount
     *
     * @mbggenerated
     */
    private Long totalAmount;

    /**
     * corresponds to the database column merge_pay.deposit_no
     *
     * @mbggenerated
     */
    private String depositNo;

    /**
     * corresponds to the database column merge_pay.settle_biz_no
     *
     * @mbggenerated
     */
    private String settleBizNo;

    /**
     * corresponds to the database column merge_pay.deposit_status
     *
     * @mbggenerated
     */
    private String depositStatus;

    /**
     * corresponds to the database column merge_pay.forward_url
     *
     * @mbggenerated
     */
    private String forwardUrl;

    /**
     * corresponds to the database column merge_pay.fail_code
     *
     * @mbggenerated
     */
    private String failCode;

    /**
     * corresponds to the database column merge_pay.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column merge_pay.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column merge_pay.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column merge_pay.id
     *
     * @return the value of merge_pay.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column merge_pay.id
     *
     * @param id the value for merge_pay.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column merge_pay.batch_no
     *
     * @return the value of merge_pay.batch_no
     *
     * @mbggenerated
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * set the value of the database column merge_pay.batch_no
     *
     * @param batchNo the value for merge_pay.batch_no
     *
     * @mbggenerated
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    /**
     * return the value of the database column merge_pay.total_amount
     *
     * @return the value of merge_pay.total_amount
     *
     * @mbggenerated
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * set the value of the database column merge_pay.total_amount
     *
     * @param totalAmount the value for merge_pay.total_amount
     *
     * @mbggenerated
     */
    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * return the value of the database column merge_pay.deposit_no
     *
     * @return the value of merge_pay.deposit_no
     *
     * @mbggenerated
     */
    public String getDepositNo() {
        return depositNo;
    }

    /**
     * set the value of the database column merge_pay.deposit_no
     *
     * @param depositNo the value for merge_pay.deposit_no
     *
     * @mbggenerated
     */
    public void setDepositNo(String depositNo) {
        this.depositNo = depositNo == null ? null : depositNo.trim();
    }

    /**
     * return the value of the database column merge_pay.settle_biz_no
     *
     * @return the value of merge_pay.settle_biz_no
     *
     * @mbggenerated
     */
    public String getSettleBizNo() {
        return settleBizNo;
    }

    /**
     * set the value of the database column merge_pay.settle_biz_no
     *
     * @param settleBizNo the value for merge_pay.settle_biz_no
     *
     * @mbggenerated
     */
    public void setSettleBizNo(String settleBizNo) {
        this.settleBizNo = settleBizNo == null ? null : settleBizNo.trim();
    }

    /**
     * return the value of the database column merge_pay.deposit_status
     *
     * @return the value of merge_pay.deposit_status
     *
     * @mbggenerated
     */
    public String getDepositStatus() {
        return depositStatus;
    }

    /**
     * set the value of the database column merge_pay.deposit_status
     *
     * @param depositStatus the value for merge_pay.deposit_status
     *
     * @mbggenerated
     */
    public void setDepositStatus(String depositStatus) {
        this.depositStatus = depositStatus == null ? null : depositStatus.trim();
    }

    /**
     * return the value of the database column merge_pay.forward_url
     *
     * @return the value of merge_pay.forward_url
     *
     * @mbggenerated
     */
    public String getForwardUrl() {
        return forwardUrl;
    }

    /**
     * set the value of the database column merge_pay.forward_url
     *
     * @param forwardUrl the value for merge_pay.forward_url
     *
     * @mbggenerated
     */
    public void setForwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl == null ? null : forwardUrl.trim();
    }

    /**
     * return the value of the database column merge_pay.fail_code
     *
     * @return the value of merge_pay.fail_code
     *
     * @mbggenerated
     */
    public String getFailCode() {
        return failCode;
    }

    /**
     * set the value of the database column merge_pay.fail_code
     *
     * @param failCode the value for merge_pay.fail_code
     *
     * @mbggenerated
     */
    public void setFailCode(String failCode) {
        this.failCode = failCode == null ? null : failCode.trim();
    }

    /**
     * return the value of the database column merge_pay.fail_reason
     *
     * @return the value of merge_pay.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column merge_pay.fail_reason
     *
     * @param failReason the value for merge_pay.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column merge_pay.raw_add_time
     *
     * @return the value of merge_pay.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column merge_pay.raw_add_time
     *
     * @param rawAddTime the value for merge_pay.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column merge_pay.raw_update_time
     *
     * @return the value of merge_pay.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column merge_pay.raw_update_time
     *
     * @param rawUpdateTime the value for merge_pay.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", depositNo=").append(depositNo);
        sb.append(", settleBizNo=").append(settleBizNo);
        sb.append(", depositStatus=").append(depositStatus);
        sb.append(", forwardUrl=").append(forwardUrl);
        sb.append(", failCode=").append(failCode);
        sb.append(", failReason=").append(failReason);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table merge_pay
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
        MergePayDO other = (MergePayDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getDepositNo() == null ? other.getDepositNo() == null : this.getDepositNo().equals(other.getDepositNo()))
            && (this.getSettleBizNo() == null ? other.getSettleBizNo() == null : this.getSettleBizNo().equals(other.getSettleBizNo()))
            && (this.getDepositStatus() == null ? other.getDepositStatus() == null : this.getDepositStatus().equals(other.getDepositStatus()))
            && (this.getForwardUrl() == null ? other.getForwardUrl() == null : this.getForwardUrl().equals(other.getForwardUrl()))
            && (this.getFailCode() == null ? other.getFailCode() == null : this.getFailCode().equals(other.getFailCode()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getDepositNo() == null) ? 0 : getDepositNo().hashCode());
        result = prime * result + ((getSettleBizNo() == null) ? 0 : getSettleBizNo().hashCode());
        result = prime * result + ((getDepositStatus() == null) ? 0 : getDepositStatus().hashCode());
        result = prime * result + ((getForwardUrl() == null) ? 0 : getForwardUrl().hashCode());
        result = prime * result + ((getFailCode() == null) ? 0 : getFailCode().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}