/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawDetailConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.WithdrawDetailConfigDO;
import gen.doproject.commonproducts.WithdrawDetailConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawDetailConfigDAO {
    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    int countByExample(WithdrawDetailConfigDOExample example);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    int deleteByExample(WithdrawDetailConfigDOExample example);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    int insert(WithdrawDetailConfigDO record);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    int insertSelective(WithdrawDetailConfigDO record);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    List<WithdrawDetailConfigDO> selectByExample(WithdrawDetailConfigDOExample example);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    WithdrawDetailConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WithdrawDetailConfigDO record, @Param("example") WithdrawDetailConfigDOExample example);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WithdrawDetailConfigDO record, @Param("example") WithdrawDetailConfigDOExample example);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WithdrawDetailConfigDO record);

    /**
     * corresponds to the database table withdraw_detail_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WithdrawDetailConfigDO record);
}