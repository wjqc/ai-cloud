package com.cloud.file;

import com.cloud.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 文件中心
 *
 * @author ai-cloud
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CloudFileApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudFileApplication.class, args);
        System.out.println("文件服务启动成功");
    }
}
