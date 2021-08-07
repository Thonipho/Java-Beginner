/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

/**
 *
 * @author User
 */
public class ModulusDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demonstrates the % operator
        
        int iresult, irem;
        double dresult, drem;
        
        iresult = 10/3;
        irem = 10% 3;
        
        dresult = 10.0/3.0;
        drem = 10.0%3.0;
        
        System.out.println("Result of 10/3: " + iresult + " \nremainder of 10/3: " + irem);
        System.out.println(".................");
        System.out.println("Result of 10.0/3.0: " + dresult + " \nremainder of 10.0/3.0: " + drem);
    }
    
}
