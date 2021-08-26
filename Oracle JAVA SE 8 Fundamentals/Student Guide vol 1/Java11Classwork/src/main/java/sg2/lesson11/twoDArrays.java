/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson11;

/**
 *
 * @author User
 */
public class twoDArrays {
    public static void main(String[] args) {
        String [][] studentDetails = new String [4][4];
        
        //student names
        studentDetails [0][0] = "Thonipho";
        studentDetails [1][0] = "Kat";
        studentDetails [2][0] = "John";
        studentDetails [3][0] = "Nia";
        //student surnames
        studentDetails [0][1] = "mav";
        studentDetails [1][1] = "Bafo";
        studentDetails [2][1] = "Wick";
        studentDetails [3][1] = "Brown";
        //student gender
        studentDetails [0][2] = "male";
        studentDetails [1][2] = "male";
        studentDetails [2][2] = "male";
        studentDetails [3][2] = "female";
        //students culture
        studentDetails [0][3] = "venda";
        studentDetails [1][3] = "sotho";
        studentDetails [2][3] = "asian";
        studentDetails [3][3] = "english";
        
        for (int i=0; i<studentDetails.length; i++){
            System.out.println(i);
            for (int j=0; j<studentDetails[i].length; j++){
                System.out.println(j);
            }
            System.out.println(i);
        }
    }
}
