/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heaps;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class HeapApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Heap hp = new Heap(35);

        hp.insert(94);
        hp.insert(80);
        hp.insert(43);
        hp.insert(37);
        hp.insert(79);
        hp.insert(35);
        hp.insert(19);
        hp.insert(32);
        hp.insert(21);
        hp.insert(32);
        hp.insert(66);
        hp.insert(54);

        System.out.println("isi heap dengan 12 item: \nElemen: ");
        hp.displayHeap();

        System.out.print("tambah item baru: ");
        int addNew = input.nextInt();
        hp.tambah(addNew);
        hp.displayHeap();

        System.out.println("hapus root:");
        Node removedNode = hp.remove();
        System.out.println("elemen yang dihapus: " + removedNode.getKey());

        System.out.println("heap setelah penghapusan:");
        hp.displayHeap();

        System.out.println("=== Proses Merubah Key ===");
        int indexToChange = 7;
        int newValue = 52;
        System.out.println("heap sebelum perubahan key:");
        hp.displayHeap();

        System.out.println("ubah nilai pada indeks " + indexToChange + " menjadi " + newValue + ":");
        hp.ubah(indexToChange, newValue);

        System.out.println("heap setelah perubahan key:");
        hp.displayHeap();
    }
}
