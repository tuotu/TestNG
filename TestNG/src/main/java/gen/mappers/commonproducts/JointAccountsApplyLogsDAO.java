/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointAccountsApplyLogsDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.JointAccountsApplyLogsDO;
import gen.doproject.commonproducts.JointAccountsApplyLogsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JointAccountsApplyLogsDAO {
    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    int countByExample(JointAccountsApplyLogsDOExample example);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    int deleteByExample(JointAccountsApplyLogsDOExample example);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    int insert(JointAccountsApplyLogsDO record);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    int insertSelective(JointAccountsApplyLogsDO record);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    List<JointAccountsApplyLogsDO> selectByExample(JointAccountsApplyLogsDOExample example);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    JointAccountsApplyLogsDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") JointAccountsApplyLogsDO record, @Param("example") JointAccountsApplyLogsDOExample example);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") JointAccountsApplyLogsDO record, @Param("example") JointAccountsApplyLogsDOExample example);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JointAccountsApplyLogsDO record);

    /**
     * corresponds to the database table joint_accounts_apply_logs
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JointAccountsApplyLogsDO record);
}