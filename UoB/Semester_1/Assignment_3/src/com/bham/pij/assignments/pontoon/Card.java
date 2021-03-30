package com.bham.pij.assignments.pontoon;
//Zheng Biao 2133456

import java.util.ArrayList;

public class Card {

    protected static Suit Suit;
    protected static Value Value;

    // ====================================================================================
    // constructors
    public Card() {
    }

    public Card(Card.Suit suit, Card.Value value) {
        Suit = suit;
        Value = value;
    }

    // ===================================================================================
    // Getter & Setter
    public Card.Suit getSuit() {
        return this.Suit;
    }

    public void setSuit(Card.Suit suit) {
        Suit = suit;
    }

    public Card.Value getValue() {
        return this.Value;
    }

    public void setValue(Card.Value value) {
        Value = value;
    }

// ====================================================================================

    public enum Suit {
        CLUBS, HEARTS, DIAMONDS, SPADES
    }

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

// ====================================================================================

    public ArrayList<Integer> getNumericalValue() {
        ArrayList<Integer> list = new ArrayList<>();
        Value value = this.Value;
        switch (value) {
            case ACE:
                list.add(1);
                list.add(11);
                break;
            case TWO:
                list.add(2);
                break;
            case THREE:
                list.add(3);
                break;
            case FOUR:
                list.add(4);
                break;
            case FIVE:
                list.add(5);
                break;
            case SIX:
                list.add(6);
                break;
            case SEVEN:
                list.add(7);
                break;
            case EIGHT:
                list.add(8);
                break;
            case NINE:
                list.add(9);
                break;
            case TEN:
            case JACK:
            case KING:
            case QUEEN:
                list.add(10);
                break;
        }
        return list;
    }
}
