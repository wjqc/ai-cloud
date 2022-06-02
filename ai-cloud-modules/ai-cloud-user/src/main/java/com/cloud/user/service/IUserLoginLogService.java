package com.cloud.user.service;

import com.cloud.auth.api.domain.UserLoginLog;

import java.util.List;


/**
 * 用户登录记录Service接口
 *
 * @author ai-cloud
 * @date 2022-05-18
 */
public interface IUserLoginLogService {

    /**
     * 新增用户登录记录
     *
     * @param userLoginLog 用户登录记录
     * @return 结果
     */
    public int insertUserLoginLog(UserLoginLog userLoginLog);

}
