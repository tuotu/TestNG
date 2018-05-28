/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SdNotifyInfoDO.java
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

public class SdNotifyInfoDO implements Serializable {
    /**
     * corresponds to the database column sd_notify_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column sd_notify_info.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column sd_notify_info.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column sd_notify_info.dubbo_group
     *
     * @mbggenerated
     */
    private String dubboGroup;

    /**
     * corresponds to the database column sd_notify_info.dubbo_version
     *
     * @mbggenerated
     */
    private String dubboVersion;

    /**
     * corresponds to the database column sd_notify_info.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column sd_notify_info.notify_custom_map
     *
     * @mbggenerated
     */
    private String notifyCustomMap;

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column sd_notify_info.id
     *
     * @return the value of sd_notify_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column sd_notify_info.id
     *
     * @param id the value for sd_notify_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column sd_notify_info.raw_add_time
     *
     * @return the value of sd_notify_info.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column sd_notify_info.raw_add_time
     *
     * @param rawAddTime the value for sd_notify_info.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column sd_notify_info.raw_update_time
     *
     * @return the value of sd_notify_info.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column sd_notify_info.raw_update_time
     *
     * @param rawUpdateTime the value for sd_notify_info.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column sd_notify_info.dubbo_group
     *
     * @return the value of sd_notify_info.dubbo_group
     *
     * @mbggenerated
     */
    public String getDubboGroup() {
        return dubboGroup;
    }

    /**
     * set the value of the database column sd_notify_info.dubbo_group
     *
     * @param dubboGroup the value for sd_notify_info.dubbo_group
     *
     * @mbggenerated
     */
    public void setDubboGroup(String dubboGroup) {
        this.dubboGroup = dubboGroup == null ? null : dubboGroup.trim();
    }

    /**
     * return the value of the database column sd_notify_info.dubbo_version
     *
     * @return the value of sd_notify_info.dubbo_version
     *
     * @mbggenerated
     */
    public String getDubboVersion() {
        return dubboVersion;
    }

    /**
     * set the value of the database column sd_notify_info.dubbo_version
     *
     * @param dubboVersion the value for sd_notify_info.dubbo_version
     *
     * @mbggenerated
     */
    public void setDubboVersion(String dubboVersion) {
        this.dubboVersion = dubboVersion == null ? null : dubboVersion.trim();
    }

    /**
     * return the value of the database column sd_notify_info.gid
     *
     * @return the value of sd_notify_info.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column sd_notify_info.gid
     *
     * @param gid the value for sd_notify_info.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column sd_notify_info.notify_custom_map
     *
     * @return the value of sd_notify_info.notify_custom_map
     *
     * @mbggenerated
     */
    public String getNotifyCustomMap() {
        return notifyCustomMap;
    }

    /**
     * set the value of the database column sd_notify_info.notify_custom_map
     *
     * @param notifyCustomMap the value for sd_notify_info.notify_custom_map
     *
     * @mbggenerated
     */
    public void setNotifyCustomMap(String notifyCustomMap) {
        this.notifyCustomMap = notifyCustomMap == null ? null : notifyCustomMap.trim();
    }

    /**
     * corresponds to the database table sd_notify_info
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
        sb.append(", dubboGroup=").append(dubboGroup);
        sb.append(", dubboVersion=").append(dubboVersion);
        sb.append(", gid=").append(gid);
        sb.append(", notifyCustomMap=").append(notifyCustomMap);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table sd_notify_info
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
        SdNotifyInfoDO other = (SdNotifyInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getDubboGroup() == null ? other.getDubboGroup() == null : this.getDubboGroup().equals(other.getDubboGroup()))
            && (this.getDubboVersion() == null ? other.getDubboVersion() == null : this.getDubboVersion().equals(other.getDubboVersion()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getNotifyCustomMap() == null ? other.getNotifyCustomMap() == null : this.getNotifyCustomMap().equals(other.getNotifyCustomMap()));
    }

    /**
     * corresponds to the database table sd_notify_info
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
        result = prime * result + ((getDubboGroup() == null) ? 0 : getDubboGroup().hashCode());
        result = prime * result + ((getDubboVersion() == null) ? 0 : getDubboVersion().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getNotifyCustomMap() == null) ? 0 : getNotifyCustomMap().hashCode());
        return result;
    }
}