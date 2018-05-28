/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SecurityConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.SecurityConfigDO;
import gen.doproject.commonproducts.SecurityConfigDOExample;
import gen.doproject.commonproducts.SecurityConfigWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityConfigDAO {
    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int countByExample(SecurityConfigDOExample example);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int deleteByExample(SecurityConfigDOExample example);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int insert(SecurityConfigWithBLOBs record);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int insertSelective(SecurityConfigWithBLOBs record);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    List<SecurityConfigWithBLOBs> selectByExampleWithBLOBs(SecurityConfigDOExample example);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    List<SecurityConfigDO> selectByExample(SecurityConfigDOExample example);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    SecurityConfigWithBLOBs selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SecurityConfigWithBLOBs record, @Param("example") SecurityConfigDOExample example);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") SecurityConfigWithBLOBs record, @Param("example") SecurityConfigDOExample example);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SecurityConfigDO record, @Param("example") SecurityConfigDOExample example);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SecurityConfigWithBLOBs record);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(SecurityConfigWithBLOBs record);

    /**
     * corresponds to the database table security_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SecurityConfigDO record);
}