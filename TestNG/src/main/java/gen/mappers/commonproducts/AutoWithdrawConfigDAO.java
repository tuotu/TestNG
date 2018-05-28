/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoWithdrawConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.AutoWithdrawConfigDO;
import gen.doproject.commonproducts.AutoWithdrawConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoWithdrawConfigDAO {
    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    int countByExample(AutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    int deleteByExample(AutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    int insert(AutoWithdrawConfigDO record);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    int insertSelective(AutoWithdrawConfigDO record);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    List<AutoWithdrawConfigDO> selectByExample(AutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    AutoWithdrawConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AutoWithdrawConfigDO record, @Param("example") AutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AutoWithdrawConfigDO record, @Param("example") AutoWithdrawConfigDOExample example);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AutoWithdrawConfigDO record);

    /**
     * corresponds to the database table auto_withdraw_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AutoWithdrawConfigDO record);
}