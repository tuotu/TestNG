/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TradeMergePayDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TradeMergePayDO;
import gen.doproject.commonproducts.TradeMergePayDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeMergePayDAO {
    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    int countByExample(TradeMergePayDOExample example);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    int deleteByExample(TradeMergePayDOExample example);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    int insert(TradeMergePayDO record);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    int insertSelective(TradeMergePayDO record);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    List<TradeMergePayDO> selectByExample(TradeMergePayDOExample example);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    TradeMergePayDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TradeMergePayDO record, @Param("example") TradeMergePayDOExample example);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TradeMergePayDO record, @Param("example") TradeMergePayDOExample example);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TradeMergePayDO record);

    /**
     * corresponds to the database table trade_merge_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TradeMergePayDO record);
}