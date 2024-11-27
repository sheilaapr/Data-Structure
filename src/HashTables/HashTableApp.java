/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTables;

/**
 *
 * @author Sheila
 */
public class HashTableApp {
    public static void main(String[] args) {
        int size = 15;
        HashTable ht = new HashTable(size);
        System.out.println(100 % 15);
        ht.insert(10);
        ht.insert(11);
        ht.insert(12);
        ht.insert(13);
        ht.insert(14);
        ht.insert(15);
        ht.insert(16);
        ht.insert(17);
        ht.insert(18);
        ht.insert(19);

//menambahkan 5 item baru dengan method delete
        ht.delete(20);
        ht.insert(21);
        ht.delete(22);
        ht.insert(23);
        ht.delete(24);

        ht.displayTable();
        int key = 24;
        if (ht.find(key) != null) {
            System.out.println(key + " ketemu");
        } else {
            System.out.println(key + " ga ketemu");
        }
    }
}
