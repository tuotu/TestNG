/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename JointStreamLogDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.JointStreamLogDO;
import gen.doproject.commonproducts.JointStreamLogDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JointStreamLogDAO {
    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    int countByExample(JointStreamLogDOExample example);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    int deleteByExample(JointStreamLogDOExample example);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    int insert(JointStreamLogDO record);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    int insertSelective(JointStreamLogDO record);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    List<JointStreamLogDO> selectByExample(JointStreamLogDOExample example);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    JointStreamLogDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") JointStreamLogDO record, @Param("example") JointStreamLogDOExample example);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") JointStreamLogDO record, @Param("example") JointStreamLogDOExample example);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JointStreamLogDO record);

    /**
     * corresponds to the database table joint_stream_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JointStreamLogDO record);
}