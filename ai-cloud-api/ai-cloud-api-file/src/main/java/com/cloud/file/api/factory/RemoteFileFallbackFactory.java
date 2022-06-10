package com.cloud.file.api.factory;

import com.cloud.common.model.Response;
import com.cloud.file.api.domain.File;
import com.cloud.file.api.service.RemoteFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件服务降级处理
 *
 * @author ai-cloud
 *
 */
@Component
public class RemoteFileFallbackFactory implements FallbackFactory<RemoteFileService> {
    private static final Logger log = LoggerFactory.getLogger(RemoteFileFallbackFactory.class);

    @Override
    public RemoteFileService create(Throwable throwable) {
        log.error("文件服务调用失败:{}", throwable.getMessage());
        return new RemoteFileService() {
            /**
             * 上传文件
             *
             * @param file 文件信息
             * @return 结果
             */
            @Override
            public Response<File> upload(MultipartFile file) {
                return Response.fail("上传文件失败:" + throwable.getMessage());
            }

        };
    }
}
