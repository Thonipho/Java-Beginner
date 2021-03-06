/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodsAndClasses;

/**
 *
 * @author User
 */
public class Quicksort {
    // a simple version of quicksort
    //set up a call to the actual quicksort method
    static void qsort (char items[]) {
        qs(items, 0, items.length-1);
    }
    
    //a recursive version of quicksort for characters.
    private static void qs(char items[], int left, int right)
    {
        int i, j;
        char x, y;
        
        i = left;
        j = right;
        x = items[(left+right)/2];
        
        do{
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j < left)) j--;
            
            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while(i <=j);
        
        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }
}
