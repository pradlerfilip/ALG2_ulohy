
package pkg08_elevengame;

import java.util.Scanner;

/**
 *
 * @author filip
 */
public class Main {

    
    public static Scanner sc = new Scanner(System.in);
    public static BoardInterface board;
    
    public static void main(String[] args) {
       Board board = new Board();
        System.out.println("******* " + board.getName() + "*********");
        
        displayCards(board);
        displayDeck(board);
        
        while(board.isAnotherPlayPossible()){
            
        System.out.println("Vyber karty");
        String[] selectedCardsPositions = sc.nextLine().split(" +");
        if(!board.playAndReplace(selectedCardsPositions)){
            System.out.println("Nevalidni tah");
        }
        else{
          displayCards(board);
          displayDeck(board);
        }
    }
        
    if(board.hasWon()){
        System.out.println("Gratuluji");
    }
            else
    {
        System.out.println("nelze hrat");   
    }
   
   }

    private static void displayCards(BoardInterface board) {
        for (int i=0; i < board.nCards();i++)
        {
            System.out.format("%1d. %10s   " , i+1, board.getCardsDescriptionAt(i));
            if((i+1) % 3 == 0){
                System.out.println();
            }
        }
    }

    private static void displayDeck(BoardInterface board) {
        System.out.println("V balicku je " + board.getDeckSize() +"karet");
    }
    
}
