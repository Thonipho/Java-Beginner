/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterSix;

/**
 *
 * @author User
 */
public class OverLoad {
    // demonstration of method overloading and conversion
    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }
    
    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
    
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }
}
