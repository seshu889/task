package com.test1.test1;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

@Bean
 public Docket customImplementation(){
    return new Docket(DocumentationType.SWAGGER_2)
    .apiInfo(apiInfo())  
    .select()
        .apis(RequestHandlerSelectors.basePackage("com.test1"))
        .paths(PathSelectors.any())
        .build();
 }
private ApiInfo apiInfo() {
Contact contact = new Contact(
       "KODERZ",
       "http://www.koderz.com",
       "developer@koderz.com"
);
List<VendorExtension> vendorExtensions = new ArrayList<>();

ApiInfo apiInfo = new ApiInfo(
"Demo app RESTful Web Service documentation",
"This pages documents  RESTful Web Service endpoints", "1.0",
"http://www.koderz.com/service.html", contact,
"Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",vendorExtensions);

return apiInfo;
}
}