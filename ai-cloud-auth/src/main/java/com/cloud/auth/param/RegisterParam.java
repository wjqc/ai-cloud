package com.cloud.auth.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户注册对象
 *
 * @author
 */
@Data
@ApiModel("新用户创建账号和账户参数")
public class RegisterParam extends LoginParam{

    /** 用户手机号 */
    @ApiModelProperty(value = "用户手机号",example = "String")
    private String phone;

    /** 邀请者id */
    @ApiModelProperty(value = "邀请者id",example = "String")
    private String invitationId;

    /** 设备唯一标识 */
    @ApiModelProperty(value = "设备唯一标识",example = "String")
    private String uuid;

    /** 注册方式；1：手机快捷注册 2：手机短信注册 3：微信注册 4：支付宝注册 5：新浪微博注册 */
    @ApiModelProperty(value = "注册方式；1：手机快捷注册 2：手机短信注册 3：微信注册 4：支付宝注册 5：新浪微博注册",example = "String")
    private Integer regType;

    public String getPhone() {
        return phone;
    }

    public String getInvitationId() {
        return invitationId;
    }

    public String getUuid() {
        return uuid;
    }

    public Integer getRegType() {
        return regType;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setRegType(Integer regType) {
        this.regType = regType;
    }
}
