/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconFileTaskDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ReconFileTaskDO;
import gen.doproject.commonproducts.ReconFileTaskDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReconFileTaskDAO {
    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    int countByExample(ReconFileTaskDOExample example);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    int deleteByExample(ReconFileTaskDOExample example);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    int insert(ReconFileTaskDO record);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    int insertSelective(ReconFileTaskDO record);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    List<ReconFileTaskDO> selectByExample(ReconFileTaskDOExample example);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    ReconFileTaskDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ReconFileTaskDO record, @Param("example") ReconFileTaskDOExample example);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ReconFileTaskDO record, @Param("example") ReconFileTaskDOExample example);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReconFileTaskDO record);

    /**
     * corresponds to the database table recon_file_task
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReconFileTaskDO record);
}