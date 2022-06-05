package com.cloud.user.service;

import java.util.List;

import com.cloud.auth.api.domain.UserRegistryLog;

/**
 * 用户注册记录Service接口
 *
 * @author ai-cloud
 * @date 2022-06-05
 */
public interface IUserRegistryLogService {

    /**
     * 新增用户注册记录
     *
     * @param userRegistryLog 用户注册记录
     * @return 结果
     */
    public int insertUserRegistryLog(UserRegistryLog userRegistryLog);

}
