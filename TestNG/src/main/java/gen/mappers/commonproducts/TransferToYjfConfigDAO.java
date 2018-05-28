/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferToYjfConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TransferToYjfConfigDO;
import gen.doproject.commonproducts.TransferToYjfConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferToYjfConfigDAO {
    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    int countByExample(TransferToYjfConfigDOExample example);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    int deleteByExample(TransferToYjfConfigDOExample example);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    int insert(TransferToYjfConfigDO record);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    int insertSelective(TransferToYjfConfigDO record);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    List<TransferToYjfConfigDO> selectByExample(TransferToYjfConfigDOExample example);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    TransferToYjfConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransferToYjfConfigDO record, @Param("example") TransferToYjfConfigDOExample example);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransferToYjfConfigDO record, @Param("example") TransferToYjfConfigDOExample example);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransferToYjfConfigDO record);

    /**
     * corresponds to the database table transfer_to_yjf_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransferToYjfConfigDO record);
}