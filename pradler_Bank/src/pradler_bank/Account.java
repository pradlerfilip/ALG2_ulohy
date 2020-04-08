/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pradler_bank;


public class Account  {

    
    private double balance;
    
    
    public Account(){
        
    }
    
    public Account(double balance)
    {
        this.balance=balance;
    }

    public void deposit(double amount) {
        balance=balance+amount;
    }

    
    public void withdraw(double amount) {
        balance=balance-amount;
    }
    
    public double getBalance() {
        return balance;
    }

 
    
    
    

   
    
    
    
    
    
}
