package com.cloud.user.controller;


import com.cloud.common.model.Response;
import com.cloud.log.annotation.Log;
import com.cloud.log.enums.BusinessType;
import com.cloud.user.param.UserParam;
import com.cloud.user.param.WalletWithdrawParam;
import com.cloud.user.service.IUserAccountService;
import com.cloud.user.service.IUserCenterService;
import com.cloud.user.service.IUserConfigService;
import com.cloud.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 我的信息
 *
 * @author ai-cloud
 */
@Api(tags = "我的信息")
@RestController
@RequestMapping("/user")
public class UserCenterApi {

    @Autowired
    private IUserCenterService userCenterService;

    /**
     * 查询用户信息
     *
     * @param
     * @return 用户信息
     */
    @Log(title = "查询用户信息", businessType = BusinessType.QUERY)
    @PostMapping(value = "/userInfo")
    @ApiOperation("查询用户信息")
    public Response userInfo() {
        return Response.ok(userCenterService.userInfo(), "查询成功!");
    }

    /**
     * 保存我的信息
     *
     * @param param
     * @return
     */
    @Log(title = "保存我的信息", businessType = BusinessType.UPDATE)
    @PostMapping(value = "/userSave")
    @ApiOperation("保存我的信息")
    public Response userSave(@RequestBody UserParam param) {
        return Response.ok(userCenterService.userSave(param), "保存成功!");
    }

    /**
     * 查询钱包余额
     *
     * @param
     * @return
     */
    @Log(title = "查询钱包余额", businessType = BusinessType.QUERY)
    @PostMapping(value = "/wallet")
    @ApiOperation(value = "钱包余额")
    public Response wallet() {
        return Response.ok(userCenterService.wallet(), "查询成功!");
    }

    /**
     * 申请提现
     *
     * @param param
     * @return
     */
    @Log(title = "用户申请提现", businessType = BusinessType.QUERY)
    @PostMapping(value = "/wallet/withdraw")
    @ApiOperation(value = "申请提现")
    public Response walletWithdraw(WalletWithdrawParam param) {
        return Response.ok(userCenterService.walletWithdraw(param), "申请成功!");
    }


}
