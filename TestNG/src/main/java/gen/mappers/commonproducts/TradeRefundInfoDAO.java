/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradeRefundInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TradeRefundInfoDO;
import gen.doproject.commonproducts.TradeRefundInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeRefundInfoDAO {
    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    int countByExample(TradeRefundInfoDOExample example);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    int deleteByExample(TradeRefundInfoDOExample example);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    int insert(TradeRefundInfoDO record);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    int insertSelective(TradeRefundInfoDO record);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    List<TradeRefundInfoDO> selectByExample(TradeRefundInfoDOExample example);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    TradeRefundInfoDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TradeRefundInfoDO record, @Param("example") TradeRefundInfoDOExample example);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TradeRefundInfoDO record, @Param("example") TradeRefundInfoDOExample example);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TradeRefundInfoDO record);

    /**
     * corresponds to the database table trade_refund_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TradeRefundInfoDO record);
}