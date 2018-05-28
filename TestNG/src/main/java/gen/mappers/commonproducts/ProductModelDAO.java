/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductModelDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductModelDO;
import gen.doproject.commonproducts.ProductModelDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductModelDAO {
    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int countByExample(ProductModelDOExample example);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int deleteByExample(ProductModelDOExample example);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int insert(ProductModelDO record);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int insertSelective(ProductModelDO record);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    List<ProductModelDO> selectByExampleWithBLOBs(ProductModelDOExample example);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    List<ProductModelDO> selectByExample(ProductModelDOExample example);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    ProductModelDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductModelDO record, @Param("example") ProductModelDOExample example);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ProductModelDO record, @Param("example") ProductModelDOExample example);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductModelDO record, @Param("example") ProductModelDOExample example);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductModelDO record);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ProductModelDO record);

    /**
     * corresponds to the database table product_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductModelDO record);
}