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
// Implement series and getPrevious()
public class ByTwos implements Series {
    int start;
    int val;
    int prev;
    
    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }
    
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }
    
    public void reset() {
        val = start;
        prev = start - 2;
    }
    
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }
    
    int getPrevious() {
        return prev;
    }
}
