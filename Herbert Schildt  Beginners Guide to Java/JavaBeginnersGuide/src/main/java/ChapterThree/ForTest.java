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
public class ForTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        // loop until an S is typed
        
        int i;
        
        System.out.println("Press S to stop");
        
        for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" +i);
    }
    
}
