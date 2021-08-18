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
public class Ragged {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // manually allocate differing size second dimensions
        
        int riders[][] = new int [7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];
        
        int i, j;
        
        //fabricate some fake data
        for(i=0; i<5; i++)
            for(j=0; j<10; j++)
                riders[i][j] = i+j+10;
        for(i=5; i<7; i++)
            for(j=0; j<2; j++)
                riders[i][j] = i+j+10;
        
        System.out.println("Riders per trip during the week: ");
        for(i=0; i<5; i++){
            for(j=0; j<10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Riders per trip on the weekend: ");
        for(i=5; i<7; i++){
            for(j=0; j<2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        
    }
    
}
