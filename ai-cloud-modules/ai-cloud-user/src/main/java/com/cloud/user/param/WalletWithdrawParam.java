package com.cloud.user.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel("提现参数")
public class WalletWithdrawParam {

    /**
     * 金额
     */
    @ApiModelProperty(value = "金额", example = "1")
    private BigDecimal amount;

    /**
     * 提现方式
     */
    @ApiModelProperty(value = "提现方式；1：支付宝 2：银行卡", example = "1")
    private Integer type;

    /**
     * password
     */
    @ApiModelProperty(value = "支付密码", example = "1")
    private String password;

}
