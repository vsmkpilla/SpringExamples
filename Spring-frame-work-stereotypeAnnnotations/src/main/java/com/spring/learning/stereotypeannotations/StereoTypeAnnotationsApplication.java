package com.spring.learning.stereotypeannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



@Configuration
@ComponentScan
public class StereoTypeAnnotationsApplication {

	public static void main(String[] args) {
		var cxt = new AnnotationConfigApplicationContext(StereoTypeAnnotationsApplication.class);
		
		cxt.getBean(BusinessCalculationService.class).executeCalculation();
		
	}

}
