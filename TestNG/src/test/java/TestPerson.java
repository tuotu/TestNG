import base.PaymentTestBase;
import base.TestBase;
import com.yiji.commonproducts.payment.fastpay.api.query.FastPayQueryService;
import com.yiji.commonproducts.payment.fastpay.order.query.FastPayQueryOrder;
import com.yiji.commonproducts.payment.fastpay.result.query.FastPayQueryResult;
import core.process.StatusEnum;
import org.testng.annotations.Test;

/**
 * @author wiley
 * @date 2018/2/6 0006 10:16
 */
@Test
public class TestPerson extends PaymentTestBase {

    @Test(dataProvider = "getCSVData", dataProviderClass = TestPerson.class)
    public void testPerson(long testId, StatusEnum status, String code){
//        insertPerson((int)testId, status.code(), (int)testId);
        FastPayQueryOrder order = new FastPayQueryOrder();

        FastPayQueryResult result =  fastPayQueryService.fastPayQueryByBizNo(order);


    }
}
