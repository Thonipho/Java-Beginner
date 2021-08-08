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
public class ifelseLadder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // demonstrate an if-else-if ladder
        
        int x;
        
        for(x=0; x<6; x++) {
            if(x==1)
                System.out.println("x is one");
            else if(x==2)
                System.out.println("x is two");
            else if(x==3)
                System.out.println("x is three");
            else if(x==4)
                System.out.println("x is four");
            else 
                System.out.println("x is not in between 1 and 4");
        }
    }
    
}
