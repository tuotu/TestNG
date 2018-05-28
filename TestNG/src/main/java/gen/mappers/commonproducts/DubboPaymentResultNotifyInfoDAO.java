/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename DubboPaymentResultNotifyInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.DubboPaymentResultNotifyInfoDO;
import gen.doproject.commonproducts.DubboPaymentResultNotifyInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DubboPaymentResultNotifyInfoDAO {
    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    int countByExample(DubboPaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    int deleteByExample(DubboPaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long dubboPaymentResultNotifyInfoId);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    int insert(DubboPaymentResultNotifyInfoDO record);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    int insertSelective(DubboPaymentResultNotifyInfoDO record);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    List<DubboPaymentResultNotifyInfoDO> selectByExample(DubboPaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    DubboPaymentResultNotifyInfoDO selectByPrimaryKey(Long dubboPaymentResultNotifyInfoId);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DubboPaymentResultNotifyInfoDO record, @Param("example") DubboPaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DubboPaymentResultNotifyInfoDO record, @Param("example") DubboPaymentResultNotifyInfoDOExample example);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DubboPaymentResultNotifyInfoDO record);

    /**
     * corresponds to the database table dubbo_payment_result_notify_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DubboPaymentResultNotifyInfoDO record);
}