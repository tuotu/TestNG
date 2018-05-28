/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ProductBizNoMapDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ProductBizNoMapDO;
import gen.doproject.commonproducts.ProductBizNoMapDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductBizNoMapDAO {
    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    int countByExample(ProductBizNoMapDOExample example);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    int deleteByExample(ProductBizNoMapDOExample example);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    int insert(ProductBizNoMapDO record);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    int insertSelective(ProductBizNoMapDO record);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    List<ProductBizNoMapDO> selectByExample(ProductBizNoMapDOExample example);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    ProductBizNoMapDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProductBizNoMapDO record, @Param("example") ProductBizNoMapDOExample example);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProductBizNoMapDO record, @Param("example") ProductBizNoMapDOExample example);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductBizNoMapDO record);

    /**
     * corresponds to the database table product_biz_no_map
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductBizNoMapDO record);
}