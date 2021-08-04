/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
public class lambdaExpression {
    public static void main(String[] args) {
        String [] names = {"Thoni", "Trystan", "Vusi"};
        List<String> myList = new ArrayList(Arrays.asList(names));
        
//        for (String s : myList) {
//            System.out.println(s.toUpperCase()+",");
//        }
        
        myList.replaceAll(s-> s.toUpperCase());
        System.out.println("List.replaceAll lambda: "+myList);
        
        myList.removeIf(s-> s.equals("TRYSTAN"));
        myList.removeIf(s-> s.length()<5);
        System.out.println("After for loop" + myList);
    }
}
