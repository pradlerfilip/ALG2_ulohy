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
    
    private double r;
    
    // public Circle(double r){
        private Circle(double r){
        this.r=r;
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
    
    
    @Override
    public String toString(){
        return "Circle{" + "r=" + r + '}';
    }
    
    @Override
    public double computeArea(){
        return Math.PI*r*r;
    }
    
    
    
}
