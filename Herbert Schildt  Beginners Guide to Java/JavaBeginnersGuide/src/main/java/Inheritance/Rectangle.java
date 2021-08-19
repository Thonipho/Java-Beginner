/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author User
 */
public class Rectangle extends TwoDShape {
    
    // default constructor
    Rectangle() {
        super();
    }
    
    //constructor for rectangle
    Rectangle(double w, double h) {
        super(w, h, "rectangle"); // call superclass constructor
    }
    
    //construct a square
    Rectangle(double x) {
        super(x, "square");
    }
    
    //construct an object from object
    Rectangle(Rectangle ob) {
        super(ob); //pass object to TwoDShape constructor
    }
    
    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }
    
    //Override area()
    @Override
    double area() {
        return getWidth() * getHeight();
    }
}
