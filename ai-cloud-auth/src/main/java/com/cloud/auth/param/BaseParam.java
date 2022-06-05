package com.cloud.auth.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("请求公共参数")
public class BaseParam {

    /** 设备uuid */
    @ApiModelProperty(value = "设备uuid", example = "e1e4c24876514fc999d043ae0f496752")
    private String uuid;

    /** deviceId */
    @ApiModelProperty(value = "设备deviceId", example = "e1e4c24876514fc999d043ae0f496752")
    private String deviceId;

}
