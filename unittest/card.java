package unittest;

import unittest.*;

// use /** */ for JavaDoc (documentation)
public class card {    
    private int suit;
    private int rank;

    /**
     * Constructor (method to init object) to create a new card
     * https://www.javatpoint.com/constructor
     * @param card (int): zero indexed cards counting from 0-51
     */
    public card(int card) {
        rank = card % 13;
        suit = (card / 13) % 4;
    }

    /**
     * Constructor to create a new card
     * polymorphism/overloading
     * @param rank (int): representation of the rank
     * @param suit (int): representation of the suit
     */
    public card(int rank, int suit ) {
        this.suit = suit % 4;
        this.rank = rank % 13;
    }
 
    /**
     * Get rank of the card
     * @return rank (int) of card
     */
    public int rank() { return rank; }
    
    /** 
     * Get suit of the card
     * @return suit (int) of the card
     */
    public int suit() { return suit; }

    
    /**
     * Compares two cards for suit
     * @param card2 (Card): the card to compare to this card
     * @return true if same suit, false otherwise
     */
    public boolean sameSuit(card card2) {
        return (this.suit == card2.suit);
    }
    
    /**
     * Compares two cards for rank
     * @param card2 (Card): the card to compare to this card
     * @return true if the same rank, false otherwise
     */
    public boolean sameRank(card card2) {
        return (this.rank == card2.rank);
    }
    
    /**
     *  Compares two cards for suit and rank
     * @param card2 (Card): the card to compare to this card
     * @return true if they are the same card
     */
    public boolean sameCard(card card2) {
        return (this.sameRank(card2) && this.sameSuit(card2));
    }
    
    /** 
     * Returns the difference in ranking between two cards
     * @param card2 (Card): the card to compare to this card
     * @return an integer difference between this card and c
     */
    public int rankDiff(card card2) {   
        return (this.rank - card2.rank);
    }
    
    /**
     * Converts the card to a string format for printing
     * @return the card's representation as a string
     */
    @Override //toString is a built-in fxn
    public String toString() {
        String ranks = "23456789TJQKA";
        String suits =  "\u2663\u2666\u2665\u2660"; //unicode symbols for suits;
        return ranks.charAt(rank) + "" + suits.charAt(suit);
    }

}