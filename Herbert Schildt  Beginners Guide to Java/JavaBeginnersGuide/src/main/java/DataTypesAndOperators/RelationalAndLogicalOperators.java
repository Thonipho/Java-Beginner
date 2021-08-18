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
public class RelationalAndLogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // demonstrate the relational and logical operators
        
        int i,j;
        boolean b1, b2;
        
        i =10;
        j =11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("Will not execute");
        if(i >= j) System.out.println("Will not execute");
        if(i > j) System.out.println("Will not execute");
        
        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("Will not execute");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
    }
    
}
