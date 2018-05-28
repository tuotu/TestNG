/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingCheckingSumDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ClearingCheckingSumDO;
import gen.doproject.commonproducts.ClearingCheckingSumDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClearingCheckingSumDAO {
    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    int countByExample(ClearingCheckingSumDOExample example);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    int deleteByExample(ClearingCheckingSumDOExample example);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    int insert(ClearingCheckingSumDO record);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    int insertSelective(ClearingCheckingSumDO record);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    List<ClearingCheckingSumDO> selectByExample(ClearingCheckingSumDOExample example);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    ClearingCheckingSumDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ClearingCheckingSumDO record, @Param("example") ClearingCheckingSumDOExample example);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ClearingCheckingSumDO record, @Param("example") ClearingCheckingSumDOExample example);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ClearingCheckingSumDO record);

    /**
     * corresponds to the database table clearing_checking_sum
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ClearingCheckingSumDO record);
}