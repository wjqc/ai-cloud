package com.cloud.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("绑定银行卡信息")
public class BindBankDto {

    /** 姓名 */
    @ApiModelProperty(value = "姓名", example = "String")
    private String bankName;

    /** 卡号 */
    @ApiModelProperty(value = "卡号", example = "String")
    private String bankCard;

    /** 开户行名称 */
    @ApiModelProperty(value = "开户行名称", example = "String")
    private String bankAccount;

}