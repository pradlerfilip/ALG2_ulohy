package elevengame;

/**
 * Represents the table with cards to play and a deck
 * @author janvit
 */
public class Board implements BoardInterface{
    private Card[] cards;
    private Deck deck;
    
    public Board(){
        //create deck
        //deal cards
    }
    
    @Override
    public String gameName() {
        return "Hra jedenactka";
    }
    
    @Override
    public int nCards() {
        return cards.length;
    }

    @Override
    public int getDeckSize() {
        return deck.getDeckSize();
    }
    
    @Override
    public String getCardDescriptionAt(int index){
        if(cards[index] == null){
            return " ";
        }
        return cards[index].getSymbol() + "-" + cards[index].getValue();
    }

    @Override
    public boolean anotherPlayIsPossible() {
      throw new UnsupportedOperationException("Not supported yet.");  
    }

    @Override
    public boolean playAndReplace(int[] iSelectedCards) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isWon() {
        return (deck.isEmpty() && nCards() == 0);
    }
}
