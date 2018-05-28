/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPaySourceMethodDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPaySourceMethodDO;
import gen.doproject.commonproducts.FastPaySourceMethodDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPaySourceMethodDAO {
    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    int countByExample(FastPaySourceMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    int deleteByExample(FastPaySourceMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    int insert(FastPaySourceMethodDO record);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    int insertSelective(FastPaySourceMethodDO record);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    List<FastPaySourceMethodDO> selectByExample(FastPaySourceMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    FastPaySourceMethodDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPaySourceMethodDO record, @Param("example") FastPaySourceMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPaySourceMethodDO record, @Param("example") FastPaySourceMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPaySourceMethodDO record);

    /**
     * corresponds to the database table fast_pay_source_method
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPaySourceMethodDO record);
}