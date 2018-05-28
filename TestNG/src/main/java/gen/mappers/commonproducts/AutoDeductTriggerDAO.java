/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AutoDeductTriggerDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.AutoDeductTriggerDO;
import gen.doproject.commonproducts.AutoDeductTriggerDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoDeductTriggerDAO {
    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    int countByExample(AutoDeductTriggerDOExample example);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    int deleteByExample(AutoDeductTriggerDOExample example);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    int insert(AutoDeductTriggerDO record);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    int insertSelective(AutoDeductTriggerDO record);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    List<AutoDeductTriggerDO> selectByExample(AutoDeductTriggerDOExample example);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    AutoDeductTriggerDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AutoDeductTriggerDO record, @Param("example") AutoDeductTriggerDOExample example);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AutoDeductTriggerDO record, @Param("example") AutoDeductTriggerDOExample example);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AutoDeductTriggerDO record);

    /**
     * corresponds to the database table auto_deduct_trigger
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AutoDeductTriggerDO record);
}