/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingPartnerSumDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ClearingPartnerSumDO;
import gen.doproject.commonproducts.ClearingPartnerSumDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClearingPartnerSumDAO {
    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    int countByExample(ClearingPartnerSumDOExample example);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    int deleteByExample(ClearingPartnerSumDOExample example);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    int insert(ClearingPartnerSumDO record);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    int insertSelective(ClearingPartnerSumDO record);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    List<ClearingPartnerSumDO> selectByExample(ClearingPartnerSumDOExample example);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    ClearingPartnerSumDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ClearingPartnerSumDO record, @Param("example") ClearingPartnerSumDOExample example);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ClearingPartnerSumDO record, @Param("example") ClearingPartnerSumDOExample example);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ClearingPartnerSumDO record);

    /**
     * corresponds to the database table clearing_partner_sum
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ClearingPartnerSumDO record);
}