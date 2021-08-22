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
public interface Series {
    int getNext(); //return next number series
    
    // Return array that contains the next n elements in the series beyond the current element.
    default int[] getNextArray(int n) {
        return getArray(n);
    }
    
    //Return an array that contains the next n elements in the series, after skipping elements
    default int[] skipAndGetNextArray(int skip, int n) {
        
        // skip the specified number of elements
        getArray(skip);
        
        return getArray(n);
    }
    
    //A private method that returns an array containing the next n elements
    private int[] getArray(int n) {
        int[] vals = new int[n];
        
        for(int i=0; i<n; i++) vals[i] = getNext();
        return vals;
    }
    
    void reset(); //restart
    void setStart(int x); //set starting value
}


