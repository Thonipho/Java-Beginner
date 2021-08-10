/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterFour;

/**
 *
 * @author User
 */
public class Vehicle {
    int passengers, fuelcap, mpg;
    
    //display the range
    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}
