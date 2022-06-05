package com.cloud.auth.api.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户注册记录对象 user_registry_log
 * 
 * @author ai-cloud
 * @date 2022-06-05
 */
@ApiModel("用户注册记录")
public class UserRegistryLog{

    private static final long serialVersionUID = 1L;

    /** 注册记录ID */
    private String id;

    /** 注册账号 */
    @ApiModelProperty(value = "注册账号",example = "String")
    private String userName;

    /** 注册设备唯一标识 */
    @ApiModelProperty(value = "注册设备唯一标识",example = "String")
    private String uuid;

    /** 注册设备记录id */
    @ApiModelProperty(value = "注册设备记录id",example = "String")
    private String deviceId;

    /** 注册方式；1：手机快捷注册 2：手机短信注册 3：微信注册 4：支付宝注册 5：新浪微博注册 */
    @ApiModelProperty(value = "注册方式；1：手机快捷注册 2：手机短信注册 3：微信注册 4：支付宝注册 5：新浪微博注册",example = "Long")
    private Long type;

    /** 注册来源；1：app； 2：h5； 3：微信公众号 4：小程序 */
    @ApiModelProperty(value = "注册来源；1：app； 2：h5； 3：微信公众号 4：小程序",example = "Long")
    private Long source;

    /** 绑定手机号 */
    @ApiModelProperty(value = "绑定手机号",example = "String")
    private String bindPhone;

    /** 注册邀请码 */
    @ApiModelProperty(value = "注册邀请码",example = "String")
    private String invitationCode;

    /** 提示消息 */
    @ApiModelProperty(value = "提示消息",example = "String")
    private String msg;

    /** 注册状态：0：成功 1：失败 */
    @ApiModelProperty(value = "注册状态：0：成功 1：失败",example = "Long")
    private String status;

    /** 注册IP地址 */
    @ApiModelProperty(value = "注册IP地址",example = "String")
    private String ipaddr;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value ="注册时间",example = "Date")
    private Date registryTime;

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUuid() {
        return uuid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public Long getType() {
        return type;
    }

    public Long getSource() {
        return source;
    }

    public String getBindPhone() {
        return bindPhone;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public String getMsg() {
        return msg;
    }

    public String getStatus() {
        return status;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public Date getRegistryTime() {
        return registryTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public void setRegistryTime(Date registryTime) {
        this.registryTime = registryTime;
    }
}
