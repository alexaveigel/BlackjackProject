package com.skilldistillery.card.blackjack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDriver {
	private Player player;
	private Dealer dealer;
	
	
	
	Scanner sc = new Scanner(System.in);

	public void launch() {
		boolean b = true;
		int choice = 0;
		System.out.println("Welcome to Blackjack.\n");
		while (b) {
			try {
				System.out.println("Would you like to play?\n1. Yes\n2. No\n3. Quit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					initRound();
					b = false;
					break;
				case 2:
					System.err.println("Too bad, you're playing anyways.");
					initRound();
					b = false;
					break;
				case 3:
					System.exit(0);
				default:
					System.err.println("Enter a number from the list.\n");
				}
				
			} catch (InputMismatchException e) {
				System.err.println("Enter a number.\n");
				sc.nextLine();
			}
		}
	}

	public void initRound() {
		player = new Player();
		dealer = new Dealer();
		
		System.out.println("\nDealing hand...\n");
		player.addCardToHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());
		player.addCardToHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());

		player.printPlayerHand();
		dealer.printHiddenHand();
		menu();
	}

	public void menu() {
		boolean b = true;
		int choice = 0;
		while (b) {
			try {
				System.out.println("\nWhat would you like to do?\n1. Hit\n2. Stay\n3. Quit");
				choice = sc.nextInt();
				System.out.println("\n");
				switch (choice) {
				case 1:
					player.addCardToHand(dealer.dealCard());
					player.printPlayerHand();
					b = false;
					break;
				case 2:
					System.out.println("You stayed.");
					b = false;
					break;
				case 3:
					System.exit(0);
				default:
					System.err.println("Enter a number from the list.\n");
				}
				
			} catch (InputMismatchException e) {
				System.err.println("Enter a number.\n");
				sc.nextLine();
			}
		}
		

		sc.close();
	}

}
