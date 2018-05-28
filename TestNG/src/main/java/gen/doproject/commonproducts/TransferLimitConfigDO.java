/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferLimitConfigDO.java
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

public class TransferLimitConfigDO implements Serializable {
    /**
     * corresponds to the database column transfer_limit_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column transfer_limit_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column transfer_limit_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column transfer_limit_config.user_types
     *
     * @mbggenerated
     */
    private String userTypes;

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column transfer_limit_config.id
     *
     * @return the value of transfer_limit_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column transfer_limit_config.id
     *
     * @param id the value for transfer_limit_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column transfer_limit_config.raw_add_time
     *
     * @return the value of transfer_limit_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column transfer_limit_config.raw_add_time
     *
     * @param rawAddTime the value for transfer_limit_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column transfer_limit_config.raw_update_time
     *
     * @return the value of transfer_limit_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column transfer_limit_config.raw_update_time
     *
     * @param rawUpdateTime the value for transfer_limit_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column transfer_limit_config.user_types
     *
     * @return the value of transfer_limit_config.user_types
     *
     * @mbggenerated
     */
    public String getUserTypes() {
        return userTypes;
    }

    /**
     * set the value of the database column transfer_limit_config.user_types
     *
     * @param userTypes the value for transfer_limit_config.user_types
     *
     * @mbggenerated
     */
    public void setUserTypes(String userTypes) {
        this.userTypes = userTypes == null ? null : userTypes.trim();
    }

    /**
     * corresponds to the database table transfer_limit_config
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
        sb.append(", userTypes=").append(userTypes);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table transfer_limit_config
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
        TransferLimitConfigDO other = (TransferLimitConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getUserTypes() == null ? other.getUserTypes() == null : this.getUserTypes().equals(other.getUserTypes()));
    }

    /**
     * corresponds to the database table transfer_limit_config
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
        result = prime * result + ((getUserTypes() == null) ? 0 : getUserTypes().hashCode());
        return result;
    }
}