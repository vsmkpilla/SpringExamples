package com.spring.learning.primaryandqualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PrimaryAndQualifierApplication {

	public static void main(String[] args) {
		int count=0;
		var cxt = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		cxt.getBean(GameRunner.class).runIt();
		
	}

}
