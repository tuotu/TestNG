/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferBizNoMapDO.java
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

public class TransferBizNoMapDO implements Serializable {
    /**
     * corresponds to the database column transfer_biz_no_map.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column transfer_biz_no_map.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column transfer_biz_no_map.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column transfer_biz_no_map.biz_no
     *
     * @mbggenerated
     */
    private String bizNo;

    /**
     * corresponds to the database column transfer_biz_no_map.order_no
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * corresponds to the database column transfer_biz_no_map.ploy
     *
     * @mbggenerated
     */
    private String ploy;

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column transfer_biz_no_map.id
     *
     * @return the value of transfer_biz_no_map.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column transfer_biz_no_map.id
     *
     * @param id the value for transfer_biz_no_map.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column transfer_biz_no_map.raw_add_time
     *
     * @return the value of transfer_biz_no_map.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column transfer_biz_no_map.raw_add_time
     *
     * @param rawAddTime the value for transfer_biz_no_map.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column transfer_biz_no_map.raw_update_time
     *
     * @return the value of transfer_biz_no_map.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column transfer_biz_no_map.raw_update_time
     *
     * @param rawUpdateTime the value for transfer_biz_no_map.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column transfer_biz_no_map.biz_no
     *
     * @return the value of transfer_biz_no_map.biz_no
     *
     * @mbggenerated
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * set the value of the database column transfer_biz_no_map.biz_no
     *
     * @param bizNo the value for transfer_biz_no_map.biz_no
     *
     * @mbggenerated
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * return the value of the database column transfer_biz_no_map.order_no
     *
     * @return the value of transfer_biz_no_map.order_no
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * set the value of the database column transfer_biz_no_map.order_no
     *
     * @param orderNo the value for transfer_biz_no_map.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * return the value of the database column transfer_biz_no_map.ploy
     *
     * @return the value of transfer_biz_no_map.ploy
     *
     * @mbggenerated
     */
    public String getPloy() {
        return ploy;
    }

    /**
     * set the value of the database column transfer_biz_no_map.ploy
     *
     * @param ploy the value for transfer_biz_no_map.ploy
     *
     * @mbggenerated
     */
    public void setPloy(String ploy) {
        this.ploy = ploy == null ? null : ploy.trim();
    }

    /**
     * corresponds to the database table transfer_biz_no_map
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
        sb.append(", bizNo=").append(bizNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", ploy=").append(ploy);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table transfer_biz_no_map
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
        TransferBizNoMapDO other = (TransferBizNoMapDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getPloy() == null ? other.getPloy() == null : this.getPloy().equals(other.getPloy()));
    }

    /**
     * corresponds to the database table transfer_biz_no_map
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
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getPloy() == null) ? 0 : getPloy().hashCode());
        return result;
    }
}