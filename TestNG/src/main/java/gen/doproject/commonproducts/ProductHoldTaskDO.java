/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductHoldTaskDO.java
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

public class ProductHoldTaskDO implements Serializable {
    /**
     * corresponds to the database column product_hold_task.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column product_hold_task.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column product_hold_task.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column product_hold_task.action
     *
     * @mbggenerated
     */
    private String action;

    /**
     * corresponds to the database column product_hold_task.active
     *
     * @mbggenerated
     */
    private String active;

    /**
     * corresponds to the database column product_hold_task.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column product_hold_task.env
     *
     * @mbggenerated
     */
    private String env;

    /**
     * corresponds to the database column product_hold_task.model_type
     *
     * @mbggenerated
     */
    private String modelType;

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column product_hold_task.id
     *
     * @return the value of product_hold_task.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column product_hold_task.id
     *
     * @param id the value for product_hold_task.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column product_hold_task.raw_add_time
     *
     * @return the value of product_hold_task.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column product_hold_task.raw_add_time
     *
     * @param rawAddTime the value for product_hold_task.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column product_hold_task.raw_update_time
     *
     * @return the value of product_hold_task.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column product_hold_task.raw_update_time
     *
     * @param rawUpdateTime the value for product_hold_task.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column product_hold_task.action
     *
     * @return the value of product_hold_task.action
     *
     * @mbggenerated
     */
    public String getAction() {
        return action;
    }

    /**
     * set the value of the database column product_hold_task.action
     *
     * @param action the value for product_hold_task.action
     *
     * @mbggenerated
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * return the value of the database column product_hold_task.active
     *
     * @return the value of product_hold_task.active
     *
     * @mbggenerated
     */
    public String getActive() {
        return active;
    }

    /**
     * set the value of the database column product_hold_task.active
     *
     * @param active the value for product_hold_task.active
     *
     * @mbggenerated
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * return the value of the database column product_hold_task.biz_no
     *
     * @return the value of product_hold_task.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column product_hold_task.biz_no
     *
     * @param bizNo the value for product_hold_task.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column product_hold_task.env
     *
     * @return the value of product_hold_task.env
     *
     * @mbggenerated
     */
    public String getEnv() {
        return env;
    }

    /**
     * set the value of the database column product_hold_task.env
     *
     * @param env the value for product_hold_task.env
     *
     * @mbggenerated
     */
    public void setEnv(String env) {
        this.env = env == null ? null : env.trim();
    }

    /**
     * return the value of the database column product_hold_task.model_type
     *
     * @return the value of product_hold_task.model_type
     *
     * @mbggenerated
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * set the value of the database column product_hold_task.model_type
     *
     * @param modelType the value for product_hold_task.model_type
     *
     * @mbggenerated
     */
    public void setModelType(String modelType) {
        this.modelType = modelType == null ? null : modelType.trim();
    }

    /**
     * corresponds to the database table product_hold_task
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
        sb.append(", action=").append(action);
        sb.append(", active=").append(active);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", env=").append(env);
        sb.append(", modelType=").append(modelType);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table product_hold_task
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
        ProductHoldTaskDO other = (ProductHoldTaskDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getAction() == null ? other.getAction() == null : this.getAction().equals(other.getAction()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getEnv() == null ? other.getEnv() == null : this.getEnv().equals(other.getEnv()))
            && (this.getModelType() == null ? other.getModelType() == null : this.getModelType().equals(other.getModelType()));
    }

    /**
     * corresponds to the database table product_hold_task
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
        result = prime * result + ((getAction() == null) ? 0 : getAction().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getEnv() == null) ? 0 : getEnv().hashCode());
        result = prime * result + ((getModelType() == null) ? 0 : getModelType().hashCode());
        return result;
    }
}