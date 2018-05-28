/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingCheckingSumDO.java
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

public class ClearingCheckingSumDO implements Serializable {
    /**
     * corresponds to the database column clearing_checking_sum.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column clearing_checking_sum.trade_time
     *
     * @mbggenerated
     */
    private Date tradeTime;

    /**
     * corresponds to the database column clearing_checking_sum.union_amount
     *
     * @mbggenerated
     */
    private Money unionAmount;

    /**
     * corresponds to the database column clearing_checking_sum.yjf_clearing_amount
     *
     * @mbggenerated
     */
    private Money yjfClearingAmount;

    /**
     * corresponds to the database column clearing_checking_sum.ipaynow_clearing_amount
     *
     * @mbggenerated
     */
    private Money ipaynowClearingAmount;

    /**
     * corresponds to the database column clearing_checking_sum.yjf_get_amount
     *
     * @mbggenerated
     */
    private Money yjfGetAmount;

    /**
     * corresponds to the database column clearing_checking_sum.ipaynow_get_amount
     *
     * @mbggenerated
     */
    private Money ipaynowGetAmount;

    /**
     * corresponds to the database column clearing_checking_sum.tradeAmount_sum
     *
     * @mbggenerated
     */
    private Money tradeamountSum;

    /**
     * corresponds to the database column clearing_checking_sum.channelFee_sum
     *
     * @mbggenerated
     */
    private Money channelfeeSum;

    /**
     * corresponds to the database column clearing_checking_sum.partnerAmount_sum
     *
     * @mbggenerated
     */
    private Money partneramountSum;

    /**
     * corresponds to the database column clearing_checking_sum.clearing_status
     *
     * @mbggenerated
     */
    private String clearingStatus;

    /**
     * corresponds to the database column clearing_checking_sum.out_order_no
     *
     * @mbggenerated
     */
    private String outOrderNo;

    /**
     * corresponds to the database column clearing_checking_sum.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column clearing_checking_sum.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column clearing_checking_sum.time_out
     *
     * @mbggenerated
     */
    private String timeOut;

    /**
     * corresponds to the database column clearing_checking_sum.gmt_create
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * corresponds to the database column clearing_checking_sum.gmt_modified
     *
     * @mbggenerated
     */
    private Date gmtModified;

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column clearing_checking_sum.id
     *
     * @return the value of clearing_checking_sum.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column clearing_checking_sum.id
     *
     * @param id the value for clearing_checking_sum.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column clearing_checking_sum.trade_time
     *
     * @return the value of clearing_checking_sum.trade_time
     *
     * @mbggenerated
     */
    public Date getTradeTime() {
        return tradeTime;
    }

    /**
     * set the value of the database column clearing_checking_sum.trade_time
     *
     * @param tradeTime the value for clearing_checking_sum.trade_time
     *
     * @mbggenerated
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * return the value of the database column clearing_checking_sum.union_amount
     *
     * @return the value of clearing_checking_sum.union_amount
     *
     * @mbggenerated
     */
    public Money getUnionAmount() {
        return unionAmount;
    }

    /**
     * set the value of the database column clearing_checking_sum.union_amount
     *
     * @param unionAmount the value for clearing_checking_sum.union_amount
     *
     * @mbggenerated
     */
    public void setUnionAmount(Money unionAmount) {
        this.unionAmount = unionAmount;
    }

    /**
     * return the value of the database column clearing_checking_sum.yjf_clearing_amount
     *
     * @return the value of clearing_checking_sum.yjf_clearing_amount
     *
     * @mbggenerated
     */
    public Money getYjfClearingAmount() {
        return yjfClearingAmount;
    }

    /**
     * set the value of the database column clearing_checking_sum.yjf_clearing_amount
     *
     * @param yjfClearingAmount the value for clearing_checking_sum.yjf_clearing_amount
     *
     * @mbggenerated
     */
    public void setYjfClearingAmount(Money yjfClearingAmount) {
        this.yjfClearingAmount = yjfClearingAmount;
    }

    /**
     * return the value of the database column clearing_checking_sum.ipaynow_clearing_amount
     *
     * @return the value of clearing_checking_sum.ipaynow_clearing_amount
     *
     * @mbggenerated
     */
    public Money getIpaynowClearingAmount() {
        return ipaynowClearingAmount;
    }

    /**
     * set the value of the database column clearing_checking_sum.ipaynow_clearing_amount
     *
     * @param ipaynowClearingAmount the value for clearing_checking_sum.ipaynow_clearing_amount
     *
     * @mbggenerated
     */
    public void setIpaynowClearingAmount(Money ipaynowClearingAmount) {
        this.ipaynowClearingAmount = ipaynowClearingAmount;
    }

