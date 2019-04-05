package com.skilldistillery.card.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.card.common.Card;
import com.skilldistillery.card.common.Hand;

public class BlackjackHand extends Hand{
	List<Card> hand = new ArrayList<Card>();
	public BlackjackHand() {
		
	}
	public int getHandValue() {
		return 0;
		
	}
	public String printDealerHand() {
		return "Dealer hand: " + hand.get(0);
	}
	public String printUserHand() {
		return "User hand: " + hand;
	}

}
