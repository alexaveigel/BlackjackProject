package com.skilldistillery.card.blackjack;

import com.skilldistillery.card.common.Card;

public abstract class PlayerBase {
	private BlackjackHand hand = new BlackjackHand();
	
	public void displayHand() {
		hand.showAllCards();
	}
	
	public void addCardToHand(Card c) {
		hand.addCard(c);
	}

	public BlackjackHand getHand() {
		return hand;
	}

	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}
	public int checkHand() {
		return hand.getHandValue();
	}
	
	public void clearHand() {
		hand = null;
	}
	
}
