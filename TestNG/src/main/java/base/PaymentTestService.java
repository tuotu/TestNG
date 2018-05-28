package base;

import com.yiji.commonproducts.payment.fastpay.api.query.FastPayQueryService;
import com.yjf.securitydata.client.SecurityDataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Copyright (C), 2018-2018
 * FileName: paymentTestService
 * Author:   wiley
 * Date:     2018/2/27 0027 14:21
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@ContextConfiguration({"/integration/dubbo-payment.xml"})
public class PaymentTestService extends TestBase {
    @Autowired
    protected SecurityDataClient securityDataClient;

    @Autowired
    protected FastPayQueryService fastPayQueryService;
}
