/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Sheila
 */
public class MergeSortApp {

    public static void main(String[] args) {
        Arrays arr = new Arrays(10); //10 data random
        arr.insert(78);
        arr.insert(46);
        arr.insert(99);
        arr.insert(25);
        arr.insert(98);
        arr.insert(19);
        arr.insert(45);
        arr.insert(86);
        arr.insert(77);
        arr.insert(44);

        System.out.println("Data sebelum diurutkan: ");
        arr.display();
        
        System.out.println("\n============MergeSort Process===============");

        System.out.println("\nData setelah diurutkan: ");
        arr.mergeSort();
        arr.display();
    }
}
