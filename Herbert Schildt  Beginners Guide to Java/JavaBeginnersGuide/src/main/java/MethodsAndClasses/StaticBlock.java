/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodsAndClasses;

/**
 *
 * @author User
 */
public class StaticBlock {
    //use a static block
    static double rootOf2;
    static double rootOf3;
    
    static{
        System.out.println("Inside static block");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    
    StaticBlock(String msg) {
        System.out.println(msg);
    }
}
