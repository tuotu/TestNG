/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package base;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.yjf.common.lang.util.DateUtil;
import org.antlr.grammar.v3.ANTLRv3Parser.finallyClause_return;
import org.springframework.test.context.ContextConfiguration;

import com.yjf.common.env.Env;
import com.yjf.common.lang.util.money.Money;
//import com.yjf.accounttrans.service.api.AccountPosFlushesService;
//import com.yjf.accounttrans.service.api.AccountPosService;
//import dal.mapper.customercore.CustomerBankSignTypeRelationDAO;

//import dal.mapper.customercore.CustomerBankSignTypeRelationDAO;

/**
 * 
 * @Filename PayCoreAutoDalTestParameters.java
 * 
 * @Description
 * 
 * @Version 1.0
 * 
 * @Author xiaoshide
 * 
 * @Email xshide@yiji.com
 * 
 * @History <li>Author: xiaoshide</li> <li>Date: 2012-6-25</li> <li>Version: 1.0
 * </li> <li>Content: create</li>
 * 
 */
// 加载数据库访问层配置
public class Parameters extends TestNGCore{
	protected final String		ENV										= Env.local.name();
																		
	// acctrans_account表
	protected final Money		TEST_BALANCE							= new Money(0);
	protected final Money		TEST_CREDIT_AMOUNT						= new Money(0);
	protected final Money		TEST_CREDIT_BALANCE						= new Money(0);
	protected final Money		TEST_FREEZE_AMOUNT						= new Money(0);
	protected final Money		TEST_SYSTEM_AMOUNT						= new Money(0);
	protected final Money		TEST_FLUSHES_AMOUNT						= new Money(0);
	protected final Money		TEST_HISTORY_PAYEE0						= new Money(0);
	protected final Money		TEST_HISTORY_PAYER0						= new Money(0);
	protected final Money		TEST_HISTORY_DEPOSIT0					= new Money(0);
	protected final Money		TEST_HISTORY_WITHDRAW0					= new Money(0);
	protected final Money		TEST_HISTORY_DEPOSIT_BACK0				= new Money(0);
	protected final Money		TEST_HISTORY_WITHDRAW_BACK0				= new Money(10000);
	protected final Money		TEST_HISTORY_PAYEE						= new Money(10000);
	protected final Money		TEST_HISTORY_PAYER						= new Money(10000);
	protected final Money		TEST_HISTORY_DEPOSIT					= new Money(10000);
	protected final Money		TEST_HISTORY_WITHDRAW					= new Money(10000);
	protected final Money		TEST_HISTORY_DEPOSIT_BACK				= new Money(10000);
	protected final Money		TEST_HISTORY_WITHDRAW_BACK				= new Money(10000);
	protected final String		TEST_USER_ID							= "2012071800a000000001";
	protected final String		TEST_SYNC_FLAG							= "FALSE";
	protected final String		TEST_ACCOUNT_ALIAS						= "test_account_alias";
	protected final String		TEST_ACCOUNT_TITLE_ID					= "test_account_titleid";
	protected final String		TEST_TITLE_NAME							= "test_title_name";
	protected final String		TEST_BALANCE_DIRECTION					= "testbalancedirection";
	protected final String		TEST_INDEPENDENT_ACCOUNT_NO				= "test1test1test1test1";
	protected final String		TEST_CHARGEEXTENDKEY_ID					= "chargeextendkey_id";
	protected final String		TEST_TARGET_BUSI_JOURNAL				= "test_target_busi_journal";
	protected final String		TEST_FLUSHES_TYPE						= "TEST_FLUSHES_TYPE";
	// report_bank_income_expenses表
	protected final Money		TEST_IN_AMOUNT							= new Money(0);
	protected final Money		TEST_OUT_AMOUNT							= new Money(0);
	protected final String		TEST_TRANS_DATE							= "2014-03-26 13:00:00";
	protected final String		TEST_DAILY_DATE							= "2014-03-26 06:00:00";
	// charge_fee_detail表
	protected final String		TEST_CHARGEFEEDETAIL_ID					= "123456";
	protected final String		TEST_CHARGE_FEE_STATUS					= "charge_fee_status";
	protected final String		TEST_DERECTION							= "CHARGE";
	protected final String		TEST_ACTIVE								= "ON";
	protected final String		TEST_FROMSYSTEM							= "MERCHANT_SYSTEM";
	protected final String		TEST_TRADENO							= "0123456";
	protected final String		TEST_MERCHANTUSERID						= "merchant_user_id";
	protected final String		TEST_MERCHANTCARDNO						= "merchant_card_no";
	protected final String		TEST_MERCHANTACCNO						= "merchant_acc_no";
	protected final String		TEST_MERCHANTORDERBIZNO					= "merchant_order_biz_no";
	protected final String		TEST_PROCESS_TYPE						= "PROCESS_WAITTING_SCHEDULE";
	protected final String		TEST_CENV								= "local";
	protected final String		TEST_EXTEND_PROPERTIES_CHARGE			= "";
	protected final String		TEST_PARTNER_ID_CHARGE					= "partnerId20131205000";
	protected final String		TEST_PARTNER_ID_CHARGE_error1			= "partnerId2013120500";
	protected final String		TEST_PARTNER_ID_CHARGE_error2			= "partnerId201312050009";
	protected final String		TEST_MERCH_ORDER_NO						= "merchOrderNo20131205000000023456";
	protected final String		TEST_MERCH_ORDER_NO_error1				= "";
	protected final String		TEST_MERCH_ORDER_NO_error2				= "merchOrderNo20131205merchOrderNo20131205merchOrderNo20131205AAAAB";
																		
	// charge_modify_log表
	protected final String		TEST_MODIFY_ENTITY						= "CHARGE_SHARE_CONTRACT";
	protected final String		TEST_IDENTIFIER							= "AP-2013032619142";
	protected final String		TEST_CONTENT							= "TEST_CONTENT";
	protected final String		TEST_ACTION								= "ADD";
	protected final String		TEST_OPERATOR_ID						= "123456";
	protected final String		TEST_OPERATOR_NAME						= "xiaoshide";
	protected final String		TEST_OPERATOR_IP						= "192.168.1.1";
	protected final String		TEST_EXTENION							= "TEST_EXTENION";
	protected final String		TEST_LOGIN_ID							= "test_login_id";
																		
	// charge_detail表
	protected final Money		TEST_CHARGE_AMOUNT						= new Money(10000);
	protected final Money		TEST_TOTAL_AMOUNT						= new Money(10000);
	protected final String		TEST_CHARGE_ID							= "test_charge_id";
	protected final String		TEST_TRADE_ID							= "test_trade_id";
	protected final String		TEST_TRADE_TYPE							= "test_trade_type";
	protected final String		TEST_CHARGE_ACCOUNT						= "test_trade_id";
	protected final String		TEST_CHARGE_STATUS						= "status";
	protected final String		TEST_OPERATOR							= "test_operator";
	protected final String		TEST_CUSTOMERID							= "test_customer_id";
																		
	// charge_idempotence表
	protected final String		TEST_OUT_INDEX							= "123213";
																		
	// charge_rule表
	protected final String		TEST_CHARGE_RULE_ID						= "123456";
	protected final String		TEST_CHARGE_TRADE_TYPE					= "test_charge_trade_type";
	protected final String		TEST_CHARGE_TYPE						= "test_charge_type";
	protected final String		TEST_CHARGE_PARAMETER					= "test_charge_parameter";
	protected final String		TEST_CREATER							= "test_creater";
	protected final String		TEST_MODIFER							= "test_modifer";
	// charge_share_contract表
	protected final int			TEST_EXENUM								= 1;
	protected final String		TEST_CONTRACT_CODE						= "test_contract_code";
	protected final String		TEST_CONTRACT_NAME						= "test_contract_name";
	protected final String		TEST_RETURN_PROFIT_ACCOUNT_NO			= "test_account_no";
	protected final String		TEST_BUYER_USER_NAME					= "test_buyer_user_name";
	protected final String		TEST_PAYER_USER_ID						= "test_payer_user_id";
	protected final String		TEST_PAYER_USER_NAME					= "test_payer_user_name";
	protected final String		TEST_MERCHANT_USER_NAME					= "test_merchant_user_name";
	protected final String		TEST_SELLER_USER_NAME					= "test_seller_user_name";
	protected final String		TEST_CHARGE_USE_TRADEROLE				= "test_charge_use_traderole";
	protected final String		TEST_CONTRACT_STATUS					= "test_contract_status";
	protected final String		TEST_SHARE_CYCLE						= "test_share_cycle";
	protected final String		TEST_EXTENION1							= "test_extenion1";
	// charge_share_record表
	protected final Money		TEST_TRADE_ALL_AMOUNT					= new Money(100);
	protected final Money		TEST_SHARE_ALL_AMOUNT					= new Money(100);
	// charge_product表
	protected final String		TEST_PRODUCT_CODE						= "test_product_code";
	protected final String		TEST_PRODUCT_NAME						= "test_product_name";
	protected final String		TEST_TRADE_BIZ_PRODUCT_CODE				= "test_trade_biz_product_code";
	protected final String		TEST_CUSTOMER_TYPE						= "B";
	protected final String		TEST_CHARGE_WAY							= "test_charge_way";
	protected final String		TEST_TOTAL_COUNT						= "test_total_count";
	protected final String		TEST_SUCCESS_COUNT						= "test_success_count";
	protected final String		TEST_PRODUCT_STATUS						= "test_product_status";
																		
	protected final String		TEST_PRICING_PLANNAME					= "test_pricing_planname";
																		
	// charge_product_rules表
	protected final String		TEST_CHARGE_PRODUCT_CODE				= "test_charge_product_code";
	protected final String		TEST_PAYER								= "test_payer";
	protected final String		TEST_PAYEE								= "test_payee";
	protected final String		TEST_CHARGE_FEE_TYPE					= "test_charge_fee_type";
	protected final String		TEST_CHARGE_RULE_TYPE					= "test_charge_rule_type";
	protected final String		TEST_CHARGE_PARAM						= "test_charge_param";
	// customer表
	protected final String		TEST_CUSTOMER_ID						= "test_customer_id";
	protected final String		TEST_CUSTOMER_NAME						= "test_customer_name";
	// customer_bank_card_info表
	protected final String		TEST_CUSTOMERBANKCARDINFO_ID			= "test_customerbankcardinfo_id";
	protected final String		TEST_BANK_CARD_NO						= "test_bank_card_no";
	protected final String		TEST_BANK_KEY							= "test_bank_key";
	protected final String		TEST_BANK_TYPE							= "test_bank_type";
	protected final String		TEST_BANK_CARD_TYPE						= "test_bank_card_type";
	protected final String		TEST_NAME								= "test_name";
	protected final String		TEST_GENDER								= "gender";
	protected final String		TEST_PROVINCE							= "test_province";
	protected final String		TEST_CITY								= "test_city";
	protected final String		TEST_ADDRESS							= "test_address";
	protected final String		TEST_BANKACCOUNT_TYPE					= "PERSONAL";
	protected final String		TEST_BIND_DEFAULT						= "Y";
	protected final String		TEST_SHORTCUT							= "shortcut";
	protected final String		TEST_SIGNNO								= "signN";
																		
