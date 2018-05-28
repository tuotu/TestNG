/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AdDeductInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.AdDeductInfoDO;
import gen.doproject.commonproducts.AdDeductInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdDeductInfoDAO {
    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    int countByExample(AdDeductInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    int deleteByExample(AdDeductInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    int insert(AdDeductInfoDO record);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    int insertSelective(AdDeductInfoDO record);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    List<AdDeductInfoDO> selectByExample(AdDeductInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    AdDeductInfoDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AdDeductInfoDO record, @Param("example") AdDeductInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AdDeductInfoDO record, @Param("example") AdDeductInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdDeductInfoDO record);

    /**
     * corresponds to the database table ad_deduct_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdDeductInfoDO record);
}