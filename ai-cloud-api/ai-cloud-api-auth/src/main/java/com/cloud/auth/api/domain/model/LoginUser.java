package com.cloud.auth.api.domain.model;


import com.cloud.auth.api.domain.User;

import java.io.Serializable;


/**
 * 用户信息
 *
 * @author ai-cloud
 */
public class LoginUser implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识
     */
    private String token;

    /**
     * 用户名id
     */
    private String userid;

    /**
     * 用户名
     */
    private String username;


    /**
     * 用户设备唯一标识
     */
    private String deviceId;

    /**
     * 登录时间
     */
    private Long loginTime;

    /**
     * 过期时间
     */
    private Long expireTime;

    /**
     * 登录IP地址
     */
    private String ipaddr;

    /**
     * 用户信息
     */
    private User user;

    public String getToken() {
        return token;
    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public Long getLoginTime() {
        return loginTime;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public User getUser() {
        return user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
