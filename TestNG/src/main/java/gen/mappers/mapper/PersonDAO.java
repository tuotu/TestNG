/**
 *
 * A dao interface provides methods to access database 
 * Dont modify any generated method! 
 * If you want to add a new method , plesae dont add  mbggenerated annotation marked comment.
 *
 * @Filename PersonDAO.java
 *
 * @Description
 *
 * @Author bohr.qiu
 *
 * @Email qzhanbo@yiji.com
 *
 */
package gen.mappers.mapper;

import gen.doproject.PersonDO;
import gen.doproject.PersonDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonDAO {
    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    int countByExample(PersonDOExample example);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    int deleteByExample(PersonDOExample example);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    int insert(PersonDO record);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    int insertSelective(PersonDO record);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    List<PersonDO> selectByExample(PersonDOExample example);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    PersonDO selectByPrimaryKey(Integer id);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PersonDO record, @Param("example") PersonDOExample example);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PersonDO record, @Param("example") PersonDOExample example);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PersonDO record);

    /**
     * corresponds to the database table person
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PersonDO record);
}