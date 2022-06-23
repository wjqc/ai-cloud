package com.cloud.auth.api.domain;

import com.cloud.common.web.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 参数配置对象 user_config
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("参数配置")
public class UserConfig extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 参数ID
     */
    private String id;

    /**
     * 参数名称
     */
    @ApiModelProperty(value = "参数名称", example = "String")
    private String configName;

    /**
     * 参数键名
     */
    @ApiModelProperty(value = "参数键名", example = "String")
    private String configKey;

    /**
     * 参数键值
     */
    @ApiModelProperty(value = "参数键值", example = "String")
    private String configValue;

    /**
     * 系统内置（Y是 N否）
     */
    @ApiModelProperty(value = "系统内置", example = "String")
    private String configType;

}
