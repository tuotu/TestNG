/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradePayModelDO.java
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

public class TradePayModelDO implements Serializable {
    /**
     * corresponds to the database column trade_pay_model.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column trade_pay_model.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column trade_pay_model.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column trade_pay_model.pay_biz_no
     *
     * @mbggenerated
     */
    private String payBizNo;

    /**
     * corresponds to the database column trade_pay_model.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column trade_pay_model.id
     *
     * @return the value of trade_pay_model.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column trade_pay_model.id
     *
     * @param id the value for trade_pay_model.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column trade_pay_model.raw_add_time
     *
     * @return the value of trade_pay_model.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column trade_pay_model.raw_add_time
     *
     * @param rawAddTime the value for trade_pay_model.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column trade_pay_model.raw_update_time
     *
     * @return the value of trade_pay_model.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column trade_pay_model.raw_update_time
     *
     * @param rawUpdateTime the value for trade_pay_model.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column trade_pay_model.pay_biz_no
     *
     * @return the value of trade_pay_model.pay_biz_no
     *
     * @mbggenerated
     */
    public String getPayBizNo() {
        return payBizNo;
    }

    /**
     * set the value of the database column trade_pay_model.pay_biz_no
     *
     * @param payBizNo the value for trade_pay_model.pay_biz_no
     *
     * @mbggenerated
     */
    public void setPayBizNo(String payBizNo) {
        this.payBizNo = payBizNo == null ? null : payBizNo.trim();
    }

    /**
     * return the value of the database column trade_pay_model.content
     *
     * @return the value of trade_pay_model.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * set the value of the database column trade_pay_model.content
     *
     * @param content the value for trade_pay_model.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * corresponds to the database table trade_pay_model
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
        sb.append(", payBizNo=").append(payBizNo);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table trade_pay_model
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
        TradePayModelDO other = (TradePayModelDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getPayBizNo() == null ? other.getPayBizNo() == null : this.getPayBizNo().equals(other.getPayBizNo()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * corresponds to the database table trade_pay_model
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
        result = prime * result + ((getPayBizNo() == null) ? 0 : getPayBizNo().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}