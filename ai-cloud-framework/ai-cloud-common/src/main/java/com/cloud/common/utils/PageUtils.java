package com.cloud.common.utils;

import com.cloud.common.utils.sql.SqlUtil;
import com.cloud.common.web.page.PageParam;
import com.cloud.common.web.page.PageSupport;
import com.github.pagehelper.PageHelper;

/**
 * 分页工具类
 *
 * @author ai-cloud
 *
 */
public class PageUtils extends PageHelper {
    /**
     * 设置请求分页数据
     */
    public static void startPage() {
        PageParam pageParam = PageSupport.buildPageRequest();
        Integer pageNum = pageParam.getPageNum();
        Integer pageSize = pageParam.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)) {
            String orderBy = SqlUtil.escapeOrderBySql(pageParam.getOrderBy());
            Boolean reasonable = pageParam.getReasonable();
            PageHelper.startPage(pageNum, pageSize, orderBy).setReasonable(reasonable);
        }
    }
}
