/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename BatchBehalfDetailDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.BatchBehalfDetailDO;
import gen.doproject.commonproducts.BatchBehalfDetailDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchBehalfDetailDAO {
    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    int countByExample(BatchBehalfDetailDOExample example);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    int deleteByExample(BatchBehalfDetailDOExample example);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    int insert(BatchBehalfDetailDO record);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    int insertSelective(BatchBehalfDetailDO record);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    List<BatchBehalfDetailDO> selectByExample(BatchBehalfDetailDOExample example);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    BatchBehalfDetailDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BatchBehalfDetailDO record, @Param("example") BatchBehalfDetailDOExample example);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BatchBehalfDetailDO record, @Param("example") BatchBehalfDetailDOExample example);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BatchBehalfDetailDO record);

    /**
     * corresponds to the database table batch_behalf_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BatchBehalfDetailDO record);
}