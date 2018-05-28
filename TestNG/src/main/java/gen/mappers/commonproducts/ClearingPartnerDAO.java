/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingPartnerDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ClearingPartnerDO;
import gen.doproject.commonproducts.ClearingPartnerDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClearingPartnerDAO {
    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    int countByExample(ClearingPartnerDOExample example);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    int deleteByExample(ClearingPartnerDOExample example);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    int insert(ClearingPartnerDO record);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    int insertSelective(ClearingPartnerDO record);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    List<ClearingPartnerDO> selectByExample(ClearingPartnerDOExample example);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    ClearingPartnerDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ClearingPartnerDO record, @Param("example") ClearingPartnerDOExample example);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ClearingPartnerDO record, @Param("example") ClearingPartnerDOExample example);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ClearingPartnerDO record);

    /**
     * corresponds to the database table clearing_partner
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ClearingPartnerDO record);
}