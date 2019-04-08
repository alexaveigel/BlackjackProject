package com.skilldistillery.card.blackjack;

import com.skilldistillery.card.common.Card;
import com.skilldistillery.card.common.Deck;

public class Dealer extends PlayerBase {
	private Deck d;
	GameDriver g = new GameDriver();

	public void printHiddenHand() {
		System.out.println("\n\nDealer hand: \nXXXXX of XXXXX\n" + getHand().getCards().get(1));
	}

	public Dealer() {
		d = new Deck();
		d.shuffle();

	}

	public void printDealerHand() {
		System.out.println("Dealer hand: ");
		super.displayHand();
	}

	public Card dealCard() {
		return d.getCard();
	}

	public void dealerHit() {
		boolean b = true;
		while (b) {
			if (checkHand() > 21) {
				System.out.println("Dealer bust, you win.\n");
				b = false;
				g.launch();
			} else if (checkHand() < 17) {
				addCardToHand(d.getCard());
				System.out.println("\n");
				printDealerHand();
				
			} else if (checkHand() >= 17) {
				// dealer stays
				System.out.println("The dealer stays.\n");
				b = false;

			}
		}
	}
}
