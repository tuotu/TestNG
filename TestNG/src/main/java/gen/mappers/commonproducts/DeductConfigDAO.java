/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename DeductConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.DeductConfigDO;
import gen.doproject.commonproducts.DeductConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeductConfigDAO {
    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    int countByExample(DeductConfigDOExample example);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    int deleteByExample(DeductConfigDOExample example);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    int insert(DeductConfigDO record);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    int insertSelective(DeductConfigDO record);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    List<DeductConfigDO> selectByExample(DeductConfigDOExample example);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    DeductConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DeductConfigDO record, @Param("example") DeductConfigDOExample example);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DeductConfigDO record, @Param("example") DeductConfigDOExample example);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DeductConfigDO record);

    /**
     * corresponds to the database table deduct_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DeductConfigDO record);
}