package com.jcdecaux.recruiting.developers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created By SAIF on 02/07/2018
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket expenditureCommitmentApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("DEVELOPERS API")
            .description("This API allows to manage the DEVELOPERS and their PROGRAMS.")
            .contact(new Contact("Saif Eddine GHRAB", "", "saifeddine.ghrab@gmail.com"))
            .version("1.0")
            .build();
  }
}