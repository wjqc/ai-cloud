package com.cloud.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 用户详细信息
 *
 * @author ai-cloud
 */
@Data
@ApiModel("用户详细信息")
public class UserInfoDto {

    @ApiModelProperty(value = "用户账号")
    private String userName;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "用户头像")
    private String headImg;

    @ApiModelProperty(value = "绑定手机号")
    private String phone;

    @ApiModelProperty(value = "性别 1.男 2.女")
    private String sex;

    @ApiModelProperty(value = "年龄")
    private String age;

    @ApiModelProperty(value = "签名")
    private String sign;

    @ApiModelProperty(value = "会员类型; 1：普通会员 2：VIP会员 3：SVIP会员")
    private Integer vipType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "会员开始时间")
    private Date vipStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "会员结束时间")
    private Date vipEndTime;

    @ApiModelProperty(value = "用户类型；1：普通用户 2：VIP用户 3：SVIP用户")
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
