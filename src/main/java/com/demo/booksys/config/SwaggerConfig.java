package com.demo.booksys.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2 //启用swagger文档
@Configuration//交给SpringBoot托管
public class SwaggerConfig {

    @Bean
    public Docket initDocket(Environment env) {
        //设置要暴露接口文档的配置环境
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) .enable(true) .select()
                .apis(RequestHandlerSelectors
                        .withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any()) .build()
                .globalOperationParameters(setHeaderToken());
    }

    private ApiInfo apiInfo() { return new ApiInfoBuilder()
            .title("BookSys") .description("图书管理系统")
            .contact(new Contact("chanyt", "", " "))
            .version("1.0") .build(); }


    /**
     * 配置token
     *
     * @return
     */
    private List<Parameter> setHeaderToken() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("Authorization").description("token").modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build();
        pars.add(tokenPar.build());
        return pars;
    }

}




