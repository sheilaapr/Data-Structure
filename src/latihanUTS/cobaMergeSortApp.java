/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author Sheila
 */
public class cobaMergeSortApp {
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Array sebelum diurutkan:");
        cobaMergeSort.printArray(arr);

        cobaMergeSort.sort(arr, 0, arr.length - 1);

        System.out.println("Array setelah diurutkan:");
        cobaMergeSort.printArray(arr);
        }
    }
