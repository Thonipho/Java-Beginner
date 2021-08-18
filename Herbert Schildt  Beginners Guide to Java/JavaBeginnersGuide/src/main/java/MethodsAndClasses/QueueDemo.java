/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodsAndClasses;

/**
 *
 * @author User
 */
public class QueueDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demonstrate the queue class
        //construct 10 element empty queue
        
        Queue q1 = new Queue(10);
        
        char name[] = {'T', '0', 'm'};
        // construct queue from array
        Queue q2 = new Queue(name);
        
        char ch;
        int i;
        
        //put some characters into ql
        for(i=0; i<10; i++)
            q1.put((char) ('A' + i));
        
        // construct queue from another queue
        Queue q3 = new Queue(q1);
        
        //Show the queues
        System.out.print("Contents of q1: ");
        for(i=0; i<10; i++) {
            ch = q1.get();
            
            System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.print("Contents of q2: ");
        for(i=0; i<3; i++){
            ch = q2.get();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.print("Contents of q3: ");
        for(i=0; i<10; i++){
            ch = q3.get();
            System.out.print(ch);
        }
    }
    
}
