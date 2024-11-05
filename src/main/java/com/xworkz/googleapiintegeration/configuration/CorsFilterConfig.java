package com.xworkz.googleapiintegeration.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsFilterConfig {
	


	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("https://x-workz.in" , "https://www.x-workz.in")
				.allowedMethods("GET", "POST", "PUT", "DELETE")
		        .allowCredentials(true);
			}												
		};
	}
	

}
