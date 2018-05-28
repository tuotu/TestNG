/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename TransferBizNoMapDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.TransferBizNoMapDO;
import gen.doproject.commonproducts.TransferBizNoMapDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferBizNoMapDAO {
    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    int countByExample(TransferBizNoMapDOExample example);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    int deleteByExample(TransferBizNoMapDOExample example);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    int insert(TransferBizNoMapDO record);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    int insertSelective(TransferBizNoMapDO record);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    List<TransferBizNoMapDO> selectByExample(TransferBizNoMapDOExample example);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    TransferBizNoMapDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TransferBizNoMapDO record, @Param("example") TransferBizNoMapDOExample example);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TransferBizNoMapDO record, @Param("example") TransferBizNoMapDOExample example);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TransferBizNoMapDO record);

    /**
     * corresponds to the database table transfer_biz_no_map
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TransferBizNoMapDO record);
}