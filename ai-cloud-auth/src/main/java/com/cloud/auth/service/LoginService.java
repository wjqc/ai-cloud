package com.cloud.auth.service;


import com.cloud.auth.api.domain.model.LoginUser;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录校验方法
 *
 * @author ai-cloud
 *
 */
public interface LoginService {

    /**
     * 账号密码登录
     */
    public LoginUser login(String username, String password, String deviceId, HttpServletRequest request);


    /**
     * 退出登录
     */
    public void logout(String loginName,String deviceId);

}
