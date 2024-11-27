package SimpelSort;

import SimpelSort.DataArray;

public class DataArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650210, "Ahmad", "Sidoarjo");

        System.out.println("Data Mahasiswa Sebelum Diurutkan:");
        arr.displayArray();

        System.out.println("\n1. Sorting Mahasiswa by NIM:");
        arr.BubbleSort();
        arr.InsertionSort();

        arr.displayArray();

        System.out.println("\n2. Sorting Mahasiswa by NAME: ");
        arr.SelectionSortByName();

        arr.displayArray();
    }
}
