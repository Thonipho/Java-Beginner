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
public class MyClass {
    private int alpha; //private access
    public int beta; //public acess
    int gamma; //default access
    
    /* Methods to access alpha. It is ok for a member of a class to access a private 
    member of the same class.
    */
    void setAlpha(int a ) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }
}
