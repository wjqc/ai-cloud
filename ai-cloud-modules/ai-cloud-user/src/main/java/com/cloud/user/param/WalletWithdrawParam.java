package com.cloud.user.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 提现申请参数
 *
 * @author ai-cloud
 */
@Data
@ApiModel("提现申请参数")
public class WalletWithdrawParam {

    @ApiModelProperty(value = "金额", example = "1")
    private BigDecimal amount;

    @ApiModelProperty(value = "提现方式；1：支付宝 2：银行卡", example = "1")
    private Integer type;

    @ApiModelProperty(value = "支付密码", example = "1")
    private String password;

}
