package com.cloud.auth.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 账号密码登录参数
 *
 * @author ai-cloud
 */
@Data
@Getter
@Setter
@ApiModel("账号密码登录参数")
public class LoginParam extends BaseParam {

    @ApiModelProperty(value = "用户账号或手机号", example = "String")
    private String username;

    @ApiModelProperty(value = "用户密码", example = "String")
    private String password;
}
