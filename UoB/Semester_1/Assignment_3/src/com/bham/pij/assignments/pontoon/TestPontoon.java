package com.bham.pij.assignments.pontoon;

import com.bham.pij.assignments.pontoon.Card.Suit;
import com.bham.pij.assignments.pontoon.Card.Value;

import java.util.ArrayList;

public class TestPontoon {

	public static void main(String[] args) {
//		normalTest();
		advancedTest();
	}
	
	public static void showCards(ArrayList<Card> cards) {
		for (Card c:cards) {
			System.out.println(c.getSuit() + " " + c.getValue() + " " + c.getNumericalValue());
		}
	}
	public static void advancedTest() {
		Pontoon p = new Pontoon(2);

		Card c1 = new Card(Suit.CLUBS, Value.ACE);
		Card c2 = new Card(Suit.CLUBS, Value.TWO);
		Card c3 = new Card(Suit.CLUBS, Value.THREE);
		Card c4 = new Card(Suit.CLUBS, Value.FOUR);
		Card c5 = new Card(Suit.CLUBS, Value.FIVE);
		Card c6 = new Card(Suit.CLUBS, Value.SIX);
		Card c7 = new Card(Suit.CLUBS, Value.SEVEN);
		Card c8 = new Card(Suit.CLUBS, Value.EIGHT);
		Card c9 = new Card(Suit.CLUBS, Value.NINE);
		Card c10 = new Card(Suit.CLUBS, Value.TEN);
		Card cJ = new Card(Suit.CLUBS, Value.JACK);
		Card cQ = new Card(Suit.CLUBS, Value.QUEEN);
		Card cK = new Card(Suit.CLUBS, Value.KING);
		
//		p.GetPlayer(0).dealToPlayer(c1);
//		p.GetPlayer(0).dealToPlayer(c10);

		
		
		p.getPlayer(0).dealToPlayer(c10);
		p.getPlayer(0).dealToPlayer(cJ);
		p.getPlayer(0).dealToPlayer(c1);
		p.getPlayer(0).dealToPlayer(c1);
		
		p.getPlayer(1).dealToPlayer(c2);
		p.getPlayer(1).dealToPlayer(c2);
		p.getPlayer(1).dealToPlayer(c2);
		p.getPlayer(1).dealToPlayer(c2);
		p.getPlayer(1).dealToPlayer(c1);
		
		
		System.out.println("P1's hand: ");
		showCards(p.getPlayer(0).getCards());
		System.out.println(p.getPlayer(0).getNumericalHandValue());
		System.out.println(p.getPlayer(0).getBestNumericalHandValue());
		System.out.println();
		System.out.println("P2's hand: ");
		showCards(p.getPlayer(1).getCards());
		System.out.println(p.getPlayer(1).getNumericalHandValue());
		System.out.println(p.getPlayer(1).getBestNumericalHandValue());
		System.out.println();
		
		System.out.println(p.compareHands(p.getPlayer(0), p.getPlayer(1)));
		
	}
	
	
	public static void normalTest() {
		
		Card c5 = new Card(Suit.CLUBS, Value.FIVE);
		
		Pontoon p = new Pontoon(2);
		System.out.println("Plays' Name: ");
		System.out.println(p.getPlayer(0).getName());
		System.out.println(p.getPlayer(1).getName());
		System.out.println();
		
		p.getPlayer(0).dealToPlayer(c5);
		
//		p.dealInitialCards();
		System.out.println("Initialisation Complete.");
		System.out.println();
		
		System.out.println("P1's hand: ");
		showCards(p.getPlayer(0).getCards());
		System.out.println(p.getPlayer(0).getNumericalHandValue());
		System.out.println(p.getPlayer(0).getBestNumericalHandValue());
		System.out.println();
		System.out.println("P2's hand: ");
		showCards(p.getPlayer(1).getCards());
		System.out.println(p.getPlayer(1).getNumericalHandValue());
		System.out.println(p.getPlayer(1).getBestNumericalHandValue());
		System.out.println();
		
		System.out.println(p.compareHands(p.getPlayer(0), p.getPlayer(1)));
	}
}
