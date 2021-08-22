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
public class NestedTrys {

    /**
     * @param args the command line arguments
     */
    //using a nested try block
    public static void main(String[] args) {
        // here, numer is longer than denom
        int numer[] = {4,8,16,32,40,48,56,64,128,256,512};
        int denom[] = {2,0,4,4,0,8};
        
        try {
            //outer try
            for(int i=0; i<numer.length; i++) {
                try {//nested try
                    System.out.println(numer[i] + "/" + denom[i] + "is " + numer[i]/denom[i]);
                }
                catch (ArithmeticException exc) {
                    //catch the exception
                    System.out.println("Cant divide by zero!");
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            //catch the exception
            System.out.println("No matching element found");
            System.out.println("Fatal error - program terminated");
        }
    }
    
}
