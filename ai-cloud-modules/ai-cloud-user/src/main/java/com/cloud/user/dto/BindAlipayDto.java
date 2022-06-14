package com.cloud.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("绑定支付宝信息")
public class BindAlipayDto {

    /**
     * 支付宝账号
     */
    @ApiModelProperty(value = "支付宝账号", example = "String")
    private String alipayAccount;

    /**
     * 支付宝认证姓名
     */
    @ApiModelProperty(value = "支付宝认证姓名", example = "String")
    private String alipayName;
}
