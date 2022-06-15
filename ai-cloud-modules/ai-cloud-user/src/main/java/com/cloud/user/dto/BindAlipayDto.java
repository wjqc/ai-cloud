package com.cloud.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 绑定支付宝信息
 *
 * @author ai-cloud
 */
@Data
@ApiModel("绑定支付宝信息")
public class BindAlipayDto {

    @ApiModelProperty(value = "支付宝账号", example = "String")
    private String alipayAccount;

    @ApiModelProperty(value = "支付宝认证姓名", example = "String")
    private String alipayName;

}
