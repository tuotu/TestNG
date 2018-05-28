package base;

import com.yjf.common.lang.security.IndexUtil;
import com.yjf.common.lang.util.DateUtil;
import com.yjf.common.util.StringUtils;
import com.yjf.securitydata.client.exception.SecurityDataException;
import com.yjf.securitydata.client.info.BatchMapInfo;
import gen.doproject.PersonDO;
import gen.doproject.PersonDOExample;
import gen.mappers.mapper.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wiley
 * @date 2018/2/6 0006 16:01
 */
@ContextConfiguration({//"classpath:/spring-mybatis/spring-mybatis.xml",
                        "/dal/dal-db.xml"})
public class TestBase extends TestBaseService {


}
