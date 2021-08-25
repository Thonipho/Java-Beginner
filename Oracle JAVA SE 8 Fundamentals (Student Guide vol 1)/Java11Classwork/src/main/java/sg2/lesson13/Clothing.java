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
public class Clothing {
    private int itemid ;
    private String desc ;
    private char colorCode;
    private double price ;

    public Clothing(int itemid, String desc,char colorCode,double price) {
        this.itemid=itemid;
        this.desc=desc;
        this.colorCode=colorCode;
        this.price=price;
    }

    public void display(){
        System.out.println("ItemID: "+ getItemid());
        System.out.println("desc: "+ getDesc());
        System.out.println("ColorCode: "+ getColorCode());
        System.out.println("ItemID: "+ getPrice());
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemid() {
        return itemid;
    }

    public String getDesc() {
        return desc;
    }

    public char getColorCode() {
        return colorCode;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "This shirt is a "+desc+ " ;"+ "Price: "+ getPrice()+","+" Color: "+ getColorCode();
    }

  
}
