package com.cloud.user.controller;

import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.auth.api.domain.UserOperLog;
import com.cloud.auth.api.domain.UserRegistryLog;
import com.cloud.common.model.Response;
import com.cloud.common.web.domain.AjaxResult;
import com.cloud.security.annotation.InnerAuth;
import com.cloud.user.service.IUserLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登录记录api
 *
 * @author ai-cloud
 */
@Api(tags = "用户日志记录")
@RestController
public class UserLogApi {

    @Autowired
    private IUserLogService userLogService;

    /**
     * 新增用户登录记录
     *
     * @param userLoginLog 用户登录记录
     * @return 结果
     */
    @InnerAuth
    @PostMapping("/loginlog")
    @ApiOperation("新增用户登录记录")
    public Response add(@RequestBody UserLoginLog userLoginLog) {
        return Response.ok(userLogService.insertUserLoginLog(userLoginLog));
    }


    /**
     * 新增用户注册记录
     *
     * @param userRegistryLog 用户注册记录
     * @return 结果
     */
    @InnerAuth
    @PostMapping("/registrylog")
    @ApiOperation("新增用户注册记录")
    public Response add(@RequestBody UserRegistryLog userRegistryLog) {
        return Response.ok(userLogService.insertUserRegistryLog(userRegistryLog));
    }

    /**
     * 新增操作日志记录
     *
     * @param userOperLog 操作日志记录
     * @return 结果
     */
    @InnerAuth
    @PostMapping("/operlog")
    @ApiOperation("新增操作日志记录")
    public Response add(@RequestBody UserOperLog userOperLog) {
        return Response.ok(userLogService.insertUserOperLog(userOperLog));
    }


}