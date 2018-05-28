/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductConfigArgsDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductConfigArgsDO;
import gen.doproject.commonproducts.ProductConfigArgsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductConfigArgsDAO {
    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    int countByExample(ProductConfigArgsDOExample example);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    int deleteByExample(ProductConfigArgsDOExample example);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    int insert(ProductConfigArgsDO record);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    int insertSelective(ProductConfigArgsDO record);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    List<ProductConfigArgsDO> selectByExample(ProductConfigArgsDOExample example);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    ProductConfigArgsDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductConfigArgsDO record, @Param("example") ProductConfigArgsDOExample example);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductConfigArgsDO record, @Param("example") ProductConfigArgsDOExample example);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductConfigArgsDO record);

    /**
     * corresponds to the database table product_config_args
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductConfigArgsDO record);
}