/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointAccountFundsInDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.JointAccountFundsInDO;
import gen.doproject.commonproducts.JointAccountFundsInDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JointAccountFundsInDAO {
    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    int countByExample(JointAccountFundsInDOExample example);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    int deleteByExample(JointAccountFundsInDOExample example);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    int insert(JointAccountFundsInDO record);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    int insertSelective(JointAccountFundsInDO record);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    List<JointAccountFundsInDO> selectByExample(JointAccountFundsInDOExample example);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    JointAccountFundsInDO selectByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") JointAccountFundsInDO record, @Param("example") JointAccountFundsInDOExample example);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") JointAccountFundsInDO record, @Param("example") JointAccountFundsInDOExample example);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JointAccountFundsInDO record);

    /**
     * corresponds to the database table joint_account_funds_in
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JointAccountFundsInDO record);
}