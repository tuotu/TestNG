/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename BatchIdempotentDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.BatchIdempotentDO;
import gen.doproject.commonproducts.BatchIdempotentDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchIdempotentDAO {
    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    int countByExample(BatchIdempotentDOExample example);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    int deleteByExample(BatchIdempotentDOExample example);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    int insert(BatchIdempotentDO record);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    int insertSelective(BatchIdempotentDO record);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    List<BatchIdempotentDO> selectByExample(BatchIdempotentDOExample example);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    BatchIdempotentDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BatchIdempotentDO record, @Param("example") BatchIdempotentDOExample example);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BatchIdempotentDO record, @Param("example") BatchIdempotentDOExample example);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BatchIdempotentDO record);

    /**
     * corresponds to the database table batch_idempotent
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BatchIdempotentDO record);
}