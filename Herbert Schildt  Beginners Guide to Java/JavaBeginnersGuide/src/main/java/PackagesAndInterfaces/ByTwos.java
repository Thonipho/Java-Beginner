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
public class ByTwos implements Series {
    int start;
    int val;
    
    ByTwos() {
        start = 0;
        val = 0;
    }
    
    public int getNext() {
        val += 2;
        return val;
    }
    
    public void reset() {
        val = start;
    }
    
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
