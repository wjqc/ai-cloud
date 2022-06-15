package com.cloud.user.service.impl;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.NumberUtil;
import com.cloud.auth.api.domain.User;
import com.cloud.auth.api.domain.UserAccount;
import com.cloud.common.constant.UserAccountConstants;
import com.cloud.common.exception.ServiceException;
import com.cloud.common.utils.DateUtils;
import com.cloud.common.utils.SerialNumberUtils;
import com.cloud.common.utils.StringUtils;
import com.cloud.common.utils.sign.Md5Util;
import com.cloud.common.utils.uuid.IdUtils;
import com.cloud.security.utils.SecurityUtils;
import com.cloud.user.domain.UserAccountDetail;
import com.cloud.user.domain.UserBind;
import com.cloud.user.domain.UserWithdrawApply;
import com.cloud.user.dto.BillDetailDto;
import com.cloud.user.dto.BillDto;
import com.cloud.user.dto.UserInfoDto;
import com.cloud.user.mapper.*;
import com.cloud.user.param.UserParam;
import com.cloud.user.param.WalletBillDetailParam;
import com.cloud.user.param.WalletBillParam;
import com.cloud.user.param.WalletWithdrawParam;
import com.cloud.user.service.IUserCenterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 我的信息Service业务层处理
 *
 * @author ai-cloud
 */
