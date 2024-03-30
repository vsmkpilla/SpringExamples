package com.spring.learning.loosecouplingwithinterfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class LooseCouplingWithInterfacesApplication {

	public static void main(String[] args) {
		GameStructure game = new Game1(); //Here we just need to tell which game we want to use.Only a Single Change 
		GameRunner gRun = new GameRunner(game);
		gRun.runIt();
	}

}
