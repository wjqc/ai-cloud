package com.cloud.user.controller;


import com.cloud.common.model.Response;
import com.cloud.user.service.IUserAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户账户信息api
 *
 * @author ai-cloud
 */
@Api(tags = "用户账户信息")
@RestController
@RequestMapping("/account")
public class UserAccountApi {

    @Autowired
    private IUserAccountService userAccountService;


    /**
     * 钱包余额
     *
     * @return
     */
    @PostMapping(value = "/wallet")
    @ApiOperation(value = "钱包余额")
    public Response wallet() {
        return Response.ok(userAccountService.wallet(), "查询成功");
    }


}
