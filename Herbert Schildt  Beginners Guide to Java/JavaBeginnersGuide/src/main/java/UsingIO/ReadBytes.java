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

public class ReadBytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws IOException {
        byte data[] = new byte[10];

        System.out.println("Enter some characters");
        System.in.read(data);
        System.out.print("You entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
}
