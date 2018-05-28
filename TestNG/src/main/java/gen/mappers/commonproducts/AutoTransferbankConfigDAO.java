/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoTransferbankConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.AutoTransferbankConfigDO;
import gen.doproject.commonproducts.AutoTransferbankConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoTransferbankConfigDAO {
    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    int countByExample(AutoTransferbankConfigDOExample example);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    int deleteByExample(AutoTransferbankConfigDOExample example);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    int insert(AutoTransferbankConfigDO record);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    int insertSelective(AutoTransferbankConfigDO record);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    List<AutoTransferbankConfigDO> selectByExample(AutoTransferbankConfigDOExample example);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    AutoTransferbankConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AutoTransferbankConfigDO record, @Param("example") AutoTransferbankConfigDOExample example);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AutoTransferbankConfigDO record, @Param("example") AutoTransferbankConfigDOExample example);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AutoTransferbankConfigDO record);

    /**
     * corresponds to the database table auto_transferbank_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AutoTransferbankConfigDO record);
}