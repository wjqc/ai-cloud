package com.cloud.user.controller;

import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.auth.api.domain.UserOperLog;
import com.cloud.common.web.domain.AjaxResult;
import com.cloud.security.annotation.InnerAuth;
import com.cloud.user.service.IUserOperLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 操作日志记录api
 *
 * @author ai-cloud
 * @date 2022-06-05
 */
@RestController
@Api(tags = "操作日志记录")
public class UserOperLogApi {

    @Autowired
    private IUserOperLogService userOperLogService;

    /**
     * 新增操作日志记录
     *
     * @param userOperLog 操作日志记录
     * @return 结果
     */
    @InnerAuth
    @PostMapping("/operlog")
    @ApiOperation("新增操作日志记录")
    public AjaxResult add(@RequestBody UserOperLog userOperLog) {
        return AjaxResult.success(userOperLogService.insertUserOperLog(userOperLog));
    }
}