	protected final String		Test_Event_Pricing_StrategyId			= "111";
	// customer_bank_card_info表
	protected final String		TEST_SIGN_TYPE							= "test_sign_type";
	// customer_business表
	protected final Money		TEST_REGISTERED_CAPITAL					= new Money(100000000);
	protected final String		TEST_CUSTOMERBUSINESS_ID				= "test_customerbusiness_id";
	protected final String		TEST_ENTERPRISE_NAME					= "test_enterprise_name";
	protected final String		TEST_ORGANIZATION_CODE					= "test_organization_code";
	protected final String		TEST_TAX_REGISTRATION_NO				= "test_tax_registration_no";
	protected final String		TEST_BUSINESS_LICENSE_TYPE				= "test_B_L_type";
	protected final String		TEST_REG_ADDRESS						= "test_reg_address";
	protected final String		TEST_LEGAL_REPRESENTATIVE_NAME			= "test_legal_representative_name";
	protected final String		TEST_LEGAL_REPRESENTATIVE_CARD_NO		= "test_legal_representative_card_no";
	protected final String		TEST_AGENT_NAME							= "test_agent_name";
	protected final String		TEST_AGENT_CARD_NO						= "test_agent_card_no";
	protected final String		TEST_CONTACT_PERSON_NAME				= "test_contact_person_name";
	protected final String		TEST_CONTACT_PHONE						= "test_con_phone";
	protected final String		TEST_FAX								= "test_fax";
	protected final String		TEST_WEB_SITE							= "test_web_site";
	protected final String		TEST_REGISTRATION_TAX_CODE				= "test_registration_tax_code";
	protected final String		TEST_LEGAL_REPRESENTATIVE_GENDER		= "M";
	protected final String		TEST_LEGAL_REPRESENTATIVE_EMAIL			= "test_legal_representative_email";
	protected final String		TEST_LEGAL_REPRESENTATIVE_MOBILE		= "t_l_mobile";
	protected final String		TEST_LEGAL_REPRESENTATIVE_PHONE			= "t_l_phone";
	protected final String		TEST_LEGAL_REPRESENTATIVE_FAX			= "t_l_fax";
	protected final String		TEST_LEGAL_REPRESENTATIVE_ADDRESS		= "test_legal_representative_address";
	protected final String		TEST_LEGAL_REPRESENTATIVE_ZIPCODE		= "t_l_zi";
	protected final String		TEST_CONTACT_PERSON_GENDER				= "M";
	protected final String		TEST_CONTACT_PERSON_EMAIL				= "test_contact_person_email";
	protected final String		TEST_CONTACT_PERSON_MOBILE				= "t_c_mobile";
	protected final String		TEST_CONTACT_PERSON_FAX					= "t_c_fax";
	protected final String		TEST_CONTACT_PERSON_ADDRESS				= "test_contact_person_address";
	protected final String		TEST_CONTACT_PERSON_ZIPCODE				= "t_c_zi";
	protected final String		TEST_LEGAL_CERT_TYPE					= "test_legal_cert_type";
	protected final Date		TEST_LEGAL_LIC_VALID_TIME				= com.yjf.common.lang.util.DateUtil
		.strToDtSimpleFormat("2050-06-02");
	protected final String		TEST_MAJ_SHOLDER_NAME					= "test_maj_sholder_name";
	protected final String		TEST_MAJ_SHOLDER_CERT_TYPE				= "test_maj_sholder_cert_type";
	protected final String		TEST_MAJ_SHOLDER_CERT_NO				= "test_maj_sholder_cert_no";
	protected final String		TEST_GENT_CERT_TYPE						= "test_gent_cert_type";
	protected final String		TEST_BUSI_LEGAL_CERT_NO					= "test_busi_legal_cert_no";
																		
	// customer_card
	protected final String		TEST_CARD_ALIAS							= "test_card_alias";
	protected final String		TEST_PARENT_CARD_NO						= "test_parent_card_no";
	protected final String		TEST_IS_DEFAULT							= "Y";
	protected final String		TEST_BIZ_TYPE_CODE						= "test_biz_Type_Code";
	protected final String		TEST_ACCOUNT_TYPE_CODE					= "test_account_type_code";
																		
	// customer_user
	protected final String		TEST_USER_ID_NUMBER						= "12345678911234567891";
	protected final String		TEST_USER_ID_LUOYING					= "20130926000000012345";
																		
	// customer_certify表
	protected final String		TEST_CUSTOMERCERTIFY_ID					= "test_customercertify_id";
	protected final String		TEST_CERT_STATUS						= "test_cert_status";
	protected final String		TEST_CERT_FROM							= "test_cert_from";
	protected final String		TEST_REAL_NAME							= "test_real_name";
	protected final String		TEST_EXECUTOR_ID						= "test_executor_id";
	protected final String		TEST_EXECUTOR_NAME						= "test_executor_name";
	protected final String		TEST_MASTER_USER_ID						= "test_master_user_id";
	protected final String		TEST_CERT_WAY							= "g";
	protected final String		TEST_RANK								= "test_rank";
																		
	// customer_individual表
	protected final String		TEST_SHOP_NAME							= "test_shop_name";
	protected final String		TEST_BUSINESS_LICENSE_NO				= "test_business_license_no";
	protected final String		TEST_BUSINESS_SCOPE						= "test_business_scope";
																		
	// customer_license_img_path表
	protected final String		TEST_CUSTOMER_LICENSE_IMG_PATH			= "test_customercertify_id";
	protected final String		TEST_BUSINESS_LICENSE_PATH				= "test_business_license_path";
	protected final String		TEST_BUSINESS_LICENSE_REAL_PATH			= "test_business_license_real_path";
	protected final String		TEST_BUSINESS_LICENSE_CACHET_PATH		= "test_business_license_cachet_path";
	protected final String		TEST_BUSINESS_LICENSE_CACHET_REAL_PATH	= "test_business_license_cachet_real_path";
	protected final String		TEST_CERT_FRONT_PATH					= "test_cert_front_path";
	protected final String		TEST_CERT_FRONT_REAL_PATH				= "test_cert_front_real_path";
	protected final String		TEST_CERT_BACK_PATH						= "test_cert_back_path";
	protected final String		TEST_CERT_BACK_REAL_PATH				= "test_cert_back_real_path";
	protected final String		TEST_OPENING_LICENSE_PATH				= "test_opening_license_path";
	protected final String		TEST_OPENING_LICENSE_REAL_PATH			= "test_opening_license_real_path";
	protected final String		TEST_GROUP_PHOTO_PATH					= "test_group_photo_path ";
	protected final String		TEST_GROUP_PHOTO_REAL_PATH				= "test_group_photo_real_path";
	protected final String		TEST_BUSINESS_PERMIT_PATH				= "test_business_permit_path";
	protected final String		TEST_BUSINESS_PERMIT_REAL_PATH			= "test_business_permit_real_path";
	protected final String		TEST_REGISTRATION_CERTIFICATE_PATH		= "test_tax_registration_certificate_path";
	protected final String		TEST_REGISTRATION_CERTIFICATE_REAL_PATH	= "test_tax_registration_certificate_real_path";
																		
	// customer_logon_app表
	protected final String		TEST_CUSTOMERLOGONAPP_ID				= "123456";
	protected final String		TEST_LOGON_ID							= "test_logon_id";
	protected final String		TEST_NEW_LOGON_ID						= "test_new_logon_id";
																		
	// customer_op_log表
	protected final String		TEST_CUSTOMEROPLOG_ID					= "test_customeroplog_id";
																		
	// customer_operator表
	protected final String		TEST_LOGIN_PASSWORD						= "wewe21";
	protected final String		TEST_PAY_PASSWORD						= "s1s212";
	protected final String		TEST_IS_ADMIN							= "A";
	protected final String		TEST_BALANCE_PAYMENT					= "test_balance_payment";
	protected final String		TEST_DELETE_FLAG						= "null";
	protected final String		TEST_LOGIN_PASSWORD_ERROR_TIMES			= "0";
	protected final String		TEST_PAY_PASSWORD_ERROR_TIMES			= "0";
	protected final String		TEST_LAST_LOGIN_IP						= "192.168.1.1";
	protected final String		TEST_OPERATOR_REAL_NAME					= "xiaosd";
	protected final String		TEST_OPERATOR_MOBILE					= "15024359535";
	protected final String		TEST_OPERATOR_EMAIL						= "xshide@yiji.com";
	protected final Integer		LOGIN_PASSWORD_VALID_TIME				= 60;
	// customer_person表
	protected final String		TEST_CUSTOMERPERSON_ID					= "test_customerperson_id";
	protected final String		TEST_PROFESSION							= "test_profession";
	protected final String		TEST_EDUCATION							= "test_education";
																		
	// customer_person表
	protected final String		TEST_CUSTOMER_REGION_ID					= "213213";
	protected final String		TEST_PARENT_ID							= "35435";
	protected final String		TEST_REGION_NAME						= "test_region_name";
	protected final String		TEST_REGION_ENAME						= "test_region_ename";
	protected final String		TEST_SORT								= "test_sort";
	// customer_sensitiveinfo_modify表
	protected final String		TEST_INFO_NAME							= "test_info_name";
	protected final String		TEST_OLD_VALUE							= "test_old_value";
	protected final String		TEST_NEW_VALUE							= "test_new_value";
	protected final String		TEST_IP_ADDRESS							= "test_ip_address";
	protected final String		TEST_MAC_ADDRESS						= "test_mac_address";
	// customer_user表
	protected final String		TEST_EXTERNAL_ID						= "test_external_id";
	protected final String		TEST_ACCOUNT_ID							= "test_account_id";
	protected final String		TEST_EMAIL								= "test_email";
	protected final String		TEST_USER_NAME							= "test_user_name";
	protected final String		TEST_USER_TYPE							= "P";
	protected final String		TEST_USER_STATUS						= "T";
	protected final String		TEST_CERTIFY_STATUS						= "A";
	protected final String		TEST_RUNTIME_STATUS						= "T";
	protected final String		TEST_CERTIFY_RANK						= "PERSON_NORMAL_RANK";
	protected final String		TEST_REG_IP								= "test_reg_ip";
	protected final String		TEST_REGISTER_FROM						= "test_register_from";
	protected final String		TEST_PHONE								= "test_phone";
	protected final String		TEST_MOBILE								= "test_mobile";
	protected final String		TEST_ZIP_CODE							= "642350";
	protected final String		TEST_ORIGIN_REGISTER_FROM				= "test_ori_reg_from";
	protected final String		TEST_EXT_USER_TYPE						= "test_ext_user_type";
	protected final String		TEST_DISTRICT							= "test_district";
	protected final String		TEST_USER_ALIAS							= "test_user_alias";
																		
	// customer_secure_question表
	protected final String		TEST_QUESTION_TITLE						= "test_question_title";
	protected final String		TEST_QUESTION_ANSWER					= "test_question_answer";
																		
	// customer_user_hierarchy表
	protected final String		TEST_PARENT_USER_ID						= "test_parent_user_id";
																		
