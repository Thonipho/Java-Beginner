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
//Extends triangle
public class ColorTriangle extends Triangle {
    private String color;
    
    ColorTriangle(String c, String s, double w, double h) {
        super(s,w,h);
        
        color = c;
    }
    
    String getColor() {return color;}
    
    void showColor() {
        System.out.println("Color is " + color);
    }
}
