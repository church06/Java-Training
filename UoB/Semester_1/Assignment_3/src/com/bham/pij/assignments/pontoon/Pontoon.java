package com.bham.pij.assignments.pontoon;

// Zheng Biao 2133456

public class Pontoon extends CardGame {

    @Override
    public int getNumPlayers() {
        return super.getNumPlayers();
    }

    @Override
    public Player getPlayers(int i) {
        return super.getPlayers(i);
    }

    @Override
    public Deck getDeck() {
        return super.getDeck();
    }

    @Override
    public void setNumPlayers(int numPlayers) {
        super.setNumPlayers(numPlayers);
    }

    @Override
    public void setPlayers(int players) {
        super.setPlayers(players);
    }

    @Override
    public void setDeck(Deck deck) {
        super.setDeck(deck);
    }

    public Pontoon(int nplayers) {
        super(nplayers);
    }

    @Override
    public void dealInitialCards() {

        for (int i = 0; i < getNumPlayers(); i++) {
            getPlayers(i).dealToPlayer(getDeck().dealRandomCard());
            getPlayers(i).dealToPlayer(getDeck().dealRandomCard());
        }

    }

    @Override
    public int compareHands(Player hand1, Player hand2) {

        int hand1_best = 0;
        int hand2_best = 0;


        for (int i = 0; i < hand1.getNumericalHandValue().size(); i++) {
            int best = hand1.getNumericalHandValue().get(i);
            if (hand1_best > best) {
                hand1_best = best;
            }
        }

        for (int i = 0; i < hand2.getNumericalHandValue().size(); i++) {
            int best = hand2.getNumericalHandValue().get(i);
            if (hand1_best > best) {
                hand2_best = best;
            }
        }

        return Integer.compare(hand2_best, hand1_best);
    }

    @Override
    public Player getPlayer(int i) {
        return players.get(i);
    }


}
