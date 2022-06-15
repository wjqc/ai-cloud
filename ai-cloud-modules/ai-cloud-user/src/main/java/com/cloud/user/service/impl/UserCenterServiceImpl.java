package com.cloud.user.service.impl;

import com.cloud.auth.api.domain.User;
import com.cloud.common.constant.UserAccountConstants;
import com.cloud.common.utils.StringUtils;
import com.cloud.security.utils.SecurityUtils;
import com.cloud.user.dto.BillDetailDto;
import com.cloud.user.dto.BillDto;
import com.cloud.user.dto.UserInfoDto;
import com.cloud.user.mapper.UserAccountDetailMapper;
import com.cloud.user.mapper.UserAccountMapper;
import com.cloud.user.mapper.UserMapper;
import com.cloud.user.param.UserParam;
import com.cloud.user.param.WalletBillParam;
import com.cloud.user.param.WalletWithdrawParam;
import com.cloud.user.service.IUserCenterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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
        return false;
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
     * @param detailId
     * @return
     */
    @Override
    public List<BillDetailDto> walletBillDetail(String detailId) {
        //获取userId
        String userId = SecurityUtils.getUserId();
        return userAccountDetailMapper.selectByDetail(userId, detailId);
    }

}
