/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07;

/**
 *
 * @author User
 */
public class Customer {
    public String name;
    public int age;
    public String address;
    public int custid;
    public int ordernum;  

    public Customer(String name, int age, String address, int custid, int ordernum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.custid = custid;
        this.ordernum = ordernum;
    }
    
    
    
    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Customer ID: " + custid);
        System.out.println("Address: " + address);
        System.out.println("Order Number: " + ordernum);
        System.out.println("Age: " + age);
    }
}
