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
public class Customer {
    public String name;
    public int age;
    public String address;
    public int custid;
    public int ordernum;  
    
    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Customer ID: " + custid);
        System.out.println("Address: " + address);
        System.out.println("Order Number: " + ordernum);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public int getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(int ordernum) {
        this.ordernum = ordernum;
    }
}


