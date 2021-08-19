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
    
    Triangle(String s, double w, double h) {
        super(w,h);
        style = s;
    }
    
    double area() {
        return getWidth()*getHeight()/2;
    }
    
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
