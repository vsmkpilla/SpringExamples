package com.springboot.learning.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
public class SpringBootCalculatorApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cxt = 
				new AnnotationConfigApplicationContext(SpringBootCalculatorApplication.class);
		
		cxt.getBean(Calculator.class).Calculate(10, 9);
	}

}
