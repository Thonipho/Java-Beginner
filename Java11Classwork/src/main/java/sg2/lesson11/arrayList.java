/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson11;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class arrayList {
    public static void main(String[] args) {
        ArrayList <String> names= new ArrayList();
        
        names.add("James");
        names.add(1, "Thoni");
        
        System.out.println(names.get(0));
        
    }
}
