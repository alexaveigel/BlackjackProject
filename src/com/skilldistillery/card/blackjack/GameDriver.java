package com.skilldistillery.card.blackjack;

import java.util.Scanner;

import com.skilldistillery.card.common.Deck;

public class GameDriver {
	Scanner sc = new Scanner(System.in);
	
	public void launch() {
		
		System.out.println("Welcome to Blackjack.\nWould you like to play?\n1. Yes\n2. No\n3. Quit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			initRound();
			break;
		case 2:
			System.err.println("Too bad, you're playing anyways.");
			
			break;
		case 3:
			System.exit(0);
		}
	}
	
	public void initRound() {
		Deck d = new Deck();
		BlackjackHand dealerHand = new BlackjackHand();
		BlackjackHand userHand = new BlackjackHand();
		d.shuffle();
		
		dealerHand.addCard(d.dealCard());
		dealerHand.addCard(d.dealCard());
		userHand.addCard(d.dealCard());
		userHand.addCard(d.dealCard());
		
		System.out.println(dealerHand.printDealerHand());
		System.out.println(userHand.printUserHand());
		
	}
	
	public void menu() {
		
		
		
		
		
		
		
		
	sc.close();	
	}


	

}