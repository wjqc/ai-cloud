package com.cloud.auth;

import com.cloud.security.annotation.EnableCustomConfig;
import com.cloud.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 认证授权中心
 *
 * @author ai-cloud
 *
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CloudAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudAuthApplication.class, args);
        System.out.println("认证授权中心启动成功");
    }
}
