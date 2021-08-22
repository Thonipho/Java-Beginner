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
public class FinallyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
    
}
