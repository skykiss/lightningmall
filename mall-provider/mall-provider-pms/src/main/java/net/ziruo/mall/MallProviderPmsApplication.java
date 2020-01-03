package net.ziruo.mall;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: october
 * @Date: 2020/1/2 16:40
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
@MapperScan("net.ziruo.mall.mapper")
public class MallProviderPmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallProviderPmsApplication.class, args);
    }
}
