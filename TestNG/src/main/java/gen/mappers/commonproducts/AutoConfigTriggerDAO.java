/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoConfigTriggerDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.AutoConfigTriggerDO;
import gen.doproject.commonproducts.AutoConfigTriggerDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoConfigTriggerDAO {
    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    int countByExample(AutoConfigTriggerDOExample example);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    int deleteByExample(AutoConfigTriggerDOExample example);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    int insert(AutoConfigTriggerDO record);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    int insertSelective(AutoConfigTriggerDO record);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    List<AutoConfigTriggerDO> selectByExample(AutoConfigTriggerDOExample example);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    AutoConfigTriggerDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AutoConfigTriggerDO record, @Param("example") AutoConfigTriggerDOExample example);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AutoConfigTriggerDO record, @Param("example") AutoConfigTriggerDOExample example);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AutoConfigTriggerDO record);

    /**
     * corresponds to the database table auto_config_trigger
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AutoConfigTriggerDO record);
}