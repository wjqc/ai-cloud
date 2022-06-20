package com.cloud.common.web.page;

import com.cloud.common.utils.ServletUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 分页数据处理
 *
 * @author ai-cloud
 */
@Getter
@Setter
@ApiModel("分页数据处理")
public class PageSupport {
    /**
     * 当前记录起始索引
     */
    @ApiModelProperty(value = "当前页", example = "1")
    public static final String PAGE_NUM = "pageNum";

    /**
     * 每页显示记录数
     */
    @ApiModelProperty(value = "每页条数", example = "10")
    public static final String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
    @ApiModelProperty(value = "排序列", example = "asc")
    public static final String ORDER_BY_COLUMN = "orderByColumn";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    @ApiModelProperty(value = "排序的方向desc或者asc", example = "asc")
    public static final String IS_ASC = "isAsc";

    /**
     * 分页参数合理化
     */
    @ApiModelProperty(value = "分页参数合理化", example = "true")
    public static final String REASONABLE = "reasonable";

    /**
     * 封装分页对象
     */
    public static PageParam getPageDomain() {
        PageParam pageParam = new PageParam();
        pageParam.setPageNum(ServletUtils.getParameterToInt(PAGE_NUM));
        pageParam.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        pageParam.setOrderByColumn(ServletUtils.getParameter(ORDER_BY_COLUMN));
        pageParam.setIsAsc(ServletUtils.getParameter(IS_ASC));
        pageParam.setReasonable(ServletUtils.getParameterToBool(REASONABLE));
        return pageParam;
    }

    public static PageParam buildPageRequest() {
        return getPageDomain();
    }
}
