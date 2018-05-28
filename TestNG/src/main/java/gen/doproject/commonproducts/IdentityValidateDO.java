/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename IdentityValidateDO.java
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

public class IdentityValidateDO implements Serializable {
    /**
     * corresponds to the database column identity_validate.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column identity_validate.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column identity_validate.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column identity_validate.merchant_order_no
     *
     * @mbggenerated
     */
    private String merchantOrderNo;

    /**
     * corresponds to the database column identity_validate.merch_order_no
     *
     * @mbggenerated
     */
    private String merchOrderNo;

    /**
     * corresponds to the database column identity_validate.merchant_user_id
     *
     * @mbggenerated
     */
    private String merchantUserId;

    /**
     * corresponds to the database column identity_validate.merchant_card_no
     *
     * @mbggenerated
     */
    private String merchantCardNo;

    /**
     * corresponds to the database column identity_validate.merchant_acc_no
     *
     * @mbggenerated
     */
    private String merchantAccNo;

    /**
     * corresponds to the database column identity_validate.product_code
     *
     * @mbggenerated
     */
    private String productCode;

    /**
     * corresponds to the database column identity_validate.product_status
     *
     * @mbggenerated
     */
    private String productStatus;

    /**
     * corresponds to the database column identity_validate.inlet
     *
     * @mbggenerated
     */
    private String inlet;

    /**
     * corresponds to the database column identity_validate.charge_no
     *
     * @mbggenerated
     */
    private String chargeNo;

    /**
     * corresponds to the database column identity_validate.pact_no
     *
     * @mbggenerated
     */
    private String pactNo;

    /**
     * corresponds to the database column identity_validate.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column identity_validate.bank_card_no
     *
     * @mbggenerated
     */
    private String bankCardNo;

    /**
     * corresponds to the database column identity_validate.cert_no
     *
     * @mbggenerated
     */
    private String certNo;

    /**
     * corresponds to the database column identity_validate.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * corresponds to the database column identity_validate.phone_no
     *
     * @mbggenerated
     */
    private String phoneNo;

    /**
     * corresponds to the database column identity_validate.sec_index
     *
     * @mbggenerated
     */
    private String secIndex;

