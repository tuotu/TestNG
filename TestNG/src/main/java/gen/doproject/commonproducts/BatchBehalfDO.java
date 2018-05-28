/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename BatchBehalfDO.java
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

public class BatchBehalfDO implements Serializable {
    /**
     * corresponds to the database column batch_behalf.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column batch_behalf.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column batch_behalf.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column batch_behalf.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column batch_behalf.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column batch_behalf.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column batch_behalf.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column batch_behalf.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column batch_behalf.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column batch_behalf.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column batch_behalf.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column batch_behalf.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column batch_behalf.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column batch_behalf.all_file_name
     *
     * @mbggenerated
     */
    private String allFileName;

    /**
     * corresponds to the database column batch_behalf.all_file_path
     *
     * @mbggenerated
     */
    private String allFilePath;

    /**
     * corresponds to the database column batch_behalf.behalf_amt
     *
     * @mbggenerated
     */
    private Money behalfAmt;

    /**
     * corresponds to the database column batch_behalf.behalf_count
     *
     * @mbggenerated
     */
    private Integer behalfCount;

    /**
     * corresponds to the database column batch_behalf.counter_fee
     *
     * @mbggenerated
     */
    private Money counterFee;

    /**
     * corresponds to the database column batch_behalf.fail_reason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * corresponds to the database column batch_behalf.failure_amt
     *
     * @mbggenerated
     */
    private Money failureAmt;

    /**
     * corresponds to the database column batch_behalf.failure_count
     *
     * @mbggenerated
     */
    private Integer failureCount;

    /**
     * corresponds to the database column batch_behalf.freeze_no
     *
     * @mbggenerated
     */
    private String freezeNo;

    /**
     * corresponds to the database column batch_behalf.frozen_no
     *
     * @mbggenerated
     */
    private String frozenNo;

    /**
     * corresponds to the database column batch_behalf.item_counter_fee
     *
     * @mbggenerated
     */
    private Money itemCounterFee;

    /**
     * corresponds to the database column batch_behalf.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * corresponds to the database column batch_behalf.success_amt
     *
     * @mbggenerated
     */
    private Money successAmt;

    /**
     * corresponds to the database column batch_behalf.success_count
     *
     * @mbggenerated
     */
    private Integer successCount;

    /**
     * corresponds to the database column batch_behalf.file_fail_code
     *
     * @mbggenerated
     */
    private String fileFailCode;

    /**
     * corresponds to the database column batch_behalf.fail_file_name
     *
     * @mbggenerated
     */
    private String failFileName;

    /**
     * corresponds to the database column batch_behalf.fail_file_path
     *
     * @mbggenerated
     */
    private String failFilePath;

    /**
     * corresponds to the database column batch_behalf.dubbo_group
     *
     * @mbggenerated
     */
    private String dubboGroup;

    /**
     * corresponds to the database column batch_behalf.dubbo_version
     *
     * @mbggenerated
     */
    private String dubboVersion;

    /**
     * corresponds to the database column batch_behalf.userEndIp
     *
     * @mbggenerated
     */
    private String userendip;

    /**
     * corresponds to the database column batch_behalf.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column batch_behalf.behalf_type
     *
     * @mbggenerated
     */
    private String behalfType;

    /**
     * corresponds to the database column batch_behalf.payer_user_id
     *
     * @mbggenerated
     */
    private String payerUserId;

    /**
     * corresponds to the database column batch_behalf.behalf_count_public
     *
     * @mbggenerated
     */
    private Integer behalfCountPublic;

