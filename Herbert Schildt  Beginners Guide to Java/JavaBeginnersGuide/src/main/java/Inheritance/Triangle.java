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
public class Triangle extends TwoDShape {
    // a subclass of TwoDShape for triangles
    
    String style;
    
    //a default constructor
    Triangle() {
        super();
        style = "none";
    }
    
    //constructor for triangle
    Triangle(String s, double w, double h) {
        super(w,h,"triangle");
        style = s;
    }
    
    //one argument constructor
    Triangle(double x) {
        super(x,"triangle");
    }
    
    //construct an object from an object
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }
    
    //override area()
    @Override
    double area() {
        return getWidth()*getHeight()/2;
    }
    
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
