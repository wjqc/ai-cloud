package com.cloud.user.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 账单明细信息
 *
 * @author ai-cloud
 */
@Data
@ApiModel("账单明细")
public class BillDetailDto {

    @ApiModelProperty(value = "头像", example = "1")
    private String img;

    @ApiModelProperty(value = "金额", example = "1")
    private BigDecimal amount;

    @ApiModelProperty(value = "交易类型；1：收入 2：支出", example = "1")
    private String type;

    @ApiModelProperty(value = "交易类型；1：充值 2：提现 3：消费 4：转账 5：红包 6： 退款 7：其他", example = "1")
    private String dealType;

    @ApiModelProperty(value = "交易名称", example = "1")
    private String dealName;

    @ApiModelProperty(value = "提现状态；1：待审核 2：审核通过 3：审核拒绝", example = "Long")
    private Integer status;

    @ApiModelProperty(value = "打款状态 1：待确认 2：已打款 3：拒绝打款", example = "Long")
    private Integer remitStatus;

    @ApiModelProperty(value = "提现方式；1：支付宝 2：银行卡", example = "Integer")
    private Integer belongBank;

    @ApiModelProperty(value = "开户行账号", example = "String")
    private String bankAccount;

    @ApiModelProperty(value = "开户行姓名", example = "String")
    private String bankName;

    @ApiModelProperty(value = "卡号", example = "String")
    private String bankCard;

    @ApiModelProperty(value = "支付宝账户", example = "String")
    private String alipayAccount;

    @ApiModelProperty(value = "支付宝姓名", example = "String")
    private String alipayName;

}
