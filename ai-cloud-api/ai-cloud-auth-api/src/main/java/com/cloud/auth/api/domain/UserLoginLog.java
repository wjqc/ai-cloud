package com.cloud.auth.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 用户登录记录对象 user_login_log
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("用户登录记录")
public class UserLoginLog {

    private static final long serialVersionUID = 1L;

    /**
     * 登录记录ID
     */
    private String id;

    /**
     * 用户账号
     */
    @ApiModelProperty(value = "用户账号", example = "String")
    private String userName;

    /**
     * 登录设备唯一标识
     */
    @ApiModelProperty(value = "登录设备唯一标识", example = "String")
    private String deviceId;

    /**
     * 登录方式；1：手机快捷登录 2：账号密码登录
     */
    @ApiModelProperty(value = "登录方式；1：手机快捷登录 2：账号密码登录", example = "Long")
    private Long type;

    /**
     * 登录状态：0：成功 1：失败
     */
    @ApiModelProperty(value = "登录状态：0：成功 1：失败", example = "Long")
    private String status;

    /**
     * 登录IP地址
     */
    @ApiModelProperty(value = "登录IP地址", example = "String")
    private String ipaddr;

    /**
     * 提示消息
     */
    @ApiModelProperty(value = "提示消息", example = "String")
    private String msg;

    /**
     * 登录地点
     */
    @ApiModelProperty(value = "登录地点", example = "String")
    private String loginLocation;

    /**
     * 访问时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "访问时间", example = "Date")
    private Date loginTime;



}
