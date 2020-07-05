package com.alieducation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/5 19:00
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 可以定义多个组，比如本类中定义把test和demo区分开了
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("test")
                .genericModelSubstitutes(DeferredResult.class)
//                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                // base，最终调用接口后会和paths拼接在一起
                .pathMapping("/")
                .select()
                //过滤的接口
                .paths((regex("/api/v1/.*")))
                .build()
                .apiInfo(testApiInfo());
    }

    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                //过滤的接口
                .paths((regex("/api/v1/.*")))
                .build()
                .apiInfo(demoApiInfo());
    }

    private ApiInfo testApiInfo() {
        return new ApiInfoBuilder()
                //大标题
                .title("Test 类型 API")
                //详细描述
                .description("这是 Test 类型 API 描述")
                //版本
                .version("1.0")
                .termsOfServiceUrl("NO terms of service")
                //作者
                .contact(new Contact("shuai", "http://www.jianshu.com/u/07b9ae164f95", "1119386572@qq.com"))
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }

    private ApiInfo demoApiInfo() {
        return new ApiInfoBuilder()
                //大标题
                .title("Demo 类型 API")
                //详细描述
                .description("这是 Demo 类型 API 描述")
                //版本
                .version("1.0")
                .termsOfServiceUrl("NO terms of service")
                //作者
                .contact(new Contact("shuai", "http://www.jianshu.com/u/07b9ae164f95", "1119386572@qq.com"))
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }

}
