/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_shapes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author filip
 */
public class ShapesApp {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Shape> shapes = new ArrayList<>();
    
    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            choice = readChoice();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    clearObjects();
                    break;
                case 2:
                    addSquare();
                    break;
                case 3:
                    addRectangle();
                    break;
                case 4:
                    addCircle();
                    break;
                case 5:
                    printObjects();
                    break;
                case 6:
                    computeArea();
                    break;
                case 7:
                    findWithMaxArea();
                    break;
                case 8:
                    getObjectInfo();
                    break;
                default:
                    System.out.println("Chybna volba");
            }
        } while (choice != 0);

    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("1. Nova sada");
        System.out.println("2. Pridej ctverec");
        System.out.println("3. Pridej obdelnik");
        System.out.println("4. Pridej kruh");
        System.out.println("5. Vypis geometricke utvary");
        System.out.println("6. Vypocti celkovou plochu");
        System.out.println("7. Vypis utvar s najvetsi plochou");
        System.out.println("8. Vypis plochu vybraneho utvaru");
        System.out.println("0. Konec programu");
    }
    
    private static int readChoice() {
        int choice=sc.nextInt();
        return choice;
    }
    
    private static void clearObjects() {
        shapes.clear();
    }
    
    private static void addSquare() {
        System.out.println("Zadej stranu A: ");
        double a=sc.nextDouble();
        shapes.add(new Square(a));
    }
    
  
    private static void addRectangle() {
        System.out.println("Zadej stranu A a B:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        shapes.add(new Rectangle(a,b));
    }
    
  
    private static void addCircle() {
        System.out.println("Zadej polomer: ");
        double r=sc.nextDouble();
        shapes.add(new Circle(r));
    }
    
   
    private static void printObjects() {
        for(int i=0;i<shapes.size();i++)
        {
            System.out.println(shapes.get(i));
        }
    }
    
   
    private static void computeArea() {
        double allArea=0;
        for(int i=0;i<shapes.size();i++)
        {
            Shape object=shapes.get(i);
            allArea=allArea+object.computeArea();
 
        }
        System.out.println("Celkova plocha: " + allArea);
    }
    
    
    private static void findWithMaxArea() {
        double maxArea=Double.MIN_VALUE;
        int index=-1;
        for(int i=0;i<shapes.size();i++)
        {
            Shape object=shapes.get(i);
            double area=object.computeArea();
            if(area > maxArea )
            {
                maxArea=area;
                index=i;
            }
        }
        System.out.println(shapes.get(index));
    }
    
    //TODO zobrazit vsechny, nechat vybrat a o vybranem zobrazit info
    private static void getObjectInfo() {
        int choose;
        System.out.println("Vyber si ze seznamu: ");
        for(int i=0;i<shapes.size();i++)
        {
            System.out.println(i +". shape :" + shapes.get(i));        
        }
        choose=sc.nextInt();
        Shape obj=shapes.get(choose);
        System.out.println(obj.toString());
        System.out.println(obj.computeArea());
    }
    
    
}