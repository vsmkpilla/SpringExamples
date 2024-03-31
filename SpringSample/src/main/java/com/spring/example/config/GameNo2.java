package com.spring.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GameNo2 implements GameStructure {
	@Bean
	public void ClickUp() {
		System.out.println("ClickedUp_GameNo2");
	}
	@Bean
	public void ClickDown() {
		System.out.println("ClickedDown_GameNo2");
	}
	@Bean
	public void ClickLeft() {
		System.out.println("ClickedLeft_GameNo2");
	}
	@Bean
	public void ClickRight() {
		System.out.println("ClickedRight_GameNo2");
	}
	
}
