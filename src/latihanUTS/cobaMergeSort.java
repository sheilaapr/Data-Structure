/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author Sheila
 */
public class cobaMergeSort {

    // Fungsi untuk menggabungkan dua subarray yang sudah terurut
    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Buat array sementara */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data ke array sementara */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Gabungkan array sementara kembali ke arr[] */
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy elemen sisanya dari L[] atau R[] jika ada */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Fungsi rekursif untuk melakukan merge sort
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Temukan titik tengah
            int m = l + (r - l) / 2;

            // Panggil sort() untuk dua setengah subarray
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Gabungkan subarray yang sudah terurut
            merge(arr, l, m, r);
        }
    }

    // Fungsi untuk mencetak array
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
