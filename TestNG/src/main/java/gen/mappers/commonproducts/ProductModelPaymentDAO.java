/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductModelPaymentDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductModelPaymentDO;
import gen.doproject.commonproducts.ProductModelPaymentDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductModelPaymentDAO {
    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int countByExample(ProductModelPaymentDOExample example);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int deleteByExample(ProductModelPaymentDOExample example);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int insert(ProductModelPaymentDO record);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int insertSelective(ProductModelPaymentDO record);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    List<ProductModelPaymentDO> selectByExampleWithBLOBs(ProductModelPaymentDOExample example);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    List<ProductModelPaymentDO> selectByExample(ProductModelPaymentDOExample example);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    ProductModelPaymentDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductModelPaymentDO record, @Param("example") ProductModelPaymentDOExample example);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ProductModelPaymentDO record, @Param("example") ProductModelPaymentDOExample example);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductModelPaymentDO record, @Param("example") ProductModelPaymentDOExample example);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductModelPaymentDO record);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ProductModelPaymentDO record);

    /**
     * corresponds to the database table product_model_payment
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductModelPaymentDO record);
}