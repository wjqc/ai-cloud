package com.cloud.file.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 文件信息
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("文件信息")
public class File {

    /*** 文件名称 */
    @ApiModelProperty(value = "文件名称", example = "String")
    private String name;

    /*** 文件大小 */
    @ApiModelProperty(value = "文件大小", example = "Long")
    private Long size;

    /*** 文件地址 */
    @ApiModelProperty(value = "文件地址", example = "String")
    private String url;

}
