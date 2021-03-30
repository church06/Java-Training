package com.bham.pij.assignments.pontoon;
// Zheng Biao 2133456
import java.util.ArrayList;

public abstract class CardGame {

    protected int NumPlayers;
    protected int Players;
    Deck deck;

    // ============================================================================
    // Getters
    public int getNumPlayers() {
        return NumPlayers;
    }

    public Player getPlayers(int i) {
        return players.get(i);
    }

    public Deck getDeck() {
        return deck;
    }


    // Setters
    public void setNumPlayers(int numPlayers) {
        NumPlayers = numPlayers;
    }

    public void setPlayers(int players) {
        Players = players;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }


    // Constructors
    ArrayList<Player> players = new ArrayList<>();

    public CardGame(int nplayers) {
        NumPlayers = nplayers;
        for (int i = 0; i < NumPlayers; i++) {
            Player player = new Player(String.valueOf((char) (65 + i)));
            players.add(player);
        }
        deck = new Deck();
        deck.shuffle();
    }
// ============================================================================

    public abstract void dealInitialCards();

    public abstract int compareHands(Player hand1, Player hand2);

    public abstract Player getPlayer(int i);

    // ============================================================================

}
