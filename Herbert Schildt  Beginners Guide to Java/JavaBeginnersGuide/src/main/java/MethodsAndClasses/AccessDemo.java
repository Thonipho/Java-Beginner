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
public class AccessDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        
        /*Access to alpha is allowed only through its accessor methods.*/
        ob.setAlpha(-99);
        System.out.println("ob.alpha is: " + ob.getAlpha());
        
        // you cannot access alpha like this 
        //ob.alpha = 10; this is wrong because alpha is private
        
        //these are okay because beta and gamma are public
        ob.beta=99;
        ob.gamma=23;
    }
    
}
