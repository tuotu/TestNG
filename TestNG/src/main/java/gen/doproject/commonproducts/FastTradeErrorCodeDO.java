/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastTradeErrorCodeDO.java
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

public class FastTradeErrorCodeDO implements Serializable {
    /**
     * corresponds to the database column fast_trade_error_code.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * corresponds to the database column fast_trade_error_code.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_trade_error_code.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database column fast_trade_error_code.error_code
     *
     * @mbggenerated
     */
    private String errorCode;

    /**
     * corresponds to the database column fast_trade_error_code.error_desc
     *
     * @mbggenerated
     */
    private String errorDesc;

    /**
     * corresponds to the database column fast_trade_error_code.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_trade_error_code.id
     *
     * @return the value of fast_trade_error_code.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * set the value of the database column fast_trade_error_code.id
     *
     * @param id the value for fast_trade_error_code.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_trade_error_code.raw_add_time
     *
     * @return the value of fast_trade_error_code.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_trade_error_code.raw_add_time
     *
     * @param rawAddTime the value for fast_trade_error_code.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_trade_error_code.raw_update_time
     *
     * @return the value of fast_trade_error_code.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_trade_error_code.raw_update_time
     *
     * @param rawUpdateTime the value for fast_trade_error_code.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * return the value of the database column fast_trade_error_code.error_code
     *
     * @return the value of fast_trade_error_code.error_code
     *
     * @mbggenerated
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * set the value of the database column fast_trade_error_code.error_code
     *
     * @param errorCode the value for fast_trade_error_code.error_code
     *
     * @mbggenerated
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    /**
     * return the value of the database column fast_trade_error_code.error_desc
     *
     * @return the value of fast_trade_error_code.error_desc
     *
     * @mbggenerated
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * set the value of the database column fast_trade_error_code.error_desc
     *
     * @param errorDesc the value for fast_trade_error_code.error_desc
     *
     * @mbggenerated
     */
    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc == null ? null : errorDesc.trim();
    }

    /**
     * return the value of the database column fast_trade_error_code.memo
     *
     * @return the value of fast_trade_error_code.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column fast_trade_error_code.memo
     *
     * @param memo the value for fast_trade_error_code.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * corresponds to the database table fast_trade_error_code
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
        sb.append(", errorCode=").append(errorCode);
        sb.append(", errorDesc=").append(errorDesc);
        sb.append(", memo=").append(memo);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_trade_error_code
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
        FastTradeErrorCodeDO other = (FastTradeErrorCodeDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()))
            && (this.getErrorCode() == null ? other.getErrorCode() == null : this.getErrorCode().equals(other.getErrorCode()))
            && (this.getErrorDesc() == null ? other.getErrorDesc() == null : this.getErrorDesc().equals(other.getErrorDesc()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()));
    }

    /**
     * corresponds to the database table fast_trade_error_code
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
        result = prime * result + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        result = prime * result + ((getErrorDesc() == null) ? 0 : getErrorDesc().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        return result;
    }
}