/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingPartnerDO.java
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

public class ClearingPartnerDO implements Serializable {
    /**
     * corresponds to the database column clearing_partner.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column clearing_partner.partner_name
     *
     * @mbggenerated
     */
    private String partnerName;

    /**
     * corresponds to the database column clearing_partner.partner_id
     *
     * @mbggenerated
     */
    private String partnerId;

    /**
     * corresponds to the database column clearing_partner.union_partner_id
     *
     * @mbggenerated
     */
    private String unionPartnerId;

    /**
     * corresponds to the database column clearing_partner.bind_status
     *
     * @mbggenerated
     */
    private String bindStatus;

    /**
     * corresponds to the database column clearing_partner.gmt_create
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * corresponds to the database column clearing_partner.gmt_modified
     *
     * @mbggenerated
     */
    private Date gmtModified;

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column clearing_partner.id
     *
     * @return the value of clearing_partner.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column clearing_partner.id
     *
     * @param id the value for clearing_partner.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column clearing_partner.partner_name
     *
     * @return the value of clearing_partner.partner_name
     *
     * @mbggenerated
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * set the value of the database column clearing_partner.partner_name
     *
     * @param partnerName the value for clearing_partner.partner_name
     *
     * @mbggenerated
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    /**
     * return the value of the database column clearing_partner.partner_id
     *
     * @return the value of clearing_partner.partner_id
     *
     * @mbggenerated
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * set the value of the database column clearing_partner.partner_id
     *
     * @param partnerId the value for clearing_partner.partner_id
     *
     * @mbggenerated
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    /**
     * return the value of the database column clearing_partner.union_partner_id
     *
     * @return the value of clearing_partner.union_partner_id
     *
     * @mbggenerated
     */
    public String getUnionPartnerId() {
        return unionPartnerId;
    }

    /**
     * set the value of the database column clearing_partner.union_partner_id
     *
     * @param unionPartnerId the value for clearing_partner.union_partner_id
     *
     * @mbggenerated
     */
    public void setUnionPartnerId(String unionPartnerId) {
        this.unionPartnerId = unionPartnerId == null ? null : unionPartnerId.trim();
    }

    /**
     * return the value of the database column clearing_partner.bind_status
     *
     * @return the value of clearing_partner.bind_status
     *
     * @mbggenerated
     */
    public String getBindStatus() {
        return bindStatus;
    }

    /**
     * set the value of the database column clearing_partner.bind_status
     *
     * @param bindStatus the value for clearing_partner.bind_status
     *
     * @mbggenerated
     */
    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus == null ? null : bindStatus.trim();
    }

    /**
     * return the value of the database column clearing_partner.gmt_create
     *
     * @return the value of clearing_partner.gmt_create
     *
     * @mbggenerated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * set the value of the database column clearing_partner.gmt_create
     *
     * @param gmtCreate the value for clearing_partner.gmt_create
     *
     * @mbggenerated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * return the value of the database column clearing_partner.gmt_modified
     *
     * @return the value of clearing_partner.gmt_modified
     *
     * @mbggenerated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * set the value of the database column clearing_partner.gmt_modified
     *
     * @param gmtModified the value for clearing_partner.gmt_modified
     *
     * @mbggenerated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", partnerName=").append(partnerName);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", unionPartnerId=").append(unionPartnerId);
        sb.append(", bindStatus=").append(bindStatus);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table clearing_partner
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
        ClearingPartnerDO other = (ClearingPartnerDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPartnerName() == null ? other.getPartnerName() == null : this.getPartnerName().equals(other.getPartnerName()))
            && (this.getPartnerId() == null ? other.getPartnerId() == null : this.getPartnerId().equals(other.getPartnerId()))
            && (this.getUnionPartnerId() == null ? other.getUnionPartnerId() == null : this.getUnionPartnerId().equals(other.getUnionPartnerId()))
            && (this.getBindStatus() == null ? other.getBindStatus() == null : this.getBindStatus().equals(other.getBindStatus()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPartnerName() == null) ? 0 : getPartnerName().hashCode());
        result = prime * result + ((getPartnerId() == null) ? 0 : getPartnerId().hashCode());
        result = prime * result + ((getUnionPartnerId() == null) ? 0 : getUnionPartnerId().hashCode());
        result = prime * result + ((getBindStatus() == null) ? 0 : getBindStatus().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}