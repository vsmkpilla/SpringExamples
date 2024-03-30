package com.spring.learning.loosecouplingwithspringlevel1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class LooseCouplingWithSpringLevel1Application {

	public static void main(String[] args) {
		int count=0;
		var cxt = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		cxt.getBean(GameRunner.class).runIt();
	}

}
