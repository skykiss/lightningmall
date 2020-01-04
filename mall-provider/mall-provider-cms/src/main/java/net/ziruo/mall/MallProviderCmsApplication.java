package net.ziruo.mall;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: october
 * @Date: 2020/1/4 19:18
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2Doc
@MapperScan("net.ziruo.mall.mapper")
public class MallProviderCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProviderCmsApplication.class, args);
    }

}
