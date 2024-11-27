/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StacksQueues;

/**
 *
 * @author Sheila
 */
class ImplementasiQueue {

    private int maxSize; 
    private String[] arrayQ;
    private int front;
    private int rear; 
    private int nItems;
    
    public ImplementasiQueue(int size){
        this.maxSize = size;
        arrayQ = new String[maxSize];
        front = 0; 
        rear = -1; 
        nItems = 0;
    }
    
    public void insert(String nama){
        if(!isFull()){
            arrayQ[++rear] = nama;
            System.out.println(nama + " masuk antrian");
            nItems++;
        }else if(isFull()){
            System.out.println("Maaf "+nama+", antrian masih penuh");
        }
    }
    
    public String remove(){
        String temp = arrayQ[front];
        arrayQ[front] = "kosong";
        front++;
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }
    
    public String peekFront(){
        return arrayQ[front];
    }
    
    public boolean siEmpty(){
        return (nItems == 0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }
    
    public void display(){
        int temp = this.front;
        for(int i=0; i< maxSize; i++){
            System.out.print(arrayQ[front++]+",");
            if(front == maxSize){
                front = 0;
            }
        }
        System.out.println();
        front = temp;
    }
    
    public int size(){
        return nItems;
    }
}

