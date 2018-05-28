/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferBankInfoDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TransferBankInfoDO;
import gen.doproject.commonproducts.TransferBankInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferBankInfoDAO {
    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    int countByExample(TransferBankInfoDOExample example);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    int deleteByExample(TransferBankInfoDOExample example);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    int insert(TransferBankInfoDO record);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    int insertSelective(TransferBankInfoDO record);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    List<TransferBankInfoDO> selectByExample(TransferBankInfoDOExample example);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    TransferBankInfoDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransferBankInfoDO record, @Param("example") TransferBankInfoDOExample example);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransferBankInfoDO record, @Param("example") TransferBankInfoDOExample example);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransferBankInfoDO record);

    /**
     * corresponds to the database table transfer_bank_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransferBankInfoDO record);
}