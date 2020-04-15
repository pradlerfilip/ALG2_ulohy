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
     public static final String[] monthsInYear={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
     public static final String[] typeDaysInMonth={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

    private int day;
    private int month;
    private int year;

    public Calendar(int day, int month, int year) {
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
        if(month == 1 && year % 4 == 0 )
        {
          return 29;
        }
        else
        {
        return daysInMonth[month-1];
        }
    }
    
    

    private static int WhatDayIsIt(int day,int month, int year)
    {
        int k=year % 100;
        int j=year/100;
        return (day + (13*(month+1)/5) + k + k/4 + j/4 + 5*j  ) % 7;
    }
    
    
   public void printCalendar()
   {
       System.out.println(getYear());
       System.out.println(monthsInYear[getMonth()]);
       for(int i=0;i<7;i++)
       {
           System.out.print("\t" + typeDaysInMonth[i]);
       }
       int firstDay=WhatDayIsIt(getDay(),getMonth(),getYear());
       int nOfDaysInMonth=nOfDays(getMonth(),getYear());
       System.out.println();
       int written=0;
       while(written < firstDay) {
       System.out.print("\t"); ++written;
            }
       while(written - firstDay <= nOfDays(getMonth(), getYear())) {
            if(written % 7 == 0) System.out.print("\n");
            System.out.print("\t" + (written - firstDay + 1));
            ++written;
       
}
       System.out.println();
   }
    

    
    
    
    
    
    
     
    
}
