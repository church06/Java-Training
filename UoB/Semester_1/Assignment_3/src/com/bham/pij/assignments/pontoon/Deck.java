package com.bham.pij.assignments.pontoon;
// Zheng Biao 2133456

import com.bham.pij.assignments.pontoon.Card.Suit;
import com.bham.pij.assignments.pontoon.Card.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    protected ArrayList<Card> Card;

    // Setter
    public void setCard(ArrayList<Card> card) {
        Card = card;
    }

// Getters =====================================================

    public ArrayList<Card> getCard() {
        return Card;
    }

// =============================================================

    public Deck() {
        Card = new ArrayList<>();
        for (Suit suits : Suit.values()) {
            for (Value values : Value.values()) {
                Card card = new Card(suits, values);
                Card.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(Card);
    }

    public void reset() {
        Card.clear();
        for (Suit suits : Suit.values()) {
            for (Value values : Value.values()) {
                Card card = new Card(suits, values);
                Card.add(card);
            }
        }
    }

// =============================================================


    public Card dealRandomCard() {
        Random r = new Random();
        int card_position = r.nextInt(Card.size());
        Card card = Card.get(card_position);
        Card.remove(card_position);
        return card;
    }

    public int size() {
        return Card.size();
    }

}
