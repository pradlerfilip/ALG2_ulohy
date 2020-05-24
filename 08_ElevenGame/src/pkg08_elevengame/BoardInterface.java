
package pkg08_elevengame;

/**
 *
 * @author filip
 */
public interface BoardInterface {
    public String getName();
    
    public int nCards();
    
    public int getDeckSize();
    
    public String getCardsDescriptionAt(int index);
    
    public boolean isAnotherPlayPossible();
    
    public boolean playAndReplace(String[] selectedCardsPositions);
    
    public boolean hasWon();
    
}
