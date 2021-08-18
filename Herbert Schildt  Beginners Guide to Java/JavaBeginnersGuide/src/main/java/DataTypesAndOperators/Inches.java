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
public class Inches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Compute the number of cubic inches in 1 cubic mile
        
        long ci;
        long im; 
        
        im = 5280*12;
        ci = im*im*im;
        
        System.out.println("There are " + ci + "cubic inches in a cubic mile");
    }
    
}
