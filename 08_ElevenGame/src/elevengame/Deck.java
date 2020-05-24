package elevengame;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a deck //balicek karet
 * @author janvit
 */
public class Deck {
    //do not have to change during the game, deckSize can simulate removing the cards
    private List<Card> deckCards; 
    private int deckSize; //actual deck size
    
    public Deck(String[] symbols, String[] values, int[] nPoints){
        deckCards = new ArrayList<>();
        generateAllCards(symbols, values, nPoints);
        shuffle();
    }
    /**
     * Generate List of all cards e.g. using DataStore class with arrays of symbols, values, nPoints
     */
    private void generateAllCards(String[] symbols, String[] values, int[] nPoints){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Shuffle list of cards
     * An algorithm to permute an array.
     */
    private void shuffle(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Deal one card
     * Get the card at deckSize-1 index and decrement deckSize by one 
     * @return the dealt card, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getDeckSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
