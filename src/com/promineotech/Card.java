package com.promineotech;

// This is the class for a game card

public class Card {
	
	private String name;
	private int value;
	
	
	// Let's assign a value to the card
	
	public Card(String rank, String suit) {
		super();
		this.name = rank + " of " + suit;
		
		switch (rank) {
			case "Ace":
			    this.value = 2;
			    break;
			case "Two":
				this.value = 3;
				break;
			case "Three":
				this.value = 4;
				break;
			case "Four":
				this.value = 5;
				break;
			case "Five":
				this.value = 6;
				break;
			case "Six":
				this.value = 7;
				break;
			case "Seven":
				this.value = 8;
				break;
			case "Eight":
				this.value = 9;
				break;
			case "Nine":
				this.value = 10;
				break;
			case "Ten":
				this.value = 11;
				break;
			case "Jack":
				this.value = 12;
				break;
			case "Queen":
				this.value = 13;
				break;
			case "King":
				this.value = 14;
				break;
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}	
	
	
	public void describe(Card card) {
		
		System.out.println(card.getName());
		
	}

}
