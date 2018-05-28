/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductTaskInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductTaskInfoDO;
import gen.doproject.commonproducts.ProductTaskInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTaskInfoDAO {
    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    int countByExample(ProductTaskInfoDOExample example);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    int deleteByExample(ProductTaskInfoDOExample example);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    int insert(ProductTaskInfoDO record);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    int insertSelective(ProductTaskInfoDO record);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    List<ProductTaskInfoDO> selectByExample(ProductTaskInfoDOExample example);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    ProductTaskInfoDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductTaskInfoDO record, @Param("example") ProductTaskInfoDOExample example);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductTaskInfoDO record, @Param("example") ProductTaskInfoDOExample example);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductTaskInfoDO record);

    /**
     * corresponds to the database table product_task_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductTaskInfoDO record);
}