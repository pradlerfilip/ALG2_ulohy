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
public class Circle extends Shape { // Circle je typove kompatibilni s Shape

   // data
    
    public double r;
    public double d;
    private double area;
    
    // public Circle(double r){
        public Circle(double r){
        this.r=r;
        this.d=d;
        this.area=area();
    }
    
   /* 
    public Circle(double d){  // tohle nejde
        this.r=d/2;
    }
   */
    // tovarni metoda - factory-method
    
    public static Circle getInstanceD(double d){
        return new Circle(d/2);
    }
    
    public static Circle getInstanceR(double r){
        return new Circle(r);
    }
    
    public double getR() {
        return r;
    }
    
    public double getD() {
        return r*2;
    }
    
    public double getArea() {
        return area;
    }
    
    private double area() {
        return Math.PI*r*r;
    }
    
    
    @Override
    public String toString(){
        // return "Circle{" + "r=" + r + '}';
        return super.toString() + String.format(" r= %.2f ", r);
    }
    
    @Override
    public double computeArea(){
        return getArea();
    }
    
    
   
}
