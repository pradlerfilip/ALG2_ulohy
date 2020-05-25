/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUI;

/**
 *
 * @author filip
 */
public class TestSB {
    
    public static StringBuilder getMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("1 pro spusteni kvizu\n");
        sb.append("2 pro vytvoreni kvizu\n");
        sb.append("3 pro import kvizu\n");
        sb.append("0 pro konec\n");
        sb.append("Zadej program: ");
        
        return sb;
    }
    
}
