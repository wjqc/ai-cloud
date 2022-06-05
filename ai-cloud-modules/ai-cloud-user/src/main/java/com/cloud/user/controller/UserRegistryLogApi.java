package com.cloud.user.controller;

import com.cloud.auth.api.domain.UserRegistryLog;
import com.cloud.common.web.domain.AjaxResult;
import com.cloud.security.annotation.InnerAuth;
import com.cloud.user.service.IUserRegistryLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户注册记录api
 *
 * @author ai-cloud
 * @date 2022-06-05
 */
@RestController
@Api(tags = "用户注册记录")
public class UserRegistryLogApi{

    @Autowired
    private IUserRegistryLogService userRegistryLogService;

    /**
     * 新增用户注册记录
     *
     * @param userRegistryLog 用户注册记录
     * @return 结果
     */
    @InnerAuth
    @PostMapping("/registrylog")
    @ApiOperation("新增用户注册记录")
    public AjaxResult add(@RequestBody UserRegistryLog userRegistryLog) {
        return AjaxResult.success(userRegistryLogService.insertUserRegistryLog(userRegistryLog));
    }

}
