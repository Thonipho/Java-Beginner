/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramControlStatements;

/**
 *
 * @author User
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // demonstrate the switch
        
        int i;
        
        for(i=0; i<10; i++)
            switch(i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;       
                case 3:
                    System.out.println("i is three");
                    break;
                default: 
                    System.out.println("i is five or more");
            }
    }
    
}
