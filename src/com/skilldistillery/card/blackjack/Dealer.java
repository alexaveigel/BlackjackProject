package com.skilldistillery.card.blackjack;

public class Dealer extends PlayerBase {

	public void printHiddenHand() {
		System.out.println("\n\nDealer hand: \nXXXXX of XXXXX\n" + getHand().getCards().get(1));
	}
}
