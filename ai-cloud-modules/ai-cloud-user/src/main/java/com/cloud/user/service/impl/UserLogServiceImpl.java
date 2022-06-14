package com.cloud.user.service.impl;


import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.auth.api.domain.UserOperLog;
import com.cloud.auth.api.domain.UserRegistryLog;
import com.cloud.common.utils.DateUtils;
import com.cloud.user.mapper.UserLoginLogMapper;
import com.cloud.user.mapper.UserOperLogMapper;
import com.cloud.user.mapper.UserRegistryLogMapper;
import com.cloud.user.service.IUserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户日志记录Service业务层处理
 *
 * @author ai-cloud
 */
@Service
public class UserLogServiceImpl implements IUserLogService {

    @Autowired
    private UserLoginLogMapper userLoginLogMapper;

    @Autowired
    private UserRegistryLogMapper userRegistryLogMapper;

    @Autowired
    private UserOperLogMapper userOperLogMapper;

    /**
     * 新增用户登录记录
     *
     * @param userLoginLog 用户登录记录
     * @return 结果
     */
    @Override
    public int insertUserLoginLog(UserLoginLog userLoginLog) {
        userLoginLog.setLoginTime(DateUtils.getNowDate());
        return userLoginLogMapper.insert(userLoginLog);
    }

    /**
     * 新增用户注册记录
     *
     * @param userRegistryLog 用户注册记录
     * @return 结果
     */
    @Override
    public int insertUserRegistryLog(UserRegistryLog userRegistryLog) {
        userRegistryLog.setRegistryTime(DateUtils.getNowDate());
        return userRegistryLogMapper.insert(userRegistryLog);
    }


    /**
     * 新增操作日志记录
     *
     * @param userOperLog 操作日志记录
     * @return 结果
     */
    @Override
    public int insertUserOperLog(UserOperLog userOperLog) {
        userOperLog.setOperTime(DateUtils.getNowDate());
        return userOperLogMapper.insert(userOperLog);
    }


}
