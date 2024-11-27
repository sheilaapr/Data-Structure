/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceSort;

/**
 *
 * @author Sheila
 */
class DataArray {

    private Mahasiswa[] mhs;
    private int nElemen;

    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }

    public void swap(int one, int two) {
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }

    public void mergeSortbyNim() {
        Mahasiswa[] workSpace = new Mahasiswa[nElemen];
        recMergeSort(workSpace, 0, nElemen - 1);
    }

    public void recMergeSort(Mahasiswa[] workSpace, int batasBawah, int batasAtas) {
        if (batasBawah == batasAtas) {
            return;
        } else {
            int mid = (batasBawah + batasAtas) / 2;
            recMergeSort(workSpace, batasBawah, mid);
            recMergeSort(workSpace, mid + 1, batasAtas);
            merge(workSpace, batasBawah, mid + 1, batasAtas);
        }
    }

    public void merge(Mahasiswa[] workSpace, int lowIndex, int highIndex, int batasAtas) {
        int j = 0;
        int batasBawah = lowIndex;
        int mid = highIndex - 1;
        int nItem = batasAtas - batasBawah + 1;

        while (lowIndex <= mid && highIndex <= batasAtas) {
            if (mhs[lowIndex].getNim() < mhs[highIndex].getNim()) {
                workSpace[j++] = mhs[lowIndex++];
            } else {
                workSpace[j++] = mhs[highIndex++];
            }
        }

        while (lowIndex <= mid) {
            workSpace[j++] = mhs[lowIndex++];
        }

        while (highIndex <= batasAtas) {
            workSpace[j++] = mhs[highIndex++];
        }

        for (j = 0; j < nItem; j++) {
            mhs[batasBawah + j] = workSpace[j];
        }
    }

    public void ShellSortbyName() {
        int in, out;
        Mahasiswa temp;
        int h = 1;

        while (h <= nElemen / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = mhs[out];
                in = out;

                while (in > h - 1 && mhs[in - h].getNama().compareToIgnoreCase(temp.getNama()) > 0) {
                    mhs[in] = mhs[in - h];
                    in -= h;
                }
                mhs[in] = temp;
            }
            h = (h - 1) / 3;
        }
    }
    
       public void QuickSortbyNim() {
        recQuickSort(0, nElemen - 1);
    }

    public void recQuickSort(int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) {
            return;
        } else {
            Mahasiswa pivot = mhs[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi - 1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }

    public int partitionIt(int batasKiri, int batasKanan, Mahasiswa pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;
        while (true) {
            while (indexKiri < batasKanan && mhs[++indexKiri].getNim() < pivot.getNim());
            while (indexKanan > 0 && mhs[--indexKanan].getNim() > pivot.getNim());
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
        }

        return indexKiri;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }
}

public class DataArrayApp {

    public static void main(String[] args) {
        int maxSize = 10;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(12345678, "Angga", "Madiun");
        arr.insert(12345677, "Sheila", "Semarang");
        arr.insert(12345676, "Anggie", "Malang");
        arr.insert(12345675, "Hashif", "Madura");
        arr.insert(12345674, "Ihsan", "Banyuwangi");
        arr.insert(12345673, "Dinda", "Bandung");
        arr.insert(12345672, "Raihan", "Ambon");
        arr.insert(12345671, "Jeniffer", "Malang");
        arr.insert(12345670, "Ahmad", "Sidoarjo");

        System.out.println("\t==== NIM GANJIL ====");
        System.out.println("\nData Mahasiswa Sebelum Diurutkan:");
        arr.display();

        System.out.println("\n1. Sorting Mahasiswa by NIM dengan MergeSort:");
        arr.mergeSortbyNim();
        arr.display();

        System.out.println("\n2. Sorting Mahasiswa by NAME dengan ShellSort: ");
        arr.ShellSortbyName();
        arr.display();

        System.out.println("\n3. Sorting Mahasiswa by NIM dengan QuickSort:");
        arr.QuickSortbyNim();
        arr.display();
    }
}
