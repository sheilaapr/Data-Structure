

package SimpelSort;

/**
 *
 * @author Sheila
 */
public class InsertionSort {

    private int[] arr;
    private int nElemen;

    public InsertionSort(int[] arr) {
        this.arr = arr;
        this.nElemen = arr.length;
    }

    public void InsertionSort() {                                 //method InsertionSort()
        int i, curIn;                                                       //deklar var i, curIn

        for (curIn = 1; curIn < nElemen; curIn++) {    //awal looping
            int temp = arr[curIn];                                   //asignment var

            i = curIn;                                                      //asignment var
            while (i > 0 && arr[i - 1] >= temp) {             //awal looping
                arr[i] = arr[i - 1];                                       //asignment var
                i--;                                                            //decrement value
                display();                                                     //NO.8 --> menampilkan array setelah geser
            }                                                                     //akhir looping
            arr[i] = temp;                                                 //asignment value
            display();                                                        //NO.8 --> menampilkan array setelah penyisipan
        }                                                                          //akhir looping
    }                                                                              //akhir method
    

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {88, 92, 95, 81, 85, 86};
        InsertionSort sorter = new InsertionSort(data);
        
        System.out.println("Sebelum sorting:");
        sorter.display();

        sorter.InsertionSort();

        System.out.println("Setelah sorting:");
        sorter.display();
    }
}
