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
public class DiskToScreen {

    /**
     * @param args the command line arguments
     */
    //a simple disk-to-screen utility that demonstrates a filereader
    public static void main(String[] args) {
        
        String s;
        
        // create and use a filereader wrapped in a bufferedreader
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt")))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
    
}
