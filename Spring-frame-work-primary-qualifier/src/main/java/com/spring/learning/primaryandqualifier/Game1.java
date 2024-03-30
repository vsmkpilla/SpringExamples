package com.spring.learning.primaryandqualifier;

import org.springframework.context.annotation.Bean;

public class Game1 implements GameStructure{
	@Bean
	public void play() {
		System.out.println("Game 1 is playing");
	}
}
