/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_elevengame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author filip
 */
public class Deck {
    
    private List<Card> deckCards;
    private int deckCardsSize;
    
    public Deck(List<Card> deckCards, int deckCardsSize) {
        this.deckCards = deckCards;
        this.deckCardsSize = deckCardsSize;
    }
    
    public int getDeckCardsSize(){
        return deckCardsSize;
    }
    
    
   public int getDeckSize() {
        return this.deckCards.size();
    }
   
    public static Deck packOfCards() {
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] symbols = {"srdce", "kary", "krize", "piky"};
        List<Card> pack = new ArrayList<>();
        for (String value : values) {
            for (String symbol : symbols) {
                Card card = new Card(symbol, value);
                pack.add(card);
            }

        }
        Deck balik = new Deck(pack, pack.size());
        return balik;
    }
    
    public Card pickCard() {
        if (this.deckCardsSize == 0) {
            return null;
        }
        Card card = this.deckCards.get(this.deckCardsSize - 1);  //vrátí vrchni kartu
        this.deckCardsSize--;
        return card;
    }
    
    
   

}


