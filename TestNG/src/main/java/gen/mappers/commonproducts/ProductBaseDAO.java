/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductBaseDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductBaseDO;
import gen.doproject.commonproducts.ProductBaseDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductBaseDAO {
    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    int countByExample(ProductBaseDOExample example);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    int deleteByExample(ProductBaseDOExample example);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    int insert(ProductBaseDO record);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    int insertSelective(ProductBaseDO record);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    List<ProductBaseDO> selectByExample(ProductBaseDOExample example);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    ProductBaseDO selectByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductBaseDO record, @Param("example") ProductBaseDOExample example);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductBaseDO record, @Param("example") ProductBaseDOExample example);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductBaseDO record);

    /**
     * corresponds to the database table product_base
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductBaseDO record);
}