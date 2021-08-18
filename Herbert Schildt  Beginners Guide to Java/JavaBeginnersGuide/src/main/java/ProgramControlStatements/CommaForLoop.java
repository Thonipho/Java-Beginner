/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramControlStatements;

/**
 *
 * @author User
 */
public class CommaForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use commas in a for statement
        
        int x, y;
        
        for(x=0, y=10; x<y; x++, y--)
            System.out.println("i and j: " + x + " " +y);
    }
    
}
