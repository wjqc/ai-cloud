package com.cloud.auth.api.domain;

import com.cloud.common.web.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 用户账户信息对象 user_account
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("用户账户信息")
public class UserAccount extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 账户ID
     */
    private String id;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id", example = "String")
    private String userId;

    /**
     * 用户设备唯一标识
     */
    @ApiModelProperty(value = "用户设备唯一标识", example = "String")
    private String deviceId;

    /**
     * 账户支付密码
     */
    @ApiModelProperty(value = "账户支付密码", example = "String")
    private String password;

    /**
     * 支付密码加密盐
     */
    @ApiModelProperty(value = "支付密码加密盐", example = "String")
    private String salt;

    /**
     * 账户号
     */
    @ApiModelProperty(value = "账户号", example = "Long")
    private Long number;

    /**
     * 账户类型；1：余额账户 2：kb账户
     */
    @ApiModelProperty(value = "账户类型；1：余额账户 2：kb账户", example = "String")
    private String type;

    /**
     * 用户类型；1：个人  2：商家
     */
    @ApiModelProperty(value = "用户类型；1：个人  2：商家", example = "String")
    private String userType;

    /**
     * 账户等级；1：普通账户 2：金卡账户 3：铂金账户
     */
    @ApiModelProperty(value = "账户等级；1：普通账户 2：金卡账户 3：铂金账户", example = "String")
    private String grade;

    /**
     * 交易手续费比例(账户等级不同，交易手续费比例不同)
     */
    @ApiModelProperty(value = "交易手续费比例(账户等级不同，交易手续费比例不同)", example = "String")
    private String dealCommissionRatio;

    /**
     * 提现手续费比例(账户等级不同，交易手续费比例不同)
     */
    @ApiModelProperty(value = "提现手续费比例(账户等级不同，交易手续费比例不同)", example = "String")
    private String withdrawalCommissionRatio;

    /**
     * 日交易限额
     */
    @ApiModelProperty(value = "日交易限额", example = "BigDecimal")
    private BigDecimal dailyTradingLimit;

    /**
     * 月交易限额
     */
    @ApiModelProperty(value = "月交易限额", example = "BigDecimal")
    private BigDecimal monthTradingLimit;

    /**
     * 日提现限额
     */
    @ApiModelProperty(value = "日提现限额", example = "BigDecimal")
    private BigDecimal dailyWithdrawalLimit;

    /**
     * 月提现限额
     */
    @ApiModelProperty(value = "月提现限额", example = "BigDecimal")
    private BigDecimal monthWithdrawalLimit;

    /**
     * 账户可用余额
     */
    @ApiModelProperty(value = "账户可用余额", example = "BigDecimal")
    private BigDecimal availableBalance;

    /**
     * 账户冻结金额
     */
    @ApiModelProperty(value = "账户冻结金额", example = "BigDecimal")
    private BigDecimal frozenAmount;

    /**
     * 状态：0：启用，2：停用
     */
    @ApiModelProperty(value = "状态：0：启用，2：停用", example = "Long")
    private Long statusFlag;

    /**
     * 删除：0：未删除，2：已删除
     */
    @ApiModelProperty(value = "删除：0：未删除，2：已删除", example = "Long")
    private Long deleteFlag;


}
