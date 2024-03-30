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


@Component
class NormalClass{
	
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ProtoTypeClass{
	
}



@Configuration
@ComponentScan
public class ScopeNormalProtoTypeApplication {

	public static void main(String[] args) {
		var cxt = new AnnotationConfigApplicationContext(ScopeNormalProtoTypeApplication.class);
		
		System.out.println(cxt.getBean(NormalClass.class));
		System.out.println(cxt.getBean(NormalClass.class));
		System.out.println();
	System.out.println(cxt.getBean(ProtoTypeClass.class));
	System.out.println(cxt.getBean(ProtoTypeClass.class));
		
	}

}
