package com.spring.learning.primaryandqualifier;

import org.springframework.context.annotation.Bean;

public class Game2 implements GameStructure{
	@Bean
	public void play() {
		System.out.println("Game 2 is playing");
	}
}
