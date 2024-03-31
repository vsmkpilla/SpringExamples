package com.spring.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.spring.example.config.GameNo1;
import com.spring.example.config.GameNo2;
import com.spring.example.config.GameRun;
import com.spring.example.config.GameStructure;


@Component
class Gamer{
	@Bean
	void retunAll() {
		System.out.println("in Local class");
	}
}


@Configuration
//@ComponentScan("com.spring.example.config")
public class SpringSampleApplication {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringSampleApplication.class);
//		context.getBean(GameRun.class);
		context.getBean("returnAll");
	}

}
