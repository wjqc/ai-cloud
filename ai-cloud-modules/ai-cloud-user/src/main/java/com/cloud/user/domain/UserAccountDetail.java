package com.cloud.user.domain;

import com.cloud.common.web.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 用户账户明细记录对象 user_account_detail
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("用户账户明细记录")
public class UserAccountDetail extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 交易记录id
     */
    private String id;

    /**
     * 账户id
     */
    @ApiModelProperty(value = "账户id", example = "String")
    private String accountId;

    /**
     * 账户号
     */
    @ApiModelProperty(value = "账户号", example = "Long")
    private Long accountNumber;

    /**
     * 账户类型；1：余额账户  2：kb账户
     */
    @ApiModelProperty(value = "账户类型；1：余额账户  2：kb账户", example = "String")
    private String accountType;

    /**
     * 记录类型；1：收入 2：支出
     */
    @ApiModelProperty(value = "记录类型；1：收入 2：支出", example = "String")
    private String type;

    /**
     * 收款方类型
     */
    @ApiModelProperty(value = "收款方类型", example = "String")
    private String debitType;

    /**
     * 收款方账户号
     */
    @ApiModelProperty(value = "收款方账户号", example = "Long")
    private Long debitNumber;

    /**
     * 收款方手机号
     */
    @ApiModelProperty(value = "收款方手机号", example = "String")
    private String debitPhone;

    /**
     * 付款方类型
     */
    @ApiModelProperty(value = "付款方类型", example = "String")
    private String creditType;

    /**
     * 付款方账户号
     */
    @ApiModelProperty(value = "付款方账户号", example = "Long")
    private Long creditNumber;

    /**
     * 付款方手机号
     */
    @ApiModelProperty(value = "付款方手机号", example = "String")
    private String creditPhone;

    /**
     * 交易金额
     */
    @ApiModelProperty(value = "交易金额", example = "BigDecimal")
    private BigDecimal orderPrice;

    /**
     * 交易前账户可用余额
     */
    @ApiModelProperty(value = "交易前账户可用余额", example = "BigDecimal")
    private BigDecimal beforeAvailableBalance;

    /**
     * 交易后账户可用余额
     */
    @ApiModelProperty(value = "交易后账户可用余额", example = "BigDecimal")
    private BigDecimal afterAvailableBalance;

    /**
     * 交易名称
     */
    @ApiModelProperty(value = "交易名称", example = "String")
    private String dealName;

    /**
     * 订单号
     */
    @ApiModelProperty(value = "订单号", example = "String")
    private String orderNumber;

    /**
     * 交易流水号
     */
    @ApiModelProperty(value = "交易流水号", example = "String")
    private String dealSerialNumber;

    /**
     * 第三方交易流水号
     */
    @ApiModelProperty(value = "第三方交易流水号", example = "String")
    private String merchantSerialNumber;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", example = "String")
    private String remarks;

    /**
     * 图像
     */
    @ApiModelProperty(value = "图像", example = "String")
    private String img;

    /**
     * 手续费
     */
    @ApiModelProperty(value = "手续费", example = "String")
    private String serviceCharge;

    /**
     * 交易类型；1：充值 2：提现 3：消费 4：转账 5：红包 6： 退款 7：其他
     */
    @ApiModelProperty(value = "交易类型；1：充值 2：提现 3：消费 4：转账 5：红包 6： 退款 7：其他", example = "String")
    private String dealType;

    /**
     * 删除：0：未删除，2：已删除
     */
    @ApiModelProperty(value = "删除：0：未删除，2：已删除", example = "Long")
    private Long deleteFlag;

}
