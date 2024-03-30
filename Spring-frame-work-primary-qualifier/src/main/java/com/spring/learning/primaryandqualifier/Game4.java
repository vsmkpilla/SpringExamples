package com.spring.learning.primaryandqualifier;

import org.springframework.context.annotation.Bean;

public class Game4 implements GameStructure{
	@Bean
	public void play() {
		System.out.println("Game 4 is playing");
	}
}
