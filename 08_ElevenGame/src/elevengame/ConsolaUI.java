package elevengame;

import java.util.Scanner;

/**
 * UI for card games e.g. Eleven game
 * @author janvit
 */
public class ConsolaUI {
    public static Scanner sc = new Scanner(System.in);
    
    private BoardInterface board;
    
    public void start() {
        boolean nextGame = true;
        while (nextGame){
            board = new Board(); //connect UI with the game logic
            playGame();
            System.out.println("Chceš hrát znova? a/n");
            nextGame = sc.next().equalsIgnoreCase("a");
        }
    }
    
    private void playGame(){
        System.out.println("***************** "+ board.gameName() + " ********************");
        displayDeck();
        displayCards();
        while(board.anotherPlayIsPossible()){
            System.out.println("Vyběr karty:");
            String[] selectedCards = sc.nextLine().split(" +"); //separator is one or more spaces
            int[] iSelectedCards = toInt(selectedCards); //changes String positions to int indexes
            if (board.playAndReplace(iSelectedCards)){
                displayDeck();
                displayCards();
            } else {
                System.out.println("Nevalidní tah");
            }
        }
        if (board.isWon()){
            System.out.println("Gratuluju!");
        } else {
            System.out.println("Nelze hrát");
        }
    }

    private void displayCards() {
        for (int i = 0; i < board.nCards(); i++) {
            System.out.format("%1d. %10s   ", i+1, board.getCardDescriptionAt(i));
            System.out.println("");
        }
    }

    private void displayDeck() {
        System.out.println("V balicku je " + board.getDeckSize() + " karet");
    }

    private int[] toInt(String[] selectedCards) {
        int[] iSelectedCards = new int[selectedCards.length];
        for (int i = 0; i < selectedCards.length; i++) {
            iSelectedCards[i] = Integer.parseInt(selectedCards[i]) - 1; //position to index
        }
        return iSelectedCards;
    }
}