	// merchant_card表
	protected final BigDecimal	MERCHANT_ID								= new BigDecimal(100000);
	// merchant_order_product_kv表
	protected final String		TEST_PRODUCT_KV							= "test_product_kv";
	protected final String		TEST_OP_TYPE_FROM						= "test_op_type_from";
	// merchant_switch_info表
	protected final String		TEST_SERVICE_VERSION					= "tesversion";
	protected final String		TEST_SYSTEM_FLAGE						= "test_system_flage";
	// merchant_mcc_group
	protected final String		TEST_GROUP_CODE							= "test_group_code";
	protected final String		TEST_GROUP_NAME							= "test_group_name";
	// merchant_mcc_info
	protected final String		TEST_MCC_CODE							= "test_mcc_code";
	protected final String		TEST_MCC_ID								= "test_mcc_id";
	protected final String		TEST_MCC_NAME							= "test_mcc_name";
	protected final String		TEST_GROUP_ID							= "test_group_id";
	// merchant_info表
	protected final String		TEST_MERCHANT_NAME						= "test_merchant_name";
	protected final String		TEST_CARD_NO							= "test_card_no";
	protected final String		TEST_STRATEGY_CODE						= "test_strategy_code";
	protected final String		TEST_CARD_NO1							= null;
	protected final String		TEST_DIGEST_ALG							= "test_digest_alg";
	protected final String		TEST_SECURITY_CHECK_CODE				= "test_security_check_code";
	protected final String		TEST_PRODUCT							= "test_product";
	protected final String		TEST_BIZ_TYPE_MERCHANT					= "test_biz_type_merchant";
	protected final String		TEST_REG_TYPE							= "test_reg_type";
	protected final String		TEST_BUSINESS_REGION					= "test_business_region";
	protected final String		TEST_BUSINESS_ADDRESS					= "test_business_address";
	protected final String		TEST_REGION								= "test_region";
	protected final String		TEST_LEGAL_LICENSE_TYPE					= "test_legal_license_type";
	protected final String		TEST_LEGAL_LICENSE_NO					= "test_legal_license_no";
	protected final String		TEST_SHORT_DETAIL						= "test_short_detail";
	protected final String		TEST_MERCHANT_LEVEL						= "test_merchant_level";
	protected final String		TEST_MERCHANT_FROM						= "test_merchant_from";
	protected final String		TEST_CHECK_STATUS						= "test_check_status";
	protected final String		TEST_REGISTER_STATUS					= "test_register_status";
	protected final String		TEST_SIGN_STATUS						= "test_sign_status";
	protected final String		TEST_EMPLOYEE_NUM						= "test_employee_num";
	protected final String		TEST_BUSINESS_AREA						= "test_business_area";
	protected final String		TEST_CUSTOMER_BASE						= "test_customer_base";
	protected final String		TEST_VOCATION							= "test_vocation";
	protected final String		TEST_OPERATION_MANAGER_ID				= "test_operation";
	protected final String		TEST_OPERATION_MANAGER_NAME				= "test_operation";
	protected final Money		TEST_TURN_OVER							= new Money(100000000);
	protected final Money		TEST_TRADING_VOLUME						= new Money(100000000);
	// merchant_info_contact表
	protected final String		TEST_CONTACT_PERSON_DEPARTMENT			= "test_contact_person_department";
	protected final String		TEST_CONTACT_PERSON_POSITION			= "test_contact_person_position";
	protected final String		TEST_CONTACT_ADDRESS					= "test_contact_address";
	protected final String		TEST_CONTACT_PERSON_PHONE				= "test_contact_person_phone";
	protected final String		TEST_CONTACT_PERSON_QQ					= "test_contact_person_qq";
	protected final String		TEST_CONTACT_PERSON_WECHAT				= "test_contact_person_wechat";
	protected final String		TEST_CONTACT_PERSON_MSN					= "test_contact_person_msn";
	protected final String		TEST_CONTACT_PERSON_VOCATION			= "test_contact_person_vocation";
	//merchant_order_channel表
	protected final String		TEST__BIZ_NAME							= "test_biz_name";
	protected final String		TEST_CHANNEL_TYPE						= "test_channel_type";
	// merchant_product_info_switch
	protected final String		TEST_TASK_OVER_FLAG						= "test_task_over_flag";
	// merchant_relation表
	protected final String		TEST_MERCHANT_RELATION_ID				= "test_merchant_relation_id";
	protected final String		TEST_PRIMARY_ID							= "test_primary_id";
	protected final String		TEST_SLAVE_ID							= "test_slave_id";
	protected final String		TEST_RELATION_TYPE						= "test_relation_type";
	protected final String		TEST_STATUS_MERCHANT					= "test_status";
	// merchant_product_info表
	protected final String		TEST_SERV_CODE							= "test_serv_code";
	protected final String		TEST_IS_SETTLE							= "test_is_settle";
	protected final String		TEST_PAYMENT_ROLE						= "test_payment_role";
	protected final String		TEST_USE_DOMAIN							= "test_use_domain";
	protected final String		TEST_CHARGE_ACCOUNT_MEMO				= "test_charge_account_memo";
	protected final String		TEST_GROUP_TYPE							= "test_group_type";
	protected final String		TEST_PRODUCT_PAREM						= "test_product_param";
	// merchant_serv_info表
	protected final String		TEST_SERV_NAME							= "test_serv_name";
	protected final String		TEST_SERV_TYPE							= "test_serv_type";
	protected final String		TEST_SERV_STATUS						= "test_serv_status";
	protected final String		TEST_INTERFACES							= "test_interfaces";
	protected final String		TEST_SERV_RENDER						= "test_serv_gender";
																		
	// merchant_order_info表
	protected final String		TEST_ORDER_NAME							= "test_order_name";
	protected final String		TEST_SELLMAN_ID							= "test_sellman_id";
	protected final String		TEST_SELLMAN_NAME						= "test_sellman_name";
	protected final String		TEST_IS_FREEZE							= "test_is_freeze";
	protected final String		TEST_OLD_ORDER_NO						= "test_old_order_no";
	protected final String		TEST_SIGN_FROM							= "test_sign_from";
	protected final String		TEST_ACTION_TYPE						= "test_action_type";
	protected final String		TEST_ALTER_OPFLAG						= "test_alter_opflag";
	protected final String		TEST_BIZ_SYSTEM							= "test_biz_system";
	protected final String		TEST_ALTER_OP_FLAG						= "test_alter_op_flag";
																		
	// merchant_order_account表
	protected final String		TEST_SIGN_ACCOUNT_NO					= "test_sign_account_no";
	protected final String		TEST_PRODUCT_INFO_SWITCH_TASK_ID		= "test_product_info_switch_task_id";
	// merchant_order_product_relation表
	protected final String		TEST_ORDER_RELATION_STATUS				= "test_order_relation_status";
	protected final String		TEST_PRE_CHARGE_FLAG					= "test_pre_charge_flag";
	protected final String		TEST_EXPIRE_TYPE						= "test_expire_type";
	// merchant_union
	protected final String		TEST_UNION_NAME							= "test_union_name";
	protected final String		TEST_UNION_PURPOSE						= "test_union_purpose";
	protected final String		TEST_UNION_ID							= "test_union_id";
	// merchant_switch_op_trace表
	protected final String		TEST_SWITCH_ID							= "test_switch_id";
	protected final String		TEST_TASK_TYPE							= "test_task_type";
	// salesman_info表
	protected final String		TEST_SALESMAN_ID						= "test_salesman_id";
	protected final String		TEST_SALESMAN_NAME						= "test_salesman_name";
	protected final String		TEST_SALESMAN_LEVEL						= "test_salesman_level";
	protected final String		TEST_DEPARTMENT_ID						= "test_department_id";
	protected final String		TEST_DEPARTMENT_NAME					= "test_department_name";
	protected final String		TEST_DEPARTMENT_PARENTS					= "test_department_parents";
	protected final String		TEST_DEPARTMENT_MEMO					= "test_department_memo";
																		// merchant_user_relation表
																		
	// pay_cardpay_payfrgn_access表
	protected final String		TEST_TO_NAME							= "test_to_name";
																		
	// merchant_product_ch_condition表
	protected final String		TEST_XML								= "test_xml";
	protected final String		TEST_TYPE_VALUE							= "test_type_value";
	// merchant_service_model表
	protected final String		TEST_MODEL_ID							= "test_model_id";
	protected final String		TEST_MODEL_NAME							= "test_model_name";
	// merchant_service_model_rel表
	protected final String		TEST_SERVICE_CODE						= "test_service_code";
	// merchant_arrearage_info表
	protected final String		TEST_CHARGE_CYCLE						= "test_charge_cycle";
	protected final String		TEST_REPAYMENT_DATE						= "test_repayment_date";
	protected final String		TEST_REMIN_EMAIL						= "test_remin_email";
	protected final String		TEST_REMIN_MOBILE						= "test_remin_mobile";
	protected final String		TEST_REMIN_DATE							= "test_remin_date";
	protected final String		TEST_CLOSE_BIZ							= "test_close_biz";
	// merchant_biz_product_code
	protected final String		TEST_PARTNER_ID							= "test_partner_id";
	protected final String		TEST_BIZ_PRODUCT_CODE					= "test_biz_product_code";
	protected final String		TEST_SERVICE_PARM						= "test_service_parm";
	protected final String		TEST_BANK								= "test_bank";
	protected final String		TEST_IS_PUBLIC							= "N";
	protected final String		TEST_PAY_WAY							= "test_pay_way";
	protected final String		TEST_VIP								= "test_vip";
	protected final String		TEST_RESERVE1							= "test_reserve1";
	protected final String		TEST_RESERVE2							= "test_reserve2";
	protected final String		TEST_RESERVE3							= "test_reserve3";
	protected final String		TEST_RESERVE4							= "test_reserve4";
	protected final String		TEST_RESERVE5							= "test_reserve5";
	// merchant_old_contract_prod_r
	protected final String		TEST_OLD_CONTRACT_ID					= "test_old_contract_id";
	protected final String		TEST_PRODUCT_CHARGE						= "test_product_charge";
	// merchant_old_contract_ingo
	protected final String		TEST_CONTRACT_NO						= "test_contract_no";
	protected final String		TEST_SIGN_ACCS							= "test_sign_accs";
	protected final String		TEST_OTHER_CHARGE						= "test_other_charge";
	protected final String		TEST_CONTRACT_CONTENT					= "test_contract_content";
	protected final String		TEST_CONTRACT_PATH						= "test_contract_path";
	protected final String		TEST_SELL_MAN_ID						= "test_sell_man_id";
	protected final String		TEST_SELL_MAN_NAME						= "test_sell_man_name";
																		
	// pay_channel_api_deposit表
	protected final String		TEST_BANK_ID							= "test_bank_id";
	protected final String		TEST_CHANNEL_NO							= "test_channel_no";
	protected final String		TEST_PRIORITY							= "0";
	protected final String		TEST_STATE								= "test_state";
																		
	// pay_channel_api_withdraw表
	protected final Money		TEST_PAY_LIMIT							= new Money(10000);
	protected final Money		TEST_FEE_RATE							= new Money(10000);
	protected final String		TEST_LOGO_URL							= "test_logo_url";
	protected final String		TEST_SUPPORT_UNION						= "Y";
	protected final String		TEST_INTER_BANK_TRANSFER				= "Y";
	protected final String		TEST_PUBLIC_PRIVATE_TAG					= "test_public_private_tag";
	protected final String		TEST_SUPPORT_DEDUCT						= "test_support_deduct";
	protected final String		TEST_PUBLIC_TAG							= "N";
	protected final String		TEST_ENV								= "local";
	protected final String		TEST_OWNER								= "DEFAULT";
	protected final String		TEST_BATCH								= "N";
																		
