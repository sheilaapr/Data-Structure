package latihanUTS;

/**
 *
 * @author Sheila
 */
public class BubbleSort {

    private String[] arr;
    private int nElemen;

    public BubbleSort(String[] arr) {
        this.arr = arr;
        this.nElemen = arr.length;
    }

    public void bubbleSort() {                                           //method bubbleSort()
        int batas, i;                                                             //deklar var batas, i
        for (batas = nElemen - 1; batas > 0; batas--) {      //awal looping
            for (i = 0; i < batas; i++) {                                  //awal looping
                // Only compare the first character of each string for descending order
                if (arr[i].charAt(0) < arr[i + 1].charAt(0)) {           //awal pengkondisian (DESCENDING by first character)
                    swap(i, i + 1);                                            //memanggil method & mengisi 2 argumen
                    display();                     //NO.3 --> method untuk menampilkan isi array
                }                                                                     //akhir pengkondisian
            }                                                                         //akhir looping
        }                                                                             //akhir looping
    }                                                                                //akhir method

    public void swap(int one, int two) {                           //method swap()
        String temp = arr[one];                                              //assignment value
        arr[one] = arr[two];                                               //assignment value
        arr[two] = temp;                                                    //assignment value
    }                                                                                 //akhir method

    public void display() {
        for (int i = 0; i < nElemen; i++) {                          //15 kali looping
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] data = {"Zebra", "Apple", "Lemon", "Banana", "Grape", "Cherry"};
        BubbleSort sorter = new BubbleSort(data);
        System.out.println("Sebelum sorting:");
        sorter.display();

        sorter.bubbleSort();

        System.out.println("Setelah sorting:");
        sorter.display();
    }
}
