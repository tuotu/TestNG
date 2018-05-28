/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename BatchIdempotentDO.java
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

public class BatchIdempotentDO implements Serializable {
    /**
     * corresponds to the database column batch_idempotent.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column batch_idempotent.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column batch_idempotent.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column batch_idempotent.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column batch_idempotent.random_sting
     *
     * @mbggenerated
     */
    private String randomSting;

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column batch_idempotent.id
     *
     * @return the value of batch_idempotent.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column batch_idempotent.id
     *
     * @param id the value for batch_idempotent.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column batch_idempotent.raw_add_time
     *
     * @return the value of batch_idempotent.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column batch_idempotent.raw_add_time
     *
     * @param rawAddTime the value for batch_idempotent.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column batch_idempotent.raw_update_time
     *
     * @return the value of batch_idempotent.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column batch_idempotent.raw_update_time
     *
     * @param rawUpdateTime the value for batch_idempotent.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column batch_idempotent.gid
     *
     * @return the value of batch_idempotent.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column batch_idempotent.gid
     *
     * @param gid the value for batch_idempotent.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column batch_idempotent.random_sting
     *
     * @return the value of batch_idempotent.random_sting
     *
     * @mbggenerated
     */
    public String getRandomSting() {
        return randomSting;
    }

    /**
     * set the value of the database column batch_idempotent.random_sting
     *
     * @param randomSting the value for batch_idempotent.random_sting
     *
     * @mbggenerated
     */
    public void setRandomSting(String randomSting) {
        this.randomSting = randomSting == null ? null : randomSting.trim();
    }

    /**
     * corresponds to the database table batch_idempotent
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
        sb.append(", gid=").append(gid);
        sb.append(", randomSting=").append(randomSting);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table batch_idempotent
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
        BatchIdempotentDO other = (BatchIdempotentDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getRandomSting() == null ? other.getRandomSting() == null : this.getRandomSting().equals(other.getRandomSting()));
    }

    /**
     * corresponds to the database table batch_idempotent
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
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getRandomSting() == null) ? 0 : getRandomSting().hashCode());
        return result;
    }
}