
package pkg08_elevengame;

/**
 *
 * @author filip
 */
public class Card {
    // data
    private String symbol; //suit
    private String value; //rank
    private int nPoints; // A-1, J,Q,K-0 //byte
    
     public Card(String symbol, String value) {
        this.symbol = symbol;
        this.value = value;
    }
    
    public String getSymbol()
    {
     return symbol;
    }
    
     @Override
    public String toString() {
        return "Card[" +  symbol + " " + value + " " + nPoints + "]";
    }
    
    public String getValue()
    {
     return value;
    }    

    public int getnPoints() {
        return nPoints;
    }
        
     public int pointsForValue(String value) {
        switch (value) {
            case "A":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            default:
                return 0;

        } 
    }
}
