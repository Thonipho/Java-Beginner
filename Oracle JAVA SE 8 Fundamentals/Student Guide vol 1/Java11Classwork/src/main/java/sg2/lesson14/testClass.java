/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson14;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author User
 */
public class testClass {

    public static void main(String[] args) {
        testClass testClass = new testClass();

        try {
            testClass.testCheckedException();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void testCheckedException() throws IOException {
        File testFile = new File("//testfile.txt");
        testFile.createNewFile();
        System.out.println("testFile exists: " + testFile.exists());
    }

}
