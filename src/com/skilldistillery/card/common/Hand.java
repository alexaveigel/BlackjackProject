package com.skilldistillery.card.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	private int value;
	private List<Card> hand = new ArrayList<Card>();

	public Hand() {

	}

	public int getHandValue() {

		return value;
	}

	public void addCard(Card c) {
		hand.add(c);
		value += c.getValue();
	}

	public void clearHand() {
		hand = null;
	}

	public List<Card> getCards() {
		return hand;

	}
	public void showAllCards() {
		for (Card card : hand) {
			System.out.println(card);
		}
	}

	@Override
	public String toString() {
		return "Hand: " + hand;
	}

}
