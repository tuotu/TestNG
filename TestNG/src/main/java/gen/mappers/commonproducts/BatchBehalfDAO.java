/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename BatchBehalfDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.BatchBehalfDO;
import gen.doproject.commonproducts.BatchBehalfDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchBehalfDAO {
    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    int countByExample(BatchBehalfDOExample example);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    int deleteByExample(BatchBehalfDOExample example);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    int insert(BatchBehalfDO record);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    int insertSelective(BatchBehalfDO record);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    List<BatchBehalfDO> selectByExample(BatchBehalfDOExample example);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    BatchBehalfDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BatchBehalfDO record, @Param("example") BatchBehalfDOExample example);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BatchBehalfDO record, @Param("example") BatchBehalfDOExample example);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BatchBehalfDO record);

    /**
     * corresponds to the database table batch_behalf
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BatchBehalfDO record);
}