/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingIO;

/**
 *
 * @author User
 */
import java.io.*;
public class RandomAccessDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double data[] = {19.4,10.1,123.54,33.0,87.9,74.25};
        double d;
        
        // open and use random access file
        try (RandomAccessFile raf = new RandomAccessFile("arndom.dat", "rw"))
        {
            // write values to the file
            for(int i=0; i<data.length; i++) {
                raf.writeDouble(data[i]);
            }
            
            // now read back specific values 
            raf.seek(0); // seek to first double
            d = raf.readDouble();
            System.out.println("First value is " + d);
            
            raf.seek(8); // seek to first double
            d = raf.readDouble();
            System.out.println("First value is " + d);
            
            raf.seek(8*3); // seek to fourth double
            d = raf.readDouble();
            System.out.println("First values is " + d);
            
            System.out.println();
            
            // now read every other value
            System.out.println("Here is every other value: ");
            for(int i=0; i<data.length; i+=2) {
                raf.seek(8*i); // seek to ith double
                d = raf.readDouble();
                System.out.print(d+" ");
            }
        }
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
    
}
