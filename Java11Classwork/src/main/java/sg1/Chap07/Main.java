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
public class Main {

    public static void main(String[] args) {
        Customer customer01 = new Customer("John Wick", 23, "172 Riche st", 9399, 2929);
        Customer customer02 = new Customer("T Mav", 17, "233 Blaine st", 1239, 3242);
        Customer customer03 = new Customer("Jason Statham", 34, "293 South st", 4954, 4953);
        
        Customer [] customers = {customer01,customer02,customer03};
        
        for (Customer names : customers) {
            System.out.print(names.name+"\n");
        }
    }
}