    /**
     * corresponds to the database column batch_behalf.item_counter_fee_public
     *
     * @mbggenerated
     */
    private Money itemCounterFeePublic;

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column batch_behalf.id
     *
     * @return the value of batch_behalf.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column batch_behalf.id
     *
     * @param id the value for batch_behalf.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column batch_behalf.biz_no
     *
     * @return the value of batch_behalf.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column batch_behalf.biz_no
     *
     * @param bizNo the value for batch_behalf.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column batch_behalf.raw_add_time
     *
     * @return the value of batch_behalf.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column batch_behalf.raw_add_time
     *
     * @param rawAddTime the value for batch_behalf.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column batch_behalf.raw_update_time
     *
     * @return the value of batch_behalf.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column batch_behalf.raw_update_time
     *
     * @param rawUpdateTime the value for batch_behalf.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column batch_behalf.gid
     *
     * @return the value of batch_behalf.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column batch_behalf.gid
     *
     * @param gid the value for batch_behalf.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column batch_behalf.inlet
     *
     * @return the value of batch_behalf.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column batch_behalf.inlet
     *
     * @param inlet the value for batch_behalf.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column batch_behalf.memo
     *
     * @return the value of batch_behalf.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column batch_behalf.memo
     *
     * @param memo the value for batch_behalf.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column batch_behalf.merchant_acc_no
     *
     * @return the value of batch_behalf.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column batch_behalf.merchant_acc_no
     *
     * @param merchantAccNo the value for batch_behalf.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column batch_behalf.merchant_card_no
     *
     * @return the value of batch_behalf.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column batch_behalf.merchant_card_no
     *
     * @param merchantCardNo the value for batch_behalf.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column batch_behalf.merchant_order_no
     *
     * @return the value of batch_behalf.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column batch_behalf.merchant_order_no
     *
     * @param merchantOrderNo the value for batch_behalf.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column batch_behalf.merchant_user_id
     *
     * @return the value of batch_behalf.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column batch_behalf.merchant_user_id
     *
     * @param merchantUserId the value for batch_behalf.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column batch_behalf.product_code
     *
     * @return the value of batch_behalf.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column batch_behalf.product_code
     *
     * @param productCode the value for batch_behalf.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column batch_behalf.product_status
     *
     * @return the value of batch_behalf.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column batch_behalf.product_status
     *
     * @param productStatus the value for batch_behalf.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column batch_behalf.all_file_name
     *
     * @return the value of batch_behalf.all_file_name
     *
     * @mbggenerated
     */
    public String getAllFileName() {
        return allFileName;
    }

    /**
     * set the value of the database column batch_behalf.all_file_name
     *
     * @param allFileName the value for batch_behalf.all_file_name
     *
     * @mbggenerated
     */
    public void setAllFileName(String allFileName) {
        this.allFileName = allFileName == null ? null : allFileName.trim();
    }

    /**
     * return the value of the database column batch_behalf.all_file_path
     *
     * @return the value of batch_behalf.all_file_path
     *
     * @mbggenerated
     */
    public String getAllFilePath() {
        return allFilePath;
    }

    /**
     * set the value of the database column batch_behalf.all_file_path
     *
     * @param allFilePath the value for batch_behalf.all_file_path
     *
     * @mbggenerated
     */
    public void setAllFilePath(String allFilePath) {
        this.allFilePath = allFilePath == null ? null : allFilePath.trim();
    }

    /**
     * return the value of the database column batch_behalf.behalf_amt
     *
     * @return the value of batch_behalf.behalf_amt
     *
     * @mbggenerated
     */
    public Money getBehalfAmt() {
        return behalfAmt;
    }

    /**
     * set the value of the database column batch_behalf.behalf_amt
     *
     * @param behalfAmt the value for batch_behalf.behalf_amt
     *
     * @mbggenerated
     */
    public void setBehalfAmt(Money behalfAmt) {
        this.behalfAmt = behalfAmt;
    }

    /**
     * return the value of the database column batch_behalf.behalf_count
     *
     * @return the value of batch_behalf.behalf_count
     *
     * @mbggenerated
     */
    public Integer getBehalfCount() {
        return behalfCount;
    }

    /**
     * set the value of the database column batch_behalf.behalf_count
     *
     * @param behalfCount the value for batch_behalf.behalf_count
     *
     * @mbggenerated
     */
    public void setBehalfCount(Integer behalfCount) {
        this.behalfCount = behalfCount;
    }

    /**
     * return the value of the database column batch_behalf.counter_fee
     *
     * @return the value of batch_behalf.counter_fee
     *
     * @mbggenerated
     */
    public Money getCounterFee() {
        return counterFee;
    }

    /**
     * set the value of the database column batch_behalf.counter_fee
     *
     * @param counterFee the value for batch_behalf.counter_fee
     *
     * @mbggenerated
     */
    public void setCounterFee(Money counterFee) {
        this.counterFee = counterFee;
    }

