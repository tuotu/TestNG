/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ThirdPartyAccountsDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ThirdPartyAccountsDO;
import gen.doproject.commonproducts.ThirdPartyAccountsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdPartyAccountsDAO {
    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    int countByExample(ThirdPartyAccountsDOExample example);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    int deleteByExample(ThirdPartyAccountsDOExample example);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    int insert(ThirdPartyAccountsDO record);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    int insertSelective(ThirdPartyAccountsDO record);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    List<ThirdPartyAccountsDO> selectByExample(ThirdPartyAccountsDOExample example);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    ThirdPartyAccountsDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ThirdPartyAccountsDO record, @Param("example") ThirdPartyAccountsDOExample example);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ThirdPartyAccountsDO record, @Param("example") ThirdPartyAccountsDOExample example);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ThirdPartyAccountsDO record);

    /**
     * corresponds to the database table third_party_accounts
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ThirdPartyAccountsDO record);
}