package com.cts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class AppConfig {
	
	@Bean
	public void test() {
		System.out.println("---test method");
	}

}
