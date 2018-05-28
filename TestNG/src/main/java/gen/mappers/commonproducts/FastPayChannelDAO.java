/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename FastPayChannelDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.FastPayChannelDO;
import gen.doproject.commonproducts.FastPayChannelDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastPayChannelDAO {
    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    int countByExample(FastPayChannelDOExample example);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    int deleteByExample(FastPayChannelDOExample example);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    int insert(FastPayChannelDO record);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    int insertSelective(FastPayChannelDO record);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    List<FastPayChannelDO> selectByExample(FastPayChannelDOExample example);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    FastPayChannelDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FastPayChannelDO record, @Param("example") FastPayChannelDOExample example);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FastPayChannelDO record, @Param("example") FastPayChannelDOExample example);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FastPayChannelDO record);

    /**
     * corresponds to the database table fast_pay_channel
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FastPayChannelDO record);
}