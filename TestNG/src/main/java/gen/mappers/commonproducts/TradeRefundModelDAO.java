/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradeRefundModelDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TradeRefundModelDO;
import gen.doproject.commonproducts.TradeRefundModelDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeRefundModelDAO {
    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int countByExample(TradeRefundModelDOExample example);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int deleteByExample(TradeRefundModelDOExample example);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int insert(TradeRefundModelDO record);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int insertSelective(TradeRefundModelDO record);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    List<TradeRefundModelDO> selectByExampleWithBLOBs(TradeRefundModelDOExample example);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    List<TradeRefundModelDO> selectByExample(TradeRefundModelDOExample example);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    TradeRefundModelDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TradeRefundModelDO record, @Param("example") TradeRefundModelDOExample example);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") TradeRefundModelDO record, @Param("example") TradeRefundModelDOExample example);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TradeRefundModelDO record, @Param("example") TradeRefundModelDOExample example);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TradeRefundModelDO record);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(TradeRefundModelDO record);

    /**
     * corresponds to the database table trade_refund_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TradeRefundModelDO record);
}