	// paycore_operation_context表
	protected final String		TEST_PAYCOREOPERATIONCONTEXT_ID			= "test_paycoreoperationcontext_id";
	protected final String		TEST_OPERATION_TYPE						= "test_operation_type";
	protected final String		TEST_OPERATION_ACTION					= "test_operation_action";
	protected final String		TEST_OPERATION_ID						= "test_operation_id";
	protected final String		TEST_OPERATION_NAME						= "test_operation_name";
	protected final String		TEST_OPERATION_IP						= "test_operation_ip";
																		
	// deposit_access_deduct表
	protected final String		TEST_DEPOSIT_ID							= "test_deposit_id";
	protected final String		TEST_MOBILE_NO							= "15024359535";
	protected final String		TEST_CERT_NO							= "43052419880527272x";
																		
	protected final String		TEST_VALID_DATE							= "date";
	protected final String		TEST_CVV2								= "123";
	protected final String		TEST_AUTH_ID							= "test_auth_id";
	protected final String		TEST_ORDER_ID							= "test_order_id";
	protected final String		TEST_TRANS_TIME							= "test_trans_time";
	protected final String		TEST_PASSWORD							= "password";
	protected final String		TEST_RESERVED							= "test_reserved";
	protected final String		TEST_SEQ_ID								= "test_seq_id";
																		
	// pay_deposit_access_deduct表
	protected final String		TEST_PAYDEPOSITACCESSDEDUCT_ID			= "123456";
	protected final String		TEST_ID									= "214324324";
	protected final String		TEST_PAY_ID								= "324324324";
	protected final String		TEST_LINK_USER_ID						= "456436456";
	protected final String		TEST_CHARGE_USER_ID						= "65765765767";
																		
	// pay_deposit_access_special表
	protected final String		TEST_PAYRECEIPTREGIST_ID				= "3243432";
	protected final String		TEST_BIZIDENTITY						= "TEST_BIZIDENTITY";
	protected final String		TEST_PAY_NO								= "TEST_PAY_NO";
	protected final String		TEST_OUT_BIZ_CONTEXT					= "TEST_OUT_BIZ_CONTEXT";
	protected final String		TEST_RECEIPTURL							= "TEST_RECEIPTURL";
																		
	// pay_receipt_regist表
	protected final String		TEST_TRADE_MARKET						= "xicai";
	protected final String		TEST_PAYDEPOSITACCESSSPECIAL_ID			= "3243245";
																		
	// pay_receipt_target表
	protected final String		TEST_PAYRECEIPTTARGET_ID				= "324234";
	protected final String		TEST_NEED_RECEIPT						= "test_need_receipt";
	protected final String		TEST_RECEIPTTYPE						= "test_receipttype";
	protected final String		TEST_REQ_SERVERHOST						= "test_req_serverhost";
	protected final String		TEST_TIMEOUT							= "60";
																		
	// pay_receipt_target表
	protected final Money		TEST_CHARGE								= new Money(10000);
	protected final String		TEST_PAYWITHDRAWACCESSSPECIAL_ID		= "324532432";
	protected final String		TEST_WITHDRAW_ID						= "324324";
	protected final String		TEST_PROV_NAME							= "重庆";
	protected final String		TEST_CITY_NAME							= "重庆市";
	protected final String		TEST_QUSER_ID							= "324532432";
	protected final String		TEST_CHARGE_OPTION						= "Y";
																		
	// pay_receipt_target表
	protected final String		TEST_PAYWITHDRAWTMPACCESS_ID			= "324324";
																		
	// pay_receipt_target表
	protected final Money		TEST_PAYA_MOUNT							= new Money(10000);
	protected final String		TEST_BANK_ADDRESS						= "test_bank_address";
	protected final String		TEST_SUB_TRANS_CODE						= "code";
	protected final String		TEST_WITHDRAW_TYPE						= "test_withdraw_type";
	protected final String		TEST_SPECIAL							= "test_special";
																		
	// pay_dishonour_instruction表
	protected final String		TEST_DISHONOUR_ID						= "123456";
	protected final String		TEST_CHARGE_RULE						= "YJH_EACH1";
	protected final String		TEST_NOTIFY_TRANS						= "TO";
	protected final String		TEST_DISHONOUR_TYPE						= "WITHDRAW_DISHONOUR";
																		
	// pay_deposit_back_instruction表
	protected final Money		TEST_PAYAMOUNT							= new Money(10000);
	protected final Money		TEST_PAYAMOUNTIN						= new Money(10000);
	protected final Money		TEST_REALAMOUNT							= new Money(10000);
	protected final String		TEST_DEPOSIT_BACK_ID					= "test_deposit_back_id";
	protected final String		TEST_DELAY								= "0";
	protected final String		TEST_REPEATING							= "N";
	protected final String		TEST_DEPOSIT_BACK_LINK_ID				= "test_back_link_id";
	protected final String		TEST_DELAY_TYPE							= "test_delay_type";
	protected final String		TEST_DEPOSIT_BACK_TYPE					= "test_deposit_back_type";
																		
	protected final long		TEST_PAY_DELAY							= 0;
																		
	// pay_deposit表
	protected final Money		TEST_PAY_AMOUNT							= new Money(10000);
	protected final Money		TEST_PAY_AMOUNT_IN						= new Money(10000);
	protected final Money		TEST_REAL_AMOUNT						= new Money(10000);
	protected final String		TEST_REQUEST_SYS_JOURNAL				= "test_request_sys_journal";
	protected final String		TEST_SUB_CONTRACT_CODE					= "subcode";
	protected final String		TEST_BIZ_IDENTITY						= "test_biz_identity";
	protected final String		TEST_PAY_CHANNEL_API					= "channel";
	protected final String		TEST_SETTLE_CHANNEL_API					= "settle";
	protected final String		TEST_ACCOUNT_NO							= "2012071800a000000001";
	protected final String		TEST_BANK_CNAPS_NO						= "test_bank_cnaps_no";
	protected final String		TEST_BANK_NAME							= "test_bank_name";
	protected final String		TEST_BANK_ACCOUNT_NO					= "test_bank_account_no";
	protected final String		TEST_ACCOUNT_NAME						= "test_account_name";
	protected final String		TEST_BANK_ACCOUNT_NAME					= "test_bank_account_name";
	protected final String		TEST_ACCOUNT_TYPE						= "account_type";
	protected final String		TEST_PAY_AMOUNT_CURRENCY				= "CNY";
	protected final String		TEST_REAL_AMOUNT_CURRENCY				= "CNY";
	protected final String		TEST_API_ACCESS							= "apiAccess";
	protected final String		TEST_TRANS_CODE							= "CODE";
	protected final String		TEST_SETTLE_BIZ_NO						= "biz_no";
	protected final String		TEST_SETTLE_IDENTITY					= "settle_identity";
	protected final String		TEST_GMT_SETTLE							= "test_gmt_settle";
	protected final String		TEST_SETTLE_CODE						= "settle_code";
	protected final String		TEST_SETTLE_REASON						= "test_settle_reason";
	protected final String		TEST_SETTLE_OPERATOR					= "test_settle_operator";
	protected final String		TEST_STATUS								= "SUBMIT_SETTLED";
	protected final String		TEST_PAYMODEL							= "1111111111111";
	protected final String		TEST_API_EXIT_BIZ_NO					= "biz_no";
	protected final String		TEST_INITIATOR							= "initia";
	protected final String		TEST_DEPOSIT_TYPE						= "deposit_type";
	protected final String		TEST_MEMO								= "test_memo";
	protected final String		TEST_SYSSEQ_ID							= "123456";
	protected final String		TEST_SYSSEQ_NAME						= "test_sysseq_name";
	protected final String		TEST_MERCHANT_ID						= "1254310";
	protected final String		TEST_ACCOUNT_DATE						= "19870613";
	protected final String		TEST_MERCHANT_CARD_NO					= "merchant_card_no";
	protected final String		TEST_MERCHANT_ACC_NO					= "merchant_acc_no";
	protected final String		TEST_MERCHANT_ORDER_BIZ_NO				= "orderbizno";
	protected final String		TEST_NOTIFY								= "NOTIFY";
	protected final String		TEST_PAY_SECURITY_STATUS				= "test_ecurity_status";
	protected final Money		TEST_REAL_CHARGE						= new Money(0);
																		
	// pay_cardpay_trans_instruction
	protected final String		TEST_CARD_PAY_TYPE_FLAG					= "card_pay_type_flag";
																		
	protected final String		TEST_RELATE_BATCH_NO					= "RelateBatchNo";
																		
	protected final String		TEST_BATCH_BIZ_TYPE						= "batchBizType";
	protected final String		TEST_FILE_NAME							= "AAAAAA";
	protected final String		TEST_BATCH_STATUS						= "batchStatus";
	protected final String		TEST_NOTIFU_MODE						= "SIGN_DUBBO_RECEIPT";
																		
	protected final String		TEST_BATCH_NO							= "1001";
	// acctrans_account_log表
	protected final Money		TEST_TRANS_AMOUNT						= new Money(10000);
	protected final String		TEST_BIZ_NO								= "10003545";
	protected final String		TEST_CHARGE_BIZ_NO						= "10003545";
	protected final String		TEST_ACC_BIZ_NO							= "10003545";
	protected final String		TEST_DIRECTION							= "test_direction";
	protected final String		TEST_IMMEDIATELY_FLAG					= "immediately";
	protected final String		TEST_OUT_ORDER_NO						= "test_out_order_no";
	protected final String		TEST_BUSI_BIZ_NO						= "10003324";
	protected final String		TEST_BUSINESS_CODE						= "jj10086";
																		
	protected final Date		TEST_BUSINESS_TRANS_TIME				= toDate("20150105000000");
	protected final Date		TEST_BUSINESS_TRANS_TIME1				= toDate("20150107000000");
	protected final Date		TEST_SETTLE_TIME						= toDate("20150106000000");
	protected final Date		TEST_SETTLE_TIME1						= toDate("20150108000000");
																		
	// acctrans_account_log_out表
	protected final String		TEST_CREATE_DESCRIPTION					= "test_create_description";
	protected final String		TEST_CUSTOM_FIELD						= "test_custom_field";
	protected final String		TEST_CUSTOM_FIELD2						= "test_custom_field2";
																		
	// acctrans_back_log表
	protected final String		TEST_TRADE_ORDER_NO						= "test_trade_order_no";
	protected final Money		TEST_BACK_TRANS_AMOUNT					= new Money(10000);
																		
	// acctrans_freeze_history表
	protected final Money		TEST_HISTORY_FREEZE_AMOUNT				= new Money(0);
	protected final Money		TEST_HISTORY_UNFREEZE_AMOUNT			= new Money(0);
	protected final String		TEST_IDENTITY							= "10003545";
	protected final BigDecimal	TEST_IDENTITY_1							= new BigDecimal(10003545);
																		
	// acctrans_freeze_log表
	protected final String		TEST_OUT_BIZ_NO							= "biz_no";
	protected final String		TEST_FREEZE_TYPE						= "test_freeze_type";
	protected final String		TEST_FREEZE_DIRECTION					= "FREEZE";
	// acctrans_trans_log表
	protected final String		TEST_PAYEE_ACCOUNT						= "test_payee_account";
	protected final String		TEST_PAYER_ACCOUNT						= "test_payer_account";
																		
	// acctrans_universal_transform表
	protected final String		TEST_UNIVERSAL_ORDER_NO					= "test_unioversal_order_no";
	protected final String		TEST_TARGET_ACCOUNT						= "test_target_account";
	protected final String		TEST_TRANSFORM_ACCOUNT					= "test_transform_account";
																		
