package com.proyecto.bootcamp;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@Configuration
@EnableSwagger2WebFlux
public class SwaggerConfig {
	
	public static final Contact DEFAULT_CONTACT = new Contact("Joel Arauzo Masgo", "Documentación",
			" ");
	
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("PROYECTO BOOTCAMP", "Documentación Swagger", "1.0",
			"Cuenta", DEFAULT_CONTACT, "Spring boot 5.0", "Prueba de documentación",
			new ArrayList<VendorExtension>());

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);

	}
}
