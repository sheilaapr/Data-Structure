/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;
//linier singly-linked list.

/**
 *
 * @author Sheila
 */
class Link {                                                   //awal class Link

    public int Data;                                         //deklarasi var Data
    public Link next;                                       //deklarasi var bertipe Link
    public Link previous;

    public Link(int Data) {                               //awal method constructor
        this.Data = Data;                                  //assignment
    }                                                                //akhir method constructor

    public void displayLink() {                         //awal method display
        System.out.print(Data + " ");                 //print nilai
    }                                                                //akhir method display
}                                                                    //akhir class Link

class LinkedList {                                          //awal class LinkedList

    private Link first;                                      //deklarasi var bertipe Link

    public LinkedList() {                                  //awal method constructor
        first = null;                                           //asignment
    }                                                                //akhir method constructor

    public boolean isEmpty() {                         //awal method isEmpty()
        return (first == null);                            //mengembalikan value true/false
    }                                                                 //akhir method isEmpty()

    public void insertFirst(int Data) {               //awal method insertFirst
        Link newLink = new Link(Data);            //deklarasi variabel object
        newLink.next = first;                             //assignment
        first = newLink;                                     //assignment
    }                                                                 //akhir method insertFirst
    
    
//======================== No. 5 | InsertLast ================================================================ 
    
    public void insertLast(int data) {                     //awal method insertLast
        Link newNode =new Link(data);                 //membuat node baru
        if (first == null) {                                        //pengkondisian jika node kosong
            first = newNode;                                    //node baru akan menjadi head
        }else {                                                         //pengkondisian kedua
            Link current = first;                               //node awal
            while (current.next != null) {                  //looping mencari node terakhir
                current = current.next;                      //current masuk ke current selnajutnya
            }                                                               //akhir
            current.next =newNode;                        //menambhakan node baru pada akhir list
        }                                                                   //akhir pengkondisian
    }                                                                       //akhir method
//=============================================================================================================
    
    public Link deleteFirst() {                           //awal method Link deleteFirst
        Link temp = first;                                  //assignment
        first = first.next;                                   //assignment
        return temp;                                         //mengembalikan value temp
    }                                                                //akhir method Link deleteFirst
    
//============================= No. 6 | DeleteLast ============================================================    

    public Link deleteLast() {                    //awal method deleteLast()
        if (first == null) {                            //jika node awal kosong, awal pengkondisian
            return null;                                 //akan dikembalikan ke null
        }                                                      //akhir pengkondisian
        if (first.next == null) {                    //jika ada satu node 
            Link temp = first;                       //dimpan node tersebut
            first = null;                                 //hapus node, hingga node first bernilai null
            return temp;                               //mengembalikan node yang dihapus
        }                                                      //akhir pengkondisian
        
        Link current = first;                        //start dari first
        Link previous =null;                        //sebelum node awal adalah null
        while (current. next != null) {          //pengkondisian, mencari node akhir  
            previous = current;                     //menyimpan node sebelum node terakhir
            current = current.next;               //memindahkan ke node berikutnya
        }                                                       //akhir pengkondisian
        previous.next = null;                       //menghapus node terakhir
        return current;                                 //mengembmalikan node yang dihapus
    }                                                            //akhir method deleteLast()
//=============================================================================================================    
    public Link find(int key) {                          //awal method find()
        Link current = first;                              //assignment
        while (current.Data != key) {                 //perulangan 
            if (current.next == null) {                 //pengkondisian
                return null;                                   //mengembalikan  value null
            } else {                                              //pengkondisian kedua
                current = current.next;                //assignment current
            }                                                        //akhir pengkondisian
        }                                                            //akhir perulangan
        return current;                                     //mengembalikan value current
    }                                                                //akhir method Link find

    public Link delete(int key) {                     //awal method Link delete
        Link current = first;                             //assignment current
        Link previous = first;                           //assignment previous
        while (current.Data != key) {               //perulangan
            if (current.next == null) {                //pengkondisian
                return null;                                  //mengembalikan value null
            } else {                                             //pengkondisian kedua
                previous = current;                     //assignment
                current = current.next;               //asignment
            }                                                       //akhir pengkondisian
        }                                                           //akhir perulangan
        if (current == first) {                            //pengkondisian
            first = first.next;                              //assignment
        } else {                                                  //pengkondisian kedua
            previous.next = current.next;          //inisialisasi
        }                                                            //akhir pengkondisian
        return current;                                     //mengembalikan value current
    }                                                                //akhir method Link delete

    public void displayList() {                                 //awal method displayList
        System.out.println("List(first-->last):");       //print value
        Link current = first;                                     //inisialisasi
        while (current != null) {                               //perulangan
            current.displayLink();                               //memanggil method displayLink()
            current = current.next;                            //inisialisasi
        }                                                                    //akhir perulangan
        System.out.println("");                                   //print value
    }                                                                        //akhir method displayList()
}                                                                            //akhir class LinkedListX
