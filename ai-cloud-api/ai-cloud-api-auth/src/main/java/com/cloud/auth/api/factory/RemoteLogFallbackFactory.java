package com.cloud.auth.api.factory;

import com.cloud.auth.api.domain.UserLoginLog;
import com.cloud.auth.api.service.RemoteLogService;
import com.cloud.common.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 日志服务降级处理
 *
 * @author
 */
@Component
public class RemoteLogFallbackFactory implements FallbackFactory<RemoteLogService> {
    private static final Logger log = LoggerFactory.getLogger(RemoteLogFallbackFactory.class);

    @Override
    public RemoteLogService create(Throwable throwable) {
        log.error("日志服务调用失败:{}", throwable.getMessage());
        return new RemoteLogService() {

            @Override
            public Response<Boolean> saveUserLoginLog(UserLoginLog userLoginLog, String source) {
                return null;
            }

        };

    }
}
