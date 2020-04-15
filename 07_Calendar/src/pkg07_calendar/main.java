/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_calendar;

import java.util.Scanner;

/**
 *
 * @author filip
 */
public class main {
    
    final static Scanner sc = new Scanner(System.in);
    
     public static void main(String[] args)
    {
        int day,month,year;
        
        System.out.print("Zadej den: ");
        day=sc.nextInt();
        System.out.print("Zadej mesic: ");
        month=sc.nextInt();
        System.out.print("Zadej rok: ");
        year=sc.nextInt();
        
        Calendar calendar = new Calendar(day,month,year);
        
       
        
       
            calendar.printCalendar();
            calendar = new Calendar(day,month+1,year);
            calendar.printCalendar();
       
    }
}