    /**
     * return the value of the database column clearing_checking_sum.yjf_get_amount
     *
     * @return the value of clearing_checking_sum.yjf_get_amount
     *
     * @mbggenerated
     */
    public Money getYjfGetAmount() {
        return yjfGetAmount;
    }

    /**
     * set the value of the database column clearing_checking_sum.yjf_get_amount
     *
     * @param yjfGetAmount the value for clearing_checking_sum.yjf_get_amount
     *
     * @mbggenerated
     */
    public void setYjfGetAmount(Money yjfGetAmount) {
        this.yjfGetAmount = yjfGetAmount;
    }

    /**
     * return the value of the database column clearing_checking_sum.ipaynow_get_amount
     *
     * @return the value of clearing_checking_sum.ipaynow_get_amount
     *
     * @mbggenerated
     */
    public Money getIpaynowGetAmount() {
        return ipaynowGetAmount;
    }

    /**
     * set the value of the database column clearing_checking_sum.ipaynow_get_amount
     *
     * @param ipaynowGetAmount the value for clearing_checking_sum.ipaynow_get_amount
     *
     * @mbggenerated
     */
    public void setIpaynowGetAmount(Money ipaynowGetAmount) {
        this.ipaynowGetAmount = ipaynowGetAmount;
    }

    /**
     * return the value of the database column clearing_checking_sum.tradeAmount_sum
     *
     * @return the value of clearing_checking_sum.tradeAmount_sum
     *
     * @mbggenerated
     */
    public Money getTradeamountSum() {
        return tradeamountSum;
    }

    /**
     * set the value of the database column clearing_checking_sum.tradeAmount_sum
     *
     * @param tradeamountSum the value for clearing_checking_sum.tradeAmount_sum
     *
     * @mbggenerated
     */
    public void setTradeamountSum(Money tradeamountSum) {
        this.tradeamountSum = tradeamountSum;
    }

    /**
     * return the value of the database column clearing_checking_sum.channelFee_sum
     *
     * @return the value of clearing_checking_sum.channelFee_sum
     *
     * @mbggenerated
     */
    public Money getChannelfeeSum() {
        return channelfeeSum;
    }

    /**
     * set the value of the database column clearing_checking_sum.channelFee_sum
     *
     * @param channelfeeSum the value for clearing_checking_sum.channelFee_sum
     *
     * @mbggenerated
     */
    public void setChannelfeeSum(Money channelfeeSum) {
        this.channelfeeSum = channelfeeSum;
    }

    /**
     * return the value of the database column clearing_checking_sum.partnerAmount_sum
     *
     * @return the value of clearing_checking_sum.partnerAmount_sum
     *
     * @mbggenerated
     */
    public Money getPartneramountSum() {
        return partneramountSum;
    }

    /**
     * set the value of the database column clearing_checking_sum.partnerAmount_sum
     *
     * @param partneramountSum the value for clearing_checking_sum.partnerAmount_sum
     *
     * @mbggenerated
     */
    public void setPartneramountSum(Money partneramountSum) {
        this.partneramountSum = partneramountSum;
    }

    /**
     * return the value of the database column clearing_checking_sum.clearing_status
     *
     * @return the value of clearing_checking_sum.clearing_status
     *
     * @mbggenerated
     */
    public String getClearingStatus() {
        return clearingStatus;
    }

    /**
     * set the value of the database column clearing_checking_sum.clearing_status
     *
     * @param clearingStatus the value for clearing_checking_sum.clearing_status
     *
     * @mbggenerated
     */
    public void setClearingStatus(String clearingStatus) {
        this.clearingStatus = clearingStatus == null ? null : clearingStatus.trim();
    }

    /**
     * return the value of the database column clearing_checking_sum.out_order_no
     *
     * @return the value of clearing_checking_sum.out_order_no
     *
     * @mbggenerated
     */
    public String getOutOrderNo() {
        return outOrderNo;
    }

    /**
     * set the value of the database column clearing_checking_sum.out_order_no
     *
     * @param outOrderNo the value for clearing_checking_sum.out_order_no
     *
     * @mbggenerated
     */
    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    /**
     * return the value of the database column clearing_checking_sum.user_id
     *
     * @return the value of clearing_checking_sum.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column clearing_checking_sum.user_id
     *
     * @param userId the value for clearing_checking_sum.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column clearing_checking_sum.gid
     *
     * @return the value of clearing_checking_sum.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column clearing_checking_sum.gid
     *
     * @param gid the value for clearing_checking_sum.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column clearing_checking_sum.time_out
     *
     * @return the value of clearing_checking_sum.time_out
     *
     * @mbggenerated
     */
    public String getTimeOut() {
        return timeOut;
    }

