package com.spring.learning.loosecouplingwithspringlevel1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.learning.loosecouplingwithinterfaces.Game1;
import com.spring.learning.loosecouplingwithinterfaces.GameRunner;
import com.spring.learning.loosecouplingwithinterfaces.GameStructure;

@Configuration
public class GamingConfiguration{
	
	@Bean
	public GameStructure game() {
		return new Game1();
	}
	
	@Bean
	public GameRunner gRun(GameStructure game) {
		return new GameRunner(game);
	}
	

	
}