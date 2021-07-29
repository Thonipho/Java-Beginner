/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson11;

/**
 *
 * @author User
 */
public class loops {
    public static void main(String[] args) {
        
        for (int i =0; i<50;i++){
            if(i%2!=0)
                continue;
            System.out.println(i);
        }
    }
}
