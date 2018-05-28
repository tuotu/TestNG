/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconHistoryApplyDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ReconHistoryApplyDO;
import gen.doproject.commonproducts.ReconHistoryApplyDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReconHistoryApplyDAO {
    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    int countByExample(ReconHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    int deleteByExample(ReconHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    int insert(ReconHistoryApplyDO record);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    int insertSelective(ReconHistoryApplyDO record);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    List<ReconHistoryApplyDO> selectByExample(ReconHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    ReconHistoryApplyDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ReconHistoryApplyDO record, @Param("example") ReconHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ReconHistoryApplyDO record, @Param("example") ReconHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReconHistoryApplyDO record);

    /**
     * corresponds to the database table recon_history_apply
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReconHistoryApplyDO record);
}