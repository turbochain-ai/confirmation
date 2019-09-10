package com.confirmation.controller.configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(buildApiInf())
        //.host("localhost:8686")
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.confirmation.controller"))//controller路径
        .paths(PathSelectors.any()).build();
    }

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
        		.title("基于区块链的银行询证系统接口文档")
				.description("")
				.version("1.0.0")
				.termsOfServiceUrl("")
				.license("")
				.licenseUrl("")
				.build();
    }
}