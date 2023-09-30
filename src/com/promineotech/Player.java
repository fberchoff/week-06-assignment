package com.promineo.tech;

// This class represents a player

import java.util.List;

public class Player {
	
	
	// This is the player's name
	
	private String name;
	
	
	// Each player will be dealt a hand of cards.
	
	private PlayerHand hand = new PlayerHand();
	
	
	//  Each player will have a score
	
	private int score;
	

	public Player(String name) {
		super();
		
		this.name = name;
		this.score = 0;
		
	}

	
	// This will return back a player's hand of cards
	
	public List<Card> getHand() {
		return this.hand.getCards();
	}

	
	// This will be used to establish a player's hand of cards
	
	public void setHand(List<Card> hand) {
		this.hand.setCards(hand);
	}	
	
	
	// This method is used to flip the top card of a player's hand
	
	public Card flip() {
		return this.hand.flip();
	}
	
	
	// This method is used to print out the player's hand
	
	public void describeHand() {
		this.hand.describe();
	}

	
	public int getScore() {
		return score;
	}

	
	public void setScore(int score) {
		this.score = score;
	}

	
	public String getName() {
		return name;
	}
	
	
	public void incrementScore() {
		score++;
	}
	
}
