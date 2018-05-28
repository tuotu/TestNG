/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastTradeMerchantDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastTradeMerchantDO;
import gen.doproject.commonproducts.FastTradeMerchantDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastTradeMerchantDAO {
    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    int countByExample(FastTradeMerchantDOExample example);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    int deleteByExample(FastTradeMerchantDOExample example);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    int insert(FastTradeMerchantDO record);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    int insertSelective(FastTradeMerchantDO record);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    List<FastTradeMerchantDO> selectByExample(FastTradeMerchantDOExample example);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    FastTradeMerchantDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastTradeMerchantDO record, @Param("example") FastTradeMerchantDOExample example);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastTradeMerchantDO record, @Param("example") FastTradeMerchantDOExample example);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastTradeMerchantDO record);

    /**
     * corresponds to the database table fast_trade_merchant
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastTradeMerchantDO record);
}