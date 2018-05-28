/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SdSingleDeductDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.SdSingleDeductDO;
import gen.doproject.commonproducts.SdSingleDeductDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdSingleDeductDAO {
    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    int countByExample(SdSingleDeductDOExample example);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    int deleteByExample(SdSingleDeductDOExample example);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    int insert(SdSingleDeductDO record);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    int insertSelective(SdSingleDeductDO record);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    List<SdSingleDeductDO> selectByExample(SdSingleDeductDOExample example);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    SdSingleDeductDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SdSingleDeductDO record, @Param("example") SdSingleDeductDOExample example);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SdSingleDeductDO record, @Param("example") SdSingleDeductDOExample example);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SdSingleDeductDO record);

    /**
     * corresponds to the database table sd_single_deduct
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SdSingleDeductDO record);
}