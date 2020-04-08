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
public class Person extends Client {
    
    public Person(String name)
    {
        super(name);
    }
    
    
  
    
    
    @Override
    public String clientOfAccount()
    {
        String lastThreeDigits = name.substring(name.length() - 3);
        if(lastThreeDigits == "ova")
        {
          return "Paní " + name;  
        }
        return "Pan " + name;
    }
}