    /**
     * return the value of the database column batch_behalf.fail_reason
     *
     * @return the value of batch_behalf.fail_reason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * set the value of the database column batch_behalf.fail_reason
     *
     * @param failReason the value for batch_behalf.fail_reason
     *
     * @mbggenerated
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * return the value of the database column batch_behalf.failure_amt
     *
     * @return the value of batch_behalf.failure_amt
     *
     * @mbggenerated
     */
    public Money getFailureAmt() {
        return failureAmt;
    }

    /**
     * set the value of the database column batch_behalf.failure_amt
     *
     * @param failureAmt the value for batch_behalf.failure_amt
     *
     * @mbggenerated
     */
    public void setFailureAmt(Money failureAmt) {
        this.failureAmt = failureAmt;
    }

    /**
     * return the value of the database column batch_behalf.failure_count
     *
     * @return the value of batch_behalf.failure_count
     *
     * @mbggenerated
     */
    public Integer getFailureCount() {
        return failureCount;
    }

    /**
     * set the value of the database column batch_behalf.failure_count
     *
     * @param failureCount the value for batch_behalf.failure_count
     *
     * @mbggenerated
     */
    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    /**
     * return the value of the database column batch_behalf.freeze_no
     *
     * @return the value of batch_behalf.freeze_no
     *
     * @mbggenerated
     */
    public String getFreezeNo() {
        return freezeNo;
    }

    /**
     * set the value of the database column batch_behalf.freeze_no
     *
     * @param freezeNo the value for batch_behalf.freeze_no
     *
     * @mbggenerated
     */
    public void setFreezeNo(String freezeNo) {
        this.freezeNo = freezeNo == null ? null : freezeNo.trim();
    }

    /**
     * return the value of the database column batch_behalf.frozen_no
     *
     * @return the value of batch_behalf.frozen_no
     *
     * @mbggenerated
     */
    public String getFrozenNo() {
        return frozenNo;
    }

    /**
     * set the value of the database column batch_behalf.frozen_no
     *
     * @param frozenNo the value for batch_behalf.frozen_no
     *
     * @mbggenerated
     */
    public void setFrozenNo(String frozenNo) {
        this.frozenNo = frozenNo == null ? null : frozenNo.trim();
    }

    /**
     * return the value of the database column batch_behalf.item_counter_fee
     *
     * @return the value of batch_behalf.item_counter_fee
     *
     * @mbggenerated
     */
    public Money getItemCounterFee() {
        return itemCounterFee;
    }

    /**
     * set the value of the database column batch_behalf.item_counter_fee
     *
     * @param itemCounterFee the value for batch_behalf.item_counter_fee
     *
     * @mbggenerated
     */
    public void setItemCounterFee(Money itemCounterFee) {
        this.itemCounterFee = itemCounterFee;
    }

    /**
     * return the value of the database column batch_behalf.name
     *
     * @return the value of batch_behalf.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * set the value of the database column batch_behalf.name
     *
     * @param name the value for batch_behalf.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * return the value of the database column batch_behalf.success_amt
     *
     * @return the value of batch_behalf.success_amt
     *
     * @mbggenerated
     */
    public Money getSuccessAmt() {
        return successAmt;
    }

    /**
     * set the value of the database column batch_behalf.success_amt
     *
     * @param successAmt the value for batch_behalf.success_amt
     *
     * @mbggenerated
     */
    public void setSuccessAmt(Money successAmt) {
        this.successAmt = successAmt;
    }

    /**
     * return the value of the database column batch_behalf.success_count
     *
     * @return the value of batch_behalf.success_count
     *
     * @mbggenerated
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    /**
     * set the value of the database column batch_behalf.success_count
     *
     * @param successCount the value for batch_behalf.success_count
     *
     * @mbggenerated
     */
    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    /**
     * return the value of the database column batch_behalf.file_fail_code
     *
     * @return the value of batch_behalf.file_fail_code
     *
     * @mbggenerated
     */
    public String getFileFailCode() {
        return fileFailCode;
    }

    /**
     * set the value of the database column batch_behalf.file_fail_code
     *
     * @param fileFailCode the value for batch_behalf.file_fail_code
     *
     * @mbggenerated
     */
    public void setFileFailCode(String fileFailCode) {
        this.fileFailCode = fileFailCode == null ? null : fileFailCode.trim();
    }

