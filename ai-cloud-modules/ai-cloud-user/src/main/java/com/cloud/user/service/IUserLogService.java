package com.cloud.user.service;

import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.auth.api.domain.UserOperLog;
import com.cloud.auth.api.domain.UserRegistryLog;


/**
 * 用户日志记录Service接口
 *
 * @author ai-cloud
 */
public interface IUserLogService {

    /**
     * 新增用户登录记录
     *
     * @param userLoginLog 用户登录记录
     * @return 结果
     */
    public int insertUserLoginLog(UserLoginLog userLoginLog);

    /**
     * 新增用户注册记录
     *
     * @param userRegistryLog 用户注册记录
     * @return 结果
     */
    public int insertUserRegistryLog(UserRegistryLog userRegistryLog);

    /**
     * 新增操作日志记录
     *
     * @param userOperLog 操作日志记录
     * @return 结果
     */
    public int insertUserOperLog(UserOperLog userOperLog);

}
