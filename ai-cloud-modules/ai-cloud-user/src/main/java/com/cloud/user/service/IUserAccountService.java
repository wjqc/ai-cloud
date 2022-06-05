package com.cloud.user.service;

import com.cloud.auth.api.domain.UserAccount;

import java.util.List;

/**
 * 用户账户信息Service接口
 *
 * @author ai-cloud
 * @date 2022-05-10
 */
public interface IUserAccountService {

    /**
     * 创建账户
     * @param userId
     * @param uuid
     * @param type
     * @return
     */
    public int createAccount(String userId, String uuid, String type);

}
