/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StacksQueues;

/**
 *
 * @author Sheila
 */
public class ImplementasiQueueApp {
    public static void main(String[] args) {
        ImplementasiQueue qq = new ImplementasiQueue(4);
        System.out.println(">> beberapa mulai mengantri");
        qq.insert("Sheila");
        qq.insert("Ahmad");
        qq.insert("Putri");
        qq.insert("Alya");
        qq.insert("Salwa");
        qq.insert("Brian");
        
        System.out.println("\n>> isi antrian");
        qq.display();
        
        System.out.println("\n>> satu persatu keluar antrian");
        System.out.println(qq.remove()+" keluar antrian");
        qq.display();
        System.out.println("\n"+qq.remove()+" keluar antrian");
        qq.display();
        System.out.println("\n"+qq.remove()+" keluar antrian");
        qq.display();
        System.out.println("\n"+qq.remove()+" keluar antrian");
        qq.display();
        System.out.println("\nantrian kosong\n"+qq.size()+" person");
        qq.display();
    }
    
}
