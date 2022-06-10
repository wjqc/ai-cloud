package com.cloud.auth.api.factory;

import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.auth.api.domain.UserOperLog;
import com.cloud.auth.api.domain.UserRegistryLog;
import com.cloud.auth.api.service.RemoteLogService;
import com.cloud.common.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 日志服务降级处理
 *
 * @author ai-cloud
 *
 */
@Component
public class RemoteLogFallbackFactory implements FallbackFactory<RemoteLogService> {
    private static final Logger log = LoggerFactory.getLogger(RemoteLogFallbackFactory.class);

    @Override
    public RemoteLogService create(Throwable throwable) {
        log.error("日志服务调用失败:{}", throwable.getMessage());
        return new RemoteLogService() {

            /**
             * 保存登录记录
             *
             * @param userLoginLog 访问实体
             * @param source       请求来源
             * @return 结果
             */
            @Override
            public Response<Boolean> saveUserLoginLog(UserLoginLog userLoginLog, String source) {
                return null;
            }

            /**
             * 保存注册记录
             *
             * @param userRegistryLog 访问实体
             * @param source       请求来源
             * @return 结果
             */
            @Override
            public Response<Boolean> saveUserRegistryLog(UserRegistryLog userRegistryLog, String source) {
                return null;
            }

            /**
             * 保存操作日志
             *
             * @param userOperLog 日志实体
             * @param source      请求来源
             * @return 结果
             */
            @Override
            public Response<Boolean> saveUserOperLog(UserOperLog userOperLog, String source) {
                return null;
            }

        };

    }
}
