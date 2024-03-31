package com.spring.example;

import org.springframework.stereotype.Component;

@Component
public class Game2 implements GameStructure {

	@Override
	public void up() {
		System.out.println("2_Up");
		
	}

	@Override
	public void down() {
		System.out.println("2_down");
		
	}

	@Override
	public void left() {
		System.out.println("2_left");
	}

	@Override
	public void right() {
		System.out.println("2_right");
		
	}
	
}
