package com.cloud.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("绑定银行卡参数")
public class BindBankParam {

    /**
     * 银行卡开户账户(姓名)
     */
    @ApiModelProperty(value = "银行卡开户账户(姓名)", example = "小宝贝")
    private String bankAccount;

    /**
     * 卡号
     */
    @ApiModelProperty(value = "卡号", example = "6888888888888888888")
    private String bankCard;

    /**
     * 开户行名称
     */
    @ApiModelProperty(value = "开户行名称", example = "中国银行")
    private String bankName;

    /**
     * 用户设备唯一标识
     */
    @ApiModelProperty(value = "设备deviceId", example = "e1e4c24876514fc999d043ae0f496752")
    private String deviceId;
}
