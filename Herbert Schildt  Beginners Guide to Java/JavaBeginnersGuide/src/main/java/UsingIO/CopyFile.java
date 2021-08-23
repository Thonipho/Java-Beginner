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
public class CopyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int i;
        
        // first confirm that both files have been specified
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }
        
        // open and manage two files via the try statement
        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
            
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
    
}
