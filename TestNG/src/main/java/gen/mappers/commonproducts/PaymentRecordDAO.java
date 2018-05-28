/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PaymentRecordDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.PaymentRecordDO;
import gen.doproject.commonproducts.PaymentRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentRecordDAO {
    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    int countByExample(PaymentRecordDOExample example);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    int deleteByExample(PaymentRecordDOExample example);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    int insert(PaymentRecordDO record);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    int insertSelective(PaymentRecordDO record);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    List<PaymentRecordDO> selectByExample(PaymentRecordDOExample example);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    PaymentRecordDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PaymentRecordDO record, @Param("example") PaymentRecordDOExample example);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PaymentRecordDO record, @Param("example") PaymentRecordDOExample example);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PaymentRecordDO record);

    /**
     * corresponds to the database table payment_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PaymentRecordDO record);
}