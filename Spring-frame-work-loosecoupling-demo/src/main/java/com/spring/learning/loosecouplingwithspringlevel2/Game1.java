package com.spring.learning.loosecouplingwithspringlevel2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component

public class Game1 implements GameStructure{
	
	public void play() {
		System.out.println("Game 1 is playing");
	}
}
