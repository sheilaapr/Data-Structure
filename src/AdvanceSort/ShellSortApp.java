/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceSort;

/**
 *
 * @author Sheila
 */
class Sort {

    private int[] arr;
    private int nElemen;

    public Sort(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

//    public void ShellSort() {
//        int in, out;
//        int temp;
//        int h = nElemen / 2;
//
//        while (h > 0) {
//            for (out = h; out < nElemen; out++) {
//                temp = arr[out];
//                in = out;
//
//                while (in > h - 1 && arr[in - h] >= temp) {
//                    arr[in] = arr[in - h];
//                    in -= h;
//                }
//                arr[in] = temp;
//                display();
//            }
//            h /= 2;
//        }
//    }
//========================== JAWABAN NO.2 | H --> 3 * h + 1 =======================================
//    public void ShellSort(){
//        int in, out;
//        int temp;
//        int h = 1;
//        
//        while(h > 0){
//            for(out = h; out < nElemen; out++){
//                temp = arr[out];
//                in = out;
//                
//                while(in > h - 1 && arr[in - h] >= temp){
//                    arr[in] = arr[in - h];
//                    in -= h;
//                }
//                arr[in] = temp;
//                display();
//            }
//            h = 3 * h + 1;
//        }
//    }
//========================== JAWABAN NO.2 | H --> (h - 1) / 3 ==============================
    public void ShellSort() {
        int in, out;
        int temp;
        int h = 1;

        while (h <= nElemen / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = arr[out];
                in = out;

                while (in > h - 1 && arr[in - h] >= temp) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
                display();
            }
            h = (h - 1) / 3;
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}

public class ShellSortApp {

    public static void main(String[] args) {
        Sort sort = new Sort(8);
        sort.insert(75);
        sort.insert(55);
        sort.insert(85);
        sort.insert(25);
        sort.insert(30);
        sort.insert(12);
        sort.insert(88);
        sort.insert(44);

        System.out.println("=== Data sebelum diurutkan ===");
        sort.display();
        System.out.println("\n===== Proses  Pengurutan =====");
        sort.display();
        sort.ShellSort();
        System.out.println("\n=== Data setelah diurutkan ===");
        sort.display();

    }
}
