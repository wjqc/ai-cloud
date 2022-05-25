package com.cloud.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


@Data
@ApiModel("用户详细信息")
public class UserInfoDto {

    @ApiModelProperty(value = "用户账号")
    private String userName;

    @ApiModelProperty(value = "用户头像")
    private String headImg;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "年龄")
    private String age;

    @ApiModelProperty(value = "绑定手机号")
    private String phone;

    @ApiModelProperty(value = "签名")
    private String sign;

    @ApiModelProperty(value = "会员类型; 1：普通会员 2：VIP会员 3：sVIP会员")
    private Integer vipType;

    @ApiModelProperty(value = "会员开始时间")
    private Date vipStartTime;

    @ApiModelProperty(value = "会员结束时间")
    private Date vipEndTime;

    @ApiModelProperty(value = "用户类型；1：普通用户 2：VIP用户 3：sVIP用户")
    private Integer userType;

    @ApiModelProperty(value = "粉丝总数")
    private Integer fans;

    @ApiModelProperty(value = "关注总数")
    private Integer attention;

    @ApiModelProperty(value = "点赞总数")
    private Integer likes;

    @ApiModelProperty(value = "排名")
    private Integer rank;
}
