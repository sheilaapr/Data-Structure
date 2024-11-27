/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StacksQueues;                                                     //nama packages

/**
 *
 * @author Sheila
 */
class Stack {                                                                        //awal nama class Stack
    private int maxSize;                                                       //deklrasai variabel int
    private long[] stackArray;                                                //deklarasi array
    private int top;                                                                //deklarasi variabel  

    public Stack(int size) {                                                      //awal method Stack()
        maxSize = size;                                                           //inisialisasi value
        stackArray = new long[maxSize];                                 //deklarasi panjang arr
        top = -1;                                                                      //inisialisasi value
    }                                                                                        //akhir method Stack()

    public void push(long item) {                                             //awal method push()
        stackArray[++top] = item;                                             //add item ke arr
    }                                                                                          //akhir method push()

    public long pop() {                                                               //awal method pop()
        return stackArray[top--];                                                 //mengembalikan value dari arr
    }                                                                                           //akhir method pop()

    public long peek() {                                                              //awal method peek()
        return stackArray[top];                                                     //mengembalikan value dari arr
    }                                                                                            //akhir method peek()

    public boolean isEmpty() {                                                    //awal method isEmpty()
        return (top == -1);                                                          //mengembalikan value true or false dari top(kosong?)
    }                                                                                           //akhir method isEmpty()

    public boolean isFull() {                                                        //awal method isFull()
        return (top == maxSize - 1);                                           //mengembalikan value true or false dari top(penuh?)
    }                                                                                            //akhir method isFull()
}                                                                                                //akhir class Stack
