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
public abstract class Shape { // predek
    // data
    protected String name = "Geometric object";
    public abstract double computeArea(); // musi byt prekryta v potomcich
    public String getShapeName()
    {
        return this.getClass().getSimpleName(); // pouzita jen v potomcich
    }
    @Override
    public String toString() // prekryva toString tridy Object, defaultna implementace, ktera muze byt prekryta
    {
        return name + ": " + getShapeName();
    }
   
    


}

