/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterThree;
import java.io.IOException;
/**
 *
 * @author User
 */
public class GuessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        // Guess the letter game
        
        throws java.io.IOException {
        
        char ch, awnser = 'K';
        
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        
        ch = (char) System.in.read(); // read a char from the keyboard
        
        if(ch == awnser) System.out.println("**Right**");
        else {
            System.out.println("...Sorry, youre ");
            //nested if
            if(ch < awnser) System.out.println("too low");
            else System.out.println("too high");
        }
    }
    
    
}
