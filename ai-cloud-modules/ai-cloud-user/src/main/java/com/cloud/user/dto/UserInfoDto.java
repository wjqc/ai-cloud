package com.cloud.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


@Data
@ApiModel("用户详细信息")
public class UserInfoDto {

    /** 用户账号 */
    @ApiModelProperty(value = "用户账号")
    private String userName;

    /** 昵称 */
    @ApiModelProperty(value = "昵称")
    private String nickName;

    /** 头像 */
    @ApiModelProperty(value = "用户头像")
    private String headImg;

    /** 用户绑定手机号 */
    @ApiModelProperty(value = "绑定手机号")
    private String phone;

    /** 性别 1.男 2.女 */
    @ApiModelProperty(value = "性别 1.男 2.女")
    private String sex;

    /** 年龄 */
    @ApiModelProperty(value = "年龄")
    private String age;

    /** 签名 */
    @ApiModelProperty(value = "签名")
    private String sign;

    /** 会员类型; 1：普通会员 2：VIP会员 3：SVIP会员 */
    @ApiModelProperty(value = "会员类型; 1：普通会员 2：VIP会员 3：SVIP会员")
    private Integer vipType;

    /** 会员开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value ="会员开始时间")
    private Date vipStartTime;

    /** 会员结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value ="会员结束时间")
    private Date vipEndTime;

    /** 用户类型；1：普通用户 2：VIP用户 3：SVIP用户 */
    @ApiModelProperty(value = "用户类型；1：普通用户 2：VIP用户 3：SVIP用户")
    private Integer userType;

    /** 粉丝数 */
    @ApiModelProperty(value = "粉丝总数")
    private Integer fans;

    /** 用户关注数 */
    @ApiModelProperty(value = "关注总数")
    private Integer attention;

    /** 点赞数 */
    @ApiModelProperty(value = "点赞总数")
    private Integer likes;

    /** 排名 */
    @ApiModelProperty(value = "排名")
    private Integer rank;

}
