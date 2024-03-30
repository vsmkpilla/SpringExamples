package com.spring.learning.loosecouplingwithspringlevel2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class Game2 implements GameStructure{
	
	public void play() {
		System.out.println("Game 2 is playing");
	}
}
