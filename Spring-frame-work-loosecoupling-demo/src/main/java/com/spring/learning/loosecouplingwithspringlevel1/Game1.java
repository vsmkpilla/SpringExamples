package com.spring.learning.loosecouplingwithspringlevel1;

import org.springframework.context.annotation.Bean;

public class Game1 implements GameStructure{
	@Bean
	public void play() {
		System.out.println("Game 1 is playing");
	}
}
