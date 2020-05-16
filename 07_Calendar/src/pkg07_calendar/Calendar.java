/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_calendar;

/**
 *
 * @author filip
 */


public class Calendar {
    
     public static final int[] daysInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
     public static final String[] monthsInYear={"January","February","March","April","May","June","July","August","September","October","November","December"};
     public static final String[] typeDaysInMonth={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

    private int day;
    private int month;
    private int year;

    public Calendar(int month, int year) {
        this.day = day;
        this.month = month;
        this.year=year;
    }
    
    private int getDay() {
        return day;
    }

    private int getMonth() {
        return month;
    }

    private int getYear() {
        return year;
    }

    private void setMonth(int month) {
        this.month = month;
    }

    private void setYear(int year) {
        this.year = year;
    }
     
    private static int nOfDays(int month, int year)
    {
        if( (monthsInYear[month] == "Feb") && year % 4 == 0 && year % 100 != 0 )
        {
          return 29;
        }
        else
        {
        return daysInMonth[month];
        }
    }
    
    

    public static int WhatDayIsIt(int month, int year)
    {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        
        int k = year % 100;
        int j = year / 100;
        
        return (((26*(month+1)/10)+k+(k/4)+(j/4)+(5*j)) % 7)-1;
        
        
        
    }
    
    
   public String getCalendar()
   {
       StringBuilder sb = new StringBuilder();
       //System.out.println("Year = " + getYear());
       sb.append("Year = ").append(getYear());
       //System.out.println("Month = " + monthsInYear[getMonth()-1]);
       sb.append("\n");
       sb.append("Month = ").append(monthsInYear[getMonth()-1]);
       sb.append("\n");
       for(int i=0;i<7;i++)
       {
           //System.out.print("\t" + typeDaysInMonth[i]);
           sb.append(typeDaysInMonth[i]).append("\t");
       }
       int firstDay=WhatDayIsIt(getMonth(),getYear());
       int nOfDaysInMonth=nOfDays(getMonth()-1,getYear());
       //System.out.println();
        sb.append("\n");
       int written=0;
       while(written < firstDay) {
      // System.out.print("\t"); 
       sb.append("\t");
        ++written;
            }
       while(written - firstDay < nOfDaysInMonth) {
            if(written % 7 == 0)
            {
                // System.out.print("\n");
                sb.append("\n");
            }
            //System.out.print("\t" + (written - firstDay + 1));
            sb.append((written - firstDay + 1) + "\t");
            ++written;
       
}
       // System.out.println();
       sb.append("\n");
       return sb.toString();
   }
 
    
    
     
    
}
