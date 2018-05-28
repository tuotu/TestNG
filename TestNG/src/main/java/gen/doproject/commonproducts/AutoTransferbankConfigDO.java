/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoTransferbankConfigDO.java
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

public class AutoTransferbankConfigDO implements Serializable {
    /**
     * corresponds to the database column auto_transferbank_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column auto_transferbank_config.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column auto_transferbank_config.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column auto_transferbank_config.amount_option
     *
     * @mbggenerated
     */
    private String amountOption;

    /**
     * corresponds to the database column auto_transferbank_config.amount_option_value
     *
     * @mbggenerated
     */
    private Long amountOptionValue;

    /**
     * corresponds to the database column auto_transferbank_config.amount_threshold
     *
     * @mbggenerated
     */
    private Long amountThreshold;

    /**
     * corresponds to the database column auto_transferbank_config.config_from
     *
     * @mbggenerated
     */
    private String configFrom;

    /**
     * corresponds to the database column auto_transferbank_config.env
     *
     * @mbggenerated
     */
    private String env;

    /**
     * corresponds to the database column auto_transferbank_config.expire_time
     *
     * @mbggenerated
     */
    private Date expireTime;

    /**
     * corresponds to the database column auto_transferbank_config.first_execute_time
     *
     * @mbggenerated
     */
    private Date firstExecuteTime;

    /**
     * corresponds to the database column auto_transferbank_config.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column auto_transferbank_config.last_execute_time
     *
     * @mbggenerated
     */
    private Date lastExecuteTime;

    /**
     * corresponds to the database column auto_transferbank_config.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column auto_transferbank_config.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column auto_transferbank_config.next_execute_time
     *
     * @mbggenerated
     */
    private Date nextExecuteTime;

    /**
     * corresponds to the database column auto_transferbank_config.opened
     *
     * @mbggenerated
     */
    private Byte opened;

    /**
     * corresponds to the database column auto_transferbank_config.period_rule
     *
     * @mbggenerated
     */
    private String periodRule;

    /**
     * corresponds to the database column auto_transferbank_config.strategy
     *
     * @mbggenerated
     */
    private String strategy;

    /**
     * corresponds to the database column auto_transferbank_config.trigger_option
     *
     * @mbggenerated
     */
    private String triggerOption;

    /**
     * corresponds to the database column auto_transferbank_config.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database column auto_transferbank_config.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * corresponds to the database column auto_transferbank_config.user_real_name
     *
     * @mbggenerated
     */
    private String userRealName;

    /**
     * corresponds to the database column auto_transferbank_config.account_name
     *
     * @mbggenerated
     */
    private String accountName;

    /**
     * corresponds to the database column auto_transferbank_config.bank_address
     *
     * @mbggenerated
     */
    private String bankAddress;

    /**
     * corresponds to the database column auto_transferbank_config.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column auto_transferbank_config.bank_code
     *
     * @mbggenerated
     */
    private String bankCode;

    /**
     * corresponds to the database column auto_transferbank_config.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * corresponds to the database column auto_transferbank_config.card_bind_id
     *
     * @mbggenerated
     */
    private String cardBindId;

    /**
     * corresponds to the database column auto_transferbank_config.card_no
     *
     * @mbggenerated
     */
    private String cardNo;

    /**
     * corresponds to the database column auto_transferbank_config.city_name
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * corresponds to the database column auto_transferbank_config.delay
     *
     * @mbggenerated
     */
    private Integer delay;

    /**
     * corresponds to the database column auto_transferbank_config.prov_name
     *
     * @mbggenerated
     */
    private String provName;

    /**
     * corresponds to the database column auto_transferbank_config.public_tag
     *
     * @mbggenerated
     */
    private String publicTag;

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column auto_transferbank_config.id
     *
     * @return the value of auto_transferbank_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column auto_transferbank_config.id
     *
     * @param id the value for auto_transferbank_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column auto_transferbank_config.raw_add_time
     *
     * @return the value of auto_transferbank_config.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column auto_transferbank_config.raw_add_time
     *
     * @param rawAddTime the value for auto_transferbank_config.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column auto_transferbank_config.raw_update_time
     *
     * @return the value of auto_transferbank_config.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column auto_transferbank_config.raw_update_time
     *
     * @param rawUpdateTime the value for auto_transferbank_config.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column auto_transferbank_config.amount_option
     *
     * @return the value of auto_transferbank_config.amount_option
     *
     * @mbggenerated
     */
    public String getAmountOption() {
        return amountOption;
    }

