package com.cloud.auth.api.service;

import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.auth.api.domain.UserOperLog;
import com.cloud.auth.api.factory.RemoteLogFallbackFactory;
import com.cloud.common.constant.SecurityConstants;
import com.cloud.common.constant.ServiceNameConstants;
import com.cloud.common.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 日志服务
 *
 * @author ai-cloud
 */
@FeignClient(contextId = "remoteLogService", value = ServiceNameConstants.USER_SERVICE, fallbackFactory = RemoteLogFallbackFactory.class)
public interface RemoteLogService {

    /**
     * 保存访问记录
     *
     * @param userLoginLog 访问实体
     * @param source       请求来源
     * @return 结果
     */
    @PostMapping("/loginlog")
    public Response<Boolean> saveUserLoginLog(@RequestBody UserLoginLog userLoginLog, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);


    /**
     * 保存操作日志
     *
     * @param userOperLog 日志实体
     * @param source      请求来源
     * @return 结果
     */
    @PostMapping("/operlog")
    public Response<Boolean> saveUserOperLog(@RequestBody UserOperLog userOperLog, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
