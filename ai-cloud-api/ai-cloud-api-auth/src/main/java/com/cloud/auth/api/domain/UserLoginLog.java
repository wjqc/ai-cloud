package com.cloud.auth.api.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户登录记录对象 user_login_log
 * 
 * @author ai-cloud
 * @date 2022-06-05
 */
@ApiModel("用户登录记录")
public class UserLoginLog{

    private static final long serialVersionUID = 1L;

    /** 登录记录id */
    private String id;

    /** 用户账号 */
    @ApiModelProperty(value = "用户账号",example = "String")
    private String userName;

    /** 登录设备唯一标识 */
    @ApiModelProperty(value = "登录设备唯一标识",example = "String")
    private String uuid;

    /** 设备记录id */
    @ApiModelProperty(value = "设备记录id",example = "String")
    private String deviceId;

    /** 登录方式；1：手机快捷登录 2：账号密码登录 */
    @ApiModelProperty(value = "登录方式；1：手机快捷登录 2：账号密码登录",example = "Long")
    private Long type;

    /** 登录状态：0：成功 1：失败 */
    @ApiModelProperty(value = "登录状态：0：成功 1：失败",example = "Long")
    private String status;

    /** 登录IP地址 */
    @ApiModelProperty(value = "登录IP地址",example = "String")
    private String ipaddr;

    /** 提示消息 */
    @ApiModelProperty(value = "提示消息",example = "String")
    private String msg;

    /** 登录地点 */
    @ApiModelProperty(value = "登录地点",example = "String")
    private String loginLocation;

    /** 访问时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value ="访问时间",example = "Date")
    private Date loginTime;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setUuid(String uuid){
        this.uuid = uuid;
    }
    public String getUuid(){
        return uuid;
    }
    public void setDeviceId(String deviceId){
        this.deviceId = deviceId;
    }
    public String getDeviceId(){
        return deviceId;
    }
    public void setType(Long type){
        this.type = type;
    }
    public Long getType(){
        return type;
    }
    public void setStatus(String status){this.status = status;}
    public String getStatus(){
        return status;
    }
    public void setIpaddr(String ipaddr){
        this.ipaddr = ipaddr;
    }
    public String getIpaddr(){
        return ipaddr;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return msg;
    }
    public void setLoginLocation(String loginLocation){
        this.loginLocation = loginLocation;
    }
    public String getLoginLocation(){
        return loginLocation;
    }
    public void setLoginTime(Date loginTime){
        this.loginTime = loginTime;
    }
    public Date getLoginTime(){
        return loginTime;
    }

}
