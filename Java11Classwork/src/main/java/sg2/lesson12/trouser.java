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
public class trouser extends Clothing{
    private char fit;
    private double length;
    private double width;

    public trouser(int itemid, String desc,char colorCode,double price, char fit, double length, double width ) {
        super(itemid, desc, colorCode, price);
        this.fit = fit;
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("fit: " + getFit());
        System.out.println("length: " + getLength());
        System.out.println("width: " + getWidth());
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
