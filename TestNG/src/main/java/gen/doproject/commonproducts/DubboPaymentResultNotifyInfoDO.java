/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename DubboPaymentResultNotifyInfoDO.java
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

public class DubboPaymentResultNotifyInfoDO implements Serializable {
    /**
     * corresponds to the database column dubbo_payment_result_notify_info.dubbo_payment_result_notify_info_id
     *
     * @mbggenerated
     */
    private Long dubboPaymentResultNotifyInfoId;

    /**
     * corresponds to the database column dubbo_payment_result_notify_info.dubbo_group
     *
     * @mbggenerated
     */
    private String dubboGroup;

    /**
     * corresponds to the database column dubbo_payment_result_notify_info.dubbo_version
     *
     * @mbggenerated
     */
    private String dubboVersion;

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column dubbo_payment_result_notify_info.dubbo_payment_result_notify_info_id
     *
     * @return the value of dubbo_payment_result_notify_info.dubbo_payment_result_notify_info_id
     *
     * @mbggenerated
     */
    public Long getDubboPaymentResultNotifyInfoId() {
        return dubboPaymentResultNotifyInfoId;
    }

    /**
     * set the value of the database column dubbo_payment_result_notify_info.dubbo_payment_result_notify_info_id
     *
     * @param dubboPaymentResultNotifyInfoId the value for dubbo_payment_result_notify_info.dubbo_payment_result_notify_info_id
     *
     * @mbggenerated
     */
    public void setDubboPaymentResultNotifyInfoId(Long dubboPaymentResultNotifyInfoId) {
        this.dubboPaymentResultNotifyInfoId = dubboPaymentResultNotifyInfoId;
    }

    /**
     * return the value of the database column dubbo_payment_result_notify_info.dubbo_group
     *
     * @return the value of dubbo_payment_result_notify_info.dubbo_group
     *
     * @mbggenerated
     */
    public String getDubboGroup() {
        return dubboGroup;
    }

    /**
     * set the value of the database column dubbo_payment_result_notify_info.dubbo_group
     *
     * @param dubboGroup the value for dubbo_payment_result_notify_info.dubbo_group
     *
     * @mbggenerated
     */
    public void setDubboGroup(String dubboGroup) {
        this.dubboGroup = dubboGroup == null ? null : dubboGroup.trim();
    }

    /**
     * return the value of the database column dubbo_payment_result_notify_info.dubbo_version
     *
     * @return the value of dubbo_payment_result_notify_info.dubbo_version
     *
     * @mbggenerated
     */
    public String getDubboVersion() {
        return dubboVersion;
    }

    /**
     * set the value of the database column dubbo_payment_result_notify_info.dubbo_version
     *
     * @param dubboVersion the value for dubbo_payment_result_notify_info.dubbo_version
     *
     * @mbggenerated
     */
    public void setDubboVersion(String dubboVersion) {
        this.dubboVersion = dubboVersion == null ? null : dubboVersion.trim();
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", dubboPaymentResultNotifyInfoId=").append(dubboPaymentResultNotifyInfoId);
        sb.append(", dubboGroup=").append(dubboGroup);
        sb.append(", dubboVersion=").append(dubboVersion);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
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
        DubboPaymentResultNotifyInfoDO other = (DubboPaymentResultNotifyInfoDO) that;
        return (this.getDubboPaymentResultNotifyInfoId() == null ? other.getDubboPaymentResultNotifyInfoId() == null : this.getDubboPaymentResultNotifyInfoId().equals(other.getDubboPaymentResultNotifyInfoId()))
            && (this.getDubboGroup() == null ? other.getDubboGroup() == null : this.getDubboGroup().equals(other.getDubboGroup()))
            && (this.getDubboVersion() == null ? other.getDubboVersion() == null : this.getDubboVersion().equals(other.getDubboVersion()));
    }

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDubboPaymentResultNotifyInfoId() == null) ? 0 : getDubboPaymentResultNotifyInfoId().hashCode());
        result = prime * result + ((getDubboGroup() == null) ? 0 : getDubboGroup().hashCode());
        result = prime * result + ((getDubboVersion() == null) ? 0 : getDubboVersion().hashCode());
        return result;
    }
}