package com.cloud.auth.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户登录参数
 *
 * @author ai-cloud
 */
@Data
@ApiModel("用户登录参数")
public class LoginParam extends BaseParam{

    /** 用户账号或手机号 */
    @ApiModelProperty(value = "用户账号或手机号",example = "String")
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
