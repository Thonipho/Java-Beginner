/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackagesAndInterfaces.bookpack;

/**
 *
 * @author User
 */
public class BookDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book books[] = new Book[5];
        
        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2019);
        books[1] = new Book("Java: The Complete Reference", "Schildt", 2019);
        books[2] = new Book("Introducing JavaFX 8 Programming", "Schildt", 2015);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On the Road", "Kerouac", 1955);
        
        for(int i=0; i<books.length; i++) books[i].show();
    }
    
}
