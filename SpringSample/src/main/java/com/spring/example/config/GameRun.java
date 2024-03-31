package com.spring.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class GameRun {

	private GameStructure game;
	public GameRun(GameStructure game) {
		super();
		this.game = game;
	}
	@Bean
	public void run() {
		game.ClickDown();
		game.ClickUp();
		game.ClickLeft();
		game.ClickRight();
	}
	
}
