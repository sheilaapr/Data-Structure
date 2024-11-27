/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StacksQueues;

import java.util.Scanner;
class PembalikApp {
    public static void main(String[] args) {
        System.out.println("(A)");
        
        Pembalik pb = new Pembalik();
        ImplementasiStack s = new ImplementasiStack(10);
        String input = "Laptop";
        pb.ubah(input, s);
        String output = pb.result(s);
        
        System.out.println(">> KATA \n\t" + input);
        System.out.println(">> LIFO \n\t" + output);
        
        System.out.println("(B)");
        
        for (int i = 0; i < 5; i++) {
            Scanner masuk = new Scanner(System.in);
            Pembalik blk = new Pembalik();
            ImplementasiStack ss = new ImplementasiStack(10);
            
            System.out.print("Masukkan kata : ");
            String in = masuk.next();
            
            blk.ubah(in, ss);
            String out = blk.result(ss);
            
            System.out.println("LIFO : " + out);
            System.out.println(" ");
        }
    }  
}
