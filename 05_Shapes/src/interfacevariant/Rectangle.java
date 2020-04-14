/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacevariant;

import pkg05_shapes.*;

/**
 *
 * @author filip
 */
public class Rectangle implements ShapeInterface{
    //data
    private double a;
    private double b;
    private double area;
    
    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
        this.area=area();
    }
    
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    
    private double area(){
        return a*b;
    }
    // neni potreba
    public double getArea(){
        return area;
    }
    
    
    @Override
    public double computeArea(){
        area = getA() * getB();
        return getArea();
    }

    
    
    
    @Override
    public String toString(){
        return "Rectangle{" + "a=" + a + ", b= " + b +"}";
        // return super.toString() + String.format(" a= %.2f, b= %.2f ", a,b);
    }
}
