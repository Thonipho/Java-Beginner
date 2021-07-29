/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson11;

/**
 *
 * @author User
 */
public class argsArray {

    public static void main(String[] args) {
//        System.out.println("args[0] is " +args[0]);
//        System.out.println("args[1] is " +args[1]);

        System.out.println("Total is : " + (args[0] + args[1]));
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        System.out.println("Total is: " + (arg1 + arg2));
    }
}
