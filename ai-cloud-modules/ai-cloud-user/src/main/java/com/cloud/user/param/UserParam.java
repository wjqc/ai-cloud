package com.cloud.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("修改我的信息参数")
public class UserParam {

    /** 用户头像 */
    @ApiModelProperty(value = "用户头像", example = "http://192.168.2.11/group1/M00/00/00/wKgCC2KSXreAaYveAANzTDXoVDw494.png")
    private String headImg;

    /** 昵称 */
    @ApiModelProperty(value = "昵称", example = "小可爱")
    private String nickName;

    /** 性别 */
    @ApiModelProperty(value = "性别", example = "1")
    private String sex;

    /** 年龄 */
    @ApiModelProperty(value = "年龄", example = "19")
    private String age;

    /** 签名 */
    @ApiModelProperty(value = "签名", example = "这个世界本就是平衡的，想要得到什么就要付出什么")
    private String sign;

    /** 安卓推广地址 */
    @ApiModelProperty(value = "安卓推广地址", example = "UrlAnd")
    private String invitationUrlAnd;

    /** IOS推广地址 */
    @ApiModelProperty(value = "IOS推广地址", example = "UrlIos")
    private String invitationUrlIos;

    public String getHeadImg() {
        return headImg;
    }

    public String getNickName() {
        return nickName;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getSign() {
        return sign;
    }

    public String getInvitationUrlAnd() {
        return invitationUrlAnd;
    }

    public String getInvitationUrlIos() {
        return invitationUrlIos;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setInvitationUrlAnd(String invitationUrlAnd) {
        this.invitationUrlAnd = invitationUrlAnd;
    }

    public void setInvitationUrlIos(String invitationUrlIos) {
        this.invitationUrlIos = invitationUrlIos;
    }
}
