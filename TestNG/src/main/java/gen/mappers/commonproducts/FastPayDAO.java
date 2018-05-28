/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPayDO;
import gen.doproject.commonproducts.FastPayDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPayDAO {
    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    int countByExample(FastPayDOExample example);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    int deleteByExample(FastPayDOExample example);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    int insert(FastPayDO record);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    int insertSelective(FastPayDO record);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    List<FastPayDO> selectByExample(FastPayDOExample example);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    FastPayDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPayDO record, @Param("example") FastPayDOExample example);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPayDO record, @Param("example") FastPayDOExample example);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPayDO record);

    /**
     * corresponds to the database table fast_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPayDO record);
}