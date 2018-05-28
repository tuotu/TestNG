/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename WithdrawDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.WithdrawDO;
import gen.doproject.commonproducts.WithdrawDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawDAO {
    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    int countByExample(WithdrawDOExample example);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    int deleteByExample(WithdrawDOExample example);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    int insert(WithdrawDO record);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    int insertSelective(WithdrawDO record);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    List<WithdrawDO> selectByExample(WithdrawDOExample example);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    WithdrawDO selectByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WithdrawDO record, @Param("example") WithdrawDOExample example);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WithdrawDO record, @Param("example") WithdrawDOExample example);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WithdrawDO record);

    /**
     * corresponds to the database table withdraw
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WithdrawDO record);
}