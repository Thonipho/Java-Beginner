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
public class VehicleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this class declares objects of type vehicle
        
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        
        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        // assign values to fields in sportcar
        sportscar.passengers = 2;
        sportscar.fuelcap =16;
        sportscar.mpg = 12;
        
        // compute the range assuming a full tank of gas
        System.out.println("Minivan can carry " + minivan.passengers + " passengers " );
        minivan.range();
        System.out.println("Sportscar can carry " + sportscar.passengers + " passengers " );
        sportscar.range();
    }
    
}
