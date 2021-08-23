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
//create an exception
public class NonIntResultException extends Exception {
    int n,d;
    
    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }
    
    public String toString() {
        return "Result of " + n + "/ " + d + " is non-integer.";
    }
}