    /**
     * set the value of the database column clearing_checking_sum.time_out
     *
     * @param timeOut the value for clearing_checking_sum.time_out
     *
     * @mbggenerated
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut == null ? null : timeOut.trim();
    }

    /**
     * return the value of the database column clearing_checking_sum.gmt_create
     *
     * @return the value of clearing_checking_sum.gmt_create
     *
     * @mbggenerated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * set the value of the database column clearing_checking_sum.gmt_create
     *
     * @param gmtCreate the value for clearing_checking_sum.gmt_create
     *
     * @mbggenerated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * return the value of the database column clearing_checking_sum.gmt_modified
     *
     * @return the value of clearing_checking_sum.gmt_modified
     *
     * @mbggenerated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * set the value of the database column clearing_checking_sum.gmt_modified
     *
     * @param gmtModified the value for clearing_checking_sum.gmt_modified
     *
     * @mbggenerated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", unionAmount=").append(unionAmount);
        sb.append(", yjfClearingAmount=").append(yjfClearingAmount);
        sb.append(", ipaynowClearingAmount=").append(ipaynowClearingAmount);
        sb.append(", yjfGetAmount=").append(yjfGetAmount);
        sb.append(", ipaynowGetAmount=").append(ipaynowGetAmount);
        sb.append(", tradeamountSum=").append(tradeamountSum);
        sb.append(", channelfeeSum=").append(channelfeeSum);
        sb.append(", partneramountSum=").append(partneramountSum);
        sb.append(", clearingStatus=").append(clearingStatus);
        sb.append(", outOrderNo=").append(outOrderNo);
        sb.append(", userId=").append(userId);
        sb.append(", gid=").append(gid);
        sb.append(", timeOut=").append(timeOut);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table clearing_checking_sum
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
        ClearingCheckingSumDO other = (ClearingCheckingSumDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getUnionAmount() == null ? other.getUnionAmount() == null : this.getUnionAmount().equals(other.getUnionAmount()))
            && (this.getYjfClearingAmount() == null ? other.getYjfClearingAmount() == null : this.getYjfClearingAmount().equals(other.getYjfClearingAmount()))
            && (this.getIpaynowClearingAmount() == null ? other.getIpaynowClearingAmount() == null : this.getIpaynowClearingAmount().equals(other.getIpaynowClearingAmount()))
            && (this.getYjfGetAmount() == null ? other.getYjfGetAmount() == null : this.getYjfGetAmount().equals(other.getYjfGetAmount()))
            && (this.getIpaynowGetAmount() == null ? other.getIpaynowGetAmount() == null : this.getIpaynowGetAmount().equals(other.getIpaynowGetAmount()))
            && (this.getTradeamountSum() == null ? other.getTradeamountSum() == null : this.getTradeamountSum().equals(other.getTradeamountSum()))
            && (this.getChannelfeeSum() == null ? other.getChannelfeeSum() == null : this.getChannelfeeSum().equals(other.getChannelfeeSum()))
            && (this.getPartneramountSum() == null ? other.getPartneramountSum() == null : this.getPartneramountSum().equals(other.getPartneramountSum()))
            && (this.getClearingStatus() == null ? other.getClearingStatus() == null : this.getClearingStatus().equals(other.getClearingStatus()))
            && (this.getOutOrderNo() == null ? other.getOutOrderNo() == null : this.getOutOrderNo().equals(other.getOutOrderNo()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getTimeOut() == null ? other.getTimeOut() == null : this.getTimeOut().equals(other.getTimeOut()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getUnionAmount() == null) ? 0 : getUnionAmount().hashCode());
        result = prime * result + ((getYjfClearingAmount() == null) ? 0 : getYjfClearingAmount().hashCode());
        result = prime * result + ((getIpaynowClearingAmount() == null) ? 0 : getIpaynowClearingAmount().hashCode());
        result = prime * result + ((getYjfGetAmount() == null) ? 0 : getYjfGetAmount().hashCode());
        result = prime * result + ((getIpaynowGetAmount() == null) ? 0 : getIpaynowGetAmount().hashCode());
        result = prime * result + ((getTradeamountSum() == null) ? 0 : getTradeamountSum().hashCode());
        result = prime * result + ((getChannelfeeSum() == null) ? 0 : getChannelfeeSum().hashCode());
        result = prime * result + ((getPartneramountSum() == null) ? 0 : getPartneramountSum().hashCode());
        result = prime * result + ((getClearingStatus() == null) ? 0 : getClearingStatus().hashCode());
        result = prime * result + ((getOutOrderNo() == null) ? 0 : getOutOrderNo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getTimeOut() == null) ? 0 : getTimeOut().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}