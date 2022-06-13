package com.cloud.user.domain;

import java.math.BigDecimal;
import com.cloud.common.web.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用户账户明细记录对象 user_account_detail
 * 
 * @author ai-cloud
 */
@ApiModel("用户账户明细记录")
@TableName("user_account_detail")
public class UserAccountDetail extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 交易记录id */
    private String id;

    /** 账户id */
    @TableField("account_id")
    @ApiModelProperty(value = "账户id",example = "String")
    private String accountId;

    /** 账户号 */
    @TableField("account_number")
    @ApiModelProperty(value = "账户号",example = "Long")
    private Long accountNumber;

    /** 账户类型；1：余额账户  2：kb账户 */
    @TableField("account_type")
    @ApiModelProperty(value = "账户类型；1：余额账户  2：kb账户",example = "String")
    private String accountType;

    /** 记录类型；1：收入 2：支出 */
    @TableField("type")
    @ApiModelProperty(value = "记录类型；1：收入 2：支出",example = "String")
    private String type;

    /** 收款方类型 */
    @TableField("debit_type")
    @ApiModelProperty(value = "收款方类型",example = "String")
    private String debitType;

    /** 收款方账户号 */
    @TableField("debit_number")
    @ApiModelProperty(value = "收款方账户号",example = "Long")
    private Long debitNumber;

    /** 收款方手机号 */
    @TableField("debit_phone")
    @ApiModelProperty(value = "收款方手机号",example = "String")
    private String debitPhone;

    /** 付款方类型 */
    @TableField("credit_type")
    @ApiModelProperty(value = "付款方类型",example = "String")
    private String creditType;

    /** 付款方账户号 */
    @TableField("credit_number")
    @ApiModelProperty(value = "付款方账户号",example = "Long")
    private Long creditNumber;

    /** 付款方手机号 */
    @TableField("credit_phone")
    @ApiModelProperty(value = "付款方手机号",example = "String")
    private String creditPhone;

    /** 交易金额 */
    @TableField("order_price")
    @ApiModelProperty(value = "交易金额",example = "BigDecimal")
    private BigDecimal orderPrice;

    /** 交易前账户可用余额 */
    @TableField("before_available_balance")
    @ApiModelProperty(value = "交易前账户可用余额",example = "BigDecimal")
    private BigDecimal beforeAvailableBalance;

    /** 交易后账户可用余额 */
    @TableField("after_available_balance")
    @ApiModelProperty(value = "交易后账户可用余额",example = "BigDecimal")
    private BigDecimal afterAvailableBalance;

    /** 交易名称 */
    @TableField("deal_name")
    @ApiModelProperty(value = "交易名称",example = "String")
    private String dealName;

    /** 订单号 */
    @TableField("order_number")
    @ApiModelProperty(value = "订单号",example = "String")
    private String orderNumber;

    /** 交易流水号 */
    @TableField("deal_serial_number")
    @ApiModelProperty(value = "交易流水号",example = "String")
    private String dealSerialNumber;

    /** 第三方交易流水号 */
    @TableField("merchant_serial_number")
    @ApiModelProperty(value = "第三方交易流水号",example = "String")
    private String merchantSerialNumber;

    /** 备注 */
    @TableField("remarks")
    @ApiModelProperty(value = "备注",example = "String")
    private String remarks;

    /** 图像 */
    @TableField("img")
    @ApiModelProperty(value = "图像",example = "String")
    private String img;

    /** 手续费 */
    @TableField("service_charge")
    @ApiModelProperty(value = "手续费",example = "String")
    private String serviceCharge;

    /** 交易类型；1：充值 2：提现 3：消费 4：转账 5：红包 6： 退款 7：其他 */
    @TableField("deal_type")
    @ApiModelProperty(value = "交易类型；1：充值 2：提现 3：消费 4：转账 5：红包 6： 退款 7：其他",example = "String")
    private String dealType;

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
    public void setAccountId(String accountId){
        this.accountId = accountId;
    }
    public String getAccountId(){
        return accountId;
    }
    public void setAccountNumber(Long accountNumber){
        this.accountNumber = accountNumber;
    }
    public Long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public String getAccountType(){
        return accountType;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setDebitType(String debitType){
        this.debitType = debitType;
    }
    public String getDebitType(){
        return debitType;
    }
    public void setDebitNumber(Long debitNumber){
        this.debitNumber = debitNumber;
    }
    public Long getDebitNumber(){
        return debitNumber;
    }
    public void setDebitPhone(String debitPhone){
        this.debitPhone = debitPhone;
    }
    public String getDebitPhone(){
        return debitPhone;
    }
    public void setCreditType(String creditType){
        this.creditType = creditType;
    }
    public String getCreditType(){
        return creditType;
    }
    public void setCreditNumber(Long creditNumber){
        this.creditNumber = creditNumber;
    }
    public Long getCreditNumber(){
        return creditNumber;
    }
    public void setCreditPhone(String creditPhone){
        this.creditPhone = creditPhone;
    }
    public String getCreditPhone(){
        return creditPhone;
    }
    public void setOrderPrice(BigDecimal orderPrice){
        this.orderPrice = orderPrice;
    }
    public BigDecimal getOrderPrice(){
        return orderPrice;
    }
    public void setBeforeAvailableBalance(BigDecimal beforeAvailableBalance){
        this.beforeAvailableBalance = beforeAvailableBalance;
    }
    public BigDecimal getBeforeAvailableBalance(){
        return beforeAvailableBalance;
    }
    public void setAfterAvailableBalance(BigDecimal afterAvailableBalance){
        this.afterAvailableBalance = afterAvailableBalance;
    }
    public BigDecimal getAfterAvailableBalance(){
        return afterAvailableBalance;
    }
    public void setDealName(String dealName){
        this.dealName = dealName;
    }
    public String getDealName(){
        return dealName;
    }
    public void setOrderNumber(String orderNumber){
        this.orderNumber = orderNumber;
    }
    public String getOrderNumber(){
        return orderNumber;
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
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }
    public String getRemarks(){
        return remarks;
    }
    public void setImg(String img){
        this.img = img;
    }
    public String getImg(){
        return img;
    }
    public void setServiceCharge(String serviceCharge){
        this.serviceCharge = serviceCharge;
    }
    public String getServiceCharge(){
        return serviceCharge;
    }
    public void setDealType(String dealType){
        this.dealType = dealType;
    }
    public String getDealType(){
        return dealType;
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
            .append("accountId", getAccountId())
            .append("accountNumber", getAccountNumber())
            .append("accountType", getAccountType())
            .append("type", getType())
            .append("debitType", getDebitType())
            .append("debitNumber", getDebitNumber())
            .append("debitPhone", getDebitPhone())
            .append("creditType", getCreditType())
            .append("creditNumber", getCreditNumber())
            .append("creditPhone", getCreditPhone())
            .append("orderPrice", getOrderPrice())
            .append("beforeAvailableBalance", getBeforeAvailableBalance())
            .append("afterAvailableBalance", getAfterAvailableBalance())
            .append("dealName", getDealName())
            .append("orderNumber", getOrderNumber())
            .append("dealSerialNumber", getDealSerialNumber())
            .append("merchantSerialNumber", getMerchantSerialNumber())
            .append("remarks", getRemarks())
            .append("img", getImg())
            .append("serviceCharge", getServiceCharge())
            .append("dealType", getDealType())
            .append("deleteFlag", getDeleteFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
