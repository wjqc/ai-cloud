package com.cloud.user.domain;

import com.cloud.common.web.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 参数配置对象 user_config
 * 
 * @author ai-cloud
 * @date 2022-05-20
 */
@ApiModel("参数配置")
@TableName("user_config")
public class UserConfig extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 参数id */
    private String id;

    /** 参数名称 */
    @TableField("config_name")
    @ApiModelProperty(value = "参数名称",example = "String")
    private String configName;

    /** 参数键名 */
    @TableField("config_key")
    @ApiModelProperty(value = "参数键名",example = "String")
    private String configKey;

    /** 参数键值 */
    @TableField("config_value")
    @ApiModelProperty(value = "参数键值",example = "String")
    private String configValue;

    /** 系统内置（Y是 N否） */
    @TableField("config_type")
    @ApiModelProperty(value = "系统内置",example = "String")
    private String configType;


    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setConfigName(String configName){
        this.configName = configName;
    }
    public String getConfigName(){
        return configName;
    }
    public void setConfigKey(String configKey){
        this.configKey = configKey;
    }
    public String getConfigKey(){
        return configKey;
    }
    public void setConfigValue(String configValue){
        this.configValue = configValue;
    }
    public String getConfigValue(){
        return configValue;
    }
    public void setConfigType(String configType){
        this.configType = configType;
    }
    public String getConfigType(){
        return configType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("configName", getConfigName())
            .append("configKey", getConfigKey())
            .append("configValue", getConfigValue())
            .append("configType", getConfigType())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
