/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ForeignPayDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ForeignPayDO;
import gen.doproject.commonproducts.ForeignPayDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignPayDAO {
    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    int countByExample(ForeignPayDOExample example);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    int deleteByExample(ForeignPayDOExample example);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    int insert(ForeignPayDO record);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    int insertSelective(ForeignPayDO record);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    List<ForeignPayDO> selectByExample(ForeignPayDOExample example);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    ForeignPayDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ForeignPayDO record, @Param("example") ForeignPayDOExample example);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ForeignPayDO record, @Param("example") ForeignPayDOExample example);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ForeignPayDO record);

    /**
     * corresponds to the database table foreign_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ForeignPayDO record);
}