package net.ziruo.mall;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: october
 * @Date: 2019/12/29 17:36
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableSwagger2Doc
public class MallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallGatewayApplication.class, args);
    }

    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {

        @Override
        public List<SwaggerResource> get() {
            List<SwaggerResource> resources = new ArrayList<>();
            resources.add(swaggerResource("商品管理Api","/api/pms/v2/api-docs","2.0"));
            resources.add(swaggerResource("搜索管理Api","/api/sms/v2/api-docs","2.0"));
            resources.add(swaggerResource("系统管理Api","/api/cms/v2/api-docs","2.0"));

            return resources;
        }

        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }

}
