package com.example.dependencyinjection.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfig {
	
	@Bean
	Logger logger(InjectionPoint injectionPoint) {
//		System.out.println("#######################injection point: " + injectionPoint.getMember().getDeclaringClass().getSimpleName());
		return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass().getSimpleName()); // using factory design pattern
	}
	
}
