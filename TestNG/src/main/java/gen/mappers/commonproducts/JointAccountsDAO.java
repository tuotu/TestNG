/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointAccountsDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.JointAccountsDO;
import gen.doproject.commonproducts.JointAccountsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JointAccountsDAO {
    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    int countByExample(JointAccountsDOExample example);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    int deleteByExample(JointAccountsDOExample example);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    int insert(JointAccountsDO record);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    int insertSelective(JointAccountsDO record);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    List<JointAccountsDO> selectByExample(JointAccountsDOExample example);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    JointAccountsDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") JointAccountsDO record, @Param("example") JointAccountsDOExample example);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") JointAccountsDO record, @Param("example") JointAccountsDOExample example);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JointAccountsDO record);

    /**
     * corresponds to the database table joint_accounts
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JointAccountsDO record);
}