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
public class MultiCatch {

    /**
     * @param args the command line arguments
     */
    // use the multi-catch feature. Note: this requires jdk7
    // later to compile
    public static void main(String[] args) {
        int a=88, b=0;
        int result;
        char chrs[] = {'A','B','c',};
        
        for(int i=0; i<2;i ++){
            try{
                if(i==0)
                    result = a/b; //generate an ArithmeticException
                else
                    chrs[5] = 'X'; //generate an ArrayOutOfBoundsException
                
                //This catch clause catches both exceptions
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("EXception caught: " + e);
            }
        }
        System.out.println("After multi-catch");
    }
    
}
