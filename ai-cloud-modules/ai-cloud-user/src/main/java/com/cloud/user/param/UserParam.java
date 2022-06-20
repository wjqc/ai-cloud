package com.cloud.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 保存我的信息参数
 *
 * @author ai-cloud
 */
@Data
@Getter
@Setter
@ApiModel("保存我的信息参数")
public class UserParam {

    @ApiModelProperty(value = "用户头像", example = "http://192.168.2.11/group1/M00/00/00/wKgCC2KSXreAaYveAANzTDXoVDw494.png")
    private String headImg;

    @ApiModelProperty(value = "昵称", example = "小可爱")
    private String nickName;

    @ApiModelProperty(value = "性别", example = "1")
    private Long sex;

    @ApiModelProperty(value = "年龄", example = "19")
    private Long age;

    @ApiModelProperty(value = "签名", example = "这个世界本就是平衡的，想要得到什么就要付出什么")
    private String sign;

    @ApiModelProperty(value = "安卓推广地址", example = "UrlAnd")
    private String invitationUrlAnd;

    @ApiModelProperty(value = "IOS推广地址", example = "UrlIos")
    private String invitationUrlIos;

}