	// trade_body表
	protected final Money		TEST_REFUND_AMOUNT						= new Money(10000);
	protected final Money		TEST_TRADE_AMOUNT						= new Money(10000);
	protected final String		TEST_MERCHANT_NO						= "test_merchant_no";
	protected final String		TEST_TRADE_NO							= "test_trade_no";
	protected final String		TEST_BUSINESS_SYS_NO					= "test_business_sys_no";
	protected final String		TEST_SOURCE_MERCHANT_NO					= "test_source_merchant_no";
	protected final String		TEST_BUYER_NO							= "test_buyer_no";
	protected final String		TEST_SELLER_NO							= "test_seller_no";
	protected final String		TEST_ORDER_NO							= "test_order_no";
	protected final String		TEST_TRADE_NAME							= "test_trade_name";
	protected final String		TEST_CHARGE_RULE_NO						= "test_charge_rule_no";
	protected final String		TEST_PAY_TYPE							= "test_pay_type";
	protected final String		TEST_REFUND								= "test_refund";
	protected final String		TEST_TRADE_STATUS						= "test_trade_status";
	protected final String		TEST_BUSINESS_TYPE						= "test_business_type";
	protected final String		TEST_ORDER_DISPLAY_URL					= "test_order_display_url";
	protected final String		TEST_TRADE_COMMENT						= "test_trade_comment";
	protected final String		TEST_CURRENCY							= "CNY";
	protected final String		TEST_TRADE_EXTEND						= "test_trade_extend";
																		
	// trade_charge_fee_detail表
	protected final Money		TEST_FUNDS_AMOUNT						= new Money(10000);
	protected final String		TEST_FUNDS_SOURCE						= "test_funds_source";
	protected final String		TEST_FUNDS_TARGET						= "test_funds_target";
	protected final String		TEST_FEE_TYPE							= "test_fee_type";
																		
	// trade_charge_fee_detail表
	protected final String		TEST_TRADECHARGERULE_ID					= "123456";
	protected final String		TEST_TRADE_CHARGE_RULE_NO				= "test_trade_charge_rule_no";
	protected final String		TEST_AMOUNT_EXPRESS						= "test_amount_express";
	protected final String		TEST_RULE_STATUS						= "test_rule_status";
	protected final String		TEST_YJF_ACCOUNT_NO						= "1";
	protected final String		TEST_SEQUENCE_NO						= "0";
																		
	// trade_history_stauts_detail表
	protected final String		TEST_TRADEHISTORYSTAUTSDETAIL_ID		= "123456";
	protected final String		TEST_TRADE_STAUTS						= "test_trade_stauts";
	protected final String		TEST_TRADE_ACTION						= "test_trade_action";
	protected final String		TEST_DESCRIPTION						= "test_description";
																		
	// trade_base_info表
	protected final Money		TEST_TOTAL_FEE							= new Money(0);
	protected final Money		TEST_SERVICE_FEE						= new Money(0);
	protected final Money		TEST_ESCOW_BALANCE						= new Money(0);
	protected final Money		TEST_RETURN_PROFIT_FEE					= new Money(0);
	protected final String		TEST_PRODUCT_MODEL_ID					= "test_product_model_id";
	protected final String		TEST_TRADE_FROM							= "test_trade_from";
	protected final String		TEST_BUYER_USER_ID						= "test_buyer_user_id";
	protected final String		TEST_BUYER_EMAIL						= "test_buyer_email";
	protected final String		TEST_BUYER_TYPE							= "test_buyer_type";
	protected final String		TEST_BUYER_NAME							= "test_buyer_name";
	protected final String		TEST_SELLER_USER_ID						= "test_seller_user_id";
	protected final String		TEST_SELLER_EMAIL						= "test_seller_email";
	protected final String		TEST_SELLER_TYPE						= "test_seller_type";
	protected final String		TEST_GATHERING_TYPE						= "test_gathering_type";
	protected final String		TEST_SELLER_NAME						= "test_seller_name";
	protected final String		TEST_BIZ_TYPE							= "test_biz_type";
	protected final String		TEST_BUYER_MEMO							= "test_buyer_memo";
	protected final String		TEST_SELLER_MEMO						= "test_seller_memo";
	protected final String		TEST_DETAIL_URL							= "test_detail_url";
	protected final String		TEST_TRADE_MEMO							= "test_trade_memo";
	protected final String		TEST_PARENT_NO							= "test_parent_no";
	protected final String		TEST_EXTENSION1							= "test_extension1";
	protected final String		TEST_EXTENSION2							= "test_extension2";
	protected final String		TEST_NOTIFY_URL							= "test_notifyUrl";
	protected final String		TEST_RETURN_URL							= "test_returnUrl";
	protected final String		TEST_ERROR_NOTIFY_URL					= "test_errorNotifyUrl";
																		
	// trade_basedata_charge表
	protected final String		TEST_TRADE_BASEDATA_CHARGE_ID			= "123456";
	protected final String		TEST_TRADE_PRODUCT						= "test_trade_product";
	protected final String		TEST_MERCHANT_USER_ID					= "21355466554444";
																		
	// trade_basedata_expire表
	protected final String		TEST_TRADE_BASEDATA_EXPIRE_ID			= "123456";
	protected final String		TEST_TRADE_EXPIRE_TIMES					= "90";
																		
	// trade_funds_info表
	protected final String		TEST_TRADE_FUNDS_INFO_ID				= "123456";
	protected final String		TEST_TRADE_TRADE_NO						= "TEST_TRADE_TRADE_DO";
	protected final String		TEST_TRADE_FUNDS_NO						= "TEST_TRADE_FUNDS_NO";
	protected final String		TEST_TRADE_PAYER						= "TEST_TRADE_PAYER";
	protected final String		TEST_TRADE_PAYEE						= "TEST_TRADE_PAYEE";
	protected final String		TEST_TRADE_TRADE_FUNDS_USE_TYPE			= "TEST_TRADE_TRADE_FUNDS_USE_TYPE";
																		
	// trade_goods_info表
	protected final Money		TEST_GOODS_PRICE						= new Money(10000);
	protected final Money		TEST_OTHER_FEE							= new Money(10000);
	protected final String		TEST_TRADE_GOODS_INFO_ID				= "123456";
	protected final String		TEST_GOODS_ID							= "test_goods_id";
	protected final String		TEST_GOODS_NAME							= "test_goods_name";
	protected final String		TEST_GOODS_MEMO							= "test_goods_memo";
	protected final String		TEST_GOODS_QUANTITY						= "test_goods_quantity";
	protected final String		TEST_GOODS_CATEGORY						= "test_goods_category";
	protected final String		TEST_REFER_URL							= "test_refer_url";
	// customer_mobile_bind表
	protected final int			ID										= 12345;
	protected final String		TEST_mobile								= "15556585566";
	protected final String		TEST_bind_status						= "TEST_bind_status";
	// trade_incidentals_info表
	protected final String		TEST_PAYER_ROLE							= "test_payer_Role";
																		
	// trade_logistics表
	protected final Money		TEST_TRANSPORT_FEE						= new Money(10000);
	protected final String		TEST_TRADE_LOGISTIC_ID					= "123456";
	protected final String		TEST_INVOICE_NO							= "test_invoice_no";
	protected final String		TEST_LOGISTICS_ID						= "test_logistics_id";
	protected final String		TEST_LOGISTICS_NAME						= "test_logistics_name";
	protected final String		TEST_LOGISTICS_STATUS					= "test_logistics_status";
	protected final String		TEST_TRANSPORT_TYPE						= "test_transport_type";
	protected final String		TEST_TRANSPORT_PAY_TYPE					= "test_transport_pay_type";
	protected final String		TEST_SEND_ADDRESS						= "test_send_address";
	protected final String		TEST_SHIPMENT_TYPE						= "test_shipment_type";
	protected final String		TEST_RECEIVE_ADDRESS					= "test_receive_address";
	protected final String		TEST_RECEIVE_FULLNAME					= "test_receive_fullname";
	protected final String		TEST_RECEIVE_PHONE						= "test_receive_phone";
	protected final String		TEST_RECEIVE_MOBILE						= "test_receive_mobile";
	protected final String		TEST_RECEIVE_POST_CODE					= "test_receive_post_code";
	protected final String		TEST_RECEIVE_AREA_CODE					= "test_receive_area_code";
	protected final String		TEST_RECEIVE_CONTACT_IM_TYPE			= "test_receive_contact_im_type";
	protected final String		TEST_RECEIVE_CONTACT_IM					= "test_receive_contact_im";
	protected final String		TEST_SEND_FULLNAME						= "test_send_fullname";
	protected final String		TEST_SEND_PHONE							= "test_send_phone";
	protected final String		TEST_SEND_MOBILE						= "test_send_mobile";
	protected final String		TEST_SEND_POST_CODE						= "test_send_post_code";
	protected final String		TEST_SEND_AREA_CODE						= "test_send_area_code";
	protected final String		TEST_SEND_CONTACT_IM_TYPE				= "test_send_contact_im_type";
	protected final String		TEST_SEND_CONTACT_IM					= "test_send_contact_im";
	protected final String		TEST_LOGISTICS_MEMO						= "test_logistics_memo";
	protected final String		TEST_SIGN_VOUCHER_NO					= "test_sign_voucher_no";
																		
	// trade_process表
	protected final Money		TEST_RECEIVE_FEE						= new Money(10000);
	protected final Money		TEST_SENDFEE							= new Money(10000);
	protected final Money		TEST_ADJUST_FEE							= new Money(10000);
	protected final Money		TEST_REFUND_FEE							= new Money(10000);
	protected final String		TEST_REFUND_FLAG						= "test_refund_flag";
	protected final String		TEST_PAYMENT_FLAG						= "test_payment_flag";
	protected final String		TEST_EXPIRE_DAYS						= "test_expire_days";
	protected final String		TEST_LOCK_STATUS						= "test_lock_status";
																		
	// trade_notify_task
	protected final String		TEST_TRADE_NOTIFY_TASK_ID				= "123321";
	protected final String		TEST_EXCUTE_STATUS						= "false";
	protected final String		TEST_URL								= "192.168.45.110";
	protected final String		TEST_DATA								= "传递参数";
	protected final String		TEST_EXECUTE_NUM						= "10";
																		
	// trade_refund表
	protected final String		TEST_TRADE_REFUND_ID					= "test_trade_refund_id";
	protected final String		TEST_REFUND_STATUS						= "test_refund_status";
	protected final String		TEST_REFUND_TYPE						= "test_refund_type";
	protected final String		TEST_REFUND_GOODS_NAME					= "test_refund_goods_name";
	protected final String		TEST_REFUND_GOODS_STATUS				= "test_refund_goods_status";
	protected final String		TEST_REFUND_REASON						= "test_refund_reason";
	protected final String		TEST_REFUND_BUYER_MEMO					= "test_refund_buyer_memo";
	protected final String		TEST_REFUND_SELLER_MEMO					= "test_refund_seller_memo";
	protected final String		TEST_SELLER_USERID						= "test_seller_userid";
	// trade_refund_info表
	protected final String		TEST_REFUND_NO							= "test_refund_no";
	// trade_status_context表
	protected final String		TEST_TRADE_STATUS_CONTEXT_ID			= "123456";
	protected final String		TEST_STATUS_NAME						= "test_status_name";
	protected final String		TEST_PRE_STATUS							= "test_pre_status";
																		
