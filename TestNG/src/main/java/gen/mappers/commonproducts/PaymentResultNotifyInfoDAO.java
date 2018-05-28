/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PaymentResultNotifyInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.PaymentResultNotifyInfoDO;
import gen.doproject.commonproducts.PaymentResultNotifyInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentResultNotifyInfoDAO {
    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    int countByExample(PaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    int deleteByExample(PaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    int insert(PaymentResultNotifyInfoDO record);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    int insertSelective(PaymentResultNotifyInfoDO record);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    List<PaymentResultNotifyInfoDO> selectByExample(PaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    PaymentResultNotifyInfoDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PaymentResultNotifyInfoDO record, @Param("example") PaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PaymentResultNotifyInfoDO record, @Param("example") PaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PaymentResultNotifyInfoDO record);

    /**
     * corresponds to the database table payment_result_notify_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PaymentResultNotifyInfoDO record);
}