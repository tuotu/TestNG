/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferModelDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TransferModelDO;
import gen.doproject.commonproducts.TransferModelDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferModelDAO {
    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int countByExample(TransferModelDOExample example);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int deleteByExample(TransferModelDOExample example);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int insert(TransferModelDO record);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int insertSelective(TransferModelDO record);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    List<TransferModelDO> selectByExampleWithBLOBs(TransferModelDOExample example);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    List<TransferModelDO> selectByExample(TransferModelDOExample example);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    TransferModelDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransferModelDO record, @Param("example") TransferModelDOExample example);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") TransferModelDO record, @Param("example") TransferModelDOExample example);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransferModelDO record, @Param("example") TransferModelDOExample example);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransferModelDO record);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(TransferModelDO record);

    /**
     * corresponds to the database table transfer_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransferModelDO record);
}