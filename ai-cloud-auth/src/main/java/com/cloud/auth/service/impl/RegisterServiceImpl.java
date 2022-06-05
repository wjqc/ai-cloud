package com.cloud.auth.service.impl;

import com.cloud.auth.api.domain.User;
import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.auth.api.domain.UserRegistryLog;
import com.cloud.auth.api.service.RemoteLogService;
import com.cloud.auth.api.service.RemoteUserService;
import com.cloud.auth.service.LoginService;
import com.cloud.auth.service.RegisterService;
import com.cloud.common.constant.Constants;
import com.cloud.common.constant.SecurityConstants;
import com.cloud.common.constant.UserConstants;
import com.cloud.common.exception.ServiceException;
import com.cloud.common.model.Response;
import com.cloud.common.utils.ServletUtils;
import com.cloud.common.utils.StringUtils;
import com.cloud.common.utils.ip.IpUtils;
import com.cloud.common.utils.uuid.IdUtils;
import com.cloud.security.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RemoteUserService remoteUserService;

    @Autowired
    private RemoteLogService remoteLogService;

    /**
     * 账号密码注册
     */
    public void register(String username, String password) {
        // 用户名或密码为空 错误
        if (StringUtils.isAnyBlank(username, password)) {
            throw new ServiceException("用户/密码必须填写");
        }
        if (username.length() < UserConstants.USERNAME_MIN_LENGTH
                || username.length() > UserConstants.USERNAME_MAX_LENGTH) {
            throw new ServiceException("账户长度必须在2到20个字符之间");
        }
        if (password.length() < UserConstants.PASSWORD_MIN_LENGTH
                || password.length() > UserConstants.PASSWORD_MAX_LENGTH) {
            throw new ServiceException("密码长度必须在5到20个字符之间");
        }
        // 注册用户信息
        User user = new User();
        user.setUserName(username);
        user.setPassword(SecurityUtils.encryptPassword(password));
        Response<?> registerResult = remoteUserService.registerUserInfo(user, SecurityConstants.INNER);
        if (Response.FAIL == registerResult.getCode()) {
            throw new ServiceException(registerResult.getMsg());
        }
        recordUserRegistryLog(username, Constants.REGISTER, "注册成功");
    }


    /**
     * 记录注册信息
     *
     * @param username 用户名
     * @param status   状态
     * @param message  消息内容
     * @return
     */
    public void recordUserRegistryLog(String username, String status, String message) {
        UserRegistryLog userRegistryLog = new UserRegistryLog();
        userRegistryLog.setId(IdUtils.fastSimpleUUID());
        userRegistryLog.setUserName(username);
        userRegistryLog.setIpaddr(IpUtils.getIpAddr(ServletUtils.getRequest()));
        userRegistryLog.setMsg(message);
        // 日志状态
        if (StringUtils.equalsAny(status, Constants.LOGIN_SUCCESS, Constants.LOGOUT, Constants.REGISTER)) {
            userRegistryLog.setStatus(Constants.LOGIN_SUCCESS_STATUS);
        } else if (Constants.LOGIN_FAIL.equals(status)) {
            userRegistryLog.setStatus(Constants.LOGIN_FAIL_STATUS);
        }
        remoteLogService.saveUserRegistryLog(userRegistryLog, SecurityConstants.INNER);
    }



}