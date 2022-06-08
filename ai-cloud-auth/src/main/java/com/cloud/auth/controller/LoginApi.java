package com.cloud.auth.controller;


import com.cloud.auth.api.domain.model.LoginUser;
import com.cloud.auth.param.LoginParam;
import com.cloud.auth.param.RegisterParam;
import com.cloud.auth.service.impl.LoginServiceImpl;
import com.cloud.common.model.Response;
import com.cloud.common.utils.JwtUtils;
import com.cloud.common.utils.StringUtils;
import com.cloud.security.auth.AuthUtil;
import com.cloud.security.service.TokenService;
import com.cloud.security.utils.SecurityUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录接口 token控制
 *
 * @author ai-cloud
 */
@Api(tags = "登录接口")
@RestController
public class LoginApi {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private LoginServiceImpl loginService;


    /**
     * 用户账号密码登录
     */
    @PostMapping("login")
    @ApiOperation("账号密码登录")
    public Response<?> login(@RequestBody LoginParam param,HttpServletRequest request) {
        // 用户登录
        LoginUser userInfo = loginService.login(param.getUsername(), param.getPassword(),request);
        // 获取登录token
        return Response.ok(tokenService.createToken(userInfo), "登录成功");
    }


    /**
     * 刷新令牌有效期
     */
    @PostMapping("refresh")
    @ApiOperation("刷新令牌有效期")
    public Response<?> refresh(HttpServletRequest request) {
        LoginUser loginUser = tokenService.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser)) {
            // 刷新令牌有效期
            tokenService.refreshToken(loginUser);
            return Response.ok();
        }
        return Response.ok();
    }

}
