/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pradler_bank;

import java.util.ArrayList;

/**
 *
 * @author filip
 */
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Person("Pekar"));
        clients.add(new Person("Svecova"));
        clients.add(new Company("Skoda"));
        
        clients.get(0).createAccount(1000);
        clients.get(0).createAccount(500);
        clients.get(1).createAccount(1200);
        clients.get(2).createAccount(120);
      
        for(int i=0;i<clients.size();i++)
        {
            System.out.println(clients.get(i).clientOfAccount() + " " + clients.get(i).allBalance() + " KČ");
        }
    }
}
