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
public class DynShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TwoDShape shapes[] = new TwoDShape[5];
        
        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10,20,"generic");
        
        for(int i=0; i<shapes.length; i++) {
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
    
}
