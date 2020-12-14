package com.cheerhou.rest.webservices.restfulwebservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hcj
 * @Description configuration of Swagger UI
 * @Date 2020/12/14
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //add the info here
    public static final Contact DEFAULT_CONTACT
            = new Contact(
            "Cheer Hou",
            "www.cheerhou.com",
            "cheerhou@hotmail.com");
    public static final ApiInfo DEFAULT_API_INFO
            = new ApiInfo(
            "CH demo API",
            "The demo project developed by CH",
            "1.0",
            "urn:tos",
            DEFAULT_CONTACT,
            "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0",
            new ArrayList<>());
    private static final Set<String> DEFAULT_PRODUCERS_AND_CONSUMERS =
            new HashSet<>(Arrays.asList("application/json", "application/xml"));

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCERS_AND_CONSUMERS);
    }
}
