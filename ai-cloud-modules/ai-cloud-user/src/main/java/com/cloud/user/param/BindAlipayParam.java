package com.cloud.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 绑定支付宝参数
 *
 * @author ai-cloud
 */
@Data
@ApiModel("绑定支付宝参数")
public class BindAlipayParam {

    @ApiModelProperty(value = "支付宝账号", example = "13888888888")
    private String alipayAccount;

    @ApiModelProperty(value = "支付宝认证姓名", example = "小公举")
    private String alipayName;

    @ApiModelProperty(value = "设备deviceId", example = "e1e4c24876514fc999d043ae0f496752")
    private String deviceId;

}
