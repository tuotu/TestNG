/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SdNotifyInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.SdNotifyInfoDO;
import gen.doproject.commonproducts.SdNotifyInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdNotifyInfoDAO {
    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    int countByExample(SdNotifyInfoDOExample example);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    int deleteByExample(SdNotifyInfoDOExample example);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    int insert(SdNotifyInfoDO record);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    int insertSelective(SdNotifyInfoDO record);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    List<SdNotifyInfoDO> selectByExample(SdNotifyInfoDOExample example);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    SdNotifyInfoDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SdNotifyInfoDO record, @Param("example") SdNotifyInfoDOExample example);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SdNotifyInfoDO record, @Param("example") SdNotifyInfoDOExample example);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SdNotifyInfoDO record);

    /**
     * corresponds to the database table sd_notify_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SdNotifyInfoDO record);
}