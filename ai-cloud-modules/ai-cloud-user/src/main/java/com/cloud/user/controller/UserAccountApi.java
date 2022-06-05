package com.cloud.user.controller;

import com.cloud.auth.api.domain.UserAccount;
import com.cloud.common.utils.uuid.IdUtils;
import com.cloud.common.web.domain.AjaxResult;
import com.cloud.user.service.IUserAccountService;
import com.cloud.user.service.IUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 用户账户信息api
 *
 * @author ai-cloud
 * @date 2022-06-06
 */
@Api(tags = "用户信息")
@RestController
@RequestMapping("/account")
public class UserAccountApi {

    @Autowired
    private IUserAccountService accountService;

    /**
     * 创建账户
     * @param userId
     * @param uuid
     * @param type
     * @return
     */
    @PostMapping("/create")
    public AjaxResult createAccount(String userId, String uuid, String type) {
        return AjaxResult.success(accountService.createAccount(userId,uuid,type));
    }


}
