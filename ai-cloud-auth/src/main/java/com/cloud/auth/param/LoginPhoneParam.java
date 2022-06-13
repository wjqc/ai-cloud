package com.cloud.auth.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 手机登录请求参数
 *
 * @author ai-cloud
 */
@Data
@ApiModel("手机登录请求参数")
public class LoginPhoneParam extends VerifyCodeParam{

    /** 邀请者id */
    @ApiModelProperty(value = "邀请人ID", example = "1")
    private String invitationId;

}
