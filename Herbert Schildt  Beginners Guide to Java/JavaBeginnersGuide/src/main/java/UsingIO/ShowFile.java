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

public class ShowFile {

    /**
     * @param args the command line arguments
     */
    // Display a text file
    // Using try-with resources
    public static void main(String[] args) {

       int i;
       
       // first make sure that a file name has been specified
       if(args.length != 1) {
           System.out.println("Usage: ShowFile filename");
           return;
       }
       
       // the following code uses try-with-resources to open a file and automatically close it
       try(FileInputStream fin = new FileInputStream(args[0])) {
           
           do{
               i = fin.read();
               if(i != -1) System.out.print((char) i);
           } while(i != -1);
           
       } catch(IOException exc) {
           System.out.println("I/O Error: " + exc);
       }
    }
}
