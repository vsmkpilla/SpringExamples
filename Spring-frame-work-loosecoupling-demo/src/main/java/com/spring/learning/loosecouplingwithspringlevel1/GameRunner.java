package com.spring.learning.loosecouplingwithspringlevel1;

import org.springframework.context.annotation.Bean;

public class GameRunner {
	public GameStructure game;
	

	public GameRunner(GameStructure game) {
		super();
		this.game = game;
	}
	@Bean
	public void runIt() {
		game.play();
	}
}
