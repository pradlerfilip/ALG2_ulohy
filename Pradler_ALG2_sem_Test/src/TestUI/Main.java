/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUI;

import java.util.Scanner;

/**
 *
 * @author filip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(TestSB.getMenu());
        
        int function = sc.nextInt();
        
         while(true){
            switch(function)
            {
                
                case 1:
                    //    TestApp.Quiz.RunQuiz();
            
                         
                break;
                
               
                case 2:
                       
                            
                        
                    
                    break;
                case 3:
                        String name=sc.next();
                 //       TestApp.Quiz.CreateQuiz(name);
                    
                    
                    
                    break;
                    
                case 0:
                    System.exit(0);
                    break;
                
            }
        
        
         }
                
        
    }
    
}
