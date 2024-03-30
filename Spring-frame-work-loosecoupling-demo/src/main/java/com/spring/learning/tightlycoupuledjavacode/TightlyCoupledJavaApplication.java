package com.spring.learning.tightlycoupuledjavacode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class TightlyCoupledJavaApplication {

	public static void main(String[] args) {
		Game1 game1 = new Game1();
		//Here we have to update the game class everytime whenever we want to update the game.Hence actual application is being effected
		GameRunner GRun = new GameRunner(game1);
		GRun.runIt();
		
	}

}
