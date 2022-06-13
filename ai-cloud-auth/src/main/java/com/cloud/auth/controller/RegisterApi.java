package com.cloud.auth.controller;


import com.cloud.auth.param.RegisterParam;
import com.cloud.auth.service.RegisterService;
import com.cloud.common.model.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册接口
 *
 * @author ai-cloud
 */
@Api(tags = "注册接口")
@RestController
public class RegisterApi {

    @Autowired
    private RegisterService registerService;

    /**
     * 账号密码注册
     *
     * @param param
     * @return 注册结果
     */
    @PostMapping("register")
    @ApiOperation("新用户注册")
    public Response<?> register(@RequestBody RegisterParam param) {
        //用户注册
        registerService.register(param.getUsername(), param.getPassword(), param.getDeviceId());
        return Response.ok("", "注册成功");
    }

}
