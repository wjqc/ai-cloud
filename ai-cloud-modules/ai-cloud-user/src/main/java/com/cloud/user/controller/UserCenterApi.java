package com.cloud.user.controller;


import com.cloud.common.model.Response;
import com.cloud.log.annotation.Log;
import com.cloud.log.enums.BusinessType;
import com.cloud.user.param.*;
import com.cloud.user.service.IUserCenterService;
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
    @ApiOperation(value = "查询钱包余额")
    public Response wallet() {
        return Response.ok(userCenterService.wallet(), "查询成功!");
    }

    /**
     * 用户申请提现
     *
     * @param param
     * @return
     */
    @Log(title = "用户申请提现", businessType = BusinessType.QUERY)
    @PostMapping(value = "/wallet/withdraw")
    @ApiOperation(value = "用户申请提现")
    public Response walletWithdraw(@RequestBody WalletWithdrawParam param) {
        return Response.ok(userCenterService.walletWithdraw(param), "申请成功!");
    }

    /**
     * 查询钱包账单
     *
     * @param param
     * @return
     */
    @Log(title = "查询钱包账单", businessType = BusinessType.QUERY)
    @PostMapping(value = "/wallet/bill")
    @ApiOperation(value = "查询钱包账单")
    public Response walletBill(@RequestBody WalletBillParam param) {
        return Response.ok(userCenterService.walletBill(param), "查询成功!");
    }

    /**
     * 查询账单明细
     *
     * @param param
     * @return
     */
    @Log(title = "查询账单明细", businessType = BusinessType.QUERY)
    @PostMapping(value = "/wallet/bill/detail")
    @ApiOperation(value = "查询账单明细")
    public Response walletBillDetail(@RequestBody WalletBillDetailParam param) {
        return Response.ok(userCenterService.walletBillDetail(param), "查询成功!");
    }

    /**
     * 查询银行卡绑定信息
     *
     * @param
     * @return
     */
    @Log(title = "查询银行卡绑定信息", businessType = BusinessType.QUERY)
    @PostMapping(value = "/wallet/bindBank/info")
    @ApiOperation(value = "查询银行卡绑定信息")
    public Response walletBindBankInfo() {
        return Response.ok(userCenterService.walletBindBankInfo(),"查询成功!");
    }

    /**
     * 保存绑定银行卡信息
     *
     * @param param
     * @return
     */
    @Log(title = "保存绑定银行卡信息", businessType = BusinessType.QUERY)
    @PostMapping("/wallet/bindBank/save")
    @ApiOperation(value = "保存绑定银行卡信息")
    public Response walletBindBankSave(@RequestBody BindBankParam param) {
        return Response.ok(userCenterService.walletBindBankSave(param),"保存成功!");
    }

    /**
     * 查询支付宝绑定信息
     *
     * @param
     * @return
     */
    @Log(title = "查询支付宝绑定信息", businessType = BusinessType.QUERY)
    @PostMapping("/wallet/bindAlipay/Info")
    @ApiOperation(value = "查询支付宝绑定信息")
    public Response walletBindAlipayInfo() {
        return Response.ok(userCenterService.walletBindAlipayInfo(),"查询成功!");
    }

    /**
     * 保存绑定支付宝信息
     *
     * @param param
     * @return
     */
    @Log(title = "保存绑定支付宝信息", businessType = BusinessType.QUERY)
    @PostMapping("/wallet/bindAlipay/save")
    @ApiOperation(value = "保存绑定支付宝信息")
    public Response walletBindAlipaySave(@RequestBody BindAlipayParam param) {
        return Response.ok(userCenterService.walletBindAlipaySave(param),"保存成功!");
    }

}
