/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferContactsDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TransferContactsDO;
import gen.doproject.commonproducts.TransferContactsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferContactsDAO {
    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    int countByExample(TransferContactsDOExample example);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    int deleteByExample(TransferContactsDOExample example);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    int insert(TransferContactsDO record);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    int insertSelective(TransferContactsDO record);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    List<TransferContactsDO> selectByExample(TransferContactsDOExample example);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    TransferContactsDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransferContactsDO record, @Param("example") TransferContactsDOExample example);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransferContactsDO record, @Param("example") TransferContactsDOExample example);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransferContactsDO record);

    /**
     * corresponds to the database table transfer_contacts
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransferContactsDO record);
}