package com.cloud.auth.service;

/**
 * 注册校验方法
 *
 * @author ai-cloud
 *
 */
public interface RegisterService {

    /**
     * 账号密码注册
     */
    public void register(String username, String password,String deviceId);


}
