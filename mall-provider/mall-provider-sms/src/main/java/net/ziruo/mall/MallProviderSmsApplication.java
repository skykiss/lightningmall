package net.ziruo.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: october
 * @Date: 2020/1/2 17:24
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
public class MallProviderSmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallProviderSmsApplication.class, args);
    }
}
