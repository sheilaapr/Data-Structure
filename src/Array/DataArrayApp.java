/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650200, "Nanda", "Pasuruan");
        arr.insert(16650210, "Alifiyah", "Magetan");
        arr.insert(16650220, "Naufal", "Padang");
        arr.insert(16650230, "Muammal", "Bawean");
        arr.insert(16650240, "Sheila", "Nganjuk");
        arr.insert(16650250, "Faiq", "Ponorogo");
        arr.insert(16650260, "Alya", "Tulungagung");
        arr.insert(16650270, "Yasmin", "Lombok");
        arr.insert(16650280, "Reza", "Bojonegoro");
        arr.displayArray();
        
        long searchKey = 16650270;
        Mahasiswa mhs = arr.find(searchKey);
        if (mhs != null) {
            System.out.print("\nKetemu");
            mhs.displayMhs();
        } else {
            System.out.println("ga ketemu " + searchKey);
        }        
        searchKey=16650240;
        System.out.println("\nhapus nim: " + searchKey);
        arr.delete(searchKey);
        
        arr.displayArray();
    }
}