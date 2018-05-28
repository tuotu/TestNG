/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradeRefundShareProfitDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TradeRefundShareProfitDO;
import gen.doproject.commonproducts.TradeRefundShareProfitDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeRefundShareProfitDAO {
    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    int countByExample(TradeRefundShareProfitDOExample example);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    int deleteByExample(TradeRefundShareProfitDOExample example);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    int insert(TradeRefundShareProfitDO record);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    int insertSelective(TradeRefundShareProfitDO record);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    List<TradeRefundShareProfitDO> selectByExample(TradeRefundShareProfitDOExample example);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    TradeRefundShareProfitDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TradeRefundShareProfitDO record, @Param("example") TradeRefundShareProfitDOExample example);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TradeRefundShareProfitDO record, @Param("example") TradeRefundShareProfitDOExample example);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TradeRefundShareProfitDO record);

    /**
     * corresponds to the database table trade_refund_share_profit
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TradeRefundShareProfitDO record);
}