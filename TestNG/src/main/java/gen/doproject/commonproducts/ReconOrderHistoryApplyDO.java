/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconOrderHistoryApplyDO.java
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

public class ReconOrderHistoryApplyDO implements Serializable {
    /**
     * corresponds to the database column recon_order_history_apply.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column recon_order_history_apply.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column recon_order_history_apply.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column recon_order_history_apply.partner_id
     *
     * @mbggenerated
     */
    private String partnerId;

    /**
     * corresponds to the database column recon_order_history_apply.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column recon_order_history_apply.apply_start_time
     *
     * @mbggenerated
     */
    private Date applyStartTime;

    /**
     * corresponds to the database column recon_order_history_apply.apply_end_time
     *
     * @mbggenerated
     */
    private Date applyEndTime;

    /**
     * corresponds to the database column recon_order_history_apply.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column recon_order_history_apply.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column recon_order_history_apply.id
     *
     * @return the value of recon_order_history_apply.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column recon_order_history_apply.id
     *
     * @param id the value for recon_order_history_apply.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column recon_order_history_apply.gid
     *
     * @return the value of recon_order_history_apply.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column recon_order_history_apply.gid
     *
     * @param gid the value for recon_order_history_apply.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column recon_order_history_apply.user_id
     *
     * @return the value of recon_order_history_apply.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column recon_order_history_apply.user_id
     *
     * @param userId the value for recon_order_history_apply.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column recon_order_history_apply.partner_id
     *
     * @return the value of recon_order_history_apply.partner_id
     *
     * @mbggenerated
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * set the value of the database column recon_order_history_apply.partner_id
     *
     * @param partnerId the value for recon_order_history_apply.partner_id
     *
     * @mbggenerated
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    /**
     * return the value of the database column recon_order_history_apply.merch_order_no
     *
     * @return the value of recon_order_history_apply.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column recon_order_history_apply.merch_order_no
     *
     * @param merchOrderNo the value for recon_order_history_apply.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column recon_order_history_apply.apply_start_time
     *
     * @return the value of recon_order_history_apply.apply_start_time
     *
     * @mbggenerated
     */
    public Date getApplyStartTime() {
        return applyStartTime;
    }

    /**
     * set the value of the database column recon_order_history_apply.apply_start_time
     *
     * @param applyStartTime the value for recon_order_history_apply.apply_start_time
     *
     * @mbggenerated
     */
    public void setApplyStartTime(Date applyStartTime) {
        this.applyStartTime = applyStartTime;
    }

    /**
     * return the value of the database column recon_order_history_apply.apply_end_time
     *
     * @return the value of recon_order_history_apply.apply_end_time
     *
     * @mbggenerated
     */
    public Date getApplyEndTime() {
        return applyEndTime;
    }

    /**
     * set the value of the database column recon_order_history_apply.apply_end_time
     *
     * @param applyEndTime the value for recon_order_history_apply.apply_end_time
     *
     * @mbggenerated
     */
    public void setApplyEndTime(Date applyEndTime) {
        this.applyEndTime = applyEndTime;
    }

    /**
     * return the value of the database column recon_order_history_apply.raw_add_time
     *
     * @return the value of recon_order_history_apply.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column recon_order_history_apply.raw_add_time
     *
     * @param rawAddTime the value for recon_order_history_apply.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column recon_order_history_apply.raw_update_time
     *
     * @return the value of recon_order_history_apply.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column recon_order_history_apply.raw_update_time
     *
     * @param rawUpdateTime the value for recon_order_history_apply.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", gid=").append(gid);
        sb.append(", userId=").append(userId);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", merchOrderNo=").append(merchOrderNo);
        sb.append(", applyStartTime=").append(applyStartTime);
        sb.append(", applyEndTime=").append(applyEndTime);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table recon_order_history_apply
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
        ReconOrderHistoryApplyDO other = (ReconOrderHistoryApplyDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPartnerId() == null ? other.getPartnerId() == null : this.getPartnerId().equals(other.getPartnerId()))
            && (this.getMerchOrderNo() == null ? other.getMerchOrderNo() == null : this.getMerchOrderNo().equals(other.getMerchOrderNo()))
            && (this.getApplyStartTime() == null ? other.getApplyStartTime() == null : this.getApplyStartTime().equals(other.getApplyStartTime()))
            && (this.getApplyEndTime() == null ? other.getApplyEndTime() == null : this.getApplyEndTime().equals(other.getApplyEndTime()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPartnerId() == null) ? 0 : getPartnerId().hashCode());
        result = prime * result + ((getMerchOrderNo() == null) ? 0 : getMerchOrderNo().hashCode());
        result = prime * result + ((getApplyStartTime() == null) ? 0 : getApplyStartTime().hashCode());
        result = prime * result + ((getApplyEndTime() == null) ? 0 : getApplyEndTime().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}