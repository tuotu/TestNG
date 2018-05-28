/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PaymentResultNotifyRecordDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.PaymentResultNotifyRecordDO;
import gen.doproject.commonproducts.PaymentResultNotifyRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentResultNotifyRecordDAO {
    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    int countByExample(PaymentResultNotifyRecordDOExample example);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    int deleteByExample(PaymentResultNotifyRecordDOExample example);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    int insert(PaymentResultNotifyRecordDO record);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    int insertSelective(PaymentResultNotifyRecordDO record);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    List<PaymentResultNotifyRecordDO> selectByExample(PaymentResultNotifyRecordDOExample example);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    PaymentResultNotifyRecordDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PaymentResultNotifyRecordDO record, @Param("example") PaymentResultNotifyRecordDOExample example);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PaymentResultNotifyRecordDO record, @Param("example") PaymentResultNotifyRecordDOExample example);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PaymentResultNotifyRecordDO record);

    /**
     * corresponds to the database table payment_result_notify_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PaymentResultNotifyRecordDO record);
}