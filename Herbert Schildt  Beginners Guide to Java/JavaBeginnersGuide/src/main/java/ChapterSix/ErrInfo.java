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
public class ErrInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);
        
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);
    }
    
}
