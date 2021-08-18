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
public class LengthDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use the length array member
        
        int list[] = new int[10];
        int nums[] = {1,2,3};
        int table[][] = {
            {1, 2, 3}, {4, 5}, {6, 7, 8, 9}
        };
        
        System.out.println("length of list is " + list.length);
        System.out.println("length of nums is " + nums.length);
        System.out.println("length of table is " + table.length);
        System.out.println("length of table[0] is " + table[0].length);
        System.out.println("length of table[1] is " + table[1].length);
        System.out.println("length of table[2] is " + table[2].length);
        
        //use length to initialize list
        for(int i=0; i<list.length; i++)
            list[i] = i*i;
        
        System.out.print("Here is list: ");
        // now use length to display list
        for(int i=0; i<list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
    
}
