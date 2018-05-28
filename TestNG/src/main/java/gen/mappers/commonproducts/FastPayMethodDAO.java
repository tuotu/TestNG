/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayMethodDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPayMethodDO;
import gen.doproject.commonproducts.FastPayMethodDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPayMethodDAO {
    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    int countByExample(FastPayMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    int deleteByExample(FastPayMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    int insert(FastPayMethodDO record);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    int insertSelective(FastPayMethodDO record);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    List<FastPayMethodDO> selectByExample(FastPayMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    FastPayMethodDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPayMethodDO record, @Param("example") FastPayMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPayMethodDO record, @Param("example") FastPayMethodDOExample example);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPayMethodDO record);

    /**
     * corresponds to the database table fast_pay_method
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPayMethodDO record);
}