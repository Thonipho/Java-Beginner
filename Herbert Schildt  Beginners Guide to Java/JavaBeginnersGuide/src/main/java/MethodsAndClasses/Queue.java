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
public class Queue {
    // a queue class for characters
    
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices
    
    // contsruct an empty queue given its size
    Queue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }
    
    //Construct a queue from a queue
    Queue (Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        
        //copy elements
        for(int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }
    
    //Construct a queue with initial values
    Queue(char a []) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];
        
        for (int i = 0; i < a.length; i++) put(a[i]);
    }
    
//put a character into the queue
    void put(char ch) {
        if (putloc==q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        
        q[putloc++] =ch;
    }
    
//get a character from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        
        return q[getloc++];
    }
}
