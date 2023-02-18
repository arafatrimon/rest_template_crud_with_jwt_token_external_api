package com.example.rest_template_crud_with_jwt_token_external_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateCrudWithJwtTokenExternalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateCrudWithJwtTokenExternalApiApplication.class, args);

	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
