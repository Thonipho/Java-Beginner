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
// A short package demonstration
// Book recorded for public access
public class Book {
    protected String title;
    protected String author;
    protected int pubDate;
    
    public Book(String t, String a, int d) {
        title =t;
        author = a;
        pubDate = d;
    }
    
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
