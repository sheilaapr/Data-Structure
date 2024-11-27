/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Sheila
 */
public class LinkedListApp {                                               //awal class LinkedListApp

    public static void main(String[] args) {                            //method main
        LinkedList theList = new LinkedList();                        //variabel object

        theList.insertFirst(22);                                                 //insertFirst value
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.displayList();                                                      //memanggil method displayList()

        while (!theList.isEmpty()) {                                             //perulangan
            Link aLink = theList.deleteFirst();                             //inisialisasi var object dg value dari deleteFirst
            System.out.print("Deleted ");                                     //print value
            aLink.displayLink();                                                    //memanggil method displayLink
            System.out.println("");                                                //print value
        }                                                                                      //akhir perulangan
        theList.displayList();                                                       //memanggil method displayList

        theList.insertFirst(33);                                                    //insertFirst nilai
        theList.insertFirst(55);
        theList.insertFirst(77);
        theList.insertFirst(88);
        
//=========================== Memamnggil method insertLast ==========================
        theList.insertLast(76);                                                   //insertLAst nilai
        theList.insertLast(99);                                                   //insertLast nilai
        theList.insertFirst(1);                                                     //insertFirst nilai
//=======================================================================================        
        
        theList.displayList();                                                     //memanggil method displayList

        Link f = theList.find(77);                                              //mencari value 77 pada data
        if (f != null) {                                                                //pengkondisian
            System.out.println("ketemu..." + f.Data);                 //mencetak value
        } else {                                                                         //pengkondisian kedua
            System.out.println("link tidak ditemukan");             //mencetak value
        }                                                                                   //akhir pengkondisian

        Link d = theList.delete(88);                                         //menghapus value 88 dari data
        if (d != null) {                                                               //pengkondisian
            System.out.println("hapus link dengan key " + d.Data);  //mencetak value
        } else {                                                                         //pengkondisian kedua
            System.out.println("link tidak ditemukan");             //mencetak value
        }                                                                                //akhir pengkondisian
 
//======================== Memanggil method deleteLast() ==============================        
        System.out.println("\nhapus node terakhir dengan method deleteLast()");    //print keterangan
        theList.deleteLast();                                                                                         //memanggil method deleteLast()
        
        theList.displayList();                                                     //memanggil method displayList()
    }                                                                                       //akhir method main
}                                                                                           //akhir class LinkedListApp
