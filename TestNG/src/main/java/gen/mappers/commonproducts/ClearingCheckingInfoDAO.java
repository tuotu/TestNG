/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ClearingCheckingInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ClearingCheckingInfoDO;
import gen.doproject.commonproducts.ClearingCheckingInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClearingCheckingInfoDAO {
    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    int countByExample(ClearingCheckingInfoDOExample example);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    int deleteByExample(ClearingCheckingInfoDOExample example);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    int insert(ClearingCheckingInfoDO record);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    int insertSelective(ClearingCheckingInfoDO record);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    List<ClearingCheckingInfoDO> selectByExample(ClearingCheckingInfoDOExample example);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    ClearingCheckingInfoDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ClearingCheckingInfoDO record, @Param("example") ClearingCheckingInfoDOExample example);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ClearingCheckingInfoDO record, @Param("example") ClearingCheckingInfoDOExample example);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ClearingCheckingInfoDO record);

    /**
     * corresponds to the database table clearing_checking_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ClearingCheckingInfoDO record);
}