/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayBankDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPayBankDO;
import gen.doproject.commonproducts.FastPayBankDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPayBankDAO {
    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    int countByExample(FastPayBankDOExample example);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    int deleteByExample(FastPayBankDOExample example);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    int insert(FastPayBankDO record);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    int insertSelective(FastPayBankDO record);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    List<FastPayBankDO> selectByExample(FastPayBankDOExample example);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    FastPayBankDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPayBankDO record, @Param("example") FastPayBankDOExample example);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPayBankDO record, @Param("example") FastPayBankDOExample example);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPayBankDO record);

    /**
     * corresponds to the database table fast_pay_bank
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPayBankDO record);
}