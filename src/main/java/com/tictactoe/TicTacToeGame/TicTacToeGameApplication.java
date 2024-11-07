package com.tictactoe.TicTacToeGame;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeGameApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TicTacToeGameApplication.class, args);
	}
	public void run(String... args) throws Exception {
		System.out.print("TicTacToeGameApplication");

		}


}
