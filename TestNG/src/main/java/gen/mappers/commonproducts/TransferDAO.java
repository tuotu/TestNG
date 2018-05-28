/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TransferDO;
import gen.doproject.commonproducts.TransferDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferDAO {
    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    int countByExample(TransferDOExample example);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    int deleteByExample(TransferDOExample example);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    int insert(TransferDO record);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    int insertSelective(TransferDO record);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    List<TransferDO> selectByExample(TransferDOExample example);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    TransferDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransferDO record, @Param("example") TransferDOExample example);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransferDO record, @Param("example") TransferDOExample example);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransferDO record);

    /**
     * corresponds to the database table transfer
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransferDO record);
}