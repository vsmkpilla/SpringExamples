package com.spring.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Game1 implements GameStructure {

	@Override
	public void up() {
		System.out.println("1_Up");
		
	}

	@Override
	public void down() {
		System.out.println("1_down");
		
	}

	@Override
	public void left() {
		System.out.println("1_left");
	}

	@Override
	public void right() {
		System.out.println("1_right");
		
	}
	
}