    /**
     * return the value of the database column batch_behalf.fail_file_name
     *
     * @return the value of batch_behalf.fail_file_name
     *
     * @mbggenerated
     */
    public String getFailFileName() {
        return failFileName;
    }

    /**
     * set the value of the database column batch_behalf.fail_file_name
     *
     * @param failFileName the value for batch_behalf.fail_file_name
     *
     * @mbggenerated
     */
    public void setFailFileName(String failFileName) {
        this.failFileName = failFileName == null ? null : failFileName.trim();
    }

    /**
     * return the value of the database column batch_behalf.fail_file_path
     *
     * @return the value of batch_behalf.fail_file_path
     *
     * @mbggenerated
     */
    public String getFailFilePath() {
        return failFilePath;
    }

    /**
     * set the value of the database column batch_behalf.fail_file_path
     *
     * @param failFilePath the value for batch_behalf.fail_file_path
     *
     * @mbggenerated
     */
    public void setFailFilePath(String failFilePath) {
        this.failFilePath = failFilePath == null ? null : failFilePath.trim();
    }

    /**
     * return the value of the database column batch_behalf.dubbo_group
     *
     * @return the value of batch_behalf.dubbo_group
     *
     * @mbggenerated
     */
    public String getDubboGroup() {
        return dubboGroup;
    }

    /**
     * set the value of the database column batch_behalf.dubbo_group
     *
     * @param dubboGroup the value for batch_behalf.dubbo_group
     *
     * @mbggenerated
     */
    public void setDubboGroup(String dubboGroup) {
        this.dubboGroup = dubboGroup == null ? null : dubboGroup.trim();
    }

    /**
     * return the value of the database column batch_behalf.dubbo_version
     *
     * @return the value of batch_behalf.dubbo_version
     *
     * @mbggenerated
     */
    public String getDubboVersion() {
        return dubboVersion;
    }

    /**
     * set the value of the database column batch_behalf.dubbo_version
     *
     * @param dubboVersion the value for batch_behalf.dubbo_version
     *
     * @mbggenerated
     */
    public void setDubboVersion(String dubboVersion) {
        this.dubboVersion = dubboVersion == null ? null : dubboVersion.trim();
    }

    /**
     * return the value of the database column batch_behalf.userEndIp
     *
     * @return the value of batch_behalf.userEndIp
     *
     * @mbggenerated
     */
    public String getUserendip() {
        return userendip;
    }

    /**
     * set the value of the database column batch_behalf.userEndIp
     *
     * @param userendip the value for batch_behalf.userEndIp
     *
     * @mbggenerated
     */
    public void setUserendip(String userendip) {
        this.userendip = userendip == null ? null : userendip.trim();
    }

    /**
     * return the value of the database column batch_behalf.merch_order_no
     *
     * @return the value of batch_behalf.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column batch_behalf.merch_order_no
     *
     * @param merchOrderNo the value for batch_behalf.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column batch_behalf.behalf_type
     *
     * @return the value of batch_behalf.behalf_type
     *
     * @mbggenerated
     */
    public String getBehalfType() {
        return behalfType;
    }

    /**
     * set the value of the database column batch_behalf.behalf_type
     *
     * @param behalfType the value for batch_behalf.behalf_type
     *
     * @mbggenerated
     */
    public void setBehalfType(String behalfType) {
        this.behalfType = behalfType == null ? null : behalfType.trim();
    }

    /**
     * return the value of the database column batch_behalf.payer_user_id
     *
     * @return the value of batch_behalf.payer_user_id
     *
     * @mbggenerated
     */
    public String getPayerUserId() {
        return payerUserId;
    }

