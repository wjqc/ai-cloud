package com.cloud.auth.service;


import com.cloud.auth.api.domain.model.LoginUser;
import com.cloud.auth.param.WxLoginParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录校验方法
 *
 * @author ai-cloud
 */
public interface LoginService {

    /**
     * 账号密码登录
     *
     * @param username 用户名
     * @param password 密码
     * @param deviceId 设备唯一标识
     * @param request  请求对象
     * @return 登录结果
     */
    public LoginUser login(String username, String password, String deviceId, HttpServletRequest request);

    /**
     * 微信授权登录
     *
     * @param param
     * @param request 请求对象
     * @return 登录结果
     */
    public LoginUser loginWeixin(WxLoginParam param, HttpServletRequest request);

    /**
     * 退出登录
     */
    public void logout(String loginName, String deviceId);

}
