package com.bham.pij.assignments.pontoon;

// Zheng Biao 2133456

import com.bham.pij.assignments.pontoon.Card.Value;

import java.util.ArrayList;

public class Player {

// ==========================================================

    protected String name;

    // players' name constructor
    public Player(String name) {
        this.name = name;
    }

    public Player() {

    }

    // return name
    public String getName() {
        return name;
    }

    // set players' name
    public void setName(String name) {
        this.name = name;
    }

// ==========================================================

    // cards in hand
    public ArrayList<Card> hand = new ArrayList<>();

    // cards in hand method
    public ArrayList<Card> getCards() {
        return this.hand;
    }

    // how many cards in hand
    public int getHandSize() {
        return this.hand.size();
    }

    // remove card from hand
    public void removeCard(Card card) {
        this.hand.remove(card);
    }

    // add cards in players' hand
    public void dealToPlayer(Card card) {
        this.hand.add(card);
    }

// ==========================================================

    public ArrayList<Integer> values = new ArrayList<>(); // add all value of cards which in hand

    // return possible values & decide ACE = 1 or 11
    public ArrayList<Integer> getNumericalHandValue() {

        int ACE_counter = 0;
        int consequence = 0;

        for (Card currentCard : hand) {
            if (currentCard.getValue() == Value.ACE) {
                ACE_counter++;
            } else {
                consequence += currentCard.getNumericalValue().get(0);
            }
        }

        // Multi ACE
        BinaryTree binaryTree = new BinaryTree();
        ArrayList<Integer> aces = binaryTree.PossibleResultDegree(ACE_counter);

        ArrayList<Integer> cards_in_hand = new ArrayList<>(aces);


        if (aces.size() == 0) {
            cards_in_hand.add(consequence);
        } else {
            for (int i = 0; i < aces.size(); i++) {
                cards_in_hand.set(i, (aces.get(i) + consequence));
            }
        }

        values.clear();
        values = cards_in_hand;

        return cards_in_hand;
    }

// ==========================================================

    // return max value of cards in hand
    public int getBestNumericalHandValue() {

        ArrayList<Integer> lovely_result = new ArrayList<>();
//        for (Integer value : values) {
//            if (value <= 21) {
//                lovely_result.add(value);
//            }
//        }
//        Collections.sort(lovely_result);
//        values = lovely_result;
        return values.get(values.size() - 1);
    }
}
