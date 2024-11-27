/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;
import java.util.Scanner;
/**
 *
 * @author Sheila
 */

public class SortLinkedListApp {
    public static void main(String[] args) {
        SortLinkedList sll = new SortLinkedList();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan kata : ");
        String kata = scan.next();
        for(int i = 0; i < kata.length(); i++){
            sll.insert(kata.charAt(i));
        }
        System.out.print("Alfagram: ");
        while(!sll.isEmpty()){
            Link remove = sll.remove();
            remove.displayLink();
        }
        System.out.println("");
    }
}