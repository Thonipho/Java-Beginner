/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterSix;

/**
 *
 * @author User
 */
public class Factorial {
    //A simple example of recursion
    //This is a recursive function
    
    int factR(int n) {
        int result;
        
        if(n==1) return 1;
        result = factR(n-1) * n;
        return result;
    }
    
    //This is an iterative equivalent
    int factI(int n) {
        int t, result;
        
        result = 1;
        for(t=1; t<=n; t++) result +=t;
        return result;
    }
}
