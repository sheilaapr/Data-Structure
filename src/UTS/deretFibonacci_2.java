/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Sheila
 */
public class deretFibonacci_2 {

    public static int fibo(int fb) {
        if (fb <= 1) {
            return fb;
        } else {
            return fibo(fb - 1) + fibo(fb - 2);
        }
    }

    public static void jadiFibonacci(int fb) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static void main(String[] args) {
        int fb = 10;
        jadiFibonacci(fb);
    }
}
