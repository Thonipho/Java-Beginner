/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypesAndOperators;

/**
 *
 * @author User
 */
public class Hypotenuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Use the pythagorean theorem to find the length of the hypotenuse given the lengths of the two opposing sides
        
        double x,y,z;
        
        x=3;
        y=4;
        
        z = Math.sqrt(x*x + y*y);
        
        System.out.println("Hypotenuse is " + z);
        
    }
    
}
