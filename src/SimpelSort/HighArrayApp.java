/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpelSort;

import SimpelSort.HighArray;

/**
 *
 * @author Sheila
 */
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);
        
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
//        arr.insert(30);
//        arr.insert(00);
//        arr.insert(90);
//        arr.insert(40);
        
        System.out.print("Array sebelum diurutkan: ");
        arr.display();

        System.out.print("Array setelah diurutkan: ");
        arr.display();
    }
}