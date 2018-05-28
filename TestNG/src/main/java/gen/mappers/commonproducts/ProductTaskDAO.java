/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductTaskDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductTaskDO;
import gen.doproject.commonproducts.ProductTaskDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTaskDAO {
    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    int countByExample(ProductTaskDOExample example);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    int deleteByExample(ProductTaskDOExample example);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    int insert(ProductTaskDO record);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    int insertSelective(ProductTaskDO record);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    List<ProductTaskDO> selectByExample(ProductTaskDOExample example);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    ProductTaskDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductTaskDO record, @Param("example") ProductTaskDOExample example);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductTaskDO record, @Param("example") ProductTaskDOExample example);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductTaskDO record);

    /**
     * corresponds to the database table product_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductTaskDO record);
}