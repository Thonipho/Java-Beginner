/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg2.lesson12;

/**
 *
 * @author User
 */
public class shirt extends Clothing {
    private char fit;
    private String sleeve;
    private char color;

    public shirt(char fit, String sleeve, char color, int itemid, String desc, char colorCode, double price) {
        super(itemid, desc, colorCode, price);
        this.fit = fit;
        this.sleeve = sleeve;
        this.color = color;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("fit: " + getFit());
        System.out.println("sleeve: " + getSleeve());
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
    
    
    
    
    
}
