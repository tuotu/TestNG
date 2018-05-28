/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingPartnerSumDO.java
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

public class ClearingPartnerSumDO implements Serializable {
    /**
     * corresponds to the database column clearing_partner_sum.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column clearing_partner_sum.trade_date
     *
     * @mbggenerated
     */
    private Date tradeDate;

    /**
     * corresponds to the database column clearing_partner_sum.partner_name
     *
     * @mbggenerated
     */
    private String partnerName;

    /**
     * corresponds to the database column clearing_partner_sum.partner_id
     *
     * @mbggenerated
     */
    private String partnerId;

    /**
     * corresponds to the database column clearing_partner_sum.clearing_amount
     *
     * @mbggenerated
     */
    private Money clearingAmount;

    /**
     * corresponds to the database column clearing_partner_sum.clearing_status
     *
     * @mbggenerated
     */
    private String clearingStatus;

    /**
     * corresponds to the database column clearing_partner_sum.out_order_no
     *
     * @mbggenerated
     */
    private String outOrderNo;

    /**
     * corresponds to the database column clearing_partner_sum.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column clearing_partner_sum.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column clearing_partner_sum.time_out
     *
     * @mbggenerated
     */
    private String timeOut;

    /**
     * corresponds to the database column clearing_partner_sum.pay_no
     *
     * @mbggenerated
     */
    private String payNo;

    /**
     * corresponds to the database column clearing_partner_sum.send_data
     *
     * @mbggenerated
     */
    private String sendData;

    /**
     * corresponds to the database column clearing_partner_sum.gmt_create
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * corresponds to the database column clearing_partner_sum.gmt_modified
     *
     * @mbggenerated
     */
    private Date gmtModified;

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column clearing_partner_sum.id
     *
     * @return the value of clearing_partner_sum.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column clearing_partner_sum.id
     *
     * @param id the value for clearing_partner_sum.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column clearing_partner_sum.trade_date
     *
     * @return the value of clearing_partner_sum.trade_date
     *
     * @mbggenerated
     */
    public Date getTradeDate() {
        return tradeDate;
    }

    /**
     * set the value of the database column clearing_partner_sum.trade_date
     *
     * @param tradeDate the value for clearing_partner_sum.trade_date
     *
     * @mbggenerated
     */
    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    /**
     * return the value of the database column clearing_partner_sum.partner_name
     *
     * @return the value of clearing_partner_sum.partner_name
     *
     * @mbggenerated
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * set the value of the database column clearing_partner_sum.partner_name
     *
     * @param partnerName the value for clearing_partner_sum.partner_name
     *
     * @mbggenerated
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    /**
     * return the value of the database column clearing_partner_sum.partner_id
     *
     * @return the value of clearing_partner_sum.partner_id
     *
     * @mbggenerated
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * set the value of the database column clearing_partner_sum.partner_id
     *
     * @param partnerId the value for clearing_partner_sum.partner_id
     *
     * @mbggenerated
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    /**
     * return the value of the database column clearing_partner_sum.clearing_amount
     *
     * @return the value of clearing_partner_sum.clearing_amount
     *
     * @mbggenerated
     */
    public Money getClearingAmount() {
        return clearingAmount;
    }

    /**
     * set the value of the database column clearing_partner_sum.clearing_amount
     *
     * @param clearingAmount the value for clearing_partner_sum.clearing_amount
     *
     * @mbggenerated
     */
    public void setClearingAmount(Money clearingAmount) {
        this.clearingAmount = clearingAmount;
    }

    /**
     * return the value of the database column clearing_partner_sum.clearing_status
     *
     * @return the value of clearing_partner_sum.clearing_status
     *
     * @mbggenerated
     */
    public String getClearingStatus() {
        return clearingStatus;
    }

    /**
     * set the value of the database column clearing_partner_sum.clearing_status
     *
     * @param clearingStatus the value for clearing_partner_sum.clearing_status
     *
     * @mbggenerated
     */
    public void setClearingStatus(String clearingStatus) {
        this.clearingStatus = clearingStatus == null ? null : clearingStatus.trim();
    }

    /**
     * return the value of the database column clearing_partner_sum.out_order_no
     *
     * @return the value of clearing_partner_sum.out_order_no
     *
     * @mbggenerated
     */
    public String getOutOrderNo() {
        return outOrderNo;
    }

