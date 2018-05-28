/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename CommandPayParamDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.CommandPayParamDO;
import gen.doproject.commonproducts.CommandPayParamDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommandPayParamDAO {
    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    int countByExample(CommandPayParamDOExample example);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    int deleteByExample(CommandPayParamDOExample example);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    int insert(CommandPayParamDO record);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    int insertSelective(CommandPayParamDO record);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    List<CommandPayParamDO> selectByExample(CommandPayParamDOExample example);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    CommandPayParamDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CommandPayParamDO record, @Param("example") CommandPayParamDOExample example);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CommandPayParamDO record, @Param("example") CommandPayParamDOExample example);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CommandPayParamDO record);

    /**
     * corresponds to the database table command_pay_param
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CommandPayParamDO record);
}