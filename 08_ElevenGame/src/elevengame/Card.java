package elevengame;

/**
 * Represents a card
 * @author janvit
 */
public class Card {
    private String symbol; //suit
    private String value;  //rank
    private int nPoints;   //A-1, J,Q,K-0 //byte

    public Card(String symbol, String value, int nPoints) {
        this.symbol = symbol;
        this.value = value;
        this.nPoints = nPoints;
    }
    
    public String getSymbol() {
        return symbol;
    }

    public String getValue() {
        return value;
    }

    public int getnPoints() {
        return nPoints;
    }
    
}
