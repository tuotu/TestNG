/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferLimitConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TransferLimitConfigDO;
import gen.doproject.commonproducts.TransferLimitConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferLimitConfigDAO {
    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    int countByExample(TransferLimitConfigDOExample example);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    int deleteByExample(TransferLimitConfigDOExample example);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    int insert(TransferLimitConfigDO record);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    int insertSelective(TransferLimitConfigDO record);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    List<TransferLimitConfigDO> selectByExample(TransferLimitConfigDOExample example);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    TransferLimitConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransferLimitConfigDO record, @Param("example") TransferLimitConfigDOExample example);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransferLimitConfigDO record, @Param("example") TransferLimitConfigDOExample example);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransferLimitConfigDO record);

    /**
     * corresponds to the database table transfer_limit_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransferLimitConfigDO record);
}