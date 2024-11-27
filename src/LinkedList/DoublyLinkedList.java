/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Sheila
 */
class Link{                                                             //awal class Link
    public int Data;                                                 //deklarasi variabel int
    public Link next;                                               //deklarasi variabel Object
    public Link previous;                                         //deklarasi variabel object
    
    public Link(int Data){                                        //method constructor
        this.Data = Data;                                          //inisialisasi value
    }                                                                        //akhir method
    
    public void displayLink(){                                  //method displayLink
        System.out.print(Data+" ");                           //print value data
    }                                                                        //akhir method
}                                                                            //akhir class Link

class DoublyLinkedList{                                       //awal class DoublyLinkedList
    private Link first;                                             //deklarasi var object
    private Link last;                                              //deklarasi var object
    
    public DoublyLinkedList(){                                //method constructor
        first = null;                                                   //inisialisasi value
        last = null;                                                    //inisialisasi value
    }                                                                        //akhir method
    
    public boolean isEmpty(){                                  //awal method isEmpty()
        return first == null;                                     //mengembalikan value true/false
    }                                                                        //akhir method
    
    public void insertFirst(int Data){                        //awal method insertFirst()
        Link newlink = new Link(Data);                     //var object
        if(isEmpty()){                                                   //pengkondisian jika kosong
            last = newlink;                                           //iniisalisasi value akhir = baru
        }else{                                                              //pengkondisian 2
            first.previous = newlink;                            //inisialisasi sebelum value akhir = new
        }                                                                      //akhir pengkondisian
        newlink.next = first;                                       //inisialisasi value setelah node baru
        first = newlink;                                               //inisialisasi value node pertama = node baru
    }                                                                           //akhir method
    
    public void insertLast(int Data){                           //awal method insertLast()
        Link newlink = new Link(Data);                       //var object
        if(isEmpty()){                                                    //pengkondisian jika kosong
            first = newlink;                                           //inisialisasi value
        }else{                                                               //pengkondisian 2
            last.next = newlink;                                   //inisialisasi value
            newlink.previous = last;                             //inisialisasi value
        }                                                                      //akhir pengkondisian
        last = newlink;                                                //inisialisasi value
    }                                                                           //akhir method
    
    public Link deleteFirst(){                                     //method deleteFirst()
        Link temp = first;                                           //inisialisasi value
        if(first.next==null){                                        //pengkondisian
            last = null;                                                 //inisialisasi valule
        }else{                                                              //pengkondisian 2
            first.next.previous = null;                          //inisialisasi value
        }                                                                       //akhir pengkondisian
        first = first.next;                                             //inisialisasi value
        return temp;                                                   //mengembalikan value dari temp
    }                                                                          //akhie method
    
    public Link deleteLast() {                                                  //awal method deleteLast()
        Link temp = last;                                                          //inisialisasi value
        if (first.next == null) {                                                  //pengkondisian
            first = null;                                                               //inisialisasi
        } else {                                                                          //pengkondisian 2
            last.previous.next = null;                                        //inisialisasi
        }                                                                                    //akhir pengkondisian
        last = last.previous;                                                     //inisialisasi
        return temp;                                                                //mengembalikan value temp
    }                                                                                       //akhir method
    
    public boolean insertAfter(int key, int Data) {                 //method insertAfter()
        Link current = first;                                                    //inisialisasi
        while (current.Data != key) {                                       //perulangan
            current = current.next;                                           //inisialisasi
            if (current == null) {                                                //pengkondisian
                return false;                                                        //mengembalikan value false
            }                                                                               //akhir pengkondisian
        }                                                                                   //akhir perulangan
        Link newLink = new Link(Data);                                  //var object
        if (current == last) {                                                    //pengkondisian
            newLink.next = null;                                               //inisialisasi value null
            last = newLink;                                                       //inisialisasi value object
        } else {                                                                         //pengkondisian 2
            newLink.next = current.next;                                //inisialisasi value
            current.next.previous = newLink;                          //inisialisasi value
        }                                                                                  //akhir pengkondisian
        newLink.previous = current;                                      //inisialisasi value
        current.next = newLink;                                            //inisialisasi value
        return true;                                                                //mengembalikan value true
    }                                                                                     //akhir method
    
    public Link deleteKey(int key) {                                     //awal method deleteKey()
        Link current = first;                                                   //inisialisasi value
        while (current.Data != key) {                                      //perulangan
            current = current.next;                                         //inisialisasi 
            if (current == null) {                                              //pengkondisian
                return null;                                                        //mengembalikan null
            }                                                                             //akhir pengkondisian
        }                                                                                 //akhir perulangan
        if (current == first) {                                                  //pengkondisian
            first = current.next;                                               //inisialisasi
        } else {                                                                        //pengkondisian 2
            current.previous.next =  current.next;                  //inisialisasi                                     
        }                                                                                  //akhir pengkondisian
        if (current == last) {                                                   //pengkondisian
            last = current.previous;                                         //inisialisasi
        } else {                                                                        //pengkondisian
            current.next.previous =  current.previous;           //insisialisasi
        }                                                                                 //akhir pengkondisian
        return current;                                                           //mengembalikan value current
    }                                                                                     //akhir method
    
    public void displayForward() {                                         //method displayForward()
        System.out.print("List " + "(first-->last): ");                //print keterangan
        Link current = first;                                                   //inisialisasi node pertama
        while (current != null) {                                             //perulangan node
            current.displayLink();                                             //menampilkan data dari node
            current = current.next;                                         //pindah ke node selanjutnya
        }                                                                                 //akhir perulangan
        System.out.println("");                                               //print baris baru
    }                                                                                    //akhir method
    
    public void displayBackward() {                                      //method displayBackward()
        System.out.print("List "+ "(last-->first): ");                //print keterangan
        Link current = last;                                                    //inisialisasi node terakhir
        while (current != null) {                                             //perulangan node
            current.displayLink();                                             //menampilkan data dari node
            current = current.previous;                                  //pindah ke node selnajutnya
        }                                                                                 //akhir perulangan
        System.out.println("");                                               //print baris baru
    }                                                                                    //akhir method
}                                                                                        //akhir class 