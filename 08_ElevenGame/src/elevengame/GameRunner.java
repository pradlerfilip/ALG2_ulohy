package elevengame;

/**
 * Runs GUI or ConsolaUI
 * @author janvit
 */
public class GameRunner {
    
    public static void main(String[] args) {
        ConsolaUI game = new ConsolaUI();
        //GUI game = new GUI();
        game.start();
    }
}
