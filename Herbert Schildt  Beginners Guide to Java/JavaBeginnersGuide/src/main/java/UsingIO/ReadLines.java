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
public class ReadLines {

    /**
     * @param args the command line arguments
     */
    // read a string from console using a bufferedreader
    public static void main(String[] args) throws IOException {
        
        // create a bufferedreader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String str;
        
        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quite");
        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
    }
    
}
