package com.cloud.auth.api.service;

import com.cloud.auth.api.domain.User;
import com.cloud.auth.api.factory.RemoteUserFallbackFactory;
import com.cloud.auth.api.domain.model.LoginUser;
import com.cloud.common.constant.SecurityConstants;
import com.cloud.common.constant.ServiceNameConstants;
import com.cloud.common.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 用户服务
 *
 * @author
 */
@FeignClient(contextId = "remoteUserService", value = ServiceNameConstants.USER_SERVICE, fallbackFactory = RemoteUserFallbackFactory.class)
public interface RemoteUserService {
    /**
     * 通过用户名查询用户信息
     *
     * @param username 用户名
     * @param source   请求来源
     * @return 结果
     */
    @PostMapping("/user/info/{username}")
    public Response<LoginUser> getUserInfo(@PathVariable("username") String username, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);

    /**
     * 注册用户信息
     *
     * @param user   用户信息
     * @param source 请求来源
     * @return 结果
     */
    @PostMapping("/user/register")
    public Response<Boolean> registerUserInfo(@RequestBody User user, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
