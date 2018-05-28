/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconFileDO.java
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

public class ReconFileDO implements Serializable {
    /**
     * corresponds to the database column recon_file.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column recon_file.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column recon_file.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column recon_file.account_alias
     *
     * @mbggenerated
     */
    private String accountAlias;

    /**
     * corresponds to the database column recon_file.account_no
     *
     * @mbggenerated
     */
    private String accountNo;

    /**
     * corresponds to the database column recon_file.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column recon_file.card_no
     *
     * @mbggenerated
     */
    private String cardNo;

    /**
     * corresponds to the database column recon_file.gid
     *
     * @mbggenerated
     */
    private String gid;

    /**
     * corresponds to the database column recon_file.order_no
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * corresponds to the database column recon_file.recon_date
     *
     * @mbggenerated
     */
    private String reconDate;

    /**
     * corresponds to the database column recon_file.recon_file_dir
     *
     * @mbggenerated
     */
    private String reconFileDir;

    /**
     * corresponds to the database column recon_file.recon_file_name
     *
     * @mbggenerated
     */
    private String reconFileName;

    /**
     * corresponds to the database column recon_file.recon_file_status
     *
     * @mbggenerated
     */
    private String reconFileStatus;

    /**
     * corresponds to the database column recon_file.total_count
     *
     * @mbggenerated
     */
    private Long totalCount;

    /**
     * corresponds to the database column recon_file.read_status
     *
     * @mbggenerated
     */
    private String readStatus;

    /**
     * corresponds to the database column recon_file.recon_template_code
     *
     * @mbggenerated
     */
    private String reconTemplateCode;

    /**
     * corresponds to the database column recon_file.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column recon_file.id
     *
     * @return the value of recon_file.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column recon_file.id
     *
     * @param id the value for recon_file.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column recon_file.raw_add_time
     *
     * @return the value of recon_file.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column recon_file.raw_add_time
     *
     * @param rawAddTime the value for recon_file.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column recon_file.raw_update_time
     *
     * @return the value of recon_file.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column recon_file.raw_update_time
     *
     * @param rawUpdateTime the value for recon_file.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column recon_file.account_alias
     *
     * @return the value of recon_file.account_alias
     *
     * @mbggenerated
     */
    public String getAccountAlias() {
        return accountAlias;
    }

