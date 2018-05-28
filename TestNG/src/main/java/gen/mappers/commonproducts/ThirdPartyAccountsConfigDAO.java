/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename ThirdPartyAccountsConfigDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.ThirdPartyAccountsConfigDO;
import gen.doproject.commonproducts.ThirdPartyAccountsConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdPartyAccountsConfigDAO {
    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    int countByExample(ThirdPartyAccountsConfigDOExample example);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    int deleteByExample(ThirdPartyAccountsConfigDOExample example);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    int insert(ThirdPartyAccountsConfigDO record);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    int insertSelective(ThirdPartyAccountsConfigDO record);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    List<ThirdPartyAccountsConfigDO> selectByExample(ThirdPartyAccountsConfigDOExample example);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    ThirdPartyAccountsConfigDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ThirdPartyAccountsConfigDO record, @Param("example") ThirdPartyAccountsConfigDOExample example);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ThirdPartyAccountsConfigDO record, @Param("example") ThirdPartyAccountsConfigDOExample example);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ThirdPartyAccountsConfigDO record);

    /**
     * corresponds to the database table third_party_accounts_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ThirdPartyAccountsConfigDO record);
}