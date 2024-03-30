package com.spring.learning.scope;

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


@Component
class A{
	
}

@Component
class B{
	private A a;
	public B(A a) {
		this.a = a;
		System.out.println("Dependency Injection is done");
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("Executing the biz logic after DependencyInjection");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Executing the Destroy biz logic just before closing the context");
	}
}



@Configuration
@ComponentScan
public class PostConstructPreDestroyApplication {

	public static void main(String[] args) {
		var cxt = new AnnotationConfigApplicationContext(PostConstructPreDestroyApplication.class);
		
		System.out.println(cxt.getBean(B.class));
		cxt.getBean(B.class).preDestroy();
		
	}

}
