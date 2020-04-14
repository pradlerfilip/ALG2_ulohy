/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_shapes;

/**
 *
 * @author filip
 */
public class Square extends Shape { // Circle je typove kompatibilni s Shape

   // data
    
    private double a;
    private double area;
    
    // public Circle(double r){
        public Square(double a){
        this.a=a;
        this.area=area();
    }
    
   /* 
    public Circle(double d){  // tohle nejde
        this.r=d/2;
    }
   */
    // tovarni metoda - factory-method
    
   
    
    public static Circle getInstanceA(double a){
        return new Circle(a);
    }
    
    public double getA() {
        return a;
    }
    
    public double getArea() {
        return area;
    }
    
    private double area(){
        return a*a;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + String.format(" a= %.2f ", a);
    }
    
    @Override
    public double computeArea(){
        return getArea();
    }
    
    
    
}
