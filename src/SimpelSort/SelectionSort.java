package SimpelSort;

/**
 *
 * @author Sheila
 */
public class SelectionSort {

    private int[] arr;
    private int nElemen;

    public SelectionSort(int[] arr) {
        this.arr = arr;
        this.nElemen = arr.length;
    }

    public void SelectionSort() {                                   //method SelectionSort()
        int awal, i, min;                                                  //deklar var awal, i, min

        for (awal = 0; awal < nElemen - 1; awal++) {    //awal looping
            min = awal;                                                    //asignment var
            for (i = awal + 1; i < nElemen; i++) {             //awal looping
                if (arr[i] < arr[min]) {                                    //awal pengkondisian
                    min = i;                                                   //asignment var
                }                                                                   //akhkir pengkondisian
            }                                                                       //akhir looping
            swap(awal, min);                                              //manggil method & memberi argumen
            display();                                                          //NO.6 --> method untuk menampilkan isi array
        }                                                                           //akhir perulangan
    }                                                                               //akhir method

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void swap(int awal, int min) {
        int temp = arr[awal];  // simpan nilai sementara
        arr[awal] = arr[min];  // tukar elemen
        arr[min] = temp;  // tukar elemen
    }

    public static void main(String[] args) {
        int[] data = {85, 92, 89, 81, 95, 86};
        SelectionSort sorter = new SelectionSort(data);
        System.out.println("Sebelum sorting:");
        sorter.display();

        sorter.SelectionSort();

        System.out.println("Setelah sorting:");
        sorter.display();
   
    }
}
