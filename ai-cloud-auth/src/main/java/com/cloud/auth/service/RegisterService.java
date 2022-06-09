package com.cloud.auth.service;

public interface RegisterService {

    /**
     * 账号密码注册
     */
    public void register(String username, String password,String deviceId);


}
