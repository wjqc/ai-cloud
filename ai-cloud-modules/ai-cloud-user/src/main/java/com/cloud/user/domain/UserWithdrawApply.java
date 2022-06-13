package com.cloud.user.domain;

import java.math.BigDecimal;
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
 * 用户提现申请记录对象 user_withdraw_log
 * 
 * @author ai-cloud
 */
@ApiModel("用户提现申请记录")
@TableName("user_withdraw_log")
public class UserWithdrawApply extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 提现记录id */
    private String id;

    /** 用户id */
    @TableField("user_id")
    @ApiModelProperty(value = "用户id",example = "String")
    private String userId;

    /** 设备唯一标示 */
    @TableField("device_id")
    @ApiModelProperty(value = "设备唯一标示",example = "String")
    private String deviceId;

    /** 提现方式；1：支付宝 2：银行卡 */
    @TableField("belong_bank")
    @ApiModelProperty(value = "提现方式；1：支付宝 2：银行卡",example = "String")
    private String belongBank;

    /** 开户行姓名 */
    @TableField("bank_name")
    @ApiModelProperty(value = "开户行姓名",example = "String")
    private String bankName;

    /** 开户行账号 */
    @TableField("bank_account")
    @ApiModelProperty(value = "开户行账号",example = "String")
    private String bankAccount;

    /** 卡号 */
    @TableField("bank_card")
    @ApiModelProperty(value = "卡号",example = "String")
    private String bankCard;

    /** 支付宝账户 */
    @TableField("alipay_account")
    @ApiModelProperty(value = "支付宝账户",example = "String")
    private String alipayAccount;

    /** 支付宝姓名 */
    @TableField("alipay_name")
    @ApiModelProperty(value = "支付宝姓名",example = "String")
    private String alipayName;

    /** 提现金额 */
    @TableField("amount")
    @ApiModelProperty(value = "提现金额",example = "BigDecimal")
    private BigDecimal amount;

    /** 交易流水号 */
    @TableField("deal_serial_number")
    @ApiModelProperty(value = "交易流水号",example = "String")
    private String dealSerialNumber;

    /** 商户流水号 */
    @TableField("merchant_serial_number")
    @ApiModelProperty(value = "商户流水号",example = "String")
    private String merchantSerialNumber;

    /** 提现手续费 */
    @TableField("service_charge")
    @ApiModelProperty(value = "提现手续费",example = "String")
    private String serviceCharge;

    /** 结算账金额 */
    @TableField("settlement_amount")
    @ApiModelProperty(value = "结算账金额",example = "String")
    private String settlementAmount;

    /** 提现状态；1：待审核 2：审核通过 3：审核拒绝 */
    @TableField("status")
    @ApiModelProperty(value = "提现状态；1：待审核 2：审核通过 3：审核拒绝",example = "Long")
    private Long status;

    /** 打款状态 1：待确认 2：已打款 3：拒绝打款 */
    @TableField("remit_status")
    @ApiModelProperty(value = "打款状态 1：待确认 2：已打款 3：拒绝打款",example = "Long")
    private Long remitStatus;

    /** 申请时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("apply_time")
    @ApiModelProperty(value ="申请时间",example = "Date")
    private Date applyTime;

    /** 审核通过时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("accept_apply_time")
    @ApiModelProperty(value ="审核通过时间",example = "Date")
    private Date acceptApplyTime;

    /** 审核通过扣款流水号（冗余） */
    @TableField("accept_apply_serial_number")
    @ApiModelProperty(value = "审核通过扣款流水号",example = "String")
    private String acceptApplySerialNumber;

    /** 确认打款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("remit_time")
    @ApiModelProperty(value ="确认打款时间",example = "Date")
    private Date remitTime;

    /** 确认打款交易流水号(冗余) */
    @TableField("remit_serial_number")
    @ApiModelProperty(value = "确认打款交易流水号(冗余)",example = "String")
    private String remitSerialNumber;

    /** 外部汇款凭证号 */
    @TableField("other_number")
    @ApiModelProperty(value = "外部汇款凭证号",example = "String")
    private String otherNumber;

    /** 审核/打款 拒绝时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("refuse_apply_time")
    @ApiModelProperty(value ="审核/打款 拒绝时间",example = "Date")
    private Date refuseApplyTime;

    /** 打款拒绝退款流水号 */
    @TableField("refuse_serial_number")
    @ApiModelProperty(value = "打款拒绝退款流水号",example = "String")
    private String refuseSerialNumber;

    /** 备注 */
    @TableField("remarks")
    @ApiModelProperty(value = "备注",example = "String")
    private String remarks;

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
    public void setBelongBank(String belongBank){
        this.belongBank = belongBank;
    }
    public String getBelongBank(){
        return belongBank;
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
    public void setBankCard(String bankCard){
        this.bankCard = bankCard;
    }
    public String getBankCard(){
        return bankCard;
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
    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }
    public BigDecimal getAmount(){
        return amount;
    }
    public void setDealSerialNumber(String dealSerialNumber){
        this.dealSerialNumber = dealSerialNumber;
    }
    public String getDealSerialNumber(){
        return dealSerialNumber;
    }
    public void setMerchantSerialNumber(String merchantSerialNumber){
        this.merchantSerialNumber = merchantSerialNumber;
    }
    public String getMerchantSerialNumber(){
        return merchantSerialNumber;
    }
    public void setServiceCharge(String serviceCharge){
        this.serviceCharge = serviceCharge;
    }
    public String getServiceCharge(){
        return serviceCharge;
    }
    public void setSettlementAmount(String settlementAmount){
        this.settlementAmount = settlementAmount;
    }
    public String getSettlementAmount(){
        return settlementAmount;
    }
    public void setStatus(Long status){
        this.status = status;
    }
    public Long getStatus(){
        return status;
    }
    public void setRemitStatus(Long remitStatus){
        this.remitStatus = remitStatus;
    }
    public Long getRemitStatus(){
        return remitStatus;
    }
    public void setApplyTime(Date applyTime){
        this.applyTime = applyTime;
    }
    public Date getApplyTime(){
        return applyTime;
    }
    public void setAcceptApplyTime(Date acceptApplyTime){
        this.acceptApplyTime = acceptApplyTime;
    }
    public Date getAcceptApplyTime(){
        return acceptApplyTime;
    }
    public void setAcceptApplySerialNumber(String acceptApplySerialNumber){
        this.acceptApplySerialNumber = acceptApplySerialNumber;
    }
    public String getAcceptApplySerialNumber(){
        return acceptApplySerialNumber;
    }
    public void setRemitTime(Date remitTime){
        this.remitTime = remitTime;
    }
    public Date getRemitTime(){
        return remitTime;
    }
    public void setRemitSerialNumber(String remitSerialNumber){
        this.remitSerialNumber = remitSerialNumber;
    }
    public String getRemitSerialNumber(){
        return remitSerialNumber;
    }
    public void setOtherNumber(String otherNumber){
        this.otherNumber = otherNumber;
    }
    public String getOtherNumber(){
        return otherNumber;
    }
    public void setRefuseApplyTime(Date refuseApplyTime){
        this.refuseApplyTime = refuseApplyTime;
    }
    public Date getRefuseApplyTime(){
        return refuseApplyTime;
    }
    public void setRefuseSerialNumber(String refuseSerialNumber){
        this.refuseSerialNumber = refuseSerialNumber;
    }
    public String getRefuseSerialNumber(){
        return refuseSerialNumber;
    }
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }
    public String getRemarks(){
        return remarks;
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
            .append("bankName", getBankName())
            .append("bankAccount", getBankAccount())
            .append("bankCard", getBankCard())
            .append("alipayAccount", getAlipayAccount())
            .append("alipayName", getAlipayName())
            .append("amount", getAmount())
            .append("dealSerialNumber", getDealSerialNumber())
            .append("merchantSerialNumber", getMerchantSerialNumber())
            .append("serviceCharge", getServiceCharge())
            .append("settlementAmount", getSettlementAmount())
            .append("status", getStatus())
            .append("remitStatus", getRemitStatus())
            .append("applyTime", getApplyTime())
            .append("acceptApplyTime", getAcceptApplyTime())
            .append("acceptApplySerialNumber", getAcceptApplySerialNumber())
            .append("remitTime", getRemitTime())
            .append("remitSerialNumber", getRemitSerialNumber())
            .append("otherNumber", getOtherNumber())
            .append("refuseApplyTime", getRefuseApplyTime())
            .append("refuseSerialNumber", getRefuseSerialNumber())
            .append("remarks", getRemarks())
            .append("deleteFlag", getDeleteFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
