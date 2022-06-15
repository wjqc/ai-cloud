package com.cloud.auth.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 一键登录请求参数
 *
 * @author ai-cloud
 */
@Data
@ApiModel("一键登录请求参数")
public class LoginOneStepParam extends VerifyPhoneParam {

    @ApiModelProperty(value = "邀请人ID", example = "1")
    private String invitationId;

}
