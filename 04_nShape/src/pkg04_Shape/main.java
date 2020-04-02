/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_Shape;

import java.util.Scanner;


/**
 *
 * @author filip
 */
public class main {
    
    public static Scanner sc= new Scanner(System.in);
    
    
        private static Point makePoint()
    {
        double Xcord;
        double Ycord;
        System.out.println("Type x-coordinates");
        Xcord = sc.nextDouble();
        System.out.println("Type y-coordinate");
        Ycord = sc.nextDouble();
        Point point = new Point(Xcord, Ycord);
        return point;
               
    }
        
    private static Point[] makeNShape(int nOfPoints) {
        Point[] points = new Point[nOfPoints];
        for (int i = 0; i < points.length; i++) {
            points[i] = makePoint();
        }
        return points;
    }   
    
    
    public static void main(String[] args) {
       
        System.out.println("Zadej pocet ");
        int numberOfPoints;
               while( numberOfPoints < 2)
               {
                   System.out.println("Zadej hodnotu vetsi nez 1");
                   numberOfPoints=sc.nextInt();
               }
                   
        
        
    
    
        while(numberOfPoints >= 2)
        {
            NShape nShape = new NShape(makeNShape(numberOfPoints));
        }
    
    
        System.out.println("Vyber program");
        System.out.println("0 pro konec");
        System.out.println("1 pro obvod");
        System.out.println("Vyber program");
        int n=sc.nextInt();
        switch(n)
        {
            
            case 0:                
                break;
                
            case 1:
                System.out.println(nShape.perim());
                break;
            case 2:
                System.out.println(Point.distanceFromOrigin);
                break;
            

            
        }
         
    }
}
