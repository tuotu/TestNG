/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductModelWithdrawDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductModelWithdrawDO;
import gen.doproject.commonproducts.ProductModelWithdrawDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductModelWithdrawDAO {
    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int countByExample(ProductModelWithdrawDOExample example);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int deleteByExample(ProductModelWithdrawDOExample example);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int insert(ProductModelWithdrawDO record);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int insertSelective(ProductModelWithdrawDO record);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    List<ProductModelWithdrawDO> selectByExampleWithBLOBs(ProductModelWithdrawDOExample example);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    List<ProductModelWithdrawDO> selectByExample(ProductModelWithdrawDOExample example);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    ProductModelWithdrawDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductModelWithdrawDO record, @Param("example") ProductModelWithdrawDOExample example);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ProductModelWithdrawDO record, @Param("example") ProductModelWithdrawDOExample example);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductModelWithdrawDO record, @Param("example") ProductModelWithdrawDOExample example);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductModelWithdrawDO record);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ProductModelWithdrawDO record);

    /**
     * corresponds to the database table product_model_withdraw
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductModelWithdrawDO record);
}