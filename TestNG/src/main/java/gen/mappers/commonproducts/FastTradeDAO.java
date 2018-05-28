/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastTradeDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastTradeDO;
import gen.doproject.commonproducts.FastTradeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastTradeDAO {
    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    int countByExample(FastTradeDOExample example);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    int deleteByExample(FastTradeDOExample example);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    int insert(FastTradeDO record);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    int insertSelective(FastTradeDO record);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    List<FastTradeDO> selectByExample(FastTradeDOExample example);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    FastTradeDO selectByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastTradeDO record, @Param("example") FastTradeDOExample example);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastTradeDO record, @Param("example") FastTradeDOExample example);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastTradeDO record);

    /**
     * corresponds to the database table fast_trade
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastTradeDO record);
}