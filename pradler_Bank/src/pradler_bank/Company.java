/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pradler_bank;

/**
 *
 * @author filip
 */
public class Company extends Client {
    
    public Company(String name)
    {
        super(name);
    }
    
     @Override
    public String clientOfAccount()
    {
        return "firma " + name;  
    }
    
}
