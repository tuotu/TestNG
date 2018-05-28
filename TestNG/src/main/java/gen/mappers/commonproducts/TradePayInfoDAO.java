/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradePayInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TradePayInfoDO;
import gen.doproject.commonproducts.TradePayInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradePayInfoDAO {
    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    int countByExample(TradePayInfoDOExample example);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    int deleteByExample(TradePayInfoDOExample example);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    int insert(TradePayInfoDO record);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    int insertSelective(TradePayInfoDO record);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    List<TradePayInfoDO> selectByExample(TradePayInfoDOExample example);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    TradePayInfoDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TradePayInfoDO record, @Param("example") TradePayInfoDOExample example);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TradePayInfoDO record, @Param("example") TradePayInfoDOExample example);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TradePayInfoDO record);

    /**
     * corresponds to the database table trade_pay_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TradePayInfoDO record);
}