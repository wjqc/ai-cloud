package com.cloud.user.controller;


import com.cloud.auth.api.domain.User;
import com.cloud.auth.api.domain.model.LoginUser;
import com.cloud.common.constant.UserConstants;
import com.cloud.common.model.Response;
import com.cloud.security.annotation.InnerAuth;
import com.cloud.user.service.IUserConfigService;
import com.cloud.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息
 *
 * @author ai-cloud
 */
@Api(tags = "用户信息")
@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private IUserService userService;

    @Autowired
    private IUserConfigService userConfigService;

    /**
     * 用户对象信息
     *
     * @param user 用户信息
     * @return 用户对象信息
     */
    @InnerAuth
    @PostMapping("/register")
    @ApiOperation("注册用户信息")
    public Response<Boolean> register(@RequestBody User user) {
        String username = user.getUserName();
        if (!("true".equals(userConfigService.selectConfigByKey("user.account.registerUser")))) {
            return Response.fail("当前系统没有开启注册功能！");
        }
        if (UserConstants.NOT_UNIQUE.equals(userService.checkUserNameUnique(username))) {
            return Response.fail("注册用户'" + username + "'失败，账号已存在");
        }
        return Response.ok(userService.registerUser(user));
    }

    /**
     * 通过用户名或手机号查询用户
     *
     * @param param 用户名或手机号
     * @return 用户对象信息
     */
    @InnerAuth
    @PostMapping("/{param}")
    @ApiOperation("通过用户名查询用户")
    public Response<LoginUser> info(@PathVariable("param") String param) {
        User user = userService.selectByUserNamePhone(param);
        LoginUser userVo = new LoginUser();
        userVo.setUser(user);
        return Response.ok(userVo);
    }


}
