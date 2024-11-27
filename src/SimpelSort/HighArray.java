package SimpelSort;

/**
 *
 * @author Sheila
 */
public class HighArray {

    private int[] arr;
    private int nElemen;

    public HighArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public boolean find(int key) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            return true;
        }
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                arr[j] = arr[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public void p() {
        System.out.println(nElemen);
    }

    public void bubbleSort() {                                           //method bubbleSort()
        int batas, i;                                                             //deklar var batas, i
        for (batas = nElemen - 1; batas > 0; batas--) {      //awal looping
            for (i = 0; i < batas; i++) {                                  //awal looping
                if (arr[i] > arr[i + 1]) {                                     //awal pengkondisian (ASCENDING)
                    //if (arr[i] < arr[i + 1]) {                                     //NO.4 --> awal pengkondisian (DESSCENDING)  
                    //display();                     //NO.2 --> method untuk menampilkan isi array
                    swap(i, i + 1);                                            //memanggil method & mengisi 2 argumen
                    //display();                     //NO.3 --> method untuk menampilkan isi array
                }                                                                     //akhir pengkondisian
            }                                                                         //akhir looping
        }                                                                             //akhir looping
    }                                                                                //akhir method

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
            //display();                                                          //NO.6 --> method untuk menampilkan isi array
        }                                                                           //akhir perulangan
    }                                                                               //akhir method

    public void InsertionSort() {                                 //method InsertionSort()
        int i, curIn;                                                       //deklar var i, curIn

        for (curIn = 1; curIn < nElemen; curIn++) {    //awal looping
            int temp = arr[curIn];                                   //asignment var

            i = curIn;                                                      //asignment var
            while (i > 0 && arr[i - 1] >= temp) {             //awal looping
                arr[i] = arr[i - 1];                                       //asignment var
                i--;                                                            //decrement value
                //display();                                                     //NO.8 --> menampilkan array setelah geser
            }                                                                     //akhir looping
            arr[i] = temp;                                                 //asignment value
            //display();                                                        //NO.8 --> menampilkan array setelah penyisipan
        }                                                                          //akhir looping
    }                                                                              //akhir method

    public void swap(int one, int two) {                           //method swap()
        int temp = arr[one];                                              //assigment value
        arr[one] = arr[two];                                               //assigment value
        arr[two] = temp;                                                    //assigment value
    }                                                                                 //akhir method

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    void BubbleSort() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
