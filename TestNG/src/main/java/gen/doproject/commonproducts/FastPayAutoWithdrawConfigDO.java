/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayAutoWithdrawConfigDO.java
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

public class FastPayAutoWithdrawConfigDO implements Serializable {
    /**
     * corresponds to the database column fast_pay_auto_withdraw_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column fast_pay_auto_withdraw_config.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column fast_pay_auto_withdraw_config.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column fast_pay_auto_withdraw_config.opened
     *
     * @mbggenerated
     */
    private Byte opened;

    /**
     * corresponds to the database column fast_pay_auto_withdraw_config.sign_no
     *
     * @mbggenerated
     */
    private String signNo;

    /**
     * corresponds to the database column fast_pay_auto_withdraw_config.delays
     *
     * @mbggenerated
     */
    private Integer delays;

    /**
     * corresponds to the database column fast_pay_auto_withdraw_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay_auto_withdraw_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay_auto_withdraw_config.id
     *
     * @return the value of fast_pay_auto_withdraw_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay_auto_withdraw_config.id
     *
     * @param id the value for fast_pay_auto_withdraw_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay_auto_withdraw_config.merchant_card_no
     *
     * @return the value of fast_pay_auto_withdraw_config.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column fast_pay_auto_withdraw_config.merchant_card_no
     *
     * @param merchantCardNo the value for fast_pay_auto_withdraw_config.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column fast_pay_auto_withdraw_config.user_id
     *
     * @return the value of fast_pay_auto_withdraw_config.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column fast_pay_auto_withdraw_config.user_id
     *
     * @param userId the value for fast_pay_auto_withdraw_config.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column fast_pay_auto_withdraw_config.opened
     *
     * @return the value of fast_pay_auto_withdraw_config.opened
     *
     * @mbggenerated
     */
    public Byte getOpened() {
        return opened;
    }

    /**
     * set the value of the database column fast_pay_auto_withdraw_config.opened
     *
     * @param opened the value for fast_pay_auto_withdraw_config.opened
     *
     * @mbggenerated
     */
    public void setOpened(Byte opened) {
        this.opened = opened;
    }

    /**
     * return the value of the database column fast_pay_auto_withdraw_config.sign_no
     *
     * @return the value of fast_pay_auto_withdraw_config.sign_no
     *
     * @mbggenerated
     */
    public String getSignNo() {
        return signNo;
    }

    /**
     * set the value of the database column fast_pay_auto_withdraw_config.sign_no
     *
     * @param signNo the value for fast_pay_auto_withdraw_config.sign_no
     *
     * @mbggenerated
     */
    public void setSignNo(String signNo) {
        this.signNo = signNo == null ? null : signNo.trim();
    }

    /**
     * return the value of the database column fast_pay_auto_withdraw_config.delays
     *
     * @return the value of fast_pay_auto_withdraw_config.delays
     *
     * @mbggenerated
     */
    public Integer getDelays() {
        return delays;
    }

    /**
     * set the value of the database column fast_pay_auto_withdraw_config.delays
     *
     * @param delays the value for fast_pay_auto_withdraw_config.delays
     *
     * @mbggenerated
     */
    public void setDelays(Integer delays) {
        this.delays = delays;
    }

    /**
     * return the value of the database column fast_pay_auto_withdraw_config.raw_add_time
     *
     * @return the value of fast_pay_auto_withdraw_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay_auto_withdraw_config.raw_add_time
     *
     * @param rawAddTime the value for fast_pay_auto_withdraw_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay_auto_withdraw_config.raw_update_time
     *
     * @return the value of fast_pay_auto_withdraw_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay_auto_withdraw_config.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay_auto_withdraw_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", userId=").append(userId);
        sb.append(", opened=").append(opened);
        sb.append(", signNo=").append(signNo);
        sb.append(", delays=").append(delays);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
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
        FastPayAutoWithdrawConfigDO other = (FastPayAutoWithdrawConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOpened() == null ? other.getOpened() == null : this.getOpened().equals(other.getOpened()))
            && (this.getSignNo() == null ? other.getSignNo() == null : this.getSignNo().equals(other.getSignNo()))
            && (this.getDelays() == null ? other.getDelays() == null : this.getDelays().equals(other.getDelays()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOpened() == null) ? 0 : getOpened().hashCode());
        result = prime * result + ((getSignNo() == null) ? 0 : getSignNo().hashCode());
        result = prime * result + ((getDelays() == null) ? 0 : getDelays().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}