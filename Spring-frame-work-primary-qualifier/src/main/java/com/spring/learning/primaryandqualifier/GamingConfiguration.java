package com.spring.learning.primaryandqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration{
	
	@Bean
	@Primary
	public GameStructure game1() {
		return new Game1();
	}
	
	@Bean
	@Qualifier("Game1Qualifier")
	public GameStructure game1_1() {
		return new Game1();
	}
	
	@Bean
	public GameStructure game2() {
		return new Game2();
	}
	@Bean
	@Qualifier("Game3Qualifier")
	public GameStructure game3() {
		return new Game3();
	}
	@Bean
	@Qualifier("Game4Qualifier")
	public GameStructure game4() {
		return new Game4();
	}
	
	
	@Bean
	public GameRunner gRun(GameStructure game) {
		return new GameRunner(game);
	}
	@Bean
	@Primary
	public GameRunner gRun2(@Qualifier("Game1Qualifier") GameStructure game) {
		return new GameRunner(game);
	}
	@Bean("GRUN1")

	public GameRunner gRun1(@Qualifier("Game3Qualifier") GameStructure game3) {
		return new GameRunner(game3);
	}
	
	
}