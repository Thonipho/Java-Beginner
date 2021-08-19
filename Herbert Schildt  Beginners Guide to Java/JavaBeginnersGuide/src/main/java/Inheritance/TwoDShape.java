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
public class TwoDShape {
    // A simple class hierarchy
    // A class for two dimensional objects
    
    private double width;
    private double height;
    
    //default constructor
    TwoDShape() {
    width = height = 00;
}
    
    // parameterized constructor
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }
    
    //Construct object with equal width and height
    TwoDShape(double x) {
        width = height = x;
    }
    
    //Accessor methods for width and height
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) {width =w;}
    void setHeight(double h) {height = h;}
    
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}
