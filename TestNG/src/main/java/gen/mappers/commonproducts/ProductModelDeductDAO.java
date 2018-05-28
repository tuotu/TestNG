/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductModelDeductDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductModelDeductDO;
import gen.doproject.commonproducts.ProductModelDeductDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductModelDeductDAO {
    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int countByExample(ProductModelDeductDOExample example);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int deleteByExample(ProductModelDeductDOExample example);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int insert(ProductModelDeductDO record);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int insertSelective(ProductModelDeductDO record);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    List<ProductModelDeductDO> selectByExampleWithBLOBs(ProductModelDeductDOExample example);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    List<ProductModelDeductDO> selectByExample(ProductModelDeductDOExample example);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    ProductModelDeductDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductModelDeductDO record, @Param("example") ProductModelDeductDOExample example);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ProductModelDeductDO record, @Param("example") ProductModelDeductDOExample example);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductModelDeductDO record, @Param("example") ProductModelDeductDOExample example);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductModelDeductDO record);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ProductModelDeductDO record);

    /**
     * corresponds to the database table product_model_deduct
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductModelDeductDO record);
}