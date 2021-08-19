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
abstract class TwoDShape {
    // A simple class hierarchy
    // A class for two dimensional objects
    
    private double width;
    private double height;
    private String name;
    
    //default constructor
    TwoDShape() {
    width = height = 00;
    name = "none";
}
    
    // parameterized constructor
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    
    //Construct object with equal width and height
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }
    
    //construct an object from a object
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    
    //Accessor methods for width and height
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) {width =w;}
    void setHeight(double h) {height = h;}
    
    String getName() {return name;}
    
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
    
    // area() is abstract
    abstract double area();
}
