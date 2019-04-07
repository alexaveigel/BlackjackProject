package com.skilldistillery.card.blackjack;

import com.skilldistillery.card.common.Card;
import com.skilldistillery.card.common.Deck;

public class Dealer extends PlayerBase {
	private Deck d;
	public void printHiddenHand() {
		System.out.println("\n\nDealer hand: \nXXXXX of XXXXX\n" + getHand().getCards().get(1));
	}

	public Dealer() {
		d = new Deck();
		d.shuffle();

	}
	
	public Card dealCard() {
		return d.getCard();
	}
	

	public void dealerHit() {
		if (checkHand() < 17) {
			addCardToHand(d.getCard());
		}else if(checkHand() >= 17) {
			//dealer stays
		}

	}
}
