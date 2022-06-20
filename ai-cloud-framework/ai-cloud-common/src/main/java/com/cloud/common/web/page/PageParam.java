package com.cloud.common.web.page;

import com.cloud.common.utils.StringUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 分页参数
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("分页参数")
public class PageParam {
    /**
     * 当前记录起始索引
     */
    @ApiModelProperty(value = "当前页", example = "1")
    private Integer pageNum;

    /**
     * 每页显示记录数
     */
    @ApiModelProperty(value = "每页条数", example = "10")
    private Integer pageSize;

    /**
     * 排序列
     */
    @ApiModelProperty(value = "排序列", example = "asc")
    private String orderByColumn;

    /**
     * 排序的方向desc或者asc
     */
    @ApiModelProperty(value = "排序的方向desc或者asc", example = "asc")
    private String isAsc = "asc";

    /**
     * 分页参数合理化
     */
    @ApiModelProperty(value = "分页参数合理化", example = "true")
    private Boolean reasonable = true;

    public String getOrderBy() {
        if (StringUtils.isEmpty(orderByColumn)) {
            return "";
        }
        return StringUtils.toUnderScoreCase(orderByColumn) + " " + isAsc;
    }

    public void setIsAsc(String isAsc) {
        if (StringUtils.isNotEmpty(isAsc)) {
            // 兼容前端排序类型
            if ("ascending".equals(isAsc)) {
                isAsc = "asc";
            } else if ("descending".equals(isAsc)) {
                isAsc = "desc";
            }
            this.isAsc = isAsc;
        }
    }

    public Boolean getReasonable() {
        if (StringUtils.isNull(reasonable)) {
            return Boolean.TRUE;
        }
        return reasonable;
    }

    public void setReasonable(Boolean reasonable) {
        this.reasonable = reasonable;
    }
}
