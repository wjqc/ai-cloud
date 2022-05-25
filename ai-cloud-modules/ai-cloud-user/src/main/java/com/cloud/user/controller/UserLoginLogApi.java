package com.cloud.user.controller;

import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.common.web.domain.AjaxResult;
import com.cloud.security.annotation.InnerAuth;
import com.cloud.user.service.IUserLoginLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登录记录Controller
 *
 * @author ai-cloud
 * @date 2022-05-18
 */
@Api(tags = "用户登录记录")
@RestController
@RequestMapping("/user/login")
public class UserLoginLogApi {

    @Autowired
    private IUserLoginLogService userLoginLogService;


    /**
     * 新增用户登录记录
     *
     * @param userLoginLog 用户登录记录
     * @return 结果
     */
    @InnerAuth
    @PostMapping("add")
    @ApiOperation(value = "新增用户登录记录", notes = "新增用户登录记录")
    public AjaxResult add(@RequestBody UserLoginLog userLoginLog) {
        return AjaxResult.success(userLoginLogService.insertUserLoginLog(userLoginLog));
    }


}