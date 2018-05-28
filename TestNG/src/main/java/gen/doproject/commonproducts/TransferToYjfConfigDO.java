/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferToYjfConfigDO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.doproject.commonproducts;

import com.yjf.common.lang.util.money.Money;
import java.io.Serializable;
import java.util.Date;

public class TransferToYjfConfigDO implements Serializable {
    /**
     * corresponds to the database column transfer_to_yjf_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column transfer_to_yjf_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column transfer_to_yjf_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column transfer_to_yjf_config.attach_validate
     *
     * @mbggenerated
     */
    private String attachValidate;

    /**
     * corresponds to the database column transfer_to_yjf_config.attach_validate_amount
     *
     * @mbggenerated
     */
    private Money attachValidateAmount;

    /**
     * corresponds to the database column transfer_to_yjf_config.attach_validate_type
     *
     * @mbggenerated
     */
    private String attachValidateType;

    /**
     * corresponds to the database column transfer_to_yjf_config.auto
     *
     * @mbggenerated
     */
    private String auto;

    /**
     * corresponds to the database column transfer_to_yjf_config.business_active
     *
     * @mbggenerated
     */
    private String businessActive;

    /**
     * corresponds to the database column transfer_to_yjf_config.normal
     *
     * @mbggenerated
     */
    private String normal;

    /**
     * corresponds to the database column transfer_to_yjf_config.person_active
     *
     * @mbggenerated
     */
    private String personActive;

    /**
     * corresponds to the database column transfer_to_yjf_config.delay_hours
     *
     * @mbggenerated
     */
    private String delayHours;

    /**
     * corresponds to the database column transfer_to_yjf_config.business_config
     *
     * @mbggenerated
     */
    private Long businessConfig;

