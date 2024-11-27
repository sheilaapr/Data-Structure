/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heaps;

/**
 *
 * @author Sheila
 */
public class HeapSortApp {
    public static void main(String[] args) {
        int size = 10;
        Heap heap = new Heap(size);
        
        System.out.println("=== Data Random Array ===");
        for(int i = 0; i < size; i++){
            int value = (int) (Math.random()*100);
            Node newNode = new Node(value);
            heap.insert(i, newNode);
            heap.incrementSize();
        }
        
        System.out.println("sebelum diurutkan: ");
        heap.displayHeap();
        
        heap.heapSort();
        
        System.out.println("\nsetelah diurutkan: ");
        heap.displayArray();
    }
}