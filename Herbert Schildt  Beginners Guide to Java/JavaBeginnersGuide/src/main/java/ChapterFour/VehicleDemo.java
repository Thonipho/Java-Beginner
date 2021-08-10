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
        
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,16,12);
        double litres;
        int dist = 252;
        
        // putting the attributes in description
        System.out.println("Minivan can carry " + minivan.passengers + " passengers for a range of " + minivan.range() + " km's" );
        System.out.println("To travel " + dist + " km's minivan needs " + minivan.fuelneeded(dist) + " litres of fuel");
        
        System.out.println("........................");
        
        System.out.println("Sportscar can carry " + sportscar.passengers + " passengers for a range of " + sportscar.range() + " km's" );
        System.out.println("To travel " + dist + " km's minivan needs " + sportscar.fuelneeded(dist) + " litres of fuel");
    }
    
}
