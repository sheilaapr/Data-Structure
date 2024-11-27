package SimpelSort;

/**
 *
 * @author Sheila
 */
public class BubbleSort {

    private int[] arr;
    private int nElemen;

    public BubbleSort(int[] arr) {
        this.arr = arr;
        this.nElemen = arr.length;
    }

    public void bubbleSort() {                                           //method bubbleSort()
        int batas, i;                                                             //deklar var batas, i
        for (batas = nElemen - 1; batas > 0; batas--) {      //awal looping
            for (i = 0; i < batas; i++) {                                  //awal looping
               //display();                        //NO.2 --> method untuk menampilkan isi array
                if (arr[i] > arr[i + 1]) {                                     //awal pengkondisian (ASCENDING)
                  
                    //if (arr[i] < arr[i + 1]) {     //NO.4 --> awal pengkondisian (DESSCENDING)  
                   
                    swap(i, i + 1);                                            //memanggil method & mengisi 2 argumen
                    display();                     //NO.3 --> method untuk menampilkan isi array
                }                                                                     //akhir pengkondisian
            }                                                                         //akhir looping
        }                                                                             //akhir looping
    }                                                                                //akhir method

    public void swap(int one, int two) {                           //method swap()
        int temp = arr[one];                                              //assigment value
        arr[one] = arr[two];                                               //assigment value
        arr[two] = temp;                                                    //assigment value
    }                                                                                 //akhir method

    public void display() {
        for (int i = 0; i < nElemen; i++) {                          //15 kali looping
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {88, 92, 95, 81, 85, 86};
        BubbleSort sorter = new BubbleSort(data);
        System.out.println("Sebelum sorting:");
        sorter.display();

        sorter.bubbleSort();

        System.out.println("Setelah sorting:");
        sorter.display();
    }
}
