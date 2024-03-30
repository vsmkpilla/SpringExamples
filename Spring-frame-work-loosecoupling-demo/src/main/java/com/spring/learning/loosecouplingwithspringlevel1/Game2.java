package com.spring.learning.loosecouplingwithspringlevel1;

import org.springframework.context.annotation.Bean;

public class Game2 implements GameStructure{
	@Bean
	public void play() {
		System.out.println("Game 2 is playing");
	}
}
