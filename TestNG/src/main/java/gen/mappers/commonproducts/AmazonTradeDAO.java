/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename AmazonTradeDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.AmazonTradeDO;
import gen.doproject.commonproducts.AmazonTradeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmazonTradeDAO {
    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    int countByExample(AmazonTradeDOExample example);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    int deleteByExample(AmazonTradeDOExample example);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    int insert(AmazonTradeDO record);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    int insertSelective(AmazonTradeDO record);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    List<AmazonTradeDO> selectByExample(AmazonTradeDOExample example);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    AmazonTradeDO selectByPrimaryKey(String bizNo);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AmazonTradeDO record, @Param("example") AmazonTradeDOExample example);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AmazonTradeDO record, @Param("example") AmazonTradeDOExample example);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AmazonTradeDO record);

    /**
     * corresponds to the database table amazon_trade
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AmazonTradeDO record);
}