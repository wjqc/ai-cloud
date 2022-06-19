package com.cloud.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 钱包设置密码参数
 *
 * @author ai-cloud
 */
@Data
@ApiModel("钱包设置密码参数")
public class WalletSetPasswordParam {

    @ApiModelProperty(value = "旧密码(如果为未设置支付密码可为空)", example = "2")
    private String oldPassword;

    @ApiModelProperty(value = "密码", example = "2")
    private String password;

}
