package com.cloud.common.web.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 分页数据对象
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("分页数据对象")
public class PageList implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    @ApiModelProperty(value = "总记录数", example = "long")
    private long total;

    /**
     * 列表数据
     */
    @ApiModelProperty(value = "列表数据", example = "List")
    private List<?> rows;

    /**
     * 消息状态码
     */
    @ApiModelProperty(value = "消息状态码", example = "200")
    private int code;

    /**
     * 消息内容
     */
    @ApiModelProperty(value = "消息内容", example = "请求成功")
    private String msg;

    /**
     * 表格数据对象
     */
    public PageList() {
    }

    /**
     * 分页
     *
     * @param list  列表数据
     * @param total 总记录数
     */
    public PageList(List<?> list, int total) {
        this.rows = list;
        this.total = total;
    }

}