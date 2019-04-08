package com.skilldistillery.card.blackjack;

public class Player extends PlayerBase{
	GameDriver g = new GameDriver();
	public void printPlayerHand() {
		System.out.println("Player hand: ");
		super.displayHand();
	}
	

}
