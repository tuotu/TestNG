/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename MergePayDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.MergePayDO;
import gen.doproject.commonproducts.MergePayDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MergePayDAO {
    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    int countByExample(MergePayDOExample example);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    int deleteByExample(MergePayDOExample example);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    int insert(MergePayDO record);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    int insertSelective(MergePayDO record);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    List<MergePayDO> selectByExample(MergePayDOExample example);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    MergePayDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MergePayDO record, @Param("example") MergePayDOExample example);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MergePayDO record, @Param("example") MergePayDOExample example);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MergePayDO record);

    /**
     * corresponds to the database table merge_pay
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MergePayDO record);
}