/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author User
 */
public class ExceptionTest {
    // Generate an exception
    
    static void genException() {
        int nums[] = new int[4];
        
        System.out.println("Before exception is generated");
        
        //generate an index out-of-bounds exception
        nums[7] =10;
        System.out.println("This wont be displayed");
    }
}
