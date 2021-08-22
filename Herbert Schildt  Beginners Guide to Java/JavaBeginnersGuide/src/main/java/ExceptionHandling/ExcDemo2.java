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
public class ExcDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            ExceptionTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement");
    }
    
}
