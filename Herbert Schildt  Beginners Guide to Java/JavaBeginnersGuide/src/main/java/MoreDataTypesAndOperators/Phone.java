/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreDataTypesAndOperators;

/**
 *
 * @author User
 */
public class Phone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a simple automated phone directory
        
        String numbers [][] = {
            {"Tom", "233-3342"},
            {"Mary", "555-3342"},
            {"John", "555-2939"},
            {"Rachel", "555-2949"}
        };
        int i;
        
        if(args.length != 1)
            System.out.println("Usage: java phone <name>");
        else {
            for(i=0; i<numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length)
                System.out.println("Name not found");
        }
    }
    
}