    /**
     * set the value of the database column recon_file.account_alias
     *
     * @param accountAlias the value for recon_file.account_alias
     *
     * @mbggenerated
     */
    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias == null ? null : accountAlias.trim();
    }

    /**
     * return the value of the database column recon_file.account_no
     *
     * @return the value of recon_file.account_no
     *
     * @mbggenerated
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * set the value of the database column recon_file.account_no
     *
     * @param accountNo the value for recon_file.account_no
     *
     * @mbggenerated
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * return the value of the database column recon_file.biz_no
     *
     * @return the value of recon_file.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column recon_file.biz_no
     *
     * @param bizNo the value for recon_file.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column recon_file.card_no
     *
     * @return the value of recon_file.card_no
     *
     * @mbggenerated
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * set the value of the database column recon_file.card_no
     *
     * @param cardNo the value for recon_file.card_no
     *
     * @mbggenerated
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * return the value of the database column recon_file.gid
     *
     * @return the value of recon_file.gid
     *
     * @mbggenerated
     */
    public String getGid() {
        return gid;
    }

    /**
     * set the value of the database column recon_file.gid
     *
     * @param gid the value for recon_file.gid
     *
     * @mbggenerated
     */
    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    /**
     * return the value of the database column recon_file.order_no
     *
     * @return the value of recon_file.order_no
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * set the value of the database column recon_file.order_no
     *
     * @param orderNo the value for recon_file.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * return the value of the database column recon_file.recon_date
     *
     * @return the value of recon_file.recon_date
     *
     * @mbggenerated
     */
    public String getReconDate() {
        return reconDate;
    }

    /**
     * set the value of the database column recon_file.recon_date
     *
     * @param reconDate the value for recon_file.recon_date
     *
     * @mbggenerated
     */
    public void setReconDate(String reconDate) {
        this.reconDate = reconDate == null ? null : reconDate.trim();
    }

    /**
     * return the value of the database column recon_file.recon_file_dir
     *
     * @return the value of recon_file.recon_file_dir
     *
     * @mbggenerated
     */
    public String getReconFileDir() {
        return reconFileDir;
    }

    /**
     * set the value of the database column recon_file.recon_file_dir
     *
     * @param reconFileDir the value for recon_file.recon_file_dir
     *
     * @mbggenerated
     */
    public void setReconFileDir(String reconFileDir) {
        this.reconFileDir = reconFileDir == null ? null : reconFileDir.trim();
    }

    /**
     * return the value of the database column recon_file.recon_file_name
     *
     * @return the value of recon_file.recon_file_name
     *
     * @mbggenerated
     */
    public String getReconFileName() {
        return reconFileName;
    }

    /**
     * set the value of the database column recon_file.recon_file_name
     *
     * @param reconFileName the value for recon_file.recon_file_name
     *
     * @mbggenerated
     */
    public void setReconFileName(String reconFileName) {
        this.reconFileName = reconFileName == null ? null : reconFileName.trim();
    }

    /**
     * return the value of the database column recon_file.recon_file_status
     *
     * @return the value of recon_file.recon_file_status
     *
     * @mbggenerated
     */
    public String getReconFileStatus() {
        return reconFileStatus;
    }

    /**
     * set the value of the database column recon_file.recon_file_status
     *
     * @param reconFileStatus the value for recon_file.recon_file_status
     *
     * @mbggenerated
     */
    public void setReconFileStatus(String reconFileStatus) {
        this.reconFileStatus = reconFileStatus == null ? null : reconFileStatus.trim();
    }

    /**
     * return the value of the database column recon_file.total_count
     *
     * @return the value of recon_file.total_count
     *
     * @mbggenerated
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * set the value of the database column recon_file.total_count
     *
     * @param totalCount the value for recon_file.total_count
     *
     * @mbggenerated
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * return the value of the database column recon_file.read_status
     *
     * @return the value of recon_file.read_status
     *
     * @mbggenerated
     */
    public String getReadStatus() {
        return readStatus;
    }

    /**
     * set the value of the database column recon_file.read_status
     *
     * @param readStatus the value for recon_file.read_status
     *
     * @mbggenerated
     */
    public void setReadStatus(String readStatus) {
        this.readStatus = readStatus == null ? null : readStatus.trim();
    }

    /**
     * return the value of the database column recon_file.recon_template_code
     *
     * @return the value of recon_file.recon_template_code
     *
     * @mbggenerated
     */
    public String getReconTemplateCode() {
        return reconTemplateCode;
    }

    /**
     * set the value of the database column recon_file.recon_template_code
     *
     * @param reconTemplateCode the value for recon_file.recon_template_code
     *
     * @mbggenerated
     */
    public void setReconTemplateCode(String reconTemplateCode) {
        this.reconTemplateCode = reconTemplateCode == null ? null : reconTemplateCode.trim();
    }

    /**
     * return the value of the database column recon_file.user_id
     *
     * @return the value of recon_file.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set the value of the database column recon_file.user_id
     *
     * @param userId the value for recon_file.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * corresponds to the database table recon_file
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
        sb.append(", accountAlias=").append(accountAlias);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", gid=").append(gid);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", reconDate=").append(reconDate);
        sb.append(", reconFileDir=").append(reconFileDir);
        sb.append(", reconFileName=").append(reconFileName);
        sb.append(", reconFileStatus=").append(reconFileStatus);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", readStatus=").append(readStatus);
        sb.append(", reconTemplateCode=").append(reconTemplateCode);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table recon_file
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
        ReconFileDO other = (ReconFileDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getAccountAlias() == null ? other.getAccountAlias() == null : this.getAccountAlias().equals(other.getAccountAlias()))
            && (this.getAccountNo() == null ? other.getAccountNo() == null : this.getAccountNo().equals(other.getAccountNo()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getReconDate() == null ? other.getReconDate() == null : this.getReconDate().equals(other.getReconDate()))
            && (this.getReconFileDir() == null ? other.getReconFileDir() == null : this.getReconFileDir().equals(other.getReconFileDir()))
            && (this.getReconFileName() == null ? other.getReconFileName() == null : this.getReconFileName().equals(other.getReconFileName()))
            && (this.getReconFileStatus() == null ? other.getReconFileStatus() == null : this.getReconFileStatus().equals(other.getReconFileStatus()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getReadStatus() == null ? other.getReadStatus() == null : this.getReadStatus().equals(other.getReadStatus()))
            && (this.getReconTemplateCode() == null ? other.getReconTemplateCode() == null : this.getReconTemplateCode().equals(other.getReconTemplateCode()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * corresponds to the database table recon_file
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
        result = prime * result + ((getAccountAlias() == null) ? 0 : getAccountAlias().hashCode());
        result = prime * result + ((getAccountNo() == null) ? 0 : getAccountNo().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getReconDate() == null) ? 0 : getReconDate().hashCode());
        result = prime * result + ((getReconFileDir() == null) ? 0 : getReconFileDir().hashCode());
        result = prime * result + ((getReconFileName() == null) ? 0 : getReconFileName().hashCode());
        result = prime * result + ((getReconFileStatus() == null) ? 0 : getReconFileStatus().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getReadStatus() == null) ? 0 : getReadStatus().hashCode());
        result = prime * result + ((getReconTemplateCode() == null) ? 0 : getReconTemplateCode().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}