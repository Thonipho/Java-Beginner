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
public class booleanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Demonstrate boolean values
        
        boolean b;
        
        b = false;
        System.out.println("b is " + b);
        
        b = true;
        System.out.println("b is " + b);
        
        //a boolean value can control the if statement
        if(b) System.out.println("This is executed");
        
        b = false;
        if(b) System.out.println("This is not executed");
        
        //outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
    
}
