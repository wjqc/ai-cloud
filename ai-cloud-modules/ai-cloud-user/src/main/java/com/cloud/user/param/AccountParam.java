package com.cloud.user.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("创建账户参数")
public class AccountParam {

    /** 用户id */
    @ApiModelProperty(value = "用户id",example = "String")
    private String userId;

    /** 设备唯一标识 */
    @ApiModelProperty(value = "设备唯一标识",example = "String")
    private String uuid;

    /** 账户类型；1：余额账户 2：kb账户 */
    @ApiModelProperty(value = "账户类型；1：余额账户 2：kb账户",example = "String")
    private String type;

}
