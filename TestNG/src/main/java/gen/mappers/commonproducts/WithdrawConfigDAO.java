/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.WithdrawConfigDO;
import gen.doproject.commonproducts.WithdrawConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawConfigDAO {
    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    int countByExample(WithdrawConfigDOExample example);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    int deleteByExample(WithdrawConfigDOExample example);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    int insert(WithdrawConfigDO record);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    int insertSelective(WithdrawConfigDO record);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    List<WithdrawConfigDO> selectByExample(WithdrawConfigDOExample example);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    WithdrawConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WithdrawConfigDO record, @Param("example") WithdrawConfigDOExample example);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WithdrawConfigDO record, @Param("example") WithdrawConfigDOExample example);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WithdrawConfigDO record);

    /**
     * corresponds to the database table withdraw_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WithdrawConfigDO record);
}