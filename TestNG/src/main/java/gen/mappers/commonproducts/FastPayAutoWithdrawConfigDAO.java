/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayAutoWithdrawConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPayAutoWithdrawConfigDO;
import gen.doproject.commonproducts.FastPayAutoWithdrawConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPayAutoWithdrawConfigDAO {
    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    int countByExample(FastPayAutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    int deleteByExample(FastPayAutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    int insert(FastPayAutoWithdrawConfigDO record);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    int insertSelective(FastPayAutoWithdrawConfigDO record);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    List<FastPayAutoWithdrawConfigDO> selectByExample(FastPayAutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    FastPayAutoWithdrawConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPayAutoWithdrawConfigDO record, @Param("example") FastPayAutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPayAutoWithdrawConfigDO record, @Param("example") FastPayAutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPayAutoWithdrawConfigDO record);

    /**
     * corresponds to the database table fast_pay_auto_withdraw_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPayAutoWithdrawConfigDO record);
}