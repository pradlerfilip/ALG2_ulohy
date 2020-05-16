/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_calendar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author filip
 */
public class main {
    
    final static Scanner sc = new Scanner(System.in);
    
     public static void main(String[] args)
    {
        int month,year;
        int m,n;
        boolean end=false,end2=false;
        while(!end)
        {
            System.out.println(getMenu());
            n=sc.nextInt();
           switch(n)
           {
               case 0:
               end=true;
               break;
               case 1:
                   System.out.print("What month do you want: ");
                   month=sc.nextInt();
                   System.out.print("What year do you want: ");
                   year=sc.nextInt();
        
                   Calendar calendar = new Calendar(month,year);
                   System.out.println(calendar.getCalendar());
                   
                   System.out.println(getActionMenu());
                   m=sc.nextInt();
                    while(!end2)
                    {
                   switch(m)
                   {
                       case 0:
                           end=true;
                           break;
                       case 1:
                           if(month != 12)
                           {
                           calendar = new Calendar(month+1,year);
                           month++;
                           }
                           else
                           {
                               calendar = new Calendar(1,year+1);
                               month=1;
                               year++;
                           }
                           System.out.println(calendar.getCalendar());
                           System.out.println(getActionMenu());
                           m=sc.nextInt();
                           break;
                       case 2:
                           if(month != 1)
                           {
                           calendar = new Calendar(month-1,year);
                           month--;
                           }
                           else
                           {
                               calendar = new Calendar(12,year-1);
                               month=12;
                               year--;
                           }
                           System.out.println(calendar.getCalendar());
                           System.out.println(getActionMenu());
                            m=sc.nextInt();
                           break;
                       case 3:
                           calendar = new Calendar(month,year+1);
                           year++;
                           System.out.println(calendar.getCalendar());
                           System.out.println(getActionMenu());
                           m=sc.nextInt();
                           
                           break;
                       case 4:
                           calendar = new Calendar(month,year-1);
                           year--;
                           System.out.println(calendar.getCalendar());
                           System.out.println(getActionMenu());
                           m=sc.nextInt();
                           break;
                       default:
                             System.out.println("Wrong input");
                             break;
                   }
                   
                    }
                   
                   
                   
               case 2:
                   System.out.print("What year do you want: ");
                   year=sc.nextInt();
                   ArrayList<Calendar> calendarYear = new ArrayList();
                   for(int i=1; i<=12;i++)
                   {
                      calendarYear.add(new Calendar(i,year));
                   }
                   for(Calendar cal:calendarYear)
                   {
                       System.out.println(cal.getCalendar());
                   }
                   break;
               default:
                   System.out.println("Wrong input");
                   
                       
           }
            
            
         
            
      
       /* System.out.print("Zadej mesic: ");
        month=sc.nextInt();
        System.out.print("Zadej rok: ");
        year=sc.nextInt();
        
        Calendar calendar = new Calendar(month,year);
        
      
            //calendar.printCalendar();
            System.out.println(calendar.getCalendar());
            System.out.println("------------------------------------------------------");
       */
          
        }
    }
     
     
     public static String getMenu()
     {
         StringBuilder sb = new StringBuilder();
         sb.append("0 for exit \n");
         sb.append("1 for calendar with specific month and year \n");
         sb.append("2 for whole calendar \n");
         sb.append("What you want to do : ");
         return sb.toString();
     }
     
     public static String getActionMenu()
     {
       StringBuilder sb = new StringBuilder();
         sb.append("0 for exit \n");
         sb.append("1 for next month \n");
         sb.append("2 for previous month \n");
         sb.append("3 for next year \n");
         sb.append("4 for next year");
         return sb.toString();
     }
}
