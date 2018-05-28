/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayTimeoutsDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPayTimeoutsDO;
import gen.doproject.commonproducts.FastPayTimeoutsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPayTimeoutsDAO {
    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    int countByExample(FastPayTimeoutsDOExample example);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    int deleteByExample(FastPayTimeoutsDOExample example);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    int insert(FastPayTimeoutsDO record);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    int insertSelective(FastPayTimeoutsDO record);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    List<FastPayTimeoutsDO> selectByExample(FastPayTimeoutsDOExample example);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    FastPayTimeoutsDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPayTimeoutsDO record, @Param("example") FastPayTimeoutsDOExample example);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPayTimeoutsDO record, @Param("example") FastPayTimeoutsDOExample example);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPayTimeoutsDO record);

    /**
     * corresponds to the database table fast_pay_timeouts
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPayTimeoutsDO record);
}