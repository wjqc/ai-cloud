package com.cloud.auth.controller;


import com.cloud.auth.service.impl.LoginServiceImpl;
import com.cloud.common.model.Response;
import com.cloud.common.utils.JwtUtils;
import com.cloud.common.utils.StringUtils;
import com.cloud.security.auth.AuthUtil;
import com.cloud.security.utils.SecurityUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 退出登录接口
 *
 * @author ai-cloud
 */
@Api(tags = "退出登录接口")
@RestController
public class LogoutApi {

    @Autowired
    private LoginServiceImpl loginService;

    /**
     * 退出登录
     *
     * @return 结果
     */
    @PostMapping("logout")
    @ApiOperation("退出登录")
    public Response<?> logout(HttpServletRequest request) {
        String token = SecurityUtils.getToken(request);
        if (StringUtils.isNotEmpty(token)) {
            String username = JwtUtils.getUserName(token);
            String deviceId = JwtUtils.getDeviceId(token);
            // 删除用户缓存记录
            AuthUtil.logoutByToken(token);
            // 记录用户退出日志
            loginService.logout(username, deviceId);
        }
        return Response.ok("", "退出成功");
    }

}
