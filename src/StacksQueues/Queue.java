/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StacksQueues;                                               //nama packages

/**
 *
 * @author Sheila
 */
class Queue {                                                               //awal nama class Queue

    private int maxSize;                                                //deklarasi variabel
    private long[] queArray;                                           //deklarasi arr
    private int front;                                                      //deklarasi variabel int
    private int rear;                                                       //deklarasi variabel int
    private int nItems;                                                   //deklarasi variabel int

    public Queue(int size) {                                            //awal method Queue()
        this.maxSize = size;                                             //inisialisasi value
        queArray = new long[maxSize];                           //deklarasi panjang arr
        front = 0;                                                              //inisialisasi value front (depan)
        rear = -1;                                                             //inisialisasi value rear (belakang)
        nItems = 0;                                                           //inisialisasi value nItems
    }                                                                                 //akhir method Queue()

    public void insert(long value) {                                   //awal method insert()     
        if (rear == maxSize - 1) {                                       //pengondisian
            rear = -1;                                                           //inisialisasi
        }                                                                              //akhir pengondisian
        queArray[++rear] = value;                                     //inisialisasi value kedalam arr
        nItems++;                                                              //increment value nItems
    }                                                                                  //akhir method insert()

    public long remove() {                                                //awal method remove()  
        long temp = queArray[front++];                           //assignment arr ke dalam temp        
        if (front == maxSize) {                                          //pengondisian 
            front = 0;                                                          //inisialisasi value front
        }                                                                             //akhir pengondisian     
        nItems--;                                                               //decrement value nItems
        return temp;                                                          //mengembalikan nilai temp

    }                                                                                 //akhir method remove()

    public long peekFront() {                                           //awal method peekFront()
        return queArray[front];                                          //mengembalikan value arr front(depan)
    }                                                                                 //akhir method peekFront()

    public boolean isEmpty() {                                          //awal method isEmpty()
        return (nItems == 0);                                             //mengembalikan value true or false dari top(kosong?)
    }                                                                                  //akhir method isEmpty()

    public boolean isFull() {                                              //awal method isFull()
        return (nItems == maxSize);                                  //mengembalikan value true or false dari top(penuh?)
    }                                                                                  //akhir method isFull()

    public int size() {                                                         //awal method size()
        return nItems;                                                        //mengembalikan value nItems
    }                                                                                  //akhir method size()
}                                                                                      //akhir class Queue
