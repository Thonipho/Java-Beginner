/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

/**
 *
 * @author User
 */
public class LogicalOperationsTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this is a truth table for the logical operator
        
        boolean p,q;
        
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        
        p = true; q = true;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        
        p = true; q = false;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        
        p = false; q = true;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        
        p = false; q = false;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
    
}
