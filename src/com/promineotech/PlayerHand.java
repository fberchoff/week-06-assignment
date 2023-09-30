package com.promineo.tech;

// This class represents a player's hand of cards

import java.util.ArrayList;
import java.util.List;

public class PlayerHand {
	
	
	private List<Card> cards = new ArrayList<>();
	

	public PlayerHand() {
	}

	
	public List<Card> getCards() {
		return cards;
	}
	

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	// This is used to flip the top card of a hand
	
	public Card flip() {
		return cards.remove(0);
	}
	
	
	// This method will print out all the cards of a given hand
	
	public void describe() {
		
		for (Card card : this.cards) {
			card.describe(card);			
		}
	}
	

}
