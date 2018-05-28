/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconUserConfigDO.java
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

public class ReconUserConfigDO implements Serializable {
    /**
     * corresponds to the database column recon_user_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column recon_user_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column recon_user_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column recon_user_config.active
     *
     * @mbggenerated
     */
    private String active;

    /**
     * corresponds to the database column recon_user_config.real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * corresponds to the database column recon_user_config.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column recon_user_config.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * corresponds to the database column recon_user_config.open_date
     *
     * @mbggenerated
     */
    private Date openDate;

    /**
     * corresponds to the database column recon_user_config.recon_type
     *
     * @mbggenerated
     */
    private String reconType;

    /**
     * corresponds to the database column recon_user_config.recon_template_code
     *
     * @mbggenerated
     */
    private String reconTemplateCode;

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column recon_user_config.id
     *
     * @return the value of recon_user_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column recon_user_config.id
     *
     * @param id the value for recon_user_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column recon_user_config.raw_add_time
     *
     * @return the value of recon_user_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column recon_user_config.raw_add_time
     *
     * @param rawAddTime the value for recon_user_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column recon_user_config.raw_update_time
     *
     * @return the value of recon_user_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column recon_user_config.raw_update_time
     *
     * @param rawUpdateTime the value for recon_user_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column recon_user_config.active
     *
     * @return the value of recon_user_config.active
     *
     * @mbggenerated
     */
    public String getActive() {
        return active;
    }

    /**
     * set the value of the database column recon_user_config.active
     *
     * @param active the value for recon_user_config.active
     *
     * @mbggenerated
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * return the value of the database column recon_user_config.real_name
     *
     * @return the value of recon_user_config.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * set the value of the database column recon_user_config.real_name
     *
     * @param realName the value for recon_user_config.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * return the value of the database column recon_user_config.user_id
     *
     * @return the value of recon_user_config.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column recon_user_config.user_id
     *
     * @param userId the value for recon_user_config.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column recon_user_config.user_name
     *
     * @return the value of recon_user_config.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set the value of the database column recon_user_config.user_name
     *
     * @param userName the value for recon_user_config.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * return the value of the database column recon_user_config.open_date
     *
     * @return the value of recon_user_config.open_date
     *
     * @mbggenerated
     */
    public Date getOpenDate() {
        return openDate;
    }

    /**
     * set the value of the database column recon_user_config.open_date
     *
     * @param openDate the value for recon_user_config.open_date
     *
     * @mbggenerated
     */
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    /**
     * return the value of the database column recon_user_config.recon_type
     *
     * @return the value of recon_user_config.recon_type
     *
     * @mbggenerated
     */
    public String getReconType() {
        return reconType;
    }

    /**
     * set the value of the database column recon_user_config.recon_type
     *
     * @param reconType the value for recon_user_config.recon_type
     *
     * @mbggenerated
     */
    public void setReconType(String reconType) {
        this.reconType = reconType == null ? null : reconType.trim();
    }

    /**
     * return the value of the database column recon_user_config.recon_template_code
     *
     * @return the value of recon_user_config.recon_template_code
     *
     * @mbggenerated
     */
    public String getReconTemplateCode() {
        return reconTemplateCode;
    }

    /**
     * set the value of the database column recon_user_config.recon_template_code
     *
     * @param reconTemplateCode the value for recon_user_config.recon_template_code
     *
     * @mbggenerated
     */
    public void setReconTemplateCode(String reconTemplateCode) {
        this.reconTemplateCode = reconTemplateCode == null ? null : reconTemplateCode.trim();
    }

    /**
     * corresponds to the database table recon_user_config
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
        sb.append(", realName=").append(realName);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", openDate=").append(openDate);
        sb.append(", reconType=").append(reconType);
        sb.append(", reconTemplateCode=").append(reconTemplateCode);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table recon_user_config
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
        ReconUserConfigDO other = (ReconUserConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getOpenDate() == null ? other.getOpenDate() == null : this.getOpenDate().equals(other.getOpenDate()))
            && (this.getReconType() == null ? other.getReconType() == null : this.getReconType().equals(other.getReconType()))
            && (this.getReconTemplateCode() == null ? other.getReconTemplateCode() == null : this.getReconTemplateCode().equals(other.getReconTemplateCode()));
    }

    /**
     * corresponds to the database table recon_user_config
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
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getOpenDate() == null) ? 0 : getOpenDate().hashCode());
        result = prime * result + ((getReconType() == null) ? 0 : getReconType().hashCode());
        result = prime * result + ((getReconTemplateCode() == null) ? 0 : getReconTemplateCode().hashCode());
        return result;
    }
}