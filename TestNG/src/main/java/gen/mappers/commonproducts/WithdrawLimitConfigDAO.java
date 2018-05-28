/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawLimitConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.WithdrawLimitConfigDO;
import gen.doproject.commonproducts.WithdrawLimitConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawLimitConfigDAO {
    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    int countByExample(WithdrawLimitConfigDOExample example);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    int deleteByExample(WithdrawLimitConfigDOExample example);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    int insert(WithdrawLimitConfigDO record);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    int insertSelective(WithdrawLimitConfigDO record);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    List<WithdrawLimitConfigDO> selectByExample(WithdrawLimitConfigDOExample example);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    WithdrawLimitConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WithdrawLimitConfigDO record, @Param("example") WithdrawLimitConfigDOExample example);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WithdrawLimitConfigDO record, @Param("example") WithdrawLimitConfigDOExample example);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WithdrawLimitConfigDO record);

    /**
     * corresponds to the database table withdraw_limit_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WithdrawLimitConfigDO record);
}