/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename SysResourceDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.SysResourceDO;
import gen.doproject.commonproducts.SysResourceDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourceDAO {
    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    int countByExample(SysResourceDOExample example);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    int deleteByExample(SysResourceDOExample example);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    int insert(SysResourceDO record);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    int insertSelective(SysResourceDO record);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    List<SysResourceDO> selectByExample(SysResourceDOExample example);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    SysResourceDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysResourceDO record, @Param("example") SysResourceDOExample example);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysResourceDO record, @Param("example") SysResourceDOExample example);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysResourceDO record);

    /**
     * corresponds to the database table sys_resource
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysResourceDO record);
}