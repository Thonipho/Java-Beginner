/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackagesAndInterfaces.bookpackext;
import PackagesAndInterfaces.bookpack.Book;
/**
 *
 * @author User
 */
// Demonstrate protected
class ExtBook extends Book {
    private String publisher;
    
    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }
    
    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }
    
    public String getPublisher() {return publisher;}
    public void setPublisher(String p) {publisher = p;}
    
    //These are ok because subclass can access a protected member
    
    public String getTitle() {return title;}
    public void setTitle(String t) {title = t;}
    public String getAuthor() {return author;}
    public void setAuthor(String a) {author = a;}
    public int getPubDate() {return pubDate;}
    public void setPubDate(int d) {pubDate =d;}
}
