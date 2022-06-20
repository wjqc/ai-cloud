package com.cloud.auth.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 手机验证码请求参数
 *
 * @author ai-cloud
 */
@Data
@Getter
@Setter
@ApiModel("手机验证码请求参数")
public class VerifyCodeParam extends BaseParam {

    @ApiModelProperty(value = "电话号码", example = "13800138000")
    private String phone;

    @ApiModelProperty(value = "区号", example = "86")
    private String zone;

    @ApiModelProperty(value = "验证码", example = "124454")
    private String code;

}

