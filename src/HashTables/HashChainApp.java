/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTables;

/**
 *
 * @author Sheila
 */
public class HashChainApp {
    public static void main(String[] args) {
        int size = 15;
        HashChain hc = new HashChain(size);
        System.out.println(100 % 15);
        hc.insert(10);
        hc.insert(11);
        hc.insert(12);
        hc.insert(13);
        hc.insert(14);
        hc.insert(15);
        hc.insert(16);
        hc.insert(17);
        hc.insert(18);
        hc.insert(19);

//menambahkan 5 item baru dengan method delete
//        hc.delete(20);
//        hc.insert(21);
//        hc.delete(22);
//        hc.insert(23);
//        hc.delete(24);
        hc.displayTable();
        int key = 24;
        if (hc.find(key) != null) {
            System.out.println(key + " ketemu");
        } else {
            System.out.println(key + " ga ketemu");
        }
    }
}
