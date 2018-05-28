/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconUserConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ReconUserConfigDO;
import gen.doproject.commonproducts.ReconUserConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReconUserConfigDAO {
    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    int countByExample(ReconUserConfigDOExample example);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    int deleteByExample(ReconUserConfigDOExample example);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    int insert(ReconUserConfigDO record);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    int insertSelective(ReconUserConfigDO record);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    List<ReconUserConfigDO> selectByExample(ReconUserConfigDOExample example);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    ReconUserConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ReconUserConfigDO record, @Param("example") ReconUserConfigDOExample example);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ReconUserConfigDO record, @Param("example") ReconUserConfigDOExample example);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReconUserConfigDO record);

    /**
     * corresponds to the database table recon_user_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReconUserConfigDO record);
}