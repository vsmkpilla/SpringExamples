package com.spring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class SpringSample1Application {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cxt = 
				new AnnotationConfigApplicationContext(SpringSample1Application.class);
		cxt.getBean(GameRun.class).run();
	}

}
