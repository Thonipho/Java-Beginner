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
public class ExcDemo1 {

    /**
     * @param args the command line arguments
     */
    //Demonstrate Exception Handling
    public static void main(String[] args) {
        
        int nums[] = new int[4];
        try {
            System.out.println("Before exception is generated");
            
            // Generate an index out-of-bounds exception
            nums[7] = 10;
            System.out.println("This wont be displayed");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statemnt");
    }
    
}
