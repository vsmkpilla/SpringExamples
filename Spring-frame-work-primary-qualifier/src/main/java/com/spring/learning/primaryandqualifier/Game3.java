package com.spring.learning.primaryandqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Game3 implements GameStructure{
	@Bean
	public void play() {
		System.out.println("Game 3 is playing");
	}
}
