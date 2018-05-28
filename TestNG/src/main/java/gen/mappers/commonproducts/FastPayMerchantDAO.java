/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayMerchantDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPayMerchantDO;
import gen.doproject.commonproducts.FastPayMerchantDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPayMerchantDAO {
    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    int countByExample(FastPayMerchantDOExample example);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    int deleteByExample(FastPayMerchantDOExample example);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    int insert(FastPayMerchantDO record);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    int insertSelective(FastPayMerchantDO record);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    List<FastPayMerchantDO> selectByExample(FastPayMerchantDOExample example);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    FastPayMerchantDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPayMerchantDO record, @Param("example") FastPayMerchantDOExample example);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPayMerchantDO record, @Param("example") FastPayMerchantDOExample example);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPayMerchantDO record);

    /**
     * corresponds to the database table fast_pay_merchant
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPayMerchantDO record);
}