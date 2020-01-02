package net.ziruo.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: october
 * @Date: 2019/12/29 17:31
 * @Description:
 */

@SpringBootApplication
@EnableEurekaServer
public class MallRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallRegistryApplication.class, args);
    }
}
