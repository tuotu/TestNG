/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AdDeductUserInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.AdDeductUserInfoDO;
import gen.doproject.commonproducts.AdDeductUserInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdDeductUserInfoDAO {
    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    int countByExample(AdDeductUserInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    int deleteByExample(AdDeductUserInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    int insert(AdDeductUserInfoDO record);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    int insertSelective(AdDeductUserInfoDO record);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    List<AdDeductUserInfoDO> selectByExample(AdDeductUserInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    AdDeductUserInfoDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AdDeductUserInfoDO record, @Param("example") AdDeductUserInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AdDeductUserInfoDO record, @Param("example") AdDeductUserInfoDOExample example);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdDeductUserInfoDO record);

    /**
     * corresponds to the database table ad_deduct_user_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdDeductUserInfoDO record);
}