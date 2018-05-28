/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename DeductDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.DeductDO;
import gen.doproject.commonproducts.DeductDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeductDAO {
    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    int countByExample(DeductDOExample example);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    int deleteByExample(DeductDOExample example);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    int insert(DeductDO record);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    int insertSelective(DeductDO record);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    List<DeductDO> selectByExample(DeductDOExample example);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    DeductDO selectByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DeductDO record, @Param("example") DeductDOExample example);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DeductDO record, @Param("example") DeductDOExample example);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DeductDO record);

    /**
     * corresponds to the database table deduct
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DeductDO record);
}