package com.spring.learning.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class MainClass{
	
	//Field Dependency has been added. As below, We are AutoWiring SubClass1 to MainClass
	@Autowired
	private SubClass1 subclass1; 

	@Override
	public String toString() {
		return "We have added SubClass1 as a field dependency [subclass1=" + subclass1 + "]";
	}
	
	
}

@Component
class SubClass1{
	
	@Override
	public String toString() {
		return "We have added SubClass2 as a Setter Dependency [subclass2=" + subclass2 + "]";
	}

	private SubClass2 subclass2;
	
	@Autowired
	public void setSubclass2(SubClass2 subclass2) {
		this.subclass2 = subclass2;
	}
	
	
	
}

@Component
class SubClass2{
	
}

@Component
class SubClass3{
	private MainClass main;
	private SubClass1 sub;
	
	@Autowired //Constructor Dependency
	public SubClass3(MainClass main, SubClass1 sub) {
		super();
		this.main = main;
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "We have added MainClass and SubClass1 as a constuctor dependency  [main=" + main + ", sub=" + sub + "]";
	}
	
	
	
}




@Configuration
@ComponentScan
public class SpringFrameWorkDependenencyInjectionApplication {

	public static void main(String[] args) {
		var cxt = new AnnotationConfigApplicationContext(SpringFrameWorkDependenencyInjectionApplication.class);
		
		System.out.println(cxt.getBean(MainClass.class).toString());
		System.out.println();
		System.out.println(cxt.getBean(SubClass1.class).toString());
		System.out.println();
		System.out.println(cxt.getBean(SubClass3.class).toString());
		
	}

}
