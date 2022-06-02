package com.cloud.user.service.impl;


import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloud.user.mapper.UserLoginLogMapper;
import com.cloud.user.service.IUserLoginLogService;

/**
 * 用户登录记录Service业务层处理
 *
 * @author ai-cloud
 * @date 2022-05-18
 */
@Service
public class UserLoginLogServiceImpl implements IUserLoginLogService {

    @Autowired
    private UserLoginLogMapper userLoginLogMapper;

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

}