    /**
     * set the value of the database column batch_behalf.payer_user_id
     *
     * @param payerUserId the value for batch_behalf.payer_user_id
     *
     * @mbggenerated
     */
    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId == null ? null : payerUserId.trim();
    }

    /**
     * return the value of the database column batch_behalf.behalf_count_public
     *
     * @return the value of batch_behalf.behalf_count_public
     *
     * @mbggenerated
     */
    public Integer getBehalfCountPublic() {
        return behalfCountPublic;
    }

    /**
     * set the value of the database column batch_behalf.behalf_count_public
     *
     * @param behalfCountPublic the value for batch_behalf.behalf_count_public
     *
     * @mbggenerated
     */
    public void setBehalfCountPublic(Integer behalfCountPublic) {
        this.behalfCountPublic = behalfCountPublic;
    }

    /**
     * return the value of the database column batch_behalf.item_counter_fee_public
     *
     * @return the value of batch_behalf.item_counter_fee_public
     *
     * @mbggenerated
     */
    public Money getItemCounterFeePublic() {
        return itemCounterFeePublic;
    }

    /**
     * set the value of the database column batch_behalf.item_counter_fee_public
     *
     * @param itemCounterFeePublic the value for batch_behalf.item_counter_fee_public
     *
     * @mbggenerated
     */
    public void setItemCounterFeePublic(Money itemCounterFeePublic) {
        this.itemCounterFeePublic = itemCounterFeePublic;
    }

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append(", gid=").append(gid);
        sb.append(", inlet=").append(inlet);
        sb.append(", memo=").append(memo);
        sb.append(", merchantAccNo=").append(merchantAccNo);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", productCode=").append(productCode);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", allFileName=").append(allFileName);
        sb.append(", allFilePath=").append(allFilePath);
        sb.append(", behalfAmt=").append(behalfAmt);
        sb.append(", behalfCount=").append(behalfCount);
        sb.append(", counterFee=").append(counterFee);
        sb.append(", failReason=").append(failReason);
        sb.append(", failureAmt=").append(failureAmt);
        sb.append(", failureCount=").append(failureCount);
        sb.append(", freezeNo=").append(freezeNo);
        sb.append(", frozenNo=").append(frozenNo);
        sb.append(", itemCounterFee=").append(itemCounterFee);
        sb.append(", name=").append(name);
        sb.append(", successAmt=").append(successAmt);
        sb.append(", successCount=").append(successCount);
        sb.append(", fileFailCode=").append(fileFailCode);
        sb.append(", failFileName=").append(failFileName);
        sb.append(", failFilePath=").append(failFilePath);
        sb.append(", dubboGroup=").append(dubboGroup);
        sb.append(", dubboVersion=").append(dubboVersion);
        sb.append(", userendip=").append(userendip);
        sb.append(", merchOrderNo=").append(merchOrderNo);
        sb.append(", behalfType=").append(behalfType);
        sb.append(", payerUserId=").append(payerUserId);
        sb.append(", behalfCountPublic=").append(behalfCountPublic);
        sb.append(", itemCounterFeePublic=").append(itemCounterFeePublic);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table batch_behalf
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
        BatchBehalfDO other = (BatchBehalfDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getInlet() == null ? other.getInlet() == null : this.getInlet().equals(other.getInlet()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getMerchantAccNo() == null ? other.getMerchantAccNo() == null : this.getMerchantAccNo().equals(other.getMerchantAccNo()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantOrderNo() == null ? other.getMerchantOrderNo() == null : this.getMerchantOrderNo().equals(other.getMerchantOrderNo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getAllFileName() == null ? other.getAllFileName() == null : this.getAllFileName().equals(other.getAllFileName()))
            && (this.getAllFilePath() == null ? other.getAllFilePath() == null : this.getAllFilePath().equals(other.getAllFilePath()))
            && (this.getBehalfAmt() == null ? other.getBehalfAmt() == null : this.getBehalfAmt().equals(other.getBehalfAmt()))
            && (this.getBehalfCount() == null ? other.getBehalfCount() == null : this.getBehalfCount().equals(other.getBehalfCount()))
            && (this.getCounterFee() == null ? other.getCounterFee() == null : this.getCounterFee().equals(other.getCounterFee()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getFailureAmt() == null ? other.getFailureAmt() == null : this.getFailureAmt().equals(other.getFailureAmt()))
            && (this.getFailureCount() == null ? other.getFailureCount() == null : this.getFailureCount().equals(other.getFailureCount()))
            && (this.getFreezeNo() == null ? other.getFreezeNo() == null : this.getFreezeNo().equals(other.getFreezeNo()))
            && (this.getFrozenNo() == null ? other.getFrozenNo() == null : this.getFrozenNo().equals(other.getFrozenNo()))
            && (this.getItemCounterFee() == null ? other.getItemCounterFee() == null : this.getItemCounterFee().equals(other.getItemCounterFee()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSuccessAmt() == null ? other.getSuccessAmt() == null : this.getSuccessAmt().equals(other.getSuccessAmt()))
            && (this.getSuccessCount() == null ? other.getSuccessCount() == null : this.getSuccessCount().equals(other.getSuccessCount()))
            && (this.getFileFailCode() == null ? other.getFileFailCode() == null : this.getFileFailCode().equals(other.getFileFailCode()))
            && (this.getFailFileName() == null ? other.getFailFileName() == null : this.getFailFileName().equals(other.getFailFileName()))
            && (this.getFailFilePath() == null ? other.getFailFilePath() == null : this.getFailFilePath().equals(other.getFailFilePath()))
            && (this.getDubboGroup() == null ? other.getDubboGroup() == null : this.getDubboGroup().equals(other.getDubboGroup()))
            && (this.getDubboVersion() == null ? other.getDubboVersion() == null : this.getDubboVersion().equals(other.getDubboVersion()))
            && (this.getUserendip() == null ? other.getUserendip() == null : this.getUserendip().equals(other.getUserendip()))
            && (this.getMerchOrderNo() == null ? other.getMerchOrderNo() == null : this.getMerchOrderNo().equals(other.getMerchOrderNo()))
            && (this.getBehalfType() == null ? other.getBehalfType() == null : this.getBehalfType().equals(other.getBehalfType()))
            && (this.getPayerUserId() == null ? other.getPayerUserId() == null : this.getPayerUserId().equals(other.getPayerUserId()))
            && (this.getBehalfCountPublic() == null ? other.getBehalfCountPublic() == null : this.getBehalfCountPublic().equals(other.getBehalfCountPublic()))
            && (this.getItemCounterFeePublic() == null ? other.getItemCounterFeePublic() == null : this.getItemCounterFeePublic().equals(other.getItemCounterFeePublic()));
    }

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getInlet() == null) ? 0 : getInlet().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getMerchantAccNo() == null) ? 0 : getMerchantAccNo().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantOrderNo() == null) ? 0 : getMerchantOrderNo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getAllFileName() == null) ? 0 : getAllFileName().hashCode());
        result = prime * result + ((getAllFilePath() == null) ? 0 : getAllFilePath().hashCode());
        result = prime * result + ((getBehalfAmt() == null) ? 0 : getBehalfAmt().hashCode());
        result = prime * result + ((getBehalfCount() == null) ? 0 : getBehalfCount().hashCode());
        result = prime * result + ((getCounterFee() == null) ? 0 : getCounterFee().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getFailureAmt() == null) ? 0 : getFailureAmt().hashCode());
        result = prime * result + ((getFailureCount() == null) ? 0 : getFailureCount().hashCode());
        result = prime * result + ((getFreezeNo() == null) ? 0 : getFreezeNo().hashCode());
        result = prime * result + ((getFrozenNo() == null) ? 0 : getFrozenNo().hashCode());
        result = prime * result + ((getItemCounterFee() == null) ? 0 : getItemCounterFee().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSuccessAmt() == null) ? 0 : getSuccessAmt().hashCode());
        result = prime * result + ((getSuccessCount() == null) ? 0 : getSuccessCount().hashCode());
        result = prime * result + ((getFileFailCode() == null) ? 0 : getFileFailCode().hashCode());
        result = prime * result + ((getFailFileName() == null) ? 0 : getFailFileName().hashCode());
        result = prime * result + ((getFailFilePath() == null) ? 0 : getFailFilePath().hashCode());
        result = prime * result + ((getDubboGroup() == null) ? 0 : getDubboGroup().hashCode());
        result = prime * result + ((getDubboVersion() == null) ? 0 : getDubboVersion().hashCode());
        result = prime * result + ((getUserendip() == null) ? 0 : getUserendip().hashCode());
        result = prime * result + ((getMerchOrderNo() == null) ? 0 : getMerchOrderNo().hashCode());
        result = prime * result + ((getBehalfType() == null) ? 0 : getBehalfType().hashCode());
        result = prime * result + ((getPayerUserId() == null) ? 0 : getPayerUserId().hashCode());
        result = prime * result + ((getBehalfCountPublic() == null) ? 0 : getBehalfCountPublic().hashCode());
        result = prime * result + ((getItemCounterFeePublic() == null) ? 0 : getItemCounterFeePublic().hashCode());
        return result;
    }
}