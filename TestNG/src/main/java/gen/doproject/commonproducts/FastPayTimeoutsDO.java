/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayTimeoutsDO.java
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

public class FastPayTimeoutsDO implements Serializable {
    /**
     * corresponds to the database column fast_pay_timeouts.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column fast_pay_timeouts.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column fast_pay_timeouts.trade_status
     *
     * @mbggenerated
     */
    private String tradeStatus;

    /**
     * corresponds to the database column fast_pay_timeouts.timeout_trade_status
     *
     * @mbggenerated
     */
    private String timeoutTradeStatus;

    /**
     * corresponds to the database column fast_pay_timeouts.timeout_action
     *
     * @mbggenerated
     */
    private String timeoutAction;

    /**
     * corresponds to the database column fast_pay_timeouts.timeout_date
     *
     * @mbggenerated
     */
    private Date timeoutDate;

    /**
     * corresponds to the database column fast_pay_timeouts.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay_timeouts.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay_timeouts.id
     *
     * @return the value of fast_pay_timeouts.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay_timeouts.id
     *
     * @param id the value for fast_pay_timeouts.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay_timeouts.biz_no
     *
     * @return the value of fast_pay_timeouts.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column fast_pay_timeouts.biz_no
     *
     * @param bizNo the value for fast_pay_timeouts.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column fast_pay_timeouts.trade_status
     *
     * @return the value of fast_pay_timeouts.trade_status
     *
     * @mbggenerated
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * set the value of the database column fast_pay_timeouts.trade_status
     *
     * @param tradeStatus the value for fast_pay_timeouts.trade_status
     *
     * @mbggenerated
     */
    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    /**
     * return the value of the database column fast_pay_timeouts.timeout_trade_status
     *
     * @return the value of fast_pay_timeouts.timeout_trade_status
     *
     * @mbggenerated
     */
    public String getTimeoutTradeStatus() {
        return timeoutTradeStatus;
    }

    /**
     * set the value of the database column fast_pay_timeouts.timeout_trade_status
     *
     * @param timeoutTradeStatus the value for fast_pay_timeouts.timeout_trade_status
     *
     * @mbggenerated
     */
    public void setTimeoutTradeStatus(String timeoutTradeStatus) {
        this.timeoutTradeStatus = timeoutTradeStatus == null ? null : timeoutTradeStatus.trim();
    }

    /**
     * return the value of the database column fast_pay_timeouts.timeout_action
     *
     * @return the value of fast_pay_timeouts.timeout_action
     *
     * @mbggenerated
     */
    public String getTimeoutAction() {
        return timeoutAction;
    }

    /**
     * set the value of the database column fast_pay_timeouts.timeout_action
     *
     * @param timeoutAction the value for fast_pay_timeouts.timeout_action
     *
     * @mbggenerated
     */
    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction == null ? null : timeoutAction.trim();
    }

    /**
     * return the value of the database column fast_pay_timeouts.timeout_date
     *
     * @return the value of fast_pay_timeouts.timeout_date
     *
     * @mbggenerated
     */
    public Date getTimeoutDate() {
        return timeoutDate;
    }

    /**
     * set the value of the database column fast_pay_timeouts.timeout_date
     *
     * @param timeoutDate the value for fast_pay_timeouts.timeout_date
     *
     * @mbggenerated
     */
    public void setTimeoutDate(Date timeoutDate) {
        this.timeoutDate = timeoutDate;
    }

    /**
     * return the value of the database column fast_pay_timeouts.raw_add_time
     *
     * @return the value of fast_pay_timeouts.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay_timeouts.raw_add_time
     *
     * @param rawAddTime the value for fast_pay_timeouts.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay_timeouts.raw_update_time
     *
     * @return the value of fast_pay_timeouts.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay_timeouts.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay_timeouts.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", tradeStatus=").append(tradeStatus);
        sb.append(", timeoutTradeStatus=").append(timeoutTradeStatus);
        sb.append(", timeoutAction=").append(timeoutAction);
        sb.append(", timeoutDate=").append(timeoutDate);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay_timeouts
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
        FastPayTimeoutsDO other = (FastPayTimeoutsDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getTradeStatus() == null ? other.getTradeStatus() == null : this.getTradeStatus().equals(other.getTradeStatus()))
            && (this.getTimeoutTradeStatus() == null ? other.getTimeoutTradeStatus() == null : this.getTimeoutTradeStatus().equals(other.getTimeoutTradeStatus()))
            && (this.getTimeoutAction() == null ? other.getTimeoutAction() == null : this.getTimeoutAction().equals(other.getTimeoutAction()))
            && (this.getTimeoutDate() == null ? other.getTimeoutDate() == null : this.getTimeoutDate().equals(other.getTimeoutDate()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getTradeStatus() == null) ? 0 : getTradeStatus().hashCode());
        result = prime * result + ((getTimeoutTradeStatus() == null) ? 0 : getTimeoutTradeStatus().hashCode());
        result = prime * result + ((getTimeoutAction() == null) ? 0 : getTimeoutAction().hashCode());
        result = prime * result + ((getTimeoutDate() == null) ? 0 : getTimeoutDate().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}