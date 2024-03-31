package com.spring.example;

import org.springframework.stereotype.Component;

@Component
public class GameRun {
	private GameStructure game;
	
	public GameRun(GameStructure game) {
		this.game=game;
	}
	
	public void run() {
		game.down();
		game.up();
		game.left();
		game.right();
	}
	
}
