package com.cloud.auth.api.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.cloud.common.web.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户信息对象 user
 * 
 * @author ai-cloud
 * @date 2022-06-05
 */
@ApiModel("用户信息")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private String id;

    /** 用户账号 */
    @ApiModelProperty(value = "用户账号",example = "Long")
    private String userName;

    /** 用户密码 */
    @ApiModelProperty(value = "用户密码",example = "String")
    private String password;

    /** 设备唯一标识 */
    @ApiModelProperty(value = "设备唯一标识",example = "String")
    private String uuid;

    /** 用户设备id */
    @ApiModelProperty(value = "用户设备id",example = "String")
    private String deviceId;

    /** 用户绑定手机号 */
    @ApiModelProperty(value = "用户绑定手机号",example = "String")
    private String phone;

    /** 头像 */
    @ApiModelProperty(value = "头像",example = "String")
    private String headImg;

    /** 昵称 */
    @ApiModelProperty(value = "昵称",example = "String")
    private String nickName;

    /** 性别 1.男 2.女 */
    @ApiModelProperty(value = "性别 1.男 2.女",example = "Long")
    private Long sex;

    /** 年龄 */
    @ApiModelProperty(value = "年龄",example = "Long")
    private Long age;

    /** 出生年月 */
    @ApiModelProperty(value = "出生年月",example = "String")
    private String birthday;

    /** 签名 */
    @ApiModelProperty(value = "签名",example = "String")
    private String sign;

    /** 国家 */
    @ApiModelProperty(value = "国家",example = "String")
    private String state;

    /** 省份 */
    @ApiModelProperty(value = "省份",example = "String")
    private String capital;

    /** 城市 */
    @ApiModelProperty(value = "城市",example = "String")
    private String city;

    /** 县区 */
    @ApiModelProperty(value = "县区",example = "String")
    private String counties;

    /** QQ绑定的id */
    @ApiModelProperty(value = "QQ绑定的id",example = "String")
    private String bindQqId;

    /** 绑定微信id */
    @ApiModelProperty(value = "绑定微信id",example = "String")
    private String bindWechatId;

    /** 绑定微博id */
    @ApiModelProperty(value = "绑定微博id",example = "String")
    private String bindSinaId;

    /** 绑定支付宝id */
    @ApiModelProperty(value = "绑定支付宝id",example = "String")
    private String bindAlipayId;

    /** 是否激活; 用户注册后未登录过，即为此用户未激活 1：未激活 2：已激活 */
    @ApiModelProperty(value = "是否激活; 用户注册后未登录过，即为此用户未激活 1：未激活 2：已激活",example = "Long")
    private Long activate;

    /** 激活时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value ="激活时间",example = "Date")
    private Date activateTime;

    /** 粉丝数 */
    @ApiModelProperty(value = "粉丝数",example = "Long")
    private Long fans;

    /** 用户关注数 */
    @ApiModelProperty(value = "用户关注数",example = "Long")
    private Long attention;

    /** 用户作品数量 */
    @ApiModelProperty(value = "用户作品数量",example = "Long")
    private Long opus;

    /** 点赞数 */
    @ApiModelProperty(value = "点赞数",example = "Long")
    private Long likes;

    /** 获取的总KB值 */
    @ApiModelProperty(value = "获取的总KB值",example = "BigDecimal")
    private BigDecimal kbs;

    /** 用户邀请码 */
    @ApiModelProperty(value = "用户邀请码",example = "String")
    private String invitationCode;

    /** 邀请者二维码 */
    @ApiModelProperty(value = "邀请者二维码",example = "String")
    private String invitationQrcode;

    /** 邀请者id */
    @ApiModelProperty(value = "邀请者id",example = "String")
    private String invitationId;

    /** 推广安卓URL */
    @ApiModelProperty(value = "推广安卓URL",example = "String")
    private String invitationUrlAnd;

    /** 推广IOSURL */
    @ApiModelProperty(value = "推广IOSURL",example = "String")
    private String invitationUrlIos;

    /** 推广微信小程序URL */
    @ApiModelProperty(value = "推广微信小程序URL",example = "String")
    private String invitationUrlWeixin;

    /** 推广链 */
    @ApiModelProperty(value = "推广链",example = "String")
    private String invitationIds;

    /** 会员类型; 1：普通会员 2：VIP会员 3：SVIP会员 */
    @ApiModelProperty(value = "会员类型; 1：普通会员 2：VIP会员 3：SVIP会员",example = "Long")
    private Long vipType;

    /** 会员开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value ="会员开始时间",example = "Date")
    private Date vipStartTime;

    /** 会员结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value ="会员结束时间",example = "Date")
    private Date vipEndTime;

    /** 是否实名认证；1：未验证，2：已验证 */
    @ApiModelProperty(value = "是否实名认证；1：未验证，2：已验证",example = "Long")
    private Long realnameAuth;

    /** 用户类型；1：普通用户 2：VIP用户 3：SVIP用户 */
    @ApiModelProperty(value = "用户类型；1：普通用户 2：VIP用户 3：SVIP用户",example = "Long")
    private Long userType;

    /** 微信用户头像 */
    @ApiModelProperty(value = "微信用户头像",example = "String")
    private String weixinAvatar;

    /** 微信登录openid */
    @ApiModelProperty(value = "微信登录openid",example = "String")
    private String weixinOpenid;

    /** 微信登录会话KEY */
    @ApiModelProperty(value = "微信登录会话KEY",example = "String")
    private String sessionKey;

    /** 最后登录IP */
    @ApiModelProperty(value = "最后登录IP",example = "String")
    private String loginIp;

    /** 最后登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value ="最后登录时间",example = "Date")
    private Date loginDate;

    /** 状态：0：启用，2：停用 */
    @ApiModelProperty(value = "状态：0：启用，2：停用",example = "Long")
    private Long statusFlag;

    /** 删除：0：未删除，2：已删除 */
    @ApiModelProperty(value = "删除：0：未删除，2：已删除",example = "Long")
    private Long deleteFlag;

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
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
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
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }
    public void setHeadImg(String headImg){
        this.headImg = headImg;
    }
    public String getHeadImg(){
        return headImg;
    }
    public void setNickName(String nickName){
        this.nickName = nickName;
    }
    public String getNickName(){
        return nickName;
    }
    public void setSex(Long sex){
        this.sex = sex;
    }
    public Long getSex(){
        return sex;
    }
    public void setAge(Long age){
        this.age = age;
    }
    public Long getAge(){
        return age;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public String getBirthday(){
        return birthday;
    }
    public void setSign(String sign){
        this.sign = sign;
    }
    public String getSign(){
        return sign;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    public String getCapital(){
        return capital;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setCounties(String counties){
        this.counties = counties;
    }
    public String getCounties(){
        return counties;
    }
    public void setBindQqId(String bindQqId){
        this.bindQqId = bindQqId;
    }
    public String getBindQqId(){
        return bindQqId;
    }
    public void setBindWechatId(String bindWechatId){
        this.bindWechatId = bindWechatId;
    }
    public String getBindWechatId(){
        return bindWechatId;
    }
    public void setBindSinaId(String bindSinaId){
        this.bindSinaId = bindSinaId;
    }
    public String getBindSinaId(){
        return bindSinaId;
    }
    public void setBindAlipayId(String bindAlipayId){
        this.bindAlipayId = bindAlipayId;
    }
    public String getBindAlipayId(){
        return bindAlipayId;
    }
    public void setActivate(Long activate){
        this.activate = activate;
    }
    public Long getActivate(){
        return activate;
    }
    public void setActivateTime(Date activateTime){
        this.activateTime = activateTime;
    }
    public Date getActivateTime(){
        return activateTime;
    }
    public void setFans(Long fans){
        this.fans = fans;
    }
    public Long getFans(){
        return fans;
    }
    public void setAttention(Long attention){
        this.attention = attention;
    }
    public Long getAttention(){
        return attention;
    }
    public void setOpus(Long opus){
        this.opus = opus;
    }
    public Long getOpus(){
        return opus;
    }
    public void setLikes(Long likes){
        this.likes = likes;
    }
    public Long getLikes(){
        return likes;
    }
    public void setKbs(BigDecimal kbs){
        this.kbs = kbs;
    }
    public BigDecimal getKbs(){
        return kbs;
    }
    public void setInvitationCode(String invitationCode){
        this.invitationCode = invitationCode;
    }
    public String getInvitationCode(){
        return invitationCode;
    }
    public void setInvitationQrcode(String invitationQrcode){
        this.invitationQrcode = invitationQrcode;
    }
    public String getInvitationQrcode(){
        return invitationQrcode;
    }
    public void setInvitationId(String invitationId){
        this.invitationId = invitationId;
    }
    public String getInvitationId(){
        return invitationId;
    }
    public void setInvitationUrlAnd(String invitationUrlAnd){
        this.invitationUrlAnd = invitationUrlAnd;
    }
    public String getInvitationUrlAnd(){
        return invitationUrlAnd;
    }
    public void setInvitationUrlIos(String invitationUrlIos){
        this.invitationUrlIos = invitationUrlIos;
    }
    public String getInvitationUrlIos(){
        return invitationUrlIos;
    }
    public void setInvitationUrlWeixin(String invitationUrlWeixin){
        this.invitationUrlWeixin = invitationUrlWeixin;
    }
    public String getInvitationUrlWeixin(){
        return invitationUrlWeixin;
    }
    public void setInvitationIds(String invitationIds){
        this.invitationIds = invitationIds;
    }
    public String getInvitationIds(){
        return invitationIds;
    }
    public void setVipType(Long vipType){
        this.vipType = vipType;
    }
    public Long getVipType(){
        return vipType;
    }
    public void setVipStartTime(Date vipStartTime){
        this.vipStartTime = vipStartTime;
    }
    public Date getVipStartTime(){
        return vipStartTime;
    }
    public void setVipEndTime(Date vipEndTime){
        this.vipEndTime = vipEndTime;
    }
    public Date getVipEndTime(){
        return vipEndTime;
    }
    public void setRealnameAuth(Long realnameAuth){
        this.realnameAuth = realnameAuth;
    }
    public Long getRealnameAuth(){
        return realnameAuth;
    }
    public void setUserType(Long userType){
        this.userType = userType;
    }
    public Long getUserType(){
        return userType;
    }
    public void setWeixinAvatar(String weixinAvatar){
        this.weixinAvatar = weixinAvatar;
    }
    public String getWeixinAvatar(){
        return weixinAvatar;
    }
    public void setWeixinOpenid(String weixinOpenid){
        this.weixinOpenid = weixinOpenid;
    }
    public String getWeixinOpenid(){
        return weixinOpenid;
    }
    public void setSessionKey(String sessionKey){
        this.sessionKey = sessionKey;
    }
    public String getSessionKey(){
        return sessionKey;
    }
    public void setLoginIp(String loginIp){
        this.loginIp = loginIp;
    }
    public String getLoginIp(){
        return loginIp;
    }
    public void setLoginDate(Date loginDate){
        this.loginDate = loginDate;
    }
    public Date getLoginDate(){
        return loginDate;
    }
    public void setStatusFlag(Long statusFlag){
        this.statusFlag = statusFlag;
    }
    public Long getStatusFlag(){
        return statusFlag;
    }
    public void setDeleteFlag(Long deleteFlag){
        this.deleteFlag = deleteFlag;
    }
    public Long getDeleteFlag(){
        return deleteFlag;
    }

}
