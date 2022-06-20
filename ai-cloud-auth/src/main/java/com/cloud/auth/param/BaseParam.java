package com.cloud.auth.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 请求公共参数
 *
 * @author ai-cloud
 */
@Data
@Getter
@Setter
@ApiModel("请求公共参数")
public class BaseParam {

    @ApiModelProperty(value = "设备deviceId", example = "e1e4c24876514fc999d043ae0f496752")
    private String deviceId;

}
