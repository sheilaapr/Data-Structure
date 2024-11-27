/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Sheila
 */
public class TriangleApp {

    public static void main(String[] args) {
        triangleRecursion tr = new triangleRecursion();

//        System.out.println("Menampilkan hasil rekursi: ");
//        int n = tr.recursion(5);
//        
//        System.out.println("\nMenampilkan hasil iterasi: ");
//        int t = tr.iteration(5);
 
//================== No. 5 ================================
        System.out.println("\nMenampilkan faktorial: ");
        int f = tr.factorialRec(5);
        int fi = tr.factorialIt(5);
        System.out.println("");
        System.out.println("Nilai Faktorial Recursion= " + f);
        System.out.println("Nilai Faktorial Iteration= " + fi);
    }
}
