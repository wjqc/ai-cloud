package com.cloud.user.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 账单请求参数
 *
 * @author ai-cloud
 */
@Data
@Getter
@Setter
@ApiModel("账单请求参数")
public class WalletBillDetailParam {

    @ApiModelProperty(value = "String", example = "e1e4c24876514fc999d043ae0f496752")
    private String detailId;

}
