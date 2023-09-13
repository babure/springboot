package com.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//configuration class for creating spring beans
@Configuration
public class AppConfig {

	
	//bean definitions
	@Bean
	public Mobile mobile() {
		Mobile mobile = new Mobile();
		mobile.setFeatures(features());
		return mobile;
	}
	
	@Bean
	public Features features() {
		return new Features();
	}
}
