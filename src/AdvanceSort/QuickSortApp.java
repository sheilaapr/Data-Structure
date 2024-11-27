/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceSort;

/**
 *
 * @author Sheila
 */
class QuickSort {

    private int[] arr;
    private int nElemen;

    public QuickSort(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void QuickSort() {
        recQuickSort(0, nElemen - 1);
    }

    public int partitionIt(int batasKiri, int batasKanan, int pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan;

        while (true) {
            while (indexKiri < batasKanan && arr[++indexKiri] < pivot) ;
            while (indexKanan > batasKiri && arr[--indexKanan] > pivot) ;

            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
                display();
            }
        }
        return indexKiri;
    }

    private void swap(int dex1, int dex2) {
        int temp = arr[dex1];
        arr[dex1] = arr[dex2];
        arr[dex2] = temp;
    }

    public void recQuickSort(int batasKiri, int batasKanan){
        if (batasKanan - batasKiri <= 0){
            return;
            }else{
            int pivot = arr[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi-1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }
    public void display() {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public class QuickSortApp {

    public static void main(String[] args) {
        QuickSort quick = new QuickSort(8);
        quick.insert(75);
        quick.insert(55);
        quick.insert(85);
        quick.insert(25);
        quick.insert(30);
        quick.insert(12);
        quick.insert(88);
        quick.insert(44);
        System.out.println("=== Data sebelum diurutkan ===");
        quick.display();

        System.out.println("\n===== Proses pengurutan =====");
        quick.display();
        quick.QuickSort();
        System.out.println("\n=== Data setelah diurutkan ===");
        quick.display();
    }
}
