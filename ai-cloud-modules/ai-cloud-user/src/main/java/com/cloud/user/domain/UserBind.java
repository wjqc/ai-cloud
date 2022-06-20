package com.cloud.user.domain;

import com.cloud.common.web.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 用户绑定银行卡或支付宝对象 user_bind
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("用户绑定银行卡或支付宝")
public class UserBind extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id", example = "String")
    private String userId;

    /**
     * 设备唯一标识
     */
    @ApiModelProperty(value = "设备唯一标识", example = "String")
    private String deviceId;

    /**
     * 所属银行；1：支付宝 2：银行卡
     */
    @ApiModelProperty(value = "所属银行；1：支付宝 2：银行卡", example = "Long")
    private Integer belongBank;

    /**
     * 银行卡卡号
     */
    @ApiModelProperty(value = "银行卡卡号", example = "String")
    private String bankCard;

    /**
     * 银行卡开户行名称 如:工商银行
     */
    @ApiModelProperty(value = "银行卡开户行名称 如:工商银行", example = "String")
    private String bankName;

    /**
     * 银行卡开户账户
     */
    @ApiModelProperty(value = "银行卡开户账户", example = "String")
    private String bankAccount;

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

    /**
     * 绑定时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "绑定时间", example = "Date")
    private Date bindTime;

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
