/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoDeductConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.AutoDeductConfigDO;
import gen.doproject.commonproducts.AutoDeductConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoDeductConfigDAO {
    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    int countByExample(AutoDeductConfigDOExample example);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    int deleteByExample(AutoDeductConfigDOExample example);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    int insert(AutoDeductConfigDO record);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    int insertSelective(AutoDeductConfigDO record);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    List<AutoDeductConfigDO> selectByExample(AutoDeductConfigDOExample example);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    AutoDeductConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AutoDeductConfigDO record, @Param("example") AutoDeductConfigDOExample example);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AutoDeductConfigDO record, @Param("example") AutoDeductConfigDOExample example);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AutoDeductConfigDO record);

    /**
     * corresponds to the database table auto_deduct_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AutoDeductConfigDO record);
}