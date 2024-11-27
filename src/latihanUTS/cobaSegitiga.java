/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author Sheila
 */
public class cobaSegitiga {

//    public static void main(String[] args) {
//        System.out.println("Bilangan segitiga dari elemen ke-1 hingga ke-10:");
//        
//        for (int n = 1; n <= 10; n++) {
//            int triangularNumber = n * (n + 1) / 2;  // Formula for triangular number
//            System.out.println("Elemen ke-" + n + ": " + triangularNumber);
//        }

    public static void main(String[] args) {
        System.out.println("Bilangan segitiga dari elemen ke-1 hingga ke-10:");

        int triangularNumber = 0;

        for (int n = 1; n <= 10; n++) {
            triangularNumber += n;  // Add the current number to get the next triangular number
            System.out.println("Elemen ke-" + n + ": " + triangularNumber);
        }
    }
}

