/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointStreamLogDO.java
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

public class JointStreamLogDO implements Serializable {
    /**
     * corresponds to the database column joint_stream_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column joint_stream_log.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column joint_stream_log.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column joint_stream_log.amount
     *
     * @mbggenerated
     */
    private Long amount;

    /**
     * corresponds to the database column joint_stream_log.direction
     *
     * @mbggenerated
     */
    private String direction;

    /**
     * corresponds to the database column joint_stream_log.joint_account_no
     *
     * @mbggenerated
     */
    private String jointAccountNo;

    /**
     * corresponds to the database column joint_stream_log.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column joint_stream_log.joint_account_no_mask
     *
     * @mbggenerated
     */
    private String jointAccountNoMask;

    /**
     * corresponds to the database column joint_stream_log.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column joint_stream_log.out_biz_no
     *
     * @mbggenerated
     */
    private String outBizNo;

    /**
     * corresponds to the database column joint_stream_log.use_for
     *
     * @mbggenerated
     */
    private String useFor;

    /**
     * corresponds to the database column joint_stream_log.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column joint_stream_log.id
     *
     * @return the value of joint_stream_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column joint_stream_log.id
     *
     * @param id the value for joint_stream_log.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column joint_stream_log.raw_add_time
     *
     * @return the value of joint_stream_log.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column joint_stream_log.raw_add_time
     *
     * @param rawAddTime the value for joint_stream_log.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column joint_stream_log.raw_update_time
     *
     * @return the value of joint_stream_log.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column joint_stream_log.raw_update_time
     *
     * @param rawUpdateTime the value for joint_stream_log.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column joint_stream_log.amount
     *
     * @return the value of joint_stream_log.amount
     *
     * @mbggenerated
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * set the value of the database column joint_stream_log.amount
     *
     * @param amount the value for joint_stream_log.amount
     *
     * @mbggenerated
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * return the value of the database column joint_stream_log.direction
     *
     * @return the value of joint_stream_log.direction
     *
     * @mbggenerated
     */
    public String getDirection() {
        return direction;
    }

    /**
     * set the value of the database column joint_stream_log.direction
     *
     * @param direction the value for joint_stream_log.direction
     *
     * @mbggenerated
     */
    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    /**
     * return the value of the database column joint_stream_log.joint_account_no
     *
     * @return the value of joint_stream_log.joint_account_no
     *
     * @mbggenerated
     */
    public String getJointAccountNo() {
        return jointAccountNo;
    }

    /**
     * set the value of the database column joint_stream_log.joint_account_no
     *
     * @param jointAccountNo the value for joint_stream_log.joint_account_no
     *
     * @mbggenerated
     */
    public void setJointAccountNo(String jointAccountNo) {
        this.jointAccountNo = jointAccountNo == null ? null : jointAccountNo.trim();
    }

    /**
     * return the value of the database column joint_stream_log.sec_index
     *
     * @return the value of joint_stream_log.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column joint_stream_log.sec_index
     *
     * @param secIndex the value for joint_stream_log.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column joint_stream_log.joint_account_no_mask
     *
     * @return the value of joint_stream_log.joint_account_no_mask
     *
     * @mbggenerated
     */
    public String getJointAccountNoMask() {
        return jointAccountNoMask;
    }

    /**
     * set the value of the database column joint_stream_log.joint_account_no_mask
     *
     * @param jointAccountNoMask the value for joint_stream_log.joint_account_no_mask
     *
     * @mbggenerated
     */
    public void setJointAccountNoMask(String jointAccountNoMask) {
        this.jointAccountNoMask = jointAccountNoMask == null ? null : jointAccountNoMask.trim();
    }

    /**
     * return the value of the database column joint_stream_log.memo
     *
     * @return the value of joint_stream_log.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column joint_stream_log.memo
     *
     * @param memo the value for joint_stream_log.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column joint_stream_log.out_biz_no
     *
     * @return the value of joint_stream_log.out_biz_no
     *
     * @mbggenerated
     */
    public String getOutBizNo() {
        return outBizNo;
    }

    /**
     * set the value of the database column joint_stream_log.out_biz_no
     *
     * @param outBizNo the value for joint_stream_log.out_biz_no
     *
     * @mbggenerated
     */
    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo == null ? null : outBizNo.trim();
    }

    /**
     * return the value of the database column joint_stream_log.use_for
     *
     * @return the value of joint_stream_log.use_for
     *
     * @mbggenerated
     */
    public String getUseFor() {
        return useFor;
    }

    /**
     * set the value of the database column joint_stream_log.use_for
     *
     * @param useFor the value for joint_stream_log.use_for
     *
     * @mbggenerated
     */
    public void setUseFor(String useFor) {
        this.useFor = useFor == null ? null : useFor.trim();
    }

    /**
     * return the value of the database column joint_stream_log.user_id
     *
     * @return the value of joint_stream_log.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column joint_stream_log.user_id
     *
     * @param userId the value for joint_stream_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * corresponds to the database table joint_stream_log
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
        sb.append(", direction=").append(direction);
        sb.append(", jointAccountNo=").append(jointAccountNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", jointAccountNoMask=").append(jointAccountNoMask);
        sb.append(", memo=").append(memo);
        sb.append(", outBizNo=").append(outBizNo);
        sb.append(", useFor=").append(useFor);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table joint_stream_log
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
        JointStreamLogDO other = (JointStreamLogDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()))
            && (this.getJointAccountNo() == null ? other.getJointAccountNo() == null : this.getJointAccountNo().equals(other.getJointAccountNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getJointAccountNoMask() == null ? other.getJointAccountNoMask() == null : this.getJointAccountNoMask().equals(other.getJointAccountNoMask()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getOutBizNo() == null ? other.getOutBizNo() == null : this.getOutBizNo().equals(other.getOutBizNo()))
            && (this.getUseFor() == null ? other.getUseFor() == null : this.getUseFor().equals(other.getUseFor()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * corresponds to the database table joint_stream_log
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
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        result = prime * result + ((getJointAccountNo() == null) ? 0 : getJointAccountNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getJointAccountNoMask() == null) ? 0 : getJointAccountNoMask().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getOutBizNo() == null) ? 0 : getOutBizNo().hashCode());
        result = prime * result + ((getUseFor() == null) ? 0 : getUseFor().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}