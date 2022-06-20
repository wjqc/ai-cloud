package com.cloud.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 * 钱包设置密码参数
 *
 * @author ai-cloud
 */
@Data
@Getter
@Setter
@ApiModel("钱包设置密码参数")
public class WalletSetPasswordParam {

    @ApiModelProperty(value = "旧密码(如果为未设置支付密码可为空)", example = "123456")
    private String oldPassword;

    @ApiModelProperty(value = "密码", example = "654321")
    private String password;

}
