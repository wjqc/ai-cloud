package com.cloud.auth.service.impl;

import com.cloud.auth.api.domain.User;
import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.auth.api.domain.model.LoginUser;
import com.cloud.auth.api.service.RemoteLogService;
import com.cloud.auth.api.service.RemoteUserService;
import com.cloud.auth.service.LoginService;
import com.cloud.common.constant.Constants;
import com.cloud.common.constant.SecurityConstants;
import com.cloud.common.constant.UserConstants;
import com.cloud.common.model.Response;
import com.cloud.common.enums.UserStatus;
import com.cloud.common.exception.ServiceException;
import com.cloud.common.utils.ServletUtils;
import com.cloud.common.utils.StringUtils;
import com.cloud.common.utils.ip.IpUtils;
import com.cloud.common.utils.uuid.IdUtils;
import com.cloud.security.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录校验方法
 *
 * @author ai-cloud
 */

@Service
@Component
public class LoginServiceImpl implements LoginService {

    @Autowired
    private RemoteUserService remoteUserService;

    @Autowired
    private RemoteLogService remoteLogService;

    /**
     * 账号密码登录
     */
    public LoginUser login(String username, String password, String deviceId, HttpServletRequest request) {
        // 用户名或密码为空 错误
        if (StringUtils.isAnyBlank(username, password)) {
            recordUserLoginLog(username, deviceId, Constants.LOGIN_FAIL, "用户/密码必须填写");
            throw new ServiceException("用户/密码必须填写");
        }
        // 密码如果不在指定范围内 错误
        if (password.length() < UserConstants.PASSWORD_MIN_LENGTH
                || password.length() > UserConstants.PASSWORD_MAX_LENGTH) {
            recordUserLoginLog(username, deviceId,Constants.LOGIN_FAIL, "用户密码不在指定范围");
            throw new ServiceException("用户密码不在指定范围");
        }
        // 用户名不在指定范围内 错误
        if (username.length() < UserConstants.USERNAME_MIN_LENGTH
                || username.length() > UserConstants.USERNAME_MAX_LENGTH) {
            recordUserLoginLog(username,deviceId, Constants.LOGIN_FAIL, "用户名不在指定范围");
            throw new ServiceException("用户名不在指定范围");
        }
        // 查询用户信息
        Response<LoginUser> userResponse = remoteUserService.getUserInfo(username, SecurityConstants.INNER);

        if (Response.FAIL == userResponse.getCode()) {
            throw new ServiceException(userResponse.getMsg());
        }

        if (StringUtils.isNull(userResponse) || StringUtils.isNull(userResponse.getData().getUser())) {
            recordUserLoginLog(username,deviceId, Constants.LOGIN_FAIL, "登录用户不存在");
            throw new ServiceException("登录用户：" + username + " 不存在");
        }

        LoginUser userInfo = userResponse.getData();
        User user = userResponse.getData().getUser();
        if (UserStatus.DELETED.getCode().equals(user.getDeleteFlag())) {
            recordUserLoginLog(username,deviceId, Constants.LOGIN_FAIL, "对不起，您的账号已被删除");
            throw new ServiceException("对不起，您的账号：" + username + " 已被删除");
        }
        if (UserStatus.DISABLE.getCode().equals(user.getStatusFlag())) {
            recordUserLoginLog(username,deviceId, Constants.LOGIN_FAIL, "用户已停用，请联系管理员");
            throw new ServiceException("对不起，您的账号：" + username + " 已停用");
        }
        if (!SecurityUtils.matchesPassword(password, user.getPassword())) {
            recordUserLoginLog(username,deviceId, Constants.LOGIN_FAIL, "用户密码错误");
            throw new ServiceException("用户不存在/密码错误");
        }
        recordUserLoginLog(username,deviceId, Constants.LOGIN_SUCCESS, "登录成功");
        return userInfo;
    }

    /**
     * 退出登录
     */
    @Override
    public void logout(String loginName,String deviceId) {
        recordUserLoginLog(loginName, deviceId, Constants.LOGOUT, "退出成功");
    }

    /**
     * 记录登录信息
     *
     * @param username 用户名
     * @param status   状态
     * @param message  消息内容
     * @return
     */
    public void recordUserLoginLog(String username, String deviceId,  String status, String message) {
        UserLoginLog userLoginLog = new UserLoginLog();
        userLoginLog.setId(IdUtils.fastSimpleUUID());
        userLoginLog.setUserName(username);
        userLoginLog.setDeviceId(deviceId);
        userLoginLog.setIpaddr(IpUtils.getIpAddr(ServletUtils.getRequest()));
        userLoginLog.setMsg(message);
        // 日志状态
        if (StringUtils.equalsAny(status, Constants.LOGIN_SUCCESS, Constants.LOGOUT, Constants.REGISTER)) {
            userLoginLog.setStatus(Constants.LOGIN_SUCCESS_STATUS);
        } else if (Constants.LOGIN_FAIL.equals(status)) {
            userLoginLog.setStatus(Constants.LOGIN_FAIL_STATUS);
        }
        remoteLogService.saveUserLoginLog(userLoginLog, SecurityConstants.INNER);
    }


}
