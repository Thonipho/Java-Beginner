/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterThree;

/**
 *
 * @author User
 */
public class WhileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // demonstarte the while loop
        
        char ch;
        // print alphabet using a while loop
        ch = 'a';
        while(ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
    
}
