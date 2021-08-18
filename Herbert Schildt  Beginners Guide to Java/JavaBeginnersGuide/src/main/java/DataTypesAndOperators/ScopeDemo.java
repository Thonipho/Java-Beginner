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
public class ScopeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // demonstrate block scope
        
        int x; //known to all code within main
        
        x = 10;
        if(x == 10) { //start new scope
            
            int y = 20; //known only to this block
            // x and y are both known here
            
            System.out.println("x and y: " + x + " " + y);
            x = y*2;
        }
        // y = 100; Error! y not known here
        
        // x is still known here
        System.out.println("x is " + x);
    }
    
}
