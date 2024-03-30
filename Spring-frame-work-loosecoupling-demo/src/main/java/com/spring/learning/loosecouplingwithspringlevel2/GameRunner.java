package com.spring.learning.loosecouplingwithspringlevel2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class GameRunner {
	public GameStructure game;

	public GameRunner(GameStructure game) {
		super();
		this.game = game;
	}
	
	public void runIt() {
		game.play();
	}
}
