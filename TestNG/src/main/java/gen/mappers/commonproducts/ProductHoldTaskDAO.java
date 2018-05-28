/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductHoldTaskDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductHoldTaskDO;
import gen.doproject.commonproducts.ProductHoldTaskDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductHoldTaskDAO {
    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    int countByExample(ProductHoldTaskDOExample example);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    int deleteByExample(ProductHoldTaskDOExample example);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    int insert(ProductHoldTaskDO record);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    int insertSelective(ProductHoldTaskDO record);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    List<ProductHoldTaskDO> selectByExample(ProductHoldTaskDOExample example);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    ProductHoldTaskDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductHoldTaskDO record, @Param("example") ProductHoldTaskDOExample example);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductHoldTaskDO record, @Param("example") ProductHoldTaskDOExample example);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductHoldTaskDO record);

    /**
     * corresponds to the database table product_hold_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductHoldTaskDO record);
}