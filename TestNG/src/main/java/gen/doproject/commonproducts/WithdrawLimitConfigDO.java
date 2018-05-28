/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawLimitConfigDO.java
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

public class WithdrawLimitConfigDO implements Serializable {
    /**
     * corresponds to the database column withdraw_limit_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column withdraw_limit_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column withdraw_limit_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column withdraw_limit_config.sm
     *
     * @mbggenerated
     */
    private String sm;

    /**
     * corresponds to the database column withdraw_limit_config.sm_validate_amount
     *
     * @mbggenerated
     */
    private Long smValidateAmount;

    /**
     * corresponds to the database column withdraw_limit_config.user_type
     *
     * @mbggenerated
     */
    private String userType;

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column withdraw_limit_config.id
     *
     * @return the value of withdraw_limit_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column withdraw_limit_config.id
     *
     * @param id the value for withdraw_limit_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column withdraw_limit_config.raw_add_time
     *
     * @return the value of withdraw_limit_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column withdraw_limit_config.raw_add_time
     *
     * @param rawAddTime the value for withdraw_limit_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column withdraw_limit_config.raw_update_time
     *
     * @return the value of withdraw_limit_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column withdraw_limit_config.raw_update_time
     *
     * @param rawUpdateTime the value for withdraw_limit_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column withdraw_limit_config.sm
     *
     * @return the value of withdraw_limit_config.sm
     *
     * @mbggenerated
     */
    public String getSm() {
        return sm;
    }

    /**
     * set the value of the database column withdraw_limit_config.sm
     *
     * @param sm the value for withdraw_limit_config.sm
     *
     * @mbggenerated
     */
    public void setSm(String sm) {
        this.sm = sm == null ? null : sm.trim();
    }

    /**
     * return the value of the database column withdraw_limit_config.sm_validate_amount
     *
     * @return the value of withdraw_limit_config.sm_validate_amount
     *
     * @mbggenerated
     */
    public Long getSmValidateAmount() {
        return smValidateAmount;
    }

    /**
     * set the value of the database column withdraw_limit_config.sm_validate_amount
     *
     * @param smValidateAmount the value for withdraw_limit_config.sm_validate_amount
     *
     * @mbggenerated
     */
    public void setSmValidateAmount(Long smValidateAmount) {
        this.smValidateAmount = smValidateAmount;
    }

    /**
     * return the value of the database column withdraw_limit_config.user_type
     *
     * @return the value of withdraw_limit_config.user_type
     *
     * @mbggenerated
     */
    public String getUserType() {
        return userType;
    }

    /**
     * set the value of the database column withdraw_limit_config.user_type
     *
     * @param userType the value for withdraw_limit_config.user_type
     *
     * @mbggenerated
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * corresponds to the database table withdraw_limit_config
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
        sb.append(", sm=").append(sm);
        sb.append(", smValidateAmount=").append(smValidateAmount);
        sb.append(", userType=").append(userType);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table withdraw_limit_config
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
        WithdrawLimitConfigDO other = (WithdrawLimitConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getSm() == null ? other.getSm() == null : this.getSm().equals(other.getSm()))
            && (this.getSmValidateAmount() == null ? other.getSmValidateAmount() == null : this.getSmValidateAmount().equals(other.getSmValidateAmount()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()));
    }

    /**
     * corresponds to the database table withdraw_limit_config
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
        result = prime * result + ((getSm() == null) ? 0 : getSm().hashCode());
        result = prime * result + ((getSmValidateAmount() == null) ? 0 : getSmValidateAmount().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        return result;
    }
}