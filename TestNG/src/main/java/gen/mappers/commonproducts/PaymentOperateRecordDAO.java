/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PaymentOperateRecordDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.PaymentOperateRecordDO;
import gen.doproject.commonproducts.PaymentOperateRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentOperateRecordDAO {
    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    int countByExample(PaymentOperateRecordDOExample example);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    int deleteByExample(PaymentOperateRecordDOExample example);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    int insert(PaymentOperateRecordDO record);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    int insertSelective(PaymentOperateRecordDO record);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    List<PaymentOperateRecordDO> selectByExample(PaymentOperateRecordDOExample example);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    PaymentOperateRecordDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PaymentOperateRecordDO record, @Param("example") PaymentOperateRecordDOExample example);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PaymentOperateRecordDO record, @Param("example") PaymentOperateRecordDOExample example);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PaymentOperateRecordDO record);

    /**
     * corresponds to the database table payment_operate_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PaymentOperateRecordDO record);
}