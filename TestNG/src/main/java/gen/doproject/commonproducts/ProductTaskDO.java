/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductTaskDO.java
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

public class ProductTaskDO implements Serializable {
    /**
     * corresponds to the database column product_task.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column product_task.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column product_task.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column product_task.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column product_task.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * corresponds to the database column product_task.env
     *
     * @mbggenerated
     */
    private String env;

    /**
     * corresponds to the database column product_task.sys_name
     *
     * @mbggenerated
     */
    private String sysName;

    /**
     * corresponds to the database column product_task.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column product_task.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column product_task.task_status
     *
     * @mbggenerated
     */
    private String taskStatus;

    /**
     * corresponds to the database column product_task.task_type
     *
     * @mbggenerated
     */
    private String taskType;

    /**
     * corresponds to the database column product_task.tries
     *
     * @mbggenerated
     */
    private Integer tries;

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column product_task.id
     *
     * @return the value of product_task.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column product_task.id
     *
     * @param id the value for product_task.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column product_task.raw_add_time
     *
     * @return the value of product_task.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column product_task.raw_add_time
     *
     * @param rawAddTime the value for product_task.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column product_task.raw_update_time
     *
     * @return the value of product_task.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column product_task.raw_update_time
     *
     * @param rawUpdateTime the value for product_task.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column product_task.biz_no
     *
     * @return the value of product_task.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column product_task.biz_no
     *
     * @param bizNo the value for product_task.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column product_task.content
     *
     * @return the value of product_task.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * set the value of the database column product_task.content
     *
     * @param content the value for product_task.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * return the value of the database column product_task.env
     *
     * @return the value of product_task.env
     *
     * @mbggenerated
     */
    public String getEnv() {
        return env;
    }

    /**
     * set the value of the database column product_task.env
     *
     * @param env the value for product_task.env
     *
     * @mbggenerated
     */
    public void setEnv(String env) {
        this.env = env == null ? null : env.trim();
    }

    /**
     * return the value of the database column product_task.sys_name
     *
     * @return the value of product_task.sys_name
     *
     * @mbggenerated
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * set the value of the database column product_task.sys_name
     *
     * @param sysName the value for product_task.sys_name
     *
     * @mbggenerated
     */
    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    /**
     * return the value of the database column product_task.gid
     *
     * @return the value of product_task.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column product_task.gid
     *
     * @param gid the value for product_task.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column product_task.product_code
     *
     * @return the value of product_task.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column product_task.product_code
     *
     * @param productCode the value for product_task.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column product_task.task_status
     *
     * @return the value of product_task.task_status
     *
     * @mbggenerated
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * set the value of the database column product_task.task_status
     *
     * @param taskStatus the value for product_task.task_status
     *
     * @mbggenerated
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    /**
     * return the value of the database column product_task.task_type
     *
     * @return the value of product_task.task_type
     *
     * @mbggenerated
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * set the value of the database column product_task.task_type
     *
     * @param taskType the value for product_task.task_type
     *
     * @mbggenerated
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    /**
     * return the value of the database column product_task.tries
     *
     * @return the value of product_task.tries
     *
     * @mbggenerated
     */
    public Integer getTries() {
        return tries;
    }

    /**
     * set the value of the database column product_task.tries
     *
     * @param tries the value for product_task.tries
     *
     * @mbggenerated
     */
    public void setTries(Integer tries) {
        this.tries = tries;
    }

    /**
     * corresponds to the database table product_task
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
        sb.append(", bizNo=").append(bizNo);
        sb.append(", content=").append(content);
        sb.append(", env=").append(env);
        sb.append(", sysName=").append(sysName);
        sb.append(", gid=").append(gid);
        sb.append(", productCode=").append(productCode);
        sb.append(", taskStatus=").append(taskStatus);
        sb.append(", taskType=").append(taskType);
        sb.append(", tries=").append(tries);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table product_task
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
        ProductTaskDO other = (ProductTaskDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getEnv() == null ? other.getEnv() == null : this.getEnv().equals(other.getEnv()))
            && (this.getSysName() == null ? other.getSysName() == null : this.getSysName().equals(other.getSysName()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getTaskStatus() == null ? other.getTaskStatus() == null : this.getTaskStatus().equals(other.getTaskStatus()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getTries() == null ? other.getTries() == null : this.getTries().equals(other.getTries()));
    }

    /**
     * corresponds to the database table product_task
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
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getEnv() == null) ? 0 : getEnv().hashCode());
        result = prime * result + ((getSysName() == null) ? 0 : getSysName().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getTries() == null) ? 0 : getTries().hashCode());
        return result;
    }
}