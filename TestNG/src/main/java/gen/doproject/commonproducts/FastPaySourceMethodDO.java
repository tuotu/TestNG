/**
 *
 * A data object class directly models database table
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPaySourceMethodDO.java
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

public class FastPaySourceMethodDO implements Serializable {
    /**
     * corresponds to the database column fast_pay_source_method.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * corresponds to the database column fast_pay_source_method.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * corresponds to the database column fast_pay_source_method.method_code
     *
     * @mbggenerated
     */
    private String methodCode;

    /**
     * corresponds to the database column fast_pay_source_method.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * corresponds to the database column fast_pay_source_method.operator_name
     *
     * @mbggenerated
     */
    private String operatorName;

    /**
     * corresponds to the database column fast_pay_source_method.raw_add_time
     *
     * @mbggenerated
     */
    private Date rawAddTime;

    /**
     * corresponds to the database column fast_pay_source_method.raw_update_time
     *
     * @mbggenerated
     */
    private Date rawUpdateTime;

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * return the value of the database column fast_pay_source_method.id
     *
     * @return the value of fast_pay_source_method.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * set the value of the database column fast_pay_source_method.id
     *
     * @param id the value for fast_pay_source_method.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * return the value of the database column fast_pay_source_method.source
     *
     * @return the value of fast_pay_source_method.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * set the value of the database column fast_pay_source_method.source
     *
     * @param source the value for fast_pay_source_method.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * return the value of the database column fast_pay_source_method.method_code
     *
     * @return the value of fast_pay_source_method.method_code
     *
     * @mbggenerated
     */
    public String getMethodCode() {
        return methodCode;
    }

    /**
     * set the value of the database column fast_pay_source_method.method_code
     *
     * @param methodCode the value for fast_pay_source_method.method_code
     *
     * @mbggenerated
     */
    public void setMethodCode(String methodCode) {
        this.methodCode = methodCode == null ? null : methodCode.trim();
    }

    /**
     * return the value of the database column fast_pay_source_method.memo
     *
     * @return the value of fast_pay_source_method.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * set the value of the database column fast_pay_source_method.memo
     *
     * @param memo the value for fast_pay_source_method.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * return the value of the database column fast_pay_source_method.operator_name
     *
     * @return the value of fast_pay_source_method.operator_name
     *
     * @mbggenerated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * set the value of the database column fast_pay_source_method.operator_name
     *
     * @param operatorName the value for fast_pay_source_method.operator_name
     *
     * @mbggenerated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * return the value of the database column fast_pay_source_method.raw_add_time
     *
     * @return the value of fast_pay_source_method.raw_add_time
     *
     * @mbggenerated
     */
    public Date getRawAddTime() {
        return rawAddTime;
    }

    /**
     * set the value of the database column fast_pay_source_method.raw_add_time
     *
     * @param rawAddTime the value for fast_pay_source_method.raw_add_time
     *
     * @mbggenerated
     */
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    /**
     * return the value of the database column fast_pay_source_method.raw_update_time
     *
     * @return the value of fast_pay_source_method.raw_update_time
     *
     * @mbggenerated
     */
    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    /**
     * set the value of the database column fast_pay_source_method.raw_update_time
     *
     * @param rawUpdateTime the value for fast_pay_source_method.raw_update_time
     *
     * @mbggenerated
     */
    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", source=").append(source);
        sb.append(", methodCode=").append(methodCode);
        sb.append(", memo=").append(memo);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", rawAddTime=").append(rawAddTime);
        sb.append(", rawUpdateTime=").append(rawUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * corresponds to the database table fast_pay_source_method
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
        FastPaySourceMethodDO other = (FastPaySourceMethodDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getMethodCode() == null ? other.getMethodCode() == null : this.getMethodCode().equals(other.getMethodCode()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getRawAddTime() == null ? other.getRawAddTime() == null : this.getRawAddTime().equals(other.getRawAddTime()))
            && (this.getRawUpdateTime() == null ? other.getRawUpdateTime() == null : this.getRawUpdateTime().equals(other.getRawUpdateTime()));
    }

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getMethodCode() == null) ? 0 : getMethodCode().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getRawAddTime() == null) ? 0 : getRawAddTime().hashCode());
        result = prime * result + ((getRawUpdateTime() == null) ? 0 : getRawUpdateTime().hashCode());
        return result;
    }
}