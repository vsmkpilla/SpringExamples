package com.spring.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class GameNo1 implements GameStructure{
	
	@Bean
	public void ClickUp() {
		System.out.println("ClickedUp_GameNo1");
	}
	@Bean
	public void ClickDown() {
		System.out.println("ClickedDown_GameNo1");
	}
	@Bean
	public void ClickLeft() {
		System.out.println("ClickedLeft_GameNo1");
	}
	@Bean
	public void ClickRight() {
		System.out.println("ClickedRight_GameNo1");
	}
	
}
