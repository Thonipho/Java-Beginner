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
public class Err {
    String msg; // error message
    int severity; // code indicating severity of error
    
    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
