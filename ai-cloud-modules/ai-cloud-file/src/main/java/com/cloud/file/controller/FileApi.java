package com.cloud.file.controller;

import com.cloud.common.model.Response;
import com.cloud.common.utils.file.FileUtils;
import com.cloud.file.api.domain.File;
import com.cloud.file.service.IFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件请求处理
 *
 * @author ai-cloud
 */
@RestController
public class FileApi {
    private static final Logger log = LoggerFactory.getLogger(FileApi.class);

    @Autowired
    private IFileService fileService;

    /**
     * 文件上传请求
     */
    @PostMapping("upload")
    public Response<File> upload(MultipartFile file) {
        try {
            // 上传并返回访问地址
            String url = fileService.uploadFile(file);
            File files = new File();
            files.setName(FileUtils.getName(url));
            files.setUrl(url);
            return Response.ok(files, "上传成功");
        } catch (Exception e) {
            log.error("上传文件失败", e);
            return Response.fail(e.getMessage());
        }
    }
}