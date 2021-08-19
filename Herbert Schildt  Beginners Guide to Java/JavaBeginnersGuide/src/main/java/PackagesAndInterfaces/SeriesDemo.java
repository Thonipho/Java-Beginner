/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackagesAndInterfaces;

/**
 *
 * @author User
 */
public class SeriesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();
        
        for(int i=0; i<5; i++)
            System.out.println("Next value is " + ob.getNext());
        
        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i<5; i++)
            System.out.println("Next value is " + ob.getNext());
        
        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i=0; i<5; i++)
            System.out.println("Next value is " + ob.getNext());
    }
    
}
