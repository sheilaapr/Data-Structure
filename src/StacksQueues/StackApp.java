/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StacksQueues;

/**
 *
 * @author Sheila
 */
public class StackApp {                                                                     //awal class StackApp

    public static void main(String[] args) {                                          //awal method main()
        Stack theStack = new Stack(10);                                               //deklarasi dan inisialisasi objek 
        System.out.println(">> push some items");                             //print String
        theStack.push(20);                                                                    //menambahkan nilai dengan method push
        theStack.push(40);                                                                    //menambahkan nilai dengan method push
        theStack.push(60);                                                                    //menambahkan nilai dengan method push
        theStack.push(80);                                                                    //menambahkan nilai dengan method push

        System.out.println("\n>> pop items in the stack");                 //print String
        while (!theStack.isEmpty()) {                                                      //looping hingga stack kosong
            long value = theStack.pop();                                                 //insialisasi menggunakan method pop
            System.out.print(value + " ");                                                //print value
        }                                                                                                //akhir looping
    }                                                                                                    //akhir method main()
}                                                                                                        //akhir class StackApp
