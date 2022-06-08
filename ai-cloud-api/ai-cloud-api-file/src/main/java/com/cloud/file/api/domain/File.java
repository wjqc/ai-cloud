package com.cloud.file.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 文件信息
 *
 * @author ai-cloud
 */
@ApiModel("文件信息")
public class File {

    /*** 文件名称 */
    @ApiModelProperty(value = "文件名称",example = "String")
    private String name;

    /*** 文件大小 */
    @ApiModelProperty(value = "文件大小",example = "Long")
    private Long size;

    /*** 文件地址 */
    @ApiModelProperty(value = "文件地址",example = "String")
    private String url;

    public String getName() {
        return name;
    }

    public Long getSize() {
        return size;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {this.name = name;}

    public void setSize(Long size) {
        this.size = size;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
