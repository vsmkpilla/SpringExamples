package com.spring.learning.javabeanspringbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


//JavaBean Example
class JavaBean{
	String message = "In JavaBean";
	
	//No Arg Constructor
	public JavaBean() {
		
	}

	public void printJavaBean() {
		System.out.println(message);
}
	//Has getters and Setters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	 
}

//POJO Example
class Pojo{
	
	public void printPOJO() {
		System.out.println("In POJO Method");
	}

}

@Component
//Spring Bean
class SpringBean{
	public void printSpringBean() {
		System.out.println("In Spring Bean");
	}
}

public class SpringFrameWorkPojoJavaBeanSpringbeanApplication {

	public static void main(String[] args) {
		
	}

}
