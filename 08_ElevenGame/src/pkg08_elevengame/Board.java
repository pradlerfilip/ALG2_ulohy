/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_elevengame;

/**
 *
 * @author filip
 */
public class Board implements BoardInterface {
    Card[] cards; // 9 karet na stole
    Deck[] deck; // balicek na stole


    @Override
    public String getName() {
        return "Hra jedenacka";
    }
    
    @Override
    public int nCards(){
        return cards.length;
    }

    @Override
    public int getDeckSize() {
        return 43;
    }
      

    @Override
    public String getCardsDescriptionAt(int index) {
        return cards[index].getSymbol()+cards[index].getValue();
    }

    @Override
    public boolean isAnotherPlayPossible() { // jestli jsou karty v balicku, pokud existuje JQK nebo sum 11
        
        int jqk = 0;
        int nEmpty = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                nEmpty++;
            } else {
                if (cards[i].getnPoints() == 0) {
                    jqk++;
                }
                for (int j = i + 1; j < cards.length; j++) {
                    if (i < cards.length - 1 && cards[j] != null && cards[i].getnPoints() + cards[j].getnPoints() == 1) {
                        return true;
                    }
                }
            }
        }
        if(jqk>2)
        {
            return true;
        }
        else
        {
            return false;
        }
        
       
    }

    @Override
    public boolean playAndReplace(String[] selectedCardsPositions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasWon() {
        return deck.getDeckSize() == 0;
    }
        
}
