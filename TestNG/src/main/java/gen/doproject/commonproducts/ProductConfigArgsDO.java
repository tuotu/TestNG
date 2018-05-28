/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductConfigArgsDO.java
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

public class ProductConfigArgsDO implements Serializable {
    /**
     * corresponds to the database column product_config_args.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column product_config_args.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column product_config_args.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column product_config_args.arg_key
     *
     * @mbggenerated
     */
    private String argKey;

    /**
     * corresponds to the database column product_config_args.arg_value
     *
     * @mbggenerated
     */
    private String argValue;

    /**
     * corresponds to the database column product_config_args.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column product_config_args.id
     *
     * @return the value of product_config_args.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column product_config_args.id
     *
     * @param id the value for product_config_args.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column product_config_args.raw_add_time
     *
     * @return the value of product_config_args.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column product_config_args.raw_add_time
     *
     * @param rawAddTime the value for product_config_args.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column product_config_args.raw_update_time
     *
     * @return the value of product_config_args.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column product_config_args.raw_update_time
     *
     * @param rawUpdateTime the value for product_config_args.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column product_config_args.arg_key
     *
     * @return the value of product_config_args.arg_key
     *
     * @mbggenerated
     */
    public String getArgKey() {
        return argKey;
    }

    /**
     * set the value of the database column product_config_args.arg_key
     *
     * @param argKey the value for product_config_args.arg_key
     *
     * @mbggenerated
     */
    public void setArgKey(String argKey) {
        this.argKey = argKey == null ? null : argKey.trim();
    }

    /**
     * return the value of the database column product_config_args.arg_value
     *
     * @return the value of product_config_args.arg_value
     *
     * @mbggenerated
     */
    public String getArgValue() {
        return argValue;
    }

    /**
     * set the value of the database column product_config_args.arg_value
     *
     * @param argValue the value for product_config_args.arg_value
     *
     * @mbggenerated
     */
    public void setArgValue(String argValue) {
        this.argValue = argValue == null ? null : argValue.trim();
    }

    /**
     * return the value of the database column product_config_args.status
     *
     * @return the value of product_config_args.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * set the value of the database column product_config_args.status
     *
     * @param status the value for product_config_args.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * corresponds to the database table product_config_args
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
        sb.append(", argKey=").append(argKey);
        sb.append(", argValue=").append(argValue);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table product_config_args
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
        ProductConfigArgsDO other = (ProductConfigArgsDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getArgKey() == null ? other.getArgKey() == null : this.getArgKey().equals(other.getArgKey()))
            && (this.getArgValue() == null ? other.getArgValue() == null : this.getArgValue().equals(other.getArgValue()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * corresponds to the database table product_config_args
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
        result = prime * result + ((getArgKey() == null) ? 0 : getArgKey().hashCode());
        result = prime * result + ((getArgValue() == null) ? 0 : getArgValue().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}