/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconFileTaskDO.java
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

public class ReconFileTaskDO implements Serializable {
    /**
     * corresponds to the database column recon_file_task.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column recon_file_task.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column recon_file_task.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column recon_file_task.recon_date
     *
     * @mbggenerated
     */
    private String reconDate;

    /**
     * corresponds to the database column recon_file_task.total_count
     *
     * @mbggenerated
     */
    private Long totalCount;

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column recon_file_task.id
     *
     * @return the value of recon_file_task.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column recon_file_task.id
     *
     * @param id the value for recon_file_task.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column recon_file_task.raw_add_time
     *
     * @return the value of recon_file_task.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column recon_file_task.raw_add_time
     *
     * @param rawAddTime the value for recon_file_task.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column recon_file_task.raw_update_time
     *
     * @return the value of recon_file_task.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column recon_file_task.raw_update_time
     *
     * @param rawUpdateTime the value for recon_file_task.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column recon_file_task.recon_date
     *
     * @return the value of recon_file_task.recon_date
     *
     * @mbggenerated
     */
    public String getReconDate() {
        return reconDate;
    }

    /**
     * set the value of the database column recon_file_task.recon_date
     *
     * @param reconDate the value for recon_file_task.recon_date
     *
     * @mbggenerated
     */
    public void setReconDate(String reconDate) {
        this.reconDate = reconDate == null ? null : reconDate.trim();
    }

    /**
     * return the value of the database column recon_file_task.total_count
     *
     * @return the value of recon_file_task.total_count
     *
     * @mbggenerated
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * set the value of the database column recon_file_task.total_count
     *
     * @param totalCount the value for recon_file_task.total_count
     *
     * @mbggenerated
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * corresponds to the database table recon_file_task
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
        sb.append(", reconDate=").append(reconDate);
        sb.append(", totalCount=").append(totalCount);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table recon_file_task
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
        ReconFileTaskDO other = (ReconFileTaskDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getReconDate() == null ? other.getReconDate() == null : this.getReconDate().equals(other.getReconDate()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()));
    }

    /**
     * corresponds to the database table recon_file_task
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
        result = prime * result + ((getReconDate() == null) ? 0 : getReconDate().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return result;
    }
}