    /**
     * corresponds to the database column transfer_to_yjf_config.personal_config
     *
     * @mbggenerated
     */
    private Long personalConfig;

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column transfer_to_yjf_config.id
     *
     * @return the value of transfer_to_yjf_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.id
     *
     * @param id the value for transfer_to_yjf_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column transfer_to_yjf_config.raw_add_time
     *
     * @return the value of transfer_to_yjf_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.raw_add_time
     *
     * @param rawAddTime the value for transfer_to_yjf_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column transfer_to_yjf_config.raw_update_time
     *
     * @return the value of transfer_to_yjf_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.raw_update_time
     *
     * @param rawUpdateTime the value for transfer_to_yjf_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column transfer_to_yjf_config.attach_validate
     *
     * @return the value of transfer_to_yjf_config.attach_validate
     *
     * @mbggenerated
     */
    public String getAttachValidate() {
        return attachValidate;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.attach_validate
     *
     * @param attachValidate the value for transfer_to_yjf_config.attach_validate
     *
     * @mbggenerated
     */
    public void setAttachValidate(String attachValidate) {
        this.attachValidate = attachValidate == null ? null : attachValidate.trim();
    }

    /**
     * return the value of the database column transfer_to_yjf_config.attach_validate_amount
     *
     * @return the value of transfer_to_yjf_config.attach_validate_amount
     *
     * @mbggenerated
     */
    public Money getAttachValidateAmount() {
        return attachValidateAmount;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.attach_validate_amount
     *
     * @param attachValidateAmount the value for transfer_to_yjf_config.attach_validate_amount
     *
     * @mbggenerated
     */
    public void setAttachValidateAmount(Money attachValidateAmount) {
        this.attachValidateAmount = attachValidateAmount;
    }

    /**
     * return the value of the database column transfer_to_yjf_config.attach_validate_type
     *
     * @return the value of transfer_to_yjf_config.attach_validate_type
     *
     * @mbggenerated
     */
    public String getAttachValidateType() {
        return attachValidateType;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.attach_validate_type
     *
     * @param attachValidateType the value for transfer_to_yjf_config.attach_validate_type
     *
     * @mbggenerated
     */
    public void setAttachValidateType(String attachValidateType) {
        this.attachValidateType = attachValidateType == null ? null : attachValidateType.trim();
    }

    /**
     * return the value of the database column transfer_to_yjf_config.auto
     *
     * @return the value of transfer_to_yjf_config.auto
     *
     * @mbggenerated
     */
    public String getAuto() {
        return auto;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.auto
     *
     * @param auto the value for transfer_to_yjf_config.auto
     *
     * @mbggenerated
     */
    public void setAuto(String auto) {
        this.auto = auto == null ? null : auto.trim();
    }

    /**
     * return the value of the database column transfer_to_yjf_config.business_active
     *
     * @return the value of transfer_to_yjf_config.business_active
     *
     * @mbggenerated
     */
    public String getBusinessActive() {
        return businessActive;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.business_active
     *
     * @param businessActive the value for transfer_to_yjf_config.business_active
     *
     * @mbggenerated
     */
    public void setBusinessActive(String businessActive) {
        this.businessActive = businessActive == null ? null : businessActive.trim();
    }

    /**
     * return the value of the database column transfer_to_yjf_config.normal
     *
     * @return the value of transfer_to_yjf_config.normal
     *
     * @mbggenerated
     */
    public String getNormal() {
        return normal;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.normal
     *
     * @param normal the value for transfer_to_yjf_config.normal
     *
     * @mbggenerated
     */
    public void setNormal(String normal) {
        this.normal = normal == null ? null : normal.trim();
    }

    /**
     * return the value of the database column transfer_to_yjf_config.person_active
     *
     * @return the value of transfer_to_yjf_config.person_active
     *
     * @mbggenerated
     */
    public String getPersonActive() {
        return personActive;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.person_active
     *
     * @param personActive the value for transfer_to_yjf_config.person_active
     *
     * @mbggenerated
     */
    public void setPersonActive(String personActive) {
        this.personActive = personActive == null ? null : personActive.trim();
    }

    /**
     * return the value of the database column transfer_to_yjf_config.delay_hours
     *
     * @return the value of transfer_to_yjf_config.delay_hours
     *
     * @mbggenerated
     */
    public String getDelayHours() {
        return delayHours;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.delay_hours
     *
     * @param delayHours the value for transfer_to_yjf_config.delay_hours
     *
     * @mbggenerated
     */
    public void setDelayHours(String delayHours) {
        this.delayHours = delayHours == null ? null : delayHours.trim();
    }

    /**
     * return the value of the database column transfer_to_yjf_config.business_config
     *
     * @return the value of transfer_to_yjf_config.business_config
     *
     * @mbggenerated
     */
    public Long getBusinessConfig() {
        return businessConfig;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.business_config
     *
     * @param businessConfig the value for transfer_to_yjf_config.business_config
     *
     * @mbggenerated
     */
    public void setBusinessConfig(Long businessConfig) {
        this.businessConfig = businessConfig;
    }

    /**
     * return the value of the database column transfer_to_yjf_config.personal_config
     *
     * @return the value of transfer_to_yjf_config.personal_config
     *
     * @mbggenerated
     */
    public Long getPersonalConfig() {
        return personalConfig;
    }

    /**
     * set the value of the database column transfer_to_yjf_config.personal_config
     *
     * @param personalConfig the value for transfer_to_yjf_config.personal_config
     *
     * @mbggenerated
     */
    public void setPersonalConfig(Long personalConfig) {
        this.personalConfig = personalConfig;
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
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
        sb.append(", attachValidate=").append(attachValidate);
        sb.append(", attachValidateAmount=").append(attachValidateAmount);
        sb.append(", attachValidateType=").append(attachValidateType);
        sb.append(", auto=").append(auto);
        sb.append(", businessActive=").append(businessActive);
        sb.append(", normal=").append(normal);
        sb.append(", personActive=").append(personActive);
        sb.append(", delayHours=").append(delayHours);
        sb.append(", businessConfig=").append(businessConfig);
        sb.append(", personalConfig=").append(personalConfig);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
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
        TransferToYjfConfigDO other = (TransferToYjfConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getAttachValidate() == null ? other.getAttachValidate() == null : this.getAttachValidate().equals(other.getAttachValidate()))
            && (this.getAttachValidateAmount() == null ? other.getAttachValidateAmount() == null : this.getAttachValidateAmount().equals(other.getAttachValidateAmount()))
            && (this.getAttachValidateType() == null ? other.getAttachValidateType() == null : this.getAttachValidateType().equals(other.getAttachValidateType()))
            && (this.getAuto() == null ? other.getAuto() == null : this.getAuto().equals(other.getAuto()))
            && (this.getBusinessActive() == null ? other.getBusinessActive() == null : this.getBusinessActive().equals(other.getBusinessActive()))
            && (this.getNormal() == null ? other.getNormal() == null : this.getNormal().equals(other.getNormal()))
            && (this.getPersonActive() == null ? other.getPersonActive() == null : this.getPersonActive().equals(other.getPersonActive()))
            && (this.getDelayHours() == null ? other.getDelayHours() == null : this.getDelayHours().equals(other.getDelayHours()))
            && (this.getBusinessConfig() == null ? other.getBusinessConfig() == null : this.getBusinessConfig().equals(other.getBusinessConfig()))
            && (this.getPersonalConfig() == null ? other.getPersonalConfig() == null : this.getPersonalConfig().equals(other.getPersonalConfig()));
    }

    /**
     * corresponds to the database table transfer_to_yjf_config
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
        result = prime * result + ((getAttachValidate() == null) ? 0 : getAttachValidate().hashCode());
        result = prime * result + ((getAttachValidateAmount() == null) ? 0 : getAttachValidateAmount().hashCode());
        result = prime * result + ((getAttachValidateType() == null) ? 0 : getAttachValidateType().hashCode());
        result = prime * result + ((getAuto() == null) ? 0 : getAuto().hashCode());
        result = prime * result + ((getBusinessActive() == null) ? 0 : getBusinessActive().hashCode());
        result = prime * result + ((getNormal() == null) ? 0 : getNormal().hashCode());
        result = prime * result + ((getPersonActive() == null) ? 0 : getPersonActive().hashCode());
        result = prime * result + ((getDelayHours() == null) ? 0 : getDelayHours().hashCode());
        result = prime * result + ((getBusinessConfig() == null) ? 0 : getBusinessConfig().hashCode());
        result = prime * result + ((getPersonalConfig() == null) ? 0 : getPersonalConfig().hashCode());
        return result;
    }
}