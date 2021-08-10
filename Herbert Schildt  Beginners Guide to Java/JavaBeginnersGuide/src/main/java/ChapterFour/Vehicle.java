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
    int range() {
        return fuelcap * mpg;
    }

    public Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
    
    //compute fuel needed for a given distance
    double fuelneeded(int miles) {
        return (double) miles/mpg;
    }
}
