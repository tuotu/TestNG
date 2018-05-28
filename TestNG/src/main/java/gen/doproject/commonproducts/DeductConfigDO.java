/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename DeductConfigDO.java
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

public class DeductConfigDO implements Serializable {
    /**
     * corresponds to the database column deduct_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column deduct_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column deduct_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column deduct_config.active
     *
     * @mbggenerated
     */
    private String active;

    /**
     * corresponds to the database column deduct_config.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column deduct_config.merchant_name
     *
     * @mbggenerated
     */
    private String merchantName;

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column deduct_config.id
     *
     * @return the value of deduct_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column deduct_config.id
     *
     * @param id the value for deduct_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column deduct_config.raw_add_time
     *
     * @return the value of deduct_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column deduct_config.raw_add_time
     *
     * @param rawAddTime the value for deduct_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column deduct_config.raw_update_time
     *
     * @return the value of deduct_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column deduct_config.raw_update_time
     *
     * @param rawUpdateTime the value for deduct_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column deduct_config.active
     *
     * @return the value of deduct_config.active
     *
     * @mbggenerated
     */
    public String getActive() {
        return active;
    }

    /**
     * set the value of the database column deduct_config.active
     *
     * @param active the value for deduct_config.active
     *
     * @mbggenerated
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * return the value of the database column deduct_config.merchant_card_no
     *
     * @return the value of deduct_config.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column deduct_config.merchant_card_no
     *
     * @param merchantCardNo the value for deduct_config.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column deduct_config.merchant_name
     *
     * @return the value of deduct_config.merchant_name
     *
     * @mbggenerated
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * set the value of the database column deduct_config.merchant_name
     *
     * @param merchantName the value for deduct_config.merchant_name
     *
     * @mbggenerated
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    /**
     * corresponds to the database table deduct_config
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
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantName=").append(merchantName);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table deduct_config
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
        DeductConfigDO other = (DeductConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()));
    }

    /**
     * corresponds to the database table deduct_config
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
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        return result;
    }
}