	// trade_timeout表
	protected final String		TEST_TRADE_TIMEOUT_ID					= "123456";
	protected final String		TEST_TIMEOUT_ACTION						= "test_timeout_action";
	protected final String		TEST_TIMEOUT_TASK_STATUS				= "test_timeout_task_status";
																		
	// tradefep_order_batch表
	protected final String		TEST_BATCH_ID							= "test_batch_id";
	protected final String		TEST_SYSTEM_ID							= "test_system_id";
	protected final String		TEST_CHARGE_FEE_DETAIL					= "test_charge_fee_detail";
	protected final String		TEST_BUYER_ID							= "test_buyer_id";
	protected final String		TEST_SELLER_ID							= "test_seller_id";
	protected final String		TEST_SELLER_OUT_USERNAME				= "test_seller_out_username";
	protected final String		TEST_ORDER_STATUS						= "test_order_status";
	protected final String		TEST_MESSAGE							= "test_message";
																		
	// trade_task表
	protected final String		TEST_FAIL_REASON						= "TIME_OUT";
																		
	// customer_user_extension_info表
	protected final String		TEST_OWNER_ID							= "test_owner_id";
	protected final String		TEST_OWNER_TYPE							= "test_owner_type";
	protected final String		TEST_EXTENSION_TYPE						= "test_extension_type";
	protected final String		TEST_EXTENSION_VALUE					= "test_extension_value";
	protected final String		TEST_EXTENSION_STATUS					= "test_extension_status";
	// customer_user_relation表
	protected final String		TEST_RELATION_USER_ID					= "test_relation_user_id";
	protected final String		TEST_SERVICE_STATUS						= "test_service_status";
	protected final String		TEST_SERVICE_TYPE						= "test_service_type";
																		
	// account_daily_change表
	protected final String		TEST_ACCOUNT_TITLE_TYPE					= "test_account_title_type";
	protected final String		TEST_ACCOUNT_TITLE_NAME					= "account_title_name";
	protected final String		TEST_ACCOUNT_TITLE_CODE					= "test_account_title_code";
	// account_entry表
	protected final String		TEST_ACCOUNT_ENTRY_TYPE					= "test_account_entry_type";
	protected final String		TEST_DEBIT_ACCOUNT_TITLE				= "test_debit_account_title";
	protected final String		TEST_DEBIT_ACCOUNT_LEDGER				= "test_debit_account_ledger";
	protected final String		TEST_CREDIT_ACCOUNT_TITLE				= "test_debit_account_title";
	protected final String		TEST_CREDIT_ACCOUNT_LEDGER				= "test_debit_account_ledger";
	protected final String		TEST_ENTRY_RULE_NAME					= "test_entry_rule_name";
	protected final String		TEST_ACCOUNTING_CODE					= "test_accounting_code";
	protected final String		TEST_PARTNER_ID_ACCOUNT					= "partnerId20131205000";
	protected final String		TEST_PARTNER_ID_ACCOUNT_error1			= "partnerId2013120500";
	protected final String		TEST_PARTNER_ID_ACCOUNT_error2			= "partnerId201312050009";
	protected final String		TEST_MERCH_ORDER_NO_ACCOUNT				= "merchOrderNo20131205000000023456";
	protected final String		TEST_MERCH_ORDER_NO_ACCOUNT_error1		= "";
	protected final String		TEST_MERCH_ORDER_NO_ACCOUNT_error2		= "merchOrderNo20131205merchOrderNo20131205merchOrderNo20131205AAAAB";
																		
	// account_title表
	protected final String		TEST_TITLE_ID							= "test_title_id";
	// account_total_check
	protected final Money		TEST_ACCTRANS_DEBIT_AMOUNT				= new Money(10000);
	protected final Money		TEST_ACCTRANS_CREDIT_AMOUNT				= new Money(10000);
	protected final Money		TEST_ACCOUNT_DEBIT_AMOUNT				= new Money(10000);
	protected final Money		TEST_ACCOUNT_CREDIT_AMOUNT				= new Money(10000);
	// merchant_service
	protected final int			TEST_SERVICE_ID							= 234567;
	protected final String		TEST_SERVICE_NAME						= "test_service_name";
	protected final String		TEST_SERVICE_CORE						= "test_service_core";
	protected final String		TEST_SERVICE_GROUP						= "test_service_group";
	protected final String		TEST_VALID								= "test_valid";
	protected final String		TEST_SERVICE_NUMBER						= "test_service_number";
	protected final String		TEST_SERVICE_CHILD_TYPE					= "test_service_child_type";
	protected final String		TEST_SERVICE_PROPERTY					= "test_service_property";
	protected final String		TEST_CHARGE_JUDGE						= "test_charge_judge";
	protected final String		TEST_CHARGE_CODE						= "test_charge_code";
	protected final String		TEST_CHECKENSTAND_CONFIG				= "test_checkenstand_config";
	protected final String		TEST_ROUTE_CONFIG						= "test_route_config";
	protected final String		TEST_CHARGE_PERIODS						= "test_charge_periods";
	protected final String		TEST_CHARGE_NAME						= "test_charge_name";
	protected final String		TEST_PRODUCT_CONFIG						= "test_product_config";
	protected final String		TEST_SIGN_CONFIG						= "test_sign_config";
	// merchant_switch_info
	protected final String		TEST_ISFREEZE							= "test_isfreeze";
	//merchant_service_traffic
	protected final String		TEST_TRAFFIC_TYPE						= "test_traffic_type";
	// merchant_goods_op_trace
	protected final String		TEST_GOODS_TYPE							= "test_goods_type";
	protected final String		TEST_OP_TYPE							= "test_op_type";
	// merchant_order_file
	protected final String		TEST_FILE_PATH							= "test_file_path";
																		
	// account_daily_change表
	protected final long		TEST_PRODUCT_ID							= 234567;
																		
	// trade_bank_info表;
	// protected final long TEST_TRADE_BANK_ID = 666789;
	protected final String		TEST_TRADE_ROLE							= "test_trade_role";
	protected final String		TEST_PAYENGINE_ACTION					= "test_payengine_action";
	protected final String		TEST_PAYENGINE_ACTION_ID				= "test_payengine_action_id";
																		
	// Trade_Biz_Product
	protected final BigDecimal	TEST_ID1								= new BigDecimal("1234");
	protected final String		TEST_YJF_CHARGE_NO						= "test_yif_charge_no";
	protected final String		TEST_BIZ_FLOW_NUMBERS					= "Numbers";
	protected final String		TEST_TRADE_ROLES						= "test_trade_roles";
	protected final String		TEST_DEFAULT_CHARGE_ROLE				= "charge_role";
	protected final String		TEST_DEFAULT_CHARGE_MODE_CODE			= "model_code";
	protected final String		TEST_RETURN_PROFIT_POLICY				= "Profit_Policy";
	protected final String		TEST_EXTENSION							= "extension";
	protected final Date		TEST_RAW_ADD_TIME						= new Date(20140509);
	protected final Date		TEST_RAW_UPDATE_TIME					= new Date(20140509);
																		
	// ------------------风控库--------------------
	// inspect_task核查任务表
	protected final String		TEST_ACTION_NAME						= "test_action_name";
	protected final String		TEST_PUNISH_SOURCE						= "test_punish_source";
	protected final String		TEST_RULE_NAME							= "test_rule_name";
	protected final String		TEST_RISK_ID							= "test_risk_id";
	protected final String		TEST_INSPECT_RESULT						= "test_inspect_result";
	protected final int			TEST_RISK_LEVEL							= 9;
	protected final Money		TEST_CASE_TOTAL_MONEY					= new Money(10000);
	protected final Money		TEST_CASE_LOSE_MONEY					= new Money(10000);
	protected final Money		TEST_FREEZE_MONEY						= new Money(10000);
	protected final String		TEST_IS_TEL_CHECK						= "test_y";
	protected final String		TEST_MAIN_TARGET_TYPE					= "test_target_type";
	protected final String		TEST_MAIN_TARGET						= "test_main_target";
																		
	// rule_condition规则条件表
	protected final String		TEST_CONDITION_ID						= "test_condition_id";
	protected final String		TEST_SCENE_RULE_ID						= "test_scene_rule_id";
	protected final String		TEST_CONDITION_PROPERTY_ID				= "test_condition_property_id";
	protected final String		TEST_COMPARE_SYMBOL						= "test_>";
	protected final String		TEST_VALUE								= "test_value";
																		
	// scene_rule场景规则表表
	protected final String		TEST_RULE_ID							= "test_rule_id";
	protected final String		TEST_RISK_TYPE							= "test_risk_type";
	protected final String		TEST_RULE_TYPE							= "test_rule_type";
	protected final String		TEST_PRODUCT_TYPE						= "test_product_type";
	protected final String		TEST_RECORD_RISK_FLAG					= "test_flag";
	protected final String		TEST_PUNISH_ACTION						= "test_punish_action";
	protected final String		TEST_PROCESSING_TYPE					= "test_processing_type";
	protected final String		TEST_CREATE_OPERATOR_ID					= "test_create_operator_id";
	protected final String		TEST_MODIFY_OPERATOR_ID					= "test_modify_operator_id";
	protected final String		TEST_MODIFY_REASON						= "test_modify_reason";
																		
	// syn_event安全核心同步事件表
	protected final String		TEST_EVENT_ID							= "test_event_id";
	protected final String		TEST_EVENT_NAME							= "test_event_name";
	protected final String		TEST_EVENT_TYPE							= "test_event_type";
	protected final String		TEST_CLIENT_IP							= "test_client_ip";
	protected final String		TEST_CLIENT_MAC							= "test_client_mac";
	protected final String		TEST_EXTEND_PROPERTIES					= "test_extend_properties";
																		
	// gid
	protected final String		TEST_GID_true							= "H01234560123420140311111009211234pm";
	protected final String		TEST_GID_true1							= "H01234560123420140311111009211234mm";
	protected final String		TEST_GID_error1							= "H01234560123420140311111009211234p";
	protected final String		TEST_GID_error2							= "H01234560123420140311111009211234pmm";
	protected final String		TEST_GID_error3							= "H0123456012342014031111100921123";
	protected final String		TEST_GID_error4							= "H01234560123420140311111009211234pmmmm";
																		
	protected final String		TEST_CHARGE_GID							= "H11234560123420140311111009211234pm";
	protected final String		TEST_CHARGE_GID_error1					= "H11234560123420140311111009211234p";
	protected final String		TEST_CHARGE_GID_error2					= "H11234560123420140311111009211234pmm";
	protected final String		TEST_CHARGE_GID_error3					= "H1123456012342014031111100921123";
	protected final String		TEST_CHARGE_GID_error4					= "H11234560123420140311111009211234pmmmm";
																		
	// 大数据增加数据
	protected final String		BIG_TEST_MERCHANT_USER_ID				= "20141210002014121103";
	protected final String		BIG_TEST_MERCHANT_CARD_NO				= "20141210002014121002";
	protected final String		BIG_TEST_MERCHANT_ACC_NO				= "20141210002014121001";
	protected final String		BIG_TEST_INLET							= "120";
	protected final String		BIG_TEST_MERCHANT_ORDER_BIZ_NO			= "merchantOrderBizNo";
																		
