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
public class DynamicInitialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demonstrate dynamic initialization 
        
        double radius = 4, height =5;
        
        // dynamically initialize volume
        double volume = 3.1416 * radius * radius * height;
        
        System.out.println("Volume is " + volume);
    }
    
}
