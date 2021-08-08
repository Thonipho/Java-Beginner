/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterThree;

/**
 *
 * @author User
 */
public class NoBodyLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the body of a loop can be empty
        
        int i = 1;
        int sum = 0;
        
        //sum the numbers through 5
        for(; i <= 5; sum += i++);
        
        System.out.println("Sum is " + sum);
    }
    
}
