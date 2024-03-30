package com.spring.learning.loosecouplingwithspringlevel2;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan //should use ("Package")if we have components in another package
public class LooseCouplingWithSpringLevel2Application {

	public static void main(String[] args) {
		int count=0;
		var context = new AnnotationConfigApplicationContext(LooseCouplingWithSpringLevel2Application.class);
		
		context.getBean(GameRunner.class).runIt();
		
		System.out.println(context.getBeanDefinitionCount());
		for(String str:context.getBeanDefinitionNames()) {
			++count;
		System.out.println("Bean "+count+":"+str);
	}
	}

}
