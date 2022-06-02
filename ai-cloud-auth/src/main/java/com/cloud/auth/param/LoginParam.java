package com.cloud.auth.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户登录对象
 *
 * @author
 */
@ApiModel("用户登录参数")
public class LoginParam {

    /** 用户账号 */
    @ApiModelProperty(value = "用户账号",example = "String")
    private String username;

    /** 用户密码 */
    @ApiModelProperty(value = "用户密码",example = "String")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