    /**
     * corresponds to the database column identity_validate.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column identity_validate.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column identity_validate.id
     *
     * @return the value of identity_validate.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column identity_validate.id
     *
     * @param id the value for identity_validate.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column identity_validate.biz_no
     *
     * @return the value of identity_validate.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column identity_validate.biz_no
     *
     * @param bizNo the value for identity_validate.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column identity_validate.gid
     *
     * @return the value of identity_validate.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column identity_validate.gid
     *
     * @param gid the value for identity_validate.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column identity_validate.merchant_order_no
     *
     * @return the value of identity_validate.merchant_order_no
     *
     * @mbggenerated
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * set the value of the database column identity_validate.merchant_order_no
     *
     * @param merchantOrderNo the value for identity_validate.merchant_order_no
     *
     * @mbggenerated
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * return the value of the database column identity_validate.merch_order_no
     *
     * @return the value of identity_validate.merch_order_no
     *
     * @mbggenerated
     */
    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    /**
     * set the value of the database column identity_validate.merch_order_no
     *
     * @param merchOrderNo the value for identity_validate.merch_order_no
     *
     * @mbggenerated
     */
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo == null ? null : merchOrderNo.trim();
    }

    /**
     * return the value of the database column identity_validate.merchant_user_id
     *
     * @return the value of identity_validate.merchant_user_id
     *
     * @mbggenerated
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * set the value of the database column identity_validate.merchant_user_id
     *
     * @param merchantUserId the value for identity_validate.merchant_user_id
     *
     * @mbggenerated
     */
    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    /**
     * return the value of the database column identity_validate.merchant_card_no
     *
     * @return the value of identity_validate.merchant_card_no
     *
     * @mbggenerated
     */
    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    /**
     * set the value of the database column identity_validate.merchant_card_no
     *
     * @param merchantCardNo the value for identity_validate.merchant_card_no
     *
     * @mbggenerated
     */
    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo == null ? null : merchantCardNo.trim();
    }

    /**
     * return the value of the database column identity_validate.merchant_acc_no
     *
     * @return the value of identity_validate.merchant_acc_no
     *
     * @mbggenerated
     */
    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    /**
     * set the value of the database column identity_validate.merchant_acc_no
     *
     * @param merchantAccNo the value for identity_validate.merchant_acc_no
     *
     * @mbggenerated
     */
    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo == null ? null : merchantAccNo.trim();
    }

    /**
     * return the value of the database column identity_validate.product_code
     *
     * @return the value of identity_validate.product_code
     *
     * @mbggenerated
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * set the value of the database column identity_validate.product_code
     *
     * @param productCode the value for identity_validate.product_code
     *
     * @mbggenerated
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * return the value of the database column identity_validate.product_status
     *
     * @return the value of identity_validate.product_status
     *
     * @mbggenerated
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * set the value of the database column identity_validate.product_status
     *
     * @param productStatus the value for identity_validate.product_status
     *
     * @mbggenerated
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    /**
     * return the value of the database column identity_validate.inlet
     *
     * @return the value of identity_validate.inlet
     *
     * @mbggenerated
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set the value of the database column identity_validate.inlet
     *
     * @param inlet the value for identity_validate.inlet
     *
     * @mbggenerated
     */
    public void setInlet(String inlet) {
        this.inlet = inlet == null ? null : inlet.trim();
    }

    /**
     * return the value of the database column identity_validate.charge_no
     *
     * @return the value of identity_validate.charge_no
     *
     * @mbggenerated
     */
    public String getChargeNo() {
        return chargeNo;
    }

    /**
     * set the value of the database column identity_validate.charge_no
     *
     * @param chargeNo the value for identity_validate.charge_no
     *
     * @mbggenerated
     */
    public void setChargeNo(String chargeNo) {
        this.chargeNo = chargeNo == null ? null : chargeNo.trim();
    }

    /**
     * return the value of the database column identity_validate.pact_no
     *
     * @return the value of identity_validate.pact_no
     *
     * @mbggenerated
     */
    public String getPactNo() {
        return pactNo;
    }

    /**
     * set the value of the database column identity_validate.pact_no
     *
     * @param pactNo the value for identity_validate.pact_no
     *
     * @mbggenerated
     */
    public void setPactNo(String pactNo) {
        this.pactNo = pactNo == null ? null : pactNo.trim();
    }

    /**
     * return the value of the database column identity_validate.memo
     *
     * @return the value of identity_validate.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column identity_validate.memo
     *
     * @param memo the value for identity_validate.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column identity_validate.bank_card_no
     *
     * @return the value of identity_validate.bank_card_no
     *
     * @mbggenerated
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * set the value of the database column identity_validate.bank_card_no
     *
     * @param bankCardNo the value for identity_validate.bank_card_no
     *
     * @mbggenerated
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    /**
     * return the value of the database column identity_validate.cert_no
     *
     * @return the value of identity_validate.cert_no
     *
     * @mbggenerated
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * set the value of the database column identity_validate.cert_no
     *
     * @param certNo the value for identity_validate.cert_no
     *
     * @mbggenerated
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * return the value of the database column identity_validate.user_name
     *
     * @return the value of identity_validate.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set the value of the database column identity_validate.user_name
     *
     * @param userName the value for identity_validate.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * return the value of the database column identity_validate.phone_no
     *
     * @return the value of identity_validate.phone_no
     *
     * @mbggenerated
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * set the value of the database column identity_validate.phone_no
     *
     * @param phoneNo the value for identity_validate.phone_no
     *
     * @mbggenerated
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    /**
     * return the value of the database column identity_validate.sec_index
     *
     * @return the value of identity_validate.sec_index
     *
     * @mbggenerated
     */
    public String getSecIndex() {
        return secIndex;
    }

    /**
     * set the value of the database column identity_validate.sec_index
     *
     * @param secIndex the value for identity_validate.sec_index
     *
     * @mbggenerated
     */
    public void setSecIndex(String secIndex) {
        this.secIndex = secIndex == null ? null : secIndex.trim();
    }

    /**
     * return the value of the database column identity_validate.raw_add_time
     *
     * @return the value of identity_validate.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column identity_validate.raw_add_time
     *
     * @param rawAddTime the value for identity_validate.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column identity_validate.raw_update_time
     *
     * @return the value of identity_validate.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column identity_validate.raw_update_time
     *
     * @param rawUpdateTime the value for identity_validate.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table identity_validate
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
        sb.append(", gid=").append(gid);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", merchOrderNo=").append(merchOrderNo);
        sb.append(", merchantUserId=").append(merchantUserId);
        sb.append(", merchantCardNo=").append(merchantCardNo);
        sb.append(", merchantAccNo=").append(merchantAccNo);
        sb.append(", productCode=").append(productCode);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", inlet=").append(inlet);
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", pactNo=").append(pactNo);
        sb.append(", memo=").append(memo);
        sb.append(", bankCardNo=").append(bankCardNo);
        sb.append(", certNo=").append(certNo);
        sb.append(", userName=").append(userName);
        sb.append(", phoneNo=").append(phoneNo);
        sb.append(", secIndex=").append(secIndex);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table identity_validate
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
        IdentityValidateDO other = (IdentityValidateDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getMerchantOrderNo() == null ? other.getMerchantOrderNo() == null : this.getMerchantOrderNo().equals(other.getMerchantOrderNo()))
            && (this.getMerchOrderNo() == null ? other.getMerchOrderNo() == null : this.getMerchOrderNo().equals(other.getMerchOrderNo()))
            && (this.getMerchantUserId() == null ? other.getMerchantUserId() == null : this.getMerchantUserId().equals(other.getMerchantUserId()))
            && (this.getMerchantCardNo() == null ? other.getMerchantCardNo() == null : this.getMerchantCardNo().equals(other.getMerchantCardNo()))
            && (this.getMerchantAccNo() == null ? other.getMerchantAccNo() == null : this.getMerchantAccNo().equals(other.getMerchantAccNo()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getInlet() == null ? other.getInlet() == null : this.getInlet().equals(other.getInlet()))
            && (this.getChargeNo() == null ? other.getChargeNo() == null : this.getChargeNo().equals(other.getChargeNo()))
            && (this.getPactNo() == null ? other.getPactNo() == null : this.getPactNo().equals(other.getPactNo()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getBankCardNo() == null ? other.getBankCardNo() == null : this.getBankCardNo().equals(other.getBankCardNo()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPhoneNo() == null ? other.getPhoneNo() == null : this.getPhoneNo().equals(other.getPhoneNo()))
            && (this.getSecIndex() == null ? other.getSecIndex() == null : this.getSecIndex().equals(other.getSecIndex()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getMerchantOrderNo() == null) ? 0 : getMerchantOrderNo().hashCode());
        result = prime * result + ((getMerchOrderNo() == null) ? 0 : getMerchOrderNo().hashCode());
        result = prime * result + ((getMerchantUserId() == null) ? 0 : getMerchantUserId().hashCode());
        result = prime * result + ((getMerchantCardNo() == null) ? 0 : getMerchantCardNo().hashCode());
        result = prime * result + ((getMerchantAccNo() == null) ? 0 : getMerchantAccNo().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getInlet() == null) ? 0 : getInlet().hashCode());
        result = prime * result + ((getChargeNo() == null) ? 0 : getChargeNo().hashCode());
        result = prime * result + ((getPactNo() == null) ? 0 : getPactNo().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getBankCardNo() == null) ? 0 : getBankCardNo().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPhoneNo() == null) ? 0 : getPhoneNo().hashCode());
        result = prime * result + ((getSecIndex() == null) ? 0 : getSecIndex().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}