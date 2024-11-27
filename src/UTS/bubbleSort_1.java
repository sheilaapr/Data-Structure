/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Sheila
 */
public class bubbleSort_1 {

    private String[] arr;
    private int nElemen;

    public bubbleSort_1(String[] arr) {
        this.arr = arr;
        this.nElemen = arr.length;
    }

    public void bubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i].compareTo(arr[i + 1]) < 0) {

                    swap(i, i + 1);
                    display();
                }
            }
        }
    }

    public void swap(int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] data = {"Sawi  |", "Tomat |", "Wortel|",
            "Kentang|", "Apel  |", "Cabai |", "Terong |",
            "Nugget |", "Mie instan|", "Sambal|"};

        bubbleSort_1 sorter = new bubbleSort_1(data);
        System.out.println("Sebelum sorting:");
        sorter.display();

        sorter.bubbleSort();
        System.out.println("");

        System.out.println("Setelah sorting:");
        sorter.display();
        System.out.println("");
    }
}
