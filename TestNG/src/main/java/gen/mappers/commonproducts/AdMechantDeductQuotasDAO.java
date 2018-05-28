/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AdMechantDeductQuotasDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.AdMechantDeductQuotasDO;
import gen.doproject.commonproducts.AdMechantDeductQuotasDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdMechantDeductQuotasDAO {
    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    int countByExample(AdMechantDeductQuotasDOExample example);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    int deleteByExample(AdMechantDeductQuotasDOExample example);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    int insert(AdMechantDeductQuotasDO record);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    int insertSelective(AdMechantDeductQuotasDO record);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    List<AdMechantDeductQuotasDO> selectByExample(AdMechantDeductQuotasDOExample example);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    AdMechantDeductQuotasDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AdMechantDeductQuotasDO record, @Param("example") AdMechantDeductQuotasDOExample example);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AdMechantDeductQuotasDO record, @Param("example") AdMechantDeductQuotasDOExample example);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdMechantDeductQuotasDO record);

    /**
     * corresponds to the database table ad_mechant_deduct_quotas
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdMechantDeductQuotasDO record);
}