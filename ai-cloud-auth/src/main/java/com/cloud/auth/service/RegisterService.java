package com.cloud.auth.service;

/**
 * 注册校验方法
 *
 * @author ai-cloud
 */
public interface RegisterService {

    /**
     * 账号密码注册
     *
     * @param username 用户名
     * @param password 密码
     * @param deviceId 设备唯一标识
     * @return 注册结果
     */
    public void register(String username, String password, String deviceId);


}
