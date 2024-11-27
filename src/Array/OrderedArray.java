/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
public class OrderedArray {
    private int[] arr;
    private int nElemen;

    public OrderedArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }
    public void insert(int value) {
        int i;
        
        for (i = 0; i < nElemen; i++) {
            if (arr[i] > value) {
                break;
            }
        }
        for (int j = nElemen; j > i; j--) {
            arr[j] = arr[j - 1];
        }

        arr[i] = value;
        nElemen++;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
