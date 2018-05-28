/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * tangtao@yiji.com 上午10:40:16 创建
 */


import base.PaymentTestBase;
import com.yiji.commonproducts.payment.fastpay.enums.FastPayProductStatusEnum;
import com.yiji.commonproducts.payment.fastpay.enums.FastPayQuerySourceEnum;
import com.yiji.commonproducts.payment.pay.enums.PayMethodEnum;
import com.yiji.commonproducts.payment.pay.enums.ShareMethodEnum;
import com.yiji.commonservices.facade.query.enums.RankEnum;
import com.yiji.pb.enums.UserTeminalTypeEnum;
import com.yjf.common.id.OID;
import com.yjf.common.lang.result.Status;
import com.yjf.common.lang.util.money.Money;
import com.yjf.common.payengine.enums.BankCodeEnum;
import com.yjf.common.payengine.enums.CurrencyEnum;
import com.yjf.common.superroute.enums.DebitCreditTypeEnum;
import com.yjf.common.superroute.enums.PersonalCorporateTypeEnum;
import com.yjf.payengine.deposit.service.order.DepositAdvanceAckOrder;
import com.yjf.payengine.service.enums.PaySettleResultEnum;
import com.yjf.payengine.withdraw.service.order.WithdrawAdvanceOrder;
import com.yjf.securitydata.client.info.BatchMapInfo;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author tangtao@yiji.com
 *
 */
