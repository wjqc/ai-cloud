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
 * token 控制
 *
 * @author
 */
@Api(tags = "认证授权")
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
    public Response<?> login(@RequestBody LoginParam param) {
        // 用户登录
        LoginUser userInfo = loginService.login(param.getUsername(), param.getPassword());
        // 获取登录token
        return Response.ok(tokenService.createToken(userInfo), "登录成功");
    }

    /**
     * 退出登录
     */
    @PostMapping("logout")
    @ApiOperation("退出登录")
    public Response<?> logout(HttpServletRequest request) {
        String token = SecurityUtils.getToken(request);
        if (StringUtils.isNotEmpty(token)) {
            String username = JwtUtils.getUserName(token);
            // 删除用户缓存记录
            AuthUtil.logoutByToken(token);
            // 记录用户退出日志
            loginService.logout(username);
        }
        return Response.ok("", "退出成功");
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


    /**
     * 用户注册
     */
    @PostMapping("register")
    @ApiOperation("新用户注册")
    public Response<?> register(@RequestBody RegisterParam param) {
        // 用户注册
        loginService.register(param.getUsername(), param.getPassword());
        return Response.ok("", "注册成功");
    }


}
