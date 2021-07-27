/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap06;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = new Customer();

        //customer01.name = "Keagan";
        //customer01.age = 40;
        //customer01.address = "245 Woodlane Road";
        //customer01.custid = 250;
        //customer01.ordernum = 25;
        
        customer01.setName("Keagan");
        customer01.setAge(40);
        customer01.setAddress("245 Woodlane Road");
        customer01.setCustid(250);
        customer01.setOrdernum(25);

        customer01.displayCustomer();
    }
}
