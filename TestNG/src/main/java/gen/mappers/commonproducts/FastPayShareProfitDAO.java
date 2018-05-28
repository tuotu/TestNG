/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayShareProfitDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPayShareProfitDO;
import gen.doproject.commonproducts.FastPayShareProfitDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPayShareProfitDAO {
    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    int countByExample(FastPayShareProfitDOExample example);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    int deleteByExample(FastPayShareProfitDOExample example);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    int insert(FastPayShareProfitDO record);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    int insertSelective(FastPayShareProfitDO record);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    List<FastPayShareProfitDO> selectByExample(FastPayShareProfitDOExample example);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    FastPayShareProfitDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPayShareProfitDO record, @Param("example") FastPayShareProfitDOExample example);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPayShareProfitDO record, @Param("example") FastPayShareProfitDOExample example);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPayShareProfitDO record);

    /**
     * corresponds to the database table fast_pay_share_profit
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPayShareProfitDO record);
}