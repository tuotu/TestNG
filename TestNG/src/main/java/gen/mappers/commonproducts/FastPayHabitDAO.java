/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayHabitDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPayHabitDO;
import gen.doproject.commonproducts.FastPayHabitDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPayHabitDAO {
    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    int countByExample(FastPayHabitDOExample example);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    int deleteByExample(FastPayHabitDOExample example);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    int insert(FastPayHabitDO record);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    int insertSelective(FastPayHabitDO record);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    List<FastPayHabitDO> selectByExample(FastPayHabitDOExample example);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    FastPayHabitDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPayHabitDO record, @Param("example") FastPayHabitDOExample example);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPayHabitDO record, @Param("example") FastPayHabitDOExample example);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPayHabitDO record);

    /**
     * corresponds to the database table fast_pay_habit
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPayHabitDO record);
}