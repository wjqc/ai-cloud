package com.cloud.auth.service;


import com.cloud.auth.api.domain.model.LoginUser;

public interface LoginService {

    /**
     * 账号密码登录
     */
    public LoginUser login(String username, String password);


    /**
     * 退出登录
     */
    public void logout(String loginName);

}
