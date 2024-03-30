package com.spring.learning.tightlycoupuledjavacode;

public class GameRunner {
	public Game1 game; //Game Runner is Stick to Specific game. hence we need to make changes at multiple places to shift b/w two or more games

	public GameRunner(Game1 game) {
		super();
		this.game = game;
	}
	
	public void runIt() {
		game.play();
	}
}
