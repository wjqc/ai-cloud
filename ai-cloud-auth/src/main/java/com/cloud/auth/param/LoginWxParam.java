package com.cloud.auth.param;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 微信授权登录请求参数
 *
 * @author ai-cloud
 */
@Data
@Getter
@Setter
@ApiModel("微信授权登录请求参数")
public class LoginWxParam extends BaseParam {

}
