/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SysResourceDO.java
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

public class SysResourceDO implements Serializable {
    /**
     * corresponds to the database column sys_resource.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column sys_resource.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column sys_resource.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column sys_resource.ref_id
     *
     * @mbggenerated
     */
    private String refId;

    /**
     * corresponds to the database column sys_resource.res_des
     *
     * @mbggenerated
     */
    private String resDes;

    /**
     * corresponds to the database column sys_resource.res_location
     *
     * @mbggenerated
     */
    private String resLocation;

    /**
     * corresponds to the database column sys_resource.res_name
     *
     * @mbggenerated
     */
    private String resName;

    /**
     * corresponds to the database column sys_resource.res_type
     *
     * @mbggenerated
     */
    private String resType;

    /**
     * corresponds to the database column sys_resource.res_url
     *
     * @mbggenerated
     */
    private String resUrl;

    /**
     * corresponds to the database column sys_resource.rindex
     *
     * @mbggenerated
     */
    private Integer rindex;

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column sys_resource.id
     *
     * @return the value of sys_resource.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column sys_resource.id
     *
     * @param id the value for sys_resource.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column sys_resource.raw_add_time
     *
     * @return the value of sys_resource.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column sys_resource.raw_add_time
     *
     * @param rawAddTime the value for sys_resource.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column sys_resource.raw_update_time
     *
     * @return the value of sys_resource.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column sys_resource.raw_update_time
     *
     * @param rawUpdateTime the value for sys_resource.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column sys_resource.ref_id
     *
     * @return the value of sys_resource.ref_id
     *
     * @mbggenerated
     */
    public String getRefId() {
        return refId;
    }

    /**
     * set the value of the database column sys_resource.ref_id
     *
     * @param refId the value for sys_resource.ref_id
     *
     * @mbggenerated
     */
    public void setRefId(String refId) {
        this.refId = refId == null ? null : refId.trim();
    }

    /**
     * return the value of the database column sys_resource.res_des
     *
     * @return the value of sys_resource.res_des
     *
     * @mbggenerated
     */
    public String getResDes() {
        return resDes;
    }

    /**
     * set the value of the database column sys_resource.res_des
     *
     * @param resDes the value for sys_resource.res_des
     *
     * @mbggenerated
     */
    public void setResDes(String resDes) {
        this.resDes = resDes == null ? null : resDes.trim();
    }

    /**
     * return the value of the database column sys_resource.res_location
     *
     * @return the value of sys_resource.res_location
     *
     * @mbggenerated
     */
    public String getResLocation() {
        return resLocation;
    }

    /**
     * set the value of the database column sys_resource.res_location
     *
     * @param resLocation the value for sys_resource.res_location
     *
     * @mbggenerated
     */
    public void setResLocation(String resLocation) {
        this.resLocation = resLocation == null ? null : resLocation.trim();
    }

    /**
     * return the value of the database column sys_resource.res_name
     *
     * @return the value of sys_resource.res_name
     *
     * @mbggenerated
     */
    public String getResName() {
        return resName;
    }

    /**
     * set the value of the database column sys_resource.res_name
     *
     * @param resName the value for sys_resource.res_name
     *
     * @mbggenerated
     */
    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    /**
     * return the value of the database column sys_resource.res_type
     *
     * @return the value of sys_resource.res_type
     *
     * @mbggenerated
     */
    public String getResType() {
        return resType;
    }

    /**
     * set the value of the database column sys_resource.res_type
     *
     * @param resType the value for sys_resource.res_type
     *
     * @mbggenerated
     */
    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }

    /**
     * return the value of the database column sys_resource.res_url
     *
     * @return the value of sys_resource.res_url
     *
     * @mbggenerated
     */
    public String getResUrl() {
        return resUrl;
    }

    /**
     * set the value of the database column sys_resource.res_url
     *
     * @param resUrl the value for sys_resource.res_url
     *
     * @mbggenerated
     */
    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
    }

    /**
     * return the value of the database column sys_resource.rindex
     *
     * @return the value of sys_resource.rindex
     *
     * @mbggenerated
     */
    public Integer getRindex() {
        return rindex;
    }

    /**
     * set the value of the database column sys_resource.rindex
     *
     * @param rindex the value for sys_resource.rindex
     *
     * @mbggenerated
     */
    public void setRindex(Integer rindex) {
        this.rindex = rindex;
    }

    /**
     * corresponds to the database table sys_resource
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
        sb.append(", refId=").append(refId);
        sb.append(", resDes=").append(resDes);
        sb.append(", resLocation=").append(resLocation);
        sb.append(", resName=").append(resName);
        sb.append(", resType=").append(resType);
        sb.append(", resUrl=").append(resUrl);
        sb.append(", rindex=").append(rindex);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table sys_resource
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
        SysResourceDO other = (SysResourceDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getRefId() == null ? other.getRefId() == null : this.getRefId().equals(other.getRefId()))
            && (this.getResDes() == null ? other.getResDes() == null : this.getResDes().equals(other.getResDes()))
            && (this.getResLocation() == null ? other.getResLocation() == null : this.getResLocation().equals(other.getResLocation()))
            && (this.getResName() == null ? other.getResName() == null : this.getResName().equals(other.getResName()))
            && (this.getResType() == null ? other.getResType() == null : this.getResType().equals(other.getResType()))
            && (this.getResUrl() == null ? other.getResUrl() == null : this.getResUrl().equals(other.getResUrl()))
            && (this.getRindex() == null ? other.getRindex() == null : this.getRindex().equals(other.getRindex()));
    }

    /**
     * corresponds to the database table sys_resource
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
        result = prime * result + ((getRefId() == null) ? 0 : getRefId().hashCode());
        result = prime * result + ((getResDes() == null) ? 0 : getResDes().hashCode());
        result = prime * result + ((getResLocation() == null) ? 0 : getResLocation().hashCode());
        result = prime * result + ((getResName() == null) ? 0 : getResName().hashCode());
        result = prime * result + ((getResType() == null) ? 0 : getResType().hashCode());
        result = prime * result + ((getResUrl() == null) ? 0 : getResUrl().hashCode());
        result = prime * result + ((getRindex() == null) ? 0 : getRindex().hashCode());
        return result;
    }
}