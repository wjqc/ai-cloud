package com.cloud.user.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.cloud.common.web.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户随机信息对象 user_mock_data
 *
 * @author ai-cloud
 */
@ApiModel("用户随机信息")
@TableName("user_mock_data")
public class UserMockData extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 类型：1：昵称 2：头像
     */
    @ApiModelProperty(value = "类型：1：昵称 2：头像", example = "Long")
    private Integer type;

    /**
     * 昵称或者头像值
     */
    @ApiModelProperty(value = "昵称或者头像值", example = "String")
    private String value;

    /**
     * 状态：0：启用，2：停用
     */
    @ApiModelProperty(value = "状态：0：启用，2：停用", example = "Long")
    private Long statusFlag;

    /**
     * 删除：0：未删除，2：已删除
     */
    @ApiModelProperty(value = "删除：0：未删除，2：已删除", example = "Long")
    private Long deleteFlag;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setStatusFlag(Long statusFlag) {
        this.statusFlag = statusFlag;
    }

    public Long getStatusFlag() {
        return statusFlag;
    }

    public void setDeleteFlag(Long deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Long getDeleteFlag() {
        return deleteFlag;
    }

}
