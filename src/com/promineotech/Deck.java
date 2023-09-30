package com.promineo.tech;

// This class represents a deck of cards

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<>();
	
	
	// Let's build the deck of cards.
	
	private String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven",
			                    "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	

	public Deck() {
		super();
		
		for (String rank : ranks) {
			for (String suit : suits) {
				cards.add(new Card(rank, suit));
			}
		}
		
	}	
	
	
	public List<Card> getCards() {
		return cards;}


	public void shuffle() {
		
		Collections.shuffle(cards);
		
	}
	
	public Card draw() {
		
		return cards.remove(0);
		
	}
	
	

}
