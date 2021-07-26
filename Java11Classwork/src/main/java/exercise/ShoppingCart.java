/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author User
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "T maV";
        String itemDesc = "Shirt";
        
    // numeric fields
    
        double price = 23.40;
        int quantity = 3;
        double tax = 1.04;
        double total;
        String message = custName+"wants to purchase"+quantity+" "+itemDesc;
        
        //calculating total cost
        total  = (price+quantity);
        
        // Declare and initialize outOfStock variable
        boolean outOfStock = false;
        
        //Test quantity and modify message if there is stock
        if (quantity >1) {
            message = message + "s";
        }
        
        //Test if there is no stock 
        if (outOfStock) {
            System.out.println(itemDesc +" is out of stock");
        }
        else{
            System.out.println(message);
            System.out.println("Total cost with tax: " + total);
        }
        
    }
}