@Test
public class TradePaymentServiceSingleTradePayTestNew extends PaymentTestBase {
	@Test(dataProvider = "getCSVData", dataProviderClass = TradePaymentServiceSingleTradePayTestNew.class)
	public void tradePaymentServiceSingleTradePayTestSuccess(	int testId,
																String code,
																Status status,
																String gid,
																String payGid,
																String inlet,
																//账户资金
																Money buyerBalance,
																Money sellerBalance,
																Money merchantBalance,
																Money yjfChargeBalance,
																Money payerBalance,
																Money supervisionBalance,
																String yjfChargeAccountNo,
																//支付入参
																PayMethodEnum payMethod,
																FastPayQuerySourceEnum querySource,
																String pactNo,
																String protocolNo,
																UserTeminalTypeEnum userTerminalType,
																boolean certInstalled,
																String bankAccountNo,
																String bankCode,
																DebitCreditTypeEnum cardType,
																String deviceType,
																String mutableType,
																String openid,
																PersonalCorporateTypeEnum personalCorporateType,
																String wxAppid,
																String enpAccountCustNumber,
																String authCode,

																String payerUserId,
																String payerCardNo,
																String payerAccountNo,
																String depositVerifyCode,
																String depositBussineeCode,
																String yjfAccountNo,
																//创建交易入参
																String sellerUserId,
																String sellerCardNo,
																String sellerAccountNo,
																String buyerUserId,
																String buyerCardNo,
																String buyerAccountNo,
																String merchantUserId,
																String partnerId,
																String payPartnerId,
																String merchantAccountNo,
																String supervisionAccNo,
																String merchantOrderNo,
																String merchOrderNo,
																String payMerchOrderNo,
																CurrencyEnum currency,
																Money tradeAmount,
																String nationalType,
																long autoCloseDuration,
																String chargeExtends,
																String memo,
																String tradeName,
																String userEndIp,
																String userTeminalType,
																String macAddress,
																String dubboGroup,
																String dubboVersion,
																String dubboGid,
																String foreignGid,
																CurrencyEnum foreignCurrency,
																Double rate,
																Money foreignAmount,

																//识别规则
																String behavior,
																String sellerOperation,
																String buyerOperation,
																String merchantOperation,
																String custodiaOperation,
																String sceneName,
																String strategy,
																String sellerAccountType,
																String buyerAccountType,
																String merchantAccountType,
																String custodiaAccountType,
																String sellerAccountProp,
																String buyerAccountProp,
																String merchantAccountProp,
																String cardOutIn,
																String sellerChildProduct,
																String buyerChildProduct,
																String merchantChildProduct,
																String sellerIndustry,
																String buyerIndustry,
																String merchantIndustry,
																String sellerProduct,
																String buyerProduct,
																String merchantProduct,
																String ruleStatus,
																String sceneUserType,
																String accountTitleId,
																//用户状态
																String certifyStatus,
																String certifyStatusOld,
																String userStatus,
																String userStatusOld,
																String runtimeStatus,
																String runtimeStatusOld,
																RankEnum certifyRank,
																RankEnum buyerCertifyRankOld,
																RankEnum sellerCertifyRankOld,
																RankEnum merchantCertifyRankOld,
																RankEnum payerCertifyRankOld,
																//资金管控央行规则参数
																String productName,
																String accountLevel,
																String fcPbcStatus,
																String certCheck,
																Money singleQuota,
																Money dayQuota,
																String dayQuotaNode,
																String dayQuotaNodeTwo,
																Money yearQuota,
																String yearQuotaNode,
																String yearQuotaNodeTwo,
																String interceptWay,
																//	业务管控
																String businessRuleStatus,
																long businessDayCount,
																Money businessSingleQuota,
																Money businessDayQuota,
																Money businessMonthQuota,
																Money businessYearQuota,
																//fastpay_record表数据校验
																String productCode,
																FastPayProductStatusEnum productStatus,
																FastPayProductStatusEnum productStatusEnd,
																String hasRefund,
																String failReason,
																String payMode,
																String outUserId,
																String sellerBankAccountNo,
																String sellerPactNo,
																//fastpay_timeouts表数据校验
																String tradeStatus,
																String tradeStatusEnd,
																FastPayProductStatusEnum timeoutTradeStatus,
																String timeoutAction,
																//数据中心校验
																//	公共
																String dataStatus,
																String dataStatusEnd,
																String sellerTradeUerType,
																String buyerTradeUerType,
																String merchantTradeUerType,
																String payerTradeUerType,
																String operaingFlag,
																//	卖家
																String sellerRealName,
																//  买家
																String buyerRealName,
																String noneAccountType,
																//	商户
																String merchantRealName,
																//  付款人
																String payerRealName,
																//result返回校验
																String forwardUrl,
																Money buyerFee,
																Money fee,
																Money payAmount,
																//trade_pay_info表校验数据
																Money depositAmount,
																Money sellerFee,
																Money partnerFee,
																String mergeFlag,
																String payCertNo,
																String payCertType,
																String payStatus,
																String payStatusEnd,
																String payInfoMemo,

																// fastpay_special_channel_info表数据
																String methodCode,
																String operatorName,
																//模拟清算回执
																String settleCode,
																PaySettleResultEnum settleStatus,
																String accBankAccountNo,
																String accBankCode,
																//第二次付款信息
																String payGidTwo,
																String payMerchOrderNoTwo,
																String payPartnerIdTwo,
																PayMethodEnum payMethodTwo,
																FastPayQuerySourceEnum querySourceTwo,
																Status statusTwo,
																Money buyerFeeTwo,
																String forwardUrlTwo,
																PaySettleResultEnum settleStatusTwo,
																FastPayProductStatusEnum productStatusEndTwo,
																String payStatusEndTwo,
																String dataStatusEndTwo,
																String tradeStatusEndTwo,
																FastPayProductStatusEnum productStatusTwo,
																PersonalCorporateTypeEnum personalCorporateTypeTwo,
																String payStatusThree,
																String bankCodeTwo,
																String payerRealNameTwo,
																DebitCreditTypeEnum cardTypeTwo,
																//通知内容校验
																String keyOne, String valueOne,
																String keyTwo, String keyThree,
																String keyFour, String keyFive,
																String keySix, String keySeven,
																String keyEight,
																String keyNine,
																String keyTen,
																String valueTen,
																String keyeleven,
																String keyTwelve,
																String keyThirteen,
																String keyFourteen,
																//分润信息
																String payeeUserId,
																Money shareAmount,
																ShareMethodEnum shareMethod,
																Money bailPayMoney,
																Money confirmBailPayAmount) {
//						if (testId < 1043) {
//							return;
//						}
		//清除数据
		//		清除产品订单信息
		cleanFastPayByMerchantOrderNoAndMerchantCardNo(merchantOrderNo, partnerId);
		cleanFastPayByMerchantOrderNoAndMerchantCardNo(TEST_MERCH_ORDER_NO, partnerId);
		cleanFastPayTimeoutsByAll();
		cleanTradePayInfoByAll();
		//	清除数据中心订单同步信息
		//	清除支付引擎数据
		//	清除会员缓存

		//	清除数据中心统计数据
		// 清除识别规则数据
		//	清除资金管控规则数据

		//	清除commonservices回执通知服务
		//	清除通知数据
		//清除分润信息表
		cleanFastPayShareProfitAll();
		cleanCommandPayParamBymerchantId(partnerId);

		//准备数据
		//	准备会员实名、用户、运行时状态
		updateToAllStatusCustomerUserByUserId(sellerUserId, null, null, null,
			sellerCertifyRankOld.code());
		updateToAllStatusCustomerUserByUserId(merchantUserId, null, null, null,
			merchantCertifyRankOld.code());
		if (testId == 1001 || testId == 1002 || testId == 1003 || testId == 1011 || testId == 1026
			|| testId == 1028 || testId == 1029 || testId == 1040) {
			updateToAllStatusCustomerUserByUserId(payerUserId, null, null, null,
				payerCertifyRankOld.code());
		}
		if (testId == 1002 || testId == 1004 || testId == 1012 || testId == 1030) {
			updateToAllStatusCustomerUserByUserId(buyerUserId, null, null, null,
				buyerCertifyRankOld.code());
		}

		//	资金管控央行规则
		insertfcPbcNewRule(CurrencyEnum.CNY.code(), accountLevel, fcPbcStatus, certCheck,
			singleQuota, dayQuota, dayQuotaNode + "," + dayQuotaNodeTwo, yearQuota,
			yearQuotaNode + "," + yearQuotaNodeTwo, interceptWay, memo, getSysDate(), getSysDate(),
			null);
		insertfcPbcNewRule(CurrencyEnum.CNY.code(), accountLevel, fcPbcStatus, "N", singleQuota,
			dayQuota, dayQuotaNode + "," + dayQuotaNodeTwo, yearQuota, yearQuotaNode + ","
																		+ yearQuotaNodeTwo,
			interceptWay, memo, getSysDate(), getSysDate(), null);
		//	业务管控
		insertFcBusinessNewRule(productName, productCode, partnerId, CurrencyEnum.CNY.code(), null,
			fcPbcStatus, businessDayCount, businessSingleQuota, businessDayQuota,
			businessMonthQuota, businessYearQuota, interceptWay, memo, getSysDate(), getSysDate(),
			null, null, null, null, null);
		//绑卡信息
		insertPactUncustomerBankInFo(bankCode, "建设银行", "非易极付", bankAccountNo, cardType.code(),
			"511023198905060289", "ID", TEST_GID_true, "upmp", "20150811194511111111",
			"protocolchildno00001", "protocono0000001", getSysDate(), getSysDate(), "PACT",
			"18723088153", merchOrderNo, "非易极付空中签约即时到帐测试使用", null, "PERSONAL");

		//		初始化易极付备付金、买家、卖家和平台商户的资金账户余额、账户状态和支付模型---------------------->
		if (testId == 1001 || testId == 1003 || testId == 1011 || testId == 1020 || testId == 1021
			|| testId == 1025 || testId == 1026 || testId == 1028 || testId == 1029
			|| testId == 1037 || testId == 1038 || testId == 1039 || testId == 1040
			|| testId == 1041 || testId == 1042 || testId == 1043) {
			InitAccountNoMoney(merchantAccountNo, merchantBalance, null, null, sellerAccountNo,
				sellerBalance, payerAccountNo, payerBalance, yjfChargeAccountNo, yjfChargeBalance,
				supervisionAccNo, supervisionBalance);
		}
		if (testId >= 1004 && testId <= 1010 || testId >= 1012 && testId <= 1019 || testId == 1022
			|| testId == 1023 || testId == 1024 || testId >= 1030 && testId <= 1036
			|| testId == 1027) {
			InitAccountNoMoney(merchantAccountNo, merchantBalance, null, null, sellerAccountNo,
				sellerBalance, null, null, yjfChargeAccountNo, yjfChargeBalance, supervisionAccNo,
				supervisionBalance);
		}
		if (testId == 1002) {
			InitAccountNoMoney(merchantAccountNo, merchantBalance, buyerAccountNo, buyerBalance,
				sellerAccountNo, sellerBalance, payerAccountNo, payerBalance, yjfChargeAccountNo,
				yjfChargeBalance, supervisionAccNo, supervisionBalance);
		}
		//		识别规则
		if (testId != 1002) {
			strategy = null;
		}
		// 		准备入口、策略、行为、操作场景规则表数据 ---转出操作--用于识别卖家的账户
		insertMultiAccountSceneRule(1l, ruleStatus, inlet, strategy, "fast_pay", sellerOperation,
			sellerIndustry, sellerProduct, sellerChildProduct, sellerAccountType,
			sellerAccountProp, cardOutIn, null, null, sceneUserType, null, memo, getSysDate(),
			getSysDate(), sceneName);
		// 		准备入口、策略、行为、操作场景规则表数据 ---转入操作--用于识别买家的账户
		insertMultiAccountSceneRule(1l, ruleStatus, inlet, strategy, "fast_pay", buyerOperation,
			buyerIndustry, buyerProduct, buyerChildProduct, buyerAccountType, buyerAccountProp,
			cardOutIn, null, null, sceneUserType, null, memo, getSysDate(), getSysDate(), sceneName);
		// 准备入口、策略、行为、操作场景规则表数据 ---查询操作--用于识别商户的账户
		insertMultiAccountSceneRule(1l, ruleStatus, inlet, strategy, "fast_pay", merchantOperation,
			merchantIndustry, merchantProduct, merchantChildProduct, merchantAccountType,
			merchantAccountProp, cardOutIn, null, null, sceneUserType, null, memo, getSysDate(),
			getSysDate(), sceneName);
		//		准备入口、策略、行为、操作场景规则表数据 ---过渡转账操作--用于识别商户的账户
		insertMultiAccountSceneRule(1l, ruleStatus, inlet, strategy, "fast_pay", custodiaOperation,
			merchantIndustry, merchantProduct, merchantChildProduct, custodiaAccountType,
			merchantAccountProp, cardOutIn, null, null, sceneUserType, null, memo, getSysDate(),
			getSysDate(), sceneName);
		insertMultiAccountSceneRule(1l, ruleStatus, "09", strategy, behavior, "IN",
			merchantIndustry, merchantProduct, merchantChildProduct, custodiaAccountType,
			merchantAccountProp, cardOutIn, null, null, sceneUserType, null, memo, getSysDate(),
			getSysDate(), sceneName);
		if (testId == 1037) {
			insertMultiAccountSceneRule(1l, ruleStatus, "09", strategy, behavior, "OUT",
				merchantIndustry, merchantProduct, merchantChildProduct, custodiaAccountType,
				"test", cardOutIn, null, null, sceneUserType, null, memo, getSysDate(),
				getSysDate(), sceneName);

			insertMultiAccountSceneRule(1l, ruleStatus, "09", strategy, "bail_deposit_jg", "IN",
				merchantIndustry, merchantProduct, merchantChildProduct, custodiaAccountType,
				"test", cardOutIn, null, null, sceneUserType, accountTitleId, memo, getSysDate(),
				getSysDate(), sceneName);
		} else {
			insertMultiAccountSceneRule(1l, ruleStatus, "09", strategy, behavior, "OUT",
				merchantIndustry, merchantProduct, merchantChildProduct, merchantAccountType,
				merchantAccountProp, cardOutIn, null, null, sceneUserType, null, memo,
				getSysDate(), getSysDate(), sceneName);
		}

		//	创建交易
		if (testId == 1020 || testId == 1021 || testId == 1024 || testId == 1025 || testId == 1027
			|| testId == 1038 || testId == 1039 || testId == 1040 || testId == 1041
			|| testId == 1042 || testId == 1043) {
			//配置到卡权限
			insertCommandPayParam(partnerId, "0.3", "ON", "ON", operatorName, getSysDate(),
				getSysDate(), null, "0", null, null, "0", null);
		}
		String bizNo = null;
		if (testId == 1001 || testId >= 1005 && testId <= 1010 || testId == 1011 || testId >= 1013
			&& testId <= 1018 || testId == 1022) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, currency, tradeAmount, 0, null, null, null, null, null, null, null,
				null, null, dubboGroup, dubboVersion, null, "sellerMerchantId");
		}
		//创建到卖家卡的交易
		if (testId == 1038 || testId == 1039 || testId == 1041 || testId == 1042) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo, null,
				currency, tradeAmount, 0, null, null, null, null, null, null, null, null, null,
				dubboGroup, dubboVersion, pactNo, null);
		}
		if (testId == 1026 || testId == 1028 || testId >= 1031 && testId <= 1037) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, currency, tradeAmount, 0, buyerUserId, null, null, null, null, null,
				null, null, null, dubboGroup, dubboVersion, null, null);
		}
		if (testId == 1002) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, currency, tradeAmount, autoCloseDuration, buyerUserId, tradeName,
				getSysDate(), BankCodeEnum.BOC, rate, memo, strategy, behavior, chargeExtends,
				dubboGroup, dubboVersion, null, null);
		}
		if (testId == 1003) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, currency, tradeAmount, 0, null, null, null, null, null, null, null,
				null, chargeExtends, dubboGroup, dubboVersion, null, null);
		}
		if (testId == 1029) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, currency, tradeAmount, 0, buyerUserId, null, null, null, null, null,
				null, null, chargeExtends, dubboGroup, dubboVersion, null, null);
		}

		if (testId == 1004 || testId == 1012 || testId == 1019 || testId == 1023 || testId == 1030) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, currency, tradeAmount, autoCloseDuration, buyerUserId, null, null,
				null, null, null, null, null, null, dubboGroup, dubboVersion, null, null);
		}
		if (testId == 1020) {
			bizNo = fastPayCreateTradeShare(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				null, currency, tradeAmount, autoCloseDuration, buyerUserId, null, null, null,
				null, null, null, null, null, dubboGroup, dubboVersion, payeeUserId, null,
				shareAmount, null, sellerPactNo, null);
		}
		if (testId == 1021 || testId == 1025) {
			bizNo = fastPayCreateTradeShare(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, currency, tradeAmount, autoCloseDuration, buyerUserId, null, null,
				null, null, null, null, null, null, dubboGroup, dubboVersion, payeeUserId, null,
				shareAmount, null, null, shareMethod);
		}
		if (testId == 1024 || testId == 1027 || testId == 1040) {
			bizNo = commandPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, null, currency, tradeAmount, 0, buyerUserId, null, null, null, null,
				null, null, null, null, null, dubboGroup, dubboVersion, null);
		}
		if (testId == 1043) {
			bizNo = commandPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
					null, pactNo, currency, tradeAmount, 0, buyerUserId, null, null, null, null,
					null, null, null, null, null, dubboGroup, dubboVersion, null);
		}
		String mainTradeNo = null;
		if (testId >= 1026 && testId <= 1037 || testId == 1040) {
			return;//注释掉保证金相关用例
//			mainTradeNo = bailCreateMainTradeAndRecharge(gid, bizNo, merchOrderNo, partnerId, memo,
//				tradeName, buyerUserId, bailPayMoney);
//			assertNotNull(mainTradeNo);
		}
		sleepTime(2);

		Date timeoutDate = new Date(new Date().getTime() + autoCloseDuration * 60 * 1000);
		//测试过程
		//		微信公众号、微信扫码、微信app、民生非标网银、
		Map<String, String> extensionParams = new HashMap<>();
		if (testId == 1008 || testId == 1016 || testId == 1034) {
			extensionParams.put("openid", openid);//微信公众号支付，需要传入的信息
		}
		if (testId == 1009 || testId == 1017 || testId == 1035) {
			extensionParams.put("wxAppid", wxAppid);//微信APP支付，需要传入的信息
			extensionParams.put("deviceType", deviceType);//移动端操作系统类型;微信app支付必填，IOS/ANDROID
		}
		if (testId == 1010 || testId == 1018 || testId == 1022 || testId == 1036) {
			extensionParams.put("authCode", authCode);//条码支付
		}

		PayBankOrder payBankOrder = new PayBankOrder();
		payBankOrder.setPersonalCorporateType(personalCorporateType);
		payBankOrder.setCardType(cardType);
		payBankOrder.setBankCode(bankCode);
		if (testId == 1008 || testId == 1009 || testId == 1010 || testId == 1016 || testId == 1017
			|| testId == 1018 || testId == 1022 || testId == 1034 || testId == 1035
			|| testId == 1036) {
			payBankOrder.setExtensionParams(extensionParams);
		}

		//保证金order
		BailPayOrder bailPayOrder = new BailPayOrder();
		bailPayOrder.setBailNo(mainTradeNo);
		bailPayOrder.setBailPayAmount(tradeAmount.add(buyerFee));
		if (testId >= 1028 && testId <= 1036 || testId == 1040) {
			bailPayOrder.setBailPayAmount(confirmBailPayAmount);
		}

		//支付order
		SingleTradePayOrder order = new SingleTradePayOrder();
		order.setGid(payGid);
		order.setMerchOrderNo(payMerchOrderNo);
		order.setPartnerId(payPartnerId);
		order.setBizNo(bizNo);
		order.setPayMethod(payMethod);//支付方式选择
		order.setSource(querySource);//查询来源/支付来源
		//	以上为公共必填信息
		//	余额支付
		if (testId == 1001 || testId == 1002 || testId == 1020 || testId == 1026 || testId == 1028
			|| testId == 1037 || testId == 1038 || testId == 1040 || testId == 1041
			|| testId == 1042 || testId == 1043) {
			order.setPayerUserId(payerUserId);
		}
		//	签约代扣支付
		if (testId == 1003 || testId == 1011 || testId == 1029) {
			order.setPactNo(pactNo);
			order.setPayerUserId(payerUserId);
		}
		if (testId == 1004 || testId == 1012 || testId == 1021 || testId == 1025 || testId == 1030) {
			order.setPactNo(pactNo);
			order.setProtocolNo(protocolNo);
		}
		//		if (testId == 1004) {
		//			order.setProtocolNo(null);
		//			order.setPayerUserId(payerUserId);//由于过风控的时候，payerUserId有值就过了风控，但是由于该payerUserId没有资金账号导致报错的bug
		//		}
		//	联名卡、微信app、第三方控件和微信公众号支付
		if (testId >= 1005 && testId <= 1010 || testId >= 1013 && testId <= 1018 || testId == 1022
			|| testId >= 1031 && testId <= 1036 || testId == 1039) {
			order.setPayBankOrder(payBankOrder);
		}
		if (testId == 1019) {
			OfflinePayOrder offlinePayOrder = new OfflinePayOrder();
			offlinePayOrder.setBankAccountNo(bankAccountNo);
			offlinePayOrder.setBankCode(bankCode);
			offlinePayOrder.setCardType(cardType.code());
			offlinePayOrder.setDepositBussineeCode(depositBussineeCode);
			offlinePayOrder.setDepositVerifyCode(depositVerifyCode);
			offlinePayOrder.setYjfBankAccountNo(yjfAccountNo);
			order.setOfflinePayOrder(offlinePayOrder);
		}
		//不必填项信息
		if (testId != 1001 && testId != 1038 && testId != 1039 && testId != 1041 && testId != 1042 &&testId != 1043) {
			order.setMacAddress(macAddress);
			order.setUserEndIp(userEndIp);
			order.setUserTerminalType(userTerminalType);
			order.setCertInstalled(certInstalled);
		}
		if (testId >= 1026 && testId <= 1037 || testId == 1040) {
			order.setBailPayOrder(bailPayOrder);
		}

		//风控参数配置
		//		order.setUserTerminalType(UserTeminalTypeEnum.PC);
		//		String machineInfo = "machineInfo";
		//		if (order.getUserTerminalType().code().equals("01")) {
		//			machineInfo = "machineInfo_PC";
		//		}else {
		//			machineInfo = "machineInfo_Mobile";
		//		}
		//		order.setMachineInfo(machineInfo);

		//调接口
		SingleTradePayResult result = tradePaymentService.singleTradePay(order);
		//数据校验
		assertResult(testId, status, code, result);

		//	result返回校验
		String payBizNo = null;
		String batchNo = null;
		String depositNo = null;
		String dataTolBizNo = null;
		//对于代扣处理中和失败不反悔付款信息，对于网银充值和成功返回
		assertEquals(bizNo, result.getTradePaymentInfo().getBizNo());
		assertEquals(buyerFee, result.getTradePaymentInfo().getBuyerFee());
		assertEquals(payAmount, result.getTradePaymentInfo().getPayAmount());
		assertNotNull(result.getTradePaymentInfo().getPayBizNo());
		assertEquals(payStatus, result.getTradePaymentInfo().getPayStatus());
		payBizNo = result.getTradePaymentInfo().getPayBizNo();
		batchNo = result.getTradePaymentInfo().getBatchNo();
		if (testId >= 1005 && testId <= 1009 || testId >= 1013 && testId <= 1017 || testId >= 1031
			&& testId <= 1035 || testId == 1039) {
			//			assertEquals(forwardUrl, result.getForwardUrl());
			assertNotNull(result.getForwardUrl());
		} else {
			assertNull(result.getForwardUrl());
		}
		if (testId == 1001 || testId == 1002 || testId == 1020 || testId == 1023 || testId == 1024
			|| testId == 1026 || testId == 1028 || testId == 1027 || testId == 1037
			|| testId == 1038 || testId == 1040 || testId == 1041 || testId == 1042 || testId == 1043) {
			assertNull(result.getTradePaymentInfo().getDepositNo());
		} else {
			assertNotNull(result.getTradePaymentInfo().getDepositNo());
		}
		depositNo = result.getTradePaymentInfo().getDepositNo();

		//	数据库数据校验
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		if (testId == 1001) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, null, null, payMode, null, null, shareAmount,
				null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, null, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId,
				payerCardNo, payerAccountNo, supervisionAccNo, payMethod.code(), null, null, null,
				null, null, null, null, payerRealName, payCertNo, payCertType, null, null,
				userTerminalType.code(), payStatus, null, null, null, shareAmount, bailPayMoney, new Money());
			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			dataTolBizNo = assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());
			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTol(1, bizNo, payerUserId, payerTradeUerType, payerCardNo, payerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, payerUserId,
				payerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccount(payerAccountNo,
				payerBalance.subtract(tradeAmount).subtract(buyerFee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				tradeAmount);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

		}
		if (testId == 1026 || testId == 1037) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo, sellerUserId,
				sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount, currency.code(),
				foreignAmount, null, null, hasRefund, null, null, null, buyerRealName, null,
				payMode, null, null, shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, null, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), null, null, null, null, null, null, null, null,
				null, null, userEndIp, macAddress, userTerminalType.code(), payStatus, null, null,
				null, shareAmount, tradeAmount.add(buyerFee), new Money());
			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			dataTolBizNo = assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());
			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTol(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, buyerUserId,
				buyerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			if (testId == 1037) {
				assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
				assertAcctransAccount(merchantAccountNo, merchantBalance);
				assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
				assertAcctransAccount(payerAccountNo, payerBalance);
				assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
					tradeAmount.add(buyerFee));
				assertAcctransAccountHistory(
					findCustomerAccountByAccountPropertyAndAccountTypeCa("test", "CUSTODIA_ACCOUNT")
						.getAccountNo(), bailPayMoney.subtract(tradeAmount.add(buyerFee)),
					merchantBalance, tradeAmount.add(buyerFee));
			} else {
				assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
				assertAcctransAccount(merchantAccountNo,
					bailPayMoney.subtract(tradeAmount.add(buyerFee)));
				assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
				assertAcctransAccount(payerAccountNo, payerBalance);
				assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
					tradeAmount.add(buyerFee));
			}

			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

		}
		if (testId == 1028) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo, sellerUserId,
				sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount, currency.code(),
				foreignAmount, null, null, hasRefund, null, null, null, buyerRealName, null,
				payMode, null, null, shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, null, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId,
				payerCardNo, payerAccountNo, supervisionAccNo, payMethod.code(), null, null, null,
				null, null, null, null, payerRealName, payCertNo, payCertType, userEndIp,
				macAddress, userTerminalType.code(), payStatus, null, null, null, shareAmount,
				confirmBailPayAmount, new Money());
			//	数据中心同步数据校验
			assertEquals(4, findDataTolByOutBizNo(bizNo).size());
			dataTolBizNo = assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());
			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTol(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, buyerUserId,
				buyerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());
			assertdataTol(1, bizNo, payerUserId, payerTradeUerType, payerCardNo, payerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, payerUserId,
				payerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccount(payerAccountNo,
				payerBalance.subtract(tradeAmount.subtract(confirmBailPayAmount).add(buyerFee)));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				tradeAmount);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

		}
		if (testId == 1002) {
			//	根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据

			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, memo,
				autoCloseDuration, tradeName, buyerUserId, buyerCardNo, buyerAccountNo,
				sellerUserId, sellerCardNo, sellerAccountNo, sellerRealName,
				tradeAmount.multiply(0.0555), CurrencyEnum.CNY.code(), tradeAmount,
				currency.code(), rate, hasRefund, null, null, null, buyerRealName, null, payMode,
				null, null, shareAmount, null, null);
			//			据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, null, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId,
				payerCardNo, payerAccountNo, supervisionAccNo, payMethod.code(), null, null, null,
				null, null, null, null, payerRealName, payCertNo, payCertType, userEndIp,
				macAddress, userTerminalType.code(), payStatus, memo, null, null, shareAmount,
				bailPayMoney, new Money());
			//	数据中心同步数据校验
			assertEquals(4, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount.multiply(0.0555), CurrencyEnum.CNY.code(),
				null, null, sellerUserId, sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0)
					.getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount.multiply(0.0555),
				CurrencyEnum.CNY.code(), null, null, null, null, queryTradePayInfoByBizNo(bizNo)
					.get(0).getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount.multiply(0.0555), CurrencyEnum.CNY.code(),
				null, null, buyerUserId, buyerRealName, queryTradePayInfoByBizNo(bizNo).get(0)
					.getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTol(1, bizNo, payerUserId, payerTradeUerType, payerCardNo, payerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount.multiply(0.0555), CurrencyEnum.CNY.code(),
				null, null, payerUserId, payerRealName, queryTradePayInfoByBizNo(bizNo).get(0)
					.getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount.multiply(0.0555)));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccount(payerAccountNo,
				payerBalance.subtract(tradeAmount.multiply(0.0555)).subtract(buyerFee));
			assertAcctransAccount(buyerAccountNo, buyerBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				tradeAmount.multiply(0.0555));
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);
		}
		if (testId == 1003) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, null, null, payMode, null, null, shareAmount,
				null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId, null,
				null, supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, null, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, userEndIp, macAddress, userTerminalType.code(), payStatus, null, null,
				null, shareAmount, bailPayMoney, new Money());

			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), sellerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), sellerFee,
				getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount).subtract(fee));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(fee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, payAmount, payAmount);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);
		}
		if (testId == 1029) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo, sellerUserId,
				sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount, currency.code(),
				foreignAmount, null, null, hasRefund, null, null, null, buyerRealName, null,
				payMode, null, null, shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId, null,
				null, supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, null, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, userEndIp, macAddress, userTerminalType.code(), payStatus, null, null,
				null, shareAmount, confirmBailPayAmount, new Money());

			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), sellerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), sellerFee,
				getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount).subtract(fee));
			assertAcctransAccount(merchantAccountNo,
				merchantBalance.add(bailPayMoney).subtract(confirmBailPayAmount));
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(fee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance,
				tradeAmount.subtract(confirmBailPayAmount), tradeAmount);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);
		}
		if (testId == 1030) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo, sellerUserId,
				sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount, currency.code(),
				foreignAmount, null, null, hasRefund, null, null, null, buyerRealName, null,
				payMode, null, null, shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, protocolNo, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, userEndIp, macAddress, userTerminalType.code(), payStatus, null, null,
				null, shareAmount, confirmBailPayAmount, new Money());

			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTolTwo(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, bankAccountNo,
				buyerUserId, buyerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			sleepTime(3);
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo,
				merchantBalance.add(bailPayMoney).subtract(confirmBailPayAmount));
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance,
				tradeAmount.add(buyerFee).subtract(confirmBailPayAmount), tradeAmount.add(buyerFee));
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);
		}
		if (testId == 1004) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, buyerRealName, null, payMode, null, null,
				shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, protocolNo, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, userEndIp, macAddress, userTerminalType.code(), payStatus, null, null,
				null, shareAmount, bailPayMoney, new Money());

			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, payAmount, payAmount);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);
		}
		if (testId == 1019) {
			//			根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo, sellerUserId,
				sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount, currency.code(),
				foreignAmount, null, null, hasRefund, null, null, null, buyerRealName, null,
				payMode, null, null, shareAmount, null, null);

			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, null, cardType.code(), null, null,
				null, bankAccountNo, null, null, null, userEndIp, macAddress,
				userTerminalType.code(), payStatus, null, null, null, shareAmount, bailPayMoney, new Money());
			//			数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, null, null, getSysDate(), getSysDate(), null);

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, null, null, getSysDate(), getSysDate(), null);

			assertdataTolTwo(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, bankAccountNo,
				buyerUserId, buyerRealName, null, null, getSysDate(), getSysDate(), null);

			//			资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				merchantBalance);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(1, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

			//			模拟清算回执通知-------------------------------------------------------通知后校验
			interchangeNotify(gid, merchOrderNo, partnerId, currency, depositNo, settleCode,
				settleStatus, payAmount, accBankAccountNo, accBankCode, null);
			//			根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatusEnd.code(), inlet, nationalType,
				null, autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo,
				sellerUserId, sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount,
				currency.code(), foreignAmount, null, null, hasRefund, null, null, null,
				buyerRealName, null, payMode, null, null, shareAmount, null, null);

			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, null, cardType.code(), null, null,
				null, bankAccountNo, null, null, null, userEndIp, macAddress,
				userTerminalType.code(), payStatusEnd, null, null, null, shareAmount, bailPayMoney, new Money());
			//			数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusEnd.code(), gid, tradeAmount, currency.code(), null, null,
				sellerUserId, sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd, productCode,
				productCode, null, productStatusEnd.code(), gid, tradeAmount, currency.code(),
				null, null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());

			assertdataTolTwo(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusEnd.code(), gid, tradeAmount, currency.code(), null, bankAccountNo,
				buyerUserId, buyerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());
			//			资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, payAmount, payAmount);

			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatusEnd, timeoutTradeStatus.code(),
				timeoutAction, timeoutDate, null, null);
		}
		//1010、1018调到45.33上的mock
		if (testId >= 1005 && testId <= 1010 || testId >= 1015 && testId <= 1018 || testId == 1022) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, null, null, payMode, null, null, shareAmount,
				null, null);

			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, null, null, null, null, null, null, userEndIp, macAddress,
				userTerminalType.code(), payStatus, null, null, null, shareAmount, bailPayMoney, new Money());

			//	数据中心同步数据校验
			sleepTime(4);
			assertEquals(2, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, null, null, getSysDate(), getSysDate(), null);

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, null, null, getSysDate(), getSysDate(), null);

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				merchantBalance);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(1, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

			//		模拟清算回执通知-------------------------------------------------------通知后校验
			interchangeNotify(gid, merchOrderNo, partnerId, currency, depositNo, settleCode,
				settleStatus, payAmount, accBankAccountNo, accBankCode, null);
			sleepTime(8);
			//			根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatusEnd.code(), inlet, nationalType,
				null, autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, null, null, payMode, null, null, shareAmount,
				null, null);

			//	据bizNo查询校验trade_pay_info表数据
			if (testId >= 1015 && testId <= 1018) {
				assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
					querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null,
					null, supervisionAccNo, payMethod.code(), bankCode,
					personalCorporateType.code(), cardType.code(), null, null, null, null, null,
					null, null, userEndIp, macAddress, userTerminalType.code(), payStatusEnd,
					payInfoMemo, null, null, shareAmount, bailPayMoney, new Money());

				//				数据中心同步数据校验
				assertEquals(2, findDataTolByOutBizNo(bizNo).size());
				assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
					sellerAccountNo, sellerAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd,
					productCode, productCode, null, productStatusEnd.code(), gid, tradeAmount,
					currency.code(), null, null, sellerUserId, sellerRealName, null, null,
					getSysDate(), getSysDate(), null);

				assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId
																						+ "_v",
					merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd,
					productCode, productCode, null, productStatusEnd.code(), gid, tradeAmount,
					currency.code(), null, null, null, null, null, null, getSysDate(),
					getSysDate(), null);

				//	资金校验
				assertAcctransAccount(sellerAccountNo, sellerBalance);
				assertAcctransAccount(merchantAccountNo, merchantBalance);
				assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance);
				assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
					merchantBalance);

				//				根据bizNo查询校验fast_pay_timeouts表数据
				assertFastPayTimeouts(1, bizNo, tradeStatusEnd, timeoutTradeStatus.code(),
					timeoutAction, timeoutDate, null, null);

			} else {
				assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
					querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null,
					null, supervisionAccNo, payMethod.code(), bankCode,
					personalCorporateType.code(), cardType.code(), null, null, null, null, null,
					null, null, userEndIp, macAddress, userTerminalType.code(), payStatusEnd, null,
					null, null, shareAmount, bailPayMoney, new Money());
				//	数据中心同步数据校验
				sleepTime(5);
				assertEquals(2, findDataTolByOutBizNo(bizNo).size());
				assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
					sellerAccountNo, sellerAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd,
					productCode, productCode, null, productStatusEnd.code(), gid, tradeAmount,
					currency.code(), null, null, sellerUserId, sellerRealName,
					queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee, getSysDate(),
					getSysDate(), getSysDate());

				assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId
																						+ "_v",
					merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd,
					productCode, productCode, null, productStatusEnd.code(), gid, tradeAmount,
					currency.code(), null, null, null, null, queryTradePayInfoByBizNo(bizNo).get(0)
						.getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

				//	资金校验
				assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
				assertAcctransAccount(merchantAccountNo, merchantBalance);
				assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
				assertAcctransAccountHistory(supervisionAccNo, merchantBalance, payAmount,
					payAmount);
				//				根据bizNo查询校验fast_pay_timeouts表数据
				assertFastPayTimeouts(0, bizNo, tradeStatusEnd, timeoutTradeStatus.code(),
					timeoutAction, timeoutDate, null, null);
			}

		}
		if (testId == 1011) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, null, null, payMode, null, null, shareAmount,
				null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId, null,
				null, supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, null, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, userEndIp, macAddress, userTerminalType.code(), payStatus, null, null,
				null, shareAmount, bailPayMoney, new Money());
			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, null, null, getSysDate(), getSysDate(), null);

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, null, null, getSysDate(), getSysDate(), null);
			//			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			//			assertdataTol(1, bizNo, payerUserId, payerTradeUerType, payerUserId + "_v", payerUserId
			//																						+ "_v",
			//				noneAccountType, merchantUserId, partnerId, merchantAccountNo, merchantAccountType,
			//				merchOrderNo, dataStatus, productCode, productCode, null, productStatus.code(),
			//				gid, tradeAmount, currency.code(), null, null, null, payerRealName, null, null,
			//				getSysDate(), getSysDate(), null);

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				merchantBalance);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(1, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

			//			模拟清算回执通知-------------------------------------------------------通知后校验
			interchangeNotify(gid, merchOrderNo, partnerId, currency, depositNo, settleCode,
				settleStatus, payAmount, accBankAccountNo, accBankCode, null);
			sleepTime(7);
			//			根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatusEnd.code(), inlet, nationalType,
				null, autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, null, null, payMode, null, null, shareAmount,
				null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId, null,
				null, supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, null, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, userEndIp, macAddress, userTerminalType.code(), payStatusEnd, null,
				null, null, shareAmount, bailPayMoney, new Money());
			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusEnd.code(), gid, tradeAmount, currency.code(), null, null,
				sellerUserId, sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd, productCode,
				productCode, null, productStatusEnd.code(), gid, tradeAmount, currency.code(),
				null, null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, payAmount, payAmount);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatusEnd, timeoutTradeStatus.code(),
				timeoutAction, timeoutDate, null, null);

		}
		if (testId == 1012) {
			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, buyerRealName, null, payMode, null, null,
				shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, protocolNo, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, userEndIp, macAddress, userTerminalType.code(), payStatus, null, null,
				null, shareAmount, bailPayMoney, new Money());

			//	数据中心同步数据校验
			sleepTime(5);
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, null, null, getSysDate(), getSysDate(), null);

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, null, null, getSysDate(), getSysDate(), null);

			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTolTwo(1, bizNo, buyerUserId, buyerTradeUerType, buyerUserId + "_v",
				buyerUserId + "_v", noneAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, bankAccountNo,
				buyerUserId, buyerRealName, null, null, getSysDate(), getSysDate(), null);

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				merchantBalance);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(1, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

			//	模拟清算回执通知-------------------------------------------------------通知后校验
			interchangeNotify(gid, merchOrderNo, partnerId, currency, depositNo, settleCode,
				settleStatus, payAmount, accBankAccountNo, accBankCode, null);

			//			根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatusEnd.code(), inlet, nationalType,
				null, autoCloseDuration, null, buyerUserId, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, buyerRealName, null, payMode, null, null,
				shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, protocolNo, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, userEndIp, macAddress, userTerminalType.code(), payStatusEnd,
				payInfoMemo, null, null, shareAmount, bailPayMoney, new Money());

			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusEnd.code(), gid, tradeAmount, currency.code(), null, null,
				sellerUserId, sellerRealName, null, null, getSysDate(), getSysDate(), null);

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd, productCode,
				productCode, null, productStatusEnd.code(), gid, tradeAmount, currency.code(),
				null, null, null, null, null, null, getSysDate(), getSysDate(), null);

			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTolTwo(1, bizNo, buyerUserId, buyerTradeUerType, buyerUserId + "_v",
				buyerUserId + "_v", noneAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusEnd.code(), gid, tradeAmount, currency.code(), null, bankAccountNo,
				buyerUserId, buyerRealName, null, null, getSysDate(), getSysDate(), null);

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				merchantBalance);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(1, bizNo, tradeStatusEnd, timeoutTradeStatus.code(),
				timeoutAction, timeoutDate, null, null);

			//失败后第二次调用付款服务---------------------------------------------------------------〉
			SingleTradePayResult singleTradePayResult = fastPayTradePay(payGidTwo,
				payMerchOrderNoTwo, payPartnerIdTwo, bizNo, payMethodTwo, querySourceTwo, null,
				pactNo, protocolNo, null, null, null, null, null, null, null);

			//数据校验
			assertResult(testId, statusTwo, code, singleTradePayResult);
			//	result返回校验
			assertEquals(bizNo, singleTradePayResult.getTradePaymentInfo().getBizNo());
			assertEquals(buyerFeeTwo, singleTradePayResult.getTradePaymentInfo().getBuyerFee());
			payAmount = tradeAmount.add(buyerFeeTwo);
			assertEquals(payAmount, singleTradePayResult.getTradePaymentInfo().getPayAmount());
			assertNull(singleTradePayResult.getForwardUrl());
			depositNo = singleTradePayResult.getTradePaymentInfo().getDepositNo();
			payBizNo = singleTradePayResult.getTradePaymentInfo().getPayBizNo();
			batchNo = singleTradePayResult.getTradePaymentInfo().getBatchNo();
			//	数据库数据校验
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			//	根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, buyerRealName, null, payMode, null, null,
				shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(2, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, protocolNo, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, null, null, userTerminalType.code(), payStatus, null, null, null,
				shareAmount, bailPayMoney, new Money());
			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, null, null, getSysDate(), getSysDate(), null);

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, null, null, getSysDate(), getSysDate(), null);

			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTolTwo(1, bizNo, buyerUserId, buyerTradeUerType, buyerUserId + "_v",
				buyerUserId + "_v", noneAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, bankAccountNo,
				buyerUserId, buyerRealName, null, null, getSysDate(), getSysDate(), null);
			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				merchantBalance);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(1, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

			//			模拟清算回执通知-------------------------------------------------------通知后校验
			interchangeNotify(gid, merchOrderNo, partnerId, currency, depositNo, settleCode,
				settleStatusTwo, payAmount, accBankAccountNo, accBankCode, null);
			sleepTime(8);
			//			根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatusEndTwo.code(), inlet, nationalType,
				null, autoCloseDuration, null, buyerUserId, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, buyerRealName, null, payMode, null, null,
				shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(2, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, protocolNo, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, null, null, userTerminalType.code(), payStatusEndTwo, null, null,
				null, shareAmount, bailPayMoney, new Money());

			//	数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEndTwo, productCode, productCode,
				null, productStatusEndTwo.code(), gid, tradeAmount, currency.code(), null, null,
				sellerUserId, sellerRealName, queryTradePayInfoByPayBizNo(payBizNo).get(0)
					.getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEndTwo,
				productCode, productCode, null, productStatusEndTwo.code(), gid, tradeAmount,
				currency.code(), null, null, null, null,
				queryTradePayInfoByPayBizNo(payBizNo).get(0).getChargeNo(), buyerFee, getSysDate(),
				getSysDate(), getSysDate());
			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略

			assertdataTolTwo(1, bizNo, buyerUserId, buyerTradeUerType, buyerUserId + "_v",
				buyerUserId + "_v", noneAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEndTwo, productCode, productCode,
				null, productStatusEndTwo.code(), gid, tradeAmount, currency.code(), null,
				bankAccountNo, buyerUserId, buyerRealName, queryTradePayInfoByPayBizNo(payBizNo)
					.get(0).getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, payAmount, payAmount);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatusEndTwo, timeoutTradeStatus.code(),
				timeoutAction, timeoutDate, null, null);

		}
		if (testId == 1020) {
			//--------------调提现推进接口
			//修改清算回推状态
			findAndUpdatePayWithdrawInstructionSetStatusByAccountNO(
				DepositStatusEnum.SUBMIT_SETTLED.getCode(), supervisionAccNo);
			//调推进接口
			WithdrawAdvanceOrder order1 = new WithdrawAdvanceOrder();
			order1.setSettleBizNo(OID.newID());
			order1.setWithdrawId(findPayWithdrawInstructionByAccountNO(supervisionAccNo)
				.getWithdrawId());
			order1.setAmount(tradeAmount.subtract(shareAmount));
			order1.setStatus(PaySettleResultEnum.PAY_BANK_SUCCESS);
			order1.setSettleIdentity("interchange");
			order1.setSettleCode(settleCode);
			order1.setSettleDate(getSysDate());
			order1.setSettleReason("清算原因描述");
			order1.setGid(TEST_GID_true);
			order1.setPartnerId(partnerId);
			order1.setMerchOrderNo(merchOrderNo);
			order1.setSettleChannelApi("123");
			order1.setAccBankAccountNo("123");
			order1.setAccBankCode("123");
			OperationContext operationContext = new OperationContext();
			withdrawAdvanceService.advanceWithdraw(order1, operationContext);
		}
		if (testId == 1020) {
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatusTwo.code(), inlet, nationalType,
				null, autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo, null,
				null, null, "非易极付", tradeAmount, currency.code(), foreignAmount, null, null,
				hasRefund, null, null, null, buyerRealName, null, payMode, null,
				sellerBankAccountNo, shareAmount, sellerPactNo, null);

			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId,
				payerCardNo, payerAccountNo, supervisionAccNo, payMethod.code(), null, null, null,
				null, null, null, null, payerRealName, payCertNo, payCertType, userEndIp,
				macAddress, userTerminalType.code(), payStatus, null, null, null, shareAmount,
				bailPayMoney, new Money());
			//分润
			assertFastPayShareProfit(1, bizNo, merchantUserId, merchantUserId, supervisionAccNo,
				payeeUserId, payeeUserId, payeeUserId, shareAmount, new Money(0), currency.code(),
				payStatus, null);
			//			数据中心同步数据校验
			sleepTime(3);
			assertEquals(4, findDataTolByOutBizNo(bizNo).size());
			//卖家
			assertdataTolTwo(1, bizNo, null, sellerTradeUerType, null, null, null, merchantUserId,
				partnerId, merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd,
				productCode, productCode, null, productStatusTwo.code(), gid, tradeAmount,
				currency.code(), null, sellerBankAccountNo, null, null,
				queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee, getSysDate(),
				getSysDate(), getSysDate());
			//买家
			assertdataTol(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusTwo.code(), gid, tradeAmount, currency.code(), null, null,
				buyerUserId, buyerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());
			//付款方
			assertdataTol(1, bizNo, payerUserId, payerTradeUerType, payerCardNo, payerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusTwo.code(), gid, tradeAmount, currency.code(), null, null,
				payerUserId, payerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());
			//平台商
			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());
			//			资金校验
			sleepTime(3);
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance.add(shareAmount));
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccount(payerAccountNo,
				payerBalance.subtract(tradeAmount).subtract(buyerFee));
		}
		if (testId == 1021 || testId == 1025) {
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatusTwo.code(), inlet, nationalType,
				null, autoCloseDuration, null, buyerUserId, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, buyerRealName, null, payMode, null, null,
				shareAmount, null, null);

			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, protocolNo, pactNo, bankAccountNo, payerRealName, payCertNo,
				payCertType, userEndIp, macAddress, userTerminalType.code(), payStatus, null, null,
				null, shareAmount, bailPayMoney, new Money());
			//分润
			if (testId == 1025) {
				assertFastPayShareProfit(1, bizNo, sellerUserId, sellerAccountNo, sellerCardNo,
					payeeUserId, payeeUserId, payeeUserId, shareAmount, new Money(0),
					currency.code(), payStatus, null);
			} else {
				assertFastPayShareProfit(1, bizNo, merchantUserId, partnerId, supervisionAccNo,
					payeeUserId, payeeUserId, payeeUserId, shareAmount, new Money(0),
					currency.code(), payStatus, null);
			}

			//			数据中心同步数据校验
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			//卖家
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusTwo.code(), gid, tradeAmount, currency.code(), null, null,
				sellerUserId, sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());
			//买家
			assertdataTolTwo(1, bizNo, buyerUserId, buyerTradeUerType, buyerUserId + "_v",
				buyerUserId + "_v", noneAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusTwo.code(), gid, tradeAmount, currency.code(), null, bankAccountNo,
				buyerUserId, buyerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				buyerFee, getSysDate(), getSysDate(), getSysDate());
			//平台商
			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			//			资金校验
			sleepTime(3);
			assertAcctransAccount(sellerAccountNo,
				sellerBalance.add(tradeAmount).subtract(shareAmount));
			assertAcctransAccount(merchantAccountNo, merchantBalance.add(shareAmount));
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
		}
		if (testId == 1023 || testId == 1024) {
			if (testId == 1024) {
				ConfirmPayOrder order1 = new ConfirmPayOrder();
				order1.setBizNo(bizNo);
				order1.setGid(TEST_GID_true);
				order1.setMerchOrderNo(payMerchOrderNo);
				order1.setPartnerId(payPartnerId);
				//调接口
				commandPayProductService.confirmPay(order1);
			}

			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo, sellerUserId,
				sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount, currency.code(),
				foreignAmount, null, null, hasRefund, null, null, null, buyerRealName, null,
				payMode, null, null, shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, null, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), null, null, null, null, null, null, null, null,
				null, null, userEndIp, macAddress, userTerminalType.code(), payStatusEnd, null,
				null, null, shareAmount, bailPayMoney, new Money());
			//	数据中心同步数据校验
			sleepTime(3);
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			dataTolBizNo = assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());
			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTol(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null,
				buyerAccountNo, buyerRealName,
				queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee, getSysDate(),
				getSysDate(), getSysDate());

			//	资金校验
			sleepTime(2);
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				payAmount);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

		}
		if (testId == 1027) {
			ConfirmPayOrder order1 = new ConfirmPayOrder();
			order1.setBizNo(bizNo);
			order1.setGid(TEST_GID_true);
			order1.setMerchOrderNo(payMerchOrderNo);
			order1.setPartnerId(payPartnerId);
			//调接口
			commandPayProductService.confirmPay(order1);

			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo, sellerUserId,
				sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount, currency.code(),
				foreignAmount, null, null, hasRefund, null, null, null, buyerRealName, null,
				payMode, null, null, shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, null, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), null, null, null, null, null, null, null, null,
				null, null, userEndIp, macAddress, userTerminalType.code(), payStatusEnd, null,
				null, null, shareAmount, tradeAmount.add(buyerFee), new Money());
			//	数据中心同步数据校验
			sleepTime(3);
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			dataTolBizNo = assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());
			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTol(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null,
				buyerAccountNo, buyerRealName,
				queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee, getSysDate(),
				getSysDate(), getSysDate());

			//	资金校验
			sleepTime(2);
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo,
				bailPayMoney.subtract(tradeAmount.add(buyerFee)));
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				tradeAmount.add(buyerFee));
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

		}
		if (testId == 1040) {
			ConfirmPayOrder order1 = new ConfirmPayOrder();
			order1.setBizNo(bizNo);
			order1.setGid(TEST_GID_true);
			order1.setMerchOrderNo(payMerchOrderNo);
			order1.setPartnerId(payPartnerId);
			//调接口
			commandPayProductService.confirmPay(order1);

			//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, buyerUserId, buyerCardNo, buyerAccountNo, sellerUserId,
				sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount, currency.code(),
				foreignAmount, null, null, hasRefund, null, null, null, buyerRealName, null,
				payMode, null, null, shareAmount, null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, payBizNo, batchNo, null, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId,
				payerAccountNo, payerCardNo, supervisionAccNo, payMethod.code(), null, null, null,
				null, null, null, null, payerRealName, payCertNo, payCertType, userEndIp,
				macAddress, userTerminalType.code(), payStatusEnd, null, null, null, shareAmount,
				confirmBailPayAmount, new Money());
			//	数据中心同步数据校验
			sleepTime(3);
			assertEquals(4, findDataTolByOutBizNo(bizNo).size());
			dataTolBizNo = assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee,
				getSysDate(), getSysDate(), getSysDate());
			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTol(1, bizNo, buyerUserId, buyerTradeUerType, buyerCardNo, buyerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null,
				buyerAccountNo, buyerRealName,
				queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee, getSysDate(),
				getSysDate(), getSysDate());
			assertdataTol(1, bizNo, payerUserId, payerTradeUerType, payerCardNo, payerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusTwo.code(), gid, tradeAmount, currency.code(), null, null,
				payerUserId, payerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				fee, getSysDate(), getSysDate(), getSysDate());

			//	资金校验
			sleepTime(2);
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo, bailPayMoney.subtract(confirmBailPayAmount));
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				tradeAmount);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);

		}
		if (testId == 1043) {
			ConfirmPayOrder order1 = new ConfirmPayOrder();
			order1.setBizNo(bizNo);
			order1.setGid(TEST_GID_true);
			order1.setMerchOrderNo(payMerchOrderNo);
			order1.setPartnerId(payPartnerId);
			//调接口
			SingleTradePayResult payResult = commandPayProductService.confirmPay(order1);
			sleepTime(5);
			payResult = commandPayProductService.confirmPay(order1);
			assertResult(testId, Status.FAIL, "S059_00_0009", payResult);
			assertEquals("订单号为"+bizNo + "的交易确认打款处理中", payResult.getDescription());
			sleepTime(3);
		}
		if (testId == 1039) {
			//			模拟清算回执通知-------------------------------------------------------通知后校验
			interchangeNotify(gid, merchOrderNo, partnerId, currency, depositNo, settleCode,
				settleStatus, payAmount, accBankAccountNo, accBankCode, null);
			sleepTime(3);

		}
		if (testId == 1038 || testId == 1039 || testId == 1041 || testId == 1042) {
			//--------------调提现推进接口
			//修改清算回推状态
			findAndUpdatePayWithdrawInstructionSetStatusByAccountNO(
				DepositStatusEnum.SUBMIT_SETTLED.getCode(), supervisionAccNo);
			//调推进接口
			WithdrawAdvanceOrder order1 = new WithdrawAdvanceOrder();
			order1.setSettleBizNo(OID.newID());
			order1.setWithdrawId(findPayWithdrawInstructionByAccountNO(supervisionAccNo)
				.getWithdrawId());
			order1.setAmount(tradeAmount.subtract(sellerFee));
			order1.setStatus(PaySettleResultEnum.PAY_BANK_SUCCESS);
			order1.setSettleIdentity("interchange");
			order1.setSettleCode(settleCode);
			order1.setSettleDate(getSysDate());
			order1.setSettleReason("清算原因描述");
			order1.setGid(TEST_GID_true);
			order1.setPartnerId(partnerId);
			order1.setMerchOrderNo(merchOrderNo);
			order1.setAccBankAccountNo(bankAccountNo);
			order1.setAccBankCode("accBankCode");
			order1.setSettleChannelApi("settleChannelApi");
			OperationContext operationContext = new OperationContext();
			withdrawAdvanceService.advanceWithdraw(order1, operationContext);
		}
		if (testId == 1038 || testId == 1041 || testId == 1042) {
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatusTwo.code(), inlet, nationalType,
				null, autoCloseDuration, null, null, null, null, sellerUserId, null, null,
				sellerRealName, tradeAmount, currency.code(), foreignAmount, null, null, hasRefund,
				null, null, null, null, null, payMode, null, sellerBankAccountNo, new Money(),
				pactNo, null);

			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId,
				payerCardNo, payerAccountNo, supervisionAccNo, payMethod.code(), null, null, null,
				null, null, null, null, payerRealName, payCertNo, payCertType, null, null,
				userTerminalType.code(), payStatus, null, null, null, new Money(), new Money(), new Money());
			//			数据中心同步数据校验
			sleepTime(4);
			assertEquals(3, findDataTolByOutBizNo(bizNo).size());
			//卖家
			assertdataTolTwo(1, bizNo, sellerUserId, sellerTradeUerType, sellerUserId + "_v",
				sellerUserId + "_v", null, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusTwo.code(), gid, tradeAmount, currency.code(), null,
				sellerBankAccountNo, null, sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0)
					.getChargeNo(), fee, getSysDate(), getSysDate(), getSysDate());
			//付款方
			assertdataTol(1, bizNo, payerUserId, payerTradeUerType, payerCardNo, payerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusTwo.code(), gid, tradeAmount, currency.code(), null, null,
				payerUserId, payerRealName, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
				fee, getSysDate(), getSysDate(), getSysDate());
			//平台商
			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatusTwo.code(), gid, tradeAmount, currency.code(),
				null, null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), fee,
				getSysDate(), getSysDate(), getSysDate());
			//			资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccount(payerAccountNo,
				payerBalance.subtract(tradeAmount).subtract(buyerFee));
		}
		if (testId == 1039) {
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatusTwo.code(), inlet, nationalType,
				null, autoCloseDuration, null, null, null, null, sellerUserId, null, null,
				sellerRealName, tradeAmount, currency.code(), foreignAmount, null, null, hasRefund,
				null, null, null, null, null, payMode, null, sellerBankAccountNo, new Money(),
				pactNo, null);

			assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, depositAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, null, null, null, null, null, null, null, null,
				userTerminalType.code(), payStatusEnd, null, null, null, new Money(), new Money(), new Money());
			//			数据中心同步数据校验
			sleepTime(3);
			assertEquals(2, findDataTolByOutBizNo(bizNo).size());
			//卖家
			assertdataTolTwo(1, bizNo, sellerUserId, sellerTradeUerType, sellerUserId + "_v",
				sellerUserId + "_v", null, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatusEnd, productCode, productCode, null,
				productStatusTwo.code(), gid, tradeAmount, currency.code(), null,
				sellerBankAccountNo, null, sellerRealName, queryTradePayInfoByBizNo(bizNo).get(0)
					.getChargeNo(), fee, getSysDate(), getSysDate(), getSysDate());

			//平台商
			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatusTwo.code(), gid, tradeAmount, currency.code(),
				null, null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), fee,
				getSysDate(), getSysDate(), getSysDate());
			sleepTime(3);
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(sellerFee));
			assertAcctransAccount(payerAccountNo, payerBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, depositAmount,
				sellerFee);
		}

		//		异步回执通知测试
		//		入口为01，业务成功回执
		sleepTime(3);
		if (testId == 1001 || testId == 1004 || testId == 1005 || testId == 1021 || testId == 1023
			|| testId == 1025) {
			assertNotifyMock(1, keyOne, valueOne, keyTwo, gid, keyThree, partnerId, keyFour,
				merchOrderNo, keyFive, merchantOrderNo, keySix, bizNo, keySeven,
				tradeAmount.toString(), keyEight, null, keyNine, tradeAmount.subtract(shareAmount)
					.toString(), keyTen, productStatusEnd.code(), keyeleven, payMethod.code(),
				keyTwelve, sellerFee.toString(), keyThirteen, buyerFee.toString(), keyFourteen,
				partnerFee.toString());
		}
		if (testId == 1002) {
			assertNotifyMock(1, keyOne, valueOne, keyTwo, gid, keyThree, partnerId, keyFour,
				merchOrderNo, keyFive, merchantOrderNo, keySix, bizNo, keySeven, tradeAmount
					.multiply(0.0555).toString(), keyEight, null, keyNine,
				tradeAmount.multiply(0.0555).subtract(shareAmount).toString(), keyTen,
				productStatusEnd.code(), keyeleven, payMethod.code(), keyTwelve,
				sellerFee.toString(), keyThirteen, buyerFee.toString(), keyFourteen,
				partnerFee.toString());
		}
		if (testId == 1003) {
			assertNotifyMock(1, keyOne, valueOne, keyTwo, gid, keyThree, partnerId, keyFour,
				merchOrderNo, keyFive, merchantOrderNo, keySix, bizNo, keySeven,
				tradeAmount.toString(), keyEight, null, keyNine, tradeAmount.subtract(sellerFee)
					.toString(), keyTen, productStatusEnd.code(), keyeleven, payMethod.code(),
				keyTwelve, sellerFee.toString(), keyThirteen, buyerFee.toString(), keyFourteen,
				partnerFee.toString());
		}
		//	入口为非01，业务成功回执
		if (testId == 1006 || testId == 1007 || testId == 1008 || testId == 1009 || testId == 1010
			|| testId == 1019 || testId == 1020) {
			assertNotifyMock(1, keyOne, valueOne, keyTwo, gid, keyThree, partnerId, keyFour,
				merchOrderNo, keyFive, merchantOrderNo, keySix, bizNo, keySeven,
				tradeAmount.toString(), keyEight, null, keyNine, buyerFee.toString(), keyTen,
				valueTen, null, null, null, null, null, null, null, null);
		}
		//	入口为01
		if (testId >= 1015 && testId <= 1016) {
			assertNotifyMock(1, keyOne, valueOne, keyTwo, gid, keyThree, partnerId, keyFour,
				merchOrderNo, keyFive, merchOrderNo, keySix, bizNo, keySeven,
				tradeAmount.toString(), keyEight, failReason, keyNine, null, keyTen,
				productStatusEnd.code(), keyeleven, payMethod.code(), keyTwelve,
				sellerFee.toString(), keyThirteen, buyerFee.toString(), keyFourteen,
				partnerFee.toString());
		}
		//	入口为非01，有失败原因,付款失败但订单状态未关闭，不通知
		//05 和 09 作特殊处理，需要通知，所以在csv中把入口改成02了
		if (testId >= 1017 && testId <= 1018) {
			assertNotifyMock(0, keyOne, valueOne, keyTwo, gid, keyThree, partnerId, keyFour,
				merchOrderNo, keyFive, merchantOrderNo, keySix, bizNo, keySeven,
				tradeAmount.toString(), keyEight, failReason, keyNine, null, keyTen, valueTen,
				null, null, null, null, null, null, null, null);
		}
		if (payMethod.code().equals("ONLINEBANK")) {
			//			ContextDataDO DO = findContextDataByGid(payGid);
			//			assertNotNull(DO);
		}

		//清除数据
		//	清除产品订单信息
		cleanFastPayByMerchantOrderNoAndMerchantCardNo(merchantOrderNo, partnerId);
		cleanFastPayByMerchantOrderNoAndMerchantCardNo(TEST_MERCH_ORDER_NO, partnerId);
		cleanFastPayTimeoutsByAll();
		cleanTradePayInfoByAll();
		cleanFastPayShareProfitAll();
		//	清除商户与产品服务关系数据
		cleanMerchantSwitchInfoByProductCode(productCode);
		//	清除数据中心订单同步信息
		cleanDataTolAll();
		//	清除会员缓存
		deleteCustomerCache.deleteCustomerCache(buyerUserId, null, null, buyerUserId);
		deleteCustomerCache.deleteCustomerCache(sellerUserId, null, null, sellerUserId);
		deleteCustomerCache.deleteCustomerCache(merchantUserId, null, null, merchantUserId);
		deleteCustomerCache.deleteCustomerCache(payerUserId, null, null, payerUserId);

		//	清除数据中心统计数据
		deleteCollection("EventResultData");
		deleteCollection("EventResultLog");
		// 清除识别规则数据
		cleanMultiAccountSceneRuleByInlet(inlet);
		//	清除资金管控规则数据
		cleanFcBusinessNewRule(partnerId);
		cleanfcPbcNewRule(accountLevel, currency.code());
		//	清除commonservices回执通知服务
		cleanOrderSimpleInfoByAll();
		//	清除支付引擎数据
		cleanPayDepositBackInstructionAll();
		cleanPayDepositInstructionAll();
		//	清除通知数据
		cleanNotifyMockAll();
		cleanPactUncustomerBankInfo(bankAccountNo);
		cleanTradeMainAll();
		cleanBalanceTradeByUserId(buyerUserId);
		cleanTradeAll();
	}

	/*
	 *1001、gid为null,预期方向提示gid不能为空
	*1002、gid为36个字符,预期提示方向gid只能是35个字符
	*1003、gid为34个字符,预期提示方向gid只能是35个字符
	*1004、PartnerId为null，预期提示方向PartnerId不能为空
	*1005、PartnerId为21个字符，预期提示方向PartnerId只能为20个字符
	*1006、PartnerId为19个字符，预期提示方向PartnerId只能为20个字符
	*1007、MerchOrderNo为null，预期提示方向MerchOrderNo不能为空
	*1008、MerchOrderNo为65个字符，预期提示方向MerchOrderNo最大为64个字符
	*1009、BizNo为null，预期提示方向BizNo不能为空
	*1010、BizNo为21个字符，预期提示方向BizNo只能为20个字符
	*1011、BizNo为19个字符，预期提示方向BizNo只能为20个字符
	*1012、PayMethod为null，预期提示方向PayMethod不能为空
	*1013、Source为null，预期提示方向Source不能为空
	*1014、支付方式为余额，PayerUserId为null，预期提示方向支付方式为余额时PayerUserId不能为空
	*1015、支付方式为余额，PayerUserId为21个字符，预期提示方向PayerUserId只能为20个字符
	*1016、支付方式为余额，PayerUserId为19个字符，预期提示方向PayerUserId只能为20个字符
	*1017、支付方式为代扣支付时，pactNo为null，预期提示方向支付方式为代扣支付时PayerUserId和pactNo或protocolNo和pactNo不能为空
	*1018、支付方式为快捷支付时，pactNo为null，预期提示方向支付方式为快捷支付时PayerUserId和pactNo或protocolNo和pactNo不能为空
	*1019、支付方式为代扣支付时，PayerUserId为null，预期提示方向支付方式为代扣支付时PayerUserId和pactNo或protocolNo和pactNo不能为空
	*1020、支付方式为快捷支付时，PayerUserId为null，预期提示方向支付方式为快捷支付时PayerUserId和pactNo或protocolNo和pactNo不能为空
	*1021、支付方式为网银支付（ONLINEBANK）时，PayBankOrder为null，预期提示方向支付方式为网银支付时PayBankOrder不能为空
	*1022、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，PayBankOrder为null，预期提示方向支付方式为第三方公众号支付时PayBankOrder不能为空
	*1023、支付方式为第三方扫码支付时（THIRDSCANPAY）时，PayBankOrder为null，预期提示方向支付方式为第三方扫码支付时PayBankOrder不能为空
	*1024、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，PayBankOrder为null，预期提示方向支付方式为第三方条码时PayBankOrder不能为空
	*1025、支付方式为控件支付时（UNIONPLUGINPAY）时，PayBankOrder为null，预期提示方向支付方式为控件支付时PayBankOrder不能为空
	*1026、支付方式为联名卡转账支付时（TRANSFERPAY）时，PayBankOrder为null，预期提示方向支付方式为联名卡转账支付时PayBankOrder不能为空
	*1027、支付方式为网银支付（ONLINEBANK）时，PersonalCorporateType为null，预期提示方向支付方式为网银支付时PersonalCorporateType不能为空
	*1028、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，PersonalCorporateType为null，预期提示方向支付方式为第三方公众号支付时PersonalCorporateType不能为空
	*1029、支付方式为第三方扫码支付时（THIRDSCANPAY）时，PersonalCorporateType为null，预期提示方向支付方式为第三方扫码支付时PersonalCorporateType不能为空
	*1030、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，PersonalCorporateType为null，预期提示方向支付方式为第三方条码时PersonalCorporateType不能为空
	*1031、支付方式为控件支付时（UNIONPLUGINPAY）时，PersonalCorporateType为null，预期提示方向支付方式为控件支付时PersonalCorporateType不能为空
	*1032、支付方式为联名卡转账支付时（TRANSFERPAY）时，PersonalCorporateType为null，预期提示方向支付方式为联名卡转账支付时PersonalCorporateType不能为空
	*1033、支付方式为网银支付（ONLINEBANK）时，bankCode为null，预期提示方向支付方式为网银支付时bankCode不能为空
	*1034、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，bankCode为null，预期提示方向支付方式为第三方公众号支付时bankCode不能为空
	*1035、支付方式为第三方扫码支付时（THIRDSCANPAY）时，bankCode为null，预期提示方向支付方式为第三方扫码支付时bankCode不能为空
	*1036、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，bankCode为null，预期提示方向支付方式为第三方条码时bankCode不能为空
	*1037、支付方式为控件支付时（UNIONPLUGINPAY）时，bankCode为null，预期提示方向支付方式为控件支付时bankCode不能为空
	*1038、支付方式为联名卡转账支付时（TRANSFERPAY）时，bankCode为null，预期提示方向支付方式为联名卡转账支付时bankCode不能为空
	*1039、支付方式为网银支付（ONLINEBANK）时，cardType为null，预期提示方向支付方式为网银支付时cardType不能为空
	*1040、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，cardType为null，预期提示方向支付方式为第三方公众号支付时cardType不能为空
	*1041、支付方式为第三方扫码支付时（THIRDSCANPAY）时，cardType为null，预期提示方向支付方式为第三方扫码支付时cardType不能为空
	*1042、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，cardType为null，预期提示方向支付方式为第三方条码时cardType不能为空
	*1043、支付方式为控件支付时（UNIONPLUGINPAY）时，cardType为null，预期提示方向支付方式为控件支付时cardType不能为空
	*1044、支付方式为联名卡转账支付时（TRANSFERPAY）时，cardType为null，预期提示方向支付方式为联名卡转账支付时cardType不能为空
	*1045、支付方式为联名卡转账支付时（TRANSFERPAY）时，BankAccountNo为null，预期提示方向支付方式为联名卡转账支付时BankAccountNo不能为空
	*1046、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，ExtensionParams为null，预期提示方向支付方式为第三方公众号支付时ExtensionParams不能为空
	*1047、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，ExtensionParams为null，预期提示方向支付方式为第三方公众号支付时ExtensionParams不能为空
	*1048、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，ExtensionParams为null，预期提示方向支付方式为第三方条码时ExtensionParams不能为空
	*1049、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，ExtensionParams为null，预期提示方向支付方式为第三方条码时ExtensionParams不能为空
	*1050、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，openid没有值，预期提示方向支付方式为第三方公众号支付时必须要有openid
	*1051、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，authCode没有值，预期提示方向支付方式为第三方条码时必须要有authCode
	*1052、支付方式为第三方控件支付（微信APP支付=bankcode为weixin）时（UNIONPLUGINPAY）时，deviceType没有值，预期提示方向支付方式为第三方条码时必须要有deviceType
	*1053、支付方式为第三方控件支付（微信APP支付=bankcode为weixin）时（UNIONPLUGINPAY）时，wxAppid没有值，预期提示方向支付方式为第三方条码时必须要有wxAppid
	*1054、macAddress为49个字符，预期提示方向macAddress最大为48个字符
	*1055、userEndIp为129个字符，预期提示方向userEndIp最大为128个字符
	*1056、支付方式为代扣支付时，payerUserId和protocolNo都传入，预期提示方向payerUserId和protocolNo在代扣或快捷支付时付款人用户ID和协议号不能同时有值
	*1057、支付方式为快捷支付时，payerUserId和protocolNo都传入，预期提示方向payerUserId和protocolNo在代扣或快捷支付时付款人用户ID和协议号不能同时有值
	*1058、order为null，预期提示方向order不能为空
	*1059、支付方式为线下支付，易极付备付金账户为空
	*1060、支付方式为线下支付，depositVerifyCode为空
	*1061、支付方式为线下支付，depositBussineeCode为空
	 */
	@Test
	@JoinTestCase(file = "commonproducts/fastPay/tradePaymentServiceSingleTradePayTestFailOne.csv",
			description = "即时到账更新交易-失败用例一")
	public void tradePaymentServiceSingleTradePayTestFailOne(	int testId,
																String code,
																Status status,
																String gid,
																String payGid,
																String inlet,
																//支付入参
																PayMethodEnum payMethod,
																FastPayQuerySourceEnum querySource,
																String pactNo,
																String protocolNo,
																UserTeminalTypeEnum userTerminalType,
																boolean certInstalled,
																String bankAccountNo,
																String bankCode,
																DebitCreditTypeEnum cardType,
																String deviceType,
																String mutableType,
																String openid,
																PersonalCorporateTypeEnum personalCorporateType,
																String wxAppid,
																String enpAccountCustNumber,
																String authCode,
																String payerUserId,
																String payerCardNo,
																String payerAccountNo,
																String depositVerifyCode,
																String depositBussineeCode,
																String yjfAccountNo,
																//创建交易入参
																String sellerUserId,
																String sellerCardNo,
																String sellerAccountNo,
																String buyerUserId,
																String buyerCardNo,
																String buyerAccountNo,
																String merchantUserId,
																String partnerId,
																String payPartnerId,
																String merchantAccountNo,
																String supervisionAccNo,
																String merchantOrderNo,
																String merchOrderNo,
																String payMerchOrderNo,
																CurrencyEnum currency,
																Money tradeAmount,
																String nationalType,
																long autoCloseDuration,
																String chargeExtends,
																String memo,
																String tradeName,
																String userEndIp,
																String userTeminalType,
																String macAddress,
																String dubboGroup,
																String dubboVersion,
																String dubboGid,
																String foreignGid,
																CurrencyEnum foreignCurrency,
																String rate,
																Money foreignAmount,
																String bizNo,
																//result返回校验
																String forwardUrl,
																Money buyerFee,
																Money payAmount,
																//异常数据
																String exceptionUserIdMore,
																String exceptionUserIdLess,
																String exceptionBizNo,
																String mainTradeNo,
																Money bailPayMoney) {
		//清除数据
		//		清除产品订单信息
		cleanFastPayByMerchantOrderNoAndMerchantCardNo(merchantOrderNo, partnerId);
		cleanFastPayTimeoutsByAll();
		cleanTradePayInfoByAll();
		//	清除数据中心订单同步信息
		cleanDataTolAll();
		//	清除会员缓存
		deleteCustomerCache.deleteCustomerCache(buyerUserId, null, null, buyerUserId);
		deleteCustomerCache.deleteCustomerCache(sellerUserId, null, null, sellerUserId);
		deleteCustomerCache.deleteCustomerCache(merchantUserId, null, null, merchantUserId);
		deleteCustomerCache.deleteCustomerCache(payerUserId, null, null, payerUserId);
		//	清除数据中心统计数据
		deleteCollection("EventResultData");
		deleteCollection("EventResultLog");
		// 清除识别规则数据
		cleanMultiAccountSceneRuleByInlet(inlet);
		//	清除commonservices回执通知服务
		cleanOrderSimpleInfoByAll();
		//准备数据

		//测试过程
		//		微信公众号、微信扫码、微信app、民生非标网银、
		Map<String, String> extensionParams = new HashMap<>();
		extensionParams.put("openid", openid);//微信公众号支付，需要传入的信息
		extensionParams.put("wxAppid", wxAppid);//微信APP支付，需要传入的信息
		extensionParams.put("deviceType", deviceType);//移动端操作系统类型;微信app支付必填，IOS/ANDROID
		extensionParams.put("authCode", authCode);//条码支付
		extensionParams.put("enpAccountCustNumber", enpAccountCustNumber);//民生对公非标网银，需要传入的信息，企业网银客户号
		//1050、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，openid没有值，预期提示方向支付方式为第三方公众号支付时必须要有openid
		if (testId == 1050) {
			extensionParams.clear();
			extensionParams.put("wxAppid", wxAppid);//微信APP支付，需要传入的信息
			extensionParams.put("deviceType", deviceType);//移动端操作系统类型;微信app支付必填，IOS/ANDROID
			extensionParams.put("authCode", authCode);//条码支付
			extensionParams.put("enpAccountCustNumber", enpAccountCustNumber);//民生对公非标网银，需要传入的信息，企业网银客户号
		}
		//1051、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，authCode没有值，预期提示方向支付方式为第三方条码时必须要有authCode
		if (testId == 1051) {
			extensionParams.clear();
		}
		//1052、支付方式为第三方控件支付（微信APP支付=bankcode为weixin）时（UNIONPLUGINPAY）时，deviceType没有值，预期提示方向支付方式为第三方条码时必须要有deviceType
		if (testId == 1052) {
			extensionParams.clear();
			extensionParams.put("wxAppid", wxAppid);//微信APP支付，需要传入的信息
		}
		//1053、支付方式为第三方控件支付（微信APP支付=bankcode为weixin）时（UNIONPLUGINPAY）时，wxAppid没有值，预期提示方向支付方式为第三方条码时必须要有wxAppid
		if (testId == 1053) {
			extensionParams.clear();
			extensionParams.put("deviceType", deviceType);//微信APP支付，需要传入的信息
		}

		//保证金order
		BailPayOrder bailPayOrder = new BailPayOrder();
		bailPayOrder.setBailNo(mainTradeNo);
		bailPayOrder.setBailPayAmount(bailPayMoney);

		PayBankOrder payBankOrder = new PayBankOrder();
		payBankOrder.setPersonalCorporateType(personalCorporateType);
		payBankOrder.setCardType(cardType);
		payBankOrder.setBankCode(bankCode);
		payBankOrder.setExtensionParams(extensionParams);
		payBankOrder.setMutableType(mutableType);
		payBankOrder.setBankAccountNo(bankAccountNo);

		//1027、支付方式为网银支付（ONLINEBANK）时，PersonalCorporateType为null，预期提示方向支付方式为网银支付时PersonalCorporateType不能为空
		//1028、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，PersonalCorporateType为null，预期提示方向支付方式为第三方公众号支付时PersonalCorporateType不能为空
		//1029、支付方式为第三方扫码支付时（THIRDSCANPAY）时，PersonalCorporateType为null，预期提示方向支付方式为第三方扫码支付时PersonalCorporateType不能为空
		//1030、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，PersonalCorporateType为null，预期提示方向支付方式为第三方条码时PersonalCorporateType不能为空
		//1031、支付方式为控件支付时（UNIONPLUGINPAY）时，PersonalCorporateType为null，预期提示方向支付方式为控件支付时PersonalCorporateType不能为空
		//1032、支付方式为联名卡转账支付时（TRANSFERPAY）时，PersonalCorporateType为null，预期提示方向支付方式为联名卡转账支付时PersonalCorporateType不能为空
		if (testId == 1027 || testId == 1028 || testId == 1029 || testId == 1030 || testId == 1031
			|| testId == 1032) {
			payBankOrder.setPersonalCorporateType(null);
		}
		//1033、支付方式为网银支付（ONLINEBANK）时，bankCode为null，预期提示方向支付方式为网银支付时bankCode不能为空
		//1034、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，bankCode为null，预期提示方向支付方式为第三方公众号支付时bankCode不能为空
		//1035、支付方式为第三方扫码支付时（THIRDSCANPAY）时，bankCode为null，预期提示方向支付方式为第三方扫码支付时bankCode不能为空
		//1036、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，bankCode为null，预期提示方向支付方式为第三方条码时bankCode不能为空
		//1037、支付方式为控件支付时（UNIONPLUGINPAY）时，bankCode为null，预期提示方向支付方式为控件支付时bankCode不能为空
		//1038、支付方式为联名卡转账支付时（TRANSFERPAY）时，bankCode为null，预期提示方向支付方式为联名卡转账支付时bankCode不能为空
		if (testId == 1033 || testId == 1034 || testId == 1035 || testId == 1036 || testId == 1037
			|| testId == 1038) {
			payBankOrder.setBankCode(null);
		}
		//1039、支付方式为网银支付（ONLINEBANK）时，cardType为null，预期提示方向支付方式为网银支付时cardType不能为空
		//1040、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，cardType为null，预期提示方向支付方式为第三方公众号支付时cardType不能为空
		//1041、支付方式为第三方扫码支付时（THIRDSCANPAY）时，cardType为null，预期提示方向支付方式为第三方扫码支付时cardType不能为空
		//1042、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，cardType为null，预期提示方向支付方式为第三方条码时cardType不能为空
		//1043、支付方式为控件支付时（UNIONPLUGINPAY）时，cardType为null，预期提示方向支付方式为控件支付时cardType不能为空
		//1044、支付方式为联名卡转账支付时（TRANSFERPAY）时，cardType为null，预期提示方向支付方式为联名卡转账支付时cardType不能为空
		if (testId == 1039 || testId == 1040 || testId == 1041 || testId == 1042 || testId == 1043
			|| testId == 1044) {
			payBankOrder.setCardType(null);
		}
		//1045、支付方式为联名卡转账支付时（TRANSFERPAY）时，BankAccountNo为null，预期提示方向支付方式为联名卡转账支付时BankAccountNo不能为空
		if (testId == 1045) {
			payBankOrder.setBankAccountNo(null);
		}
		//1046、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，ExtensionParams为null，预期提示方向支付方式为第三方公众号支付时ExtensionParams不能为空
		//1047、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，ExtensionParams为null，预期提示方向支付方式为第三方公众号支付时ExtensionParams不能为空
		//1048、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，ExtensionParams为null，预期提示方向支付方式为第三方条码时ExtensionParams不能为空
		//1049、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，ExtensionParams为null，预期提示方向支付方式为第三方条码时ExtensionParams不能为空
		if (testId == 1046 || testId == 1047 || testId == 1048 || testId == 1049) {
			payBankOrder.getExtensionParams().clear();
		}

		SingleTradePayOrder order = new SingleTradePayOrder();
		order.setGid(payGid);
		order.setPartnerId(partnerId);
		order.setMerchOrderNo(merchOrderNo);
		order.setBizNo(bizNo);
		order.setPayMethod(payMethod);//支付方式选择
		order.setSource(querySource);//查询来源/支付来源
		//	以上为公共必填信息
		//	余额支付
		order.setPayerUserId(payerUserId);
		//	签约代扣支付
		order.setPactNo(pactNo);
		order.setProtocolNo(protocolNo);
		//	联名卡、微信app、第三方控件和微信公众号支付
		order.setPayBankOrder(payBankOrder);
		//不必填项信息
		order.setMacAddress(macAddress);
		order.setUserEndIp(userEndIp);
		order.setUserTerminalType(userTerminalType);
		order.setCertInstalled(certInstalled);
		//1001、gid为null,预期方向提示gid不能为空
		//1002、gid为36个字符,预期提示方向gid只能是35个字符
		//1003、gid为34个字符,预期提示方向gid只能是35个字符
		if (testId == 1001) {
			order.setGid(null);
		}
		//1004、PartnerId为null，预期提示方向PartnerId不能为空
		//1005、PartnerId为21个字符，预期提示方向PartnerId只能为20个字符
		//1006、PartnerId为19个字符，预期提示方向PartnerId只能为20个字符
		if (testId == 1004) {
			order.setPartnerId(null);
		}
		if (testId == 1005) {
			order.setPartnerId(exceptionUserIdMore);
		}
		if (testId == 1006) {
			order.setPartnerId(exceptionUserIdLess);
		}
		//1007、MerchOrderNo为null，预期提示方向MerchOrderNo不能为空
		//1008、MerchOrderNo为65个字符，预期提示方向MerchOrderNo最大为64个字符
		if (testId == 1007) {
			order.setMerchOrderNo(null);
		}
		//1009、BizNo为null，预期提示方向BizNo不能为空
		//1010、BizNo为21个字符，预期提示方向BizNo只能为20个字符
		//1011、BizNo为19个字符，预期提示方向BizNo只能为20个字符
		if (testId == 1009) {
			order.setBizNo(null);
		}
		if (testId == 1010 || testId == 1011) {
			order.setBizNo(exceptionBizNo);
		}
		//1012、PayMethod为null，预期提示方向PayMethod不能为空
		if (testId == 1012) {
			order.setPayMethod(null);//支付方式选择
		}
		//1013、Source为null，预期提示方向Source不能为空
		if (testId == 1013) {
			order.setSource(null);//查询来源/支付来源
		}
		//1014、支付方式为余额，PayerUserId为null，预期提示方向支付方式为余额时PayerUserId不能为空
		//1015、支付方式为余额，PayerUserId为21个字符，预期提示方向PayerUserId只能为20个字符
		//1016、支付方式为余额，PayerUserId为19个字符，预期提示方向PayerUserId只能为20个字符
		if (testId == 1014) {
			order.setPayerUserId(null);
		}
		if (testId == 1015) {
			order.setPayerUserId(exceptionUserIdMore);
		}
		if (testId == 1016) {
			order.setPayerUserId(exceptionUserIdLess);
		}
		//1017、支付方式为代扣支付时，pactNo为null，预期提示方向支付方式为代扣支付时PayerUserId和pactNo或protocolNo和pactNo不能为空
		//1018、支付方式为快捷支付时，pactNo为null，预期提示方向支付方式为快捷支付时PayerUserId和pactNo或protocolNo和pactNo不能为空
		if (testId == 1017 || testId == 1018) {
			order.setPactNo(null);
		}
		//1019、支付方式为代扣支付时，PayerUserId为null，预期提示方向支付方式为代扣支付时PayerUserId和pactNo或protocolNo和pactNo不能为空
		//1020、支付方式为快捷支付时，PayerUserId为null，预期提示方向支付方式为快捷支付时PayerUserId和pactNo或protocolNo和pactNo不能为空
		if (testId == 1019 || testId == 1020) {
			order.setPayerUserId(null);
			order.setProtocolNo(null);
		}
		//1021、支付方式为网银支付（ONLINEBANK）时，PayBankOrder为null，预期提示方向支付方式为网银支付时PayBankOrder不能为空
		//1022、支付方式为第三方公众号支付时（THIRDPUBLICPAY）时，PayBankOrder为null，预期提示方向支付方式为第三方公众号支付时PayBankOrder不能为空
		//1023、支付方式为第三方扫码支付时（THIRDSCANPAY）时，PayBankOrder为null，预期提示方向支付方式为第三方扫码支付时PayBankOrder不能为空
		//1024、支付方式为第三方条码支付时（THIRDSCANNEDPAY）时，PayBankOrder为null，预期提示方向支付方式为第三方条码时PayBankOrder不能为空
		//1025、支付方式为控件支付时（UNIONPLUGINPAY）时，PayBankOrder为null，预期提示方向支付方式为控件支付时PayBankOrder不能为空
		//1026、支付方式为联名卡转账支付时（TRANSFERPAY）时，PayBankOrder为null，预期提示方向支付方式为联名卡转账支付时PayBankOrder不能为空
		if (testId == 1021 || testId == 1022 || testId == 1023 || testId == 1024 || testId == 1025
			|| testId == 1026) {
			order.setPayBankOrder(null);
		}
		//1054、macAddress为49个字符，预期提示方向macAddress最大为48个字符
		//1055、userEndIp为129个字符，预期提示方向userEndIp最大为128个字符
		//1056、支付方式为代扣支付时，payerUserId和protocolNo都传入，预期提示方向payerUserId和protocolNo在代扣或快捷支付时付款人用户ID和协议号不能同时有值
		//1057、支付方式为快捷支付时，payerUserId和protocolNo都传入，预期提示方向payerUserId和protocolNo在代扣或快捷支付时付款人用户ID和协议号不能同时有值
		//1058、order为null，预期提示方向order不能为空
		if (testId == 1058) {
			order = null;
		}
		if (testId >= 1059) {
			OfflinePayOrder offlinePayOrder = new OfflinePayOrder();
			offlinePayOrder.setYjfBankAccountNo(yjfAccountNo);
			offlinePayOrder.setBankAccountNo(bankAccountNo);
			offlinePayOrder.setDepositBussineeCode(depositBussineeCode);
			offlinePayOrder.setDepositVerifyCode(depositVerifyCode);
			offlinePayOrder.setBankCode(bankCode);
			if (testId == 1059) {
				offlinePayOrder.setYjfBankAccountNo(null);
			}
			if (testId == 1060) {
				offlinePayOrder.setDepositVerifyCode(null);
			}
			if (testId == 1061) {
				offlinePayOrder.setDepositBussineeCode(null);
			}
			if (testId == 1062) {
				offlinePayOrder.setBankAccountNo(null);
			}
			if (testId == 1063) {
				offlinePayOrder.setBankCode(null);
			}
			order.setOfflinePayOrder(offlinePayOrder);
		}
		if (testId == 1063) {
			bailPayOrder.setBailNo(null);
		}
		if (testId == 1066) {
			bailPayOrder.setBailPayAmount(null);
		}

		if (testId >= 1062 && testId <= 1068) {
			order.setBailPayOrder(bailPayOrder);
		}

		//调接口
		SingleTradePayResult result = tradePaymentService.singleTradePay(order);
		//数据校验
		assertResult(testId, status, code, result);

		//清除数据
		//	清除产品订单信息
		cleanFastPayByMerchantOrderNoAndMerchantCardNo(merchantOrderNo, partnerId);
		cleanFastPayTimeoutsByAll();
		cleanTradePayInfoByAll();
		//	清除数据中心订单同步信息
		cleanDataTolAll();
		//	清除会员缓存
		deleteCustomerCache.deleteCustomerCache(buyerUserId, null, null, buyerUserId);
		deleteCustomerCache.deleteCustomerCache(sellerUserId, null, null, sellerUserId);
		deleteCustomerCache.deleteCustomerCache(merchantUserId, null, null, merchantUserId);
		deleteCustomerCache.deleteCustomerCache(payerUserId, null, null, payerUserId);
		//	清除数据中心统计数据
		deleteCollection("EventResultData");
		deleteCollection("EventResultLog");
		// 清除识别规则数据
		cleanMultiAccountSceneRuleByInlet(inlet);
		//	清除commonservices回执通知服务
		cleanOrderSimpleInfoByAll();
	}

	/*
	 * 1001、交易订单号不存在。
	 * 1002、来源为GATEWAY,支付方式为余额支付（balance），预期提示方向GATEWAY来源不支持余额balance支付方式(此用例已无效)
	 * 1003、余额支付方式payerUserId付款方会员不存在
	 * 1004、余额支付方式payerUserId付款方没有支付账户
	 * 1005、余额支付方式payerUserId付款方没有场景规则.场景识别新增默认处理，无场景就用默认通户场景
	 * 1006、余额支付方式payerUserId付款方没有识别对应的账户
	 * 1007、余额支付方式payerUserId付款方所识别对应的账户与卖家的账户一致
	 * 1008、余额支付方式付款方余额不足
	 * 1009、余额支付方式付款方账户被风控冻结
	 * 1010、余额支付方式收款方账户被风控冻结
	 * 1011、余额支付方式付款方未认证
	 * 1012、余额支付方式付款方单笔超过央行新规限额(创建交易时已被拦截)
	 * 1013、余额支付方式付款方单笔超过业务管控限额(创建交易时已被拦截)
	 * 1014、代扣支付方式pactNo不存在
	 * 1015、代扣支付方式pactNo与payerUserId不存在关系
	 * 1016、快捷支付方式ProtocolNo与pactNo不存在关系
	 * 1017、代扣支付方式没有配置商户的监管户场景规则
	 * 1018、代扣支付方式没有识别到商户的监管户
	 * 1019、网银支付方式，渠道不存在
	 * 1020、重复付款，余额支付，第一次已付款成功，预期第二次不可以申请。
	 * 1021、重复付款，代扣支付，第一次已付款成功，预期第二次不可以申请。
	 * 1022、重复付款，网银类（网银支付/微信公众号/第三方控件/扫码支付），第一次已付款成功，预期第二次不可以申请
	 * 1023、交易被关闭，不可被支付
	 * 1024、付款时被风控拒绝
	 * 1025、业务管控规则配置了支付方式、终端类型，付款时超出笔限
	 */
	@Test
	@JoinTestCase(file = "commonproducts/fastPay/tradePaymentServiceSingleTradePayTestFailTwo.csv",
			description = "即时到账更新交易-失败用例二")
	public void tradePaymentServiceSingleTradePayTestFailTwo(	int testId,
																String code,
																Status status,
																String gid,
																String payGid,
																String inlet,
																//账户资金
																Money buyerBalance,
																Money sellerBalance,
																Money merchantBalance,
																Money yjfChargeBalance,
																Money payerBalance,
																Money supervisionBalance,
																String yjfChargeAccountNo,
																//支付入参
																PayMethodEnum payMethod,
																FastPayQuerySourceEnum querySource,
																String pactNo,
																String protocolNo,
																UserTeminalTypeEnum userTerminalType,
																boolean certInstalled,
																String bankAccountNo,
																String bankCode,
																DebitCreditTypeEnum cardType,
																String deviceType,
																String mutableType,
																String openid,
																PersonalCorporateTypeEnum personalCorporateType,
																String wxAppid,
																String enpAccountCustNumber,
																String authCode,

																String payerUserId,
																String payerCardNo,
																String payerAccountNo,
																//创建交易入参
																String sellerUserId,
																String sellerCardNo,
																String sellerAccountNo,
																String buyerUserId,
																String buyerCardNo,
																String buyerAccountNo,
																String merchantUserId,
																String partnerId,
																String payPartnerId,
																String merchantAccountNo,
																String supervisionAccNo,
																String merchantOrderNo,
																String merchOrderNo,
																String payMerchOrderNo,
																CurrencyEnum currency,
																Money tradeAmount,
																String nationalType,
																long autoCloseDuration,
																String chargeExtends,
																String memo,
																String tradeName,
																String userEndIp,
																String userTeminalType,
																String macAddress,
																String dubboGroup,
																String dubboVersion,
																String dubboGid,
																String foreignGid,
																CurrencyEnum foreignCurrency,
																String rate,
																Money foreignAmount,
																//识别规则
																String behavior,
																String sellerOperation,
																String buyerOperation,
																String merchantOperation,
																String custodiaOperation,
																String sceneName,
																String strategy,
																String sellerAccountType,
																String buyerAccountType,
																String merchantAccountType,
																String custodiaAccountType,
																String sellerAccountProp,
																String buyerAccountProp,
																String merchantAccountProp,
																String cardOutIn,
																String sellerChildProduct,
																String buyerChildProduct,
																String merchantChildProduct,
																String sellerIndustry,
																String buyerIndustry,
																String merchantIndustry,
																String sellerProduct,
																String buyerProduct,
																String merchantProduct,
																String ruleStatus,
																String sceneUserType,
																//用户状态
																String certifyStatus,
																String certifyStatusOld,
																String userStatus,
																String userStatusOld,
																String runtimeStatus,
																String runtimeStatusOld,
																RankEnum certifyRank,
																RankEnum buyerCertifyRankOld,
																RankEnum sellerCertifyRankOld,
																RankEnum merchantCertifyRankOld,
																RankEnum payerCertifyRankOld,
																//资金管控央行规则参数
																String productName,
																String accountLevel,
																String fcPbcStatus,
																String certCheck,
																Money singleQuota,
																Money dayQuota,
																String dayQuotaNode,
																String dayQuotaNodeTwo,
																Money yearQuota,
																String yearQuotaNode,
																String yearQuotaNodeTwo,
																String interceptWay,
																//	业务管控
																String businessRuleStatus,
																long businessDayCount,
																Money businessSingleQuota,
																Money businessDayQuota,
																Money businessMonthQuota,
																Money businessYearQuota,
																//fastpay_record表数据校验
																String productCode,
																FastPayProductStatusEnum productStatus,
																FastPayProductStatusEnum productStatusEnd,
																String hasRefund,
																String failReason,
																String payMode,
																String outUserId,
																String sellerBankAccountNo,
																String sellerPactNo,
																Money shareAmount,
																//fastpay_timeouts表数据校验
																String tradeStatus,
																String tradeStatusEnd,
																FastPayProductStatusEnum timeoutTradeStatus,
																String timeoutAction,
																//数据中心校验
																//	公共
																String dataStatus,
																String dataStatusEnd,
																String sellerTradeUerType,
																String buyerTradeUerType,
																String merchantTradeUerType,
																String payerTradeUerType,
																String operaingFlag,
																//	卖家
																String sellerRealName,
																//  买家
																String buyerRealName,
																String noneAccountType,
																//	商户
																String merchantRealName,
																//  付款人
																String payerRealName,
																//result返回校验
																String forwardUrl,
																Money buyerFee,
																Money payAmount,
																//trade_pay_info表校验数据
																Money depositAmount,
																Money sellerFee,
																Money partnerFee,
																String mergeFlag,
																String payCertNo,
																String payCertType,
																String payStatus,
																String payStatusEnd,
																String payInfoMemo,
																// fastpay_special_channel_info表数据
																String methodCode,
																String operatorName,
																//模拟清算回执
																String settleCode,
																PaySettleResultEnum settleStatus,
																//第二次付款信息
																String payGidTwo,
																String payMerchOrderNoTwo,
																String payPartnerIdTwo,
																PayMethodEnum payMethodTwo,
																FastPayQuerySourceEnum querySourceTwo,
																Status statusTwo,
																Money buyerFeeTwo,
																String forwardUrlTwo,
																PaySettleResultEnum settleStatusTwo,
																FastPayProductStatusEnum productStatusEndTwo,
																String payStatusEndTwo,
																String dataStatusEndTwo,
																String tradeStatusEndTwo,
																FastPayProductStatusEnum productStatusTwo,
																PersonalCorporateTypeEnum personalCorporateTypeTwo,
																String payStatusThree,
																//异常数据
																String exceptionBizNo,
																String exceptionUserId,
																String accountStatus,
																String accountStatusTwo,
																String paymodel, Money bailPayMoney) {
//				if (testId < 1025) {
//					return;
//				}
		if (testId >= 1024 && testId <= 1032) {
			return;//保证金注释掉
		}
		//清除数据
		//		清除产品订单信息
		cleanFastPayByMerchantOrderNoAndMerchantCardNo(merchantOrderNo, partnerId);
		cleanFastPayTimeoutsByAll();
		cleanTradePayInfoByAll();
		//	清除商户与产品服务关系数据
		cleanMerchantSwitchInfoByProductCode(productCode);
		//	清除数据中心订单同步信息
		cleanDataTolAll();
		//	清除支付引擎数据
		cleanPayDepositBackInstructionAll();
		cleanPayDepositInstructionAll();
		//	清除会员缓存
		deleteCustomerCache.deleteCustomerCache(buyerUserId, null, null, buyerUserId);
		deleteCustomerCache.deleteCustomerCache(sellerUserId, null, null, sellerUserId);
		deleteCustomerCache.deleteCustomerCache(merchantUserId, null, null, merchantUserId);
		deleteCustomerCache.deleteCustomerCache(payerUserId, null, null, payerUserId);
		//	清除数据中心统计数据
		deleteCollection("EventResultData");
		deleteCollection("EventResultLog");
		// 清除识别规则数据
		cleanMultiAccountSceneRuleByInlet(inlet);
		cleanMultiAccountSceneRuleByInlet("09");
		//	清除资金管控规则数据
		cleanFcBusinessNewRule(partnerId);
		cleanfcPbcNewRule(accountLevel, currency.code());
		//	清除commonservices回执通知服务
		cleanOrderSimpleInfoByAll();
		cleanTradeMainAll();
		cleanTradeAll();
		cleanBalanceTradeByUserId(buyerUserId);
		cleanCommandPayParamBymerchantId(partnerId);
		//	清除通知数据
		cleanNotifyMockAll();
		//准备数据
		//	准备会员实名、用户、运行时状态
		updateToAllStatusCustomerUserByUserId(sellerUserId, null, null, null,
			sellerCertifyRankOld.code());
		updateToAllStatusCustomerUserByUserId(merchantUserId, null, null, null,
			merchantCertifyRankOld.code());
		updateToAllStatusCustomerUserByUserId(buyerUserId, null, null, null,
			buyerCertifyRankOld.code());
		findAndUpdateStatusAcctransAccountByAccountNo(sellerAccountNo, accountStatusTwo);

		//	资金管控央行规则
		insertfcPbcNewRule(currency.code(), accountLevel, fcPbcStatus, certCheck, singleQuota,
			dayQuota, dayQuotaNode + "," + dayQuotaNodeTwo, yearQuota, yearQuotaNode + ","
																		+ yearQuotaNodeTwo,
			interceptWay, memo, getSysDate(), getSysDate(), null);
		//	业务管控
		if (testId == 1033) {
			insertFcBusinessNewRule(productName, productCode, partnerId, currency.code(), null,
				fcPbcStatus, businessDayCount, new Money(500), businessDayQuota,
				businessMonthQuota, businessYearQuota, interceptWay, memo, getSysDate(),
				getSysDate(), null, payMethod.code(), "PC", null, null);
		}
		insertFcBusinessNewRule(productName, productCode, partnerId, currency.code(), null,
			fcPbcStatus, businessDayCount, businessSingleQuota, businessDayQuota,
			businessMonthQuota, businessYearQuota, interceptWay, memo, getSysDate(), getSysDate(),
			null, null, null, null, null);

		//		初始化易极付备付金、买家、卖家和平台商户的资金账户余额、账户状态和支付模型---------------------->
		InitAccountNoMoney(merchantAccountNo, merchantBalance, buyerAccountNo, buyerBalance,
			sellerAccountNo, sellerBalance, payerAccountNo, payerBalance, yjfChargeAccountNo,
			yjfChargeBalance, supervisionAccNo, supervisionBalance);

		strategy = null;
		// 		准备入口、策略、行为、操作场景规则表数据 ---转出操作--用于识别卖家的账户
		insertMultiAccountSceneRule(1l, ruleStatus, inlet, strategy, behavior, sellerOperation,
			sellerIndustry, sellerProduct, sellerChildProduct, sellerAccountType,
			sellerAccountProp, cardOutIn, null, null, sceneUserType, null, memo, getSysDate(),
			getSysDate(), sceneName);
		// 		准备入口、策略、行为、操作场景规则表数据 ---转入操作--用于识别买家的账户
		if (testId != 1005) {
			insertMultiAccountSceneRule(1l, ruleStatus, inlet, strategy, behavior, buyerOperation,
				buyerIndustry, buyerProduct, buyerChildProduct, buyerAccountType, buyerAccountProp,
				cardOutIn, null, null, sceneUserType, null, memo, getSysDate(), getSysDate(),
				sceneName);
		}
		// 准备入口、策略、行为、操作场景规则表数据 ---查询操作--用于识别商户的账户
		insertMultiAccountSceneRule(1l, ruleStatus, inlet, strategy, behavior, merchantOperation,
			merchantIndustry, merchantProduct, merchantChildProduct, merchantAccountType,
			merchantAccountProp, cardOutIn, null, null, sceneUserType, null, memo, getSysDate(),
			getSysDate(), sceneName);
		//		准备入口、策略、行为、操作场景规则表数据 ---过渡转账操作--用于识别商户的账户
		if (testId != 1017) {
			insertMultiAccountSceneRule(1l, ruleStatus, inlet, strategy, behavior,
				custodiaOperation, merchantIndustry, merchantProduct, merchantChildProduct,
				custodiaAccountType, merchantAccountProp, cardOutIn, null, null, sceneUserType,
				null, memo, getSysDate(), getSysDate(), sceneName);
		}
		insertMultiAccountSceneRule(1l, ruleStatus, "09", strategy, "bail_transfer_jg", "IN",
			merchantIndustry, merchantProduct, merchantChildProduct, custodiaAccountType,
			merchantAccountProp, cardOutIn, null, null, sceneUserType, null, memo, getSysDate(),
			getSysDate(), sceneName);
		insertMultiAccountSceneRule(1l, ruleStatus, "09", strategy, "bail_transfer_jg", "OUT",
			merchantIndustry, merchantProduct, merchantChildProduct, merchantAccountType,
			merchantAccountProp, cardOutIn, null, null, sceneUserType, null, memo, getSysDate(),
			getSysDate(), sceneName);
		if (testId == 1034) {
			insertCommandPayParam(partnerId, null, null, "ON", operatorName, getSysDate(),
				getSysDate(), null, null, null, null, null, null);
		}
		//	创建交易
		String bizNo = null;
		if (testId >= 1001 && testId <= 1024 || testId == 1033 || testId == 1035) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, currency, tradeAmount, 0, null, null, null, null, null, null, null,
				null, null,null, null, null, null);
		}
		if (testId == 1036) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
					sellerUserId, currency, tradeAmount, 0, null, null, null, null, null, null, null,
					null, null, "fastpay1", "1.5", null, null);
		}
		if (testId >= 1025 && testId <= 1032) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo,
				sellerUserId, currency, tradeAmount, 0, buyerUserId, null, null, null, null, null,
				null, null, null, null, null, null, null);
		}
		if (testId == 1034) {
			bizNo = fastPayCreateTrade(gid, inlet, partnerId, merchantOrderNo, merchOrderNo, null,
				currency, tradeAmount, 0, null, null, null, null, null, null, null, null, "seller",
				null, null, pactNo, null);
		}
		Date timeoutDate = new Date(new Date().getTime() + autoCloseDuration * 60 * 1000);
		if (testId == 1009) {
			findAndUpdateStatusAcctransAccountByAccountNo(payerAccountNo, accountStatus);//冻结账户
		}
		if (testId == 1010) {
			findAndUpdatePaymodelAcctransAccountByAccountNo(payerAccountNo, paymodel);//冻结账户
		}
		if (testId == 1030 || testId == 1032) {
			findAndUpdateStatusAcctransAccountByAccountNo(sellerAccountNo, accountStatus);//冻结账户
		}
		String mainTradeNo = bizNo;
		if (testId >= 1027 && testId <= 1032) {
			mainTradeNo = bailCreateMainTradeAndRecharge(gid, bizNo, merchOrderNo, partnerId, memo,
				tradeName, buyerUserId, bailPayMoney);
			assertNotNull(mainTradeNo);
		}
		if (testId == 1026) {
			mainTradeNo = bailCreateMainTradeAndRecharge(gid, bizNo, merchOrderNo, partnerId, memo,
				tradeName, sellerUserId, bailPayMoney);
			assertNotNull(mainTradeNo);
		}

		//测试过程
		//保证金order
		BailPayOrder bailPayOrder = new BailPayOrder();
		bailPayOrder.setBailNo(mainTradeNo);
		bailPayOrder.setBailPayAmount(bailPayMoney);
		if (testId == 1025) {
			bailPayOrder.setBailNo("test0000000000000001");
		}
		if (testId == 1027 || testId == 1032) {
			bailPayOrder.setBailPayAmount(tradeAmount.add(buyerFee));
		}
		if (testId == 1028) {
			bailPayOrder.setBailPayAmount(tradeAmount.subtract(new Money(100)));
		}

		PayBankOrder payBankOrder = new PayBankOrder();
		payBankOrder.setPersonalCorporateType(personalCorporateType);
		payBankOrder.setCardType(cardType);
		payBankOrder.setBankCode(bankCode);

		SingleTradePayOrder order = new SingleTradePayOrder();
		order.setGid(payGid);
		order.setMerchOrderNo(payMerchOrderNo);
		order.setPartnerId(payPartnerId);
		order.setBizNo(bizNo);
		order.setPayMethod(payMethod);//支付方式选择
		order.setSource(querySource);//查询来源/支付来源
		order.setCertInstalled(certInstalled);

		//	以上为公共必填信息
		//	余额支付
		if (testId >= 1001 && testId <= 1013 || testId == 1020 || testId == 1023 || testId == 1024
			|| testId >= 1025 && testId <= 1030 || testId == 1033 || testId == 1034) {
			order.setPayerUserId(payerUserId);
		}
		if (testId >= 1025 && testId <= 1032) {
			order.setBailPayOrder(bailPayOrder);
		}
		//	签约代扣支付
		if (testId == 1014 || testId == 1031) {
			order.setPactNo(exceptionUserId);
			order.setPayerUserId(payerUserId);
		}
		if (testId == 1015 || testId == 1017 || testId == 1018 || testId == 1021 || testId == 1036) {
			order.setPactNo(pactNo);
			order.setPayerUserId(payerUserId);
		}
		if (testId == 1016) {
			order.setPactNo(pactNo);
			order.setProtocolNo(exceptionUserId);
		}
		//	联名卡、微信app、第三方控件和微信公众号支付
		if (testId == 1019 || testId == 1022 || testId == 1035) {
			order.setPayBankOrder(payBankOrder);
		}

		if (testId == 1001) {
			order.setBizNo(exceptionBizNo);
		}
		if (testId == 1003 || testId == 1004) {
			order.setPayerUserId(exceptionUserId);
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		//已完成订单重复付款
		SingleTradePayResult resultTwo = new SingleTradePayResult();
		if (testId == 1020 || testId == 1021 || testId == 1022 || testId == 1023 || testId == 1024
			|| testId == 1035 || testId == 1036) {
			payAmount = tradeAmount.add(buyerFee);
		}
		if (testId == 1020 || testId == 1021) {
			resultTwo = tradePaymentService.singleTradePay(order);

		}
		if (testId == 1022) {
			resultTwo = tradePaymentService.singleTradePay(order);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			//			模拟清算回执通知-------------------------------------------------------通知后校验
			interchangeNotify(gid, merchOrderNo, partnerId, currency, resultTwo
				.getTradePaymentInfo().getDepositNo(), settleCode, settleStatus, payAmount,
				"accBankAccountNo", "accBankCode", null);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
		if (testId == 1035) {
			resultTwo = tradePaymentService.singleTradePay(order);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
		if (testId == 1023) {
			closeTrade(gid, bizNo, merchOrderNo, partnerId);
		}
		//调接口
		SingleTradePayResult result = tradePaymentService.singleTradePay(order);
		//数据校验
		assertResult(testId, status, code, result);
		//	result返回校验
		String payBizNo = null;
		String batchNo = null;
		String depositNo = null;
		//对于代扣处理中和失败不反悔付款信息，对于网银充值和成功返回
		if (testId >= 1001 && testId <= 1019 || testId == 1023) {
			assertNull(result.getTradePaymentInfo());
			assertNull(result.getForwardUrl());
			//	根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, null, null, payMode, null, null, shareAmount,
				null, null);

			//	据bizNo查询校验trade_pay_info表数据
			if (testId == 1001) {
				assertTradePayInfo(0, exceptionBizNo, payBizNo, batchNo, null, depositAmount,
					payAmount, querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag,
					payerUserId, payerCardNo, payerAccountNo, null, payMethod.code(), null, null,
					null, null, null, null, null, payerRealName, payCertNo, payCertType, null,
					null, userTerminalType.code(), payStatus, null, null, null, shareAmount,
					bailPayMoney, new Money());
			} else {
				assertTradePayInfo(0, bizNo, payBizNo, batchNo, null, depositAmount, payAmount,
					querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId,
					payerCardNo, payerAccountNo, null, payMethod.code(), null, null, null, null,
					null, null, null, payerRealName, payCertNo, payCertType, null, null,
					userTerminalType.code(), payStatus, null, null, null, shareAmount, bailPayMoney, new Money());
			}
			try {
				Thread.sleep(2500);
			} catch (Exception e) {
			}
			Date endDate = null;
			if (testId == 1023 || testId == 1038) {
				endDate = getSysDate();
			}

			assertEquals(2, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, null, null, getSysDate(), getSysDate(), endDate);

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, null, null, getSysDate(), getSysDate(), endDate);

			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTol(0, bizNo, payerUserId, payerTradeUerType, payerCardNo, payerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, payerUserId,
				payerRealName, null, null, getSysDate(), getSysDate(), endDate);

			//	资金校验
			if (testId == 1007) {
				assertAcctransAccount(sellerAccountNo, payerBalance);
			} else {
				assertAcctransAccount(sellerAccountNo, sellerBalance);
			}
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance);
			assertAcctransAccount(payerAccountNo, payerBalance);
			assertAcctransAccount(buyerAccountNo, buyerBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				merchantBalance);
		}
		if (testId == 1035) {
			//第一笔充值回执
			//			模拟清算回执通知-------------------------------------------------------通知后校验
			interchangeNotify(gid, merchOrderNo, partnerId, currency, resultTwo
				.getTradePaymentInfo().getDepositNo(), settleCode, settleStatus, payAmount,
				"accBankAccountNo", "accBankCode", null);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}

			assertNotNull(result.getTradePaymentInfo());
			depositNo = resultTwo.getTradePaymentInfo().getDepositNo();
			payBizNo = resultTwo.getTradePaymentInfo().getPayBizNo();
			batchNo = resultTwo.getTradePaymentInfo().getBatchNo();
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, null, null, payMode, null, null, shareAmount,
				null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(2, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, null, null, null, null, null, null, null, null,
				userTerminalType.code(), payStatusEnd, null, null, null, shareAmount, bailPayMoney, new Money());
			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccount(payerAccountNo, payerBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance,
				tradeAmount.add(buyerFee), tradeAmount.add(buyerFee));
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);
			//第二笔充值回执
			//			模拟清算回执通知-------------------------------------------------------通知后校验
			updateTransactionOnlineBankBySettleNo(queryTradePayInfoByPayBizNo(payBizNo).get(0)
				.getSettleBizNo(), "BS");
			interchangeNotify(gid, merchOrderNo, partnerId, currency, result.getTradePaymentInfo()
				.getDepositNo(), settleCode, settleStatus, payAmount, "accBankAccountNo",
				"accBankCode", queryTradePayInfoByPayBizNo(payBizNo).get(0).getSettleBizNo());
			payBizNo = result.getTradePaymentInfo().getPayBizNo();
			batchNo = result.getTradePaymentInfo().getBatchNo();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			depositNo = result.getTradePaymentInfo().getDepositNo();
			payBizNo = result.getTradePaymentInfo().getPayBizNo();
			batchNo = result.getTradePaymentInfo().getBatchNo();
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(2, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
				querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null, null,
				supervisionAccNo, payMethod.code(), bankCode, personalCorporateType.code(),
				cardType.code(), null, null, null, null, null, null, null, null, null,
				userTerminalType.code(), "DEPOSIT_BACK_FINISHED", "充值成功，付款失败，充退完成", null, null,
				shareAmount, bailPayMoney, new Money());

			sleepTime(60);
			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
			assertAcctransAccount(payerAccountNo, payerBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance,
				tradeAmount.add(tradeAmount.add(buyerFee.add(buyerFee))), tradeAmount.add(buyerFee));
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);
		}

		if (testId >= 1020 && testId <= 1022) {
			assertNull(result.getForwardUrl());
			assertNull(result.getTradePaymentInfo());
			payBizNo = resultTwo.getTradePaymentInfo().getPayBizNo();
			batchNo = resultTwo.getTradePaymentInfo().getBatchNo();
			if (testId != 1020 && testId != 1024) {
				depositNo = resultTwo.getTradePaymentInfo().getDepositNo();
			}
			if (testId == 1020) {
				//	根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
				assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
					merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType,
					null, autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
					sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount,
					null, null, hasRefund, null, null, null, null, null, payMode, null, null,
					shareAmount, null, null);
				//	据bizNo查询校验trade_pay_info表数据
				assertTradePayInfo(1, bizNo, payBizNo, batchNo, null, depositAmount, payAmount,
					querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId,
					payerCardNo, payerAccountNo, supervisionAccNo, payMethod.code(), null, null,
					null, null, null, null, null, payerRealName, payCertNo, payCertType, null,
					null, userTerminalType.code(), payStatus, null, null, null, shareAmount,
					bailPayMoney, new Money());
				//	数据中心同步数据校验
				sleepTime(3);
				assertEquals(3, findDataTolByOutBizNo(bizNo).size());
				assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
					sellerAccountNo, sellerAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
					productCode, null, productStatus.code(), gid, tradeAmount, currency.code(),
					null, null, sellerUserId, sellerRealName, queryTradePayInfoByBizNo(bizNo)
						.get(0).getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

				assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId
																						+ "_v",
					merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
					productCode, null, productStatus.code(), gid, tradeAmount, currency.code(),
					null, null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
					buyerFee, getSysDate(), getSysDate(), getSysDate());
				//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
				assertdataTol(1, bizNo, payerUserId, payerTradeUerType, payerCardNo,
					payerAccountNo, buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
					merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
					productStatus.code(), gid, tradeAmount, currency.code(), null, null,
					payerUserId, payerRealName, queryTradePayInfoByBizNo(bizNo).get(0)
						.getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

				//	资金校验
				assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
				assertAcctransAccount(merchantAccountNo, merchantBalance);
				assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
				assertAcctransAccount(payerAccountNo,
					payerBalance.subtract(tradeAmount).subtract(buyerFee));
				assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
					tradeAmount);
				//			根据bizNo查询校验fast_pay_timeouts表数据
				assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(),
					timeoutAction, timeoutDate, null, null);
			}
			if (testId == 1021) {
				//				根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
				assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
					merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType,
					null, autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
					sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount,
					null, null, hasRefund, null, null, null, null, null, payMode, null, null,
					shareAmount, null, null);
				//	据bizNo查询校验trade_pay_info表数据
				assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
					querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId,
					null, null, supervisionAccNo, payMethod.code(), bankCode,
					personalCorporateType.code(), cardType.code(), null, null, pactNo,
					bankAccountNo, payerRealName, payCertNo, payCertType, null, null,
					userTerminalType.code(), payStatus, null, null, null, shareAmount, bailPayMoney, new Money());
				//	数据中心同步数据校验
				sleepTime(3);
				assertEquals(3, findDataTolByOutBizNo(bizNo).size());
				assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
					sellerAccountNo, sellerAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
					productCode, null, productStatus.code(), gid, tradeAmount, currency.code(),
					null, null, sellerUserId, sellerRealName, queryTradePayInfoByBizNo(bizNo)
						.get(0).getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

				assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId
																						+ "_v",
					merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
					productCode, null, productStatus.code(), gid, tradeAmount, currency.code(),
					null, null, null, null, queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(),
					buyerFee, getSysDate(), getSysDate(), getSysDate());

				//	资金校验
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
				assertAcctransAccount(merchantAccountNo, merchantBalance);
				assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
				assertAcctransAccountHistory(supervisionAccNo, merchantBalance, payAmount,
					payAmount);
				//			根据bizNo查询校验fast_pay_timeouts表数据
				assertFastPayTimeouts(0, bizNo, tradeStatus, timeoutTradeStatus.code(),
					timeoutAction, timeoutDate, null, null);
			}
			if (testId == 1022) {
				//		根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
				assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
					merchantUserId, merchantAccountNo, productStatusEnd.code(), inlet,
					nationalType, null, autoCloseDuration, null, null, null, null, sellerUserId,
					sellerCardNo, sellerAccountNo, sellerRealName, tradeAmount, currency.code(),
					foreignAmount, null, null, hasRefund, null, null, null, null, null, payMode,
					null, null, shareAmount, null, null);

				assertTradePayInfo(1, bizNo, payBizNo, batchNo, depositNo, payAmount, payAmount,
					querySource.code(), buyerFee, sellerFee, partnerFee, mergeFlag, null, null,
					null, supervisionAccNo, payMethod.code(), bankCode,
					personalCorporateType.code(), cardType.code(), null, null, null, null, null,
					null, null, null, null, userTerminalType.code(), payStatus, null, null, null,
					shareAmount, bailPayMoney, new Money());
				//	数据中心同步数据校验
				assertEquals(2, findDataTolByOutBizNo(bizNo).size());
				assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
					sellerAccountNo, sellerAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd,
					productCode, productCode, null, productStatusEnd.code(), gid, tradeAmount,
					currency.code(), null, null, sellerUserId, sellerRealName,
					queryTradePayInfoByBizNo(bizNo).get(0).getChargeNo(), buyerFee, getSysDate(),
					getSysDate(), getSysDate());

				assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId
																						+ "_v",
					merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
					merchantAccountNo, merchantAccountType, merchOrderNo, dataStatusEnd,
					productCode, productCode, null, productStatusEnd.code(), gid, tradeAmount,
					currency.code(), null, null, null, null, queryTradePayInfoByBizNo(bizNo).get(0)
						.getChargeNo(), buyerFee, getSysDate(), getSysDate(), getSysDate());

				//	资金校验
				assertAcctransAccount(sellerAccountNo, sellerBalance.add(tradeAmount));
				assertAcctransAccount(merchantAccountNo, merchantBalance);
				assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance.add(buyerFee));
				assertAcctransAccountHistory(supervisionAccNo, merchantBalance, payAmount,
					payAmount);
				//			根据bizNo查询校验fast_pay_timeouts表数据
				assertFastPayTimeouts(0, bizNo, tradeStatusEnd, timeoutTradeStatus.code(),
					timeoutAction, timeoutDate, null, null);
			}
		}

		if (testId == 1024) {
			assertNull(result.getForwardUrl());
			assertNull(result.getTradePaymentInfo());
			payInfoMemo = "风控拒绝交易付款,有风险，处罚成功！";
			//	根据merchantOrderNo和merchantCardNo查询校验Fastpay_record表数据
			assertFastPay(1, merchantOrderNo, partnerId, bizNo, productCode, gid, merchOrderNo,
				merchantUserId, merchantAccountNo, productStatus.code(), inlet, nationalType, null,
				autoCloseDuration, null, null, null, null, sellerUserId, sellerCardNo,
				sellerAccountNo, sellerRealName, tradeAmount, currency.code(), foreignAmount, null,
				null, hasRefund, null, null, null, null, null, payMode, null, null, shareAmount,
				null, null);
			//	据bizNo查询校验trade_pay_info表数据
			assertTradePayInfo(1, bizNo, null, depositAmount, payAmount, querySource.code(),
				buyerFee, sellerFee, partnerFee, mergeFlag, payerUserId, payerCardNo,
				payerAccountNo, supervisionAccNo, payMethod.code(), null, null, null, null, null,
				null, null, payerRealName, payCertNo, payCertType, null, null,
				userTerminalType.code(), payStatus, payInfoMemo, null, null);

			//	数据中心同步数据校验
			assertEquals(2, findDataTolByOutBizNo(bizNo).size());
			assertdataTol(1, bizNo, sellerUserId, sellerTradeUerType, sellerCardNo,
				sellerAccountNo, sellerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, sellerUserId,
				sellerRealName, null, null, getSysDate(), getSysDate(), null);

			assertdataTol(1, bizNo, merchantUserId + "_v", merchantTradeUerType, partnerId + "_v",
				merchantAccountNo + "_v", merchantAccountType, merchantUserId, partnerId,
				merchantAccountNo, merchantAccountType, merchOrderNo, dataStatus, productCode,
				productCode, null, productStatus.code(), gid, tradeAmount, currency.code(), null,
				null, null, null, null, null, getSysDate(), getSysDate(), null);
			//对于无支付账户的会员做交易时，数据中心所存储的数据是cardNo和accountNo后+"_v"，查询时不会被查出，只是技术幂等性实现策略
			assertdataTol(0, bizNo, payerUserId, payerTradeUerType, payerCardNo, payerAccountNo,
				buyerAccountType, merchantUserId, partnerId, merchantAccountNo,
				merchantAccountType, merchOrderNo, dataStatus, productCode, productCode, null,
				productStatus.code(), gid, tradeAmount, currency.code(), null, null, payerUserId,
				payerRealName, null, null, getSysDate(), getSysDate(), null);

			//	资金校验
			assertAcctransAccount(sellerAccountNo, sellerBalance);
			assertAcctransAccount(merchantAccountNo, merchantBalance);
			assertAcctransAccount(yjfChargeAccountNo, yjfChargeBalance);
			assertAcctransAccount(payerAccountNo, payerBalance);
			assertAcctransAccountHistory(supervisionAccNo, merchantBalance, merchantBalance,
				merchantBalance);
			//			根据bizNo查询校验fast_pay_timeouts表数据
			assertFastPayTimeouts(1, bizNo, tradeStatus, timeoutTradeStatus.code(), timeoutAction,
				timeoutDate, null, null);
		}

		if (testId == 1030 || testId == 1031 || testId == 1032) {
			assertEquals(bailPayMoney, findAcctransAccountByAccountNo(partnerId).getBalance());
			assertEquals(new Money(), findAcctransAccountByAccountNo(partnerId).getFreezeAmount());
			findAndUpdateStatusAcctransAccountByAccountNo(sellerAccountNo, accountStatusTwo);
		}

		if (testId == 1036) {
			assertNotifyMock(1, "paymentStatus", "FAIL", "gid", gid, "partnerId", partnerId, "merchOrderNo",
					merchOrderNo, "merchantOrderNo", merchOrderNo, "bizNo", bizNo, "amount",
					tradeAmount.toString(), "failReason", failReason, "chargeAmount", buyerFee.toString(), "notifyCustomMap", "{}",
					null, null, null, null, null, null, null, null);
		}

		//清除数据
		//	清除产品订单信息
		cleanFastPayByMerchantOrderNoAndMerchantCardNo(merchantOrderNo, partnerId);
		cleanFastPayTimeoutsByAll();
		cleanTradePayInfoByAll();
		//	清除商户与产品服务关系数据
		cleanMerchantSwitchInfoByProductCode(productCode);
		//	清除数据中心订单同步信息
		cleanDataTolAll();
		//	清除通知数据
		cleanNotifyMockAll();
		//	清除会员缓存
		deleteCustomerCache.deleteCustomerCache(buyerUserId, null, null, buyerUserId);
		deleteCustomerCache.deleteCustomerCache(sellerUserId, null, null, sellerUserId);
		deleteCustomerCache.deleteCustomerCache(merchantUserId, null, null, merchantUserId);
		deleteCustomerCache.deleteCustomerCache(payerUserId, null, null, payerUserId);
		//还原账户基本信息
		//		初始化易极付备付金、买家、卖家和平台商户的资金账户余额、账户状态和支付模型---------------------->
		InitAccountNoMoney(merchantAccountNo, new Money(), buyerAccountNo, new Money(),
			sellerAccountNo, new Money(), payerAccountNo, new Money(), yjfChargeAccountNo,
			new Money(), supervisionAccNo, new Money());
		//根据user_id修改customer_user表certify_status、user_status、runtime_status、 certifyRank数据,如果各更新对象为空 , 则取默认值
		updateToAllStatusCustomerUserByUserId(payerUserId, certifyStatusOld, null, null,
			payerCertifyRankOld.code());
		//	清除数据中心统计数据
		deleteCollection("EventResultData");
		deleteCollection("EventResultLog");
		// 清除识别规则数据
		cleanMultiAccountSceneRuleByInlet(inlet);
		cleanMultiAccountSceneRuleByInlet("09");
		//	清除资金管控规则数据
		cleanFcBusinessNewRule(partnerId);
		cleanfcPbcNewRule(accountLevel, currency.code());
		//	清除commonservices回执通知服务
		cleanOrderSimpleInfoByAll();
		//		清除支付引擎数据
		cleanPayDepositBackInstructionAll();
		cleanPayDepositInstructionAll();
		cleanTradeMainAll();
		cleanTradeAll();
		cleanBalanceTradeByUserId(buyerUserId);
		cleanCommandPayParamBymerchantId(partnerId);
	}

	/**
	 * 创建交易
	 * @param gid
	 * @param inlet
	 * @param partnerId
	 * @param merchantOrderNo
	 * @param merchOrderNo
	 * @param sellerUserId
	 * @param currency
	 * @param tradeAmount
	 * @param autoCloseDuration
	 * @param buyerUserId
	 * @param tradeName
	 * @param foreignCurrency
	 * @param foreignAmount
	 * @param rate
	 * @param memo
	 * @param strategy
	 * @param behavior
	 * @param chargeExtends
	 * @param dubboGroup
	 * @param dubboVersion
	 * @return
	 */
	private String fastPayCreateTrade(String gid, String inlet, String partnerId,
										String merchantOrderNo, String merchOrderNo,
										String sellerUserId, CurrencyEnum currency,
										Money tradeAmount, long autoCloseDuration,
										String buyerUserId, String tradeName, Date querydate,
										BankCodeEnum bankcode, Double rate, String memo,
										String strategy, String behavior, String chargeExtends,
										String dubboGroup, String dubboVersion,
										String sellerPactNo, String sellerMerchantId) {
		DubboNotifyInfoOrder dubboNotifyInfoOrder = new DubboNotifyInfoOrder();
		dubboNotifyInfoOrder.setDubboGroup(dubboGroup);
		dubboNotifyInfoOrder.setDubboVersion(dubboVersion);
		//		国际业务参数
		ForeignOrder foreignOrder = new ForeignOrder();
		foreignOrder.setBankCode(bankcode);
		foreignOrder.setQueryDate(querydate);
		foreignOrder.setRate(rate);
		//	主参数
		FastPayProductOrder order = new FastPayProductOrder();
		order.setGid(gid);
		order.setInlet(inlet);
		order.setPartnerId(partnerId);
		order.setMerchantOrderNo(merchantOrderNo);
		order.setMerchOrderNo(merchOrderNo);
		order.setSellerUserId(sellerUserId);
		order.setCurrency(currency);
		order.setTradeAmount(tradeAmount);
		//	非必填项
		order.setBuyerUserId(buyerUserId);//买家
		order.setTradeName(tradeName);
		order.setMemo(memo);
		order.setStrategy(strategy);
		order.setBehavior(behavior);
		order.setChargeExtends(chargeExtends);
		order.setSellerMerchantId(sellerMerchantId);
		if (autoCloseDuration != 0) {
			order.setAutoCloseDuration(autoCloseDuration);//未付款自动关闭时间（单位为分），默认值为10*24*60=14400分=10天
		}
		if (!currency.code().equals("CNY")) {
			order.setForeignOrder(foreignOrder);
		}
		if (dubboGroup != null && dubboVersion != null) {
			order.setDubboNotifyInfoOrder(dubboNotifyInfoOrder);
		}
		if (null != sellerPactNo) {
			order.setSellerUserId(null);
			order.setPactNo(sellerPactNo);
		}

		//调接口
		FastPayProductResult result = fastPayProductService.createTrade(order);
		assertNotNull(result.getBizNo());
		return result.getBizNo();
	}

	/**
	 *
	 * @param gid
	 * @param inlet
	 * @param partnerId
	 * @param merchantOrderNo
	 * @param merchOrderNo
	 * @param sellerUserId
	 * @param pactNo
	 * @param currency
	 * @param tradeAmount
	 * @param autoCloseDuration
	 * @param buyerUserId
	 * @param buyerRealName
	 * @param tradeName
	 * @param foreignCurrency
	 * @param foreignAmount
	 * @param rate
	 * @param memo
	 * @param strategy
	 * @param behavior
	 * @param chargeExtends
	 * @param dubboGroup
	 * @param dubboVersion
	 * @param outUserId
	 * @return
	 */
	private String commandPayCreateTrade(String gid, String inlet, String partnerId,
											String merchantOrderNo, String merchOrderNo,
											String sellerUserId, String pactNo,
											CurrencyEnum currency, Money tradeAmount,
											long autoCloseDuration, String buyerUserId,
											String buyerRealName, String tradeName, Date querydate,
											BankCodeEnum bankcode, Double rate, String memo,
											String strategy, String behavior, String chargeExtends,
											String dubboGroup, String dubboVersion, String outUserId) {
		DubboNotifyInfoOrder dubboNotifyInfoOrder = new DubboNotifyInfoOrder();
		dubboNotifyInfoOrder.setDubboGroup(dubboGroup);
		dubboNotifyInfoOrder.setDubboVersion(dubboVersion);
		// 国际业务参数
		ForeignOrder foreignOrder = new ForeignOrder();
		foreignOrder.setBankCode(bankcode);
		foreignOrder.setQueryDate(querydate);
		foreignOrder.setRate(rate);
		// 主参数
		CommandPayProductOrder order = new CommandPayProductOrder();
		order.setGid(gid);
		order.setInlet(inlet);
		order.setPartnerId(partnerId);
		order.setMerchantOrderNo(merchantOrderNo);
		order.setMerchOrderNo(merchOrderNo);
		order.setSellerUserId(sellerUserId);
		order.setPactNo(pactNo);
		order.setCurrency(currency);
		order.setTradeAmount(tradeAmount);
		// 非必填项
		order.setBuyerUserId(buyerUserId);// 买家
		order.setOutBuyerRealName(buyerRealName);
		order.setTradeName(tradeName);
		order.setMemo(memo);
		order.setStrategy(strategy);
		order.setBehavior(behavior);
		order.setChargeExtends(chargeExtends);
		order.setOutBuyerUserId(outUserId);
		if (autoCloseDuration != 0) {
			order.setAutoCloseDuration(autoCloseDuration);// 未付款自动关闭时间（单位为分），默认值为10*24*60=14400分=10天
		}
		if (!currency.code().equals("CNY")) {
			order.setForeignOrder(foreignOrder);
		}
		if (dubboGroup != null && dubboVersion != null) {
			order.setDubboNotifyInfoOrder(dubboNotifyInfoOrder);
		}

		// 调接口
		FastPayProductResult result = commandPayProductService.createTrade(order);
		assertNotNull(result.getBizNo());
		return result.getBizNo();
	}

	/**
	 * 创建有分润的订单
	 * @param gid
	 * @param inlet
	 * @param partnerId
	 * @param merchantOrderNo
	 * @param merchOrderNo
	 * @param sellerUserId
	 * @param currency
	 * @param tradeAmount
	 * @param autoCloseDuration
	 * @param buyerUserId
	 * @param tradeName
	 * @param foreignCurrency
	 * @param foreignAmount
	 * @param rate
	 * @param memo
	 * @param strategy
	 * @param behavior
	 * @param chargeExtends
	 * @param dubboGroup
	 * @param dubboVersion
	 * @param payeeUserId
	 * @param payeeUserId1
	 * @param shareAmount
	 * @return
	 */
	private String fastPayCreateTradeShare(String gid, String inlet, String partnerId,
											String merchantOrderNo, String merchOrderNo,
											String sellerUserId, CurrencyEnum currency,
											Money tradeAmount, long autoCloseDuration,
											String buyerUserId, String tradeName, Date querydate,
											BankCodeEnum bankcode, Double rate, String memo,
											String strategy, String behavior, String chargeExtends,
											String dubboGroup, String dubboVersion,
											String payeeUserId, String payeeUserId1,
											Money shareAmount, Money shareAmount1, String pactNo,
											ShareMethodEnum shareMethod) {
		DubboNotifyInfoOrder dubboNotifyInfoOrder = new DubboNotifyInfoOrder();
		dubboNotifyInfoOrder.setDubboGroup(dubboGroup);
		dubboNotifyInfoOrder.setDubboVersion(dubboVersion);
		//		国际业务参数
		ForeignOrder foreignOrder = new ForeignOrder();
		foreignOrder.setBankCode(bankcode);
		foreignOrder.setQueryDate(querydate);
		foreignOrder.setRate(rate);
		//	主参数
		FastPayProductOrder order = new FastPayProductOrder();
		order.setGid(gid);
		order.setInlet(inlet);
		order.setPartnerId(partnerId);
		order.setMerchantOrderNo(merchantOrderNo);
		order.setMerchOrderNo(merchOrderNo);
		order.setSellerUserId(sellerUserId);
		order.setPactNo(pactNo);
		order.setCurrency(currency);
		order.setTradeAmount(tradeAmount);
		//分润
		List<ShareProfitOrder> shareProfits = new ArrayList<ShareProfitOrder>();
		ShareProfitOrder shareProfitOrder = new ShareProfitOrder();
		shareProfitOrder.setPayeeUserId(payeeUserId);
		shareProfitOrder.setShareAmount(shareAmount);
		if (payeeUserId1 != null) {
			ShareProfitOrder shareProfitOrder1 = new ShareProfitOrder();
			shareProfitOrder.setPayeeUserId(payeeUserId1);
			shareProfitOrder.setShareAmount(shareAmount1);
			shareProfits.add(shareProfitOrder1);
		}
		shareProfits.add(shareProfitOrder);
		order.setShareProfits(shareProfits);
		if (null != shareMethod) {
			order.setShareMethod(shareMethod);
		}
		//	非必填项
		order.setBuyerUserId(buyerUserId);//买家
		order.setTradeName(tradeName);
		order.setMemo(memo);
		order.setStrategy(strategy);
		order.setBehavior(behavior);
		order.setChargeExtends(chargeExtends);
		if (autoCloseDuration != 0) {
			order.setAutoCloseDuration(autoCloseDuration);//未付款自动关闭时间（单位为分），默认值为10*24*60=14400分=10天
		}
		if (!currency.code().equals("CNY")) {
			order.setForeignOrder(foreignOrder);
		}
		if (dubboGroup != null && dubboVersion != null) {
			order.setDubboNotifyInfoOrder(dubboNotifyInfoOrder);
		}

		//调接口
		FastPayProductResult result = fastPayProductService.createTrade(order);
		assertNotNull(result.getBizNo());
		return result.getBizNo();
	}

	/**
	 * 根据outBizNo、userId和usertype查询校验数据中心表data_tol
	 * @param size
	 * @param outBizNo
	 * @param userId
	 * @param usertype
	 * @param cardNo
	 * @param accountNo
	 * @param accountTypeCa
	 * @param merchantUserId
	 * @param merchantCardNo
	 * @param merchantAccNo
	 * @param merchantAccTypeCa
	 * @param merchantOrderBizNo
	 * @param dataStatus
	 * @param bizType
	 * @param productCode
	 * @param subProductCode
	 * @param subDataStatus
	 * @param gid
	 * @param tradeAmount
	 * @param tradeCurrency
	 * @param operaingFlag
	 * @param bankAccountNo
	 * @param customerId
	 * @param realName
	 * @param chargeNo
	 * @param chargeAmount
	 * @param createTime
	 * @param updateTime
	 * @param finishedTime
	 * @return
	 */
	protected String assertdataTol(int size, String outBizNo, String userId, String usertype,
									String cardNo, String accountNo, String accountTypeCa,
									String merchantUserId, String merchantCardNo,
									String merchantAccNo, String merchantAccTypeCa,
									String merchantOrderBizNo, String dataStatus, String bizType,
									String productCode, String subProductCode,
									String subDataStatus, String gid, Money tradeAmount,
									String tradeCurrency, String operaingFlag,
									String bankAccountNo, String customerId, String realName,
									String chargeNo, Money chargeAmount, Date createTime,
									Date updateTime, Date finishedTime) {
		List<DataTolDO> DO = findDataTolByUserIdAndOutBizNoAndUsertype(userId, outBizNo, usertype);
		if (size <= 0) {
			assertEquals(0, DO.size());
			return null;
		} else {
			assertEquals(size, DO.size());
			assertEquals(cardNo, DO.get(0).getCardNo());
			assertEquals(accountNo, DO.get(0).getAccountNo());
			assertEquals(accountTypeCa, DO.get(0).getAccountTypeCa());
			assertEquals(merchantUserId, DO.get(0).getMerchantUserId());
			assertEquals(merchantCardNo, DO.get(0).getMerchantCardNo());
			assertEquals(merchantAccNo, DO.get(0).getMerchantAccNo());
			assertEquals(merchantAccTypeCa, DO.get(0).getMerchantAccTypeCa());
			assertEquals(merchantOrderBizNo, DO.get(0).getMerchantOrderBizNo());
			assertEquals(dataStatus, DO.get(0).getDataStatus());
			assertEquals(bizType, DO.get(0).getBizType());
			assertEquals(productCode, DO.get(0).getProductCode());
			assertEquals(subProductCode, DO.get(0).getSubProductCode());
			assertEquals(gid, DO.get(0).getGid());
			assertEquals(tradeAmount, DO.get(0).getTradeAmount());
			assertEquals(tradeCurrency, DO.get(0).getTradeCurrency());
			assertEquals(bankAccountNo, DO.get(0).getBankAccountNo());
			assertEquals(customerId, DO.get(0).getCustomerId());
			assertEquals(realName, DO.get(0).getRealname());
			assertEquals(chargeNo, DO.get(0).getChargeNo());
			assertEquals(chargeAmount, DO.get(0).getChargeAmount());
			assertEquals(operaingFlag, DO.get(0).getOperaingFlag());
			assertEquals(subDataStatus, DO.get(0).getSubDataStatus());
			if (createTime == null) {
				assertEquals(null, DateUtil.shortDate(DO.get(0).getCreateTime()));
			} else {
				assertEquals(DateUtil.shortDate(createTime),
					DateUtil.shortDate(DO.get(0).getCreateTime()));
			}
			if (updateTime == null) {
				assertEquals(null, DateUtil.shortDate(DO.get(0).getUpdateTime()));
			} else {
				assertEquals(DateUtil.shortDate(updateTime),
					DateUtil.shortDate(DO.get(0).getUpdateTime()));
			}
			if (finishedTime == null) {
				assertEquals(null, DateUtil.shortDate(DO.get(0).getFinishedTime()));
			} else {
				assertEquals(DateUtil.shortDate(finishedTime),
					DateUtil.shortDate(DO.get(0).getFinishedTime()));
			}
			return DO.get(0).getBizNo();
		}
	}

	protected String assertdataTolTwo(int size, String outBizNo, String userId, String usertype,
										String cardNo, String accountNo, String accountTypeCa,
										String merchantUserId, String merchantCardNo,
										String merchantAccNo, String merchantAccTypeCa,
										String merchantOrderBizNo, String dataStatus,
										String bizType, String productCode, String subProductCode,
										String subDataStatus, String gid, Money tradeAmount,
										String tradeCurrency, String operaingFlag,
										String bankAccountNo, String customerId, String realName,
										String chargeNo, Money chargeAmount, Date createTime,
										Date updateTime, Date finishedTime) {
		List<DataTolDO> DO = findDataTolByOutBizNoAndUsertype(outBizNo, usertype);
		if (size <= 0) {
			assertEquals(0, DO.size());
			return null;
		} else {
			assertEquals(size, DO.size());
			if (userId != null) {
				assertEquals(userId, DO.get(0).getUserId());
			}
			if (cardNo != null) {
				assertEquals(cardNo, DO.get(0).getCardNo());
			}
			if (accountNo != null) {
				assertEquals(accountNo, DO.get(0).getAccountNo());
			}
			if (accountTypeCa != null) {
				assertEquals(accountTypeCa, DO.get(0).getAccountTypeCa());
			}
			assertEquals(merchantUserId, DO.get(0).getMerchantUserId());
			assertEquals(merchantCardNo, DO.get(0).getMerchantCardNo());
			assertEquals(merchantAccNo, DO.get(0).getMerchantAccNo());
			assertEquals(merchantAccTypeCa, DO.get(0).getMerchantAccTypeCa());
			assertEquals(merchantOrderBizNo, DO.get(0).getMerchantOrderBizNo());
			assertEquals(dataStatus, DO.get(0).getDataStatus());
			assertEquals(bizType, DO.get(0).getBizType());
			assertEquals(productCode, DO.get(0).getProductCode());
			assertEquals(subProductCode, DO.get(0).getSubProductCode());
			assertEquals(gid, DO.get(0).getGid());
			assertEquals(tradeAmount, DO.get(0).getTradeAmount());
			assertEquals(tradeCurrency, DO.get(0).getTradeCurrency());
			//从数据库中获取索引
			String dataIndex = DO.get(0).getDataIndex();
			BatchMapInfo batchMapInfo1 = new BatchMapInfo();
			try {
				batchMapInfo1 = securityDataClient.queryBySecIndexs(dataIndex, null);
			} catch (Exception e) {
			}
			// 校验明文
			assertEquals(bankAccountNo, batchMapInfo1.getDataMap().get("bankAccountNo"));
			// 校验掩码
			assertEquals(DO.get(0).getBankAccountNo(), getMask(bankAccountNo));
			assertEquals(customerId, DO.get(0).getCustomerId());
			assertEquals(realName, DO.get(0).getRealname());
			assertEquals(chargeNo, DO.get(0).getChargeNo());
			assertEquals(chargeAmount, DO.get(0).getChargeAmount());
			assertEquals(operaingFlag, DO.get(0).getOperaingFlag());
			assertEquals(subDataStatus, DO.get(0).getSubDataStatus());
			if (createTime == null) {
				assertEquals(null, DateUtil.shortDate(DO.get(0).getCreateTime()));
			} else {
				assertEquals(DateUtil.shortDate(createTime),
					DateUtil.shortDate(DO.get(0).getCreateTime()));
			}
			if (updateTime == null) {
				assertEquals(null, DateUtil.shortDate(DO.get(0).getUpdateTime()));
			} else {
				assertEquals(DateUtil.shortDate(updateTime),
					DateUtil.shortDate(DO.get(0).getUpdateTime()));
			}
			if (finishedTime == null) {
				assertEquals(null, DateUtil.shortDate(DO.get(0).getFinishedTime()));
			} else {
				assertEquals(DateUtil.shortDate(finishedTime),
					DateUtil.shortDate(DO.get(0).getFinishedTime()));
			}
			return DO.get(0).getBizNo();
		}
	}

	/**
	 * 初始化易极付备付金、易极付收费帐户、买家、卖家和平台商户的资金账户余额、账户状态和支付模型，<br>
	 * 增加清除账务转账记录、 冻结记录、冻结历史、收费计费和收费记录；<br>
	 * 以下初始化账号merchantAccountNo和buyerAccountNo不能交换顺序，<br>
	 * 用例有使用merchantAccountNo作为转出方为潜规则
	 * @param merchantAccountNo
	 * @param merchantBalance
	 * @param buyerAccountNo
	 * @param buyerBalance
	 * @param sellerAccountNo
	 * @param sellerBalance
	 * @param payerAccountNo
	 * @param payerBalance
	 * @param yjfChargeAccountNo
	 * @param yjfChargeBalance
	 * @param supervisionAccNo
	 * @param supervisionBalance
	 */
	protected void InitAccountNoMoney(String merchantAccountNo, Money merchantBalance,
										String buyerAccountNo, Money buyerBalance,
										String sellerAccountNo, Money sellerBalance,
										String payerAccountNo, Money payerBalance,
										String yjfChargeAccountNo, Money yjfChargeBalance,
										String supervisionAccNo, Money supervisionBalance) {
		//初始化易极付备付金
		InitAcctransInforAcctransAccountByAccountNo("20120810000000006777", new Money(1000000000),
			new Money(), new Money(), new Money(), new Money(), new Money(), new Money(),
			new Money(), new Money(), new Money(), new Money());
		//初始化平台商
		if (merchantAccountNo != null) {
			InitAcctransInforAcctransAccountByAccountNo(merchantAccountNo, merchantBalance,
				new Money(), new Money(), new Money(), new Money(), new Money(), new Money(),
				new Money(), new Money(), new Money(), new Money());
		}
		//初始化买家
		if (buyerAccountNo != null) {
			InitAcctransInforAcctransAccountByAccountNo(buyerAccountNo, buyerBalance, new Money(),
				new Money(), new Money(), new Money(), new Money(), new Money(), new Money(),
				new Money(), new Money(), new Money());
		}
		//初始化卖家
		if (sellerAccountNo != null) {
			InitAcctransInforAcctransAccountByAccountNo(sellerAccountNo, sellerBalance,
				new Money(), new Money(), new Money(), new Money(), new Money(), new Money(),
				new Money(), new Money(), new Money(), new Money());
		}
		//初始化新买家
		if (payerAccountNo != null) {
			InitAcctransInforAcctransAccountByAccountNo(payerAccountNo, payerBalance, new Money(),
				new Money(), new Money(), new Money(), new Money(), new Money(), new Money(),
				new Money(), new Money(), new Money());
		}
		//初始化易极付收费账户
		if (yjfChargeAccountNo != null) {
			InitAcctransInforAcctransAccountByAccountNo(yjfChargeAccountNo, yjfChargeBalance,
				new Money(), new Money(), new Money(), new Money(), new Money(), new Money(),
				new Money(), new Money(), new Money(), new Money());
		}
		if (supervisionAccNo != null) {
			InitAcctransInforAcctransAccountByAccountNo(supervisionAccNo, supervisionBalance,
				new Money(), new Money(), new Money(), new Money(), new Money(), new Money(),
				new Money(), new Money(), new Money(), new Money());
		}
		//清除收费计费和收费记录
		cleanChargeCalDetailAll();
		cleanChargeFeeDetailAll();
		cleanBillingChargeLogAll();

		cleanAcctransAccountLogByAccountNo(merchantAccountNo);
		cleanAcctransTransLogByPayeeAccount(merchantAccountNo);
		cleanAcctransTransLogByPayerAccount(merchantAccountNo);
		cleanAcctransFreezeHistoryByAccountNo(merchantAccountNo);
		cleanAcctransFreezeLogByAccountNo(merchantAccountNo);

		cleanAcctransAccountLogByAccountNo(buyerAccountNo);
		cleanAcctransTransLogByPayeeAccount(buyerAccountNo);
		cleanAcctransTransLogByPayerAccount(buyerAccountNo);
		cleanAcctransFreezeHistoryByAccountNo(buyerAccountNo);
		cleanAcctransFreezeLogByAccountNo(buyerAccountNo);

		cleanAcctransAccountLogByAccountNo(sellerAccountNo);
		cleanAcctransTransLogByPayeeAccount(sellerAccountNo);
		cleanAcctransTransLogByPayerAccount(sellerAccountNo);
		cleanAcctransFreezeHistoryByAccountNo(sellerAccountNo);
		cleanAcctransFreezeLogByAccountNo(sellerAccountNo);

		cleanAcctransAccountLogByAccountNo(payerAccountNo);
		cleanAcctransTransLogByPayeeAccount(payerAccountNo);
		cleanAcctransTransLogByPayerAccount(payerAccountNo);
		cleanAcctransFreezeHistoryByAccountNo(payerAccountNo);
		cleanAcctransFreezeLogByAccountNo(payerAccountNo);
	}

	/**
	 * 根据accountNo查询校验表AcctransAccount数据
	 * @param accountNo
	 * @param balance
	 */
	protected void assertAcctransAccount(String accountNo, Money balance) {
		AcctransAccountDO accountDO = findAcctransAccountByAccountNo(accountNo);
		assertEquals(balance, accountDO.getBalance());
		assertEquals(new Money(), accountDO.getFreezeAmount());
		assertEquals(new Money(), accountDO.getSystemAmount());
		assertEquals(new Money(), accountDO.getCreditAmount());
	}

	/**
	 * 根据accountNo查询校验表AcctransAccount数据校验余额和历史
	 * @param accountNo
	 * @param balance
	 * @param historyDeposit
	 * @param historyPayer
	 */
	protected void assertAcctransAccountHistory(String accountNo, Money balance,
												Money historyDeposit, Money historyPayer) {
		AcctransAccountDO accountDO = findAcctransAccountByAccountNo(accountNo);
		assertEquals(balance, accountDO.getBalance());
		assertEquals(historyDeposit, accountDO.getHistoryDeposit());
		assertEquals(historyPayer, accountDO.getHistoryPayer());
		assertEquals(new Money(), accountDO.getFreezeAmount());
		assertEquals(new Money(), accountDO.getSystemAmount());
		assertEquals(new Money(), accountDO.getCreditAmount());
	}

	/**
	 * 关闭交易
	 * @param gid
	 * @param bizNo
	 * @param merchOrderNo
	 * @param partnerId
	 */
	protected void fastpayCloseTrade(String gid, String bizNo, String merchOrderNo, String partnerId) {
		FastPayCloseOrder order = new FastPayCloseOrder();
		order.setGid(gid);
		order.setBizNo(bizNo);
		order.setMerchOrderNo(merchOrderNo);
		order.setPartnerId(partnerId);
		fastPayProductService.closeTrade(order);
	}

	/**
	 * 模拟清算回执通知
	 * @param gid
	 * @param merchOrderNo
	 * @param partnerId
	 * @param currency
	 * @param depositId
	 * @param settleCode
	 * @param settleStatus
	 * @param amount
	 */
	protected void interchangeNotify(String gid, String merchOrderNo, String partnerId,
										CurrencyEnum currency, String depositId, String settleCode,
										PaySettleResultEnum settleStatus, Money amount,
										String accBankAccountNo, String accBankCode,
										String settleBizNo) {
		// ----------------------进入模拟清算调用支付引擎推进服务阶段
		// 模拟清算调用支付引擎
		OperationContext operationContext = new OperationContext();
		DepositAdvanceAckOrder depositOrder = new DepositAdvanceAckOrder();
		depositOrder.setCurrency(currency);
		depositOrder.setDepositId(depositId);
		depositOrder.setGid(gid);
		depositOrder.setOperationContext(operationContext);
		if (null != settleBizNo) {
			depositOrder.setSettleBizNo(settleBizNo);// 使用证件号来做为清算流水号
		} else {
			depositOrder.setSettleBizNo(OID.newID());// 使用证件号来做为清算流水号
		}
		depositOrder.setSettleCode(settleCode);
		depositOrder.setSettleDate(getSysDate());
		depositOrder.setSettleIdentity("interchange");
		depositOrder.setSettleOperator("operator");
		depositOrder.setSettleReason("清算原因描述");
		depositOrder.setStatus(settleStatus);
		depositOrder.setMerchOrderNo(merchOrderNo);
		depositOrder.setPartnerId(partnerId);
		depositOrder.setAmount(amount);
		depositOrder.setAccBankAccountNo(accBankAccountNo);
		depositOrder.setAccBankCode(accBankCode);
		depositOrder.setSettleChannelApi("ccb1032");
		depositAdvanceService.advanceDeposit(depositOrder, operationContext);
		try {
			Thread.sleep(7000);
		} catch (Exception e) {
		}
	}

	/**
	 * 付款服务
	 * @param payGid
	 * @param payMerchOrderNo
	 * @param payPartnerId
	 * @param bizNo
	 * @param payMethod
	 * @param source
	 * @param payerUserId
	 * @param pactNo
	 * @param protocolNo
	 * @param personalCorporateType
	 * @param cardType
	 * @param bankCode
	 * @param openid
	 * @param wxAppid
	 * @param deviceType
	 * @param authCode
	 * @return
	 */
	protected SingleTradePayResult fastPayTradePay(	String payGid,
													String payMerchOrderNo,
													String payPartnerId,
													String bizNo,
													PayMethodEnum payMethod,
													FastPayQuerySourceEnum source,
													String payerUserId,
													String pactNo,
													String protocolNo,
													PersonalCorporateTypeEnum personalCorporateType,
													DebitCreditTypeEnum cardType, String bankCode,
													String openid, String wxAppid,
													String deviceType, String authCode) {
		//		微信公众号、微信扫码、微信app、民生非标网银、
		Map<String, String> extensionParams = new HashMap<>();
		extensionParams.put("openid", openid);//微信公众号支付，需要传入的信息
		extensionParams.put("wxAppid", wxAppid);//微信APP支付，需要传入的信息
		extensionParams.put("deviceType", deviceType);//移动端操作系统类型;微信app支付必填，IOS/ANDROID
		extensionParams.put("authCode", authCode);//条码支付
		//		extensionParams.put("enpAccountCustNumber", enpAccountCustNumber);//民生对公非标网银，需要传入的信息，企业网银客户号

		PayBankOrder payBankOrder = new PayBankOrder();
		payBankOrder.setPersonalCorporateType(personalCorporateType);
		payBankOrder.setCardType(cardType);
		payBankOrder.setBankCode(bankCode);
		payBankOrder.setExtensionParams(extensionParams);
		//		payBankOrder.setMutableType(mutableType);
		//		payBankOrder.setBankAccountNo(bankAccountNo);
		SingleTradePayOrder order = new SingleTradePayOrder();
		order.setGid(payGid);
		order.setMerchOrderNo(payMerchOrderNo);
		order.setPartnerId(payPartnerId);
		order.setBizNo(bizNo);
		order.setPayMethod(payMethod);//支付方式选择
		order.setSource(source);//查询来源/支付来源
		//	以上为公共必填信息
		//	余额支付
		order.setPayerUserId(payerUserId);
		//	签约代扣支付
		order.setPactNo(pactNo);
		order.setProtocolNo(protocolNo);
		//	联名卡、微信app、第三方控件和微信公众号支付
		order.setPayBankOrder(payBankOrder);
		//调接口
		SingleTradePayResult result = tradePaymentService.singleTradePay(order);
		return result;
	}

	/**
	 * 关闭交易服务
	 * @param gid
	 * @param bizNo
	 * @param merchOrderNo
	 * @param partnerId
	 */
	private void closeTrade(String gid, String bizNo, String merchOrderNo, String partnerId) {
		FastPayCloseOrder order = new FastPayCloseOrder();
		order.setGid(gid);
		order.setBizNo(bizNo);
		order.setMerchOrderNo(merchOrderNo);
		order.setPartnerId(partnerId);
		//	调用关闭交易服务
		fastPayProductService.closeTrade(order);
	}

	/**
	 * 查询所有数据进行断言（只会有一条）
	 * @param size
	 * @param keyOne
	 * @param valueOne
	 * @param keyTwo
	 * @param valueTwo
	 * @param keyThree
	 * @param valueThree
	 * @param keyFour
	 * @param valueFour
	 * @param keyFive
	 * @param valueFive
	 * @param keySix
	 * @param valueSix
	 * @param keySeven
	 * @param valueSeven
	 * @param keyEight
	 * @param valueEight
	 * @param keyNine
	 * @param valueNine
	 * @param keyTen
	 * @param valueTen
	 */
	protected void assertNotifyMock(int size, String keyOne, String valueOne, String keyTwo,
									String valueTwo, String keyThree, String valueThree,
									String keyFour, String valueFour, String keyFive,
									String valueFive, String keySix, String valueSix,
									String keySeven, String valueSeven, String keyEight,
									String valueEight, String keyNine, String valueNine,
									String keyTen, String valueTen, String keyEleven,
									String valueEleven, String keyTwelve, String valueTwelve,
									String keyThirteen, String valueThirteen, String keyFourteen,
									String valueFourteen) {
				List<NotifymockDO> DO = findNotifyMockAll();
				if (size <= 0) {
					assertEquals(0, DO.size());
				} else {
					assertEquals(keyOne, DO.get(0).getKeyOne());
					assertEquals(valueOne, DO.get(0).getValueOne());
					assertEquals(keyTwo, DO.get(0).getKeyTwo());
					assertEquals(valueTwo, DO.get(0).getValueTwo());
					assertEquals(keyThree, DO.get(0).getKeyThree());
					assertEquals(valueThree, DO.get(0).getValueThree());
					assertEquals(keyFour, DO.get(0).getKeyFour());
					assertEquals(valueFour, DO.get(0).getValueFour());
					assertEquals(keyFive, DO.get(0).getKeyFive());
					assertEquals(valueFive, DO.get(0).getValueFive());
					assertEquals(keySix, DO.get(0).getKeySix());
					assertEquals(valueSix, DO.get(0).getValueSix());
					assertEquals(keySeven, DO.get(0).getKeySeven());
					assertEquals(valueSeven, DO.get(0).getValueSeven());
					assertEquals(keyEight, DO.get(0).getKeyEight());
					assertEquals(valueEight, DO.get(0).getValueEight());
					assertEquals(keyNine, DO.get(0).getKeyNine());
					assertEquals(valueNine, DO.get(0).getValueNine());
					assertEquals(keyTen, DO.get(0).getKeyTen());
					assertEquals(valueTen, DO.get(0).getValueTen());
					assertEquals(keyEleven, DO.get(0).getKeyEleven());
					assertEquals(valueEleven, DO.get(0).getValueEleven());
					assertEquals(keyTwelve, DO.get(0).getKeyTwelve());
					assertEquals(valueTwelve, DO.get(0).getValueTwelve());
					assertEquals(keyThirteen, DO.get(0).getKeyThirteen());
					assertEquals(valueThirteen, DO.get(0).getValueThirteen());
					assertEquals(keyFourteen, DO.get(0).getKeyFourteen());
					assertEquals(valueFourteen, DO.get(0).getValueFourteen());
				}
	}

	private String bailCreateMainTradeAndRecharge(String gid, String bizNo, String merchOrderNo,
													String partnerId, String tradeMemo,
													String tradeName, String buyerUserId,
													Money tradeAmount) {
		//创建主交易
		TradeMainCreateOrder createOrder = new TradeMainCreateOrder();
		createOrder.setGid(gid);
		createOrder.setPartnerId(partnerId);
		createOrder.setMerchOrderNo(merchOrderNo);
		createOrder.setTradeMemo(tradeMemo);
		createOrder.setTradeName(tradeName);
		TradeMainCreateResult result1 = bailApiFacade.tradeMainCreate(createOrder);

		//充值保证金
		BailRechargeOrder order = new BailRechargeOrder();
		order.setBuyerUserId(buyerUserId);
		order.setTradeName(tradeName);
		order.setTradeAmount(tradeAmount);
		order.setMainTradeNo(result1.getMainTradeNo());
		order.setGid(gid);
		order.setMerchOrderNo(TEST_MERCH_ORDER_NO);
		order.setPartnerId(partnerId);

		BailRechargeResult result = bailApiFacade.recharge(order);

		sleepTime(3);
		insertBalanceTrade(partnerId, buyerUserId, result1.getMainTradeNo(), tradeAmount,
			new Money(), 0, null, null, null, null, null, null, getSysDate(), getSysDate());

		String accountNo = partnerId;
		if (null != findCustomerAccountByAccountPropertyAndAccountTypeCa("test", "CUSTODIA_ACCOUNT")) {
			accountNo = findCustomerAccountByAccountPropertyAndAccountTypeCa("test",
				"CUSTODIA_ACCOUNT").getAccountNo();
		}
		InitAcctransInforAcctransAccountByAccountNo(accountNo, tradeAmount, new Money(),
			new Money(), new Money(), new Money(), new Money(), new Money(), new Money(),
			new Money(), new Money(), new Money());
		return result1.getMainTradeNo();
	}
}
