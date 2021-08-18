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
public class CharArithmetics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Character variables can be handled like integers
        
        char ch;
        
        ch = 'X';
        System.out.println("ch contains " +ch);
        
        ch++; //increment ch
        System.out.println("ch is now: " +ch);
        
        ch = 90; //give ch the value Z
        System.out.println("ch is now: " + ch);
        
        System.out.println("............................");
        
        
        
        for(char alph = 'A'; alph<='Z'; alph++) {
            System.out.println(alph);
        }
    }
    
}