    /**
     * set the value of the database column clearing_partner_sum.out_order_no
     *
     * @param outOrderNo the value for clearing_partner_sum.out_order_no
     *
     * @mbggenerated
     */
    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    /**
     * return the value of the database column clearing_partner_sum.user_id
     *
     * @return the value of clearing_partner_sum.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column clearing_partner_sum.user_id
     *
     * @param userId the value for clearing_partner_sum.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column clearing_partner_sum.gid
     *
     * @return the value of clearing_partner_sum.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column clearing_partner_sum.gid
     *
     * @param gid the value for clearing_partner_sum.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column clearing_partner_sum.time_out
     *
     * @return the value of clearing_partner_sum.time_out
     *
     * @mbggenerated
     */
    public String getTimeOut() {
        return timeOut;
    }

    /**
     * set the value of the database column clearing_partner_sum.time_out
     *
     * @param timeOut the value for clearing_partner_sum.time_out
     *
     * @mbggenerated
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut == null ? null : timeOut.trim();
    }

    /**
     * return the value of the database column clearing_partner_sum.pay_no
     *
     * @return the value of clearing_partner_sum.pay_no
     *
     * @mbggenerated
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * set the value of the database column clearing_partner_sum.pay_no
     *
     * @param payNo the value for clearing_partner_sum.pay_no
     *
     * @mbggenerated
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    /**
     * return the value of the database column clearing_partner_sum.send_data
     *
     * @return the value of clearing_partner_sum.send_data
     *
     * @mbggenerated
     */
    public String getSendData() {
        return sendData;
    }

    /**
     * set the value of the database column clearing_partner_sum.send_data
     *
     * @param sendData the value for clearing_partner_sum.send_data
     *
     * @mbggenerated
     */
    public void setSendData(String sendData) {
        this.sendData = sendData == null ? null : sendData.trim();
    }

    /**
     * return the value of the database column clearing_partner_sum.gmt_create
     *
     * @return the value of clearing_partner_sum.gmt_create
     *
     * @mbggenerated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * set the value of the database column clearing_partner_sum.gmt_create
     *
     * @param gmtCreate the value for clearing_partner_sum.gmt_create
     *
     * @mbggenerated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * return the value of the database column clearing_partner_sum.gmt_modified
     *
     * @return the value of clearing_partner_sum.gmt_modified
     *
     * @mbggenerated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * set the value of the database column clearing_partner_sum.gmt_modified
     *
     * @param gmtModified the value for clearing_partner_sum.gmt_modified
     *
     * @mbggenerated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", tradeDate=").append(tradeDate);
        sb.append(", partnerName=").append(partnerName);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", clearingAmount=").append(clearingAmount);
        sb.append(", clearingStatus=").append(clearingStatus);
        sb.append(", outOrderNo=").append(outOrderNo);
        sb.append(", userId=").append(userId);
        sb.append(", gid=").append(gid);
        sb.append(", timeOut=").append(timeOut);
        sb.append(", payNo=").append(payNo);
        sb.append(", sendData=").append(sendData);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table clearing_partner_sum
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
        ClearingPartnerSumDO other = (ClearingPartnerSumDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTradeDate() == null ? other.getTradeDate() == null : this.getTradeDate().equals(other.getTradeDate()))
            && (this.getPartnerName() == null ? other.getPartnerName() == null : this.getPartnerName().equals(other.getPartnerName()))
            && (this.getPartnerId() == null ? other.getPartnerId() == null : this.getPartnerId().equals(other.getPartnerId()))
            && (this.getClearingAmount() == null ? other.getClearingAmount() == null : this.getClearingAmount().equals(other.getClearingAmount()))
            && (this.getClearingStatus() == null ? other.getClearingStatus() == null : this.getClearingStatus().equals(other.getClearingStatus()))
            && (this.getOutOrderNo() == null ? other.getOutOrderNo() == null : this.getOutOrderNo().equals(other.getOutOrderNo()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getTimeOut() == null ? other.getTimeOut() == null : this.getTimeOut().equals(other.getTimeOut()))
            && (this.getPayNo() == null ? other.getPayNo() == null : this.getPayNo().equals(other.getPayNo()))
            && (this.getSendData() == null ? other.getSendData() == null : this.getSendData().equals(other.getSendData()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeDate() == null) ? 0 : getTradeDate().hashCode());
        result = prime * result + ((getPartnerName() == null) ? 0 : getPartnerName().hashCode());
        result = prime * result + ((getPartnerId() == null) ? 0 : getPartnerId().hashCode());
        result = prime * result + ((getClearingAmount() == null) ? 0 : getClearingAmount().hashCode());
        result = prime * result + ((getClearingStatus() == null) ? 0 : getClearingStatus().hashCode());
        result = prime * result + ((getOutOrderNo() == null) ? 0 : getOutOrderNo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getTimeOut() == null) ? 0 : getTimeOut().hashCode());
        result = prime * result + ((getPayNo() == null) ? 0 : getPayNo().hashCode());
        result = prime * result + ((getSendData() == null) ? 0 : getSendData().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}