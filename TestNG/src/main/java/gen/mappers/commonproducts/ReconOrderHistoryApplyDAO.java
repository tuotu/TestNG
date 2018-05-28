/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ReconOrderHistoryApplyDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ReconOrderHistoryApplyDO;
import gen.doproject.commonproducts.ReconOrderHistoryApplyDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReconOrderHistoryApplyDAO {
    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    int countByExample(ReconOrderHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    int deleteByExample(ReconOrderHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    int insert(ReconOrderHistoryApplyDO record);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    int insertSelective(ReconOrderHistoryApplyDO record);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    List<ReconOrderHistoryApplyDO> selectByExample(ReconOrderHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    ReconOrderHistoryApplyDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ReconOrderHistoryApplyDO record, @Param("example") ReconOrderHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ReconOrderHistoryApplyDO record, @Param("example") ReconOrderHistoryApplyDOExample example);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReconOrderHistoryApplyDO record);

    /**
     * corresponds to the database table recon_order_history_apply
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReconOrderHistoryApplyDO record);
}