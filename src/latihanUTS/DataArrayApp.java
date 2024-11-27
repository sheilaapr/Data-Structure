/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author Sheila
 */
public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        
        System.out.println("Data Warga:");
        arr.insert("Ali", 4, "Kejapanan", 12);
        arr.insert("Ahmad", 2, "Kejapanan", 9);
        arr.insert("Abdurrohman", 3, "Kejapanan", 7);
        arr.insert("Burhan", 4, "Kejapanan", 6);
        arr.insert("Bachtiar", 5, "Kejapanan", 10);
        arr.insert("Sofyan", 1, "Kejapanan", 11);
        arr.displayArray();
        
        System.out.println("");
        System.out.println("Tambah Data");
        arr.insert("SOFYAN", 5, "Bandulan", 19);
        
        System.out.println("");
        System.out.println("Data Warga Setelah Diurutkan");
        arr.BubbleSort();
        arr.displayArray();
        
        int p = arr.doRecursion(0);
        System.out.println(p);
    }
}
