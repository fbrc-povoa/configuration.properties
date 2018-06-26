package com.fbrc.properties.manager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fbrc.properties.manager.pojo.ProfilePojo;

@Configuration
public class ProfileConfig {

	@Bean
	//@Profile(value="development")
	public ProfilePojo development() {
		return new ProfilePojo("Spring Boot", "configuration properties development");
	}
	
}
