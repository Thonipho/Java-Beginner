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
public class UseFinally {

    public static void genException(int what) {

        int t;
        int nums[] = new int[2];

        System.out.println("Recieving " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; //generate div-by-zero error
                    break;
                case 1:
                    nums[4] = 4; //generate array index error
                    break;
                case 2:
                    return; //return from try block
            }
        } catch (ArithmeticException exc) {
            //catch the exception
            System.out.println("Cant divide by zero");
            return; //return from catch
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            //catch the exception
            System.out.println("No matching element found");
        }
        finally {
            System.out.println("Leaving try");
        }
    }
}
