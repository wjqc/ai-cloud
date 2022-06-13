package com.cloud.auth.controller;


import com.cloud.auth.api.domain.model.LoginUser;
import com.cloud.auth.param.LoginParam;
import com.cloud.auth.param.LoginPhoneParam;
import com.cloud.auth.param.LoginOneStepParam;
import com.cloud.auth.param.LoginWxParam;
import com.cloud.auth.service.impl.LoginServiceImpl;
import com.cloud.common.model.Response;
import com.cloud.common.utils.StringUtils;
import com.cloud.security.service.TokenService;
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
     * 账号密码登录
     *
     * @param param
     * @param request 请求对象
     * @return 登录结果
     */
    @PostMapping("login")
    @ApiOperation("账号密码登录")
    public Response<?> login(@RequestBody LoginParam param, HttpServletRequest request) {
        // 用户登录
        LoginUser userInfo = loginService.login(param.getUsername(), param.getPassword(), param.getDeviceId(), request);
        // 获取登录token
        return Response.ok(tokenService.createToken(userInfo), "登录成功");
    }

    /**
     * 一键登录
     *
     * @param param
     * @param request
     * @return 登录结果
     */
    @PostMapping("onestep")
    @ApiOperation("一键登录")
    public Response<?> onestep(@RequestBody LoginOneStepParam param, HttpServletRequest request) {
        // 用户登录
        LoginUser userInfo = loginService.onestep(param, request);
        // 获取登录token
        return Response.ok(tokenService.createToken(userInfo), "登录成功");
    }

    /**
     * 手机快捷登录
     *
     * @param param
     * @param request
     * @return 登录结果
     */
    @PostMapping("phone")
    @ApiOperation("一键登录")
    public Response<?> phone(@RequestBody LoginPhoneParam param, HttpServletRequest request) {
        // 用户登录
        LoginUser userInfo = loginService.phone(param, request);
        // 获取登录token
        return Response.ok(tokenService.createToken(userInfo), "登录成功");
    }

    /**
     * 微信授权登录
     *
     * @param param
     * @param request 请求对象
     * @return 登录结果
     */
    @PostMapping("phone")
    @ApiOperation("一键登录")
    public Response<?> weixin(@RequestBody LoginWxParam param, HttpServletRequest request) {
        // 用户登录
        LoginUser userInfo = loginService.weixin(param, request);
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
