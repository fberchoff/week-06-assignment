package com.promineo.tech;

/* This app simulates a game of War between two players.
 * Over 26 rounds, each player will flip a card.  The player who flips the card
 * with the higher value wins the round. The player who wins the most rounds wins the game.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
				
		// Let's put out a welcome message
		
		System.out.println("Welcome to the game of War.");
		System.out.println("\nLet's first find out who's playing.  Please enter the name of Player 1:");
		

		// Next, let's collect each player's name and create each player
		
		Scanner input = new Scanner(System.in);
		
		String playerName = input.nextLine();
		
		Player player1 = new Player(playerName);
		
		
		System.out.println("\nNext, please state the name of Player 2:");
		
		playerName = input.nextLine();
		
		Player player2 = new Player(playerName);
		
		System.out.println("\nOkay, great!  It's " + player1.getName() + " vs " + player2.getName() +".");
		System.out.println("\nLet's get started!");
		
		input.close();
		
		
		// Let's create the deck of cards and shuffle the deck
		
		Deck deck = new Deck();
		
		System.out.println("\nFirst, let's shuffle the deck...");
		
		deck.shuffle();
		
		
		// Now we will create a list of cards for each player and deal out the cards
		
		List<Card> player1Cards = new ArrayList<>();
		List<Card> player2Cards = new ArrayList<>();
		
		System.out.println("\nDeck is shuffled. Now let's deal the cards...");
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1Cards.add(deck.draw());
			}
			else
				player2Cards.add(deck.draw());
		}
		
		
		// Let's create a hand for each player that consists of half the deck each
		
		player1.setHand(player1Cards);
		player2.setHand(player2Cards);
		
		
		// Now let's show the hand of each player
		
		//First, player 1
		
		System.out.println("\nThe cards have been dealt. Let's take a peek at what each player has...");
		
		System.out.println("\n" + player1.getName() + "'s cards:\n");
		
		player1.describeHand();
		
		
		// Next, player 2
		
		System.out.println("\n\n" + player2.getName() + "'s cards:\n");
		
		player2.describeHand();
		
		
		System.out.println("\n\nOkay, so the players have their hands.  Lets Go!");
		
		
		/* We will now loop through 26 rounds of the game (half the full deck)
		 * 
		 * Each player will flip a card and we will determine the winner of the round
		 */
		
		for (int r=0; r < 26; r++) {
			System.out.println("\n\nContestants, flip your cards!");
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			System.out.println("\n" + player1.getName() + " has '" + player1Card.getName()
			              + "' and " + player2.getName() + " has '" + player2Card.getName() + "'.");
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println("\n" + player1.getName() + " wins the round!");
			}
			else
				if (player2Card.getValue() > player1Card.getValue()) {
					player2.incrementScore();
					System.out.println("\n" + player2.getName() + " wins the round!");
				}
				else {
					System.out.println("\nThe round is a draw.");
				}
			// If this isn't the last round, let's show the current score
			if (r < 25) {				
				System.out.println("\nThe score is now:");
				System.out.println("     " + player1.getName() + "\t" + player1.getScore());
				System.out.println("     " + player2.getName() + "\t" + player2.getScore());
			}
		}
		
		
		/* Let's keep a variable that will hold the name of the game winner.
		 * If nobody wins, this variable will stay blank
		 */
		
		String winner = "";
		
		
		// Let's announce the outcome of the game and the final score
		
		System.out.print("\n\nThe game is over and ");
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins the game!");
			winner = player1.getName();
			}
		else {
			if (player2.getScore() > player1.getScore()) {
				System.out.println(player2.getName() + " wins the game!");
				winner = player2.getName(); 
			}
			else {
				System.out.println("it ends in a draw.");
				}
			}
			
		System.out.println("\nThe final score is:");
		System.out.println("     " + player1.getName() + "\t" + player1.getScore());
		System.out.println("     " + player2.getName() + "\t" + player2.getScore());
		
		
		// If there was a winner, let's offer congratulations
			
		if (!winner.isBlank()) {
			System.out.println("\nCongratulations, " + winner + "!");
			}
		
	}
}
