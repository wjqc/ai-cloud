package com.cloud.auth.api.domain.model;


import com.cloud.auth.api.domain.User;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * 用户信息
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("用户信息")
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


}