	// 权限库
	// perm_dictionary
	protected final String		TEST_DIC_TYPE							= "test_dic_type";
	protected final String		TEST_DIC_NAME							= "test_dic_name";
	protected final String		TEST_DIC_KEY							= "test_dic_key";
	protected final String		TEST_DIC_VALUE							= "test_dic_value";
	protected final String		TEST_EXTENSION_ONE						= "test_extension_one";
	protected final String		TEST_EXTENSION_TWO						= "test_extension_two";
	// perm_permission_extension
	protected final String		TEST_EXTENSION_THREE					= "test_extension_three";
	protected final String		TEST_EXTENSION_FOUR						= "test_extension_four";
	protected final String		TEST_EXTENSIONsTATUS					= "test_extenion_status";
	// protected final String TEST_EXTENSION_VALUE = "test_extenion_value";
	// perm_operation_log表
	protected final String		TEST_OPERATOR_TYPE						= "test_operation_type";
	protected final String		TEST_OPERATOR_CONTENT					= "test_operation_content";
	// protected final String TEST_OLD_VALUE = "test_old_value";
	// protected final String TEST_NEW_VALUE = "test_new_value";
	// protected final String TEST_OPERATION_IP = "test_operation_ip";
	protected final String		TEST_OPERATION_MAC						= "test_operation_mac";
	// perm_org表
	protected final String		TEST_ORG_NAME							= "test_org_name";
	protected final String		TEST_ORG_EXTENSION						= "test_org_extension";
	protected final String		TEST_CREATE_ID							= "test_created_id";
	protected final String		TEST_CREATE_TYPE						= "test_create_type";
	protected final String		TEST_IS_SELF_ROLE						= "test_is_self_role";
	// perm_org_relation表
	protected final long		TEST_ORG_ID								= 2548;
	protected final String		TEST_RELATION_CONTENT					= "test_relation_content";
	// perm_role表
	protected final String		TEST_ROLE_NAME							= "test_role_name";
	protected final String		TEST_ROLE_TYPE							= "test_role_type";
	protected final String		TEST_CUSTOMER_USER_ID					= "customer_user_id";
	// perm_user表
	protected final Integer		TEST_ATTEND_ID							= 60;
	// protected final String TEST_STATUS = "T";
	protected final String		TEST_ROLE_CODE							= "test_role_code";
	protected final String		TEST_CREATE_SYSTEM						= "test_create_system";
	// perm_permission_parent表
	// protected final long TEST_PARENT_ID = 25455;
	protected final String		TEST_PERM_NAME							= "test_perm_name";
	protected final String		TEST_PERM_CODE							= "test_perm_code";
	protected final String		TEST_PERM_TYPE							= "test_perm_type";
	protected final String		TEST_CALL_URL							= "test_call_url";
	protected final int			TEST_PERM_ORDER							= 2456;
	protected final String		TEST_ALARM_LEVEL						= "test_alarm_level";
	protected final String		TEST_PERM_INIT							= "Y";
	protected final String		TEST_PERM_STATUS						= "T";
	protected final String		TEST_PERMISSION_CODE					= "test_permission_code";
	// perm_role_permission表
	protected final long		TEST_PERMISSION_ID						= 2545;
	// system_relation表
	// protected final String TEST_RELATION_TYPE = "test_relation_type";
	protected final String		TEST_SYSTEM_FLAG						= "test_system_flag";
	protected final long		TEST_RELATION_ID						= 2254893;
	// protected final String TEST_MEMO = "test_memo";
	// perm_operator_role表
	protected final long		TEST_ROLE_ID							= 893;											
	// perm_permation_data表
	protected final String		TEST_SYS_CODE							= "test_sys_code";
	protected final String		TEST_SYS_NAME							= "test_sys_name";
	protected final String		TEST_SYS_TYPE							= "test_sys_type";
	protected final String		TEST_SYS_ADDRESS						= "test_sys_address";
	protected final String		TEST_PERMISSON_VALUE					= "test_permission_value";
	protected final String		TEST_PERM_TOP_CODE						= "test_perm_top_code";
	// system表
	protected final String		TEST_DATA_TYPE							= "test_data_type";
	protected final String		TEST_PERMISSION_VALUE					= "test_permission_value";
																		
	// channel_business_rule表
	protected final String		TEST_BIZ_CFG_CODE						= "test_biz_cfg_code";
																		
	// protected final String TEST_OWNER_ID = "test_owner_id";
	
	// account_carried_forward表
	protected final String		TEST_CENTRALIZE_ACCOUNT_NO				= "20131211000000777777";
																		
	// customer_account_biztag
	protected final String		ACCOUNT_NO								= "2014121800000666666";
	protected final String		TAG_TYPE								= "test_tag_type";
	protected final String		TAG_VALUE								= "test_tag_value";
																		
	// billing_charge_event表
	protected final String		TEST_INSTANCE_ID						= "10086";
	protected final String		TEST_EVENT_CODE							= "1020";
	protected final String		TEST_EVENT_NAMEC						= "test_event_name";
	protected final String		TEST_EVENT_DESC							= "test_event_desc";
	protected final String		TEST_MUSER_ID							= "test_muser_id";
	protected final String		TEST_CARD_NOC							= "test_card_no";
	protected final String		TEST_ACC_NO								= "test_acc_no";
	protected final String		TEST_OVER_CHARGE						= "test_over_charge";
	protected final String		TEST_YJF_ACCOUNT						= "test_yjf_account";
	protected final String		TEST_FROZE_ROLES						= "test_froze_roles";
	protected final String		TEST_IN_ROLE							= "test_in_role";
																		
	// billing_charge_instance表
	protected final String		TEST_INSTANCE_NAME						= "test_instance_name";
	protected final String		TEST_INSTANCE_DESC						= "test_instance_desc";
	protected final String		TEST_ORDER_CODE							= "test_order_code";
																		
	// billing_life_cycle表
	protected final String		TEST_STATE_CYCLE						= "test_state";
																		
	// billing_charge_section表
	protected final String		TEST_SECTION_NAME						= "test_section_name";
	protected final String		TEST_SECTION_CYCLE						= "test_section_name";
	protected final String		TEST_TEMPLATE_RULE						= "test_template_Rule";
	protected final String		TEST_PRIORITY_CHARGE					= "14";
	protected final String		TEST_EXPR_RULE							= "test_expr_rule";
	protected final String		TEST_PATTERN							= "test_pattern";
																		
	// billing_charge_action_rule表
	protected final String		TEST_SECTION_ID							= "test_section_id";
	protected final String		TEST_CAL_TYPE							= "FIXED_FEE";
	protected final String		TEST_CAL_RATE							= "5";
	protected final String		TEST_PAYER_ROLEC						= "TRADE_BUYER";
	protected final String		TEST_PAYER_ACCOUNTC						= "test_payer_account";
	protected final String		TEST_PAYEE_ROLEC						= "TRADE_SELLER";
	protected final String		TEST_PAYEE_ACCOUNTC						= "test_payee_account";
	protected final String		TEST_ACTION_TYPEC						= "test_action_type";
																		
	// billing_charge_log表
	protected final String		TEST_CHARGE_NO							= "test_charge_no";
	protected final String		TEST_TRANS_TYPE							= "test_trans_type";
	protected final String		TEST_MORDER_BIZ_NO						= "mOrderBizNo";
																		
	// billing_trans_log表
	protected final String		TEST_ACCOUNT_BIZ_NO						= "test_account_biz_no";
	protected final String		TEST_ACCOUNT_DAY						= "2015020310";
	protected final String		TEST_FAIL_MSG							= "test_fail_msg";
	protected final String		TEST_IS_FRZEE_PAYER						= "unFrzee";
																		
	protected final String		TEST_RECOGNITION_ID						= "test_recognition_id";
	protected final String		TEST_OPERATION							= "test_operation";
	protected final String		TEST_ACCOUNT_PROP						= "test_account_prop";
																		
	// customer_pact_common_info表
	protected final String		TEST_PACT_NO							= "test_pact_no";
	protected final String		TEST_GROUP_NO							= "test_group_no";
																		
	// 通用能力
	
	protected final long		TEST_SCENEID							= 1234567890;
	protected final String		TEST_BEHAVIOR							= "BEHAVIOR";
	protected final String		TEST_SCENEINLET							= "SCENEINLET";
	protected final String		TEST_SCENENAME							= "SCENENAME";
	protected final String		TEST_STRATEGY							= "STRATEGY";
	protected final long		TEST_ACCOUNTSCENERULEID					= 1234567890;
																		
	protected final String		TEST_STRING_SORT						= "测";
	protected final String		TEST_STRING_BOOL						= "B";
	protected final String		TEST_STRING								= "测试字符串";
	protected final int			TEST_INT								= 1;
	protected final long		TEST_LONG								= 11111;
	protected final Money		TEST_MONEY								= new Money(0);
	protected final Date		TEST_DATE								= getSysDate();
																		
	// 签约相关参数
	protected final String		TEST_UPUSER_No							= "test_upUser_no";
	protected final String		TEST_PACT_TYPE_NO						= "test_pact_type_no";
	protected final String		TEST_ON_OFF								= "ON";
	protected final String		TEST_VALIDITY_TIME						= "300";
	protected final String		TEST_RULE								= "snfr";
	protected final String		TEST_STATUS1							= "INIT";
	protected final String		TEST_BEFORE_OPERATAING_STATUS			= "INIT";
	protected final String		TEST_AFTER_OPERATAING_STATUS			= "APPLY";
	protected final String		TEST_UPUSER_NO							= "test_upuser_no";
	protected final String		TEST_UNION_BUSINESS_NO					= "test_business_no";
	protected final String		TEST_CARD_TYPE							= "DEBIT";
	protected final String		TEST_CERT_TYPE							= "ID";
	protected final String		TEST_CARD_NAME							= "test_card_name";
	protected final String		TEST_USER_PHONE_NO						= "13883245025";
	protected final String		TEST_PHONE_CODE							= "123456";
	protected final String		TEST_PROTOCOL_NO						= "12345";
	protected final String		TEST_BANK_SHORT							= "ABC";
	protected final String		TEST_PACT_TYPE							= "unionPass";
	protected final String		TEST_CODE								= "test_code";
	protected final String		TEST_BANK_PHONE_NO						= "test_bank_phone_no";
	protected final String		TEST_CNAPS								= "重庆";
	protected final String		TEST_PERAONAL							= "PERSONAL";
	protected final String		TEST_ORDERNO							= "test_orderno";
	protected String			TEST_PARTNERID							= "test_partnerid";
	protected String			TEST_PURPOSE							= "DEDUCT";
	protected String			TEST_GID								= "testgid1000000000000000000000000001";
	protected String			TEST_INLET								= "01";
	protected String			TEST_SUBBRANCH							= "支行";
	protected String			TEST_EXTEND								= "{'signNo':'12345678','depositId':'20150228082057065404'}";
	protected String			OPERATOR_NAME							= "zhaoyunTest";
	protected String			TEST_PACT_NAME							= "test_pact_name";
	protected Integer			TEST_SAFE_LEVEL							= 1;
	protected String			TEST_PACT_URL							= "test_pact_url";
	protected String			TEST_PROTOCOL_CHILD_NO					= "test_protocol_child_no";
	// 金融签约参数
	protected final String		TEST_SERIAL_NUMBER						= "testserial";
	protected final String		TEST_YJF_SIGN_STATUS					= "YF";
	// 会员相关参数
	protected String			TEST_PERSONAL_CORPORATE_TYPE			= "PERSONAL";
	protected String			TEST_BANK_CODE							= "ABC";
	protected String			TEST_PACT_STATUS						= "PACT";
																		
