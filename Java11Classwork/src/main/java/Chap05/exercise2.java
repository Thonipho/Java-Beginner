/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap05;

/**
 *
 * @author User
 */
public class exercise2 {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String[] items = {"Shirt", "Socks", "Scarf", "Belt"};

        // Change message to show the number of items purchased.  
        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Print an element from the items array.  
        System.out.println(items[2]);
        //System.out.println(items[4]);
    }
}
