/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferConfigurationDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TransferConfigurationDO;
import gen.doproject.commonproducts.TransferConfigurationDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferConfigurationDAO {
    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    int countByExample(TransferConfigurationDOExample example);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    int deleteByExample(TransferConfigurationDOExample example);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long productId);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    int insert(TransferConfigurationDO record);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    int insertSelective(TransferConfigurationDO record);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    List<TransferConfigurationDO> selectByExample(TransferConfigurationDOExample example);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    TransferConfigurationDO selectByPrimaryKey(Long productId);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransferConfigurationDO record, @Param("example") TransferConfigurationDOExample example);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransferConfigurationDO record, @Param("example") TransferConfigurationDOExample example);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransferConfigurationDO record);

    /**
     * corresponds to the database table transfer_configuration
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransferConfigurationDO record);
}