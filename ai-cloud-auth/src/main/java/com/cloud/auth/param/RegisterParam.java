package com.cloud.auth.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户注册参数
 *
 * @author ai-cloud
 */
@Data
@Getter
@Setter
@ApiModel("用户注册参数")
public class RegisterParam extends LoginParam {

    @ApiModelProperty(value = "用户手机号", example = "13888888888")
    private String phone;

    @ApiModelProperty(value = "邀请者id", example = "b893f5cde0b54223b2b4546660fb38ac")
    private String invitationId;

    @ApiModelProperty(value = "注册方式；1：手机快捷注册 2：手机短信注册 3：微信注册 4：支付宝注册 5：新浪微博注册", example = "String")
    private Integer regType;
}
