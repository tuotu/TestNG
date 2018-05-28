/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradePayModelDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TradePayModelDO;
import gen.doproject.commonproducts.TradePayModelDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradePayModelDAO {
    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int countByExample(TradePayModelDOExample example);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int deleteByExample(TradePayModelDOExample example);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int insert(TradePayModelDO record);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int insertSelective(TradePayModelDO record);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    List<TradePayModelDO> selectByExampleWithBLOBs(TradePayModelDOExample example);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    List<TradePayModelDO> selectByExample(TradePayModelDOExample example);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    TradePayModelDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TradePayModelDO record, @Param("example") TradePayModelDOExample example);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") TradePayModelDO record, @Param("example") TradePayModelDOExample example);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TradePayModelDO record, @Param("example") TradePayModelDOExample example);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TradePayModelDO record);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(TradePayModelDO record);

    /**
     * corresponds to the database table trade_pay_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TradePayModelDO record);
}