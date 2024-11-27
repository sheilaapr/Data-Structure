/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import Array.OrderedArray;

/**
 *
 * @author Sheila
 */
public class OrderedArrayApp {

    public static void main(String[] args) {
        OrderedArray arr = new OrderedArray(10);
        
        arr.insert(30);
        arr.insert(10);
        arr.insert(20);
        arr.insert(40);
        
        arr.display(); 
    }
}