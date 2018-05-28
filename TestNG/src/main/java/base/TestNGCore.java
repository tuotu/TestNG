package base;

import com.yjf.common.lang.security.IndexUtil;
import com.yjf.common.lang.util.DateUtil;
import com.yjf.common.util.StringUtils;
import core.Parameter;
import core.utils.CSVUtil;
import core.utils.ObjectUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wiley on 2018/1/23 0023.
 */
public class TestNGCore extends AbstractTransactionalTestNGSpringContextTests {
    private static final Logger logger = LoggerFactory.getLogger(TestNGCore.class);

    @BeforeClass
    protected void beforeClass(){
        System.out.println("=============================测试开始================================");
    }
    @AfterClass
    protected void afterClass(){
        System.out.println("=============================测试结束================================");
    }

    @DataProvider
    protected Object[][] getCSVData(Method method) {
        Object[][] object;
        String fileName = method.getName() + ".csv";
        String filePath = null;
        try {
            filePath = Thread.currentThread().getContextClassLoader().getResource(fileName).getPath();
        }catch (NullPointerException e){
            logger.info("文件不存在: " + fileName);
        }

        //读取文件所有数据
        List<Map<String, String>> csvContent = CSVUtil.readCSVFileAll(filePath);
        List<List<Parameter>> paList = ObjectUtil.getMethodParameters(method, csvContent);
        object = ObjectUtil.processParams(paList);
        return object;
    }

    //获取摘要
    protected String getDigest(String originaltext) {
        return IndexUtil.getDigest(originaltext);
    }

    protected Date getSysDate() {
        return DateUtil.now();
    }
    //获取掩码
    protected String getMask(String originaltext) {
        return StringUtils.mask(originaltext);
    }


    protected void assertNotNull(Object object) {
        Assert.assertNotNull(object);
    }

    protected void assertTrue(boolean ble) {
        Assert.assertTrue(ble);
    }

    protected void assertFalse(boolean ble) {
        Assert.assertFalse(ble);
    }

    protected void assertEquals(Object obj1, Object obj2) {
        Assert.assertEquals(obj1, obj2);
    }

    protected void assertNotEquals(Object obj1, Object obj2) {
        Assert.assertNotEquals(obj1, obj2);
    }

    protected void assertNull(Object object) {
        Assert.assertNull(object);
    }

    protected void assertIsBiggerNumber(int num1, int num2) {
        Assert.assertTrue(num1 >= num2);
    }
}