@Service
public class UserCenterServiceImpl implements IUserCenterService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Autowired
    private UserAccountDetailMapper userAccountDetailMapper;

    @Autowired
    private UserBindMapper userBindMapper;

    @Autowired
    private UserWithdrawApplyMapper userWithdrawApplyMapper;

    /**
     * 查询用户信息
     *
     * @param
     * @return 用户对象信息
     */
    @Override
    public UserInfoDto userInfo() {
        //获取userId
        String userId = SecurityUtils.getUserId();
        return userMapper.selectByUserInfo(String.valueOf(userId));
    }

    /**
     * 保存我的信息
     *
     * @param param
     * @return
     */
    @Override
    public boolean userSave(UserParam param) {
        //获取userId
        String userId = SecurityUtils.getUserId();
        User user = userMapper.selectById(userId);
        user.setHeadImg(param.getHeadImg());
        user.setNickName(param.getNickName());
        user.setSex(param.getSex());
        user.setAge(param.getAge());
        user.setSign(param.getSign());
        user.setInvitationUrlAnd(param.getInvitationUrlAnd());
        user.setInvitationUrlIos(param.getInvitationUrlIos());
        userMapper.updateById(user);
        return true;
    }

    /**
     * 查询钱包余额
     *
     * @param
     * @return
     */
    @Override
    public String wallet() {
        //获取userId
        String userId = SecurityUtils.getUserId();
        BigDecimal balance = userAccountMapper.selectAvailableBalanceByUserIdAndType(userId, UserAccountConstants.ACCOUNT_TYPE_余额账户);
        return StringUtils.isNull(balance) ? "0.000" : balance.toString();
    }

    /**
     * 申请提现
     *
     * @param param
     * @return
     */
    @Override
    public boolean walletWithdraw(WalletWithdrawParam param) {
        if (StringUtils.isNull(param.getType())) {
            throw new ServiceException("提现方式不能为空!");
        }
        if (StringUtils.isNull(param.getAmount())) {
            throw new ServiceException("提现金额不能为空!");
        }
        if (StringUtils.isNull(param.getPassword())) {
            throw new ServiceException("支付密码不能为空!");
        }
        Assert.isTrue(NumberUtil.isGreater(param.getAmount(), new BigDecimal(0)), "提现金额不能为负数!");
        Assert.isTrue(NumberUtil.isGreaterOrEqual(param.getAmount(), new BigDecimal(50)), "提现金额不能小于50元!");
        UserBind bind = null;
        //获取userId
        String userId = SecurityUtils.getUserId();
        if (UserAccountConstants.BELONG_BANK_支付宝.equals(param.getType())) {
            //验证用户是否绑定支付宝
            bind = userBindMapper.selectByBelongBankUserId(UserAccountConstants.BELONG_BANK_支付宝, userId);
            if (StringUtils.isNull(bind)) {
                throw new ServiceException("未绑定支付宝!");
            }
        } else if (UserAccountConstants.BELONG_BANK_银行卡.equals(param.getType())) {
            //验证用户是否绑定银行卡
            bind = userBindMapper.selectByBelongBankUserId(UserAccountConstants.BELONG_BANK_银行卡, userId);
            if (StringUtils.isNull(bind)) {
                throw new ServiceException("未绑定银行卡!");
            }
        } else {
            throw new ServiceException("提现方式错误!");
        }
        //验证支付密码是否正确
        Map map = userAccountMapper.selectPasswordByUserId(userId);
        if (StringUtils.isNull(map)) {
            throw new ServiceException("支付密码未设置!");
        }
        String password = (String) map.get("password");
        String salt = (String) map.get("salt");
        String md5ofStr = Md5Util.getMD5ofStr(param.getPassword() + salt);
        if (StringUtils.equalsIgnoreCase(password, md5ofStr)) {
            throw new ServiceException("支付密码错误!");
        }
        //用户余额账户扣除提现的金额，产生支出记录
        //用户余额支出账户明细
        User user = userMapper.selectById(userId);
        UserAccount userAccount = userAccountMapper.selectByUserIdType(userId, UserAccountConstants.ACCOUNT_TYPE_余额账户);
        //检查余额
        Assert.isTrue(NumberUtil.isGreaterOrEqual(userAccount.getAvailableBalance(), param.getAmount()), "余额不足！");
        //添加提现申请
        UserWithdrawApply userWithdrawApply = new UserWithdrawApply();
        if (UserAccountConstants.BELONG_BANK_支付宝.equals(param.getType())) {
            userWithdrawApply.setAlipayAccount(bind.getAlipayAccount());
            userWithdrawApply.setAlipayName(bind.getAlipayName());
        } else if (UserAccountConstants.BELONG_BANK_银行卡.equals(param.getType())) {
            userWithdrawApply.setBankAccount(bind.getBankAccount());
            userWithdrawApply.setBankName(bind.getBankName());
            userWithdrawApply.setBankCard(bind.getBankCard());
        }
        //减少某个账户余额
        userAccountMapper.updateAvailableBalance(userId, NumberUtil.sub(userAccount.getAvailableBalance(), param.getAmount()), UserAccountConstants.ACCOUNT_TYPE_余额账户);

        UserAccountDetail userAccountDetail = new UserAccountDetail();
        userAccountDetail.setId(IdUtils.fastSimpleUUID());
        userAccountDetail.setAccountId(userAccount.getId());
        userAccountDetail.setAccountNumber(userAccount.getNumber());
        userAccountDetail.setAccountType(UserAccountConstants.ACCOUNT_TYPE_余额账户);
        userAccountDetail.setType(UserAccountConstants.DETAIL_TYPE_支出);
//        userAccountDetail.setDebitType(UserAccountConstants.ACCOUNT_TYPE_CHINESE_余额账户);
//        detail.setDebitNumber(bossAccount.getNumber());
//        detail.setDebitPhone(boss.getPhone());
//        detail.setImg(boss.getHeadImg());
        userAccountDetail.setCreditType(UserAccountConstants.ACCOUNT_TYPE_CHINESE_余额账户);
        userAccountDetail.setCreditNumber(userAccount.getNumber());
        userAccountDetail.setCreditPhone(user.getPhone());
        userAccountDetail.setOrderPrice(param.getAmount());
        userAccountDetail.setBeforeAvailableBalance(userAccount.getAvailableBalance());
        userAccountDetail.setAfterAvailableBalance(NumberUtil.sub(userAccount.getAvailableBalance(), param.getAmount()));
        userAccountDetail.setDealName("余额提现");
        userAccountDetail.setImg(user.getHeadImg());
        //生成交易流水号
        String dealSerialNumber = SerialNumberUtils.getOrderCode("");
        userAccountDetail.setDealSerialNumber(dealSerialNumber);
        userAccountDetail.setDealType(UserAccountConstants.DEAL_TYPE_提现);
        userAccountDetail.setCreateBy(userId);
        userAccountDetail.setCreateTime(DateUtils.getNowDate());
        userAccountDetailMapper.insert(userAccountDetail);
        //提现记录
        //提现流水号
        userWithdrawApply.setDealSerialNumber(dealSerialNumber);
        userWithdrawApply.setAmount(param.getAmount());
        userWithdrawApply.setBelongBank(param.getType());
        userWithdrawApply.setUserId(userId);
        userWithdrawApply.setDeviceId(bind.getDeviceId());
        userWithdrawApply.setApplyTime(DateUtils.getNowDate());
        userWithdrawApply.setCreateBy(userId);
        userWithdrawApply.setCreateTime(DateUtils.getNowDate());
        userWithdrawApplyMapper.insert(userWithdrawApply);
        return true;
    }

    /**
     * 查询钱包账单
     *
     * @param param
     * @return
     */
    @Override
    public PageInfo<BillDto> walletBill(WalletBillParam param) {
        //获取userId
        String userId = SecurityUtils.getUserId();
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        PageInfo<BillDto> page = new PageInfo<>(userAccountDetailMapper.selectByDealType(userId, param.getDealType(), param.getStart(), param.getEnd()));
        return page;
    }

    /**
     * 查询账单明细
     *
     * @param param
     * @return
     */
    @Override
    public List<BillDetailDto> walletBillDetail(WalletBillDetailParam param) {
        //获取userId
        String userId = SecurityUtils.getUserId();
        return userAccountDetailMapper.selectByDetail(userId, param.getDetailId());
    }

}
