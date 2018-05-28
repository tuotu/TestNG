/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastTradeErrorCodeDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastTradeErrorCodeDO;
import gen.doproject.commonproducts.FastTradeErrorCodeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastTradeErrorCodeDAO {
    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    int countByExample(FastTradeErrorCodeDOExample example);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    int deleteByExample(FastTradeErrorCodeDOExample example);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    int insert(FastTradeErrorCodeDO record);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    int insertSelective(FastTradeErrorCodeDO record);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    List<FastTradeErrorCodeDO> selectByExample(FastTradeErrorCodeDOExample example);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    FastTradeErrorCodeDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastTradeErrorCodeDO record, @Param("example") FastTradeErrorCodeDOExample example);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastTradeErrorCodeDO record, @Param("example") FastTradeErrorCodeDOExample example);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastTradeErrorCodeDO record);

    /**
     * corresponds to the database table fast_trade_error_code
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastTradeErrorCodeDO record);
}