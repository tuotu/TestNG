/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawDetailConfigDO.java
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

public class WithdrawDetailConfigDO implements Serializable {
    /**
     * corresponds to the database column withdraw_detail_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column withdraw_detail_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column withdraw_detail_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column withdraw_detail_config.active
     *
     * @mbggenerated
     */
    private String active;

    /**
     * corresponds to the database column withdraw_detail_config.plat_approval
     *
     * @mbggenerated
     */
    private String platApproval;

    /**
     * corresponds to the database column withdraw_detail_config.yjf_approval_amount
     *
     * @mbggenerated
     */
    private Long yjfApprovalAmount;

    /**
     * corresponds to the database column withdraw_detail_config.business_config
     *
     * @mbggenerated
     */
    private Integer businessConfig;

    /**
     * corresponds to the database column withdraw_detail_config.person_config
     *
     * @mbggenerated
     */
    private Integer personConfig;

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column withdraw_detail_config.id
     *
     * @return the value of withdraw_detail_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column withdraw_detail_config.id
     *
     * @param id the value for withdraw_detail_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column withdraw_detail_config.raw_add_time
     *
     * @return the value of withdraw_detail_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column withdraw_detail_config.raw_add_time
     *
     * @param rawAddTime the value for withdraw_detail_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column withdraw_detail_config.raw_update_time
     *
     * @return the value of withdraw_detail_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column withdraw_detail_config.raw_update_time
     *
     * @param rawUpdateTime the value for withdraw_detail_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column withdraw_detail_config.active
     *
     * @return the value of withdraw_detail_config.active
     *
     * @mbggenerated
     */
    public String getActive() {
        return active;
    }

    /**
     * set the value of the database column withdraw_detail_config.active
     *
     * @param active the value for withdraw_detail_config.active
     *
     * @mbggenerated
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * return the value of the database column withdraw_detail_config.plat_approval
     *
     * @return the value of withdraw_detail_config.plat_approval
     *
     * @mbggenerated
     */
    public String getPlatApproval() {
        return platApproval;
    }

    /**
     * set the value of the database column withdraw_detail_config.plat_approval
     *
     * @param platApproval the value for withdraw_detail_config.plat_approval
     *
     * @mbggenerated
     */
    public void setPlatApproval(String platApproval) {
        this.platApproval = platApproval == null ? null : platApproval.trim();
    }

    /**
     * return the value of the database column withdraw_detail_config.yjf_approval_amount
     *
     * @return the value of withdraw_detail_config.yjf_approval_amount
     *
     * @mbggenerated
     */
    public Long getYjfApprovalAmount() {
        return yjfApprovalAmount;
    }

    /**
     * set the value of the database column withdraw_detail_config.yjf_approval_amount
     *
     * @param yjfApprovalAmount the value for withdraw_detail_config.yjf_approval_amount
     *
     * @mbggenerated
     */
    public void setYjfApprovalAmount(Long yjfApprovalAmount) {
        this.yjfApprovalAmount = yjfApprovalAmount;
    }

    /**
     * return the value of the database column withdraw_detail_config.business_config
     *
     * @return the value of withdraw_detail_config.business_config
     *
     * @mbggenerated
     */
    public Integer getBusinessConfig() {
        return businessConfig;
    }

    /**
     * set the value of the database column withdraw_detail_config.business_config
     *
     * @param businessConfig the value for withdraw_detail_config.business_config
     *
     * @mbggenerated
     */
    public void setBusinessConfig(Integer businessConfig) {
        this.businessConfig = businessConfig;
    }

    /**
     * return the value of the database column withdraw_detail_config.person_config
     *
     * @return the value of withdraw_detail_config.person_config
     *
     * @mbggenerated
     */
    public Integer getPersonConfig() {
        return personConfig;
    }

    /**
     * set the value of the database column withdraw_detail_config.person_config
     *
     * @param personConfig the value for withdraw_detail_config.person_config
     *
     * @mbggenerated
     */
    public void setPersonConfig(Integer personConfig) {
        this.personConfig = personConfig;
    }

    /**
     * corresponds to the database table withdraw_detail_config
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
        sb.append(", active=").append(active);
        sb.append(", platApproval=").append(platApproval);
        sb.append(", yjfApprovalAmount=").append(yjfApprovalAmount);
        sb.append(", businessConfig=").append(businessConfig);
        sb.append(", personConfig=").append(personConfig);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table withdraw_detail_config
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
        WithdrawDetailConfigDO other = (WithdrawDetailConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getPlatApproval() == null ? other.getPlatApproval() == null : this.getPlatApproval().equals(other.getPlatApproval()))
            && (this.getYjfApprovalAmount() == null ? other.getYjfApprovalAmount() == null : this.getYjfApprovalAmount().equals(other.getYjfApprovalAmount()))
            && (this.getBusinessConfig() == null ? other.getBusinessConfig() == null : this.getBusinessConfig().equals(other.getBusinessConfig()))
            && (this.getPersonConfig() == null ? other.getPersonConfig() == null : this.getPersonConfig().equals(other.getPersonConfig()));
    }

    /**
     * corresponds to the database table withdraw_detail_config
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
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getPlatApproval() == null) ? 0 : getPlatApproval().hashCode());
        result = prime * result + ((getYjfApprovalAmount() == null) ? 0 : getYjfApprovalAmount().hashCode());
        result = prime * result + ((getBusinessConfig() == null) ? 0 : getBusinessConfig().hashCode());
        result = prime * result + ((getPersonConfig() == null) ? 0 : getPersonConfig().hashCode());
        return result;
    }
}