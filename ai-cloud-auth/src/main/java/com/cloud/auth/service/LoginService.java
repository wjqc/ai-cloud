package com.cloud.auth.service;


import com.cloud.auth.api.domain.model.LoginUser;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {

    /**
     * 账号密码登录
     */
    public LoginUser login(String username, String password, HttpServletRequest request);


    /**
     * 退出登录
     */
    public void logout(String loginName);

}
