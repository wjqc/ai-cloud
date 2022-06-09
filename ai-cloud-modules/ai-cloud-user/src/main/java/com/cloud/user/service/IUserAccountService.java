package com.cloud.user.service;

/**
 * 用户账户信息Service接口
 *
 * @author ai-cloud
 */
public interface IUserAccountService {

    /**
     * 创建账户
     *
     * @param userId
     * @param deviceId
     * @param type
     * @return
     */
    public int createAccount(String userId, String deviceId, String type);


    /**
     * 钱包余额
     *
     * @return
     */
    public String wallet();

}
