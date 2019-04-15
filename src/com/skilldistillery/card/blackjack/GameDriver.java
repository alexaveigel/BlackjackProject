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
		checkFor21();
		menu();
	}

	public void checkForWin() {
		if (player.checkHand() > dealer.checkHand()) {
			System.out.println("\nYou win!\n");
		} else if (dealer.checkHand() > player.checkHand()) {
			System.out.println("\nSorry, you lost!\n");
		} else {
			System.out.println("\nIts a draw.\n");
		}
	}

	public void checkFor21() {

		if (player.checkHand() == 21) {
			System.out.println("\nYou win!\n");
			launch();
		} else {

		}
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
					if (player.checkHand() < 21) {
						menu();

					} else if (player.checkHand() > 21) {
						System.out.println("\nSorry, you lost.\n");
						launch();
					} else if (player.checkHand() == 21) {
						System.out.println("\nYou win!\n");
						launch();
					}
					b = false;
					break;
				case 2:
					System.out.println("\nYou stayed.");
					System.out.println("\n");
					player.printPlayerHand();
					System.out.println("\n");
					dealer.printDealerHand();
					dealer.dealerHit();
					checkForWin();
					launch();
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
