package com.cloud.user.domain;

import java.util.Date;

import com.cloud.common.web.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用户绑定银行卡或支付宝对象 user_bind
 * 
 * @author ai-cloud
 * @date 2022-06-09
 */
@ApiModel("用户绑定银行卡或支付宝")
@TableName("user_bind")
public class UserBind extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 用户id */
    @TableField("user_id")
    @ApiModelProperty(value = "用户id",example = "String")
    private String userId;

    /** 设备唯一标识 */
    @TableField("device_id")
    @ApiModelProperty(value = "设备唯一标识",example = "String")
    private String deviceId;

    /** 所属银行；1：支付宝 2：银行卡 */
    @TableField("belong_bank")
    @ApiModelProperty(value = "所属银行；1：支付宝 2：银行卡",example = "Long")
    private Long belongBank;

    /** 银行卡卡号 */
    @TableField("bank_card")
    @ApiModelProperty(value = "银行卡卡号",example = "String")
    private String bankCard;

    /** 银行卡开户行名称 如:工商银行 */
    @TableField("bank_name")
    @ApiModelProperty(value = "银行卡开户行名称 如:工商银行",example = "String")
    private String bankName;

    /** 银行卡开户账户 */
    @TableField("bank_account")
    @ApiModelProperty(value = "银行卡开户账户",example = "String")
    private String bankAccount;

    /** 支付宝账号 */
    @TableField("alipay_account")
    @ApiModelProperty(value = "支付宝账号",example = "String")
    private String alipayAccount;

    /** 支付宝认证姓名 */
    @TableField("alipay_name")
    @ApiModelProperty(value = "支付宝认证姓名",example = "String")
    private String alipayName;

    /** 绑定时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("bind_time")
    @ApiModelProperty(value ="绑定时间",example = "Date")
    private Date bindTime;

    /** 状态：0：启用，2：停用 */
    @TableField("status_flag")
    @ApiModelProperty(value = "状态：0：启用，2：停用",example = "Long")
    private Long statusFlag;

    /** 删除：0：未删除，2：已删除 */
    @TableField("delete_flag")
    @ApiModelProperty(value = "删除：0：未删除，2：已删除",example = "Long")
    private Long deleteFlag;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public String getUserId(){
        return userId;
    }
    public void setDeviceId(String deviceId){
        this.deviceId = deviceId;
    }
    public String getDeviceId(){
        return deviceId;
    }
    public void setBelongBank(Long belongBank){
        this.belongBank = belongBank;
    }
    public Long getBelongBank(){
        return belongBank;
    }
    public void setBankCard(String bankCard){
        this.bankCard = bankCard;
    }
    public String getBankCard(){
        return bankCard;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }
    public String getBankName(){
        return bankName;
    }
    public void setBankAccount(String bankAccount){
        this.bankAccount = bankAccount;
    }
    public String getBankAccount(){
        return bankAccount;
    }
    public void setAlipayAccount(String alipayAccount){
        this.alipayAccount = alipayAccount;
    }
    public String getAlipayAccount(){
        return alipayAccount;
    }
    public void setAlipayName(String alipayName){
        this.alipayName = alipayName;
    }
    public String getAlipayName(){
        return alipayName;
    }
    public void setBindTime(Date bindTime){
        this.bindTime = bindTime;
    }
    public Date getBindTime(){
        return bindTime;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("deviceId", getDeviceId())
            .append("belongBank", getBelongBank())
            .append("bankCard", getBankCard())
            .append("bankName", getBankName())
            .append("bankAccount", getBankAccount())
            .append("alipayAccount", getAlipayAccount())
            .append("alipayName", getAlipayName())
            .append("bindTime", getBindTime())
            .append("statusFlag", getStatusFlag())
            .append("deleteFlag", getDeleteFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
