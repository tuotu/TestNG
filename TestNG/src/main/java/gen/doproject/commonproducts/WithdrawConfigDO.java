/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawConfigDO.java
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

public class WithdrawConfigDO implements Serializable {
    /**
     * corresponds to the database column withdraw_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column withdraw_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column withdraw_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column withdraw_config.delay_hour_context
     *
     * @mbggenerated
     */
    private String delayHourContext;

    /**
     * corresponds to the database column withdraw_config.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column withdraw_config.merchant_name
     *
     * @mbggenerated
     */
    private String merchantName;

    /**
     * corresponds to the database column withdraw_config.auto
     *
     * @mbggenerated
     */
    private Integer auto;

    /**
     * corresponds to the database column withdraw_config.normal
     *
     * @mbggenerated
     */
    private Integer normal;

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column withdraw_config.id
     *
     * @return the value of withdraw_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column withdraw_config.id
     *
     * @param id the value for withdraw_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column withdraw_config.raw_add_time
     *
     * @return the value of withdraw_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column withdraw_config.raw_add_time
     *
     * @param rawAddTime the value for withdraw_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column withdraw_config.raw_update_time
     *
     * @return the value of withdraw_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column withdraw_config.raw_update_time
     *
     * @param rawUpdateTime the value for withdraw_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column withdraw_config.delay_hour_context
     *
     * @return the value of withdraw_config.delay_hour_context
     *
     * @mbggenerated
     */
    public String getDelayHourContext() {
        return delayHourContext;
    }

    /**
     * set the value of the database column withdraw_config.delay_hour_context
     *
     * @param delayHourContext the value for withdraw_config.delay_hour_context
     *
     * @mbggenerated
     */
    public void setDelayHourContext(String delayHourContext) {
        this.delayHourContext = delayHourContext == null ? null : delayHourContext.trim();
    }

    /**
     * return the value of the database column withdraw_config.merchant_card_no
     *
     * @return the value of withdraw_config.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column withdraw_config.merchant_card_no
     *
     * @param merchantCardNo the value for withdraw_config.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column withdraw_config.merchant_name
     *
     * @return the value of withdraw_config.merchant_name
     *
     * @mbggenerated
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * set the value of the database column withdraw_config.merchant_name
     *
     * @param merchantName the value for withdraw_config.merchant_name
     *
     * @mbggenerated
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    /**
     * return the value of the database column withdraw_config.auto
     *
     * @return the value of withdraw_config.auto
     *
     * @mbggenerated
     */
    public Integer getAuto() {
        return auto;
    }

    /**
     * set the value of the database column withdraw_config.auto
     *
     * @param auto the value for withdraw_config.auto
     *
     * @mbggenerated
     */
    public void setAuto(Integer auto) {
        this.auto = auto;
    }

    /**
     * return the value of the database column withdraw_config.normal
     *
     * @return the value of withdraw_config.normal
     *
     * @mbggenerated
     */
    public Integer getNormal() {
        return normal;
    }

    /**
     * set the value of the database column withdraw_config.normal
     *
     * @param normal the value for withdraw_config.normal
     *
     * @mbggenerated
     */
    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    /**
     * corresponds to the database table withdraw_config
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
        sb.append(", delayHourContext=").append(delayHourContext);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", auto=").append(auto);
        sb.append(", normal=").append(normal);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table withdraw_config
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
        WithdrawConfigDO other = (WithdrawConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getDelayHourContext() == null ? other.getDelayHourContext() == null : this.getDelayHourContext().equals(other.getDelayHourContext()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getAuto() == null ? other.getAuto() == null : this.getAuto().equals(other.getAuto()))
            && (this.getNormal() == null ? other.getNormal() == null : this.getNormal().equals(other.getNormal()));
    }

    /**
     * corresponds to the database table withdraw_config
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
        result = prime * result + ((getDelayHourContext() == null) ? 0 : getDelayHourContext().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getAuto() == null) ? 0 : getAuto().hashCode());
        result = prime * result + ((getNormal() == null) ? 0 : getNormal().hashCode());
        return result;
    }
}