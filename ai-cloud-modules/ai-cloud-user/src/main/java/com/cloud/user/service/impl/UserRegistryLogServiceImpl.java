package com.cloud.user.service.impl;

import java.util.List;

import com.cloud.auth.api.domain.UserRegistryLog;
import com.cloud.user.mapper.UserRegistryLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloud.user.service.IUserRegistryLogService;

/**
 * 用户注册记录Service业务层处理
 *
 * @author ai-cloud
 * @date 2022-06-05
 */
@Service
public class UserRegistryLogServiceImpl implements IUserRegistryLogService {

    @Autowired
    private UserRegistryLogMapper userRegistryLogMapper;

    /**
     * 新增用户注册记录
     *
     * @param userRegistryLog 用户注册记录
     * @return 结果
     */
    @Override
    public int insertUserRegistryLog(UserRegistryLog userRegistryLog) {
        return userRegistryLogMapper.insert(userRegistryLog);
    }


}
