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
public class DoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        // guess the letter game
        
        char ch, ignore, awnser ='K';
        
        do {
            System.out.println("I'm thinking of a letter between A and Z");
            System.out.println("Can you guess it: ");
            
            // read a character
            ch = (char) System.in.read();
            
            //discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            }while(ignore != '\n');
            
            if(ch == awnser) System.out.println("**Right**");
            else {
                System.out.print("...Sorry, you're ");
                if(ch < awnser) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again\n");
            }
        } while (awnser != ch);
    }
    
}
