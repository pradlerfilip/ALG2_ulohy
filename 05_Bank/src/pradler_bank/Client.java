/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pradler_bank;
import java.util.ArrayList;





public abstract class Client {  
    protected ArrayList<Account> accounts;
    String name;
    
    
    public Client()
    {
        
    }
    
    
     public Client(String name)
    {
      accounts = new ArrayList<>();  
      this.name=name;  
    }

    
    
    public void createAccount(double balance)
    {
        accounts.add(new Account(balance));
    }
    
    public double allBalance()
    {
        double allBalance=0;
        for (Account account : accounts) {
            allBalance+=account.getBalance(); 
        }
        return allBalance;
    }
    
    public abstract String clientOfAccount();
}
