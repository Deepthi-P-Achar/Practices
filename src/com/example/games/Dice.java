package com.example.games;

public class Dice {
	int numberOfDice;

	public Dice(int numberOfDice) {
		super();
		this.numberOfDice = numberOfDice;
	}
	public int roll() {
		int range=(6*numberOfDice)-(1*numberOfDice)+1;
		return (int) Math.floor(Math.random()*range + 1);
		
	}

}
