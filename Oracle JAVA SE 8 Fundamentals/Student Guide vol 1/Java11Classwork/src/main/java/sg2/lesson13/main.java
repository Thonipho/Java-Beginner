/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson13;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        shirt shirt01 = new shirt (22, "african",'G',250, 's', "short sleeve");
        shirt01.display();
        
        System.out.println(".........................");
        
        trouser trouser01 = new trouser (23, "african",'R',170, 'm', 29.5, 16.7);
        trouser01.display();
        
        System.out.println(".........................");
        
        Clothing trouser02 = new trouser (25, "asian",'B',120, 'L', 29.5, 16.7);
        trouser02.display();
        System.out.println(".........................");
        System.out.println("Trouser 2 length: " + ((trouser)trouser02).getLength());
        
        if(trouser02 instanceof trouser) {
            char fitcode = ((trouser)trouser02).getFit();
            System.out.println("Trouser 2 fit: " + ((trouser)trouser02).getFit());
            System.out.println("Trouser 2 fit: " + ((trouser)trouser02).getFit());
        }
        else {
            System.out.println(".........................");
            System.out.println("It is not an instance of trouser");
        }
        System.out.println(".........................");
        System.out.println(trouser02.toString());
        
        System.out.println(".........................");
        System.out.println(((shirt)shirt01).doReturn());
       
    }
}
