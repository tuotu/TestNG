/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AdDeductInfoDO.java
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

public class AdDeductInfoDO implements Serializable {
    /**
     * corresponds to the database column ad_deduct_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column ad_deduct_info.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column ad_deduct_info.deduct_amount
     *
     * @mbggenerated
     */
    private Money deductAmount;

    /**
     * corresponds to the database column ad_deduct_info.deduct_status
     *
     * @mbggenerated
     */
    private String deductStatus;

    /**
     * corresponds to the database column ad_deduct_info.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column ad_deduct_info.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column ad_deduct_info.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column ad_deduct_info.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column ad_deduct_info.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column ad_deduct_info.handle_result
     *
     * @mbggenerated
     */
    private String handleResult;

    /**
     * corresponds to the database column ad_deduct_info.user_info_id
     *
     * @mbggenerated
     */
    private Long userInfoId;

    /**
     * corresponds to the database column ad_deduct_info.env
     *
     * @mbggenerated
     */
    private String env;

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column ad_deduct_info.id
     *
     * @return the value of ad_deduct_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column ad_deduct_info.id
     *
     * @param id the value for ad_deduct_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column ad_deduct_info.biz_no
     *
     * @return the value of ad_deduct_info.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column ad_deduct_info.biz_no
     *
     * @param bizNo the value for ad_deduct_info.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column ad_deduct_info.deduct_amount
     *
     * @return the value of ad_deduct_info.deduct_amount
     *
     * @mbggenerated
     */
    public Money getDeductAmount() {
        return deductAmount;
    }

    /**
     * set the value of the database column ad_deduct_info.deduct_amount
     *
     * @param deductAmount the value for ad_deduct_info.deduct_amount
     *
     * @mbggenerated
     */
    public void setDeductAmount(Money deductAmount) {
        this.deductAmount = deductAmount;
    }

    /**
     * return the value of the database column ad_deduct_info.deduct_status
     *
     * @return the value of ad_deduct_info.deduct_status
     *
     * @mbggenerated
     */
    public String getDeductStatus() {
        return deductStatus;
    }

    /**
     * set the value of the database column ad_deduct_info.deduct_status
     *
     * @param deductStatus the value for ad_deduct_info.deduct_status
     *
     * @mbggenerated
     */
    public void setDeductStatus(String deductStatus) {
        this.deductStatus = deductStatus == null ? null : deductStatus.trim();
    }

    /**
     * return the value of the database column ad_deduct_info.gid
     *
     * @return the value of ad_deduct_info.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column ad_deduct_info.gid
     *
     * @param gid the value for ad_deduct_info.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column ad_deduct_info.memo
     *
     * @return the value of ad_deduct_info.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column ad_deduct_info.memo
     *
     * @param memo the value for ad_deduct_info.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column ad_deduct_info.merchant_user_id
     *
     * @return the value of ad_deduct_info.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column ad_deduct_info.merchant_user_id
     *
     * @param merchantUserId the value for ad_deduct_info.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column ad_deduct_info.raw_add_time
     *
     * @return the value of ad_deduct_info.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column ad_deduct_info.raw_add_time
     *
     * @param rawAddTime the value for ad_deduct_info.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column ad_deduct_info.raw_update_time
     *
     * @return the value of ad_deduct_info.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column ad_deduct_info.raw_update_time
     *
     * @param rawUpdateTime the value for ad_deduct_info.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column ad_deduct_info.handle_result
     *
     * @return the value of ad_deduct_info.handle_result
     *
     * @mbggenerated
     */
    public String getHandleResult() {
        return handleResult;
    }

    /**
     * set the value of the database column ad_deduct_info.handle_result
     *
     * @param handleResult the value for ad_deduct_info.handle_result
     *
     * @mbggenerated
     */
    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult == null ? null : handleResult.trim();
    }

    /**
     * return the value of the database column ad_deduct_info.user_info_id
     *
     * @return the value of ad_deduct_info.user_info_id
     *
     * @mbggenerated
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * set the value of the database column ad_deduct_info.user_info_id
     *
     * @param userInfoId the value for ad_deduct_info.user_info_id
     *
     * @mbggenerated
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * return the value of the database column ad_deduct_info.env
     *
     * @return the value of ad_deduct_info.env
     *
     * @mbggenerated
     */
    public String getEnv() {
        return env;
    }

    /**
     * set the value of the database column ad_deduct_info.env
     *
     * @param env the value for ad_deduct_info.env
     *
     * @mbggenerated
     */
    public void setEnv(String env) {
        this.env = env == null ? null : env.trim();
    }

    /**
     * corresponds to the database table ad_deduct_info
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
        sb.append(", deductAmount=").append(deductAmount);
        sb.append(", deductStatus=").append(deductStatus);
        sb.append(", gid=").append(gid);
        sb.append(", memo=").append(memo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", handleResult=").append(handleResult);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", env=").append(env);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table ad_deduct_info
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
        AdDeductInfoDO other = (AdDeductInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getDeductAmount() == null ? other.getDeductAmount() == null : this.getDeductAmount().equals(other.getDeductAmount()))
            && (this.getDeductStatus() == null ? other.getDeductStatus() == null : this.getDeductStatus().equals(other.getDeductStatus()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getHandleResult() == null ? other.getHandleResult() == null : this.getHandleResult().equals(other.getHandleResult()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getEnv() == null ? other.getEnv() == null : this.getEnv().equals(other.getEnv()));
    }

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getDeductAmount() == null) ? 0 : getDeductAmount().hashCode());
        result = prime * result + ((getDeductStatus() == null) ? 0 : getDeductStatus().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getHandleResult() == null) ? 0 : getHandleResult().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getEnv() == null) ? 0 : getEnv().hashCode());
        return result;
    }
}