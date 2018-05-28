/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconFileDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ReconFileDO;
import gen.doproject.commonproducts.ReconFileDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReconFileDAO {
    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    int countByExample(ReconFileDOExample example);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    int deleteByExample(ReconFileDOExample example);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    int insert(ReconFileDO record);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    int insertSelective(ReconFileDO record);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    List<ReconFileDO> selectByExample(ReconFileDOExample example);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    ReconFileDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ReconFileDO record, @Param("example") ReconFileDOExample example);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ReconFileDO record, @Param("example") ReconFileDOExample example);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReconFileDO record);

    /**
     * corresponds to the database table recon_file
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReconFileDO record);
}