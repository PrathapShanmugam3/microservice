package com.server.apigateway_service.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


//http://localhost:8000/swagger-ui/index.html

@Configuration
public class SwaggarConfig {

	@Bean
	public OpenAPI usersMicroserviceOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("SERVER_ECOM_2 API").description("SERVER_ECOM_2 API").version("1.0.0.0"));
	}
}
