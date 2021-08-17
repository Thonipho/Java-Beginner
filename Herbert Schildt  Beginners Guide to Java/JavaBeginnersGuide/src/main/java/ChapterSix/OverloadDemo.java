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
public class OverloadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        
        int i = 10;
        double d = 10.1;
        
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        
        ob.f(i); // calls ob.f(int)
        ob.f(d); // calls ob.f(double)
        ob.f(b); // calls ob.f(byte) - now, no type conversion
        ob.f(s); // calls ob.f(int) - type converion
        ob.f(f); // calls ob.f(double) - type conversion
    }
    
}
