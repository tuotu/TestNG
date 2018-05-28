/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconOrderFileDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ReconOrderFileDO;
import gen.doproject.commonproducts.ReconOrderFileDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReconOrderFileDAO {
    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    int countByExample(ReconOrderFileDOExample example);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    int deleteByExample(ReconOrderFileDOExample example);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    int insert(ReconOrderFileDO record);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    int insertSelective(ReconOrderFileDO record);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    List<ReconOrderFileDO> selectByExample(ReconOrderFileDOExample example);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    ReconOrderFileDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ReconOrderFileDO record, @Param("example") ReconOrderFileDOExample example);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ReconOrderFileDO record, @Param("example") ReconOrderFileDOExample example);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReconOrderFileDO record);

    /**
     * corresponds to the database table recon_order_file
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReconOrderFileDO record);
}