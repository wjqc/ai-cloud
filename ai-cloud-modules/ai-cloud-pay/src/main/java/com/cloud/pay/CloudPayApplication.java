package com.cloud.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 支付中心
 *
 * @author ai-cloud
 */
@SpringBootApplication
public class CloudPayApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudPayApplication.class, args);
        System.out.println("支付服务启动成功");
    }
}
