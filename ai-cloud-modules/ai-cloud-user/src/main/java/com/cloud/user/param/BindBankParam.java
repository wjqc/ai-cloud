package com.cloud.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 绑定银行卡参数
 *
 * @author ai-cloud
 */
@Data
@ApiModel("绑定银行卡参数")
public class BindBankParam {

    @ApiModelProperty(value = "银行卡开户账户(姓名)", example = "小宝贝")
    private String bankAccount;

    @ApiModelProperty(value = "卡号", example = "6888888888888888888")
    private String bankCard;

    @ApiModelProperty(value = "开户行名称", example = "中国银行")
    private String bankName;

    @ApiModelProperty(value = "设备deviceId", example = "e1e4c24876514fc999d043ae0f496752")
    private String deviceId;

}