	// 实名认证相关常量
	// access表数据
	protected final String		TEST_LEVEL								= "testLevel";
	protected final Byte		TEST_ORDER								= 0;
	protected final String		TEST_ADD_USER_ID						= "testAddUserId";
	protected final String		TEST_ADD_USER_NAME						= "testAddUserName";
	protected final String		TEST_UPDATE_USER_ID						= "testUpdateUserId";
	protected final String		TEST_UPDATE_USER_NAME					= "testUpdateUserName";
	protected final String		TEST_REMARK								= "testRemark";
	// access_relation
	protected final String		TEST_PID								= "TEST_PID";
	protected final String		TEST_AC_ID								= "TEST_AC_ID";
	protected final String		TEST_EXCLUDETOPID						= "TEST_EXCLUDETOPID";
	// common_certify
	protected final String		TEST_USER_IYPE							= "P";
	protected final String		TEST_ATTRIBUTION						= "LAND";
	protected final String		TEST_SOURCE								= "PERSONAL_EDITION";
	protected final String		TEST_STATUS2							= "CP";
	protected final String		TEST_PROMOTE_STATUS						= "UN";
	protected final int			TEST_CERT_VALID_TIME					= 20030521;
	protected final String		TEST_METHOD								= "0x00000001";
	protected final String		TEST_IS_CANCEL_APPLY					= "N";
	protected final String		TEST_IS_PROLONG							= "N";
	protected final String		TEST_AUDITPIC							= "TEST_AUDITPIC";
	protected final String		TEST_AUDIT_USER_ID						= "TEST_AUDIT_USER_ID";
	protected final String		TEST_AUDIT_USER_NAME					= "TEST_AUDIT_USER_NAME";
	protected final String		TEST_DENY_USER_ID						= "TEST_DENY_USER_ID";
	protected final String		TEST_DENY_USER_NAME						= "TEST_DENY_USER_NAME";
	protected final String		TEST_CHECK_USER_ID						= "TEST_CHECK_USER_ID";
	protected final String		TEST_CHECK_USER_NAME					= "TEST_CHECK_USER_NAME";
	protected final String		TEST_FORCE_DENY_USER_ID					= "Deny201405261928";
	protected final String		TEST_FORCE_DENY_USER_NAME				= "TEST_FORCE_DENY_USER_NAME";
	protected final String		TEST_HOLD_CERT_PIC						= "TEST_HOLD_CERT_PIC";
	protected final String		TEST_HALF_BODY_PIC						= "TEST_HALF_BODY_PIC";
	// certify_history
	protected final String		TEST_OPERATOR_USER_ID					= "00000000";
	protected final String		TEST_OPERATOR_USER_NAME					= "TEST_OPERATOR_USER_NAME";
	protected final String		TEST_PUBLIC_APP_WEB_PATH				= "TEST_PUBLIC_APP_WEB_PATH";
	protected final String		TEST_PUBLIC_APP_PHYSICAL_PATH			= "TEST_PUBLIC_APP_PHYSICAL_PATH";
	// person_certify
	protected final String		TEST_SEX								= "TEST_SEX";
	protected final String		TEST_COUNTRY							= "China";
	// business_certify
	protected final String		TEST_COM_NAME							= "TEST_COM_NAME";
	protected final String		TEST_LICENCE_NO							= "TEST_LICENCE_NO";
	protected final String		TEST_LICENCE							= "TEST_LICENCE";
	protected final String		TEST_LICENCE_COPY						= "TEST_LICENCE_COPY";
	protected final String		TEST_LEGAL_PERSON_NAME					= "TEST_LEGAL_PERSON_NAME";
	protected final String		TEST_LEGAL_PERSON_CERT_FRONT_PATH		= "TEST_LEGAL_PERSON_CERT_FRONT_PATH";
	protected final String		TEST_LEGAL_PERSON_CERT_BACK_PATH		= "TEST_LEGAL_PERSON_CERT_BACK_PATH";
	protected final String		TEST_LEGAL_PERSON_HOLD_CERT_PIC			= "TEST_LEGAL_PERSON_HOLD_CERT_PIC";
	protected final String		TEST_AGENT_PERSON_NAME					= "TEST_AGENT_PERSON_NAME";
	protected final String		TEST_AGENT_PERSON_CERT_NO				= "TEST_AGENT_PERSON_CERT_NO";
	protected final String		TEST_AGENT_PERSON_CERT_TYPE				= "ID";
	protected final String		TEST_AGENT_PERSON_CERT_FRONT_PATH		= "TEST_AGENT_PERSON_CERT_FRONT_PATH";
	protected final String		TEST_AGENT_PERSON_CERT_BACK_PATH		= "TEST_AGENT_PERSON_CERT_BACK_PATH";
	protected final String		TEST_AGENT_PERSON_PHONE					= "TEST_AGENT_PHONE";
	protected final String		TEST_BACK_LETTER_PIC					= "TEST_BACK_LETTER_PIC";
																		
	protected final String		TEST_HOLDING_NAME						= "TEST_HOLDING_NAME";
	protected final String		TEST_HOLDING_CERT_FRONT_PATH			= "TEST_HOLDING_CERT_FRONT_PATH";
	protected final String		TEST_HOLDING_CERT_BACK_PATH				= "TEST_HOLDING_CERT_BACK_PATH";
	protected final String		TEST_IS_LEGAL_PER_AUDIT					= "N";
	protected final String		TEST_TAX_AUTHORITY_NO					= "TEST_TAX_AUTHORITY_NO";
	protected final String		TEST_HOLDING_TYPE						= "ID";
	// person_non_mainland_certify
	protected final String		TEST_GURANTEE_NAME						= "TEST_GURANTEE_NAME";
	protected final String		TEST_GUARANTEE_CERT_FRONT_PATH			= "TEST_GUARANTEE_CERT_FRONT_PATH";
	protected final String		TEST_GUARANTEE_CERT_BACK_PATH			= "TEST_GUARANTEE_CERT_BACK_PATH";
	protected final String		TEST_GUARANTEE_PIC						= "TEST_GUARANTEE_PIC";
	protected final String		TEST_GUARNTEE_PHONE						= "TEST_GUARNTEE_PHONE";
	protected final String		TEST_EXAMINE_USER_ID					= "TEST_EXAMINE_USER_ID";
	protected final String		TEST_EXAMINE_USER_NAME					= "TEST_EXAMINE_USER_NAME";
	protected final String		TEST_IS_RECORDED						= "N";
	protected final String		TEST_OCCUPATION							= "TEST_OCCUPATION";
	protected final String		TEST_SALARY								= "TEST_SALARY";
	// notify_info
	protected final String		TEST_EXTEND_TEXT						= "TEST_EXTEND_TEXT";
	// notify_fail_log
	protected final String		TEST_PUSH								= "TEST_PUSH";
	// cancel_apply_history
	protected final String		TEST_HIS_ID								= "TEST_HIS_ID";
	// non_mainland_call_back
	protected final String		TEST_CB_INFO							= "TEST_CB_INFO";
	protected final String		TEST_CALL_BACK_OPERATOR_ID				= "TEST_CALL_BACK_OPERATOR_ID";
	protected final String		TEST_CALL_BACK_OPERATOR_NAME			= "TEST_CALL_BACK_OPERATOR_NAME";
	// business_non_mainland_certify
	protected final String		TEST_CERTIFICATE						= "TEST_CERTIFICATE";
	protected final String		TEST_SCOPE								= "TEST_SCOPE";
	protected final String		TEST_LEGAL_PERSON_CERT_TYPE				= "LEGALPERSONCERTTYPE";
	protected final String		TEST_LEGAL_PERSON_CERT_NO				= "000000000000000000";
	// certify_for_limit
	protected final String		TEST_BALANCE_VIOLATE					= "N";
	protected final String		TEST_AMOUNT_VIOLATE						= "N";
	// business_certify_completion
	protected final String		TEST_COMPLETION_STATUS					= "I";
																		
	//merchant_config表
	protected final String		TEST_SETTLE_TYPE						= "IMMEDIATE";
	protected final String		TEST_SETTLE_PERIOD						= "T+1";
	protected final String		TEST_IS_RETRY_WITHHOLD					= "N";
	protected final int			TEST_MAX_RETRY_COUNT					= 0;
	protected final int			TEST_RETRY_INTERVAL						= 0;
	protected final String		TEST_IS_VERIFY_CHARGE					= "N";
	protected final Money		TEST_VERIFY_CHARGE_CONFIG_VALUE			= new Money(0.00);
	protected final String		TESET_IS_INSTALLMENT_SIGN_NOTIFY		= "N";
	protected final String		TESET_CHARGE_FROM_OTHER_ACCOUNT			= "N";
	protected final String		TEST_INSTALLMENT_TYPE					= "HUIJIN";
	protected final int			TEST_SETTLE_CONFIG_DATE					= 0;
	//merchant_domain_name
	protected final String      TEST_DOMAIN_NAME                        ="test_damain_name";
	protected final String       TEST_IS_WORK                           ="N"; 
	//installment 表
	protected final String		TEST_PAPER_CONTRACT_NO					= "TEST_PAPER_CONTRACT_NO";
																		
	//installment_product表
	protected final Money		TEST_PRODUCT_PRICE						= new Money(0.00);
	protected final int			TEST_TIMES								= 0;
	protected final double		TEST_INTEREST_RATE						= 0;
	protected final double		TEST_OTHER_RATE							= 0;
																		
	//merchant_escow_limit表
	protected final int			TEST_MERCHANT_ESCOW_LIMIT_ID			= 3335;
	protected final String		TEST_RESET_CYCLE						= "test_reset_cycle";
																		
	//易行通系统的partnerId
	protected final String		Neverstop_partnerId						= "20150115020000063632";
	protected final String		Neverstop_bona_ID						= "20140910020000052293";
	protected final String		Neverstop_Huijin_ID						= "20141202020000060318";
	//
	protected final String		TEST_NY									= "NO";
	protected final String		TEST_ALLOT_ROUTE						= "allotRoute";
	protected final String		TEST_ALLOT_MODE							= "allotMode";
	protected final String		TEST_ALLOCATION_TYPE					= "testAlloCationType";
	protected final String		TEST_ALLOT_CHANNEL						= "testAllotChannel";
	protected final String		TEST_WISH_ALLOTTIME						= "testWishAllotTime";
	protected final String		TEST_BANK_ACCOUNT_TYPE					= "testBankAccoutType";
	protected final String		TEST_QUERY_TYPE							= "1";
	protected final String		TEST_CHANNEL_RULE_ID					= "testChannelRuleId";
	protected final String		TEST_LAST_QUERY_STATUS					= "success";
	protected final String		TEST_BANK_RATE							= "1";
	
	//customer_bak_manager表
	protected final String      TEMP_TABLE                              ="temp_table";
	protected final String      CHANGE_TABLE                            ="change_table";
	protected final String      CHANGE_REASON                           ="change_reason";
	protected final String      CHANGE_STATUS                           ="change";
																		
	// 其他系统DAO
	// @Autowired
	// protected ExtraCustomerUserDAO extraCustomerUserDAO;
	private Date toDate(String string) {
		try {
			return new SimpleDateFormat("yyyyMMddHHmmss").parse(string);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

}