package base;

import com.yiji.clearing.enums.ClearingStatusEnum;
import com.yjf.common.lang.util.DateUtil;
import com.yjf.common.lang.util.money.Money;
import com.yjf.common.util.StringUtils;
import com.yjf.securitydata.client.exception.SecurityDataException;
import com.yjf.securitydata.client.info.BatchMapInfo;
import com.yjf.securitydata.client.info.SecMapInfo;
import gen.doproject.commonproducts.*;
import gen.mappers.commonproducts.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.*;

/**
 * Copyright (C), 2018-2018
 * FileName: paymentTestBase
 * Author:   wiley
 * Date:     2018/2/27 0027 14:21
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@ContextConfiguration({"/dal/dal-db-payment.xml"})
public class PaymentTestBase extends PaymentTestService{
    protected final Logger loggers = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected SdSingleDeductDAO sdSingleDeductDAO;

    @Autowired
    protected TransferLimitConfigDAO transferLimitConfigDAO;

    @Autowired
    protected WithdrawConfigDAO withdrawConfigDAO;

    @Autowired
    protected WithdrawDetailConfigDAO withdrawDetailConfigDAO;

    @Autowired
    protected WithdrawLimitConfigDAO withdrawLimitConfigDAO;

    @Autowired
    protected JointAccountsDAO jointAccountsDAO;

    @Autowired
    protected JointAccountsApplyLogsDAO jointAccountsApplyLogsDAO;

    @Autowired
    protected JointAccountFundsInDAO jointAccountFundsInDAO;

    @Autowired
    protected ProductBaseDAO productBaseDAO;

    @Autowired
    protected JointStreamLogDAO jointStreamLogDAO;

    @Autowired
    protected ProductTaskDAO productTaskDAO;

    @Autowired
    protected ProductHoldTaskDAO productHoldTaskDAO;

    @Autowired
    protected TransferBankInfoDAO transferBankInfoDAO;

    @Autowired
    protected TransferDAO transferDAO;

    @Autowired
    protected WithdrawDAO withdrawDAO;

    @Autowired
    protected ProductModelDAO productModelDAO;


    @Autowired
    protected TransferToYjfConfigDAO transferToYjfConfigDAO;


    @Autowired
    protected TransferContactsDAO transferContactsDAO;

    @Autowired
    protected ProductBizNoMapDAO productBizNoMapDAO;

    @Autowired
    protected ProductTaskInfoDAO productTaskInfoDAO;

    @Autowired
    protected DeductDAO deductDAO;

    @Autowired
    protected DeductConfigDAO deductConfigDAO;

    // ---------------------------------------------无卡支付-----------------start
    //	@Autowired
    //	protected QpSubscribeReqDAO qpSubscribeReqDAO;
    //
    //	@Autowired
    //	protected QpUserDAO qpUserDAO;

    // ---------------------------------------------无卡支付-----------------End

    @Autowired
    protected AutoWithdrawConfigDAO autoWithdrawConfigDAO;
    @Autowired
    protected ReconFileDAO reconFileDAO;

    @Autowired
    protected ReconHistoryApplyDAO reconHistoryApplyDAO;

    @Autowired
    protected ReconUserConfigDAO reconUserConfigDAO;

    @Autowired
    protected FastTradeDAO fastTradeDAO;

    @Autowired
    protected FastTradeMerchantDAO fastTradeMerchantDAO;

    @Autowired
    protected FastTradeErrorCodeDAO fastTradeErrorCodeDAO;

    @Autowired
    protected FastPayDAO fastPayDAO;

    @Autowired
    protected FastPayTimeoutsDAO fastPayTimeoutsDAO;

    @Autowired
    protected TradePayInfoDAO tradePayInfoDAO;

    @Autowired
    protected FastPayBankDAO fastPayBankDAO;

    @Autowired
    protected FastPayMethodDAO fastPayMethodDAO;

    @Autowired
    protected FastPaySourceMethodDAO fastPaySourceMethodDAO;

    @Autowired
    protected FastPayChannelDAO fastPayChannelDAO;

    @Autowired
    protected FastPayMerchantDAO fastPayMerchantDAO;

    @Autowired
    protected ProductConfigArgsDAO productConfigArgsDAO;

    @Autowired
    protected TradeRefundInfoDAO tradeRefundInfoDAO;

    @Autowired
    protected IdentityValidateDAO identityValidateDAO;

    @Autowired
    protected MergePayDAO mergePayDAO;

    @Autowired
    protected BatchBehalfDAO batchBehalfDAO;

    @Autowired
    protected BatchBehalfDetailDAO batchBehalfDetailDAO;

    @Autowired
    protected CommandPayParamDAO commandPayParamDAO;

    @Autowired
    protected FastPayShareProfitDAO fastPayShareProfitDAO;

    @Autowired
    protected TradeRefundShareProfitDAO tradeRefundShareProfitDAO;

    @Autowired
    protected ForeignPayDAO foreignPayDAO;

    @Autowired
    protected ReconOrderFileDAO reconOrderFileDAO;
    @Autowired
    protected ReconOrderHistoryApplyDAO reconOrderHistoryApplyDAO;

    @Autowired
    protected AutoDeductConfigDAO autoDeductConfigDAO;

    @Autowired
    protected AutoDeductTriggerDAO autoDeductTriggerDAO;


    @Autowired
    protected FastPayAutoWithdrawConfigDAO fastPayAutoWithdrawConfigDAO;
    @Autowired
    protected ProductModelWithdrawDAO productModelWithdrawDAO;
    @Autowired
    protected ProductModelDeductDAO productModelDeductDAO;
    @Autowired
    protected ProductModelPaymentDAO productModelPaymentDAO;
    @Autowired
    protected TransferModelDAO transferModelDAO;
    @Autowired
    protected FastPayHabitDAO fastPayHabitDAO;
    @Autowired
    protected TransferBizNoMapDAO transferBizNoMapDAO;
    @Autowired
    protected ThirdPartyAccountsDAO thirdPartyAccountsDAO;
    @Autowired
    protected ThirdPartyAccountsConfigDAO thirdPartyAccountsConfigDAO;
    @Autowired
    protected BatchIdempotentDAO batchIdempotentDAO;
    @Autowired
    protected AmazonTradeDAO amazonTradeDAO;
    @Autowired
    protected ClearingCheckingInfoDAO clearingCheckingInfoDAO;
    @Autowired
    protected ClearingCheckingSumDAO clearingCheckingSumDAO;
    @Autowired
    protected ClearingPartnerDAO clearingPartnerDAO;
    @Autowired
    protected ClearingPartnerSumDAO clearingPartnerSumDAO;

    /**
     * 清除single_deduct表数据
     *
     * @param merchantOrderNo
     * @param merchantUserId
     */
    public void cleanSingleDeductByMerchantOrderNoAndMerchantUserId(String merchantOrderNo,
                                                                    String merchantUserId) {
        if (StringUtils.isBlank(merchantOrderNo)) {
            merchantOrderNo = TEST_STRING;
        }
        if (StringUtils.isBlank(merchantUserId)) {
            merchantUserId = TEST_STRING;
        }
        SdSingleDeductDOExample example = new SdSingleDeductDOExample();
        example.createCriteria().andMerchantUserIdEqualTo(merchantUserId)
                .andMerchantOrderNoEqualTo(merchantOrderNo);
        sdSingleDeductDAO.deleteByExample(example);
    }

    /**
     * 根据 merchantOrderNo 和 merchantUserId 查询代扣记录表数据
     *
     * @param merchantOrderNo
     * @param merchantUserId
     * @return
     */
    public List<SdSingleDeductDO> findSdSingleDeductDOByMerchantOrderNoAndMerchantUserId(String merchantOrderNo,
                                                                                         String merchantUserId) {
        if (StringUtils.isBlank(merchantOrderNo)) {
            merchantOrderNo = TEST_STRING;
        }
        if (StringUtils.isBlank(merchantUserId)) {
            merchantUserId = TEST_STRING;
        }
        SdSingleDeductDOExample example = new SdSingleDeductDOExample();
        example.createCriteria().andMerchantOrderNoEqualTo(merchantOrderNo)
                .andMerchantUserIdEqualTo(merchantUserId);
        return sdSingleDeductDAO.selectByExample(example);
    }


    public long insertTransferLimitConfig(Date rawAddTime, Date rawUpdateTime, String userTypes) {
        TransferLimitConfigDO DO = new TransferLimitConfigDO();
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setUserTypes(userTypes);
        transferLimitConfigDAO.insert(DO);
        return DO.getId();
    }


    public long setTransferLimitConfigDO(Date rawAddTime, Date rawUpdateTime) {

        if (rawAddTime == null) {
            rawAddTime = TEST_DATE;
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = TEST_DATE;
        }
        TransferLimitConfigDO DO = new TransferLimitConfigDO();
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        transferLimitConfigDAO.insert(DO);
        return DO.getId();
    }

    /**
     * 清除Transfer_Limit_Config表所有数据
     */
    public void cleanTransferLimitConfigByAll() {
        TransferLimitConfigDOExample exam = new TransferLimitConfigDOExample();
        exam.createCriteria();
        transferLimitConfigDAO.deleteByExample(exam);
    }

    /**
     * 根据Id清除Transfer_Limit_Config表数据
     *
     * @param id
     */
    public void cleanTransferLimitConfigById(long id) {
        if (id < 0) {
            id = 0;
        }
        TransferLimitConfigDOExample exam = new TransferLimitConfigDOExample();
        exam.createCriteria().andIdEqualTo(id);
        transferLimitConfigDAO.deleteByExample(exam);
    }

    /**
     * 根据id查询Transfer_Limit_Config表列表数据
     *
     * @param id
     * @return
     */
    protected List<TransferLimitConfigDO> queryTransferLimitConfigById(long id) {
        if (id < 0) {
            id = 0;
        }
        TransferLimitConfigDOExample exam = new TransferLimitConfigDOExample();
        exam.createCriteria().andIdEqualTo(id);
        List<TransferLimitConfigDO> transferLimitConfigList = transferLimitConfigDAO
                .selectByExample(exam);
        return transferLimitConfigList;
    }

    /**
     * 清除Withdraw_Config表所有数据
     */
    public void cleanWithdrawConfigByAll() {
        WithdrawConfigDOExample exam = new WithdrawConfigDOExample();
        exam.createCriteria();
        withdrawConfigDAO.deleteByExample(exam);
    }

    /**
     * 根据merchantCardNo查询Withdraw_Config表列表数据
     *
     * @param merchantCardNo
     * @return
     */
    protected List<WithdrawConfigDO> queryWithdrawConfigByMerchantCardNo(String merchantCardNo) {
        if (StringUtils.isBlank(merchantCardNo)) {
            merchantCardNo = TEST_STRING;
        }
        WithdrawConfigDOExample exam = new WithdrawConfigDOExample();
        exam.createCriteria().andMerchantCardNoEqualTo(merchantCardNo);
        List<WithdrawConfigDO> withdrawConfigList = withdrawConfigDAO.selectByExample(exam);
        return withdrawConfigList;
    }

    /**
     * 清除Withdraw_Detail_Config表所有数据
     */
    public void cleanWithdrawDetailConfigByAll() {
        WithdrawDetailConfigDOExample exam = new WithdrawDetailConfigDOExample();
        exam.createCriteria();
        withdrawDetailConfigDAO.deleteByExample(exam);
    }

    /**
     * 根据id查询Withdraw_Detail_Config表列表数据
     *
     * @param id
     * @return
     */
    protected List<WithdrawDetailConfigDO> queryWithdrawDetailConfigById(long id) {
        if (id < 0) {
            id = 0;
        }
        WithdrawDetailConfigDOExample exam = new WithdrawDetailConfigDOExample();
        exam.createCriteria().andIdEqualTo(id);
        List<WithdrawDetailConfigDO> withdrawDetailConfigList = withdrawDetailConfigDAO
                .selectByExample(exam);
        return withdrawDetailConfigList;
    }

    /**
     * 根据merchantCardNo更新表Withdraw_Config数据rawAddTime和rawUpdateTime
     *
     * @param merchantCardNo
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    protected void updateWithdrawConfigByMerchantCardNo(String merchantCardNo, Date rawAddTime,
                                                        Date rawUpdateTime) {
        if (StringUtils.isBlank(merchantCardNo)) {
            merchantCardNo = TEST_MERCHANTCARDNO;
        }
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }
        WithdrawConfigDOExample exam = new WithdrawConfigDOExample();
        exam.createCriteria().andMerchantCardNoEqualTo(merchantCardNo);
        WithdrawConfigDO withdrawConfigDO = withdrawConfigDAO.selectByExample(exam).get(0);
        withdrawConfigDO.setRawAddTime(rawAddTime);
        withdrawConfigDO.setRawUpdateTime(rawUpdateTime);
        withdrawConfigDAO.updateByExample(withdrawConfigDO, exam);
    }

    protected void updateWithdrawDetailConfigById(long id, String active) {
        if (id < 0) {
            id = 0;
        }
        WithdrawDetailConfigDOExample example = new WithdrawDetailConfigDOExample();
        example.createCriteria().andIdEqualTo(id);
        WithdrawDetailConfigDO withdrawDetailConfigDO = withdrawDetailConfigDAO.selectByExample(
                example).get(0);
        withdrawDetailConfigDO.setActive(active);
        withdrawDetailConfigDAO.updateByExample(withdrawDetailConfigDO, example);

    }

    /**
     * 清除Withdraw_Limit_Config表所有数据
     */
    public void cleanWithdrawLimitConfigByAll() {
        WithdrawLimitConfigDOExample exam = new WithdrawLimitConfigDOExample();
        exam.createCriteria();
        withdrawLimitConfigDAO.deleteByExample(exam);
    }

    /**
     * 根据id查询Withdraw_Limit_Config表列表数据
     */
    protected List<WithdrawLimitConfigDO> queryWithdrawLimitConfigById(long id) {
        if (id < 0) {
            id = 0;
        }
        WithdrawLimitConfigDOExample exam = new WithdrawLimitConfigDOExample();
        exam.createCriteria().andIdEqualTo(id);
        List<WithdrawLimitConfigDO> withdrawLimitConfigList = withdrawLimitConfigDAO
                .selectByExample(exam);
        return withdrawLimitConfigList;
    }

    /**
     * 根据jointAccountNo清除joint_accounts表数据
     *
     * @param jointAccountNo
     */
    public void cleanJointAccountByJointAccountNo(String jointAccountNo) {
        if (StringUtils.isBlank(jointAccountNo)) {
            jointAccountNo = TEST_STRING;
        }
        JointAccountsDOExample example = new JointAccountsDOExample();
        example.createCriteria().andJointAccountNoEqualTo(jointAccountNo);
        jointAccountsDAO.deleteByExample(example);
    }

    /**
     * 根据userId查询joint_accounts表数据
     * @param userId
     * @return
     */
    public List<JointAccountsDO> findJointAccountByUserId(String userId) {
        JointAccountsDOExample example = new JointAccountsDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        if (jointAccountsDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        List<JointAccountsDO> jointAccountsDO = jointAccountsDAO.selectByExample(example);
        return jointAccountsDO;
    }

    /**
     * 根据userId清除joint_accounts表数据
     *
     * @param userId
     */
    public void cleanJointAccountByUserId(String userId) {
        JointAccountsDOExample example = new JointAccountsDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        jointAccountsDAO.deleteByExample(example);
    }

    public void cleanJointAccountAll() {
        JointAccountsDOExample example = new JointAccountsDOExample();
        example.createCriteria();
        jointAccountsDAO.deleteByExample(example);
    }

    /**
     * 根据jointAccountNo查找joint_accounts表数据
     *
     * @param jointAccountNo
     * @return
     */
    public JointAccountsDO findJointAccountByJointAccounts(String jointAccountNo) {
        if (StringUtils.isBlank(jointAccountNo)) {
            jointAccountNo = TEST_STRING;
        }
        JointAccountsDOExample example = new JointAccountsDOExample();
        example.createCriteria().andJointAccountNoMaskEqualTo(getMask(jointAccountNo));
        if (jointAccountsDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        JointAccountsDO jointAccountsDO = jointAccountsDAO.selectByExample(example).get(0);
        return jointAccountsDO;

    }

    /**
     * 插入joint_accounts表数据并返回自增长Id
     * @param jointAccountNo
     * @param enable
     * @param useFor
     * @param userId
     * @param userRealName
     * @param merchantCardNo
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public String insertJointAccounts(String jointAccountNo, long enable, String useFor,
                                      String userId, String userRealName, String merchantCardNo,
                                      Date rawAddTime, Date rawUpdateTime, String notifyUrl) {
        //		加密字段装载
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("jointAccountNo", jointAccountNo);
        //		加密服务
        SecMapInfo secMapInfo = new SecMapInfo();
        try {
            secMapInfo = securityDataClient.dataBatchStore(dataMap);
        } catch (Exception e) {
        }
        //设置对象
        JointAccountsDO DO = new JointAccountsDO();
        DO.setJointAccountNo(getDigest(jointAccountNo));
        DO.setEnable(enable);
        DO.setUseFor(useFor);
        DO.setUserId(userId);
        DO.setUserRealName(userRealName);
        DO.setMerchantCardNo(merchantCardNo);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setNotifyUrl(notifyUrl);
        DO.setSecIndex(secMapInfo.getSecIndex());
        DO.setJointAccountNoMask(getMask(jointAccountNo));
        jointAccountsDAO.insert(DO);
        return DO.getSecIndex();
    }

    /**
     * 新增notifyUrl插入
     * @param jointAccountNo
     * @param enable
     * @param useFor
     * @param userId
     * @param userRealName
     * @param merchantCardNo
     * @param rawAddTime
     * @param rawUpdateTime
     * @param notifyUrl
     * @return
     */
    public long insertJointAccountsNew(String jointAccountNo, long enable, String useFor,
                                       String userId, String userRealName, String merchantCardNo,
                                       Date rawAddTime, Date rawUpdateTime, String notifyUrl) {
        JointAccountsDO DO = new JointAccountsDO();
        DO.setJointAccountNo(jointAccountNo);
        DO.setEnable(enable);
        DO.setUseFor(useFor);
        DO.setUserId(userId);
        DO.setUserRealName(userRealName);
        DO.setMerchantCardNo(merchantCardNo);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setNotifyUrl(notifyUrl);
        jointAccountsDAO.insert(DO);
        return DO.getId();
    }

    /**
     * 清除joint_accounts_apply_logs表数据
     *
     * @param userId
     */
    public void cleanJointAccountsApplyLogsByUserId(String userId) {
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        JointAccountsApplyLogsDOExample example = new JointAccountsApplyLogsDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        jointAccountsApplyLogsDAO.deleteByExample(example);
    }

    /**
     * 插入joint_accounts_apply_logs表数据
     *
     */
    public void insertJointAccountsApplyLogs(String flowNo, String userId, String userRealName,
                                             long jointAccountCount, String applyStatus,
                                             String memo, Date rawAddTime, Date rawUpdateTime,
                                             String bankCode, String openBankName) {
        if (StringUtils.isBlank(flowNo)) {
            flowNo = TEST_STRING;
        }
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        if (StringUtils.isBlank(userRealName)) {
            userRealName = TEST_STRING;
        }
        if (jointAccountCount < 0) {
            jointAccountCount = TEST_INT;
        }
        if (StringUtils.isBlank(applyStatus)) {
            applyStatus = TEST_STRING;
        }
        if (StringUtils.isBlank(memo)) {
            memo = TEST_STRING;
        }
        if (rawAddTime == null) {
            rawAddTime = TEST_DATE;
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = TEST_DATE;
        }
        JointAccountsApplyLogsDO jointAccountsApplyLogsDO = new JointAccountsApplyLogsDO();
        jointAccountsApplyLogsDO.setFlowNo(flowNo);
        jointAccountsApplyLogsDO.setUserId(userId);
        jointAccountsApplyLogsDO.setUserRealName(userRealName);
        jointAccountsApplyLogsDO.setJointAccountCount(jointAccountCount);
        jointAccountsApplyLogsDO.setApplyStatus(applyStatus);
        jointAccountsApplyLogsDO.setMemo(memo);
        jointAccountsApplyLogsDO.setRawAddTime(rawAddTime);
        jointAccountsApplyLogsDO.setRawUpdateTime(rawUpdateTime);
        jointAccountsApplyLogsDO.setBankCode(bankCode);
        jointAccountsApplyLogsDO.setOpenBankName(openBankName);
        jointAccountsApplyLogsDAO.insert(jointAccountsApplyLogsDO);

    }

    /**
     * 根据userId查找joint_accounts_apply_logs表数据
     *
     * @param userId
     * @return
     */
    public JointAccountsApplyLogsDO findJointAccountsApplyLogsDOByUserId(String userId) {
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        JointAccountsApplyLogsDOExample example = new JointAccountsApplyLogsDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        if (jointAccountsApplyLogsDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        JointAccountsApplyLogsDO jointAccountsApplyLogsDO = jointAccountsApplyLogsDAO
                .selectByExample(example).get(0);
        return jointAccountsApplyLogsDO;
    }

    /**
     * 根据jointAccountNo清除joint_account_funds_in表数据
     *
     * @param joint_account_no
     */
    public void cleanJointAccountFundsInByJointAccountNo(long jointAccountNo) {
        JointAccountFundsInDOExample example = new JointAccountFundsInDOExample();
        example.createCriteria().andJointAccountNoEqualTo(jointAccountNo);
        jointAccountFundsInDAO.deleteByExample(example);
    }

    /**
     * 根据biz_no清除joint_account_funds_in表数据
     *
     * @param biz_no
     */
    public void cleanJointAccountFundsInByFundsInBizNo(String BizNo) {
        JointAccountFundsInDOExample example = new JointAccountFundsInDOExample();
        example.createCriteria().andBizNoEqualTo(BizNo);
        jointAccountFundsInDAO.deleteByExample(example);
    }

    /**
     * 根据bankSerialNo清除joint_account_funds_in表数据
     * @param bankSerialNo
     */
    public void cleanJointAccountFundsInByBankSerialNo(String bankSerialNo) {
        JointAccountFundsInDOExample example = new JointAccountFundsInDOExample();
        example.createCriteria().andBankSerialNoEqualTo(bankSerialNo);
        jointAccountFundsInDAO.deleteByExample(example);
    }

    /**
     * 根据jointAccountNo查找joint_account_funds_in表数据
     *
     * @param jointAccountNo
     */
    public JointAccountFundsInDO fIndJointAccountFundsInDOByJointAccountNo(long jointAccountNo) {
        JointAccountFundsInDOExample example = new JointAccountFundsInDOExample();
        example.createCriteria().andJointAccountNoEqualTo(jointAccountNo);
        if (jointAccountFundsInDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        JointAccountFundsInDO jointAccountFundsInDO = jointAccountFundsInDAO.selectByExample(
                example).get(0);
        return jointAccountFundsInDO;

    }

    /**
     * 根据bank_serial_no查找joint_account_funds_in表数据
     *
     * @param bankserialNo
     */
    public JointAccountFundsInDO fIndJointAccountFundsInDOByBankSerialNo(String bankserialNo) {
        if (StringUtils.isBlank(bankserialNo)) {
            bankserialNo = TEST_STRING;
        }
        JointAccountFundsInDOExample example = new JointAccountFundsInDOExample();
        example.createCriteria().andBankSerialNoEqualTo(bankserialNo);
        if (jointAccountFundsInDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        JointAccountFundsInDO jointAccountFundsInDO = jointAccountFundsInDAO.selectByExample(
                example).get(0);
        return jointAccountFundsInDO;
    }

    /**
     * 插入JointAccountFundsIn
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     * @param gid
     * @param inlet
     * @param memo
     * @param merchantAccNo
     * @param merchantCardNo
     * @param merchantUserId
     * @param merchOrderNo
     * @param productCode
     * @param productStatus
     * @param amount
     * @param bankCode
     * @param bankSerialNo
     * @param depositId
     * @param description
     * @param jointAccountBankCode
     * @param jointAccountBankIbkn
     * @param jointAccountName
     * @param notifyUrl
     * @param operation
     * @param payerBankAccountNo
     * @param payerBankName
     * @param payerBankSwiftCode
     * @param payerName
     * @param sublayerOrderNo
     * @param transDate
     * @param jointAccountNo
     * @param isFreeze
     * @param busiDate
     * @param jointAccountBankName
     * @param useInfo
     * @param remark
     * @param acsref
     * @param remitPostscript
     * @param payerBankCode
     */
    public String insertJointAccountFundIn(String bizNo, Date rawAddTime,
                                           Date rawUpdateTime, String gid, String inlet, String memo,
                                           String merchantAccNo, String merchantCardNo, String merchantUserId,
                                           String merchOrderNo, String productCode, String productStatus,
                                           Money amount, String bankCode, String bankSerialNo,
                                           String depositId, String description, String jointAccountBankCode,
                                           String jointAccountBankIbkn, String jointAccountName,
                                           String notifyUrl, String operation, String payerBankAccountNo,
                                           String payerBankName, String payerBankSwiftCode, String payerName,
                                           String sublayerOrderNo, Date transDate, Long jointAccountNo,
                                           Integer isFreeze, Date busiDate, String jointAccountBankName,
                                           String useInfo, String remark, String acsref,
                                           String remitPostscript, String payerBankCode) {
        //		加密字段装载
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("payerName", payerName);
        dataMap.put("payerBankAccountNo", payerBankAccountNo);
        //		加密服务
        SecMapInfo secMapInfo = new SecMapInfo();
        try {
            secMapInfo = securityDataClient.dataBatchStore(dataMap);
        } catch (Exception e) {
        }
        //设置对象
        JointAccountFundsInDO jointAccountFundsInDO = new JointAccountFundsInDO();
        jointAccountFundsInDO.setBizNo(bizNo);
        jointAccountFundsInDO.setRawAddTime(rawAddTime);
        jointAccountFundsInDO.setRawUpdateTime(rawUpdateTime);
        jointAccountFundsInDO.setGid(gid);
        jointAccountFundsInDO.setInlet(inlet);
        jointAccountFundsInDO.setMemo(memo);
        jointAccountFundsInDO.setMerchantAccNo(merchantAccNo);
        jointAccountFundsInDO.setMerchantCardNo(merchantCardNo);
        jointAccountFundsInDO.setMerchantUserId(merchantUserId);
        jointAccountFundsInDO.setMerchOrderNo(merchOrderNo);
        jointAccountFundsInDO.setProductCode(productCode);
        jointAccountFundsInDO.setProductStatus(productStatus);
        jointAccountFundsInDO.setAmount(amount);
        jointAccountFundsInDO.setBankCode(bankCode);
        jointAccountFundsInDO.setBankSerialNo(bankSerialNo);
        jointAccountFundsInDO.setDepositId(depositId);
        jointAccountFundsInDO.setDescription(description);
        jointAccountFundsInDO.setJointAccountBankCode(jointAccountBankCode);
        jointAccountFundsInDO.setJointAccountBankIbkn(jointAccountBankIbkn);
        jointAccountFundsInDO.setJointAccountName(jointAccountName);
        jointAccountFundsInDO.setNotifyUrl(notifyUrl);
        jointAccountFundsInDO.setOperation(operation);
        jointAccountFundsInDO.setPayerBankAccountNo(getMask(payerBankAccountNo));
        jointAccountFundsInDO.setPayerBankName(payerBankName);
        jointAccountFundsInDO.setPayerBankSwiftCode(payerBankSwiftCode);
        jointAccountFundsInDO.setPayerName(getMask(payerName));
        jointAccountFundsInDO.setSublayerOrderNo(sublayerOrderNo);
        jointAccountFundsInDO.setTransDate(transDate);
        jointAccountFundsInDO.setJointAccountNo(jointAccountNo);
        jointAccountFundsInDO.setIsFreeze(isFreeze);
        jointAccountFundsInDO.setBusiDate(busiDate);
        jointAccountFundsInDO.setJointAccountBankName(jointAccountBankName);
        jointAccountFundsInDO.setUseInfo(useInfo);
        jointAccountFundsInDO.setRemark(remark);
        jointAccountFundsInDO.setAcsref(acsref);
        jointAccountFundsInDO.setRemitPostscript(remitPostscript);
        jointAccountFundsInDO.setPayerBankCode(payerBankCode);
        jointAccountFundsInDO.setSecIndex(secMapInfo.getSecIndex());
        jointAccountFundsInDO.setMerchantOrderNo(merchOrderNo);
        jointAccountFundsInDAO.insert(jointAccountFundsInDO);
        return secMapInfo.getSecIndex();
    }

    /**
     * 根据gid清除product_base表数据
     *
     * @param gid
     */
    public void cleanProductBaseByGid(String gid) {
        if (StringUtils.isBlank(gid)) {
            gid = TEST_STRING;
        }
        ProductBaseDOExample example = new ProductBaseDOExample();
        example.createCriteria().andGidEqualTo(gid);
        productBaseDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo清除product_base表数据
     *
     * @param bizNo
     */
    public void cleanProductBaseBybizNo(String bizNo) {
        if (StringUtils.isBlank(bizNo)) {
            bizNo = TEST_STRING;
        }
        ProductBaseDOExample example = new ProductBaseDOExample();
        example.createCriteria().andGidEqualTo(bizNo);
        productBaseDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查找product_base表数据
     *
     * @param gid
     */
    public ProductBaseDO findProductBaseDOByBizNo(String bizNo) {
        if (StringUtils.isBlank(bizNo)) {
            bizNo = TEST_STRING;
        }
        ProductBaseDOExample example = new ProductBaseDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        if (productBaseDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        ProductBaseDO productBaseDO = productBaseDAO.selectByExample(example).get(0);
        return productBaseDO;

    }

    /**
     * 根据merchantCardNo和merchantOrderNo查找product_base表数据
     * @param merchantCardNo
     * @param merchantOrderNo
     * @return
     */
    public List<ProductBaseDO> findProductBaseDOByMerchantCardNoAndMerchantOrderNo(	String merchantCardNo,
                                                                                       String merchantOrderNo) {
        ProductBaseDOExample example = new ProductBaseDOExample();
        example.createCriteria().andMerchantCardNoEqualTo(merchantCardNo)
                .andMerchantOrderNoEqualTo(merchantOrderNo);
        return productBaseDAO.selectByExample(example);

    }

    /**
     * 根据merchantCardNo和merchantOrderNo校验product_base表数据
     * @param size
     * @param merchantCardNo
     * @param merchantOrderNo
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     * @param gid
     * @param inlet
     * @param memo
     * @param merchantAccNo
     * @param merchantUserId
     * @param productCode
     * @param productStatus
     */
    public void assertProductBaseByMerchantCardNoAndMerchantOrderNo(int size,
                                                                    String merchantCardNo,
                                                                    String merchantOrderNo,
                                                                    String bizNo, Date rawAddTime,
                                                                    Date rawUpdateTime, String gid,
                                                                    String inlet, String memo,
                                                                    String merchantAccNo,
                                                                    String merchantUserId,
                                                                    String productCode,
                                                                    String productStatus) {
        List<ProductBaseDO> DO = findProductBaseDOByMerchantCardNoAndMerchantOrderNo(
                merchantCardNo, merchantOrderNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(gid, DO.get(0).getGid());
            assertEquals(gid, DO.get(0).getInlet());
            assertEquals(gid, DO.get(0).getMemo());
            assertEquals(gid, DO.get(0).getMerchantAccNo());
            assertEquals(gid, DO.get(0).getBizNo());
            assertEquals(gid, DO.get(0).getMerchantUserId());
            assertEquals(gid, DO.get(0).getProductCode());
            assertEquals(gid, DO.get(0).getProductStatus());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /**
     * 插入product_base
     */
    public void insertProductBase(String bizNo, Date rawAddTime, Date rawUpdateTime, String gid,
                                  String inlet, String memo, String merchantAccNo,
                                  String merchantCardNo, String merchantOrderNo,
                                  String merchantUserId, String productCode, String productStatus) {
        ProductBaseDO productBaseDO = new ProductBaseDO();
        productBaseDO.setBizNo(bizNo);
        productBaseDO.setRawAddTime(rawAddTime);
        productBaseDO.setRawUpdateTime(rawUpdateTime);
        productBaseDO.setGid(gid);
        productBaseDO.setInlet(inlet);
        productBaseDO.setMemo(memo);
        productBaseDO.setMerchantAccNo(merchantAccNo);
        productBaseDO.setMerchantCardNo(merchantCardNo);
        productBaseDO.setMerchantOrderNo(merchantOrderNo);
        productBaseDO.setMerchantUserId(merchantUserId);
        productBaseDO.setProductCode(productCode);
        productBaseDO.setProductStatus(productStatus);
        productBaseDAO.insert(productBaseDO);

    }

    /**
     * 根据jointAccountNo清除joint_stream_log表数据
     *
     * @param joint_account_No
     */
    public void cleanJointStreamLogByJointAccountNo(String jointAccountNo) {
        if (StringUtils.isBlank(jointAccountNo)) {
            jointAccountNo = TEST_STRING;
        }
        JointStreamLogDOExample example = new JointStreamLogDOExample();
        example.createCriteria().andJointAccountNoEqualTo(jointAccountNo);
        jointStreamLogDAO.deleteByExample(example);
    }

    /**
     * 根据userId查找joint_stream_log表list数据
     * @param userId
     * @return
     */
    public List<JointStreamLogDO> findJointStreamLogByUserId(String userId) {
        JointStreamLogDOExample example = new JointStreamLogDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<JointStreamLogDO> jointStreamLogDO = jointStreamLogDAO.selectByExample(example);
        return jointStreamLogDO;
    }

    /**
     * 根据userId清除joint_stream_log表数据
     * @param userId
     */
    public void cleanJointStreamLogByUserId(String userId) {
        JointStreamLogDOExample example = new JointStreamLogDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        jointStreamLogDAO.deleteByExample(example);
    }

    /**
     * 根据outBizNo查找joint_stream_log表数据
     *
     * @param out_biz_no
     */
    public JointStreamLogDO findJointStreamLogByOutbizNo(String outBizNo) {
        if (StringUtils.isBlank(outBizNo)) {
            outBizNo = TEST_STRING;
        }
        JointStreamLogDOExample example = new JointStreamLogDOExample();
        example.createCriteria().andOutBizNoEqualTo(outBizNo);
        if (jointStreamLogDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        JointStreamLogDO jointStreamLogDO = jointStreamLogDAO.selectByExample(example).get(0);
        return jointStreamLogDO;
    }

    /**
     * 根据jointAccountNo查找joint_stream_log表list数据
     *
     * @param jointAccountNo
     */
    public List<JointStreamLogDO> findJointStreamLogByJointAccountNo(String jointAccountNo) {
        JointStreamLogDOExample example = new JointStreamLogDOExample();
        example.createCriteria().andJointAccountNoEqualTo(jointAccountNo);
        return jointStreamLogDAO.selectByExample(example);
    }

    /**
     * 插入joint_stream_log表数据
     *
     */
    public String insertJointStreamLog(Long id, Long amount, String direction,
                                       String jointAccountNo, String memo, String outBizNo,
                                       String useFor, String userId, Date rawAddTime,
                                       Date rawUpdateTime) {
        //		加密字段装载
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("jointAccountNo", jointAccountNo);
        //			加密服务
        SecMapInfo secMapInfo = new SecMapInfo();
        try {
            secMapInfo = securityDataClient.dataBatchStore(dataMap);
        } catch (Exception e) {
        }
        //设置对象
        JointStreamLogDO jointStreamLogDO = new JointStreamLogDO();
        jointStreamLogDO.setId(id);
        jointStreamLogDO.setAmount(amount);
        jointStreamLogDO.setDirection(direction);
        jointStreamLogDO.setJointAccountNo(secMapInfo.getIndexMap().get("jointAccountNo"));
        jointStreamLogDO.setMemo(memo);
        jointStreamLogDO.setOutBizNo(outBizNo);
        jointStreamLogDO.setUseFor(useFor);
        jointStreamLogDO.setUserId(userId);
        jointStreamLogDO.setRawAddTime(rawAddTime);
        jointStreamLogDO.setRawUpdateTime(rawUpdateTime);
        jointStreamLogDO.setSecIndex(secMapInfo.getSecIndex());
        jointStreamLogDO.setJointAccountNoMask(getMask(jointAccountNo));
        jointStreamLogDAO.insert(jointStreamLogDO);
        return secMapInfo.getSecIndex();
    }

    /*
     * 对表product_hold_task数据进行增删改查
     */
    /**
     * 根据bizNo删除product_hold_task
     * @param bizNo
     */
    public void cleanProdcuctHoldTaskByBizNo(String bizNo) {
        ProductHoldTaskDOExample example = new ProductHoldTaskDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        productHoldTaskDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询product_hold_task表list数据
     * @param bizNo
     */
    public List<ProductHoldTaskDO> findProdcuctHoldTaskByBizNo(String bizNo) {
        ProductHoldTaskDOExample example = new ProductHoldTaskDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        return productHoldTaskDAO.selectByExample(example);
    }

    /**
     * 根据bizNo查询校验product_hold_task数据
     * @param size
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     * @param action
     * @param active
     * @param env
     */
    public void assertProductHoldTaskByBizNo(int size, String bizNo, Date rawAddTime,
                                             Date rawUpdateTime, String action, String active,
                                             String env) {
        List<ProductHoldTaskDO> DO = findProdcuctHoldTaskByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(action, DO.get(0).getAction());
            assertEquals(active, DO.get(0).getActive());
            assertEquals(env, DO.get(0).getEnv());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /*
     * 对表product_task数据进行增删改查
     */
    /**
     * 根据gid删除product_task
     * @param gid
     */
    public void cleanProdcuctTaskBygid(String gid) {
        ProductTaskDOExample example = new ProductTaskDOExample();
        example.createCriteria().andGidEqualTo(gid);
        productTaskDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo删除product_task
     * @param bizNo
     */
    public void cleanProdcuctTaskByBizNo(String bizNo) {
        ProductTaskDOExample example = new ProductTaskDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        productTaskDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo和taskType查询product_task表list数据
     * @param bizNo
     * @param taskType
     */
    public List<ProductTaskDO> findProdcuctTaskByBizNo(String bizNo, String taskType) {
        ProductTaskDOExample example = new ProductTaskDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo).andTaskTypeEqualTo(taskType);
        return productTaskDAO.selectByExample(example);
    }

    /**
     * 根据bizNo查询校验product_task数据
     * @param size
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     * @param content
     * @param gid
     * @param productCode
     * @param taskStatus
     * @param taskType
     * @param tries
     * @param env
     */
    public void assertProductTaskByBizNo(int size, String bizNo, String taskType, Date rawAddTime,
                                         Date rawUpdateTime, String gid, String productCode,
                                         String taskStatus, int tries, String env) {
        //		List<ProductTaskDO> DO = findProdcuctTaskByBizNo(bizNo, taskType);
        //		if (size <= 0) {
        //			assertEquals(0, DO.size());
        //		} else {
        //			assertEquals(gid, DO.get(0).getGid());
        //			assertNotNull(DO.get(0).getContent());
        //			assertEquals(productCode, DO.get(0).getProductCode());
        //			assertEquals(taskStatus, DO.get(0).getTaskStatus());
        //			assertEquals(tries, DO.get(0).getTries());
        //			//assertEquals(env, DO.get(0).getEnv());
        //			if (rawAddTime == null) {
        //				assertEquals(DateUtil.shortDate(getSysDate()),
        //					DateUtil.shortDate(DO.get(0).getRawAddTime()));
        //			} else {
        //				assertEquals(DateUtil.shortDate(rawAddTime),
        //					DateUtil.shortDate(DO.get(0).getRawAddTime()));
        //			}
        //			if (rawUpdateTime == null) {
        //				assertEquals(DateUtil.shortDate(getSysDate()),
        //					DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
        //			} else {
        //				assertEquals(DateUtil.shortDate(rawUpdateTime),
        //					DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
        //			}
        //		}
    }

    /**
     * 根据gid查询product_task表list数据
     * @param gid
     */
    public List<ProductTaskDO> findProdcuctTaskByGid(String gid) {
        ProductTaskDOExample example = new ProductTaskDOExample();
        example.createCriteria().andGidEqualTo(gid);
        return productTaskDAO.selectByExample(example);
    }

    /**
     * 清除product_task表所有数据
     */
    public void cleanProductTaskAll() {
        ProductTaskDOExample example = new ProductTaskDOExample();
        example.createCriteria();
        productTaskDAO.deleteByExample(example);
    }

    /**
     * 根据bankAcountNo查找transfer_bank_info表数据
     *
     * @param bankAcountNo
     * @return
     */
    public TransferBankInfoDO findTransferBankInfoDOByBankAccountNo(String bankAcountNo) {
        if (StringUtils.isBlank(bankAcountNo)) {
            bankAcountNo = TEST_STRING;
        }
        TransferBankInfoDOExample exam = new TransferBankInfoDOExample();
        exam.createCriteria().andBankAccountNoEqualTo(bankAcountNo);
        TransferBankInfoDO transferBankInfoDO = transferBankInfoDAO.selectByExample(exam).get(0);
        return transferBankInfoDO;
    }

    /**
     * 根据userId查询transfer_bank_info表数据
     * @param userId
     * @return
     */
    public TransferBankInfoDO findTransferBankInfoDOByUserId(String userId) {
        TransferBankInfoDOExample exam = new TransferBankInfoDOExample();
        exam.createCriteria().andUserIdEqualTo(userId);
        TransferBankInfoDO transferBankInfoDO = transferBankInfoDAO.selectByExample(exam).get(0);
        return transferBankInfoDO;
    }

    /**
     * 根据bankAccountNo清除transfer_bank_info表数据
     *
     * @param bankAccountNo
     */
    public void cleanTransferBankInfoDoByBankAccountNo(String bankAccountNo) {
        TransferBankInfoDOExample exam = new TransferBankInfoDOExample();
        exam.createCriteria().andBankAccountNoEqualTo(bankAccountNo);
        transferBankInfoDAO.deleteByExample(exam);
    }

    /**
     * 根据userId清除transfer_bank_info表的数据
     * @param userId
     */
    public void cleanTransferBankInfoDoByUserId(String userId) {
        TransferBankInfoDOExample exam = new TransferBankInfoDOExample();
        exam.createCriteria().andUserIdEqualTo(userId);
        transferBankInfoDAO.deleteByExample(exam);
    }

    /**
     * 根据bindId清除transfer_bank_info表数据
     *
     * @param bindId
     */
    public void cleanTransferBankInfoDoByBindId(String bindId) {
        TransferBankInfoDOExample exam = new TransferBankInfoDOExample();
        exam.createCriteria().andBindIdEqualTo(bindId);
        transferBankInfoDAO.deleteByExample(exam);
    }

    /**
     * 插入表 Transfer_bank_Info表数据并返回自增长Id
     * @param id
     * @param rawAddTime
     * @param rawUpdateTime
     * @param active
     * @param bankAccountName
     * @param bankAccountNo
     * @param bankCode
     * @param bankImgUrl
     * @param bankInfoStatus
     * @param bankName
     * @param bindId
     * @param cityName
     * @param memo
     * @param merchantCardNo
     * @param provName
     * @param publicTag
     * @param userId
     * @param userName
     * @param voucherImageUrl
     * @param bankAddress
     * @return
     */
    public String insertTransferBankInfo(Date rawAddTime, Date rawUpdateTime, String active,
                                         String bankAccountName, String bankAccountNo,
                                         String bankAddress, String bankCode, String bankImgUrl,
                                         String bankInfoStatus, String bankName, String bindId,
                                         String cityName, String memo, String merchantCardNo,
                                         String provName, String publicTag, String userId,
                                         String userName, String voucherImageUrl, String realName) {
        //		加密字段装载
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("bankAccountName", bankAccountName);
        dataMap.put("bankAccountNo", bankAccountNo);
        //		加密服务
        SecMapInfo secMapInfo = new SecMapInfo();
        try {
            secMapInfo = securityDataClient.dataBatchStore(dataMap);
        } catch (Exception e) {
        }
        //设置对象
        TransferBankInfoDO DO = new TransferBankInfoDO();
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setActive(active);
        DO.setBankAccountName(getMask(bankAccountName));
        DO.setBankAccountNo(secMapInfo.getIndexMap().get("bankAccountNo"));
        DO.setBankAddress(bankAddress);
        DO.setBankCode(bankCode);
        DO.setBankImgUrl(bankImgUrl);
        DO.setBankInfoStatus(bankInfoStatus);
        DO.setBankName(bankName);
        DO.setBindId(bindId);
        DO.setCityName(cityName);
        DO.setMemo(memo);
        DO.setMerchantCardNo(merchantCardNo);
        DO.setProvName(provName);
        DO.setPublicTag(publicTag);
        DO.setUserId(userId);
        DO.setUserName(userName);
        DO.setVoucherImageUrl(voucherImageUrl);
        DO.setRealName(realName);
        DO.setSecIndex(secMapInfo.getSecIndex());
        DO.setBankAccountNoMask(getMask(bankAccountNo));
        transferBankInfoDAO.insert(DO);
        return secMapInfo.getSecIndex();
    }

    /**
     * 插入表transfer
     */
    public String insertTransfer(String bizNo, String userId, String jointOutType,
                                 String transferNo, String sellerAccountNo, String sellerUserId,
                                 String sellerCardNo, String jointUseFor, String jointAccountNo,
                                 String failReason, int delayHours, String currency,
                                 String chargeNo, Long chargeAmount, String cardNo,
                                 String bankName, String bankCode, String bankAccountNo,
                                 String bankAccountName, Long amount, String accountNo) {
        //		加密字段装载
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("bankAccountName", bankAccountName);
        dataMap.put("bankAccountNo", bankAccountNo);
        dataMap.put("jointAccountNo", jointAccountNo);
        //		加密服务
        SecMapInfo secMapInfo = new SecMapInfo();
        try {
            secMapInfo = securityDataClient.dataBatchStore(dataMap);
        } catch (Exception e) {
        }
        //设置对象
        TransferDO transferDO = new TransferDO();
        transferDO.setBizNo(bizNo);
        transferDO.setUserId(userId);
        transferDO.setJointOutType(jointOutType);
        transferDO.setTransferNo(transferNo);
        transferDO.setSelllerAccountNo(sellerAccountNo);
        transferDO.setSellerUserId(sellerUserId);
        transferDO.setSellerCardNo(sellerCardNo);
        transferDO.setJointUseFor(jointUseFor);
        transferDO.setJointAccountNo(jointAccountNo);
        transferDO.setFailReason(failReason);
        transferDO.setDelayHours(delayHours);
        transferDO.setCurrency(currency);
        transferDO.setChargeNo(chargeNo);
        transferDO.setChargeAmount(chargeAmount);
        transferDO.setCardNo(cardNo);
        transferDO.setBankName(bankName);
        transferDO.setBankCode(bankCode);
        transferDO.setBankAccountNo(getMask(bankAccountNo));
        transferDO.setBankAccountName(getMask(bankAccountName));
        transferDO.setAmount(amount);
        transferDO.setAccountNo(accountNo);
        transferDO.setSecIndex(secMapInfo.getSecIndex());
        transferDAO.insert(transferDO);
        return secMapInfo.getSecIndex();
    }

    /**
     * 根据bizNo清除transfer
     *
     * @param bizNo
     */
    public void cleanTransferBybizNo(String bizNo) {
        if (StringUtils.isBlank(bizNo)) {
            bizNo = TEST_STRING;
        }
        TransferDOExample example = new TransferDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        transferDAO.deleteByExample(example);
    }

    /**
     * 清除transfer全部
     *
     */
    public void cleanTransferAll() {
        TransferDOExample example = new TransferDOExample();
        example.createCriteria();
        transferDAO.deleteByExample(example);
    }

    /**
     * 根据merchantCardNo和merchantOrderNo清除transfer数据
     * @param merchantCardNo
     * @param merchantOrderNo
     */
    public void cleanTransferByMerchantCardNoAndMerchantOrderNo(String merchantCardNo,
                                                                String merchantOrderNo) {
        TransferDOExample example = new TransferDOExample();
        example.createCriteria().andMerchantCardNoEqualTo(merchantCardNo)
                .andMerchantOrderNoEqualTo(merchantOrderNo);
        transferDAO.deleteByExample(example);
    }

    //	对withdraw表数据的增删改查和校验
    /**
     * 根据bizNo清除withdraw
     * @param bizNo
     */
    public void cleanWithdrawByBizNo(String bizNo) {
        if (StringUtils.isBlank(bizNo)) {
            bizNo = TEST_STRING;
        }
        WithdrawDOExample example = new WithdrawDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        withdrawDAO.deleteByExample(example);
    }

    /**
     * 根据gid清除withdraw
     * @param gid
     */
    public void cleanWithdrawBygid(String gid) {
        WithdrawDOExample example = new WithdrawDOExample();
        example.createCriteria().andGidEqualTo(gid);
        withdrawDAO.deleteByExample(example);
    }

    /**
     * 根据merchantOrderNo和merchantCardNo清除withdraw表数据
     * @param merchantOrderNo
     * @param merchantCardNo
     */
    public void cleanWithdrawByMerchantOrderNoAndMerchantCardNo(String merchantOrderNo,
                                                                String merchantCardNo) {
        WithdrawDOExample example = new WithdrawDOExample();
        example.createCriteria().andMerchantOrderNoEqualTo(merchantOrderNo)
                .andMerchantCardNoEqualTo(merchantCardNo);
        withdrawDAO.deleteByExample(example);
    }

    /**
     * 清除withdraw
     */
    public void cleanWithdrawAll() {
        WithdrawDOExample example = new WithdrawDOExample();
        example.createCriteria();
        withdrawDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询withdraw表数据
     * @param bizNo
     * @return
     */
    public WithdrawDO findWithdrawByBizNo(String bizNo) {
        WithdrawDOExample example = new WithdrawDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        WithdrawDO withdrawDO = withdrawDAO.selectByExample(example).get(0);
        return withdrawDO;

    }

    /**
     * 根据merchantCardNo和merchantOrderNo查询withdraw表数据
     * @param merchantCardNo
     * @param merchantOrderNo
     * @return
     */
    public List<WithdrawDO> findWithdrawByMerchantCardNoAndMerchantOrderNo(String merchantCardNo,
                                                                           String merchantOrderNo) {
        WithdrawDOExample example = new WithdrawDOExample();
        example.createCriteria().andMerchantCardNoEqualTo(merchantCardNo)
                .andMerchantOrderNoEqualTo(merchantOrderNo);
        return withdrawDAO.selectByExample(example);
    }

    /**
     * 根据merchantCardNo、userId查询withdraw
     * @param merchantCardNo
     * @param userId
     * @return
     */
    public List<WithdrawDO> findWithdrawByMerchantCardNoAndUserId(String merchantCardNo,
                                                                  String userId) {
        WithdrawDOExample example = new WithdrawDOExample();
        example.createCriteria().andMerchantCardNoEqualTo(merchantCardNo).andUserIdEqualTo(userId);
        return withdrawDAO.selectByExample(example);
    }

    /**
     * 插入withdraw
     *
     * @param bizNo
     * @param amount
     * @param bankAccountName
     * @param bankAccountNo
     * @param bankCode
     * @param chargeNo
     * @param currency
     * @param delayHours
     * @param failReason
     * @param payNo
     * @param signNo
     * @param userAccNo
     * @param userCardNo
     * @param userId
     * @param withdrawType
     * @param chargeAmount
     * @param bankName
     * @param rawUpdateTime
     * @param rawAddTime
     * @param gid
     * @param inlet
     * @param memo
     * @param merchantAccNo
     * @param merchantCardNo
     * @param merchantOrderNo
     * @param merchantUserId
     * @param productCode
     * @param productStatus
     */

    public String insertWithdraw(String bizNo, long amount, String bankAccountName,
                                 String bankAccountNo, String bankCode, String chargeNo,
                                 String currency, String delayHours, String failReason,
                                 String payNo, String signNo, String userAccNo,
                                 String userCardNo, String userId, String withdrawType,
                                 Long chargeAmount, String bankName, Date rawUpdateTime,
                                 Date rawAddTime, String gid, String inlet, String memo,
                                 String merchantAccNo, String merchantCardNo,
                                 String merchantOrderNo, String merchOrderNo,
                                 String merchantUserId, String productCode, String productStatus) {
        //		加密字段装载
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("bankAccountName", bankAccountName);
        dataMap.put("bankAccountNo", bankAccountNo);
        //		加密服务
        SecMapInfo secMapInfo = new SecMapInfo();
        try {
            secMapInfo = securityDataClient.dataBatchStore(dataMap);
        } catch (Exception e) {
        }
        //设置对象
        WithdrawDO withdrawDO = new WithdrawDO();
        withdrawDO.setBizNo(bizNo);
        withdrawDO.setAmount(amount);
        withdrawDO.setBankAccountName(getMask(bankAccountName));
        withdrawDO.setBankAccountNo(getMask(bankAccountNo));
        withdrawDO.setBankCode(bankCode);
        withdrawDO.setChargeNo(chargeNo);
        withdrawDO.setCurrency(currency);
        withdrawDO.setDelayHours(delayHours);
        withdrawDO.setFailReason(failReason);
        withdrawDO.setPayNo(payNo);
        withdrawDO.setSignNo(signNo);
        withdrawDO.setUserAccNo(userAccNo);
        withdrawDO.setUserCardNo(userCardNo);
        withdrawDO.setUserId(userId);
        withdrawDO.setWithdrawType(withdrawType);
        withdrawDO.setChargeAmount(chargeAmount);
        withdrawDO.setBankName(bankName);
        withdrawDO.setRawAddTime(rawAddTime);
        withdrawDO.setRawUpdateTime(rawUpdateTime);
        withdrawDO.setGid(gid);
        withdrawDO.setInlet(inlet);
        withdrawDO.setMemo(memo);
        withdrawDO.setMerchantAccNo(merchantAccNo);
        withdrawDO.setMerchantCardNo(merchantCardNo);
        withdrawDO.setMerchantOrderNo(merchantOrderNo);
        withdrawDO.setMerchOrderNo(merchOrderNo);
        withdrawDO.setMerchantUserId(merchantUserId);
        withdrawDO.setProductCode(productCode);
        withdrawDO.setProductStatus(productStatus);
        withdrawDO.setSecIndex(secMapInfo.getSecIndex());
        withdrawDAO.insert(withdrawDO);
        return secMapInfo.getSecIndex();
    }

    /**
     * 根据merchantCardNo和merchantOrderNo查询withdraw表数据进行校验
     * @param size
     * @param merchantCardNo
     * @param merchantOrderNo
     * @param bizNo
     * @param gid
     * @param inlet
     * @param memo
     * @param merchantAccNo
     * @param merchantUserId
     * @param productCode
     * @param productStatus
     * @param amount
     * @param bankAccountName
     * @param bankAccountNo
     * @param bankCode
     * @param bankName
     * @param chargeAmount
     * @param chargeNo
     * @param currency
     * @param delayHours
     * @param failReason
     * @param payNo
     * @param signNo
     * @param userAccNo
     * @param userCardNo
     * @param userId
     * @param withdrawType
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertWithdraw(int size, String merchantCardNo, String merchantOrderNo,
                               String bizNo, String gid, String inlet, String memo,
                               String merchantAccNo, String merchantUserId, String productCode,
                               String productStatus, long amount, String bankAccountName,
                               String bankAccountNo, String bankCode, String bankName,
                               long chargeAmount, String chargeNo, String currency,
                               String delayHours, String failReason, String payNo, String signNo,
                               String userAccNo, String userCardNo, String userId,
                               String withdrawType, Date rawAddTime, Date rawUpdateTime) {
        List<WithdrawDO> DO = findWithdrawByMerchantCardNoAndMerchantOrderNo(merchantCardNo,
                merchantOrderNo);

        //从数据库中获取索引
        String secIndex = DO.get(0).getSecIndex();
        BatchMapInfo batchMapInfo = new BatchMapInfo();
        try {
            batchMapInfo = securityDataClient.queryBySecIndexs(secIndex, null);
        } catch (Exception e) {
        }

        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertEquals(bizNo, DO.get(0).getBizNo());
            assertEquals(gid, DO.get(0).getGid());
            assertEquals(inlet, DO.get(0).getInlet());
            assertEquals(memo, DO.get(0).getMemo());
            assertEquals(merchantAccNo, DO.get(0).getMerchantAccNo());
            assertEquals(merchantOrderNo, DO.get(0).getMerchantOrderNo());
            assertEquals(merchantUserId, DO.get(0).getMerchantUserId());
            assertEquals(productCode, DO.get(0).getProductCode());
            assertEquals(productStatus, DO.get(0).getProductStatus());
            assertEquals(amount, DO.get(0).getAmount());
            // 校验明文
            assertEquals(bankAccountName, batchMapInfo.getDataMap().get("bankAccountName"));
            assertEquals(bankAccountNo, batchMapInfo.getDataMap().get("bankAccountNo"));
            // 校验掩码
            assertEquals(DO.get(0).getBankAccountName(), getMask(bankAccountName));
            assertEquals(DO.get(0).getBankAccountNo(), getMask(bankAccountNo));
            //			assertEquals(bankAccountName, DO.get(0).getBankAccountName());
            //			assertEquals(bankAccountNo, DO.get(0).getBankAccountNo());
            assertEquals(bankCode, DO.get(0).getBankCode());
            assertEquals(bankName, DO.get(0).getBankName());
            assertEquals(chargeAmount, DO.get(0).getChargeAmount());
            assertEquals(chargeNo, DO.get(0).getChargeNo());
            assertEquals(currency, DO.get(0).getCurrency());
            assertEquals(delayHours, DO.get(0).getDelayHours());
            assertEquals(failReason, DO.get(0).getFailReason());
            assertEquals(payNo, DO.get(0).getPayNo());
            assertEquals(signNo, DO.get(0).getSignNo());
            assertEquals(userAccNo, DO.get(0).getUserAccNo());
            assertEquals(userCardNo, DO.get(0).getUserCardNo());
            assertEquals(userId, DO.get(0).getUserId());
            assertEquals(withdrawType, DO.get(0).getWithdrawType());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }

    }

    /**
     * 根据merchantCardNo删除Withdraw_Config
     *
     * @param merchantCardNo
     */
    public void cleanWithdrawConfigByMerchantCardNo(String merchantCardNo) {
        WithdrawConfigDOExample exam = new WithdrawConfigDOExample();
        exam.createCriteria().andMerchantCardNoEqualTo(merchantCardNo);
        withdrawConfigDAO.deleteByExample(exam);
    }

    /**
     * 插入Withdraw_Config表数据并返回自增长Id
     * @param rawAddTime
     * @param rawUpdateTime
     * @param delayHourContext
     * @param merchantCardNo
     * @param merchantName
     * @param auto
     * @param normal
     * @return
     */
    public long insertWithdrawConfig(Date rawAddTime, Date rawUpdateTime, String delayHourContext,
                                     String merchantCardNo, String merchantName, int auto,
                                     int normal) {
        WithdrawConfigDO withdrawConfigDO = new WithdrawConfigDO();
        withdrawConfigDO.setRawAddTime(rawAddTime);
        withdrawConfigDO.setRawUpdateTime(rawUpdateTime);
        withdrawConfigDO.setDelayHourContext(delayHourContext);
        withdrawConfigDO.setMerchantCardNo(merchantCardNo);
        withdrawConfigDO.setMerchantName(merchantName);
        withdrawConfigDO.setAuto(auto);
        withdrawConfigDO.setNormal(normal);
        withdrawConfigDAO.insert(withdrawConfigDO);
        return withdrawConfigDO.getId();
    }

    /**
     * 根据businessConfig，personConfig删除Withdraw_Detail_Config
     *
     * @param businessConfig
     * @param personConfig
     */
    public void cleanWithdrawDetailConfigByBP(int businessConfig, int personConfig) {
        WithdrawDetailConfigDOExample exam = new WithdrawDetailConfigDOExample();
        exam.createCriteria().andBusinessConfigEqualTo(businessConfig)
                .andPersonConfigEqualTo(personConfig);
        withdrawDetailConfigDAO.deleteByExample(exam);

    }

    /**
     * 根据id清除Withdraw_Limit_Config
     *
     * @param id
     */
    public void cleanWithdrawLimitConfigById(long id) {
        WithdrawLimitConfigDOExample exam = new WithdrawLimitConfigDOExample();
        exam.createCriteria().andIdEqualTo(id);
        withdrawLimitConfigDAO.deleteByExample(exam);
    }

    /**
     * 插入withdraw_detail_config表数据并返回子增长Id
     * @param rawAddTime
     * @param rawUpdateTime
     * @param active
     * @param platApproval
     * @param yjfApprovalAmount
     * @param businessConfig
     * @param personConfig
     * @return
     */
    public long insertWithdrawDetailConfig(Date rawAddTime, Date rawUpdateTime, String active,
                                           String platApproval, long yjfApprovalAmount,
                                           int businessConfig, int personConfig) {
        WithdrawDetailConfigDO DO = new WithdrawDetailConfigDO();
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setActive(active);
        DO.setBusinessConfig(businessConfig);
        DO.setPersonConfig(personConfig);
        DO.setPlatApproval(platApproval);
        DO.setYjfApprovalAmount(yjfApprovalAmount);
        withdrawDetailConfigDAO.insert(DO);
        return DO.getId();
    }

    /**
     * 插入withdraw_limit_config表数据并返回子增长Id
     * @param rawAddTime
     * @param rawUpdateTime
     * @param dayTimesLimit
     * @param lowestAuthenticate
     * @param sm
     * @param smValidateAmount
     * @param userType
     * @param validateRuleContext
     * @return
     */
    public long insertWithdrawLimitConfig(Date rawAddTime, Date rawUpdateTime, String sm,
                                          long smValidateAmount, String userType) {
        WithdrawLimitConfigDO DO = new WithdrawLimitConfigDO();
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setSm(sm);
        DO.setSmValidateAmount(smValidateAmount);
        DO.setUserType(userType);
        withdrawLimitConfigDAO.insert(DO);
        return DO.getId();
    }

    //	product_model表数据的增删改查和校验方法

    /**
     * 插入Product_model
     * @param rawAddTime
     * @param rawUpdateTime
     * @param bizNo
     * @param content
     */
    public void insertProductModel(Date rawAddTime, Date rawUpdateTime, String bizNo, String content) {
        ProductModelDO productModelDO = new ProductModelDO();
        productModelDO.setRawAddTime(rawAddTime);
        productModelDO.setRawUpdateTime(rawUpdateTime);
        productModelDO.setBizNo(bizNo);
        productModelDO.setContent(content);
        productModelDAO.insert(productModelDO);
    }

    /**
     * 根据bizNo清除Product_model
     * @param bizNo
     */
    public void cleanProductModelByBizNo(String bizNo) {
        if (StringUtils.isBlank(bizNo)) {
            bizNo = "TEST_STRING";
        }
        ProductModelDOExample example = new ProductModelDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        productModelDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询校验product_model表数据
     * @param size
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertProductModelByBizNo(int size, String bizNo, Date rawAddTime,
                                          Date rawUpdateTime) {
        List<ProductModelDO> DO = findProductModelByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /**
     * 插入transfer_to_yjf_config表数据
     * @param rawAddTime
     * @param rawUpdateTime
     * @param attachValidate
     * @param attachValidateAmount
     * @param attachValidateType
     * @param auto
     * @param businessActive
     * @param normal
     * @param personActive
     * @param businessConfig
     * @param personalConfig
     * @return
     */
    public long insertTransferToYjfConfig(Date rawAddTime, Date rawUpdateTime,
                                          String attachValidate, Money attachValidateAmount,
                                          String attachValidateType, String auto,
                                          String businessActive, String normal,
                                          String personActive, long businessConfig,
                                          long personalConfig, String delayHours) {
        TransferToYjfConfigDO DO = new TransferToYjfConfigDO();
        DO.setAttachValidate(attachValidate);
        DO.setAttachValidateAmount(attachValidateAmount);
        DO.setAttachValidateType(attachValidateType);
        DO.setAuto(auto);
        DO.setBusinessActive(businessActive);
        DO.setBusinessConfig(businessConfig);
        DO.setNormal(normal);
        DO.setPersonActive(personActive);
        DO.setPersonalConfig(personalConfig);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setDelayHours(delayHours);
        transferToYjfConfigDAO.insert(DO);
        return DO.getId();
    }

    /**
     * 清除transfer_to_yjf_config
     *
     * @param id
     */
    public void cleanTransferToYjfConfigById(long id) {
        TransferToYjfConfigDOExample example = new TransferToYjfConfigDOExample();
        example.createCriteria().andIdEqualTo(id);
        transferToYjfConfigDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查找transfer
     *
     * @param bizNo
     */
    public TransferDO findTransferBybizNo(String bizNo) {
        if (StringUtils.isBlank(bizNo)) {
            bizNo = TEST_STRING;
        }
        TransferDOExample example = new TransferDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        return transferDAO.selectByExample(example).get(0);
    }

    /**
     * 根据bizNo查找transfer
     *
     * @param bizNo
     */
    public TransferDO findTransferByMerchOrderNO(String merchOrderNO) {
        if (StringUtils.isBlank(merchOrderNO)) {
            merchOrderNO = TEST_STRING;
        }
        TransferDOExample example = new TransferDOExample();
        example.createCriteria().andMerchOrderNoEqualTo(merchOrderNO);
        return transferDAO.selectByExample(example).get(0);
    }

    /**
     * 根据merchantCardNo和merchantOrderNo查询transfer表数据
     * @param merchantCardNo
     * @param merchantOrderNo
     * @return
     */
    public List<TransferDO> findTransferByMerchantCardNoAndMerchantOrderNo(String merchantCardNo,
                                                                           String merchantOrderNo) {
        TransferDOExample example = new TransferDOExample();
        example.createCriteria().andMerchantCardNoEqualTo(merchantCardNo)
                .andMerchantOrderNoEqualTo(merchantOrderNo);
        return transferDAO.selectByExample(example);
    }

    //transfer_contacts

    /**
     * 根据userId和contactUserId查询transfer_contacts表数据
     * @param userId
     */
    public void cleanTransferContactsByUserId(String userId) {
        TransferContactsDOExample exam = new TransferContactsDOExample();
        exam.createCriteria().andUserIdEqualTo(userId);
        transferContactsDAO.deleteByExample(exam);
    }

    /**
     * 根据userId查询transfer_contacts表list数据
     * @param userId
     * @return
     */
    public List<TransferContactsDO> findTransferContactsListByContactUserId(String userId) {
        TransferContactsDOExample exam = new TransferContactsDOExample();
        exam.createCriteria().andUserIdEqualTo(userId);
        return transferContactsDAO.selectByExample(exam);
    }

    /**
     * 根据userId和bankAccountNo查询transfer_contacts表list数据
     * @param userId
     * @param bankAccountNo
     * @return
     */
    public List<TransferContactsDO> findTransferContactsListByBankAccountNo(String userId,
                                                                            String bankAccountNo) {
        TransferContactsDOExample exam = new TransferContactsDOExample();
        exam.createCriteria().andUserIdEqualTo(userId).andBankAccountNoEqualTo(bankAccountNo);
        return transferContactsDAO.selectByExample(exam);
    }

    //	product_biz_no_map表数据的增删改查和校验方法
    /**
     * 根据bizNo查询product_biz_no_map表数据
     * @param bizNo
     * @return
     */
    public List<ProductBizNoMapDO> findProductBizNoMapByBizNo(String bizNo) {
        ProductBizNoMapDOExample exam = new ProductBizNoMapDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        return productBizNoMapDAO.selectByExample(exam);
    }

    /**
     * 根据bizNo查询transfer_biz_no_map表数据
     * @param bizNo
     * @return
     */
    public List<TransferBizNoMapDO> findTransferBizNoMapByBizNo(String bizNo) {
        TransferBizNoMapDOExample exam = new TransferBizNoMapDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        return transferBizNoMapDAO.selectByExample(exam);
    }

    /**
     * 根据bizNo查询校验product_biz_no_map表数据并返回orderNo
     * @param size
     * @param bizNo
     * @param ploy
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public Map<String, String> assertProductBizNoMapByBizNo(int size, String bizNo, String ploy,
                                                            Date rawAddTime, Date rawUpdateTime) {
        //定一个Map返回
        Map<String, String> map = new HashMap<String, String>();
        List<ProductBizNoMapDO> DO = findProductBizNoMapByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else if (size == 1) {
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getOrderNo());
            assertEquals(ploy, DO.get(0).getPloy());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
            map.put("orderNo", DO.get(0).getOrderNo());
            return map;
        } else if (size == 2) {
            //第一条
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getOrderNo());
            assertEquals(ploy, DO.get(0).getPloy());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
            //第二条
            assertNotNull(DO.get(1).getOrderNo());
            assertEquals(ploy, DO.get(1).getPloy());
            assertNotNull(DO.get(1).getId());
            assertNotEquals(0, DO.get(1).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(1).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(1).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(1).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(1).getRawUpdateTime()));
            }
            map.put("orderNo", DO.get(0).getOrderNo());
            map.put("orderNoTwo", DO.get(1).getOrderNo());
            return map;
        } else if (size == 3) {
            //第一条
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getOrderNo());
            assertEquals(ploy, DO.get(0).getPloy());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
            //第二条
            assertNotNull(DO.get(1).getOrderNo());
            assertEquals(ploy, DO.get(1).getPloy());
            assertNotNull(DO.get(1).getId());
            assertNotEquals(0, DO.get(1).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(1).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(1).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(1).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(1).getRawUpdateTime()));
            }
            //第3条
            assertNotNull(DO.get(2).getOrderNo());
            assertEquals(ploy, DO.get(2).getPloy());
            assertNotNull(DO.get(2).getId());
            assertNotEquals(0, DO.get(2).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(2).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(2).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(2).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(2).getRawUpdateTime()));
            }
            map.put("orderNo", DO.get(0).getOrderNo());
            map.put("orderNoTwo", DO.get(1).getOrderNo());
            map.put("orderNoThree", DO.get(2).getOrderNo());
            return map;
        }
        return null;
    }

    /**
     * 根据bizNo查询校验transfer_biz_no_map表数据并返回orderNo
     * @param size
     * @param bizNo
     * @param ploy
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public Map<String, String> assertTransferBizNoMapByBizNo(int size, String bizNo, String ploy,
                                                             Date rawAddTime, Date rawUpdateTime) {
        //定一个Map返回
        Map<String, String> map = new HashMap<String, String>();
        List<TransferBizNoMapDO> DO = findTransferBizNoMapByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else if (size == 1) {
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getOrderNo());
            assertEquals(ploy, DO.get(0).getPloy());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
            map.put("orderNo", DO.get(0).getOrderNo());
            return map;
        } else if (size == 2) {
            //第一条
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getOrderNo());
            assertEquals(ploy, DO.get(0).getPloy());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
            //第二条
            assertNotNull(DO.get(1).getOrderNo());
            assertEquals(ploy, DO.get(1).getPloy());
            assertNotNull(DO.get(1).getId());
            assertNotEquals(0, DO.get(1).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(1).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(1).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(1).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(1).getRawUpdateTime()));
            }
            map.put("orderNo", DO.get(0).getOrderNo());
            map.put("orderNoTwo", DO.get(1).getOrderNo());
            return map;
        } else if (size == 3) {
            //第一条
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getOrderNo());
            assertEquals(ploy, DO.get(0).getPloy());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
            //第二条
            assertNotNull(DO.get(1).getOrderNo());
            assertEquals(ploy, DO.get(1).getPloy());
            assertNotNull(DO.get(1).getId());
            assertNotEquals(0, DO.get(1).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(1).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(1).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(1).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(1).getRawUpdateTime()));
            }
            //第3条
            assertNotNull(DO.get(2).getOrderNo());
            assertEquals(ploy, DO.get(2).getPloy());
            assertNotNull(DO.get(2).getId());
            assertNotEquals(0, DO.get(2).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(2).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(2).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(2).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(2).getRawUpdateTime()));
            }
            map.put("orderNo", DO.get(0).getOrderNo());
            map.put("orderNoTwo", DO.get(1).getOrderNo());
            map.put("orderNoThree", DO.get(2).getOrderNo());
            return map;
        }
        return null;
    }

    /**
     * 根据bizNo查询product_model表数据
     * @param bizNo
     * @return
     */
    public List<ProductModelDO> findProductModelByBizNo(String bizNo) {
        ProductModelDOExample exam = new ProductModelDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        return productModelDAO.selectByExample(exam);
    }

    /*
     * 对表product_task_info的数据进行增删改查
     */
    /**
     * 根据bizNo清除表product_task_info数据
     * @param bizNo
     */
    public void cleanProductTaskInfoByBizNo(String bizNo) {
        ProductTaskInfoDOExample exam = new ProductTaskInfoDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        productTaskInfoDAO.deleteByExample(exam);
    }

    /**
     * 清除表product_task_info所有数据
     *
     */
    public void cleanProductTaskInfoAll() {
        ProductTaskInfoDOExample exam = new ProductTaskInfoDOExample();
        exam.createCriteria();
        productTaskInfoDAO.deleteByExample(exam);
    }

    /**
     * 根据bizNo和tastType查询表product_task_info数据
     * @param bizNo
     * @param tastType
     * @return
     */
    public List<ProductTaskInfoDO> findProductTaskInfoByBizNoAndtaskType(String bizNo,
                                                                         String taskType) {
        ProductTaskInfoDOExample exam = new ProductTaskInfoDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo).andTaskTypeEqualTo(taskType);
        return productTaskInfoDAO.selectByExample(exam);
    }

    /**
     * 根据gid查询表product_task_info数据
     * @param gid
     * @return
     */
    public List<ProductTaskInfoDO> findProductTaskInfoByGid(String gid) {
        ProductTaskInfoDOExample exam = new ProductTaskInfoDOExample();
        exam.createCriteria().andGidEqualTo(gid);
        return productTaskInfoDAO.selectByExample(exam);
    }

    /**
     * 根据bizNo和taskType查询校验表product_task_info数据
     * @param size
     * @param bizNo
     * @param gid
     * @param productCode
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertProductTaskInfoByBizNo(int size, String bizNo, String taskType, String gid,
                                             String productCode, Date rawAddTime,
                                             Date rawUpdateTime) {
        //		List<ProductTaskInfoDO> DO = findProductTaskInfoByBizNoAndtaskType(bizNo, taskType);
        //		if (size <= 0) {
        //			assertEquals(0, DO.size());
        //		} else {
        //			assertEquals(size, DO.size());
        //			assertEquals(gid, DO.get(0).getGid());
        //			assertEquals(productCode, DO.get(0).getProductCode());
        //			if (rawAddTime == null) {
        //				assertEquals(DateUtil.shortDate(getSysDate()),
        //					DateUtil.shortDate(DO.get(0).getRawAddTime()));
        //			} else {
        //				assertEquals(DateUtil.shortDate(rawAddTime),
        //					DateUtil.shortDate(DO.get(0).getRawAddTime()));
        //			}
        //			if (rawUpdateTime == null) {
        //				assertEquals(DateUtil.shortDate(getSysDate()),
        //					DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
        //			} else {
        //				assertEquals(DateUtil.shortDate(rawUpdateTime),
        //					DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
        //			}
        //		}
    }

    /*
     * 对表deduct数据进行增删改查
     */
    /**
     * 根据bizNo清除表deduct数据
     * @param bizNo
     */
    public void cleanDeductByBizNo(String bizNo) {
        DeductDOExample exam = new DeductDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        deductDAO.deleteByExample(exam);
    }

    /**
     * 根据merchantCardNo和merchantOrderNo清除表deduct数据
     * @param merchantCardNo
     * @param merchantOrderNo
     */
    public void cleanDeductByMerchantCardNoAndMerchantOrderNo(String merchantCardNo,
                                                              String merchantOrderNo) {
        DeductDOExample exam = new DeductDOExample();
        exam.createCriteria().andMerchantCardNoEqualTo(merchantCardNo)
                .andMerchantOrderNoEqualTo(merchantOrderNo);
        deductDAO.deleteByExample(exam);
    }

    /**
     * 清除表deduct所有数据
     *
     */
    public void cleanDeductAll() {
        DeductDOExample exam = new DeductDOExample();
        exam.createCriteria();
        deductDAO.deleteByExample(exam);
    }

    /**
     * 根据bizNo查询表deduct数据
     * @param bizNo
     * @return
     */
    public List<DeductDO> findDeductByBizNo(String bizNo) {
        DeductDOExample exam = new DeductDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        return deductDAO.selectByExample(exam);
    }

    /**
     * 根据merchantCardNo和merchantOrderNo查询deduct表list数据
     * @param merchantCardNo
     * @param merchantOrderNo
     */
    public List<DeductDO> findDeductByMerchantCardNoAndMerchantOrderNo(String merchantCardNo,
                                                                       String merchantOrderNo) {
        DeductDOExample exam = new DeductDOExample();
        exam.createCriteria().andMerchantCardNoEqualTo(merchantCardNo)
                .andMerchantOrderNoEqualTo(merchantOrderNo);
        return deductDAO.selectByExample(exam);
    }

    /*
     * 对表deduct_config数据进行增删改查
     */

    /**
     * 插入表deduct_config数据，并返回自增长Id
     * @param active
     * @param amountLimit
     * @param dayAmountLimit
     * @param merchantCardNo
     * @param merchantName
     * @param penAmountMinLimit
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public long insertDeductConfig(String active, String merchantCardNo, String merchantName,
                                   Date rawAddTime, Date rawUpdateTime) {
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }
        DeductConfigDO DO = new DeductConfigDO();
        DO.setActive(active);
        DO.setMerchantCardNo(merchantCardNo);
        DO.setMerchantName(merchantName);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        deductConfigDAO.insert(DO);
        return DO.getId();
    }

    /**
     * 根据merchantCardNo清除表deduct_config数据
     * @param merchantCardNo
     */
    public void cleanDeductConfigByMerchantCardNo(String merchantCardNo) {
        DeductConfigDOExample exam = new DeductConfigDOExample();
        exam.createCriteria().andMerchantCardNoEqualTo(merchantCardNo);
        deductConfigDAO.deleteByExample(exam);
    }

    /**
     * 清除表deduct_config所有数据
     *
     */
    public void cleanDeductConfigAll() {
        DeductConfigDOExample exam = new DeductConfigDOExample();
        exam.createCriteria();
        deductConfigDAO.deleteByExample(exam);
    }

    /**
     * 根据merchantCardNo查询表deduct_config数据
     * @param merchantCardNo
     * @return
     */
    public List<DeductConfigDO> findDeductConfigByMerchantCardNo(String merchantCardNo) {
        DeductConfigDOExample exam = new DeductConfigDOExample();
        exam.createCriteria().andMerchantCardNoEqualTo(merchantCardNo);
        return deductConfigDAO.selectByExample(exam);
    }

    /**
     * 根据userId和signNo清除auto_withdraw_config
     * @param userId
     * @param signNo
     */
    public void cleanAutoWithdrawConfigByUserIdandSignNo(String userId, String signNo) {
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        if (StringUtils.isBlank(signNo)) {
            signNo = TEST_STRING;
        }
        AutoWithdrawConfigDOExample example = new AutoWithdrawConfigDOExample();
        example.createCriteria().andUserIdEqualTo(userId).andSignNoEqualTo(signNo);
        autoWithdrawConfigDAO.deleteByExample(example);
    }

    /**
     * 根据userId和signNo查询auto_withdraw_config
     * @param userId
     * @param signNo
     * @return
     */
    public AutoWithdrawConfigDO findAutoWithdrawConfigByUserIdandSignNo(String userId, String signNo) {
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        if (StringUtils.isBlank(signNo)) {
            signNo = TEST_STRING;
        }
        AutoWithdrawConfigDOExample example = new AutoWithdrawConfigDOExample();
        example.createCriteria().andUserIdEqualTo(userId).andSignNoEqualTo(signNo);
        AutoWithdrawConfigDO autoWithdrawConfigDO = autoWithdrawConfigDAO.selectByExample(example)
                .get(0);
        return autoWithdrawConfigDO;
    }

    /**
     * 插入auto_withdraw_config
     * @param rawAddTime
     * @param rawUpdateTime
     * @param amountOption
     * @param amountOptionValue
     * @param amountThreshold
     * @param configFrom
     * @param expireTime
     * @param firstExecuteTime
     * @param inlet
     * @param lastExecuteTime
     * @param memo
     * @param merchantCardNo
     * @param nextExecuteTime
     * @param opened
     * @param periodRule
     * @param strategy
     * @param triggerOption
     * @param userId
     * @param userName
     * @param userRealName
     * @param delays
     * @param signNo
     * @return
     */
    public long insertAutoWithdrawConfig(Date rawAddTime, Date rawUpdateTime, String amountOption,
                                         Long amountOptionValue, Long amountThreshold,
                                         String configFrom, Date expireTime,
                                         Date firstExecuteTime, String inlet,
                                         Date lastExecuteTime, String memo,
                                         String merchantCardNo, Date nextExecuteTime,
                                         Byte opened, String periodRule, String strategy,
                                         String triggerOption, String userId, String userName,
                                         String userRealName, int delays, String signNo) {
        if (rawAddTime == null) {
            rawAddTime = TEST_DATE;
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = TEST_DATE;
        }
        if (StringUtils.isBlank(amountOption)) {
            amountOption = TEST_STRING;
        }
        if (amountOptionValue < 0) {
            amountOptionValue = TEST_LONG;
        }
        if (amountThreshold < 0) {
            amountThreshold = TEST_LONG;
        }
        if (StringUtils.isBlank(configFrom)) {
            configFrom = TEST_STRING;
        }
        if (expireTime == null) {
            expireTime = TEST_DATE;
        }
        if (firstExecuteTime == null) {
            firstExecuteTime = TEST_DATE;
        }
        if (StringUtils.isBlank(inlet)) {
            inlet = TEST_STRING;
        }
        if (lastExecuteTime == null) {
            lastExecuteTime = TEST_DATE;
        }
        if (StringUtils.isBlank(memo)) {
            memo = TEST_STRING;
        }
        if (StringUtils.isBlank(merchantCardNo)) {
            merchantCardNo = TEST_STRING;
        }
        if (nextExecuteTime == null) {
            nextExecuteTime = TEST_DATE;
        }
        if (opened == null) {
            opened = 0;
        }
        if (StringUtils.isBlank(periodRule)) {
            periodRule = TEST_STRING;
        }
        if (StringUtils.isBlank(strategy)) {
            strategy = TEST_STRING;
        }
        if (StringUtils.isBlank(triggerOption)) {
            triggerOption = TEST_STRING;
        }
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        if (StringUtils.isBlank(userName)) {
            userName = TEST_STRING;
        }
        if (StringUtils.isBlank(userRealName)) {
            userRealName = TEST_STRING;
        }
        if (delays < 0) {
            delays = TEST_INT;
        }
        if (StringUtils.isBlank(signNo)) {
            signNo = TEST_STRING;
        }
        AutoWithdrawConfigDO autoWithdrawConfigDO = new AutoWithdrawConfigDO();
        autoWithdrawConfigDO.setRawAddTime(rawAddTime);
        autoWithdrawConfigDO.setRawUpdateTime(rawUpdateTime);
        autoWithdrawConfigDO.setAmountOption(amountOption);
        autoWithdrawConfigDO.setAmountOptionValue(amountOptionValue);
        autoWithdrawConfigDO.setAmountThreshold(amountThreshold);
        autoWithdrawConfigDO.setConfigFrom(configFrom);
        autoWithdrawConfigDO.setExpireTime(expireTime);
        autoWithdrawConfigDO.setFirstExecuteTime(firstExecuteTime);
        autoWithdrawConfigDO.setInlet(inlet);
        autoWithdrawConfigDO.setLastExecuteTime(lastExecuteTime);
        autoWithdrawConfigDO.setMemo(memo);
        autoWithdrawConfigDO.setMerchantCardNo(merchantCardNo);
        autoWithdrawConfigDO.setNextExecuteTime(nextExecuteTime);
        autoWithdrawConfigDO.setOpened(opened);
        autoWithdrawConfigDO.setPeriodRule(periodRule);
        autoWithdrawConfigDO.setStrategy(strategy);
        autoWithdrawConfigDO.setTriggerOption(triggerOption);
        autoWithdrawConfigDO.setUserId(userId);
        autoWithdrawConfigDO.setUserName(userName);
        autoWithdrawConfigDO.setUserRealName(userRealName);
        autoWithdrawConfigDO.setDelays(delays);
        autoWithdrawConfigDO.setSignNo(signNo);
        autoWithdrawConfigDAO.insert(autoWithdrawConfigDO);
        return autoWithdrawConfigDO.getId();
    }

    /**
     * 插入数据到recon_history_apply表
     * @param id
     * @param gid
     * @param rawAddTime
     * @param rawUpdateTime
     * @param applyStartTime
     * @param applyEndTime
     * @param userId
     * @param partnerId
     * @param merchOrderNo
     * @return
     */
    public long insertReconHistoryApplyAll(long id, String gid, Date rawAddTime,
                                           Date rawUpdateTime, Date applyStartTime,
                                           Date applyEndTime, String userId, String partnerId,
                                           String merchOrderNo) {

        ReconHistoryApplyDO reconHistoryApplyDO = new ReconHistoryApplyDO();
        reconHistoryApplyDO.setId(id);
        reconHistoryApplyDO.setGid(gid);
        reconHistoryApplyDO.setRawAddTime(rawAddTime);
        reconHistoryApplyDO.setRawUpdateTime(rawUpdateTime);
        reconHistoryApplyDO.setApplyStartTime(applyStartTime);
        reconHistoryApplyDO.setApplyEndTime(applyEndTime);
        reconHistoryApplyDO.setUserId(userId);
        reconHistoryApplyDO.setPartnerId(partnerId);
        reconHistoryApplyDO.setMerchOrderNo(merchOrderNo);
        return reconHistoryApplyDAO.insert(reconHistoryApplyDO);
    }

    /**
     * 根据userId清除recon_file
     * @param userId
     */
    public void cleanReconFileByUserId(String userId) {
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        ReconFileDOExample example = new ReconFileDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        reconFileDAO.deleteByExample(example);
    }

    /**
     * 根据userId查询recon_file表数据
     * @param userId
     * @return
     */
    public List<ReconFileDO> findReconFileByUserId(String userId) {
        ReconFileDOExample example = new ReconFileDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<ReconFileDO> reconFileDO = reconFileDAO.selectByExample(example);
        return reconFileDO;
    }

    /**
     * 根据accountNo查询recon_file表数据
     * @param accountNo
     * @return
     */
    public List<ReconFileDO> findReconFileByAccountNo(String accountNo) {
        ReconFileDOExample example = new ReconFileDOExample();
        example.createCriteria().andAccountNoEqualTo(accountNo);
        List<ReconFileDO> reconFileDO = reconFileDAO.selectByExample(example);
        return reconFileDO;
    }

    /**
     * 根据userId清除recon_history_apply表的数据
     * @param userId
     */
    public void cleanReconHistoryApplyByUserId(String userId) {
        ReconHistoryApplyDOExample example = new ReconHistoryApplyDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        reconHistoryApplyDAO.deleteByExample(example);
    }

    /**
     * 根据userId查询recon_history_apply表的数据
     * @param userId
     * @return
     */
    public List<ReconHistoryApplyDO> findReconHistoryApplyByUserId(String userId) {
        ReconHistoryApplyDOExample example = new ReconHistoryApplyDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<ReconHistoryApplyDO> reconHistoryApplyDO = reconHistoryApplyDAO
                .selectByExample(example);
        return reconHistoryApplyDO;
    }

    public long insertReconfile(Date rawAddTime, Date rawUpdateTime, String accountNo,
                                String bizNo, String cardNo, String gid, String orderNo,
                                String reconDate, String reconFileDir, String reconFileName,
                                String reconFileStatus, Long totalCount, String userId,
                                String readStatus, String accountAlias) {

        ReconFileDO reconFileDO = new ReconFileDO();
        reconFileDO.setRawAddTime(rawAddTime);
        reconFileDO.setRawUpdateTime(rawUpdateTime);
        reconFileDO.setAccountNo(accountNo);
        reconFileDO.setBizNo(bizNo);
        reconFileDO.setCardNo(cardNo);
        reconFileDO.setGid(gid);
        reconFileDO.setOrderNo(orderNo);
        reconFileDO.setReconDate(reconDate);
        reconFileDO.setReconFileDir(reconFileDir);
        reconFileDO.setReconFileName(reconFileName);
        reconFileDO.setReconFileStatus(reconFileStatus);
        reconFileDO.setTotalCount(totalCount);
        reconFileDO.setUserId(userId);
        reconFileDO.setAccountAlias(accountAlias);
        reconFileDO.setReadStatus(readStatus);
        reconFileDAO.insert(reconFileDO);
        return reconFileDO.getId();
    }

    /**
     * 插入表recon_user_config
     * @param rawAddTime
     * @param rawUpdateTime
     * @param active
     * @param realName
     * @param userId
     * @param userName
     * @return
     */
    public long insertReconUserConfig(Date rawAddTime, Date rawUpdateTime, String active,
                                      String realName, String userId, String userName,
                                      String reconType) {
        if (rawAddTime == null) {
            rawAddTime = TEST_DATE;
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = TEST_DATE;
        }
        if (StringUtils.isBlank(active)) {
            active = TEST_STRING;
        }
        if (StringUtils.isBlank(realName)) {
            realName = TEST_STRING;
        }
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        if (StringUtils.isBlank(userName)) {
            userName = TEST_STRING;
        }
        ReconUserConfigDO reconUserConfigDO = new ReconUserConfigDO();
        reconUserConfigDO.setRawAddTime(rawAddTime);
        reconUserConfigDO.setRawUpdateTime(rawUpdateTime);
        reconUserConfigDO.setActive(active);
        reconUserConfigDO.setRealName(realName);
        reconUserConfigDO.setUserId(userId);
        reconUserConfigDO.setUserName(userName);
        reconUserConfigDO.setReconType(reconType);
        reconUserConfigDAO.insert(reconUserConfigDO);
        return reconUserConfigDO.getId();
    }

    /**
     * 根据userId删除recon_user_config
     * @param userId
     */
    public void cleanReconUserConfigByUserId(String userId) {
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        ReconUserConfigDOExample example = new ReconUserConfigDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        reconUserConfigDAO.deleteByExample(example);

    }

    /**
     * 根据userId查询recon_user_config
     * @param userId
     */
    public ReconUserConfigDO findReconUserConfigByUserId(String userId) {
        if (StringUtils.isBlank(userId)) {
            userId = TEST_STRING;
        }
        ReconUserConfigDOExample example = new ReconUserConfigDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        ReconUserConfigDO reconUserConfigDO = reconUserConfigDAO.selectByExample(example).get(0);
        return reconUserConfigDO;
    }


    /**
     * 根据merchant_card_no删除fast_trade_merchant
     * @param merchantCardNo
     */
    public void cleanFastTradeMerchantByMerchantCardNo(String merchantCardNo) {
        if (StringUtils.isBlank(merchantCardNo)) {
            merchantCardNo = TEST_STRING;
        }
        FastTradeMerchantDOExample example = new FastTradeMerchantDOExample();
        example.createCriteria().andMerchantCardNoEqualTo(merchantCardNo);
        fastTradeMerchantDAO.deleteByExample(example);
    }

    /**
     * 插入fast_trade_merchant
     * @param rawAddTime
     * @param rawUpdateTime
     * @param channelEnable
     * @param channelValidateWay
     * @param dayBankTimeLimit
     * @param dayMoneyLimit
     * @param dayTimeLimit
     * @param moneyLimit
     * @param enable
     * @param memo
     * @param merchantCardNo
     * @param merchantName
     * @param monthBankTimeLimit
     * @param operationName
     * @return
     */
    public long insertFastTradeMerchant(Date rawAddTime, Date rawUpdateTime, String channelEnable,
                                        String channelValidateWay, String enable, String memo,
                                        String merchantCardNo, String merchantName,
                                        String operationName) {
        FastTradeMerchantDO fastTradeMerchantDO = new FastTradeMerchantDO();
        fastTradeMerchantDO.setRawAddTime(rawAddTime);
        fastTradeMerchantDO.setRawUpdateTime(rawUpdateTime);
        fastTradeMerchantDO.setChannelEnable(channelEnable);
        fastTradeMerchantDO.setChannelValidateWay(channelValidateWay);
        fastTradeMerchantDO.setEnable(enable);
        fastTradeMerchantDO.setMemo(memo);
        fastTradeMerchantDO.setMerchantCardNo(merchantCardNo);
        fastTradeMerchantDO.setMerchantName(merchantName);
        fastTradeMerchantDO.setOperationName(operationName);
        fastTradeMerchantDAO.insert(fastTradeMerchantDO);
        return fastTradeMerchantDO.getId();

    }

    /**
     * 根据gid删除fast_trade
     * @param bizNo
     */
    public void cleanFastTradeBygid(String gid) {
        if (StringUtils.isBlank(gid)) {
            gid = TEST_STRING;
        }
        FastTradeDOExample example = new FastTradeDOExample();
        example.createCriteria().andGidEqualTo(gid);
        fastTradeDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询fast_trade
     * @param bizNo
     * @return
     */
    public List<FastTradeDO> findFastTradeBybizNo(String bizNo) {
        if (StringUtils.isBlank(bizNo)) {
            bizNo = TEST_STRING;
        }
        FastTradeDOExample example = new FastTradeDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        List<FastTradeDO> fastTradeDO = fastTradeDAO.selectByExample(example);
        return fastTradeDO;
    }

    /**
     * 校验fast_trade
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     * @param gid
     * @param inlet
     * @param memo
     * @param merchantAccNo
     * @param merchantCardNo
     * @param merchantOrderNo
     * @param merchantUserId
     * @param productCode
     * @param productStatus
     * @param autoChangeable
     * @param bankAccountName
     * @param bankCardNo
     * @param bankCardType
     * @param bankCode
     * @param bankName
     * @param certNo
     * @param certType
     * @param chargeNo
     * @param commandAmount
     * @param deductOutOrderNo
     * @param depositAmount
     * @param failReason
     * @param merchantChargeAccNo
     * @param merchantChargeAmount
     * @param merchantCustodiaAccNo
     * @param merchantName
     * @param mobile
     * @param payAmount
     * @param payNo
     * @param payOutOrderNo
     * @param presentChannel
     * @param protocolNo
     * @param sellerAccNo
     * @param sellerCardNo
     * @param sellerChargeAmount
     * @param sellerUserid
     * @param sellerUserRealName
     * @param subProtocolNo
     * @param tradeNo
     * @param usedChannels
     * @param userChargeAmount
     * @return
     */
    public String assertFastTrade(int size, String bizNo, Date rawAddTime, Date rawUpdateTime,
                                  String gid, String inlet, String memo, String merchantAccNo,
                                  String merchantCardNo, String merchantOrderNo,
                                  String merchantUserId, String productCode,
                                  String productStatus, String autoChangeable,
                                  String bankAccountName, String bankCardNo, String bankCardType,
                                  String bankCode, String bankName, String certNo,
                                  String certType, String chargeNo, Money commandAmount,
                                  String deductOutOrderNo, Money depositAmount,
                                  String failReason, String merchantChargeAccNo,
                                  Money merchantChargeAmount, String merchantCustodiaAccNo,
                                  String merchantName, String mobile, Money payAmount,
                                  String payNo, String payOutOrderNo, String presentChannel,
                                  String protocolNo, String sellerAccNo, String sellerCardNo,
                                  Money sellerChargeAmount, String sellerUserid,
                                  String sellerUserRealName, String subProtocolNo,
                                  String tradeNo, String usedChannels, Money userChargeAmount,
                                  String merchOrderNo, String personalCorporateType) {
        List<FastTradeDO> DO = findFastTradeBybizNo(bizNo);
        if (size < 1) {
            assertEquals(0, DO.size());
            return null;
        }
        assertEquals(bizNo, DO.get(0).getBizNo());
        if (rawAddTime == null) {
            assertEquals(DateUtil.shortDate(getSysDate()),
                    DateUtil.shortDate(DO.get(0).getRawAddTime()));
        } else {
            assertEquals(DateUtil.shortDate(rawAddTime),
                    DateUtil.shortDate(DO.get(0).getRawAddTime()));
        }
        if (rawUpdateTime == null) {
            assertEquals(DateUtil.shortDate(getSysDate()),
                    DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
        } else {
            assertEquals(DateUtil.shortDate(rawUpdateTime),
                    DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
        }

        String secIndex = DO.get(0).getSecIndex();
        BatchMapInfo batchMapInfo = new BatchMapInfo();
        try {
            batchMapInfo = securityDataClient.queryBySecIndexs(secIndex, null);
        } catch (Exception e) {
        }
        // 校验明文
        assertEquals(bankCardNo, batchMapInfo.getDataMap().get("bankCardNo"));
        assertEquals(bankAccountName, batchMapInfo.getDataMap().get("bankAccountName"));
        assertEquals(certNo, batchMapInfo.getDataMap().get("certNo"));
        assertEquals(mobile, batchMapInfo.getDataMap().get("mobile"));
        // 校验掩码
        assertEquals(DO.get(0).getBankCardNo(), getMask(bankCardNo));
        assertEquals(DO.get(0).getBankAccountName(), getMask(bankAccountName));
        assertEquals(DO.get(0).getCertNo(), getMask(certNo));
        assertEquals(DO.get(0).getMobile(), getMask(mobile));

        assertEquals(gid, DO.get(0).getGid());
        assertEquals(inlet, DO.get(0).getInlet());
        assertEquals(memo, DO.get(0).getMemo());
        assertEquals(merchantAccNo, DO.get(0).getMerchantAccNo());
        assertEquals(merchantCardNo, DO.get(0).getMerchantCardNo());
        assertEquals(merchantOrderNo, DO.get(0).getMerchantOrderNo());
        assertEquals(merchantUserId, DO.get(0).getMerchantUserId());
        assertEquals(productCode, DO.get(0).getProductCode());
        assertEquals(productStatus, DO.get(0).getProductStatus());
        assertEquals(autoChangeable, DO.get(0).getAutoChangeable());
        assertEquals(bankCardType, DO.get(0).getBankCardType());
        assertEquals(bankCode, DO.get(0).getBankCode());
        assertEquals(bankName, DO.get(0).getBankName());
        assertEquals(certType, DO.get(0).getCertType());
        assertEquals(chargeNo, DO.get(0).getChargeNo());
        assertEquals(commandAmount.getCent(), DO.get(0).getCommandAmount());
        assertEquals(deductOutOrderNo, DO.get(0).getDeductOutOrderNo());
        assertEquals(depositAmount.getCent(), DO.get(0).getDepositAmount());
        assertEquals(failReason, DO.get(0).getFailReason());
        assertEquals(merchantChargeAccNo, DO.get(0).getMerchantChargeAccNo());
        assertEquals(merchantChargeAmount.getCent(), DO.get(0).getMerchantChargeAmount());
        assertEquals(merchantCustodiaAccNo, DO.get(0).getMerchantCustodiaAccNo());
        assertEquals(merchantName, DO.get(0).getMerchantName());
        assertEquals(payAmount.getCent(), DO.get(0).getPayAmount());
        assertEquals(payNo, DO.get(0).getPayNo());
        assertEquals(payOutOrderNo, DO.get(0).getPayOutOrderNo());
        assertEquals(presentChannel, DO.get(0).getPresentChannel());
        assertEquals(protocolNo, DO.get(0).getProtocolNo());
        assertEquals(sellerAccNo, DO.get(0).getSellerAccNo());
        assertEquals(sellerCardNo, DO.get(0).getSellerCardNo());
        assertEquals(sellerChargeAmount.getCent(), DO.get(0).getSellerChargeAmount());
        assertEquals(sellerUserid, DO.get(0).getSellerUserId());
        assertEquals(sellerUserRealName, DO.get(0).getSellerUserRealName());
        assertEquals(subProtocolNo, DO.get(0).getSubProtocolNo());
        assertEquals(tradeNo, DO.get(0).getTradeNo());
        assertEquals(usedChannels, DO.get(0).getUsedChannels());
        assertEquals(userChargeAmount.getCent(), DO.get(0).getUserChargeAmount());
        assertEquals(merchOrderNo, DO.get(0).getMerchOrderNo());
        assertEquals(personalCorporateType, DO.get(0).getPersonalCorporateType());
        return null;

    }

    /**
     * 根据errorCode删除fast_trade_error_code
     * @param errorCode
     */
    public void cleanFastTradeErrorCodeByerrorCode(String errorCode) {
        if (StringUtils.isBlank(errorCode)) {
            errorCode = TEST_STRING;
        }
        FastTradeErrorCodeDOExample example = new FastTradeErrorCodeDOExample();
        example.createCriteria().andErrorCodeEqualTo(errorCode);
        fastTradeErrorCodeDAO.deleteByExample(example);
    }

    /**
     * 插入fast_trade_error_code
     * @param rawAddTime
     * @param rawUpdateTime
     * @param errorCode
     * @param errorDesc
     * @param memo
     * @return
     */
    public long insertFastTradeErrorCode(Date rawAddTime, Date rawUpdateTime, String errorCode,
                                         String errorDesc, String memo) {
        FastTradeErrorCodeDO fastTradeErrorCodeDO = new FastTradeErrorCodeDO();
        fastTradeErrorCodeDO.setRawAddTime(rawAddTime);
        fastTradeErrorCodeDO.setRawUpdateTime(rawUpdateTime);
        fastTradeErrorCodeDO.setErrorCode(errorCode);
        fastTradeErrorCodeDO.setErrorDesc(errorDesc);
        fastTradeErrorCodeDO.setMemo(memo);
        fastTradeErrorCodeDAO.insert(fastTradeErrorCodeDO);
        return fastTradeErrorCodeDO.getId();
    }

    /*
     * 对fast_pay表数据增删改查
     */

    /**
     * 根据bizNo清除fast_pay表数据
     * @param bizNo
     */
    public void cleanFastPayBybizNo(String bizNo) {
        FastPayDOExample example = new FastPayDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        fastPayDAO.deleteByExample(example);

    }
    /**
     * 清除fast_pay所有数据
     */
    public void cleanFastPayAll() {
        FastPayDOExample example = new FastPayDOExample();
        example.createCriteria();
        fastPayDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询fast_pay表的数据
     * @param bizNo
     */
    public FastPayDO findFastPayByBizNo(String bizNo) {
        FastPayDOExample example = new FastPayDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        FastPayDO fastPayDO = fastPayDAO.selectByExample(example).get(0);
        return fastPayDO;
    }

    /**
     * 根据bizNo更新fast_pay表的productStatus
     * @param bizNo
     * @param productStatus
     */
    public void updateFastPayByBizNoToProductStatus(String bizNo, String productStatus) {
        FastPayDOExample example = new FastPayDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        FastPayDO fastPayDO = fastPayDAO.selectByExample(example).get(0);
        fastPayDO.setProductStatus(productStatus);

        fastPayDAO.updateByExample(fastPayDO, example);
    }

    /**
     * 根据merchantOrderNo和merchantCardNo清除fast_pay表数据
     * @param merchantOrderNo
     * @param merchantCardNo
     */
    public void cleanFastPayByMerchantOrderNoAndMerchantCardNo(String merchantOrderNo,
                                                               String merchantCardNo) {
        FastPayDOExample example = new FastPayDOExample();
        example.createCriteria().andMerchantOrderNoEqualTo(merchantOrderNo)
                .andMerchantCardNoEqualTo(merchantCardNo);
        fastPayDAO.deleteByExample(example);
    }

    /**
     * 根据merchantOrderNo和merchantCardNo查询fast_pay表数据
     * @param merchantOrderNo
     * @param merchantCardNo
     */
    public List<FastPayDO> queryFastPayByMerchantOrderNoAndMerchantCardNo(String merchantOrderNo,
                                                                          String merchantCardNo) {
        FastPayDOExample example = new FastPayDOExample();
        example.createCriteria().andMerchantOrderNoEqualTo(merchantOrderNo)
                .andMerchantCardNoEqualTo(merchantCardNo);
        return fastPayDAO.selectByExample(example);
    }

    /**
     * 根据merchantOrderNo和merchantCardNo查询校验fast_pay表数据
     * @param size
     * @param merchantOrderNo
     * @param merchantCardNo
     * @param bizNo
     * @param productCode
     * @param gid
     * @param merchOrderNo
     * @param merchantUserId
     * @param merchantAccNo
     * @param productStatus
     * @param inlet
     * @param memo
     * @param autoCloseDuration
     * @param tradeName
     * @param buyerUserId
     * @param buyerCardNo
     * @param buyerAccNo
     * @param sellerUserId
     * @param sellerCardNo
     * @param sellerAccNo
     * @param sellerRealName
     * @param tradeAmount
     * @param currency
     * @param foreignAmount
     * @param foreignCurrency
     * @param rate
     * @param hasRefund
     * @param failReason
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertFastPay(int size, String merchantOrderNo, String merchantCardNo,
                              String bizNo, String productCode, String gid, String merchOrderNo,
                              String merchantUserId, String merchantAccNo, String productStatus,
                              String inlet, String nationalType, String memo,
                              long autoCloseDuration, String tradeName, String buyerUserId,
                              String buyerCardNo, String buyerAccNo, String sellerUserId,
                              String sellerCardNo, String sellerAccNo, String sellerRealName,
                              Money tradeAmount, String currency, Money foreignAmount,
                              String foreignCurrency, Double rate, String hasRefund,
                              String failReason, Date rawAddTime, Date rawUpdateTime,
                              String buyerRealName, String withdrawStatus, String payMode,
                              String outUserId, String sellerBankAccountNo, Money shareAmount,
                              String pactNo, Date applyDate) {
        List<FastPayDO> DO = queryFastPayByMerchantOrderNoAndMerchantCardNo(merchantOrderNo,
                merchantCardNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertEquals(bizNo, DO.get(0).getBizNo());
            assertEquals(buyerAccNo, DO.get(0).getBuyerAccNo());
            assertEquals(buyerCardNo, DO.get(0).getBuyerCardNo());
            assertEquals(buyerUserId, DO.get(0).getBuyerUserId());
            assertEquals(currency, DO.get(0).getCurrency());
            assertEquals(failReason, DO.get(0).getFailReason());
            assertEquals(foreignAmount, DO.get(0).getForeignAmount());
            assertEquals(foreignCurrency, DO.get(0).getForeignCurrency());
            assertEquals(gid, DO.get(0).getGid());
            assertEquals(hasRefund, DO.get(0).getHasRefund());
            assertEquals(inlet, DO.get(0).getInlet());
            assertEquals(memo, DO.get(0).getMemo());
            assertEquals(merchantAccNo, DO.get(0).getMerchantAccNo());
            assertEquals(merchantCardNo, DO.get(0).getMerchantCardNo());
            assertEquals(merchantOrderNo, DO.get(0).getMerchantOrderNo());
            assertEquals(merchantUserId, DO.get(0).getMerchantUserId());
            assertEquals(merchOrderNo, DO.get(0).getMerchOrderNo());
            assertEquals(productCode, DO.get(0).getProductCode());
            assertEquals(productStatus, DO.get(0).getProductStatus());
            if (rate != null) {
                assertEquals(rate.toString(), DO.get(0).getRate());
            }
            assertEquals(sellerAccNo, DO.get(0).getSellerAccNo());
            assertEquals(sellerCardNo, DO.get(0).getSellerCardNo());
            assertEquals(sellerUserId, DO.get(0).getSellerUserId());
            assertEquals(tradeAmount, DO.get(0).getTradeAmount());
            assertEquals(tradeName, DO.get(0).getTradeName());
            assertEquals(nationalType, DO.get(0).getNationalType());
            assertEquals(autoCloseDuration, DO.get(0).getAutoCloseDuration());
            assertEquals(sellerRealName, DO.get(0).getSellerRealName());
            assertEquals(buyerRealName, DO.get(0).getBuyerRealName());
            assertEquals(withdrawStatus, DO.get(0).getWithdrawStatus());
            assertEquals(payMode, DO.get(0).getPayMode());
            assertEquals(outUserId, DO.get(0).getOutUserId());
            assertEquals(shareAmount, DO.get(0).getShareAmount());
            assertEquals(pactNo, DO.get(0).getPactNo());
            BatchMapInfo batchMapInfo = decryptSecurityDataByDataIndex(DO.get(0).getSecIndex());
            if (sellerBankAccountNo == null) {
                assertEquals(sellerBankAccountNo, DO.get(0).getSellerBankAccountNo());//脱敏校验
            } else {
                assertEquals(getMask(sellerBankAccountNo), DO.get(0).getSellerBankAccountNo());//脱敏校验
                assertEquals(sellerBankAccountNo,
                        batchMapInfo.getDataMap().get("sellerBankAccountNo"));//脱敏校验
            }
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
            if (applyDate == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(applyDate),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /**
     * 插入fast_pay
     * @param bizNo
     * @param productCode
     * @param gid
     * @param merchantOrderNo
     * @param merchOrderNO
     * @param merchantUserId
     * @param merchantCardNo
     * @param merchantAccNo
     * @param productStatus
     * @param inlet
     * @param nationalType
     * @param memo
     * @param autoCloseDuration
     * @param tradeName
     * @param outUserId
     * @param buyerUserId
     * @param buyerCardNo
     * @param buyerAccNo
     * @param buyerRealName
     * @param sellerUserId
     * @param sellerCardNo
     * @param sellerAccNo
     * @param sellerRealName
     * @param tradeAmount
     * @param currency
     * @param foreignAmount
     * @param foreignCurrency
     * @param rate
     * @param hasRefund
     * @param withdrawStatus
     * @param failReason
     * @param applyTime
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void insertFastPay(String bizNo, String productCode, String gid, String merchantOrderNo,
                              String merchOrderNo, String merchantUserId, String merchantCardNo,
                              String merchantAccNo, String productStatus, String inlet,
                              String nationalType, String memo, long autoCloseDuration,
                              String tradeName, String outUserId, String buyerUserId,
                              String buyerCardNo, String buyerAccNo, String buyerRealName,
                              String sellerUserId, String sellerCardNo, String sellerAccNo,
                              String sellerRealName, Money tradeAmount, String currency,
                              Money foreignAmount, String foreignCurrency, String rate,
                              String hasRefund, String withdrawStatus, String failReason,
                              Date applyTime, Date rawAddTime, Date rawUpdateTime) {
        FastPayDO fastPayDO = new FastPayDO();
        fastPayDO.setApplyPayTime(applyTime);
        fastPayDO.setAutoCloseDuration(autoCloseDuration);
        fastPayDO.setBizNo(bizNo);
        fastPayDO.setBuyerAccNo(buyerAccNo);
        fastPayDO.setBuyerCardNo(buyerCardNo);
        fastPayDO.setBuyerRealName(buyerRealName);
        fastPayDO.setBuyerUserId(buyerUserId);
        fastPayDO.setCurrency(currency);
        fastPayDO.setFailReason(failReason);
        fastPayDO.setForeignAmount(foreignAmount);
        fastPayDO.setForeignCurrency(foreignCurrency);
        fastPayDO.setGid(gid);
        fastPayDO.setHasRefund(hasRefund);
        fastPayDO.setInlet(inlet);
        fastPayDO.setMemo(memo);
        fastPayDO.setMerchantAccNo(merchantAccNo);
        fastPayDO.setMerchantCardNo(merchantCardNo);
        fastPayDO.setMerchantOrderNo(merchantOrderNo);
        fastPayDO.setMerchantUserId(merchantUserId);
        fastPayDO.setMerchOrderNo(merchOrderNo);
        fastPayDO.setNationalType(nationalType);
        fastPayDO.setOutUserId(outUserId);
        fastPayDO.setProductCode(productCode);
        fastPayDO.setProductStatus(productStatus);
        fastPayDO.setRate(rate);
        fastPayDO.setRawAddTime(rawAddTime);
        fastPayDO.setRawUpdateTime(rawUpdateTime);
        fastPayDO.setSellerAccNo(sellerAccNo);
        fastPayDO.setSellerCardNo(sellerCardNo);
        fastPayDO.setSellerRealName(sellerRealName);
        fastPayDO.setSellerUserId(sellerUserId);
        fastPayDO.setTradeAmount(tradeAmount);
        fastPayDO.setTradeName(tradeName);
        fastPayDO.setWithdrawStatus(withdrawStatus);
        fastPayDAO.insert(fastPayDO);

    }

    /*
     * 对fast_pay_timeouts表数据增删改查
     */

    /**
     * 根据bizNo清除fast_pay_timeouts表数据
     * @param bizNo
     */
    public void cleanFastPayTimeoutsBybizNo(String bizNo) {
        FastPayTimeoutsDOExample example = new FastPayTimeoutsDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        fastPayTimeoutsDAO.deleteByExample(example);

    }

    /**
     * 清除fast_pay_timeouts表所有数据
     */
    public void cleanFastPayTimeoutsByAll() {
        FastPayTimeoutsDOExample example = new FastPayTimeoutsDOExample();
        example.createCriteria();
        fastPayTimeoutsDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询fast_pay_timeouts表数据
     * @param bizNo
     */
    public List<FastPayTimeoutsDO> queryFastPayTimeoutsByBizNo(String bizNo) {
        FastPayTimeoutsDOExample example = new FastPayTimeoutsDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        return fastPayTimeoutsDAO.selectByExample(example);
    }

    /**
     * 查询fast_pay_timeouts表所有数据
     */
    public List<FastPayTimeoutsDO> queryFastPayTimeoutsByAll() {
        FastPayTimeoutsDOExample example = new FastPayTimeoutsDOExample();
        example.createCriteria();
        return fastPayTimeoutsDAO.selectByExample(example);
    }

    /**
     * 根据bizNo更新fast_pay_timeouts表的timeoutDate值
     * @param bizNo
     * @param timeoutDate
     */
    public void updateFastPayTimeoutsByBizNoToTimeoutDate(String bizNo, Date timeoutDate) {
        FastPayTimeoutsDOExample example = new FastPayTimeoutsDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        FastPayTimeoutsDO DO = fastPayTimeoutsDAO.selectByExample(example).get(0);
        DO.setTimeoutDate(timeoutDate);
        fastPayTimeoutsDAO.updateByExample(DO, example);
    }

    /**
     * 根据bizNo查询校验fast_pay_timeouts表数据
     * @param size
     * @param bizNo
     * @param tradeStatus
     * @param timeoutTradeStatus
     * @param timeoutAction
     * @param timeoutDate
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertFastPayTimeouts(int size, String bizNo, String tradeStatus,
                                      String timeoutTradeStatus, String timeoutAction,
                                      Date timeoutDate, Date rawAddTime, Date rawUpdateTime) {
        List<FastPayTimeoutsDO> DO = queryFastPayTimeoutsByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertEquals(timeoutAction, DO.get(0).getTimeoutAction());
            assertEquals(timeoutTradeStatus, DO.get(0).getTimeoutTradeStatus());
            assertEquals(tradeStatus, DO.get(0).getTradeStatus());
            if (timeoutDate == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getTimeoutDate()));
            } else {
                assertEquals(DateUtil.shortDate(timeoutDate),
                        DateUtil.shortDate(DO.get(0).getTimeoutDate()));
            }
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    //对表trade_pay_info表数据增删改查
    /**
     * 根据bizNo删除trade_pay_info表数据
     * @param bizNo
     */
    public void cleanTradePayInfoByBizNo(String bizNo) {
        TradePayInfoDOExample example = new TradePayInfoDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        tradePayInfoDAO.deleteByExample(example);
    }

    /**
     * 删除trade_pay_info表所有数据
     */
    public void cleanTradePayInfoByAll() {
        TradePayInfoDOExample example = new TradePayInfoDOExample();
        example.createCriteria();
        tradePayInfoDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询trade_pay_info表数据
     * @param bizNo
     * @return
     */
    public List<TradePayInfoDO> queryTradePayInfoByBizNo(String bizNo) {
        TradePayInfoDOExample example = new TradePayInfoDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        return tradePayInfoDAO.selectByExample(example);
    }

    /**
     * 根据bizNo和payBizNo查询trade_pay_info表数据
     * @param payBizNo
     * @return
     */
    public List<TradePayInfoDO> queryTradePayInfoByPayBizNo(String payBizNo) {
        TradePayInfoDOExample example = new TradePayInfoDOExample();
        example.createCriteria().andPayBizNoEqualTo(payBizNo);
        return tradePayInfoDAO.selectByExample(example);
    }

    /**
     * 根据bizNo查询校验trade_pay_info表数据
     * @param size
     * @param bizNo
     * @param payBizNo
     * @param batchNo
     * @param depositNo
     * @param depositAmount
     * @param payAmount
     * @param source
     * @param buyerFee
     * @param sellerFee
     * @param partnerFee
     * @param mergeFlag
     * @param payerUserId
     * @param payerCardNo
     * @param payerAccNo
     * @param supervisionAccNo
     * @param payMethod
     * @param bankCode
     * @param personalCorporateType
     * @param cardType
     * @param mutableType
     * @param protocolNo
     * @param pactNo
     * @param bankAccountNo
     * @param realName
     * @param certNo
     * @param certType
     * @param userEndIp
     * @param macAddress
     * @param userTerminalType
     * @param payStatus
     * @param memo
     * @param rawAddTime
     * @param rawUpdateTime
     * @param subsidyAmount
     */
    public void assertTradePayInfo(int size, String bizNo, String payBizNo, String batchNo,
                                   String depositNo, Money depositAmount, Money payAmount,
                                   String source, Money buyerFee, Money sellerFee,
                                   Money partnerFee, String mergeFlag, String payerUserId,
                                   String payerCardNo, String payerAccNo, String supervisionAccNo,
                                   String payMethod, String bankCode,
                                   String personalCorporateType, String cardType,
                                   String mutableType, String protocolNo, String pactNo,
                                   String bankAccountNo, String realName, String certNo,
                                   String certType, String userEndIp, String macAddress,
                                   String userTerminalType, String payStatus, String memo,
                                   Date rawAddTime, Date rawUpdateTime, Money shareAmount,
                                   Money bailPayMoney, Money subsidyAmount) {
        List<TradePayInfoDO> DO = queryTradePayInfoByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            if (DO.size() >= 2) {
                DO = queryTradePayInfoByPayBizNo(payBizNo);
            }
            BatchMapInfo batchMapInfo = decryptSecurityDataByDataIndex(DO.get(0).getDataIndex());
            if (bankAccountNo == null) {
                assertEquals(bankAccountNo, DO.get(0).getBankAccountNo());//脱敏校验
            } else {
                assertEquals(getMask(bankAccountNo), DO.get(0).getBankAccountNo());//脱敏校验
                assertEquals(getDigest(bankAccountNo), DO.get(0).getBankAccountNoDigest());//脱敏校验
                assertEquals(bankAccountNo, batchMapInfo.getDataMap().get("bankAccountNo"));//脱敏校验
            }
            assertEquals(bankCode, DO.get(0).getBankCode());
            assertEquals(batchNo, DO.get(0).getBatchNo());
            assertEquals(buyerFee, DO.get(0).getBuyerFee());
            assertEquals(cardType, DO.get(0).getCardType());
            if (certNo == null) {
                assertEquals(certNo, DO.get(0).getCertNo());//脱敏校验
            } else {
                assertEquals(getMask(certNo), DO.get(0).getCertNo());//脱敏校验
                assertEquals(certNo, batchMapInfo.getDataMap().get("certNo"));//脱敏校验
            }
            assertEquals(certType, DO.get(0).getCertType());
            assertEquals(depositAmount, DO.get(0).getDepositAmount());
            assertEquals(depositNo, DO.get(0).getDepositNo());
            assertEquals(macAddress, DO.get(0).getMacAddress());
            assertEquals(memo, DO.get(0).getMemo());
            assertEquals(mergeFlag, DO.get(0).getMergeFlag());
            assertEquals(mutableType, DO.get(0).getMutableType());
            assertEquals(pactNo, DO.get(0).getPactNo());
            assertEquals(partnerFee, DO.get(0).getPartnerFee());
            assertEquals(payAmount, DO.get(0).getPayAmount());
            assertEquals(payBizNo, DO.get(0).getPayBizNo());
            assertEquals(payerAccNo, DO.get(0).getPayerAccNo());
            assertEquals(payerCardNo, DO.get(0).getPayerCardNo());
            assertEquals(payerUserId, DO.get(0).getPayerUserId());
            assertEquals(payMethod, DO.get(0).getPayMethod());
            assertEquals(payStatus, DO.get(0).getPayStatus());
            assertEquals(personalCorporateType, DO.get(0).getPersonalCorporateType());
            if (realName == null) {
                assertEquals(realName, DO.get(0).getRealName());
            } else {
                assertEquals(getMask(realName), DO.get(0).getRealName());
            }
            assertEquals(sellerFee, DO.get(0).getSellerFee());
            assertEquals(supervisionAccNo, DO.get(0).getSupervisionAccNo());
            assertEquals(userEndIp, DO.get(0).getUserEndIp());
            assertEquals(userTerminalType, DO.get(0).getUserTerminalType());
            assertEquals(source, DO.get(0).getSource());
            assertEquals(protocolNo, DO.get(0).getProtocolNo());
            assertEquals(shareAmount, DO.get(0).getShareAmount());
            assertEquals(bailPayMoney, DO.get(0).getBailPayAmount());
            assertEquals(subsidyAmount, DO.get(0).getSubsidyAmount());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /**
     * 根据bizNo查询校验trade_pay_info表数据,无payBizNo和batchNo
     * @param size
     * @param bizNo
     * @param depositNo
     * @param depositAmount
     * @param payAmount
     * @param source
     * @param buyerFee
     * @param sellerFee
     * @param partnerFee
     * @param mergeFlag
     * @param payerUserId
     * @param payerCardNo
     * @param payerAccNo
     * @param supervisionAccNo
     * @param payMethod
     * @param bankCode
     * @param personalCorporateType
     * @param cardType
     * @param mutableType
     * @param protocolNo
     * @param pactNo
     * @param bankAccountNo
     * @param realName
     * @param certNo
     * @param certType
     * @param userEndIp
     * @param macAddress
     * @param userTerminalType
     * @param payStatus
     * @param memo
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertTradePayInfo(int size, String bizNo, String depositNo, Money depositAmount,
                                   Money payAmount, String source, Money buyerFee,
                                   Money sellerFee, Money partnerFee, String mergeFlag,
                                   String payerUserId, String payerCardNo, String payerAccNo,
                                   String supervisionAccNo, String payMethod, String bankCode,
                                   String personalCorporateType, String cardType,
                                   String mutableType, String protocolNo, String pactNo,
                                   String bankAccountNo, String realName, String certNo,
                                   String certType, String userEndIp, String macAddress,
                                   String userTerminalType, String payStatus, String memo,
                                   Date rawAddTime, Date rawUpdateTime) {
        List<TradePayInfoDO> DO = queryTradePayInfoByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            BatchMapInfo batchMapInfo = decryptSecurityDataByDataIndex(DO.get(0).getDataIndex());
            if (bankAccountNo == null) {
                assertEquals(bankAccountNo, DO.get(0).getBankAccountNo());//脱敏校验
            } else {
                assertEquals(getMask(bankAccountNo), DO.get(0).getBankAccountNo());//脱敏校验
                assertEquals(getDigest(bankAccountNo), DO.get(0).getBankAccountNoDigest());//脱敏校验
                assertEquals(bankAccountNo, batchMapInfo.getDataMap().get("bankAccountNo"));//脱敏校验
            }
            assertEquals(bankCode, DO.get(0).getBankCode());
            assertEquals(buyerFee, DO.get(0).getBuyerFee());
            assertEquals(cardType, DO.get(0).getCardType());
            if (certNo == null) {
                assertEquals(certNo, DO.get(0).getCertNo());//脱敏校验
            } else {
                assertEquals(getMask(certNo), DO.get(0).getCertNo());//脱敏校验
                assertEquals(certNo, batchMapInfo.getDataMap().get("certNo"));//脱敏校验
            }
            assertEquals(certType, DO.get(0).getCertType());
            assertEquals(depositAmount, DO.get(0).getDepositAmount());
            assertEquals(depositNo, DO.get(0).getDepositNo());
            assertEquals(macAddress, DO.get(0).getMacAddress());
            assertEquals(memo, DO.get(0).getMemo());
            assertEquals(mergeFlag, DO.get(0).getMergeFlag());
            assertEquals(mutableType, DO.get(0).getMutableType());
            assertEquals(pactNo, DO.get(0).getPactNo());
            assertEquals(partnerFee, DO.get(0).getPartnerFee());
            assertEquals(payAmount, DO.get(0).getPayAmount());
            assertEquals(payerAccNo, DO.get(0).getPayerAccNo());
            assertEquals(payerCardNo, DO.get(0).getPayerCardNo());
            assertEquals(payerUserId, DO.get(0).getPayerUserId());
            assertEquals(payMethod, DO.get(0).getPayMethod());
            assertEquals(payStatus, DO.get(0).getPayStatus());
            assertEquals(personalCorporateType, DO.get(0).getPersonalCorporateType());
            if (realName == null) {
                assertEquals(realName, DO.get(0).getRealName());
            } else {
                assertEquals(getMask(realName), DO.get(0).getRealName());
            }
            assertEquals(sellerFee, DO.get(0).getSellerFee());
            assertEquals(supervisionAccNo, DO.get(0).getSupervisionAccNo());
            assertEquals(userEndIp, DO.get(0).getUserEndIp());
            assertEquals(userTerminalType, DO.get(0).getUserTerminalType());
            assertEquals(source, DO.get(0).getSource());
            assertEquals(protocolNo, DO.get(0).getProtocolNo());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /**
     * 插入数据到trade_pay_info表
     * @param payBizNo
     * @param batchNo
     * @param bizNo
     * @param depositNo
     * @param transferNo
     * @param settleBizNo
     * @param depositAmount
     * @param payAmount
     * @param source
     * @param chargeNo
     * @param buyerFee
     * @param sellerFee
     * @param partnerFee
     * @param mergeFlag
     * @param payerUserId
     * @param payerAccNo
     * @param supervisionAccNo
     * @param payMethod
     * @param bankCode
     * @param personalCorporateType
     * @param cardType
     * @param mutableType
     * @param protocolNo
     * @param pactNo
     * @param payerCardNo
     * @param bankAccountNo
     * @param bankAccountNoDigest
     * @param realName
     * @param certNo
     * @param certType
     * @param userEndIp
     * @param macAddress
     * @param userTerminalType
     * @param payStatus
     * @param memo
     * @param dataIndex
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void insertTradePayInfo(String payBizNo, String batchNo, String bizNo, String depositNo,
                                   String transferNo, String settleBizNo, Money depositAmount,
                                   Money payAmount, String source, String chargeNo,
                                   Money buyerFee, Money sellerFee, Money partnerFee,
                                   String mergeFlag, String payerUserId, String payerAccNo,
                                   String supervisionAccNo, String payMethod, String bankCode,
                                   String personalCorporateType, String cardType,
                                   String mutableType, String protocolNo, String pactNo,
                                   String payerCardNo, String bankAccountNo,
                                   String bankAccountNoDigest, String realName, String certNo,
                                   String certType, String userEndIp, String macAddress,
                                   String userTerminalType, String payStatus, String memo,
                                   String dataIndex, Date rawAddTime, Date rawUpdateTime) {
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }

        //加密字段装载
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("bankAccountNo", bankAccountNo);
        dataMap.put("certNo", certNo);
        dataMap.put("realName", realName);

        //		加密服务
        SecMapInfo secMapInfo = new SecMapInfo();
        try {
            secMapInfo = securityDataClient.dataBatchStore(dataMap);
        } catch (Exception e) {

        }

        TradePayInfoDO tradePayInfoDO = new TradePayInfoDO();
        tradePayInfoDO.setPayBizNo(payBizNo);
        tradePayInfoDO.setBatchNo(batchNo);
        tradePayInfoDO.setBizNo(bizNo);
        tradePayInfoDO.setDepositNo(depositNo);
        tradePayInfoDO.setTransferNo(transferNo);
        tradePayInfoDO.setSettleBizNo(settleBizNo);
        tradePayInfoDO.setDepositAmount(depositAmount);
        tradePayInfoDO.setPayAmount(payAmount);
        tradePayInfoDO.setSource(source);
        tradePayInfoDO.setChargeNo(chargeNo);
        tradePayInfoDO.setBuyerFee(buyerFee);
        tradePayInfoDO.setSellerFee(sellerFee);
        tradePayInfoDO.setPartnerFee(partnerFee);
        tradePayInfoDO.setMergeFlag(mergeFlag);
        tradePayInfoDO.setPayerUserId(payerUserId);
        tradePayInfoDO.setPayerCardNo(payerCardNo);
        tradePayInfoDO.setPayerAccNo(payerAccNo);
        tradePayInfoDO.setSupervisionAccNo(supervisionAccNo);
        tradePayInfoDO.setPayMethod(payMethod);
        tradePayInfoDO.setBankCode(bankCode);
        tradePayInfoDO.setPersonalCorporateType(personalCorporateType);
        tradePayInfoDO.setCardType(cardType);
        tradePayInfoDO.setMutableType(mutableType);
        tradePayInfoDO.setProtocolNo(protocolNo);
        tradePayInfoDO.setPactNo(pactNo);
        tradePayInfoDO.setBankAccountNo(getMask(bankAccountNo));

        tradePayInfoDO.setBankAccountNoDigest(secMapInfo.getIndexMap().get("bankAccountNoDigest"));
        tradePayInfoDO.setBankAccountNoDigest(getDigest(bankAccountNoDigest));

        tradePayInfoDO.setRealName(getMask(realName));
        tradePayInfoDO.setCertNo(getMask(certNo));
        tradePayInfoDO.setCertType(certType);
        tradePayInfoDO.setUserEndIp(userEndIp);
        tradePayInfoDO.setMacAddress(macAddress);
        tradePayInfoDO.setUserTerminalType(userTerminalType);
        tradePayInfoDO.setPayStatus(payStatus);
        tradePayInfoDO.setMemo(memo);
        tradePayInfoDO.setDataIndex(secMapInfo.getSecIndex());
        tradePayInfoDO.setRawAddTime(rawAddTime);
        tradePayInfoDO.setRawUpdateTime(rawUpdateTime);
        tradePayInfoDAO.insert(tradePayInfoDO);
    }

    //对表fast_pay_bank表数据增删改查
    /**
     * 根据bankCode清除fast_pay_bank表数据
     * @param bankCode
     */
    public void cleanFastPayBankByBankCode(String bankCode) {
        FastPayBankDOExample example = new FastPayBankDOExample();
        example.createCriteria().andBankCodeEqualTo(bankCode);
        fastPayBankDAO.deleteByExample(example);
    }

    /**
     * 插入fast_pay_bank表数据
     * @param bankCode
     * @param bankName
     * @param operatorName
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public int insertFastPayBank(String bankCode, String bankName, String operatorName,
                                 Date rawAddTime, Date rawUpdateTime) {
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }
        FastPayBankDO DO = new FastPayBankDO();
        DO.setBankCode(bankCode);
        DO.setBankName(bankName);
        DO.setOperatorName(operatorName);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        fastPayBankDAO.insert(DO);
        return DO.getId();
    }

    /**
     * 根据methodCode清除fas_tpay_method表数据
     * @param methodCode
     */
    public void cleanFastPayMethodByMethodCode(String methodCode) {
        FastPayMethodDOExample example = new FastPayMethodDOExample();
        example.createCriteria().andMethodCodeEqualTo(methodCode);
        fastPayMethodDAO.deleteByExample(example);
    }

    /**
     * 根据method_code更新表fast_pay_method字段status值
     */
    protected void updateFastPayMethodByMethodCode(String methodCode, String status) {
        if (StringUtils.isBlank(methodCode)) {
            methodCode = TEST_STRING;
        }
        FastPayMethodDOExample exam = new FastPayMethodDOExample();
        exam.createCriteria().andMethodCodeEqualTo(methodCode);
        FastPayMethodDO fastPayMethodDO = fastPayMethodDAO.selectByExample(exam).get(0);
        fastPayMethodDO.setStatus(status);
        fastPayMethodDAO.updateByExample(fastPayMethodDO, exam);
    }

    /**
     * 插入fastpay_method_info表数据
     * @param methodCode
     * @param methodName
     * @param transactionType
     * @param subTransactionType
     * @param personalCorporateType
     * @param cardType
     * @param memo
     * @param operatorName
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public int insertFastPayMethod(String methodCode, String methodName, String transactionType,
                                   String subTransactionType, String personalCorporateType,
                                   String cardType, String memo, String operatorName,
                                   Date rawAddTime, Date rawUpdateTime) {
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }
        FastPayMethodDO DO = new FastPayMethodDO();
        DO.setCardType(cardType);
        DO.setMemo(memo);
        DO.setMethodCode(methodCode);
        DO.setMethodName(methodName);
        DO.setOperatorName(operatorName);
        DO.setPersonalCorporateType(personalCorporateType);
        DO.setSubTransactionType(subTransactionType);
        DO.setTransactionType(transactionType);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        fastPayMethodDAO.insert(DO);
        return DO.getId();
    }

    //对表fast_pay_source_method表数据增删改查
    /**
     * 根据source or methodCode清除fast_pay_source_method表数据
     * @param source
     * @param methodCode
     */
    public void cleanFastPaySourceMethodBySourceOrMethodCode(String source, String methodCode) {
        FastPaySourceMethodDOExample example = new FastPaySourceMethodDOExample();
        example.createCriteria().andSourceEqualTo(source);
        fastPaySourceMethodDAO.deleteByExample(example);
        FastPaySourceMethodDOExample exam = new FastPaySourceMethodDOExample();
        example.createCriteria().andMethodCodeEqualTo(methodCode);
        fastPaySourceMethodDAO.deleteByExample(exam);
    }

    /**
     * 插入fast_pay_source_method表数据
     * @param source
     * @param methodCode
     * @param memo
     * @param operatorName
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public int insertFastPaySourceMethod(String source, String methodCode, String memo,
                                         String operatorName, Date rawAddTime, Date rawUpdateTime) {
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }
        FastPaySourceMethodDO DO = new FastPaySourceMethodDO();
        DO.setMemo(memo);
        DO.setMethodCode(methodCode);
        DO.setSource(source);
        DO.setOperatorName(operatorName);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        fastPaySourceMethodDAO.insert(DO);
        return DO.getId();
    }

    //对表fast_pay_channel表数据增删改查
    /**
     * 根据merchantId清除fast_pay_channel表数据
     * @param merchantId
     */
    public void cleanFastPayChannelByMerchantId(String merchantId) {
        FastPayChannelDOExample example = new FastPayChannelDOExample();
        example.createCriteria().andMerchantIdEqualTo(merchantId);
        fastPayChannelDAO.deleteByExample(example);
    }

    /**
     * 插入fast_pay_channel表数据
     * @param merchantId
     * @param productCode
     * @param source
     * @param methodCode
     * @param bankCode
     * @param mutableType
     * @param operatorName
     * @param rawAddTime
     * @param rawUpdateTime
     * @param type
     * @return
     */
    public int insertFastPayChannel(String merchantId, String productCode, String source,
                                    String methodCode, String bankCode, String mutableType,
                                    String operatorName, Date rawAddTime, Date rawUpdateTime,
                                    String type) {
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }
        FastPayChannelDO DO = new FastPayChannelDO();
        DO.setMerchantId(merchantId);
        DO.setMutableType(mutableType);
        DO.setBankCode(bankCode);
        DO.setProductCode(productCode);
        DO.setMethodCode(methodCode);
        DO.setSource(source);
        DO.setOperatorName(operatorName);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setType(type);
        fastPayChannelDAO.insert(DO);
        return DO.getId();
    }

    /**
     * 根据merchantId清除fast_pay_merchant表数据
     * @param merchantId
     */
    public void cleanFastPayMerchantByMerchantId(String merchantId) {
        FastPayMerchantDOExample example = new FastPayMerchantDOExample();
        example.createCriteria().andMerchantIdEqualTo(merchantId);
        fastPayMerchantDAO.deleteByExample(example);
    }

    /**
     * 根据merchantId查询fast_pay_merchant表数据
     * @param merchantId
     */
    protected FastPayMerchantDO findFastPayMerchantByMerchantId(String merchantId) {
        if (StringUtils.isBlank(merchantId)) {
            merchantId = TEST_USER_ID;
        }
        FastPayMerchantDOExample example = new FastPayMerchantDOExample();
        example.createCriteria().andMerchantIdEqualTo(merchantId);
        if (fastPayMerchantDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        FastPayMerchantDO fastPayMerchantDO = fastPayMerchantDAO.selectByExample(example).get(0);

        return fastPayMerchantDO;
    }

    /**
     * 根据merchantId查询fast_pay_channel表数据
     * @param merchantId
     */
    protected FastPayChannelDO findFastPayChannelByMerchantId(String merchantId) {
        if (StringUtils.isBlank(merchantId)) {
            merchantId = TEST_USER_ID;
        }
        FastPayChannelDOExample example = new FastPayChannelDOExample();
        example.createCriteria().andMerchantIdEqualTo(merchantId);
        if (fastPayChannelDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        FastPayChannelDO fastPayChannelDO = fastPayChannelDAO.selectByExample(example).get(0);

        return fastPayChannelDO;
    }

    /**
     * 根据merchantId、source查询fast_pay_channel表数据
     * @param merchantId
     */
    protected FastPayChannelDO findFastPayChannelByMerchantIdAndSource(String merchantId,
                                                                       String source) {
        if (StringUtils.isBlank(merchantId)) {
            merchantId = TEST_USER_ID;
        }
        if (StringUtils.isBlank(source)) {
            source = "1233";
        }
        FastPayChannelDOExample example = new FastPayChannelDOExample();
        example.createCriteria().andMerchantIdEqualTo(merchantId).andSourceEqualTo(source);
        if (fastPayChannelDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        FastPayChannelDO fastPayChannelDO = fastPayChannelDAO.selectByExample(example).get(0);

        return fastPayChannelDO;
    }

    /**
     * 根据merchantId、methodCode查询fast_pay_channel表数据
     * @param merchantId
     */
    protected FastPayChannelDO findFastPayChannelByMerchantIdAndMethodCode(String merchantId,
                                                                           String methodCode) {
        if (StringUtils.isBlank(merchantId)) {
            merchantId = TEST_USER_ID;
        }
        if (StringUtils.isBlank(methodCode)) {
            methodCode = "1233";
        }
        FastPayChannelDOExample example = new FastPayChannelDOExample();
        example.createCriteria().andMerchantIdEqualTo(merchantId).andMethodCodeEqualTo(methodCode);
        if (fastPayChannelDAO.selectByExample(example).isEmpty()) {
            return null;
        }
        FastPayChannelDO fastPayChannelDO = fastPayChannelDAO.selectByExample(example).get(0);

        return fastPayChannelDO;
    }

    /**
     * 插入fast_pay_merchant表数据
     * @param merchantId
     * @param merchantName
     * @param productCode
     * @param productName
     * @param operatorName
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public int insertFastPayMerchant(String merchantId, String merchantName, String productCode,
                                     String productName, String operatorName, Date rawAddTime,
                                     Date rawUpdateTime, String sources, String methodCodes) {
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }
        FastPayMerchantDO DO = new FastPayMerchantDO();
        DO.setMerchantId(merchantId);
        DO.setMerchantName(merchantName);
        DO.setProductCode(productCode);
        DO.setProductName(productName);
        DO.setOperatorName(operatorName);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setSources(sources);
        DO.setMethodCodes(methodCodes);
        fastPayMerchantDAO.insert(DO);
        return DO.getId();
    }

    /**
     * 插入product_config表数据
     */
    public Long insertProDuctConfig(Date rawAddTime, Date rawUpdateTime, String argKey,
                                    String argValue, String status) {
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }
        ProductConfigArgsDO DO = new ProductConfigArgsDO();
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setArgKey(argKey);
        DO.setArgValue(argValue);
        DO.setStatus(status);
        productConfigArgsDAO.insert(DO);
        return DO.getId();
    }

    /**
     * 根据argKey清除product_config表数据
     */
    public void cleanProDuctConfigByArgKey(String argKey) {
        ProductConfigArgsDOExample example = new ProductConfigArgsDOExample();
        example.createCriteria().andArgKeyEqualTo(argKey);
        productConfigArgsDAO.deleteByExample(example);
    }

    /**
     * @更新查找trade_refund_info表数据
     */
    /**
     * 根据bizNo清除表trade_refund_info数据
     * @param bizNo
     */
    protected void cleanTradeRefundInfoByBizNo(String bizNo) {
        TradeRefundInfoDOExample exam = new TradeRefundInfoDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        tradeRefundInfoDAO.deleteByExample(exam);
    }

    /**
     * 根据refundBizNo清除表trade_refund_info数据
     * @param refundBizNo
     */
    protected void cleanTradeRefundInfoByRefundBizNo(String refundBizNo) {
        TradeRefundInfoDOExample exam = new TradeRefundInfoDOExample();
        exam.createCriteria().andRefundBizNoEqualTo(refundBizNo);
        tradeRefundInfoDAO.deleteByExample(exam);
    }

    /**
     * 清除trade_refund_info表所有数据
     */
    protected void cleanTradeRefundInfoByAll() {
        TradeRefundInfoDOExample exam = new TradeRefundInfoDOExample();
        exam.createCriteria();
        tradeRefundInfoDAO.deleteByExample(exam);
    }

    /**
     * 根据bizNo查找trade_refund_info表数据
     * @param bizNo
     * @return
     */
    protected List<TradeRefundInfoDO> queryTradeRefundInfoByBizNo(String bizNo) {
        TradeRefundInfoDOExample exam = new TradeRefundInfoDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        return tradeRefundInfoDAO.selectByExample(exam);
    }

    /**
     * 根据partnerId和merchOrderNo查找trade_refund_info表数据
     * @param partnerId
     * @param merchOrderNo
     * @return
     */
    protected List<TradeRefundInfoDO> queryTradeRefundInfoByPartnerIdAndMerchOrderNo(	String partnerId,
                                                                                         String merchOrderNo) {
        TradeRefundInfoDOExample exam = new TradeRefundInfoDOExample();
        exam.createCriteria().andPartnerIdEqualTo(partnerId).andMerchOrderNoEqualTo(merchOrderNo);
        return tradeRefundInfoDAO.selectByExample(exam);
    }

    /**
     * 根据partnerId和merchOrderNo查询校验trade_refund_info表数据
     * @param size
     * @param partnerId
     * @param merchOrderNo
     * @param gid
     * @param bizNo
     * @param refundAmount
     * @param userEndIp
     * @param macAddress
     * @param userTerminalType
     * @param refundStatus
     * @param refundReason
     * @param memo
     * @param rawAddTime
     * @param rawUpdateTime
     */
    protected void assertTradeRefundInfo(int size, String partnerId, String merchOrderNo,
                                         String gid, String bizNo, Money refundAmount,
                                         String userEndIp, String macAddress,
                                         String userTerminalType, String refundStatus,
                                         String refundReason, String memo, Date rawAddTime,
                                         Date rawUpdateTime, String containRefoundShare) {
        List<TradeRefundInfoDO> DO = queryTradeRefundInfoByPartnerIdAndMerchOrderNo(partnerId,
                merchOrderNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getRefundBizNo());
            assertEquals(bizNo, DO.get(0).getBizNo());
            assertEquals(gid, DO.get(0).getGid());
            assertEquals(refundAmount, DO.get(0).getRefundAmount());
            assertEquals(userEndIp, DO.get(0).getUserEndIp());
            assertEquals(macAddress, DO.get(0).getMacAddress());
            assertEquals(userTerminalType, DO.get(0).getUserTerminalType());
            assertEquals(refundStatus, DO.get(0).getRefundStatus());
            assertEquals(refundReason, DO.get(0).getRefundReason());
            assertEquals(memo, DO.get(0).getMemo());
            assertEquals(merchOrderNo, DO.get(0).getMerchOrderNo());

            if (null == containRefoundShare) {
                assertEquals("false", DO.get(0).getContainRefundShare());
            }else {
                assertEquals(containRefoundShare, DO.get(0).getContainRefundShare());
            }
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /*
     * 清除identity_validate表的所有数据
     */
    public void cleanIdentityValidateByAll() {
        IdentityValidateDOExample example = new IdentityValidateDOExample();
        example.createCriteria();
        identityValidateDAO.deleteByExample(example);
    }

    /*
     * 根据certNo查询identity_validate表的所有数据
     * @param certNo
     * @return
     */
    public List<IdentityValidateDO> findIdentityValidateByProductCode(String productCode) {
        IdentityValidateDOExample example = new IdentityValidateDOExample();
        example.createCriteria().andProductCodeEqualTo(productCode);
        List<IdentityValidateDO> identityValidateDO = identityValidateDAO.selectByExample(example);
        return identityValidateDO;
    }

    /**
     * 清除merge_pay
     */
    protected void cleanMergePayAll() {
        MergePayDOExample example = new MergePayDOExample();
        example.createCriteria();
        mergePayDAO.deleteByExample(example);
    }

    /**
     * 根据depositNo查询trade_pay_info
     * @param depositNo
     * @return
     */
    public List<TradePayInfoDO> queryTradePayInfoByDepositNo(String depositNo) {
        TradePayInfoDOExample example = new TradePayInfoDOExample();
        example.createCriteria().andDepositNoEqualTo(depositNo);
        return tradePayInfoDAO.selectByExample(example);
    }

    /**
     * 清除batch_behalf表的所有数据
     */
    public void cleanBatchBehalfAll() {
        BatchBehalfDOExample example = new BatchBehalfDOExample();
        example.createCriteria();
        batchBehalfDAO.deleteByExample(example);
    }

    /**
     * 插入batch_behalf表数据
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     * @param gid
     * @param inlet
     * @param memo
     * @param merchantAccNo
     * @param merchantCardNo
     * @param merchantUserId
     * @param productCode
     * @param productStatus
     * @param allFileName
     * @param allFilePath
     * @param behalfAmt
     * @param behalfCount
     * @param counterFee
     * @param failReason
     * @param failureAmt
     * @param failureCount
     * @param freezeNo
     * @param itemCounterFee
     * @param name
     * @param successAmt
     * @param successCount
     * @param fileFailCode
     * @param failFileName
     * @param failFilePath
     * @param dubboGroup
     * @param dubboVersion
     * @param userendip
     * @param merchOrderNo
     * @param behalfType
     * @param payerUserId
     * @param behalfCountPublic
     * @param itemCounterFeePublic
     * @param
     */
    public void insertBatchBehalf(String bizNo, Date rawAddTime,
                                  Date rawUpdateTime, String gid, String inlet, String memo,
                                  String merchantAccNo, String merchantCardNo, String merchantUserId,
                                  String productCode, String productStatus, String allFileName,
                                  String allFilePath, Money behalfAmt, int behalfCount,
                                  Money counterFee, String failReason, Money failureAmt,
                                  int failureCount, String freezeNo, Money itemCounterFee,
                                  String name, Money successAmt, int successCount,
                                  String fileFailCode, String failFileName, String failFilePath,
                                  String dubboGroup, String dubboVersion, String userendip,
                                  String merchOrderNo, String behalfType, String payerUserId,
                                  int behalfCountPublic, Money itemCounterFeePublic) {
        BatchBehalfDO DO = new BatchBehalfDO();
        DO.setBizNo(bizNo);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        DO.setGid(gid);
        DO.setInlet(inlet);
        DO.setMemo(memo);
        DO.setMerchantAccNo(merchantAccNo);
        DO.setMerchantCardNo(merchantCardNo);
        DO.setMerchantUserId(merchantUserId);
        DO.setProductCode(productCode);
        DO.setProductStatus(productStatus);
        DO.setAllFileName(allFileName);
        DO.setAllFilePath(allFilePath);
        DO.setBehalfAmt(behalfAmt);
        DO.setBehalfCount(behalfCount);
        DO.setCounterFee(counterFee);
        DO.setFailReason(failReason);
        DO.setFailureAmt(failureAmt);
        DO.setFailureCount(failureCount);
        DO.setFreezeNo(freezeNo);
        DO.setItemCounterFee(itemCounterFee);
        DO.setName(name);
        DO.setSuccessAmt(successAmt);
        DO.setSuccessCount(successCount);
        DO.setFileFailCode(fileFailCode);
        DO.setFailFileName(failFileName);
        DO.setFailFilePath(failFilePath);
        DO.setDubboGroup(dubboGroup);
        DO.setDubboVersion(dubboVersion);
        DO.setUserendip(userendip);
        DO.setMerchOrderNo(merchOrderNo);
        DO.setMerchantOrderNo(merchOrderNo);
        DO.setBehalfType(behalfType);
        DO.setPayerUserId(payerUserId);
        DO.setBehalfCountPublic(behalfCountPublic);
        DO.setItemCounterFeePublic(itemCounterFeePublic);

        batchBehalfDAO.insert(DO);

    }

    /**
     * 根据bizNo更新batch_behalf表的product_status
     * @param bizNo
     */
    public void updateBatchBehalfByBizNo(String bizNo, String productStatus, Money behalfAmt,
                                         Money counterFee) {
        BatchBehalfDOExample example = new BatchBehalfDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        BatchBehalfDO batchBehalfDO = batchBehalfDAO.selectByExample(example).get(0);
        batchBehalfDO.setProductStatus(productStatus);
        batchBehalfDO.setBehalfAmt(behalfAmt);
        batchBehalfDO.setCounterFee(counterFee);
        batchBehalfDAO.updateByExample(batchBehalfDO, example);
    }

    /**
     * 根据bizNo查询batch_behalf表的数据
     * @param bizNo
     * @return
     */
    public BatchBehalfDO findBatchBehalfByBizNo(String bizNo) {
        BatchBehalfDOExample example = new BatchBehalfDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        BatchBehalfDO batchBehalfDO = batchBehalfDAO.selectByExample(example).get(0);
        return batchBehalfDO;
    }

    /**
     * 清除batch_behalf_detail表的所有数据
     */
    public void cleanBatchBehalfDetailAll() {
        BatchBehalfDetailDOExample example = new BatchBehalfDetailDOExample();
        example.createCriteria();
        batchBehalfDetailDAO.deleteByExample(example);
    }

    /**
     * 根据batchBizNo查询batch_behalf_detail表的数据
     * @param batchBizNo
     * @return
     */
    public List<BatchBehalfDetailDO> findBatchBehalfDetailByBatchBizNo(String batchBizNo) {
        BatchBehalfDetailDOExample example = new BatchBehalfDetailDOExample();
        example.createCriteria().andBatchBizNoEqualTo(batchBizNo);
        List<BatchBehalfDetailDO> batchBehalfDetailDO = batchBehalfDetailDAO
                .selectByExample(example);
        return batchBehalfDetailDO;
    }

    public List<BatchBehalfDetailDO> findBatchBehalfDetailByBatchBizNoAndBankAccountNo(	String batchBizNo,
                                                                                           String bankAccountNo) {
        BatchBehalfDetailDOExample example = new BatchBehalfDetailDOExample();
        example.createCriteria().andBatchBizNoEqualTo(batchBizNo)
                .andBankAccountNoEqualTo(getMask(bankAccountNo));
        //		example.createCriteria().andBatchBizNoEqualTo(batchBizNo)
        //		.andBankAccountNoEqualTo(bankAccountNo);
        List<BatchBehalfDetailDO> batchBehalfDetailDO = batchBehalfDetailDAO
                .selectByExample(example);
        return batchBehalfDetailDO;
    }

    public List<BatchBehalfDetailDO> findBatchBehalfDetailByBatchBizNoAndSellerAccount(	String batchBizNo,
                                                                                           String sellerAccount) {
        BatchBehalfDetailDOExample example = new BatchBehalfDetailDOExample();
        example.createCriteria().andBatchBizNoEqualTo(batchBizNo)
                .andSellerAccountEqualTo(sellerAccount);
        List<BatchBehalfDetailDO> batchBehalfDetailDO = batchBehalfDetailDAO
                .selectByExample(example);
        return batchBehalfDetailDO;
    }

    /**
     * 插入command_Pay_param
     * @param merchantId
     * @param shareLimit
     * @param refundCharge
     * @param toBank
     * @param operatorName
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public long insertCommandPayParam(String merchantId, String shareLimit, String refundCharge,
                                      String toBank, String operatorName, Date rawAddTime,
                                      Date rawUpdateTime, String quota, String freezeTime,
                                      String merchantMark, String needJumpBank,
                                      String toCardFreezeTime, String refundAudit) {
        if (null == shareLimit) {
            shareLimit = "0.3";
        }
        if (null == refundCharge) {
            refundCharge = "OFF";
        }
        if (null == toBank) {
            toBank = "OFF";
        }
        if (null == quota) {
            quota = "200";
        }
        if (null == freezeTime) {
            freezeTime = "0";
        }
        if (null == needJumpBank) {
            needJumpBank = "OFF";
        }
        if (null == toCardFreezeTime) {
            toCardFreezeTime = "24";
        }
        CommandPayParamDO commandPayParamDO = new CommandPayParamDO();
        commandPayParamDO.setMerchantId(merchantId);
        commandPayParamDO.setShareLimit(shareLimit);
        commandPayParamDO.setRefundCharge(refundCharge);
        commandPayParamDO.setToBank(toBank);
        commandPayParamDO.setOperatorName(operatorName);
        commandPayParamDO.setRawAddTime(rawAddTime);
        commandPayParamDO.setRawUpdateTime(rawUpdateTime);
        commandPayParamDO.setQuota(quota);
        commandPayParamDO.setFreezeTime(freezeTime);
        commandPayParamDO.setMerchantMark(merchantMark);
        commandPayParamDO.setNeedJumpBank(needJumpBank);
        commandPayParamDO.setToCardFreezeTime(toCardFreezeTime);
        commandPayParamDO.setRefundAudit(refundAudit);
        commandPayParamDAO.insert(commandPayParamDO);
        return commandPayParamDO.getId();
    }

    /**
     * 根据merchantId清除commandPayParam
     * @param merchantId
     */
    public void cleanCommandPayParamBymerchantId(String merchantId) {
        CommandPayParamDOExample example = new CommandPayParamDOExample();
        example.createCriteria().andMerchantIdEqualTo(merchantId);
        commandPayParamDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询fast_pay_share_profit
     * @param bizNo
     * @return
     */
    public List<FastPayShareProfitDO> queryFastPayShareProfitDOs(String bizNo, String payeeUserId) {
        FastPayShareProfitDOExample example = new FastPayShareProfitDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo).andPayeeUserIdEqualTo(payeeUserId);
        List<FastPayShareProfitDO> fastPayShareProfitDO = fastPayShareProfitDAO
                .selectByExample(example);
        return fastPayShareProfitDO;
    }

    /**
     * 根据bizNo查询TradeRefundShareProfitDO
     * @param bizNo
     * @param payerUserId
     * @return
     */
    public List<TradeRefundShareProfitDO> queryTradeRefundShareProfitDOs(String bizNo,
                                                                         String payerUserId) {
        TradeRefundShareProfitDOExample example = new TradeRefundShareProfitDOExample();
        example.createCriteria().andRefundBizNoEqualTo(bizNo).andPayerUserIdEqualTo(payerUserId);
        List<TradeRefundShareProfitDO> tradeRefundShareProfitDO = tradeRefundShareProfitDAO
                .selectByExample(example);
        return tradeRefundShareProfitDO;
    }

    /**
     * 清除fast_pay_share_profit
     */
    public void cleanFastPayShareProfitAll() {
        FastPayShareProfitDOExample example = new FastPayShareProfitDOExample();
        example.createCriteria();
        fastPayShareProfitDAO.deleteByExample(example);
    }

    /**
     * 查询校验fast_pay_share_profit
     * @param size
     * @param bizNo
     * @param payerUserId
     * @param payerCardNo
     * @param payerAccNo
     * @param payeeUserId
     * @param payeeCardNo
     * @param payeeAccNo
     * @param shareAmount
     * @param refundAmount
     * @param currency
     * @param shareStatus
     * @param memo
     */
    public void assertFastPayShareProfit(int size, String bizNo, String payerUserId,
                                         String payerCardNo, String payerAccNo,
                                         String payeeUserId, String payeeCardNo,
                                         String payeeAccNo, Money shareAmount,
                                         Money refundAmount, String currency,
                                         String shareStatus, String memo) {
        List<FastPayShareProfitDO> DO = queryFastPayShareProfitDOs(bizNo, payeeUserId);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertEquals(payerUserId, DO.get(0).getPayerUserId());
            assertEquals(payerCardNo, DO.get(0).getPayerCardNo());
            assertEquals(payerAccNo, DO.get(0).getPayerAccNo());
            assertEquals(payeeUserId, DO.get(0).getPayeeUserId());
            assertEquals(payeeCardNo, DO.get(0).getPayeeCardNo());
            assertEquals(payeeAccNo, DO.get(0).getPayeeAccNo());
            assertEquals(shareAmount, DO.get(0).getShareAmount());
            assertEquals(refundAmount, DO.get(0).getRefundAmount());
            assertEquals(currency, DO.get(0).getCurrency());
            assertEquals(shareStatus, DO.get(0).getShareStatus());
            assertEquals(memo, DO.get(0).getMemo());
        }
    }

    /**
     * 查询校验fast_pay_share_profit
     * @param size
     * @param bizNo
     * @param payerUserId
     * @param payerCardNo
     * @param payerAccNo
     * @param payeeUserId
     * @param payeeCardNo
     * @param payeeAccNo
     * @param shareAmount
     * @param refundAmount
     * @param currency
     * @param shareStatus
     * @param memo
     */
    public void assertTradeRefundShareProfit(int size, String bizNo, String payerUserId,
                                             String payerCardNo, String payerAccNo,
                                             String payeeUserId, String payeeCardNo,
                                             String payeeAccNo, Money refundShareAmount,
                                             String currency, String memo) {
        List<TradeRefundShareProfitDO> DO = queryTradeRefundShareProfitDOs(bizNo, payerUserId);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getTransferNo());
            assertNotNull(DO.get(0).getShareRefundBizNo());
            assertEquals(payerUserId, DO.get(0).getPayerUserId());
            assertEquals(payerCardNo, DO.get(0).getPayerCardNo());
            assertEquals(payerAccNo, DO.get(0).getPayerAccNo());
            assertEquals(payeeUserId, DO.get(0).getPayeeUserId());
            assertEquals(payeeCardNo, DO.get(0).getPayeeCardNo());
            assertEquals(payeeAccNo, DO.get(0).getPayeeAccNo());
            assertEquals(refundShareAmount, DO.get(0).getShareRefundAmount());
            assertEquals(currency, DO.get(0).getCurrency());
            assertEquals(memo, DO.get(0).getMemo());
        }
    }

    /**
     * 插入Trade_Refund_info表数据
     * @param refundBizNo
     * @param inlet
     * @param gid
     * @param partnerId
     * @param merchOrderNo
     * @param bizNo
     * @param refundAmount
     * @param userEndIp
     * @param macAddress
     * @param userTerminalType
     * @param refundStatus
     * @param refundMode
     * @param refundReason
     * @param memo
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void insertTradeRefundInfo(String refundBizNo, String inlet, String gid,
                                      String partnerId, String merchOrderNo, String bizNo,
                                      Money refundAmount, String userEndIp, String macAddress,
                                      String userTerminalType, String refundStatus,
                                      String refundMode, String refundReason, String memo,
                                      Date rawAddTime, Date rawUpdateTime) {

        if (refundBizNo == null) {
            refundBizNo = TEST_BIZ_NO;
        }
        if (inlet == null) {
            inlet = TEST_INLET;
        }
        if (gid == null) {
            gid = TEST_GID;
        }
        if (partnerId == null) {
            partnerId = TEST_BIZ_NO;
        }
        if (merchOrderNo == null) {
            merchOrderNo = TEST_MERCH_ORDER_NO;
        }
        if (bizNo == null) {
            bizNo = TEST_BIZ_NO;
        }
        if (refundAmount == null) {
            refundAmount = new Money();
        }
        if (refundStatus == null) {
            refundStatus = TEST_REFUND_STATUS;
        }
        if (refundMode == null) {
            refundMode = TEST_MODEL_ID;
        }
        if (refundReason == null) {
            refundReason = TEST_REFUND_REASON;
        }
        if (memo == null) {
            memo = TEST_MEMO;
        }
        if (rawAddTime == null) {
            rawAddTime = getSysDate();
        }
        if (rawUpdateTime == null) {
            rawUpdateTime = getSysDate();
        }
        TradeRefundInfoDO tradeRefundInfoDO = new TradeRefundInfoDO();
        tradeRefundInfoDO.setRefundBizNo(refundBizNo);
        tradeRefundInfoDO.setInlet(inlet);
        tradeRefundInfoDO.setGid(gid);
        tradeRefundInfoDO.setPartnerId(partnerId);
        tradeRefundInfoDO.setMerchOrderNo(merchOrderNo);
        tradeRefundInfoDO.setBizNo(bizNo);
        tradeRefundInfoDO.setRefundAmount(refundAmount);
        tradeRefundInfoDO.setUserEndIp(userEndIp);
        tradeRefundInfoDO.setMacAddress(macAddress);
        tradeRefundInfoDO.setUserTerminalType(userTerminalType);
        tradeRefundInfoDO.setRefundStatus(refundStatus);
        tradeRefundInfoDO.setRefundMode(refundMode);
        tradeRefundInfoDO.setRefundReason(refundReason);
        tradeRefundInfoDO.setMemo(memo);
        tradeRefundInfoDO.setRawAddTime(rawAddTime);
        tradeRefundInfoDO.setRawUpdateTime(rawUpdateTime);
        tradeRefundInfoDAO.insert(tradeRefundInfoDO);
    }

    /**
     * 清除Foreign_Pay表数据
     * @param merchantCardNo
     * @param merchantOrderNo
     */
    public void cleanForeignPayByMerchantCardNoAndMerchantOrderNo(String merchantCardNo,
                                                                  String merchantOrderNo) {
        ForeignPayDOExample example = new ForeignPayDOExample();
        example.createCriteria().andMerchantCardNoEqualTo(merchantCardNo)
                .andMerchantOrderNoEqualTo(merchantOrderNo);
        foreignPayDAO.deleteByExample(example);
    }

    /**
     * 清除Foreign_Pay所有数据
     */
    public void cleanForeignPayAll() {
        ForeignPayDOExample example = new ForeignPayDOExample();
        example.createCriteria();
        foreignPayDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询Foreign_Pay表数据
     * @param bizNo
     * @return
     */
    public ForeignPayDO queryForeignPayDAOByBizNo(String bizNo) {
        ForeignPayDOExample example = new ForeignPayDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        ForeignPayDO foreignPayDO = foreignPayDAO.selectByExample(example).get(0);
        return foreignPayDO;
    }

    /**
     * 插入表recon_order_file
     * @param partnerId
     * @param bizNo
     * @param gid
     * @param orderNo
     * @param reconDate
     * @param reconFileDir
     * @param reconFileName
     * @param reconFileStatus
     * @param totalCount
     * @param readStatus
     * @param userId
     */
    public long insertReconOrderFile(String partnerId, String bizNo, String gid, String orderNo,
                                     String reconDate, String reconFileDir,
                                     String reconFileName, String reconFileStatus,
                                     long totalCount, String readStatus, String userId,
                                     Date rawAddTime, Date rawUpdateTime) {
        ReconOrderFileDO reconOrderFileDO = new ReconOrderFileDO();
        reconOrderFileDO.setPartnerId(partnerId);
        reconOrderFileDO.setBizNo(bizNo);
        reconOrderFileDO.setGid(gid);
        reconOrderFileDO.setOrderNo(orderNo);
        reconOrderFileDO.setReconDate(reconDate);
        reconOrderFileDO.setReconFileDir(reconFileDir);
        reconOrderFileDO.setReconFileName(reconFileName);
        reconOrderFileDO.setReconFileStatus(reconFileStatus);
        reconOrderFileDO.setTotalCount(totalCount);
        reconOrderFileDO.setReadStatus(readStatus);
        reconOrderFileDO.setUserId(userId);
        reconOrderFileDO.setRawAddTime(rawAddTime);
        reconOrderFileDO.setRawUpdateTime(rawUpdateTime);
        reconOrderFileDAO.insert(reconOrderFileDO);
        return reconOrderFileDO.getId();
    }

    /**
     * 根据bizNo清除recon_order_file
     * @param bizNo
     */
    public void cleanReconOrderFileBybizNo(String bizNo) {
        ReconOrderFileDOExample example = new ReconOrderFileDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        reconOrderFileDAO.deleteByExample(example);
    }

    /**
     * 根据userId清除recon_order_file
     * @param userId
     */
    public void cleanReconOrderFileByUserId(String userId) {
        ReconOrderFileDOExample example = new ReconOrderFileDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        reconOrderFileDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询recon_order_file
     * @param bizNo
     * @return
     */
    public ReconOrderFileDO findReconOrderFileByBizNo(String bizNo) {
        ReconOrderFileDOExample example = new ReconOrderFileDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        ReconOrderFileDO reconOrderFileDO = reconOrderFileDAO.selectByExample(example).get(0);
        return reconOrderFileDO;
    }

    /**
     * 根据UserId查询recon_order_file
     * @param userId
     * @return
     */
    public List<ReconOrderFileDO> findReconOrderFileByUserId(String userId) {
        ReconOrderFileDOExample example = new ReconOrderFileDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<ReconOrderFileDO> reconOrderFileDO = reconOrderFileDAO.selectByExample(example);
        return reconOrderFileDO;
    }

    /**
     * 根据userId清除recon_order_history_apply
     * @param userId
     */
    public void cleanReconOrderHistoryApplyByUserId(String userId) {
        ReconOrderHistoryApplyDOExample example = new ReconOrderHistoryApplyDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        reconOrderHistoryApplyDAO.deleteByExample(example);
    }

    /**
     * 根据userId查询recon_order_history_apply
     * @param userId
     * @return
     */
    public List<ReconOrderHistoryApplyDO> findReconOrderHistoryApplyDOsByUserId(String userId) {
        ReconOrderHistoryApplyDOExample example = new ReconOrderHistoryApplyDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<ReconOrderHistoryApplyDO> reconOrderHistoryApplyDO = reconOrderHistoryApplyDAO
                .selectByExample(example);
        return reconOrderHistoryApplyDO;
    }


    /**
     * 清除auto_deduct_config
     * @param userId
     */
    protected void cleanAutoDeductConfigByUserId(String userId) {
        AutoDeductConfigDOExample example = new AutoDeductConfigDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        autoDeductConfigDAO.deleteByExample(example);
    }

    /**
     * 插入auto_deduct_config
     * @param userId
     * @param bankEleAccNo
     * @param bankEleAccName
     * @param bankAccountNo
     * @param certNo
     * @param bankCode
     * @param bankAccountName
     * @param bankCardType
     * @param inlet
     * @param secIndex
     * @param rawAddTime
     * @param rawUpdateTime
     */
    protected void insertAutoDeductConfig(String userId, String bankEleAccNo,
                                          String bankEleAccName, String bankAccountNo,
                                          String certNo, String bankCode, String bankAccountName,
                                          String bankCardType, String inlet, Date rawAddTime,
                                          Date rawUpdateTime) {
        AutoDeductConfigDO autoDeductConfigDO = new AutoDeductConfigDO();
        //加密字段装载
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("bankAccountNo", bankAccountNo);
        dataMap.put("certNo", certNo);
        dataMap.put("bankAccountName", bankAccountName);

        //		加密服务
        SecMapInfo secMapInfo = new SecMapInfo();
        try {
            secMapInfo = securityDataClient.dataBatchStore(dataMap);
        } catch (Exception e) {
        }
        autoDeductConfigDO.setBankAccountName(getMask(bankAccountName));
        autoDeductConfigDO.setBankAccountNo(getMask(bankAccountNo));
        autoDeductConfigDO.setBankCardType(bankCardType);
        autoDeductConfigDO.setBankCode(bankCode);
        autoDeductConfigDO.setBankEleAccName(bankEleAccName);
        autoDeductConfigDO.setBankEleAccNo(bankEleAccNo);
        autoDeductConfigDO.setCertNo(getMask(certNo));
        autoDeductConfigDO.setInlet(inlet);
        autoDeductConfigDO.setRawAddTime(rawAddTime);
        autoDeductConfigDO.setRawUpdateTime(rawUpdateTime);
        autoDeductConfigDO.setSecIndex(secMapInfo.getSecIndex());
        autoDeductConfigDO.setUserId(userId);
        autoDeductConfigDAO.insert(autoDeductConfigDO);
    }

    /**
     * 删除auto_deduct_trigger
     */
    protected void cleanAutoDeductTriggerAll() {
        AutoDeductTriggerDOExample example = new AutoDeductTriggerDOExample();
        example.createCriteria();
        autoDeductTriggerDAO.deleteByExample(example);
    }

    /**
     * 根据userId查询auto_deduct_trigger
     * @param userId
     * @return
     */
    public List<AutoDeductTriggerDO> findAutoDeductTriggerDOsByUserId(String userId) {
        AutoDeductTriggerDOExample example = new AutoDeductTriggerDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<AutoDeductTriggerDO> AutoDeductTriggerDO = autoDeductTriggerDAO
                .selectByExample(example);
        return AutoDeductTriggerDO;
    }

    /**
     * 插入fast_pay_auto_withdraw_config
     * @param merchantCardNo
     * @param userId
     * @param opened
     * @param signNo
     * @param delays
     * @param rawAddTime
     * @param rawUpdateTime
     * @return
     */
    public long insertFastPayAutoWithdrawConfig(String merchantCardNo, String userId, Byte opened,
                                                String signNo, int delays, Date rawAddTime,
                                                Date rawUpdateTime) {
        FastPayAutoWithdrawConfigDO fastPayAutoWithdrawConfigDO = new FastPayAutoWithdrawConfigDO();
        fastPayAutoWithdrawConfigDO.setMerchantCardNo(merchantCardNo);
        fastPayAutoWithdrawConfigDO.setUserId(userId);
        fastPayAutoWithdrawConfigDO.setOpened(opened);
        fastPayAutoWithdrawConfigDO.setSignNo(signNo);
        fastPayAutoWithdrawConfigDO.setDelays(delays);
        fastPayAutoWithdrawConfigDO.setRawAddTime(rawAddTime);
        fastPayAutoWithdrawConfigDO.setRawUpdateTime(rawUpdateTime);
        fastPayAutoWithdrawConfigDAO.insert(fastPayAutoWithdrawConfigDO);
        return fastPayAutoWithdrawConfigDO.getId();
    }

    /**
     * 清除fast_pay_auto_withdraw_config
     */
    public void cleanFastPayAutoWithdrawConfig() {
        FastPayAutoWithdrawConfigDOExample example = new FastPayAutoWithdrawConfigDOExample();
        example.createCriteria();
        fastPayAutoWithdrawConfigDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询product_model_withdraw表数据
     * @param bizNo
     * @return
     */
    public List<ProductModelWithdrawDO> findProductModelWithdrawByBizNo(String bizNo) {
        ProductModelWithdrawDOExample exam = new ProductModelWithdrawDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        return productModelWithdrawDAO.selectByExample(exam);
    }

    /**
     * 根据bizNo查询校验product_model_withdraw表数据
     * @param size
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertProductModelWithdrawByBizNo(int size, String bizNo, Date rawAddTime,
                                                  Date rawUpdateTime) {
        List<ProductModelWithdrawDO> DO = findProductModelWithdrawByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /**
     * 根据bizNo查询product_model_withdraw表数据
     * @param bizNo
     * @return
     */
    public List<ProductModelDeductDO> findProductModelDeductByBizNo(String bizNo) {
        ProductModelDeductDOExample exam = new ProductModelDeductDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        return productModelDeductDAO.selectByExample(exam);
    }

    /**
     * 根据bizNo查询校验product_model_deduct表数据
     * @param size
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertProductModelDeductByBizNo(int size, String bizNo, Date rawAddTime,
                                                Date rawUpdateTime) {
        List<ProductModelDeductDO> DO = findProductModelDeductByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /**
     * 根据bizNo查询product_model_payment表数据
     * @param bizNo
     * @return
     */
    public List<ProductModelPaymentDO> findProductModelPaymentByBizNo(String bizNo) {
        ProductModelPaymentDOExample exam = new ProductModelPaymentDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        return productModelPaymentDAO.selectByExample(exam);
    }

    /**
     * 根据bizNo查询校验product_model_payment表数据
     * @param size
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertProductModelPaymentByBizNo(int size, String bizNo, Date rawAddTime,
                                                 Date rawUpdateTime) {
        List<ProductModelPaymentDO> DO = findProductModelPaymentByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    /**
     * 根据bizNo查询transfer_model表数据
     * @param bizNo
     * @return
     */
    public List<TransferModelDO> findTransferModelByBizNo(String bizNo) {
        TransferModelDOExample exam = new TransferModelDOExample();
        exam.createCriteria().andBizNoEqualTo(bizNo);
        return transferModelDAO.selectByExample(exam);
    }

    /**
     * 根据bizNo查询校验transfer_model表数据
     * @param size
     * @param bizNo
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void assertTransferModelByBizNo(int size, String bizNo, Date rawAddTime,
                                           Date rawUpdateTime) {
        List<TransferModelDO> DO = findTransferModelByBizNo(bizNo);
        if (size <= 0) {
            assertEquals(0, DO.size());
        } else {
            assertEquals(size, DO.size());
            assertNotNull(DO.get(0).getId());
            assertNotEquals(0, DO.get(0).getId());
            if (rawAddTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawAddTime),
                        DateUtil.shortDate(DO.get(0).getRawAddTime()));
            }
            if (rawUpdateTime == null) {
                assertEquals(DateUtil.shortDate(getSysDate()),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            } else {
                assertEquals(DateUtil.shortDate(rawUpdateTime),
                        DateUtil.shortDate(DO.get(0).getRawUpdateTime()));
            }
        }
    }

    public void cleanFastPayHabitAll() {
        FastPayHabitDOExample example = new FastPayHabitDOExample();
        example.createCriteria();
        fastPayHabitDAO.deleteByExample(example);
    }

    /**
     * 插入fast_pay_habit
     * @param userId
     * @param merchantId
     * @param methodCode
     * @param bankCode
     */
    public void insertFastPayHabit(String userId, String merchantId, String methodCode,
                                   String bankCode, Date rawAddTime, Date rawUpdateTime) {
        FastPayHabitDO fastPayHabitDO = new FastPayHabitDO();
        fastPayHabitDO.setUserId(userId);
        fastPayHabitDO.setMerchantId(merchantId);
        fastPayHabitDO.setMethodCode(methodCode);
        fastPayHabitDO.setBankCode(bankCode);
        fastPayHabitDO.setRawAddTime(rawAddTime);
        fastPayHabitDO.setRawUpdateTime(rawUpdateTime);
        fastPayHabitDAO.insert(fastPayHabitDO);
    }

    /**
     * 清空third_party_accounts表数据
     */
    public void cleanThirdPartyAccountsAll() {
        ThirdPartyAccountsDOExample example = new ThirdPartyAccountsDOExample();
        example.createCriteria();
        thirdPartyAccountsDAO.deleteByExample(example);
    }

    /**
     * 清空third_party_accounts_config表数据
     */
    public void cleanThirdPartyAccountsConfigAll() {
        ThirdPartyAccountsConfigDOExample example = new ThirdPartyAccountsConfigDOExample();
        example.createCriteria();
        thirdPartyAccountsConfigDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询third_party_accounts表数据
     * @param bizNo
     * @return
     */
    public ThirdPartyAccountsDO findThirdPartyAccountsByBizNo(String bizNo) {
        ThirdPartyAccountsDOExample example = new ThirdPartyAccountsDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        return thirdPartyAccountsDAO.selectByExample(example).get(0);
    }

    /**
     * 根据bizNo查询third_party_accounts_config表数据
     * @param bizNo
     * @return
     */
    public ThirdPartyAccountsConfigDO findThirdPartyAccountsConfigByBizNo(String bizNo) {
        ThirdPartyAccountsConfigDOExample example = new ThirdPartyAccountsConfigDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        return thirdPartyAccountsConfigDAO.selectByExample(example).get(0);
    }

    /**
     * 插入third_party_accounts表数据
     *
     * @param bizNo
     * @param gid
     * @param merchantUserId
     * @param status
     * @param accountType
     * @param shortName
     * @param province
     * @param city
     * @param county
     * @param merchantAddress
     * @param category
     * @param memo
     * @param merchantCode
     */
    public void insertThirdPartyAccounts(String bizNo, String gid, String merchantUserId,
                                         String status, String accountType, String shortName,
                                         String province, String city, String county,
                                         String merchantAddress, String category, String memo,
                                         String merchantCode, Date rawAddTime,
                                         Date rawUpdateTime, String channelType) {
        ThirdPartyAccountsDO accountDo = new ThirdPartyAccountsDO();
        accountDo.setBizNo(bizNo);
        accountDo.setGid(gid);
        accountDo.setMerchantUserId(merchantUserId);
        accountDo.setStatus(status);
        accountDo.setAccountType(accountType);
        accountDo.setShortName(shortName);
        accountDo.setProvince(province);
        accountDo.setCity(city);
        accountDo.setCounty(county);
        accountDo.setMerchantAddress(merchantAddress);
        accountDo.setCategory(category);
        accountDo.setMemo(memo);
        accountDo.setMerchantCode(merchantCode);
        accountDo.setRawAddTime(rawAddTime);
        accountDo.setRawUpdateTime(rawUpdateTime);
        accountDo.setChannelType(channelType);
        thirdPartyAccountsDAO.insert(accountDo);
    }

    /**
     * 插入third_party_accounts_config表数据
     * @param bizNo
     * @param configType
     * @param configValue
     * @param merchantUserId
     */
    public void insertThirdPartyAccountsConfig(String bizNo, String configType, String configValue,
                                               String merchantUserId, String channelType) {
        ThirdPartyAccountsConfigDO accountDo = new ThirdPartyAccountsConfigDO();
        accountDo.setBizNo(bizNo);
        accountDo.setConfigType(configType);
        accountDo.setConfigValue(configValue);
        accountDo.setMerchantUserId(merchantUserId);
        accountDo.setRawAddTime(getSysDate());
        accountDo.setRawUpdateTime(getSysDate());
        accountDo.setChannelType(channelType);
        thirdPartyAccountsConfigDAO.insert(accountDo);
    }

    /**
     * 根据bizNo修改状态
     * @param bizNo
     * @param status
     */
    public void updateThirdPartyAccountsStatusByBizNo(String bizNo, String status) {
        ThirdPartyAccountsDOExample example = new ThirdPartyAccountsDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        ThirdPartyAccountsDO DO = thirdPartyAccountsDAO.selectByExample(example).get(0);
        DO.setStatus(status);
        thirdPartyAccountsDAO.updateByExample(DO, example);

    }

    /**
     * 插入BatchIdempotent
     * @param id
     * @param gid
     * @param randomSting
     * @param rawAddTime
     * @param rawUpdateTime
     */
    public void insertBatchIdempotent(Long id, String gid, String randomSting, Date rawAddTime,
                                      Date rawUpdateTime) {
        BatchIdempotentDO DO = new BatchIdempotentDO();
        DO.setGid(gid);
        DO.setId(id);
        DO.setRandomSting(randomSting);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        batchIdempotentDAO.insert(DO);
    }

    /**
     * 清除BatchIdempotent数据
     */
    public void cleanBatchIdempotentAll() {
        // TODO Auto-generated method stub
        BatchIdempotentDOExample example = new BatchIdempotentDOExample();
        example.createCriteria();
        batchIdempotentDAO.deleteByExample(example);
    }

    /**
     * 插入Product_model_payment
     * @param rawAddTime
     * @param rawUpdateTime
     * @param bizNo
     * @param content
     */
    public void insertProductModelPayment(Date rawAddTime, Date rawUpdateTime, String bizNo,
                                          String content) {
        ProductModelPaymentDO productModelDO = new ProductModelPaymentDO();
        productModelDO.setRawAddTime(rawAddTime);
        productModelDO.setRawUpdateTime(rawUpdateTime);
        productModelDO.setBizNo(bizNo);
        productModelDO.setContent(content);
        productModelPaymentDAO.insert(productModelDO);
    }

    /**
     * 根据bizNo清除Product_model_payment
     * @param bizNo
     */
    public void cleanProductModelPaymentByBizNo(String bizNo) {
        if (StringUtils.isBlank(bizNo)) {
            bizNo = "TEST_STRING";
        }
        ProductModelPaymentDOExample example = new ProductModelPaymentDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        productModelPaymentDAO.deleteByExample(example);
    }

    /**
     * 清除所有AmazonTrade数据
     */
    public void cleanAmazonTradeAll(){
        AmazonTradeDOExample example = new AmazonTradeDOExample();
        example.createCriteria();
        amazonTradeDAO.deleteByExample(example);
    }

    /**
     * 根据bizNo查询
     * @param bizNo
     * @return
     */
    public AmazonTradeDO findAmazonTradeByBizNo(String bizNo){
        if (StringUtils.isBlank(bizNo)) {
            bizNo = "TEST_STRING";
        }
        AmazonTradeDOExample example = new AmazonTradeDOExample();
        example.createCriteria().andBizNoEqualTo(bizNo);
        return amazonTradeDAO.selectByExample(example).get(0);
    }

    /**
     *
     * @param bizNo
     * @param depositId
     * @param gid
     * @param merchantOrderNo
     * @param merchantAccNo
     * @param merchantUserId
     * @param productCode
     * @param productStatus
     * @param capitalStatus
     * @param userId
     * @param amount
     * @param currency
     * @param memo
     * @param remark
     * @param inlet
     * @param bankUpdateTime
     * @param rawAddTime
     * @param rawUpdateTime
     * @param merchantCardNo
     */
    public void insertAmazonTrade(String bizNo, String depositId, String gid,
                                  String merchantOrderNo, String merchantCardNo, String merchantAccNo, String merchantUserId,
                                  String productCode, String productStatus, String capitalStatus,
                                  String userId, Money amount, String currency, String memo,
                                  String remark, String inlet, Date bankUpdateTime, Date rawAddTime,
                                  Date rawUpdateTime){
        AmazonTradeDO DO = new AmazonTradeDO();
        DO.setBizNo(bizNo);
        DO.setDepositId(depositId);
        DO.setGid(gid);
        DO.setMerchantOrderNo(merchantOrderNo);
        DO.setMerchOrderNo(merchantOrderNo);
        DO.setMerchantCardNo(merchantCardNo);
        DO.setMerchantAccNo(merchantAccNo);
        DO.setMerchantUserId(merchantUserId);
        DO.setProductCode(productCode);
        DO.setProductStatus(productStatus);
        DO.setCapitalStatus(capitalStatus);
        DO.setUserId(userId);
        DO.setAmount(amount);
        DO.setCurrency(currency);
        DO.setMemo(memo);
        DO.setRemark(remark);
        DO.setInlet(inlet);
        DO.setBankUpdateTime(bankUpdateTime);
        DO.setRawAddTime(rawAddTime);
        DO.setRawUpdateTime(rawUpdateTime);
        amazonTradeDAO.insert(DO);
    }

    /**
     * 插入clearing_checking_info表数据
     * @param outOrderNo
     * @param systemNo
     * @param unionTradeTime
     * @param partnerTradeTime
     * @param unionPartnerId
     * @param partnerId
     * @param partnerName
     * @param payFlag
     * @param tradeAmount
     * @param channelNo
     * @param channelFee
     * @param checkingStatus
     * @param checkingTime
     * @param partnerAmount
     * @param oldOrderNo
     * @param orderInfo
     * @param tradeDate
     * @param innerBizNo
     * @param uniqueChecking
     * @param sendData
     * @param partnerPayNo
     * @param gmtCreate
     * @param gmtModified
     */
    public void insertClearingCheckingInfo(String outOrderNo, String systemNo,
                                           Date unionTradeTime, Date partnerTradeTime, String unionPartnerId,
                                           String partnerId, String partnerName, String payFlag,
                                           Money tradeAmount, String channelNo, Money channelFee,
                                           String checkingStatus, Date checkingTime, Money partnerAmount,
                                           String oldOrderNo, String orderInfo, Date tradeDate,
                                           String innerBizNo, String uniqueChecking, String sendData,
                                           String partnerPayNo, Date gmtCreate, Date gmtModified) {
        ClearingCheckingInfoDO DO = new ClearingCheckingInfoDO();
        DO.setOutOrderNo(outOrderNo);
        DO.setSystemNo(systemNo);
        DO.setUnionTradeTime(unionTradeTime);
        DO.setPartnerTradeTime(partnerTradeTime);
        DO.setUnionPartnerId(unionPartnerId);
        DO.setPartnerId(partnerId);
        DO.setPartnerName(partnerName);
        DO.setPayFlag(payFlag);
        DO.setTradeAmount(tradeAmount);
        DO.setChannelNo(channelNo);
        DO.setChannelFee(channelFee);
        DO.setCheckingStatus(checkingStatus);
        DO.setCheckingTime(checkingTime);
        DO.setPartnerAmount(partnerAmount);
        DO.setOldOrderNo(oldOrderNo);
        DO.setOrderInfo(orderInfo);
        DO.setTradeDate(tradeDate);
        DO.setInnerBizNo(innerBizNo);
        DO.setUniqueChecking(uniqueChecking);
        DO.setSendData(sendData);
        DO.setPartnerPayNo(partnerPayNo);
        DO.setGmtCreate(gmtCreate);
        DO.setGmtModified(gmtModified);
        clearingCheckingInfoDAO.insert(DO);
    }

    /**
     * 根据out_order_no查询clearing_checking_info表数据
     * @param outOrderNo
     * @return
     */
    public ClearingCheckingInfoDO findClearingCheckingInfoDOByOutOrderNo(String outOrderNo){
        ClearingCheckingInfoDOExample exam = new ClearingCheckingInfoDOExample();
        exam.createCriteria().andOutOrderNoEqualTo(outOrderNo);
        return clearingCheckingInfoDAO.selectByExample(exam).get(0);
    }

    /**
     * 查询clearingCheckingInfo表数据
     * @param outOrderNo
     * @param unionTradeTime
     * @param unionPartnerId
     * @return
     */
    public ClearingCheckingInfoDO findClearingCheckingInfoDOByOutOrderNoDateAndUnion(String outOrderNo, Date unionTradeTime, String unionPartnerId){
        ClearingCheckingInfoDOExample exam = new ClearingCheckingInfoDOExample();
        exam.createCriteria().andOutOrderNoEqualTo(outOrderNo).andUnionPartnerIdEqualTo(unionPartnerId);
        List<ClearingCheckingInfoDO> infos = clearingCheckingInfoDAO.selectByExample(exam);
        for (ClearingCheckingInfoDO clearingCheckingInfoDO : infos) {
            if (DateUtil.shortDate(clearingCheckingInfoDO.getUnionTradeTime()).equals(DateUtil.shortDate(unionTradeTime))) {
                return clearingCheckingInfoDO;
            }
        }
        return null;
    }
    /**
     * 刪除clearing_checking_info表数据
     */
    public void cleanClearingCheckingInfoAll(){
        ClearingCheckingInfoDOExample exam = new ClearingCheckingInfoDOExample();
        exam.createCriteria();
        clearingCheckingInfoDAO.deleteByExample(exam);
    }

    /**
     * 插入clearing_checking_sum表数据
     *
     * @param tradeTime
     * @param unionAmount
     * @param yjfClearingAmount
     * @param ipaynowClearingAmount
     * @param yjfGetAmount
     * @param ipaynowGetAmount
     * @param tradeamountSum
     * @param channelfeeSum
     * @param partneramountSum
     * @param clearingStatus
     * @param outOrderNo
     * @param userId
     * @param gid
     * @param timeOut
     * @param gmtCreate
     * @param gmtModified
     */
    public void insertClearingCheckingSum(Date tradeTime, Money unionAmount,
                                          Money yjfClearingAmount, Money ipaynowClearingAmount,
                                          Money yjfGetAmount, Money ipaynowGetAmount, Money tradeamountSum,
                                          Money channelfeeSum, Money partneramountSum, String clearingStatus,
                                          String outOrderNo, String userId, String gid, String timeOut,
                                          Date gmtCreate, Date gmtModified) {
        ClearingCheckingSumDO DO = new ClearingCheckingSumDO();
        DO.setTradeTime(tradeTime);
        DO.setUnionAmount(unionAmount);
        DO.setYjfClearingAmount(yjfClearingAmount);
        DO.setIpaynowClearingAmount(ipaynowClearingAmount);
        DO.setYjfGetAmount(yjfGetAmount);
        DO.setIpaynowGetAmount(ipaynowGetAmount);
        DO.setTradeamountSum(tradeamountSum);
        DO.setChannelfeeSum(channelfeeSum);
        DO.setPartneramountSum(partneramountSum);
        DO.setClearingStatus(clearingStatus);
        DO.setOutOrderNo(outOrderNo);
        DO.setUserId(userId);
        DO.setGid(gid);
        DO.setTimeOut(timeOut);
        DO.setGmtCreate(gmtCreate);
        DO.setGmtModified(gmtModified);
        clearingCheckingSumDAO.insert(DO);
    }

    /**
     * 根据交易时间查询clearing_checking_sum表数据
     * @param tradeDate
     * @return
     */
    public ClearingCheckingSumDO findClearingCheckingSumByTradeTime(Date tradeDate){
        ClearingCheckingSumDOExample exam = new ClearingCheckingSumDOExample();
        exam.createCriteria().andTradeTimeEqualTo(tradeDate);
        return clearingCheckingSumDAO.selectByExample(exam).get(0);
    }
    /**
     * 根据交易时间更改状态
     * @param tradeDate
     * @param status
     */
    public void updateClearingCheckingSumClearingStatusByTradeTime(Date tradeDate, ClearingStatusEnum status){
        ClearingCheckingSumDOExample exam = new ClearingCheckingSumDOExample();
        exam.createCriteria().andTradeTimeEqualTo(tradeDate);
        ClearingCheckingSumDO DO = clearingCheckingSumDAO.selectByExample(exam).get(0);
        DO.setClearingStatus(status.code());
        clearingCheckingSumDAO.updateByExample(DO, exam);
    }

    /**
     * 清楚clearing_checking_sum表所有数据
     */
    public void cleanClearingCheckingSumAll(){
        ClearingCheckingSumDOExample exam = new ClearingCheckingSumDOExample();
        exam.createCriteria();
        clearingCheckingSumDAO.deleteByExample(exam);
    }

    /**
     * 插入clearing_partner表数据
     *
     * @param partnerName
     * @param partnerId
     * @param unionPartnerId
     * @param bindStatus
     */
    public void insertClearingPartner(String partnerName, String partnerId,
                                      String unionPartnerId, String bindStatus) {
        ClearingPartnerDO DO = new ClearingPartnerDO();
        DO.setPartnerName(partnerName);
        DO.setPartnerId(partnerId);
        DO.setUnionPartnerId(unionPartnerId);
        DO.setBindStatus(bindStatus);
        DO.setGmtCreate(getSysDate());
        DO.setGmtModified(getSysDate());
        clearingPartnerDAO.insert(DO);
    }
    /**
     * 清除clearing_partner表所有数据
     */
    public void cleanClearingPartnerAll(){
        ClearingPartnerDOExample exam = new ClearingPartnerDOExample();
        exam.createCriteria();
        clearingPartnerDAO.deleteByExample(exam);
    }
    /**
     * 插入clearing_partner_sum表数据
     * @param tradeDate
     * @param partnerName
     * @param partnerId
     * @param clearingAmount
     * @param clearingStatus
     * @param outOrderNo
     * @param userId
     * @param gid
     * @param timeOut
     * @param sendData
     */
    public void insertClearingPartnerSum(Date tradeDate, String partnerName, String partnerId, Money clearingAmount, String clearingStatus, String outOrderNo, String userId, String gid, String timeOut, String sendData){
        ClearingPartnerSumDO DO = new ClearingPartnerSumDO();
        DO.setTradeDate(tradeDate);
        DO.setPartnerName(partnerName);
        DO.setPartnerId(partnerId);
        DO.setClearingAmount(clearingAmount);
        DO.setClearingStatus(clearingStatus);
        DO.setOutOrderNo(outOrderNo);
        DO.setUserId(userId);
        DO.setGid(gid);
        DO.setTimeOut(timeOut);
        DO.setSendData(sendData);
        DO.setGmtCreate(getSysDate());
        DO.setGmtModified(getSysDate());
        clearingPartnerSumDAO.insert(DO);
    }

    /**
     * 根据tradeDate和partnerId查询clearing_partner_sum表数据
     * @param tradeDate
     * @param partnerId
     * @return
     */
    public ClearingPartnerSumDO findClearingPartnerSumByTradeDateAndPartnerId(Date tradeDate, String partnerId){
        ClearingPartnerSumDOExample exam = new ClearingPartnerSumDOExample();
        exam.createCriteria().andTradeDateEqualTo(tradeDate).andPartnerIdEqualTo(partnerId);
        return clearingPartnerSumDAO.selectByExample(exam).get(0);
    }

    /**
     * 清除clearing_partner_sum表所有数据
     */
    public void cleanClearingPartnerSumAll(){
        ClearingPartnerSumDOExample exam = new ClearingPartnerSumDOExample();
        exam.createCriteria();
        clearingPartnerSumDAO.deleteByExample(exam);
    }
    /**
     * 根据二级索引解密出原文信息
     *
     * @param dataIndex 二级索引
     * @return batchMapInfo 原文信息
     */
    protected BatchMapInfo decryptSecurityDataByDataIndex(String dataIndex) {
        if (null == dataIndex) {
            return null;
        }
        List<String> cnameList = new ArrayList<>();
        BatchMapInfo batchMapInfo = new BatchMapInfo();
        try {
            batchMapInfo = securityDataClient.queryBySecIndexs(dataIndex, cnameList);
            loggers.info("batchMapInfo:{}", batchMapInfo);
        } catch (SecurityDataException e) {
            loggers.info("securityDataException:{}", e);
            e.printStackTrace();
        }
        return batchMapInfo;
    }







}