    /**
     * set the value of the database column auto_transferbank_config.amount_option
     *
     * @param amountOption the value for auto_transferbank_config.amount_option
     *
     * @mbggenerated
     */
    public void setAmountOption(String amountOption) {
        this.amountOption = amountOption == null ? null : amountOption.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.amount_option_value
     *
     * @return the value of auto_transferbank_config.amount_option_value
     *
     * @mbggenerated
     */
    public Long getAmountOptionValue() {
        return amountOptionValue;
    }

    /**
     * set the value of the database column auto_transferbank_config.amount_option_value
     *
     * @param amountOptionValue the value for auto_transferbank_config.amount_option_value
     *
     * @mbggenerated
     */
    public void setAmountOptionValue(Long amountOptionValue) {
        this.amountOptionValue = amountOptionValue;
    }

    /**
     * return the value of the database column auto_transferbank_config.amount_threshold
     *
     * @return the value of auto_transferbank_config.amount_threshold
     *
     * @mbggenerated
     */
    public Long getAmountThreshold() {
        return amountThreshold;
    }

    /**
     * set the value of the database column auto_transferbank_config.amount_threshold
     *
     * @param amountThreshold the value for auto_transferbank_config.amount_threshold
     *
     * @mbggenerated
     */
    public void setAmountThreshold(Long amountThreshold) {
        this.amountThreshold = amountThreshold;
    }

    /**
     * return the value of the database column auto_transferbank_config.config_from
     *
     * @return the value of auto_transferbank_config.config_from
     *
     * @mbggenerated
     */
    public String getConfigFrom() {
        return configFrom;
    }

    /**
     * set the value of the database column auto_transferbank_config.config_from
     *
     * @param configFrom the value for auto_transferbank_config.config_from
     *
     * @mbggenerated
     */
    public void setConfigFrom(String configFrom) {
        this.configFrom = configFrom == null ? null : configFrom.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.env
     *
     * @return the value of auto_transferbank_config.env
     *
     * @mbggenerated
     */
    public String getEnv() {
        return env;
    }

    /**
     * set the value of the database column auto_transferbank_config.env
     *
     * @param env the value for auto_transferbank_config.env
     *
     * @mbggenerated
     */
    public void setEnv(String env) {
        this.env = env == null ? null : env.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.expire_time
     *
     * @return the value of auto_transferbank_config.expire_time
     *
     * @mbggenerated
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * set the value of the database column auto_transferbank_config.expire_time
     *
     * @param expireTime the value for auto_transferbank_config.expire_time
     *
     * @mbggenerated
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * return the value of the database column auto_transferbank_config.first_execute_time
     *
     * @return the value of auto_transferbank_config.first_execute_time
     *
     * @mbggenerated
     */
    public Date getFirstExecuteTime() {
        return firstExecuteTime;
    }

    /**
     * set the value of the database column auto_transferbank_config.first_execute_time
     *
     * @param firstExecuteTime the value for auto_transferbank_config.first_execute_time
     *
     * @mbggenerated
     */
    public void setFirstExecuteTime(Date firstExecuteTime) {
        this.firstExecuteTime = firstExecuteTime;
    }

    /**
     * return the value of the database column auto_transferbank_config.inlet
     *
     * @return the value of auto_transferbank_config.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column auto_transferbank_config.inlet
     *
     * @param inlet the value for auto_transferbank_config.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.last_execute_time
     *
     * @return the value of auto_transferbank_config.last_execute_time
     *
     * @mbggenerated
     */
    public Date getLastExecuteTime() {
        return lastExecuteTime;
    }

    /**
     * set the value of the database column auto_transferbank_config.last_execute_time
     *
     * @param lastExecuteTime the value for auto_transferbank_config.last_execute_time
     *
     * @mbggenerated
     */
    public void setLastExecuteTime(Date lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
    }

    /**
     * return the value of the database column auto_transferbank_config.memo
     *
     * @return the value of auto_transferbank_config.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column auto_transferbank_config.memo
     *
     * @param memo the value for auto_transferbank_config.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.merchant_card_no
     *
     * @return the value of auto_transferbank_config.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column auto_transferbank_config.merchant_card_no
     *
     * @param merchantCardNo the value for auto_transferbank_config.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.next_execute_time
     *
     * @return the value of auto_transferbank_config.next_execute_time
     *
     * @mbggenerated
     */
    public Date getNextExecuteTime() {
        return nextExecuteTime;
    }

    /**
     * set the value of the database column auto_transferbank_config.next_execute_time
     *
     * @param nextExecuteTime the value for auto_transferbank_config.next_execute_time
     *
     * @mbggenerated
     */
    public void setNextExecuteTime(Date nextExecuteTime) {
        this.nextExecuteTime = nextExecuteTime;
    }

    /**
     * return the value of the database column auto_transferbank_config.opened
     *
     * @return the value of auto_transferbank_config.opened
     *
     * @mbggenerated
     */
    public Byte getOpened() {
        return opened;
    }

    /**
     * set the value of the database column auto_transferbank_config.opened
     *
     * @param opened the value for auto_transferbank_config.opened
     *
     * @mbggenerated
     */
    public void setOpened(Byte opened) {
        this.opened = opened;
    }

    /**
     * return the value of the database column auto_transferbank_config.period_rule
     *
     * @return the value of auto_transferbank_config.period_rule
     *
     * @mbggenerated
     */
    public String getPeriodRule() {
        return periodRule;
    }

    /**
     * set the value of the database column auto_transferbank_config.period_rule
     *
     * @param periodRule the value for auto_transferbank_config.period_rule
     *
     * @mbggenerated
     */
    public void setPeriodRule(String periodRule) {
        this.periodRule = periodRule == null ? null : periodRule.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.strategy
     *
     * @return the value of auto_transferbank_config.strategy
     *
     * @mbggenerated
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * set the value of the database column auto_transferbank_config.strategy
     *
     * @param strategy the value for auto_transferbank_config.strategy
     *
     * @mbggenerated
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy == null ? null : strategy.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.trigger_option
     *
     * @return the value of auto_transferbank_config.trigger_option
     *
     * @mbggenerated
     */
    public String getTriggerOption() {
        return triggerOption;
    }

    /**
     * set the value of the database column auto_transferbank_config.trigger_option
     *
     * @param triggerOption the value for auto_transferbank_config.trigger_option
     *
     * @mbggenerated
     */
    public void setTriggerOption(String triggerOption) {
        this.triggerOption = triggerOption == null ? null : triggerOption.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.user_id
     *
     * @return the value of auto_transferbank_config.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column auto_transferbank_config.user_id
     *
     * @param userId the value for auto_transferbank_config.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.user_name
     *
     * @return the value of auto_transferbank_config.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set the value of the database column auto_transferbank_config.user_name
     *
     * @param userName the value for auto_transferbank_config.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.user_real_name
     *
     * @return the value of auto_transferbank_config.user_real_name
     *
     * @mbggenerated
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * set the value of the database column auto_transferbank_config.user_real_name
     *
     * @param userRealName the value for auto_transferbank_config.user_real_name
     *
     * @mbggenerated
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.account_name
     *
     * @return the value of auto_transferbank_config.account_name
     *
     * @mbggenerated
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set the value of the database column auto_transferbank_config.account_name
     *
     * @param accountName the value for auto_transferbank_config.account_name
     *
     * @mbggenerated
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.bank_address
     *
     * @return the value of auto_transferbank_config.bank_address
     *
     * @mbggenerated
     */
    public String getBankAddress() {
        return bankAddress;
    }

    /**
     * set the value of the database column auto_transferbank_config.bank_address
     *
     * @param bankAddress the value for auto_transferbank_config.bank_address
     *
     * @mbggenerated
     */
    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.sec_index
     *
     * @return the value of auto_transferbank_config.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column auto_transferbank_config.sec_index
     *
     * @param secIndex the value for auto_transferbank_config.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.bank_code
     *
     * @return the value of auto_transferbank_config.bank_code
     *
     * @mbggenerated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set the value of the database column auto_transferbank_config.bank_code
     *
     * @param bankCode the value for auto_transferbank_config.bank_code
     *
     * @mbggenerated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.bank_name
     *
     * @return the value of auto_transferbank_config.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set the value of the database column auto_transferbank_config.bank_name
     *
     * @param bankName the value for auto_transferbank_config.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.card_bind_id
     *
     * @return the value of auto_transferbank_config.card_bind_id
     *
     * @mbggenerated
     */
    public String getCardBindId() {
        return cardBindId;
    }

    /**
     * set the value of the database column auto_transferbank_config.card_bind_id
     *
     * @param cardBindId the value for auto_transferbank_config.card_bind_id
     *
     * @mbggenerated
     */
    public void setCardBindId(String cardBindId) {
        this.cardBindId = cardBindId == null ? null : cardBindId.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.card_no
     *
     * @return the value of auto_transferbank_config.card_no
     *
     * @mbggenerated
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * set the value of the database column auto_transferbank_config.card_no
     *
     * @param cardNo the value for auto_transferbank_config.card_no
     *
     * @mbggenerated
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.city_name
     *
     * @return the value of auto_transferbank_config.city_name
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * set the value of the database column auto_transferbank_config.city_name
     *
     * @param cityName the value for auto_transferbank_config.city_name
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.delay
     *
     * @return the value of auto_transferbank_config.delay
     *
     * @mbggenerated
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * set the value of the database column auto_transferbank_config.delay
     *
     * @param delay the value for auto_transferbank_config.delay
     *
     * @mbggenerated
     */
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    /**
     * return the value of the database column auto_transferbank_config.prov_name
     *
     * @return the value of auto_transferbank_config.prov_name
     *
     * @mbggenerated
     */
    public String getProvName() {
        return provName;
    }

    /**
     * set the value of the database column auto_transferbank_config.prov_name
     *
     * @param provName the value for auto_transferbank_config.prov_name
     *
     * @mbggenerated
     */
    public void setProvName(String provName) {
        this.provName = provName == null ? null : provName.trim();
    }

    /**
     * return the value of the database column auto_transferbank_config.public_tag
     *
     * @return the value of auto_transferbank_config.public_tag
     *
     * @mbggenerated
     */
    public String getPublicTag() {
        return publicTag;
    }

    /**
     * set the value of the database column auto_transferbank_config.public_tag
     *
     * @param publicTag the value for auto_transferbank_config.public_tag
     *
     * @mbggenerated
     */
    public void setPublicTag(String publicTag) {
        this.publicTag = publicTag == null ? null : publicTag.trim();
    }

    /**
     * corresponds to the database table auto_transferbank_config
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
        sb.append(", amountOption=").append(amountOption);
        sb.append(", amountOptionValue=").append(amountOptionValue);
        sb.append(", amountThreshold=").append(amountThreshold);
        sb.append(", configFrom=").append(configFrom);
        sb.append(", env=").append(env);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", firstExecuteTime=").append(firstExecuteTime);
        sb.append(", inlet=").append(inlet);
        sb.append(", lastExecuteTime=").append(lastExecuteTime);
        sb.append(", memo=").append(memo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", nextExecuteTime=").append(nextExecuteTime);
        sb.append(", opened=").append(opened);
        sb.append(", periodRule=").append(periodRule);
        sb.append(", strategy=").append(strategy);
        sb.append(", triggerOption=").append(triggerOption);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userRealName=").append(userRealName);
        sb.append(", accountName=").append(accountName);
        sb.append(", bankAddress=").append(bankAddress);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", cardBindId=").append(cardBindId);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", cityName=").append(cityName);
        sb.append(", delay=").append(delay);
        sb.append(", provName=").append(provName);
        sb.append(", publicTag=").append(publicTag);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table auto_transferbank_config
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
        AutoTransferbankConfigDO other = (AutoTransferbankConfigDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getAmountOption() == null ? other.getAmountOption() == null : this.getAmountOption().equals(other.getAmountOption()))
            && (this.getAmountOptionValue() == null ? other.getAmountOptionValue() == null : this.getAmountOptionValue().equals(other.getAmountOptionValue()))
            && (this.getAmountThreshold() == null ? other.getAmountThreshold() == null : this.getAmountThreshold().equals(other.getAmountThreshold()))
            && (this.getConfigFrom() == null ? other.getConfigFrom() == null : this.getConfigFrom().equals(other.getConfigFrom()))
            && (this.getEnv() == null ? other.getEnv() == null : this.getEnv().equals(other.getEnv()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getFirstExecuteTime() == null ? other.getFirstExecuteTime() == null : this.getFirstExecuteTime().equals(other.getFirstExecuteTime()))
            && (this.getInlet() == null ? other.getInlet() == null : this.getInlet().equals(other.getInlet()))
            && (this.getLastExecuteTime() == null ? other.getLastExecuteTime() == null : this.getLastExecuteTime().equals(other.getLastExecuteTime()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getNextExecuteTime() == null ? other.getNextExecuteTime() == null : this.getNextExecuteTime().equals(other.getNextExecuteTime()))
            && (this.getOpened() == null ? other.getOpened() == null : this.getOpened().equals(other.getOpened()))
            && (this.getPeriodRule() == null ? other.getPeriodRule() == null : this.getPeriodRule().equals(other.getPeriodRule()))
            && (this.getStrategy() == null ? other.getStrategy() == null : this.getStrategy().equals(other.getStrategy()))
            && (this.getTriggerOption() == null ? other.getTriggerOption() == null : this.getTriggerOption().equals(other.getTriggerOption()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserRealName() == null ? other.getUserRealName() == null : this.getUserRealName().equals(other.getUserRealName()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getBankAddress() == null ? other.getBankAddress() == null : this.getBankAddress().equals(other.getBankAddress()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getCardBindId() == null ? other.getCardBindId() == null : this.getCardBindId().equals(other.getCardBindId()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getDelay() == null ? other.getDelay() == null : this.getDelay().equals(other.getDelay()))
            && (this.getProvName() == null ? other.getProvName() == null : this.getProvName().equals(other.getProvName()))
            && (this.getPublicTag() == null ? other.getPublicTag() == null : this.getPublicTag().equals(other.getPublicTag()));
    }

    /**
     * corresponds to the database table auto_transferbank_config
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
        result = prime * result + ((getAmountOption() == null) ? 0 : getAmountOption().hashCode());
        result = prime * result + ((getAmountOptionValue() == null) ? 0 : getAmountOptionValue().hashCode());
        result = prime * result + ((getAmountThreshold() == null) ? 0 : getAmountThreshold().hashCode());
        result = prime * result + ((getConfigFrom() == null) ? 0 : getConfigFrom().hashCode());
        result = prime * result + ((getEnv() == null) ? 0 : getEnv().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getFirstExecuteTime() == null) ? 0 : getFirstExecuteTime().hashCode());
        result = prime * result + ((getInlet() == null) ? 0 : getInlet().hashCode());
        result = prime * result + ((getLastExecuteTime() == null) ? 0 : getLastExecuteTime().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getNextExecuteTime() == null) ? 0 : getNextExecuteTime().hashCode());
        result = prime * result + ((getOpened() == null) ? 0 : getOpened().hashCode());
        result = prime * result + ((getPeriodRule() == null) ? 0 : getPeriodRule().hashCode());
        result = prime * result + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        result = prime * result + ((getTriggerOption() == null) ? 0 : getTriggerOption().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserRealName() == null) ? 0 : getUserRealName().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getBankAddress() == null) ? 0 : getBankAddress().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getCardBindId() == null) ? 0 : getCardBindId().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getDelay() == null) ? 0 : getDelay().hashCode());
        result = prime * result + ((getProvName() == null) ? 0 : getProvName().hashCode());
        result = prime * result + ((getPublicTag() == null) ? 0 : getPublicTag().hashCode());
        return result;
    }
}