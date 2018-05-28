/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename IdentityValidateDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.commonproducts;

import gen.doproject.commonproducts.IdentityValidateDO;
import gen.doproject.commonproducts.IdentityValidateDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdentityValidateDAO {
    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    int countByExample(IdentityValidateDOExample example);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    int deleteByExample(IdentityValidateDOExample example);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    int insert(IdentityValidateDO record);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    int insertSelective(IdentityValidateDO record);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    List<IdentityValidateDO> selectByExample(IdentityValidateDOExample example);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    IdentityValidateDO selectByPrimaryKey(Long id);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") IdentityValidateDO record, @Param("example") IdentityValidateDOExample example);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") IdentityValidateDO record, @Param("example") IdentityValidateDOExample example);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IdentityValidateDO record);

    /**
     * corresponds to the database table identity_validate
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(IdentityValidateDO record);
}