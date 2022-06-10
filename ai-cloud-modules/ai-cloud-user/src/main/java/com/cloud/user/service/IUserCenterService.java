package com.cloud.user.service;

import com.cloud.user.dto.UserInfoDto;
import com.cloud.user.param.UserParam;
import com.cloud.user.param.WalletWithdrawParam;

/**
 * 我的信息Service接口
 *
 * @author ai-cloud
 */
public interface IUserCenterService {

    /**
     * 查询用户信息
     *
     * @param
     * @return 用户对象信息
     */
    public UserInfoDto userInfo();

    /**
     * 保存我的信息
     *
     * @param param
     * @return
     */
    public boolean userSave(UserParam param);

    /**
     * 查询钱包余额
     *
     * @param
     * @return
     */
    public String wallet();

    /**
     * 申请提现
     *
     * @param param
     * @return
     */
    public boolean walletWithdraw(WalletWithdrawParam param);

}
