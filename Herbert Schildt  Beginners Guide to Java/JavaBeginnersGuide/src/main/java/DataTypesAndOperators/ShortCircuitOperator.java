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
public class ShortCircuitOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tdemonstrate the short-circuit operator
        
        int n, d, q;
        
        n = 10;
        d = 2;
        
        if(d != 0 && (n%d) == 0)
            System.out.println(d + " is a factor of " + n);
        
        d = 0; //now set d to zero
        
        //since d is zero, the second operand is not evaluated
        if(d != 0 && (n%d) == 0)
            System.out.println(d + " is a factor of " + n);
        
        //now try the same thing without short circuit operatore, it will give an error
        if(d != 0 & (n%d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
    
}
