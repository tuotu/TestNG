/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferRecordDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TransferRecordDO;
import gen.doproject.commonproducts.TransferRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferRecordDAO {
    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    int countByExample(TransferRecordDOExample example);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    int deleteByExample(TransferRecordDOExample example);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    int insert(TransferRecordDO record);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    int insertSelective(TransferRecordDO record);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    List<TransferRecordDO> selectByExample(TransferRecordDOExample example);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    TransferRecordDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransferRecordDO record, @Param("example") TransferRecordDOExample example);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransferRecordDO record, @Param("example") TransferRecordDOExample example);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransferRecordDO record);

    /**
     * corresponds to the database table transfer_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransferRecordDO record);
}