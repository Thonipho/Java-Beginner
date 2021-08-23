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
    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;

        //First make sure that a file has been specified
        if (args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }

        // the following code opens a file, reads characters until EOF is encountered 
        // then closes a file via a finally block
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
            
        } catch (FileNotFoundException exc) {
            System.out.println("File not found");
            return;
        } catch (IOException exc) {
            System.out.println("Error reading file");
        } finally {
            // close file in all cases
            try {
                if(fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing file");
            }
        }
    }
}
