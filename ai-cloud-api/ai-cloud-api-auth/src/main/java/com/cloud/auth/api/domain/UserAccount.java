package com.cloud.auth.api.domain;

import java.math.BigDecimal;
import com.cloud.common.web.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户账户信息对象 user_account
 * 
 * @author ai-cloud
 */
@ApiModel("用户账户信息")
public class UserAccount extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 账户ID */
    private String id;

    /** 账户号 */
    @ApiModelProperty(value = "账户号",example = "Long")
    private Long number;

    /** 账户支付密码 */
    @ApiModelProperty(value = "账户支付密码",example = "String")
    private String password;

    /** 用户id */
    @ApiModelProperty(value = "用户id",example = "String")
    private String userId;

    /** 设备唯一标识 */
    @ApiModelProperty(value = "设备唯一标识",example = "String")
    private String uuid;

    /** 账户类型；1：余额账户 2：kb账户 */
    @ApiModelProperty(value = "账户类型；1：余额账户 2：kb账户",example = "String")
    private String type;

    /** 用户类型；1：个人  2：商家 */
    @ApiModelProperty(value = "用户类型；1：个人  2：商家",example = "String")
    private String userType;

    /** 账户等级；1：普通账户 2：金卡账户 3：铂金账户 */
    @ApiModelProperty(value = "账户等级；1：普通账户 2：金卡账户 3：铂金账户",example = "String")
    private String grade;

    /** 交易手续费比例(账户等级不同，交易手续费比例不同) */
    @ApiModelProperty(value = "交易手续费比例(账户等级不同，交易手续费比例不同)",example = "String")
    private String dealCommissionRatio;

    /** 提现手续费比例(账户等级不同，交易手续费比例不同) */
    @ApiModelProperty(value = "提现手续费比例(账户等级不同，交易手续费比例不同)",example = "String")
    private String withdrawalCommissionRatio;

    /** 日交易限额 */
    @ApiModelProperty(value = "日交易限额",example = "BigDecimal")
    private BigDecimal dailyTradingLimit;

    /** 月交易限额 */
    @ApiModelProperty(value = "月交易限额",example = "BigDecimal")
    private BigDecimal monthTradingLimit;

    /** 日提现限额 */
    @ApiModelProperty(value = "日提现限额",example = "BigDecimal")
    private BigDecimal dailyWithdrawalLimit;

    /** 月提现限额 */
    @ApiModelProperty(value = "月提现限额",example = "BigDecimal")
    private BigDecimal monthWithdrawalLimit;

    /** 账户可用余额 */
    @ApiModelProperty(value = "账户可用余额",example = "BigDecimal")
    private BigDecimal availableBalance;

    /** 账户冻结金额 */
    @ApiModelProperty(value = "账户冻结金额",example = "BigDecimal")
    private BigDecimal frozenAmount;

    /** 状态：0：启用，2：停用 */
    @ApiModelProperty(value = "状态：0：启用，2：停用",example = "Long")
    private Long statusFlag;

    /** 删除：0：未删除，2：已删除 */
    @ApiModelProperty(value = "删除：0：未删除，2：已删除",example = "Long")
    private Long deleteFlag;





    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setNumber(Long number){
        this.number = number;
    }
    public Long getNumber(){
        return number;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public String getUserId(){
        return userId;
    }
    public void setUuid(String uuid){
        this.uuid = uuid;
    }
    public String getUuid(){
        return uuid;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setUserType(String userType){
        this.userType = userType;
    }
    public String getUserType(){
        return userType;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }
    public void setDealCommissionRatio(String dealCommissionRatio){
        this.dealCommissionRatio = dealCommissionRatio;
    }
    public String getDealCommissionRatio(){
        return dealCommissionRatio;
    }
    public void setWithdrawalCommissionRatio(String withdrawalCommissionRatio){
        this.withdrawalCommissionRatio = withdrawalCommissionRatio;
    }
    public String getWithdrawalCommissionRatio(){
        return withdrawalCommissionRatio;
    }
    public void setDailyTradingLimit(BigDecimal dailyTradingLimit){
        this.dailyTradingLimit = dailyTradingLimit;
    }
    public BigDecimal getDailyTradingLimit(){
        return dailyTradingLimit;
    }
    public void setMonthTradingLimit(BigDecimal monthTradingLimit){
        this.monthTradingLimit = monthTradingLimit;
    }
    public BigDecimal getMonthTradingLimit(){
        return monthTradingLimit;
    }
    public void setDailyWithdrawalLimit(BigDecimal dailyWithdrawalLimit){
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }
    public BigDecimal getDailyWithdrawalLimit(){
        return dailyWithdrawalLimit;
    }
    public void setMonthWithdrawalLimit(BigDecimal monthWithdrawalLimit){
        this.monthWithdrawalLimit = monthWithdrawalLimit;
    }
    public BigDecimal getMonthWithdrawalLimit(){
        return monthWithdrawalLimit;
    }
    public void setAvailableBalance(BigDecimal availableBalance){
        this.availableBalance = availableBalance;
    }
    public BigDecimal getAvailableBalance(){
        return availableBalance;
    }
    public void setFrozenAmount(BigDecimal frozenAmount){
        this.frozenAmount = frozenAmount;
    }
    public BigDecimal getFrozenAmount(){
        return frozenAmount;
    }
    public void setStatusFlag(Long statusFlag){
        this.statusFlag = statusFlag;
    }
    public Long getStatusFlag(){
        return statusFlag;
    }
    public void setDeleteFlag(Long deleteFlag){
        this.deleteFlag = deleteFlag;
    }
    public Long getDeleteFlag(){
        return deleteFlag;
    }

}
